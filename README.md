# Решение домашнего задания к занятию «3.1. Карты и геопозиционирование: Yandex Maps & Google Maps»

# Описание домашнего задания
В качестве результата пришлите ссылки на ваш GitHub-проект в личном кабинете студента на сайте [netology.ru](https://netology.ru).

**Важно**: ознакомьтесь со ссылками на главной странице [репозитория с домашними заданиями](https://github.com/netology-code/andad-homeworks/blob/master/README.md).

**Важно**: если у вас что-то не получилось, оформите Issue [по установленным правилам](https://github.com/netology-code/andad-homeworks/blob/master/report-requirements.md).

## Как сдавать задачи

1. Создайте новый проект Android-приложения, можете брать код из лекции.
2. Сделайте необходимые коммиты.
3. Сделайте push. Убедитесь, что ваш код появился на GitHub.
4. Ссылку на ваш проект отправьте в личном кабинете на сайте [netology.ru](https://netology.ru).
5. Задачи, отмеченные как необязательные, можно не сдавать. Это не повлияет на получение зачёта.

## Мини-проект. Markers

### Описание

Вы можете использовать любые карты: Google Maps или Яндекс Карты. Задача со слов заказчика звучит следующим образом:
```
Приложение предназначено для путешествующих по России.

Нужно сделать так, чтобы пользователь мог кликать на карте, а на месте клика создавать маркер с описанием (например, «Нулевая верста» и т. д.).

Все точки должны храниться на устройстве, чтобы потом человек мог приехать в город и быстро по карте соориентироваться, какие достопримечательности он хотел посмотреть. 

Приложение должно поддерживать:
1. Создание точки.
2. Редактирование точки.
3. Удаление точки.
4. Просмотр всех точек на отдельном экране: пользователь кликает в существующую точку и переходит к ней на карте.
```

**Важно**: вы сами решаете, каким образом организовать архитектуру, какие библиотеки использовать и т. д. Вряд ли в этом проекте нужен FCM, OkHttp и Retrofit.  

В пояснительном тексте к ДЗ напишите, почему вы решили включить именно такие зависимости. Объясните свой выбор.

В проекте не должно быть неиспользуемых зависимостей. Если вы не используете Retrofit, то и в dependency его быть не должно.

Вы сами решаете, насколько функциональным сделать ваше приложение. Минимальная функциональность: пункты 1–4 из описания заказчика.



### Результат

В качестве результата пришлите в личном кабинете:
1. Ссылку на ваш проект.
2. Объяснение выбора используемых библиотек.

### Ссылки

https://github.com/Onotole1/YaMaps
https://yandex.ru/dev/maps/jsapi/doc/2.1/quick-start/index.html
https://yandex.ru/dev/maps/mapkit/doc/android-quickstart/concepts/android/quickstart.html
https://developer.tech.yandex.ru/
https://github.com/yandex/mapkit-android-demo