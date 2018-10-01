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