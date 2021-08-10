# 安装nginx 

Ubuntu 20.04

`sudo apt install nginx`

`vim /etc/nginx/sites-enabled/default`  修改默认监听端口，默认为80

修改以上文件的以下内容
```text
listen 8888  default_server;    -- 修改监听端口
listen [::]:8888 default_server;  -- 修改监听端口
```

修改nginx默认的root路径

查找到网上的一些教程是修改这个路径，`vi /etc/nginx/nginx.conf`

不确定是不是ngnix版本更新的原因，我这个（nginx version: nginx/1.18.0 (Ubuntu)）是在上面那个文件下进行修改的。
`vim /etc/nginx/sites-enabled/default` 

```shell
server {
        listen 8888 default_server;
        listen [::]:8888 default_server;

        root /notebooks/html_pagel;

        index picture.html index.htm index.nginx-debian.html;
        server_name image_process_html;
        location / {
                try_files $uri $uri/ =404;
        }
        ...
}
```

重启nginx

```shell
pkill -9 nginx #杀掉名称为nginx的进程
nginx
```
或者
```shell
service nginx restart
```

