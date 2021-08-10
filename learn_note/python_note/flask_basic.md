直接pip安装`pip install flask`

更多详情可以参照[flask中文文档](https://dormousehole.readthedocs.io/en/latest/)

这里主要介绍的使用flask编写json数据返回接口

```python
from flask import Flask, json,request,jsonify, session, redirect

app = Flask(__name__)
app.secret_key = "sasdasdasdas"   # 使用session需要设置session key

@app.route("/", methods=["GET"])
def hello():
    return "hello"

@app.route("/hey/<username>")  # 使用url参数
def hey(username):
    return "hey %s" % username

# int 正float
@app.route("/get/<int:number>") # 设置url参数类型
def get(number):
    return "my %s" % (number+number)

@app.route("/index") # 重定向操作
def index():
    return redirect("https://www.baidu.com")

@app.route("/test/json", methods = ["POST"])  # POST请求示例
def test_json():
    myjson = request.get_json()
    print(myjson.get("name"))
    # return myjson

    # 打包数据为json
    my_name = myjson.get('name')
    my_age = myjson.get('age')
    my_age += 10
    return jsonify(name=my_name, age2 = my_age) # flask 打包json数据

app.run()
# app.run(host="106.55.173.219")

```