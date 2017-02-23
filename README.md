# WebviewAndList
近日接到一个需求，需要在一个页面上方用webview显示网页的内容，下半部分用原生实现一个评论列表。

初步想法有两个：

1、Header模式：用Recyclerview显示原生的评论列表，把webview作为Recyclerview的第0项。

2、Scrollview模式：最外层用NestedScrollview容器，内层放一个LinearLayout,从上到下依次是Webview和Recyclerview;




