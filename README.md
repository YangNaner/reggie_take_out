项目分析：

该项目是一个外卖点餐系统，基于 Spring Boot + MyBatis 实现，使用了 Vue.js 和 Element UI 前端框架。它包括用户端和商家端两个模块，用户可以在用户端浏览商家菜单，选择商品下单，而商家可以在商家端管理订单、菜单等。

主要功能：

用户端
注册、登录
查看商家列表、菜单
购物车管理、订单管理
商家端
注册、登录
菜品管理、订单管理、配送管理
技术栈：

后端
Spring Boot：构建后端基础框架
MyBatis：ORM 框架，实现与数据库的交互
MySQL：数据库
Swagger：API 文档生成工具
前端
Vue.js：构建前端单页面应用
Element UI：基于 Vue.js 的前端 UI 框架
Axios：前端与后端的交互工具
使用说明：

安装 JDK 和 Node.js 环境。
克隆代码到本地。
创建数据库，执行项目根目录下的 sql 目录下的 reggie.sql 文件，初始化数据库。
进入 reggie_take_out_server 目录，使用 Maven 编译后端代码。
进入 reggie_take_out_vue 目录，使用 npm install 安装前端依赖。
在 reggie_take_out_vue 目录下执行 npm run serve 启动前端项目。
在 reggie_take_out_server 目录下执行 java -jar target/reggie_take_out-0.0.1-SNAPSHOT.jar 启动后端项目。
备注：

该项目是一个练手项目，仅供学习参考使用，不适合商业用途。
该项目存在一些安全漏洞和优化空间，仅作为学习和探究使用。
