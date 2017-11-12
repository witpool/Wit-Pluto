# Wit-Pluto
REST API demo with Spring, Hibernate, CXF.

[Full source code（完整的源代码）](https://github.com/witpool/wit-pluto/blob/master/Wit-Pluto-V1.0.zip)

1. You need to install Maven, MYSQL first.

2. [Wit-Pluto-Tree](https://github.com/witpool/wit-pluto/blob/master/wit-pluto-tree.txt)
# ls
pom.xml  wit-common  wit-persist  wit-rest

3. Update the below configurations with your real account to wit-rest/src/main/resources/resources.properties

connection.username=xxx
connection.password=xxx

4. Package wit-pluto with maven tools.

# mvn clean package
# ls wit-rest/target/wit-rest.war
wit-rest/target/wit-rest.war

5.Copy wit-rest.war to your application server.
Then restart your application server.
