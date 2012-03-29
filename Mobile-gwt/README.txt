GWT Project
===========
http://mojo.codehaus.org/gwt-maven-plugin/user-guide/archetype.html

mvn archetype:generate \
   -DarchetypeRepository=repo1.maven.org \
   -DarchetypeGroupId=org.codehaus.mojo \
   -DarchetypeArtifactId=gwt-maven-plugin \
   -DarchetypeVersion=2.4.0

mvn gwt:run
mvn package

JQuery
======
http://code.google.com/p/gwt-jquery/wiki/JQueryUserGuide
http://code.google.com/p/gwt-jquery/wiki/JQueryMobileGuide

Not available on any maven repo! 

<dependency>
      <groupId>com.xedge</groupId>
      <artifactId>gwt-jquery</artifactId>
      <version>x</version>
</dependency>

What about https://github.com/dennisjzh/GwtMobile (not maintained!!)
What about http://code.google.com/p/jqm4gwt/wiki/GettingStarted

Phonegap
========
http://code.google.com/p/gwt-phonegap/
http://code.google.com/p/gwt-phonegap/wiki/GettingStarted

<dependency>
      <groupId>com.googlecode.gwtphonegap</groupId>
      <artifactId>gwtphonegap</artifactId>
      <version>${latestVersion}</version>
</dependency>

