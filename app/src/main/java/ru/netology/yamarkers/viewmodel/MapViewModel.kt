package ru.netology.yamarkers.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import ru.netology.yamarkers.db.PlaceDatabase
import ru.netology.yamarkers.dto.Place
import ru.netology.yamarkers.entity.PlaceEntity

class MapViewModel(context: Application) : AndroidViewModel(context) {

    private val dao = PlaceDatabase.getInstance(context).placeDao
    val places = dao.getAll().map {
        it.map(PlaceEntity::toDto)
    }

    fun insertPlace(place: Place) {
        viewModelScope.launch {
            dao.insert(PlaceEntity.fromDto(place))
        }
    }

    fun deletePlaceById(id: Long) {
        viewModelScope.launch {
            dao.deleteById(id)
        }
    }
}
