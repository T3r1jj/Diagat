[![CircleCI](https://circleci.com/gh/T3r1jj/Diagat/tree/master.svg?style=svg)](https://circleci.com/gh/T3r1jj/Diagat/tree/master)
[![codecov](https://codecov.io/gh/T3r1jj/Diagat/branch/master/graph/badge.svg)](https://codecov.io/gh/T3r1jj/Diagat)


Learning new java features (**JDK 11**) like modules/jlink and new technologies like RxJava.

Current project setup inclues: java, kotlin, rxkotlinfx, tornadofx, fontawesomefx, jfoenix, kfoenix, testfx, junit5.

##### Setup
Due to JDK 11 choice, ScenicView 9.0.0 hasn't been working for me. I've encountered instant crashing caused by the following exception:
````
Exception in thread "JavaFX Application Thread" java.lang.NullPointerException at scenicview@9.0.0/org.scenicview.view.tabs.CSSFXTab.setActiveStage(CSSFXTab.java:112)
````
I have found out [a related issue](https://bitbucket.org/scenicview/scenic-view/issues/27/exception-at-startup-cssfxtab-java-9) with 
[a fixed jar](https://bitbucket.org/scenicview/scenic-view/issues/attachments/27/scenicview/scenic-view/1517402311.88/27/scenicviewpatch.jar) by Dagmar Schlenz.
The new version with merged PR doesn't seem to be officially released yet.

*scenicviewpatch.jar* should be placed inside *gui* directory as it's being launched from the code atm.

##### Issues

- **[multi module]** Kotlin tests are marked red in IDEA (Symbol is declared in module junit which current module does not depend on) - [tracked issue](https://youtrack.jetbrains.com/issue/KT-26037).
- **[JDK11]** *mvn clean test* fails with an error (but can be ran from within IDEA) - [similar issue](https://issues.apache.org/jira/browse/MCOMPILER-342) and [another one](https://issues.apache.org/jira/browse/MDEP-613?jql=priority%20%3D%20Major%20AND%20text%20~%20%22Unsupported%20class%20file%20%20version%2055%22)
- **[multi module]** [mvn dependency:go-offline does not find dependencies in multi-module](https://issues.apache.org/jira/browse/MDEP-516) which requires additional *package* step, slowing down the build process. 