# Wit-Pluto
RESTful API demo with `Spring, Hibernate, CXF`.

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

6. UT by [Wisdom RESTClient](https://github.com/Wisdom-Projects/rest-client/blob/master/tools/restclient-1.2.jar)
, import testing [case file.](https://github.com/witpool/wit-pluto/blob/master/Wit-Pluto-Cases.json)
![image](https://github.com/witpool/wit-pluto/blob/master/Wit-RESTClient.png)<br/>
More about the usages of the tool, please visit [Wisdom RESTClient](https://github.com/Wisdom-Projects/rest-client)<br/>

