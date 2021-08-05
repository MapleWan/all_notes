1. 安装 `pip install django`
2. 创建项目 `django-admin startproject 项目名`
3. 在项目目录下新建`views.py`文件
```python
from django.shortcuts import render

def hello(request):
    return HttpResponse("Hello world ! ")

def runoob(request):
    context          = {}
    context['hello'] = 'Hello World!'
    return render(request, 'runoob.html', context)
```
4. urls.py文件修改
```python
from django.conf.urls import url
 
from . import views
 
urlpatterns = [
    path('admin/', admin.site.urls),
    path('hello', views.hello),
    re_path(r'^$', views.hello),
    path('runoob/', views.runoob),
]
```
5. 项目目录下新建Template文件夹，并创建一个html文件
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>{{ hello }}</h1>
</body>
</html>
```
6. 在settings中配置Template文件夹路径
```python
TEMPLATES = [
    {
        'BACKEND': 'django.template.backends.django.DjangoTemplates',
        'DIRS': [os.path.join(BASE_DIR, 'Template')],
        'APP_DIRS': True,
        'OPTIONS': {
            'context_processors': [
                'django.template.context_processors.debug',
                'django.template.context_processors.request',
                'django.contrib.auth.context_processors.auth',
                'django.contrib.messages.context_processors.messages',
            ],
        },
    },
]
```
7. 运行`python manage.py runserver 0.0.0.0:8888`

<hr>

[django更多详情查看](https://www.runoob.com/django/django-tutorial.html)