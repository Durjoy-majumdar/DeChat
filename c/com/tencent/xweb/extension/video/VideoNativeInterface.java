package com.tencent.xweb.extension.video;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import com.tencent.xweb.VideoControl;

public interface VideoNativeInterface extends VideoControl {
    void disableJsCallback(boolean z);

    void evaluteJavascript(boolean z, boolean z2);

    boolean hasEnteredFullscreen();

    void init(Activity activity, View view, View view2, Context context, String str);

    void initConfigs(Bundle bundle);

    void onHideCustomView();

    void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback);

    void registerJavascriptInterface(Object obj);

    boolean setVideoJsCallback(Object obj);
}
