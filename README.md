# Java-Servlet-Login
Simple Login form prob with many mistakes and weak points:

Server - Tomcat v7.0
Controller - Servlets Site\src\controller\servlets
View - Site\WebContent
Model - src\model
Notice that you need to configurate your contex.xml file in Servers\Tomcat v7.0 Server at localhost-config
and add structure like this:
<Context>
    <Resource
        name="jdbc/yourdb" type="javax.sql.DataSource"
        maxActive="100" maxIdle="30" maxWait="10000" 
        url="jdbc:mysql://localhost:3306/yourdb"
        driverClassName="com.mysql.jdbc.Driver"
        username="yourname" password="yourpass"
    />
</Context>

and structure like this in YourApp/WEB-INF/web.xml

<resource-env-ref>
    <resource-env-ref-name>jdbc/yourdb</resource-env-ref-name>
    <resource-env-ref-type>javax.sql.DataSource</resource-env-ref-type>
</resource-env-ref>

Current app will hide his password and username and you will need to check the data in thoose files.
 
