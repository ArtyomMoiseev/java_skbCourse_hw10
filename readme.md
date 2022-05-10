# java_skbCourse_hw10
## Spring security
#### Доступные адреса:
/login - авторизация
#### Доступные методы:
/public/api - доступен для любого пользователя + анонимно
/admin/api - доступен для пользователей с ролью ```ADMIN```
/support/api - доступен для пользователей с ролью ```SUPPORT```
#### Стандартные пользователи:
```admin:admin   support:support```
## Демонстрация работы

![](md_images/public.png)
##### При авторизации под admin
![](md_images/admin.png)
##### При авторизации под support
![](md_images/support.png)