package com.tencent.xweb.pinus.sdk;

import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeProvider;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import java.util.Map;

public interface WebViewInterface {
    int addDocumentStartJavaScript(String str, String[] strArr);

    void addJavascriptInterface(Object obj, String str);

    boolean canGoBack();

    boolean canGoBackOrForward(int i);

    boolean canGoForward();

    void clearCache(boolean z);

    void clearFormData();

    void clearHistory();

    void clearMatches();

    void clearSslPreferences();

    void clearView();

    WebBackForwardList copyBackForwardList();

    PrintDocumentAdapter createPrintDocumentAdapter(String str);

    void destroy();

    boolean dispatchKeyEvent(KeyEvent keyEvent);

    void documentHasImages(Message message);

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    void findAllAsync(String str);

    void findNext(boolean z);

    void flingScroll(int i, int i2);

    AccessibilityNodeProvider getAccessibilityNodeProvider();

    SslCertificate getCertificate();

    int getContentHeight();

    ViewGroup getContentView();

    Bitmap getFavicon();

    Object getHitTestResultInner();

    boolean getImageBitmapToFile(String str, String str2, String str3, Object obj);

    String getOriginalUrl();

    int getProgress();

    float getScale();

    Object getSettingsInner();

    String getTitle();

    void getTranslateSampleString(int i);

    String getUrl();

    void goBack();

    void goBackOrForward(int i);

    void goForward();

    void invokeZoomPicker();

    boolean isPrivateBrowsingEnabled();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void loadUrl(String str, Map<String, String> map);

    boolean onCheckIsTextEditor();

    void onExtendInputKeyboardHeightChanged(boolean z, int i, boolean z2);

    void onExtendTextAreaKeyboardHeightChanged(boolean z, int i, boolean z2);

    void onHide();

    void onPause();

    void onResume();

    void onShow();

    boolean onTouchEvent(MotionEvent motionEvent);

    boolean pageDown(boolean z);

    boolean pageUp(boolean z);

    void pauseTimers();

    void postUrl(String str, byte[] bArr);

    void reload();

    void removeDocumentStartJavaScript(int i);

    void removeJavascriptInterface(String str);

    void replaceTranslatedString(Map<String, String> map);

    void requestFocusNodeHref(Message message);

    void requestImageRef(Message message);

    WebBackForwardList restoreState(Bundle bundle);

    void resumeTimers();

    boolean savePage(String str, String str2, int i);

    WebBackForwardList saveState(Bundle bundle);

    void saveWebArchive(String str);

    void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback);

    void setBackgroundColor(int i);

    void setBottomHeight(int i);

    void setDownloadListener(DownloadListener downloadListener);

    void setExtendInputClient(Object obj);

    void setExtendPluginClient(Object obj);

    void setExtendTextAreaClient(Object obj);

    void setFindListener(WebView.FindListener findListener);

    void setHorizontalScrollBarEnable(boolean z);

    void setInitialScale(int i);

    void setNetworkAvailable(boolean z);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setPluginTextureScale(String str, int i, float f, float f2);

    void setProxyWebViewClientExtension(Object obj);

    void setTranslateMode(boolean z);

    void setVerticalScrollBarEnable(boolean z);

    void setWebChromeClient(Object obj);

    void setWebContentsDebuggingEnabled(boolean z);

    void setWebContentsSize(int i, int i2);

    void setWebViewClient(Object obj);

    void smoothScroll(int i, int i2, long j);

    void stopLoading();

    void takePluginScreenshot(String str, int i);

    int view_computeHorizontalScrollOffset();

    int view_computeHorizontalScrollRange();

    int view_computeVerticalScrollExtent();

    int view_computeVerticalScrollOffset();

    int view_computeVerticalScrollRange();

    void view_scrollBy(int i, int i2);

    void view_scrollTo(int i, int i2);

    void zoomBy(float f);

    boolean zoomIn();

    boolean zoomOut();
}
