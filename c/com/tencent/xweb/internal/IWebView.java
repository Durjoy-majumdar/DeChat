package com.tencent.xweb.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassifier;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.tencent.xweb.GetImageBitmapToFileFinishedCallback;
import com.tencent.xweb.VideoControl;
import com.tencent.xweb.VideoJsCallback;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewCallbackClient;
import com.tencent.xweb.WebViewClient;
import com.tencent.xweb.WebViewJSExceptionListener;
import com.tencent.xweb.WebViewRenderProcessClient;
import com.tencent.xweb.XWebKeyEventHandler;
import java.util.Map;
import java.util.concurrent.Executor;

public interface IWebView {

    public interface ICaptureBitmapCallback {
        void onBitmapCaptureFinished(Bitmap bitmap);
    }

    int addDocumentStartJavaScript(String str, String[] strArr);

    void addJavascriptInterface(Object obj, String str);

    boolean canGoBack();

    boolean canGoBackOrForward(int i);

    boolean canGoForward();

    Bitmap captureBitmap();

    void captureBitmap(ICaptureBitmapCallback iCaptureBitmapCallback);

    void clearCache(boolean z);

    void clearHistory();

    void clearMatches();

    void clearSslPreferences();

    void clearView();

    WebBackForwardList copyBackForwardList();

    PrintDocumentAdapter createPrintDocumentAdapter(String str);

    WebMessagePort[] createWebMessageChannel();

    void destroy();

    @Deprecated
    void disablePlatformNotifications();

    void disableVideoJsCallback(boolean z);

    void documentHasImages(Message message);

    @Deprecated
    void enablePlatformNotifications();

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    void findAllAsync(String str);

    void findNext(boolean z);

    void flingScroll(int i, int i2);

    String getAbstractInfo();

    SslCertificate getCertificate();

    int getContentHeight();

    ICookieManager getCookieManager();

    Bitmap getFavicon();

    WebView.FullscreenVideoKind getFullscreenVideoKind();

    WebView.HitTestResult getHitTestResult();

    String[] getHttpAuthUsernamePassword(String str, String str2);

    boolean getImageBitmapToFile(String str, String str2, String str3, GetImageBitmapToFileFinishedCallback getImageBitmapToFileFinishedCallback);

    String getOriginalUrl();

    int getProgress();

    float getScale();

    int getScrollHeight();

    WebSettings getSettings();

    TextClassifier getTextClassifier();

    String getTitle();

    ViewGroup getTopView();

    String getUrl();

    String getVersionInfo();

    View getView();

    int getVisibleTitleHeight();

    WebChromeClient getWebChromeClient();

    int getWebScrollX();

    int getWebScrollY();

    WebViewCallbackClient getWebViewCallbackClient();

    WebViewClient getWebViewClient();

    Looper getWebViewLooper();

    WebViewRenderProcessClient getWebViewRenderProcessClient();

    View getWebViewUI();

    void goBack();

    void goBackOrForward(int i);

    void goForward();

    boolean hasEnteredFullscreen();

    Bundle invokeMiscMethod(String str, Bundle bundle);

    boolean isOverScrollStart();

    void leaveFullscreen();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void loadUrl(String str, Map<String, String> map);

    void onHide();

    void onPause();

    void onResume();

    void onShow();

    boolean overlayHorizontalScrollbar();

    boolean overlayVerticalScrollbar();

    boolean pageDown(boolean z);

    boolean pageUp(boolean z);

    void pauseTimers();

    void postUrl(String str, byte[] bArr);

    void postVisualStateCallback(long j, WebView.VisualStateCallback visualStateCallback);

    void postWebMessage(WebMessage webMessage, Uri uri);

    void reload();

    void removeDocumentStartJavaScript(int i);

    void removeJavascriptInterface(String str);

    void requestFocusNodeHref(Message message);

    void requestImageRef(Message message);

    WebBackForwardList restoreState(Bundle bundle);

    void resumeTimers();

    boolean savePage(String str, String str2, int i);

    WebBackForwardList saveState(Bundle bundle);

    void saveWebArchive(String str);

    void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback);

    void setBottomHeight(int i);

    void setDownloadListener(DownloadListener downloadListener);

    void setFindListener(WebView.FindListener findListener);

    void setHorizontalScrollBarEnabled(boolean z);

    void setHorizontalScrollbarOverlay(boolean z);

    void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4);

    void setInitialScale(int i);

    void setJSExceptionListener(WebViewJSExceptionListener webViewJSExceptionListener);

    void setNetworkAvailable(boolean z);

    @Deprecated
    void setPictureListener(WebView.PictureListener pictureListener);

    void setScrollBarStyle(int i);

    void setScrollbarFadingEnabled(boolean z);

    void setTextClassifier(TextClassifier textClassifier);

    void setVerticalScrollBarEnabled(boolean z);

    void setVerticalScrollbarOverlay(boolean z);

    VideoControl setVideoJsCallback(VideoJsCallback videoJsCallback);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebContentsSize(int i, int i2);

    void setWebViewCallbackClient(WebViewCallbackClient webViewCallbackClient);

    void setWebViewClient(WebViewClient webViewClient);

    void setWebViewClientExtension(ProxyWebViewClientExtension proxyWebViewClientExtension);

    void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient);

    void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient);

    void setXWebKeyEventHandler(XWebKeyEventHandler xWebKeyEventHandler);

    void smoothScroll(int i, int i2, long j);

    void stopLoading();

    boolean supportFeature(int i);

    boolean supportSetWebContentsSize();

    void zoomBy(float f);

    boolean zoomIn();

    boolean zoomOut();
}
