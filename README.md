<h1>第一次上传代码至GitHub，请谅解</h1>

这个<span>dbconfig.properties</span>配置文件，需要自己设置数据库（用户名/密码），数据库驱动可能需要改动，我用的是mysql_8.0驱动，除了数据库配置改一下，就可用直接运行了，
# ssm-CRUD
Rest风格
我认为可用取代 毕设<学生信息管理>
· 有完整的CRUD
· 但有些还是有细节问题，
· 比如，checked框，全选之后，点击下一列，还会默认是true，
# SSM-CRUD

功能点

- 1、分页
- 2、数据校验
- - jquety前端校验+JSR303后端校验
- 3、ajax
- 4、Rest风格的URI；使用HTTP协议请求方式的动词，来表示对资源的操作(CURD)（GET(查询),POST(新增),PUT(修改),DELETE(删除)）



技术点

- 基础框架-ssm（SpringMVC+Spring+MyBatis）
- 数据库-MySQL
- 前端框架-bootstrap快速搭建简洁的界面
- 项目的依赖管理-Maven
- 分页-pagehelper
- 逆向工程-Mybatis Generator





基础环境搭建

- 1、创建maven工程
- 2、引入项目依赖的jar
  - spring
  - springmvc
  - mybatis
  - 数据库连接池，驱动包
  - 其他（jstl，servlet-api，junit）
- 3、引入bootsttrap前端框架
- 4、编写ssm整合的关键配置文件
  - web.xml，spring,springmvc,mybatis，使用mybatis的逆向工程生成对应的bean一imapper
- 5、测试mapper



查询

- 1、访问index.jsp页面
- 2、index.jsp页面发出查询员工列表请求
- 3、EmployeeController来接收请求,查出员工数据
- 4、来到list.jsp页面进行展示
- 5、pagehelper分页插件完成分页查询
- URI：/emps





查询-ajax

- 1、index.jsp页面直接发送ajax请求进行员工分页数据的查询
- 2、服务器将查出的数据，以json字符串的形式返回给浏览器
- 3、浏览器收到js字符串，可以使用js对json进行解析，使用js通过dom增删改查改变页面
- 4、返回json，实现客户端无关性

- 1、在index.jsp页面点击 新增
- 2、弹出新增对话框
- 3、去数据库查询部门列表，显示在对话框中
- 4、用户输入数据，进行数据校验
- 5、完成保存

URI：

- /emp/{id}  	GET 查询员工
- /emp              POST 保存员工
- /emp/{id}      PUT修改员工
- /emp/{id}      DELETE删除员工

- 1、点击编辑
- 2、弹出用户修改的模态框（显示用户信息）
- 3、点击更新，完成用户修改





删除--逻辑

- 1、单个删除
  - URI:/emp/{id} DELETE
