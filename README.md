# Wit-Pluto
RESTful API demo with `Spring, Hibernate, CXF`.

[Full source code（完整的源代码）](https://github.com/witpool/wit-pluto/blob/master/Wit-Pluto-V1.0.zip)

1. You need to install `Java 1.8.0 or above, Maven 3.2.1 or above, MYSQL` first.<br/>

2. [Wit-Pluto-Tree](https://github.com/witpool/wit-pluto/blob/master/Wit-Pluto-Tree.txt)<br/>
`# ls` <br/>
`pom.xml  wit-common  wit-persist  wit-rest` <br/>
3. Update the below configurations with your real account to `wit-rest/src/main/resources/resources.properties`<br/>
`connection.username=xxx`<br/>
`connection.password=xxx`<br/>

4. Package `wit-pluto` with `maven` tools.<br/>
`# mvn clean install`<br/>
`# ls wit-rest/target/wit-rest.war`<br/>
`wit-rest/target/wit-rest.war`<br/>

5. Copy `wit-rest.war` to your application server.<br/>
Then restart your application server.

6. UT by [WisdomTool REST Client](https://github.com/wisdomtool/rest-client/blob/master/restclient-1.1.jar)
, import testing [case file.](https://github.com/witpool/wit-pluto/blob/master/Wit-Pluto-Cases.json)
![image](https://github.com/witpool/wit-pluto/blob/master/Wit-RESTClient.png)<br/>
More about the usages of the tool, please visit [WisdomTool REST Client](https://github.com/wisdomtool/rest-client)<br/>

7. [Technical Exchange Group (技术交流QQ群)](https://github.com/wisdomtool/rest-client/blob/master/images/qq-group.png)<br/>
![Technical Exchange Group (技术交流QQ群)](https://github.com/wisdomtool/rest-client/blob/master/images/qq-group.png)
