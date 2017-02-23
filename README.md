# WebviewAndList
近日接到一个需求，需要在一个页面上方用webview显示网页的内容，下半部分用原生实现一个评论列表。

初步想法有两个：

1、Header模式：用RecyclerView显示原生的评论列表，把WebView作为RecyclerView的第0项。

ViewGroup.LayoutParams lp =newViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);

WebView web =newWebView(parent.getContext());

web.setLayoutParams(lp);

需要把WebView撑开，保证WebView的内容完全展示。

2、ScrollView模式：最外层用NestedScrollView容器，内层放一个LinearLayout,从上到下依次是WebView和RecyclerView;

布局上没有什么大的问题，就是滚动会觉得有点卡，没有关系，设置一下就好了。

LinearLayoutManager layoutManager =newLinearLayoutManager(this);

layoutManager.setSmoothScrollbarEnabled(true);

layoutManager.setAutoMeasureEnabled(true);



recyclerView.setLayoutManager(layoutManager);

recyclerView.setHasFixedSize(true);

recyclerView.setNestedScrollingEnabled(false);

recyclerView.setLayoutManager(layoutManager);


Pros and Cons：

总的来说，优缺点非常明显，在评论列表条数特别多（实验时用了500条）的时候:

页面初始化结束时：Header模式申请的内存为25.77m；ScrollView模式申请的内存为37.87m

列表滚动到底时：Header模式申请的内存为28.09m; ScrollView模式申请的内存为40.63m

gc后：Header模式申请的内存为25.05m; ScrollView模式申请的内存为27.77m



Example: https://github.com/bobbySpace/WebviewAndList






