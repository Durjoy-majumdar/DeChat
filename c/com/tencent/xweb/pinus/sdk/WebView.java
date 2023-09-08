package com.tencent.xweb.pinus.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeProvider;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.tencent.xweb.XWebExtendInputClient;
import com.tencent.xweb.XWebExtendInterface;
import com.tencent.xweb.XWebExtendPluginClient;
import com.tencent.xweb.XWebExtendTextAreaClient;
import com.tencent.xweb.pinus.PSCoreWrapper;
import com.tencent.xweb.util.ReflectConstructor;
import com.tencent.xweb.util.XWebLog;
import java.util.ArrayList;
import java.util.Map;

public class WebView extends FrameLayout implements WebViewInterface, XWebExtendInterface {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "Pinus.WebView";
    private final ArrayList<Object> constructorParams;
    private final ArrayList<Object> constructorTypes;
    private PSCoreWrapper coreWrapper;
    private Object inner;
    private OverScrolledListener mOverScrolledListener;
    private ScrollChangedListener mScrollChangedListener;
    private WebViewInterface reflectInterface;
    private WebSettingsInterface webSettings;

    public interface OverScrolledListener {
        void onOverScrolled(int i, int i2, boolean z, boolean z2, View view);

        void onOverScrolled(boolean z);

        boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view);
    }

    public interface ScrollChangedListener {
        void onScrollChanged(int i, int i2, int i3, int i4);
    }

    static {
        Class<WebView> cls = WebView.class;
    }

    public WebView(Context context) {
        super(context, (AttributeSet) null);
        ArrayList<Object> arrayList = new ArrayList<>();
        this.constructorTypes = arrayList;
        arrayList.add(Context.class);
        ArrayList<Object> arrayList2 = new ArrayList<>();
        this.constructorParams = arrayList2;
        arrayList2.add(context);
        init();
    }

    private void init() {
        PSCoreWrapper instance = PSCoreWrapper.getInstance();
        this.coreWrapper = instance;
        if (instance != null) {
            int size = this.constructorTypes.size();
            Class[] clsArr = new Class[(size + 1)];
            for (int i = 0; i < size; i++) {
                Object obj = this.constructorTypes.get(i);
                if (obj instanceof String) {
                    clsArr[i] = this.coreWrapper.getBridgeClass((String) obj);
                    ArrayList<Object> arrayList = this.constructorParams;
                    arrayList.set(i, this.coreWrapper.getBridgeObject(arrayList.get(i)));
                } else if (obj instanceof Class) {
                    clsArr[i] = (Class) obj;
                }
            }
            clsArr[size] = Object.class;
            this.constructorParams.add(this);
            try {
                Object newInstance = new ReflectConstructor(this.coreWrapper.getBridgeClass("PSWebview"), clsArr).newInstance(this.constructorParams.toArray());
                this.inner = newInstance;
                addView((FrameLayout) newInstance, new FrameLayout.LayoutParams(-1, -1));
                WebViewInterfaceImpl webViewInterfaceImpl = new WebViewInterfaceImpl(this.inner);
                this.reflectInterface = webViewInterfaceImpl;
                this.webSettings = new WebSettingsInterfaceImpl(webViewInterfaceImpl.getSettingsInner());
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "init, error", th);
            }
        }
    }

    private boolean performLongClickDelegate() {
        return performLongClick();
    }

    public int addDocumentStartJavaScript(String str, String[] strArr) {
        return this.reflectInterface.addDocumentStartJavaScript(str, strArr);
    }

    public void addJavascriptInterface(Object obj, String str) {
        this.reflectInterface.addJavascriptInterface(obj, str);
    }

    public boolean canGoBack() {
        return this.reflectInterface.canGoBack();
    }

    public boolean canGoBackOrForward(int i) {
        return this.reflectInterface.canGoBackOrForward(i);
    }

    public boolean canGoForward() {
        return this.reflectInterface.canGoForward();
    }

    public void clearCache(boolean z) {
        this.reflectInterface.clearCache(z);
    }

    public void clearFormData() {
        this.reflectInterface.clearFormData();
    }

    public void clearHistory() {
        this.reflectInterface.clearHistory();
    }

    public void clearMatches() {
        this.reflectInterface.clearMatches();
    }

    public void clearSslPreferences() {
        this.reflectInterface.clearSslPreferences();
    }

    public void clearView() {
        this.reflectInterface.clearView();
    }

    public int computeHorizontalScrollOffset() {
        return view_computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return view_computeHorizontalScrollRange();
    }

    public int computeVerticalScrollExtent() {
        return view_computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return view_computeVerticalScrollOffset();
    }

    public int computeVerticalScrollRange() {
        return view_computeVerticalScrollRange();
    }

    public WebBackForwardList copyBackForwardList() {
        return this.reflectInterface.copyBackForwardList();
    }

    public PrintDocumentAdapter createPrintDocumentAdapter(String str) {
        return this.reflectInterface.createPrintDocumentAdapter(str);
    }

    public void destroy() {
        this.reflectInterface.destroy();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.reflectInterface.dispatchKeyEvent(keyEvent);
    }

    public void documentHasImages(Message message) {
        this.reflectInterface.documentHasImages(message);
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.reflectInterface.evaluateJavascript(str, valueCallback);
    }

    public void findAllAsync(String str) {
        this.reflectInterface.findAllAsync(str);
    }

    public void findNext(boolean z) {
        this.reflectInterface.findNext(z);
    }

    public void flingScroll(int i, int i2) {
        this.reflectInterface.flingScroll(i, i2);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return this.reflectInterface.getAccessibilityNodeProvider();
    }

    public Object getBridge() {
        return this.inner;
    }

    public SslCertificate getCertificate() {
        return this.reflectInterface.getCertificate();
    }

    public int getContentHeight() {
        return this.reflectInterface.getContentHeight();
    }

    public ViewGroup getContentView() {
        return this.reflectInterface.getContentView();
    }

    public Bitmap getFavicon() {
        return this.reflectInterface.getFavicon();
    }

    public HitTestResultInterface getHitTestResult() {
        return new HitTestResultInterfaceImpl(this.reflectInterface.getHitTestResultInner());
    }

    public Object getHitTestResultInner() {
        return this.reflectInterface.getHitTestResultInner();
    }

    public boolean getImageBitmapToFile(String str, String str2, String str3, Object obj) {
        return this.reflectInterface.getImageBitmapToFile(str, str2, str3, obj);
    }

    public String getOriginalUrl() {
        return this.reflectInterface.getOriginalUrl();
    }

    public int getProgress() {
        return this.reflectInterface.getProgress();
    }

    public float getScale() {
        return this.reflectInterface.getScale();
    }

    public WebSettingsInterface getSettings() {
        return this.webSettings;
    }

    public Object getSettingsInner() {
        return this.reflectInterface.getSettingsInner();
    }

    public String getTitle() {
        return this.reflectInterface.getTitle();
    }

    public void getTranslateSampleString(int i) {
        this.reflectInterface.getTranslateSampleString(i);
    }

    public String getUrl() {
        return this.reflectInterface.getUrl();
    }

    public void goBack() {
        this.reflectInterface.goBack();
    }

    public void goBackOrForward(int i) {
        this.reflectInterface.goBackOrForward(i);
    }

    public void goForward() {
        this.reflectInterface.goForward();
    }

    public void invokeZoomPicker() {
        this.reflectInterface.invokeZoomPicker();
    }

    public boolean isPrivateBrowsingEnabled() {
        return this.reflectInterface.isPrivateBrowsingEnabled();
    }

    public void loadData(String str, String str2, String str3) {
        this.reflectInterface.loadData(str, str2, str3);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.reflectInterface.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadUrl(String str) {
        this.reflectInterface.loadUrl(str);
    }

    public boolean onCheckIsTextEditor() {
        return this.reflectInterface.onCheckIsTextEditor();
    }

    public void onExtendInputKeyboardHeightChanged(boolean z, int i, boolean z2) {
        this.reflectInterface.onExtendInputKeyboardHeightChanged(z, i, z2);
    }

    public void onExtendTextAreaKeyboardHeightChanged(boolean z, int i, boolean z2) {
        this.reflectInterface.onExtendTextAreaKeyboardHeightChanged(z, i, z2);
    }

    public void onHide() {
        this.reflectInterface.onHide();
    }

    public void onOverScrolledDelegate(int i, int i2, boolean z, boolean z2, View view) {
        OverScrolledListener overScrolledListener = this.mOverScrolledListener;
        if (overScrolledListener != null) {
            overScrolledListener.onOverScrolled(i, i2, z, z2, view);
        }
    }

    public void onOverscrollRefresh(boolean z) {
        OverScrolledListener overScrolledListener = this.mOverScrolledListener;
        if (overScrolledListener != null) {
            overScrolledListener.onOverScrolled(z);
        }
    }

    public void onPause() {
        this.reflectInterface.onPause();
    }

    public void onResume() {
        this.reflectInterface.onResume();
    }

    public void onScrollChangedDelegate(int i, int i2, int i3, int i4) {
        onScrollChanged(i, i2, i3, i4);
        ScrollChangedListener scrollChangedListener = this.mScrollChangedListener;
        if (scrollChangedListener != null) {
            scrollChangedListener.onScrollChanged(i, i2, i3, i4);
        }
    }

    public void onShow() {
        this.reflectInterface.onShow();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.reflectInterface.onTouchEvent(motionEvent);
    }

    public boolean overScrollByDelegate(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view) {
        OverScrolledListener overScrolledListener = this.mOverScrolledListener;
        if (overScrolledListener != null) {
            return overScrolledListener.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z, view);
        }
        return false;
    }

    public boolean pageDown(boolean z) {
        return this.reflectInterface.pageDown(z);
    }

    public boolean pageUp(boolean z) {
        return this.reflectInterface.pageUp(z);
    }

    public void pauseTimers() {
        this.reflectInterface.pauseTimers();
    }

    public void postUrl(String str, byte[] bArr) {
        this.reflectInterface.postUrl(str, bArr);
    }

    public void reload() {
        this.reflectInterface.reload();
    }

    public void removeDocumentStartJavaScript(int i) {
        this.reflectInterface.removeDocumentStartJavaScript(i);
    }

    public void removeJavascriptInterface(String str) {
        this.reflectInterface.removeJavascriptInterface(str);
    }

    public void replaceTranslatedString(Map<String, String> map) {
        this.reflectInterface.replaceTranslatedString(map);
    }

    public void requestFocusNodeHref(Message message) {
        this.reflectInterface.requestFocusNodeHref(message);
    }

    public void requestImageRef(Message message) {
        this.reflectInterface.requestImageRef(message);
    }

    public WebBackForwardList restoreState(Bundle bundle) {
        return this.reflectInterface.restoreState(bundle);
    }

    public void resumeTimers() {
        this.reflectInterface.resumeTimers();
    }

    public boolean savePage(String str, String str2, int i) {
        return this.reflectInterface.savePage(str, str2, i);
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return this.reflectInterface.saveState(bundle);
    }

    public void saveWebArchive(String str) {
        this.reflectInterface.saveWebArchive(str);
    }

    public void scrollBy(int i, int i2) {
        view_scrollBy(i, i2);
    }

    public void scrollTo(int i, int i2) {
        view_scrollTo(i, i2);
    }

    public void setBackgroundColor(int i) {
        this.reflectInterface.setBackgroundColor(i);
    }

    public void setBottomHeight(int i) {
        this.reflectInterface.setBottomHeight(i);
    }

    public void setCustomOnOverScrolledListener(OverScrolledListener overScrolledListener) {
        this.mOverScrolledListener = overScrolledListener;
    }

    public void setCustomOnScrollChangedListener(ScrollChangedListener scrollChangedListener) {
        this.mScrollChangedListener = scrollChangedListener;
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        this.reflectInterface.setDownloadListener(downloadListener);
    }

    public void setExtendInputClient(Object obj) {
        this.reflectInterface.setExtendInputClient(obj);
    }

    public void setExtendPluginClient(Object obj) {
        this.reflectInterface.setExtendPluginClient(obj);
    }

    public void setExtendTextAreaClient(Object obj) {
        this.reflectInterface.setExtendTextAreaClient(obj);
    }

    public void setFindListener(WebView.FindListener findListener) {
        this.reflectInterface.setFindListener(findListener);
    }

    public void setHorizontalScrollBarEnable(boolean z) {
        this.reflectInterface.setHorizontalScrollBarEnable(z);
    }

    public void setInitialScale(int i) {
        this.reflectInterface.setInitialScale(i);
    }

    public void setNetworkAvailable(boolean z) {
        this.reflectInterface.setNetworkAvailable(z);
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.reflectInterface.setOnTouchListener(onTouchListener);
    }

    public void setPluginTextureScale(String str, int i, float f, float f2) {
        this.reflectInterface.setPluginTextureScale(str, i, f, f2);
    }

    public void setProxyWebViewClientExtension(Object obj) {
        this.reflectInterface.setProxyWebViewClientExtension(obj);
    }

    public void setTranslateMode(boolean z) {
        this.reflectInterface.setTranslateMode(z);
    }

    public void setVerticalScrollBarEnable(boolean z) {
        this.reflectInterface.setVerticalScrollBarEnable(z);
    }

    public void setWebChromeClient(Object obj) {
        this.reflectInterface.setWebChromeClient(obj);
    }

    public void setWebContentsDebuggingEnabled(boolean z) {
        this.reflectInterface.setWebContentsDebuggingEnabled(z);
    }

    public void setWebContentsSize(int i, int i2) {
        this.reflectInterface.setWebContentsSize(i, i2);
    }

    public void setWebViewClient(Object obj) {
        this.reflectInterface.setWebViewClient(obj);
    }

    public void smoothScroll(int i, int i2, long j) {
        this.reflectInterface.smoothScroll(i, i2, j);
    }

    public void stopLoading() {
        this.reflectInterface.stopLoading();
    }

    public void takePluginScreenshot(String str, int i) {
        this.reflectInterface.takePluginScreenshot(str, i);
    }

    public int view_computeHorizontalScrollOffset() {
        return this.reflectInterface.view_computeHorizontalScrollOffset();
    }

    public int view_computeHorizontalScrollRange() {
        return this.reflectInterface.view_computeHorizontalScrollRange();
    }

    public int view_computeVerticalScrollExtent() {
        return this.reflectInterface.view_computeVerticalScrollExtent();
    }

    public int view_computeVerticalScrollOffset() {
        return this.reflectInterface.view_computeVerticalScrollOffset();
    }

    public int view_computeVerticalScrollRange() {
        return this.reflectInterface.view_computeVerticalScrollRange();
    }

    public void view_scrollBy(int i, int i2) {
        this.reflectInterface.view_scrollBy(i, i2);
    }

    public void view_scrollTo(int i, int i2) {
        this.reflectInterface.view_scrollTo(i, i2);
    }

    public void zoomBy(float f) {
        this.reflectInterface.zoomBy(f);
    }

    public boolean zoomIn() {
        return this.reflectInterface.zoomIn();
    }

    public boolean zoomOut() {
        return this.reflectInterface.zoomOut();
    }

    public void loadUrl(String str, Map<String, String> map) {
        this.reflectInterface.loadUrl(str, map);
    }

    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
        this.reflectInterface.saveWebArchive(str, z, valueCallback);
    }

    public void setExtendInputClient(XWebExtendInputClient xWebExtendInputClient) {
        setExtendInputClient((Object) xWebExtendInputClient);
    }

    public void setExtendPluginClient(XWebExtendPluginClient xWebExtendPluginClient) {
        setExtendPluginClient((Object) xWebExtendPluginClient);
    }

    public void setExtendTextAreaClient(XWebExtendTextAreaClient xWebExtendTextAreaClient) {
        setExtendTextAreaClient((Object) xWebExtendTextAreaClient);
    }

    public WebView(Context context, AttributeSet attributeSet) {
        super(context, (AttributeSet) null);
        ArrayList<Object> arrayList = new ArrayList<>();
        this.constructorTypes = arrayList;
        arrayList.add(Context.class);
        arrayList.add(AttributeSet.class);
        ArrayList<Object> arrayList2 = new ArrayList<>();
        this.constructorParams = arrayList2;
        arrayList2.add(context);
        arrayList2.add(attributeSet);
        init();
    }
}
