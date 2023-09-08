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
import com.tencent.xweb.util.ReflectMethod;
import fm0.C86937f0;
import java.util.Map;

public class WebViewInterfaceImpl implements WebViewInterface {
    private static final String TAG = "WebViewInterfaceImpl";
    private ReflectMethod addDocumentStartJavaScriptStringStringMethod;
    private ReflectMethod addJavascriptInterfaceObjectStringMethod;
    private ReflectMethod canGoBackMethod;
    private ReflectMethod canGoBackOrForwardintMethod;
    private ReflectMethod canGoForwardMethod;
    private ReflectMethod clearCachebooleanMethod;
    private ReflectMethod clearFormDataMethod;
    private ReflectMethod clearHistoryMethod;
    private ReflectMethod clearMatchesMethod;
    private ReflectMethod clearSslPreferencesMethod;
    private ReflectMethod clearViewMethod;
    private ReflectMethod copyBackForwardListMethod;
    private ReflectMethod createPrintDocumentAdapterStringMethod;
    private ReflectMethod destroyMethod;
    private ReflectMethod dispatchKeyEventKeyEventMethod;
    private ReflectMethod documentHasImagesMessageMethod;
    private ReflectMethod evaluateJavascriptStringValueCallbackStringMethod;
    private ReflectMethod findAllAsyncStringMethod;
    private ReflectMethod findNextbooleanMethod;
    private ReflectMethod flingScrollintintMethod;
    private ReflectMethod getAccessibilityNodeProviderMethod;
    private ReflectMethod getCertificateMethod;
    private ReflectMethod getContentHeightMethod;
    private ReflectMethod getContentViewMethod;
    private ReflectMethod getFaviconMethod;
    private ReflectMethod getHitTestResultInnerMethod;
    private ReflectMethod getImageBitmapToFileStringStringStringObjectMethod;
    private ReflectMethod getOriginalUrlMethod;
    private ReflectMethod getProgressMethod;
    private ReflectMethod getScaleMethod;
    private ReflectMethod getSettingsInnerMethod;
    private ReflectMethod getTitleMethod;
    private ReflectMethod getTranslateSampleStringintMethod;
    private ReflectMethod getUrlMethod;
    private ReflectMethod goBackMethod;
    private ReflectMethod goBackOrForwardintMethod;
    private ReflectMethod goForwardMethod;
    private final Object inner;
    private ReflectMethod invokeZoomPickerMethod;
    private ReflectMethod isPrivateBrowsingEnabledMethod;
    private ReflectMethod loadDataStringStringStringMethod;
    private ReflectMethod loadDataWithBaseURLStringStringStringStringStringMethod;
    private ReflectMethod loadUrlStringMapStringStringMethod;
    private ReflectMethod loadUrlStringMethod;
    private ReflectMethod onCheckIsTextEditorMethod;
    private ReflectMethod onExtendInputKeyboardHeightChangedbooleanintbooleanMethod;
    private ReflectMethod onExtendTextAreaKeyboardHeightChangedbooleanintbooleanMethod;
    private ReflectMethod onHideMethod;
    private ReflectMethod onPauseMethod;
    private ReflectMethod onResumeMethod;
    private ReflectMethod onShowMethod;
    private ReflectMethod onTouchEventMotionEventMethod;
    private ReflectMethod pageDownbooleanMethod;
    private ReflectMethod pageUpbooleanMethod;
    private ReflectMethod pauseTimersMethod;
    private ReflectMethod postUrlStringbyteMethod;
    private ReflectMethod reloadMethod;
    private ReflectMethod removeDocumentStartJavaScriptintMethod;
    private ReflectMethod removeJavascriptInterfaceStringMethod;
    private ReflectMethod replaceTranslatedStringMapStringStringMethod;
    private ReflectMethod requestFocusNodeHrefMessageMethod;
    private ReflectMethod requestImageRefMessageMethod;
    private ReflectMethod restoreStateBundleMethod;
    private ReflectMethod resumeTimersMethod;
    private ReflectMethod savePageStringStringintMethod;
    private ReflectMethod saveStateBundleMethod;
    private ReflectMethod saveWebArchiveStringMethod;
    private ReflectMethod saveWebArchiveStringbooleanValueCallbackStringMethod;
    private ReflectMethod setBackgroundColorintMethod;
    private ReflectMethod setBottomHeightintMethod;
    private ReflectMethod setDownloadListenerDownloadListenerMethod;
    private ReflectMethod setExtendInputClientObjectMethod;
    private ReflectMethod setExtendPluginClientObjectMethod;
    private ReflectMethod setExtendTextAreaClientObjectMethod;
    private ReflectMethod setFindListenerandroidwebkitWebViewFindListenerMethod;
    private ReflectMethod setHorizontalScrollBarEnablebooleanMethod;
    private ReflectMethod setInitialScaleintMethod;
    private ReflectMethod setNetworkAvailablebooleanMethod;
    private ReflectMethod setOnTouchListenerOnTouchListenerMethod;
    private ReflectMethod setPluginTextureScaleStringintfloatfloatMethod;
    private ReflectMethod setProxyWebViewClientExtensionObjectMethod;
    private ReflectMethod setTranslateModebooleanMethod;
    private ReflectMethod setVerticalScrollBarEnablebooleanMethod;
    private ReflectMethod setWebChromeClientObjectMethod;
    private ReflectMethod setWebContentsDebuggingEnabledbooleanMethod;
    private ReflectMethod setWebContentsSizeintintMethod;
    private ReflectMethod setWebViewClientObjectMethod;
    private ReflectMethod smoothScrollintintlongMethod;
    private ReflectMethod stopLoadingMethod;
    private ReflectMethod takePluginScreenshotStringintMethod;
    private ReflectMethod view_computeHorizontalScrollOffsetMethod;
    private ReflectMethod view_computeHorizontalScrollRangeMethod;
    private ReflectMethod view_computeVerticalScrollExtentMethod;
    private ReflectMethod view_computeVerticalScrollOffsetMethod;
    private ReflectMethod view_computeVerticalScrollRangeMethod;
    private ReflectMethod view_scrollByintintMethod;
    private ReflectMethod view_scrollTointintMethod;
    private ReflectMethod zoomByfloatMethod;
    private ReflectMethod zoomInMethod;
    private ReflectMethod zoomOutMethod;

    public WebViewInterfaceImpl(Object obj) {
        this.inner = obj;
    }

    private synchronized ReflectMethod getAddDocumentStartJavaScriptStringStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.addDocumentStartJavaScriptStringStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "addDocumentStartJavaScript", (Class<?>[]) new Class[]{String.class, String[].class});
            this.addDocumentStartJavaScriptStringStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getAddJavascriptInterfaceObjectStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.addJavascriptInterfaceObjectStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "addJavascriptInterface", (Class<?>[]) new Class[]{Object.class, String.class});
            this.addJavascriptInterfaceObjectStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getCanGoBackMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.canGoBackMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "canGoBack", (Class<?>[]) new Class[0]);
            this.canGoBackMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getCanGoBackOrForwardintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.canGoBackOrForwardintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "canGoBackOrForward", (Class<?>[]) new Class[]{Integer.TYPE});
            this.canGoBackOrForwardintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getCanGoForwardMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.canGoForwardMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "canGoForward", (Class<?>[]) new Class[0]);
            this.canGoForwardMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getClearCachebooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.clearCachebooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "clearCache", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.clearCachebooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getClearFormDataMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.clearFormDataMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "clearFormData", (Class<?>[]) new Class[0]);
            this.clearFormDataMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getClearHistoryMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.clearHistoryMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "clearHistory", (Class<?>[]) new Class[0]);
            this.clearHistoryMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getClearMatchesMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.clearMatchesMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "clearMatches", (Class<?>[]) new Class[0]);
            this.clearMatchesMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getClearSslPreferencesMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.clearSslPreferencesMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "clearSslPreferences", (Class<?>[]) new Class[0]);
            this.clearSslPreferencesMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getClearViewMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.clearViewMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "clearView", (Class<?>[]) new Class[0]);
            this.clearViewMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getCopyBackForwardListMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.copyBackForwardListMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "copyBackForwardList", (Class<?>[]) new Class[0]);
            this.copyBackForwardListMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getCreatePrintDocumentAdapterStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.createPrintDocumentAdapterStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "createPrintDocumentAdapter", (Class<?>[]) new Class[]{String.class});
            this.createPrintDocumentAdapterStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getDestroyMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.destroyMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "destroy", (Class<?>[]) new Class[0]);
            this.destroyMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getDispatchKeyEventKeyEventMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.dispatchKeyEventKeyEventMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "dispatchKeyEvent", (Class<?>[]) new Class[]{KeyEvent.class});
            this.dispatchKeyEventKeyEventMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getDocumentHasImagesMessageMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.documentHasImagesMessageMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "documentHasImages", (Class<?>[]) new Class[]{Message.class});
            this.documentHasImagesMessageMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getEvaluateJavascriptStringValueCallbackStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.evaluateJavascriptStringValueCallbackStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "evaluateJavascript", (Class<?>[]) new Class[]{String.class, ValueCallback.class});
            this.evaluateJavascriptStringValueCallbackStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getFindAllAsyncStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.findAllAsyncStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "findAllAsync", (Class<?>[]) new Class[]{String.class});
            this.findAllAsyncStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getFindNextbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.findNextbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "findNext", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.findNextbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getFlingScrollintintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.flingScrollintintMethod;
        if (reflectMethod == null) {
            Object obj = this.inner;
            Class cls = Integer.TYPE;
            reflectMethod = new ReflectMethod(obj, "flingScroll", (Class<?>[]) new Class[]{cls, cls});
            this.flingScrollintintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetAccessibilityNodeProviderMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getAccessibilityNodeProviderMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getAccessibilityNodeProvider", (Class<?>[]) new Class[0]);
            this.getAccessibilityNodeProviderMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetCertificateMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getCertificateMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getCertificate", (Class<?>[]) new Class[0]);
            this.getCertificateMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetContentHeightMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getContentHeightMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getContentHeight", (Class<?>[]) new Class[0]);
            this.getContentHeightMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetContentViewMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getContentViewMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getContentView", (Class<?>[]) new Class[0]);
            this.getContentViewMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetFaviconMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getFaviconMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getFavicon", (Class<?>[]) new Class[0]);
            this.getFaviconMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetHitTestResultInnerMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getHitTestResultInnerMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getHitTestResultInner", (Class<?>[]) new Class[0]);
            this.getHitTestResultInnerMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetImageBitmapToFileStringStringStringObjectMethod() {
        ReflectMethod reflectMethod;
        Class<String> cls = String.class;
        synchronized (this) {
            reflectMethod = this.getImageBitmapToFileStringStringStringObjectMethod;
            if (reflectMethod == null) {
                reflectMethod = new ReflectMethod(this.inner, "getImageBitmapToFile", (Class<?>[]) new Class[]{cls, cls, cls, Object.class});
                this.getImageBitmapToFileStringStringStringObjectMethod = reflectMethod;
            }
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetOriginalUrlMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getOriginalUrlMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getOriginalUrl", (Class<?>[]) new Class[0]);
            this.getOriginalUrlMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetProgressMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getProgressMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getProgress", (Class<?>[]) new Class[0]);
            this.getProgressMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetScaleMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getScaleMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getScale", (Class<?>[]) new Class[0]);
            this.getScaleMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetSettingsInnerMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getSettingsInnerMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getSettingsInner", (Class<?>[]) new Class[0]);
            this.getSettingsInnerMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetTitleMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getTitleMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getTitle", (Class<?>[]) new Class[0]);
            this.getTitleMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetTranslateSampleStringintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getTranslateSampleStringintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getTranslateSampleString", (Class<?>[]) new Class[]{Integer.TYPE});
            this.getTranslateSampleStringintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetUrlMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getUrlMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getUrl", (Class<?>[]) new Class[0]);
            this.getUrlMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGoBackMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.goBackMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "goBack", (Class<?>[]) new Class[0]);
            this.goBackMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGoBackOrForwardintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.goBackOrForwardintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "goBackOrForward", (Class<?>[]) new Class[]{Integer.TYPE});
            this.goBackOrForwardintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGoForwardMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.goForwardMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "goForward", (Class<?>[]) new Class[0]);
            this.goForwardMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getInvokeZoomPickerMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.invokeZoomPickerMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "invokeZoomPicker", (Class<?>[]) new Class[0]);
            this.invokeZoomPickerMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getIsPrivateBrowsingEnabledMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.isPrivateBrowsingEnabledMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "isPrivateBrowsingEnabled", (Class<?>[]) new Class[0]);
            this.isPrivateBrowsingEnabledMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getLoadDataStringStringStringMethod() {
        ReflectMethod reflectMethod;
        Class<String> cls = String.class;
        synchronized (this) {
            reflectMethod = this.loadDataStringStringStringMethod;
            if (reflectMethod == null) {
                reflectMethod = new ReflectMethod(this.inner, "loadData", (Class<?>[]) new Class[]{cls, cls, cls});
                this.loadDataStringStringStringMethod = reflectMethod;
            }
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getLoadDataWithBaseURLStringStringStringStringStringMethod() {
        ReflectMethod reflectMethod;
        Class<String> cls = String.class;
        synchronized (this) {
            reflectMethod = this.loadDataWithBaseURLStringStringStringStringStringMethod;
            if (reflectMethod == null) {
                reflectMethod = new ReflectMethod(this.inner, "loadDataWithBaseURL", (Class<?>[]) new Class[]{cls, cls, cls, cls, cls});
                this.loadDataWithBaseURLStringStringStringStringStringMethod = reflectMethod;
            }
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getLoadUrlStringMapStringStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.loadUrlStringMapStringStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "loadUrl", (Class<?>[]) new Class[]{String.class, Map.class});
            this.loadUrlStringMapStringStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getLoadUrlStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.loadUrlStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "loadUrl", (Class<?>[]) new Class[]{String.class});
            this.loadUrlStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getOnCheckIsTextEditorMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.onCheckIsTextEditorMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "onCheckIsTextEditor", (Class<?>[]) new Class[0]);
            this.onCheckIsTextEditorMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getOnExtendInputKeyboardHeightChangedbooleanintbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.onExtendInputKeyboardHeightChangedbooleanintbooleanMethod;
        if (reflectMethod == null) {
            Object obj = this.inner;
            Class cls = Boolean.TYPE;
            reflectMethod = new ReflectMethod(obj, "onExtendInputKeyboardHeightChanged", (Class<?>[]) new Class[]{cls, Integer.TYPE, cls});
            this.onExtendInputKeyboardHeightChangedbooleanintbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getOnExtendTextAreaKeyboardHeightChangedbooleanintbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.onExtendTextAreaKeyboardHeightChangedbooleanintbooleanMethod;
        if (reflectMethod == null) {
            Object obj = this.inner;
            Class cls = Boolean.TYPE;
            reflectMethod = new ReflectMethod(obj, "onExtendTextAreaKeyboardHeightChanged", (Class<?>[]) new Class[]{cls, Integer.TYPE, cls});
            this.onExtendTextAreaKeyboardHeightChangedbooleanintbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getOnHideMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.onHideMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "onHide", (Class<?>[]) new Class[0]);
            this.onHideMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getOnPauseMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.onPauseMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "onPause", (Class<?>[]) new Class[0]);
            this.onPauseMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getOnResumeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.onResumeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "onResume", (Class<?>[]) new Class[0]);
            this.onResumeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getOnShowMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.onShowMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "onShow", (Class<?>[]) new Class[0]);
            this.onShowMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getOnTouchEventMotionEventMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.onTouchEventMotionEventMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "onTouchEvent", (Class<?>[]) new Class[]{MotionEvent.class});
            this.onTouchEventMotionEventMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getPageDownbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.pageDownbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "pageDown", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.pageDownbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getPageUpbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.pageUpbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "pageUp", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.pageUpbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getPauseTimersMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.pauseTimersMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "pauseTimers", (Class<?>[]) new Class[0]);
            this.pauseTimersMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getPostUrlStringbyteMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.postUrlStringbyteMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "postUrl", (Class<?>[]) new Class[]{String.class, byte[].class});
            this.postUrlStringbyteMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getReloadMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.reloadMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "reload", (Class<?>[]) new Class[0]);
            this.reloadMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getRemoveDocumentStartJavaScriptintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.removeDocumentStartJavaScriptintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "removeDocumentStartJavaScript", (Class<?>[]) new Class[]{Integer.TYPE});
            this.removeDocumentStartJavaScriptintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getRemoveJavascriptInterfaceStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.removeJavascriptInterfaceStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "removeJavascriptInterface", (Class<?>[]) new Class[]{String.class});
            this.removeJavascriptInterfaceStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getReplaceTranslatedStringMapStringStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.replaceTranslatedStringMapStringStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "replaceTranslatedString", (Class<?>[]) new Class[]{Map.class});
            this.replaceTranslatedStringMapStringStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getRequestFocusNodeHrefMessageMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.requestFocusNodeHrefMessageMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "requestFocusNodeHref", (Class<?>[]) new Class[]{Message.class});
            this.requestFocusNodeHrefMessageMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getRequestImageRefMessageMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.requestImageRefMessageMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "requestImageRef", (Class<?>[]) new Class[]{Message.class});
            this.requestImageRefMessageMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getRestoreStateBundleMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.restoreStateBundleMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "restoreState", (Class<?>[]) new Class[]{Bundle.class});
            this.restoreStateBundleMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getResumeTimersMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.resumeTimersMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "resumeTimers", (Class<?>[]) new Class[0]);
            this.resumeTimersMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSavePageStringStringintMethod() {
        ReflectMethod reflectMethod;
        Class<String> cls = String.class;
        synchronized (this) {
            reflectMethod = this.savePageStringStringintMethod;
            if (reflectMethod == null) {
                reflectMethod = new ReflectMethod(this.inner, "savePage", (Class<?>[]) new Class[]{cls, cls, Integer.TYPE});
                this.savePageStringStringintMethod = reflectMethod;
            }
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSaveStateBundleMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.saveStateBundleMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "saveState", (Class<?>[]) new Class[]{Bundle.class});
            this.saveStateBundleMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSaveWebArchiveStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.saveWebArchiveStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "saveWebArchive", (Class<?>[]) new Class[]{String.class});
            this.saveWebArchiveStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSaveWebArchiveStringbooleanValueCallbackStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.saveWebArchiveStringbooleanValueCallbackStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "saveWebArchive", (Class<?>[]) new Class[]{String.class, Boolean.TYPE, ValueCallback.class});
            this.saveWebArchiveStringbooleanValueCallbackStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetBackgroundColorintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setBackgroundColorintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, C86937f0.NAME, (Class<?>[]) new Class[]{Integer.TYPE});
            this.setBackgroundColorintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetBottomHeightintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setBottomHeightintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setBottomHeight", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setBottomHeightintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetDownloadListenerDownloadListenerMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setDownloadListenerDownloadListenerMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setDownloadListener", (Class<?>[]) new Class[]{DownloadListener.class});
            this.setDownloadListenerDownloadListenerMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetExtendInputClientObjectMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setExtendInputClientObjectMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setExtendInputClient", (Class<?>[]) new Class[]{Object.class});
            this.setExtendInputClientObjectMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetExtendPluginClientObjectMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setExtendPluginClientObjectMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setExtendPluginClient", (Class<?>[]) new Class[]{Object.class});
            this.setExtendPluginClientObjectMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetExtendTextAreaClientObjectMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setExtendTextAreaClientObjectMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setExtendTextAreaClient", (Class<?>[]) new Class[]{Object.class});
            this.setExtendTextAreaClientObjectMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetFindListenerandroidwebkitWebViewFindListenerMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setFindListenerandroidwebkitWebViewFindListenerMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setFindListener", (Class<?>[]) new Class[]{WebView.FindListener.class});
            this.setFindListenerandroidwebkitWebViewFindListenerMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetHorizontalScrollBarEnablebooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setHorizontalScrollBarEnablebooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setHorizontalScrollBarEnable", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setHorizontalScrollBarEnablebooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetInitialScaleintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setInitialScaleintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setInitialScale", (Class<?>[]) new Class[]{Integer.TYPE});
            this.setInitialScaleintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetNetworkAvailablebooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setNetworkAvailablebooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setNetworkAvailable", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setNetworkAvailablebooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetOnTouchListenerOnTouchListenerMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setOnTouchListenerOnTouchListenerMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setOnTouchListener", (Class<?>[]) new Class[]{View.OnTouchListener.class});
            this.setOnTouchListenerOnTouchListenerMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetPluginTextureScaleStringintfloatfloatMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setPluginTextureScaleStringintfloatfloatMethod;
        if (reflectMethod == null) {
            Object obj = this.inner;
            Class cls = Float.TYPE;
            reflectMethod = new ReflectMethod(obj, "setPluginTextureScale", (Class<?>[]) new Class[]{String.class, Integer.TYPE, cls, cls});
            this.setPluginTextureScaleStringintfloatfloatMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetProxyWebViewClientExtensionObjectMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setProxyWebViewClientExtensionObjectMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setProxyWebViewClientExtension", (Class<?>[]) new Class[]{Object.class});
            this.setProxyWebViewClientExtensionObjectMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetTranslateModebooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setTranslateModebooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setTranslateMode", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setTranslateModebooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetVerticalScrollBarEnablebooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setVerticalScrollBarEnablebooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setVerticalScrollBarEnable", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setVerticalScrollBarEnablebooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetWebChromeClientObjectMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setWebChromeClientObjectMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setWebChromeClient", (Class<?>[]) new Class[]{Object.class});
            this.setWebChromeClientObjectMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetWebContentsDebuggingEnabledbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setWebContentsDebuggingEnabledbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setWebContentsDebuggingEnabled", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setWebContentsDebuggingEnabledbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetWebContentsSizeintintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setWebContentsSizeintintMethod;
        if (reflectMethod == null) {
            Object obj = this.inner;
            Class cls = Integer.TYPE;
            reflectMethod = new ReflectMethod(obj, "setWebContentsSize", (Class<?>[]) new Class[]{cls, cls});
            this.setWebContentsSizeintintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetWebViewClientObjectMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setWebViewClientObjectMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setWebViewClient", (Class<?>[]) new Class[]{Object.class});
            this.setWebViewClientObjectMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSmoothScrollintintlongMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.smoothScrollintintlongMethod;
        if (reflectMethod == null) {
            Object obj = this.inner;
            Class cls = Integer.TYPE;
            reflectMethod = new ReflectMethod(obj, "smoothScroll", (Class<?>[]) new Class[]{cls, cls, Long.TYPE});
            this.smoothScrollintintlongMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getStopLoadingMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.stopLoadingMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "stopLoading", (Class<?>[]) new Class[0]);
            this.stopLoadingMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getTakePluginScreenshotStringintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.takePluginScreenshotStringintMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "takePluginScreenshot", (Class<?>[]) new Class[]{String.class, Integer.TYPE});
            this.takePluginScreenshotStringintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getView_computeHorizontalScrollOffsetMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.view_computeHorizontalScrollOffsetMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "view_computeHorizontalScrollOffset", (Class<?>[]) new Class[0]);
            this.view_computeHorizontalScrollOffsetMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getView_computeHorizontalScrollRangeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.view_computeHorizontalScrollRangeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "view_computeHorizontalScrollRange", (Class<?>[]) new Class[0]);
            this.view_computeHorizontalScrollRangeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getView_computeVerticalScrollExtentMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.view_computeVerticalScrollExtentMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "view_computeVerticalScrollExtent", (Class<?>[]) new Class[0]);
            this.view_computeVerticalScrollExtentMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getView_computeVerticalScrollOffsetMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.view_computeVerticalScrollOffsetMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "view_computeVerticalScrollOffset", (Class<?>[]) new Class[0]);
            this.view_computeVerticalScrollOffsetMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getView_computeVerticalScrollRangeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.view_computeVerticalScrollRangeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "view_computeVerticalScrollRange", (Class<?>[]) new Class[0]);
            this.view_computeVerticalScrollRangeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getView_scrollByintintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.view_scrollByintintMethod;
        if (reflectMethod == null) {
            Object obj = this.inner;
            Class cls = Integer.TYPE;
            reflectMethod = new ReflectMethod(obj, "view_scrollBy", (Class<?>[]) new Class[]{cls, cls});
            this.view_scrollByintintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getView_scrollTointintMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.view_scrollTointintMethod;
        if (reflectMethod == null) {
            Object obj = this.inner;
            Class cls = Integer.TYPE;
            reflectMethod = new ReflectMethod(obj, "view_scrollTo", (Class<?>[]) new Class[]{cls, cls});
            this.view_scrollTointintMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getZoomByfloatMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.zoomByfloatMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "zoomBy", (Class<?>[]) new Class[]{Float.TYPE});
            this.zoomByfloatMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getZoomInMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.zoomInMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "zoomIn", (Class<?>[]) new Class[0]);
            this.zoomInMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getZoomOutMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.zoomOutMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "zoomOut", (Class<?>[]) new Class[0]);
            this.zoomOutMethod = reflectMethod;
        }
        return reflectMethod;
    }

    public static void handleRuntimeError(Exception exc) {
        exc.getClass();
    }

    public int addDocumentStartJavaScript(String str, String[] strArr) {
        try {
            return ((Integer) getAddDocumentStartJavaScriptStringStringMethod().invoke(str, strArr)).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public void addJavascriptInterface(Object obj, String str) {
        try {
            getAddJavascriptInterfaceObjectStringMethod().invoke(obj, str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public boolean canGoBack() {
        try {
            return ((Boolean) getCanGoBackMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean canGoBackOrForward(int i) {
        try {
            return ((Boolean) getCanGoBackOrForwardintMethod().invoke(Integer.valueOf(i))).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean canGoForward() {
        try {
            return ((Boolean) getCanGoForwardMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public void clearCache(boolean z) {
        try {
            getClearCachebooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void clearFormData() {
        try {
            getClearFormDataMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void clearHistory() {
        try {
            getClearHistoryMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void clearMatches() {
        try {
            getClearMatchesMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void clearSslPreferences() {
        try {
            getClearSslPreferencesMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void clearView() {
        try {
            getClearViewMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public WebBackForwardList copyBackForwardList() {
        try {
            return (WebBackForwardList) getCopyBackForwardListMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public PrintDocumentAdapter createPrintDocumentAdapter(String str) {
        try {
            return (PrintDocumentAdapter) getCreatePrintDocumentAdapterStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public void destroy() {
        try {
            getDestroyMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            return ((Boolean) getDispatchKeyEventKeyEventMethod().invoke(keyEvent)).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public void documentHasImages(Message message) {
        try {
            getDocumentHasImagesMessageMethod().invoke(message);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        try {
            getEvaluateJavascriptStringValueCallbackStringMethod().invoke(str, valueCallback);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void findAllAsync(String str) {
        try {
            getFindAllAsyncStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void findNext(boolean z) {
        try {
            getFindNextbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void flingScroll(int i, int i2) {
        try {
            getFlingScrollintintMethod().invoke(Integer.valueOf(i), Integer.valueOf(i2));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        try {
            return (AccessibilityNodeProvider) getGetAccessibilityNodeProviderMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public SslCertificate getCertificate() {
        try {
            return (SslCertificate) getGetCertificateMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public int getContentHeight() {
        try {
            return ((Integer) getGetContentHeightMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public ViewGroup getContentView() {
        try {
            return (ViewGroup) getGetContentViewMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public Bitmap getFavicon() {
        try {
            return (Bitmap) getGetFaviconMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public Object getHitTestResultInner() {
        try {
            return getGetHitTestResultInnerMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public boolean getImageBitmapToFile(String str, String str2, String str3, Object obj) {
        try {
            return ((Boolean) getGetImageBitmapToFileStringStringStringObjectMethod().invoke(str, str2, str3, obj)).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public String getOriginalUrl() {
        try {
            return (String) getGetOriginalUrlMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public int getProgress() {
        try {
            return ((Integer) getGetProgressMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public float getScale() {
        try {
            return ((Float) getGetScaleMethod().invoke(new Object[0])).floatValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0.0f;
        }
    }

    public Object getSettingsInner() {
        try {
            return getGetSettingsInnerMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public String getTitle() {
        try {
            return (String) getGetTitleMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public void getTranslateSampleString(int i) {
        try {
            getGetTranslateSampleStringintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public String getUrl() {
        try {
            return (String) getGetUrlMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public void goBack() {
        try {
            getGoBackMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void goBackOrForward(int i) {
        try {
            getGoBackOrForwardintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void goForward() {
        try {
            getGoForwardMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void invokeZoomPicker() {
        try {
            getInvokeZoomPickerMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public boolean isPrivateBrowsingEnabled() {
        try {
            return ((Boolean) getIsPrivateBrowsingEnabledMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public void loadData(String str, String str2, String str3) {
        try {
            getLoadDataStringStringStringMethod().invoke(str, str2, str3);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            getLoadDataWithBaseURLStringStringStringStringStringMethod().invoke(str, str2, str3, str4, str5);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void loadUrl(String str) {
        try {
            getLoadUrlStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public boolean onCheckIsTextEditor() {
        try {
            return ((Boolean) getOnCheckIsTextEditorMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public void onExtendInputKeyboardHeightChanged(boolean z, int i, boolean z2) {
        try {
            getOnExtendInputKeyboardHeightChangedbooleanintbooleanMethod().invoke(Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(z2));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void onExtendTextAreaKeyboardHeightChanged(boolean z, int i, boolean z2) {
        try {
            getOnExtendTextAreaKeyboardHeightChangedbooleanintbooleanMethod().invoke(Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(z2));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void onHide() {
        try {
            getOnHideMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void onPause() {
        try {
            getOnPauseMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void onResume() {
        try {
            getOnResumeMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void onShow() {
        try {
            getOnShowMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return ((Boolean) getOnTouchEventMotionEventMethod().invoke(motionEvent)).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean pageDown(boolean z) {
        try {
            return ((Boolean) getPageDownbooleanMethod().invoke(Boolean.valueOf(z))).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean pageUp(boolean z) {
        try {
            return ((Boolean) getPageUpbooleanMethod().invoke(Boolean.valueOf(z))).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public void pauseTimers() {
        try {
            getPauseTimersMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void postUrl(String str, byte[] bArr) {
        try {
            getPostUrlStringbyteMethod().invoke(str, bArr);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void reload() {
        try {
            getReloadMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void removeDocumentStartJavaScript(int i) {
        try {
            getRemoveDocumentStartJavaScriptintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void removeJavascriptInterface(String str) {
        try {
            getRemoveJavascriptInterfaceStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void replaceTranslatedString(Map<String, String> map) {
        try {
            getReplaceTranslatedStringMapStringStringMethod().invoke(map);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void requestFocusNodeHref(Message message) {
        try {
            getRequestFocusNodeHrefMessageMethod().invoke(message);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void requestImageRef(Message message) {
        try {
            getRequestImageRefMessageMethod().invoke(message);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public WebBackForwardList restoreState(Bundle bundle) {
        try {
            return (WebBackForwardList) getRestoreStateBundleMethod().invoke(bundle);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public void resumeTimers() {
        try {
            getResumeTimersMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public boolean savePage(String str, String str2, int i) {
        try {
            return ((Boolean) getSavePageStringStringintMethod().invoke(str, str2, Integer.valueOf(i))).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public WebBackForwardList saveState(Bundle bundle) {
        try {
            return (WebBackForwardList) getSaveStateBundleMethod().invoke(bundle);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public void saveWebArchive(String str) {
        try {
            getSaveWebArchiveStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setBackgroundColor(int i) {
        try {
            getSetBackgroundColorintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setBottomHeight(int i) {
        try {
            getSetBottomHeightintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            getSetDownloadListenerDownloadListenerMethod().invoke(downloadListener);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setExtendInputClient(Object obj) {
        try {
            getSetExtendInputClientObjectMethod().invoke(obj);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setExtendPluginClient(Object obj) {
        try {
            getSetExtendPluginClientObjectMethod().invoke(obj);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setExtendTextAreaClient(Object obj) {
        try {
            getSetExtendTextAreaClientObjectMethod().invoke(obj);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setFindListener(WebView.FindListener findListener) {
        try {
            getSetFindListenerandroidwebkitWebViewFindListenerMethod().invoke(findListener);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setHorizontalScrollBarEnable(boolean z) {
        try {
            getSetHorizontalScrollBarEnablebooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setInitialScale(int i) {
        try {
            getSetInitialScaleintMethod().invoke(Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            getSetNetworkAvailablebooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        try {
            getSetOnTouchListenerOnTouchListenerMethod().invoke(onTouchListener);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setPluginTextureScale(String str, int i, float f, float f2) {
        try {
            getSetPluginTextureScaleStringintfloatfloatMethod().invoke(str, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setProxyWebViewClientExtension(Object obj) {
        try {
            getSetProxyWebViewClientExtensionObjectMethod().invoke(obj);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setTranslateMode(boolean z) {
        try {
            getSetTranslateModebooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setVerticalScrollBarEnable(boolean z) {
        try {
            getSetVerticalScrollBarEnablebooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setWebChromeClient(Object obj) {
        try {
            getSetWebChromeClientObjectMethod().invoke(obj);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setWebContentsDebuggingEnabled(boolean z) {
        try {
            getSetWebContentsDebuggingEnabledbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setWebContentsSize(int i, int i2) {
        try {
            getSetWebContentsSizeintintMethod().invoke(Integer.valueOf(i), Integer.valueOf(i2));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setWebViewClient(Object obj) {
        try {
            getSetWebViewClientObjectMethod().invoke(obj);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void smoothScroll(int i, int i2, long j) {
        try {
            getSmoothScrollintintlongMethod().invoke(Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void stopLoading() {
        try {
            getStopLoadingMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void takePluginScreenshot(String str, int i) {
        try {
            getTakePluginScreenshotStringintMethod().invoke(str, Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public int view_computeHorizontalScrollOffset() {
        try {
            return ((Integer) getView_computeHorizontalScrollOffsetMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public int view_computeHorizontalScrollRange() {
        try {
            return ((Integer) getView_computeHorizontalScrollRangeMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public int view_computeVerticalScrollExtent() {
        try {
            return ((Integer) getView_computeVerticalScrollExtentMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public int view_computeVerticalScrollOffset() {
        try {
            return ((Integer) getView_computeVerticalScrollOffsetMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public int view_computeVerticalScrollRange() {
        try {
            return ((Integer) getView_computeVerticalScrollRangeMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }

    public void view_scrollBy(int i, int i2) {
        try {
            getView_scrollByintintMethod().invoke(Integer.valueOf(i), Integer.valueOf(i2));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void view_scrollTo(int i, int i2) {
        try {
            getView_scrollTointintMethod().invoke(Integer.valueOf(i), Integer.valueOf(i2));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void zoomBy(float f) {
        try {
            getZoomByfloatMethod().invoke(Float.valueOf(f));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public boolean zoomIn() {
        try {
            return ((Boolean) getZoomInMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean zoomOut() {
        try {
            return ((Boolean) getZoomOutMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public void loadUrl(String str, Map<String, String> map) {
        try {
            getLoadUrlStringMapStringStringMethod().invoke(str, map);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
        try {
            getSaveWebArchiveStringbooleanValueCallbackStringMethod().invoke(str, Boolean.valueOf(z), valueCallback);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }
}
