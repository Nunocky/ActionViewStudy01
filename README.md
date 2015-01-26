# ActionViewStudy01
Android UI Cookbook for 4.0より : support libraryの ActionBarで ActionViewを使用する

3.5章「アクションバーにアクションビューを配置する」を support libraryで実装してみたのだが、下のようにビューの幅が非常に狭くなってしまう。

![screensho](https://github.com/Nunocky/ActionViewStudy01/blob/master/doc/scr.png)

# 解決方法
http://stackoverflow.com/questions/22823910/make-an-android-actionbars-actionviews-width-match-the-actionbars-width

アクションビューのレイアウトを RelativeLayoutを基準に作ること、android:layout_gravity="fill_horizontal" を指定することが鍵らしい。
