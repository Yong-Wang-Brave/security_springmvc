1 创建maven骨架
maven-archetype-webapp

自己创建的webapp需要指定project-structure-facets-web


2 拷贝的pom.xml报错
或者报错 \u200b，是因为有特殊看不见的问号
一般在空行的最前面 删除即可。

解决：

拷贝到idea的txt上 然后替换字符集就可以看到了

3 Maven打包报错
Web项目报错Failed to execute goal org.apache.maven.plugins:maven-war-plugin:2.2:war (default-war)

解决：
使用servlet3.0无注解的方式。
  <properties>
    <failOnMissingWebXml>false</failOnMissingWebXml>
  </properties>
  
  4 lomb插件不生效 打开插件 关闭插件 重启就行了
  