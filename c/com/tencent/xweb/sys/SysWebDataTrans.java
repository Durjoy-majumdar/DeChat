package com.tencent.xweb.sys;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import com.tencent.xweb.HttpAuthHandler;
import com.tencent.xweb.JsPromptResult;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebReqBundleCreator;
import com.tencent.xweb.WebResourceError;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.util.XWebLog;
import java.util.Map;

public class SysWebDataTrans {
    private static final String TAG = "SysWebDataTrans";

    public static class SslErrorHandlerImp implements SslErrorHandler {
        public android.webkit.SslErrorHandler mHandler;

        public SslErrorHandlerImp(android.webkit.SslErrorHandler sslErrorHandler) {
            this.mHandler = sslErrorHandler;
        }

        public void cancel() {
            this.mHandler.cancel();
        }

        public void proceed() {
            this.mHandler.proceed();
        }
    }

    public static class SysHttpAuthHandler implements HttpAuthHandler {
        public android.webkit.HttpAuthHandler mHandler;

        public SysHttpAuthHandler(android.webkit.HttpAuthHandler httpAuthHandler) {
            this.mHandler = httpAuthHandler;
        }

        public void cancel() {
            this.mHandler.cancel();
        }

        public void proceed(String str, String str2) {
            this.mHandler.proceed(str, str2);
        }

        public boolean useHttpAuthUsernamePassword() {
            return this.mHandler.useHttpAuthUsernamePassword();
        }
    }

    public static class SysWebFileChooserParamsImpl extends WebChromeClient.FileChooserParams {
        public WebChromeClient.FileChooserParams mParams;

        public SysWebFileChooserParamsImpl(WebChromeClient.FileChooserParams fileChooserParams) {
            this.mParams = fileChooserParams;
        }

        public Intent createIntent() {
            WebChromeClient.FileChooserParams fileChooserParams = this.mParams;
            if (fileChooserParams != null) {
                return fileChooserParams.createIntent();
            }
            return null;
        }

        public String[] getAcceptTypes() {
            WebChromeClient.FileChooserParams fileChooserParams = this.mParams;
            return fileChooserParams != null ? fileChooserParams.getAcceptTypes() : new String[0];
        }

        public String getFilenameHint() {
            WebChromeClient.FileChooserParams fileChooserParams = this.mParams;
            if (fileChooserParams != null) {
                return fileChooserParams.getFilenameHint();
            }
            return null;
        }

        public int getMode() {
            WebChromeClient.FileChooserParams fileChooserParams = this.mParams;
            if (fileChooserParams != null) {
                return fileChooserParams.getMode();
            }
            return 0;
        }

        public CharSequence getTitle() {
            WebChromeClient.FileChooserParams fileChooserParams = this.mParams;
            if (fileChooserParams != null) {
                return fileChooserParams.getTitle();
            }
            return null;
        }

        public boolean isCaptureEnabled() {
            WebChromeClient.FileChooserParams fileChooserParams = this.mParams;
            if (fileChooserParams != null) {
                return fileChooserParams.isCaptureEnabled();
            }
            return false;
        }
    }

    public static class SysWebJsResultImpl extends JsResult {
        public android.webkit.JsResult mJsResult;

        public SysWebJsResultImpl(android.webkit.JsResult jsResult) {
            this.mJsResult = jsResult;
        }

        public void cancel() {
            android.webkit.JsResult jsResult = this.mJsResult;
            if (jsResult != null) {
                jsResult.cancel();
            }
        }

        public void confirm() {
            android.webkit.JsResult jsResult = this.mJsResult;
            if (jsResult != null) {
                jsResult.confirm();
            }
        }
    }

    public static class WebResourceRequestImpl implements WebResourceRequest {
        private boolean hasUserGesture;
        private boolean isMainFrame;
        private boolean isRedirect;
        private WebReqBundleCreator mBundleCreator;
        private String method;
        private Map<String, String> requestHeaders;
        private Uri url;

        public WebResourceRequestImpl(android.webkit.WebResourceRequest webResourceRequest) {
            int i = Build.VERSION.SDK_INT;
            if (webResourceRequest != null) {
                this.url = webResourceRequest.getUrl();
                this.isMainFrame = webResourceRequest.isForMainFrame();
                this.hasUserGesture = webResourceRequest.hasGesture();
                this.method = webResourceRequest.getMethod();
                if (i >= 24) {
                    this.isRedirect = webResourceRequest.isRedirect();
                }
                this.requestHeaders = webResourceRequest.getRequestHeaders();
                this.mBundleCreator = new WebReqBundleCreator(this);
            }
        }

        public Bundle getBundle() {
            WebReqBundleCreator webReqBundleCreator = this.mBundleCreator;
            if (webReqBundleCreator == null) {
                return null;
            }
            return webReqBundleCreator.getBundle();
        }

        public String getMethod() {
            return this.method;
        }

        public Map<String, String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public Uri getUrl() {
            return this.url;
        }

        public boolean hasGesture() {
            return this.hasUserGesture;
        }

        public boolean isForMainFrame() {
            return this.isMainFrame;
        }

        public boolean isRedirect() {
            return this.isRedirect;
        }
    }

    public static WebResourceError createWCWebResourceError(final android.webkit.WebResourceError webResourceError) {
        if (webResourceError == null) {
            return null;
        }
        return new WebResourceError() {
            public CharSequence getDescription() {
                return webResourceError.getDescription();
            }

            public int getErrorCode() {
                return webResourceError.getErrorCode();
            }
        };
    }

    public static WebResourceResponse createWCWebResponse(android.webkit.WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return null;
        }
        return new WebResourceResponse(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceResponse.getResponseHeaders(), webResourceResponse.getData());
    }

    public static android.webkit.WebResourceResponse createWebKitResponse(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return null;
        }
        if (webResourceResponse.isCreateFromComplexConstruct()) {
            try {
                return new android.webkit.WebResourceResponse(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceResponse.getResponseHeaders(), webResourceResponse.getData());
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "create webkit WebResourceResponse error", th);
            }
        }
        android.webkit.WebResourceResponse webResourceResponse2 = new android.webkit.WebResourceResponse(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getData());
        if (webResourceResponse.getStatusCode() > 100 && webResourceResponse.getReasonPhrase() != null && !webResourceResponse.getReasonPhrase().isEmpty()) {
            webResourceResponse2.setStatusCodeAndReasonPhrase(webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
        webResourceResponse2.setResponseHeaders(webResourceResponse.getResponseHeaders());
        return webResourceResponse2;
    }

    public static class SysWebJsPromptResultImpl extends JsPromptResult {
        public android.webkit.JsPromptResult mJsResult;

        public SysWebJsPromptResultImpl(android.webkit.JsPromptResult jsPromptResult) {
            this.mJsResult = jsPromptResult;
        }

        public void cancel() {
            android.webkit.JsPromptResult jsPromptResult = this.mJsResult;
            if (jsPromptResult != null) {
                jsPromptResult.cancel();
            }
        }

        public void confirm(String str) {
            android.webkit.JsPromptResult jsPromptResult = this.mJsResult;
            if (jsPromptResult != null) {
                jsPromptResult.confirm(str);
            }
        }

        public void confirm() {
            android.webkit.JsPromptResult jsPromptResult = this.mJsResult;
            if (jsPromptResult != null) {
                jsPromptResult.confirm();
            }
        }
    }
}
