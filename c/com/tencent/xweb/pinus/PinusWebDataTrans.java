package com.tencent.xweb.pinus;

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
import com.tencent.xweb.pinus.sdk.HttpAuthHandlerInterface;
import com.tencent.xweb.pinus.sdk.JsResultInterface;
import com.tencent.xweb.pinus.sdk.SslErrorHandlerInterface;
import com.tencent.xweb.pinus.sdk.WebResourceErrorInterface;
import com.tencent.xweb.util.XWebLog;
import java.util.Map;

public class PinusWebDataTrans {
    private static final String TAG = "PinusWebDataTrans";

    public static class PsWebFileChooserParamsImpl extends WebChromeClient.FileChooserParams {
        public WebChromeClient.FileChooserParams mParams;

        public PsWebFileChooserParamsImpl(WebChromeClient.FileChooserParams fileChooserParams) {
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

    public static class PsWebHttpAuthHandler implements HttpAuthHandler {
        public HttpAuthHandlerInterface mHandler;

        public PsWebHttpAuthHandler(HttpAuthHandlerInterface httpAuthHandlerInterface) {
            this.mHandler = httpAuthHandlerInterface;
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

    public static class PsWebJsResultImpl extends JsResult {
        public JsResultInterface mJsResult;

        public PsWebJsResultImpl(JsResultInterface jsResultInterface) {
            this.mJsResult = jsResultInterface;
        }

        public void cancel() {
            JsResultInterface jsResultInterface = this.mJsResult;
            if (jsResultInterface != null) {
                jsResultInterface.cancel();
            }
        }

        public void confirm() {
            JsResultInterface jsResultInterface = this.mJsResult;
            if (jsResultInterface != null) {
                jsResultInterface.confirm();
            }
        }
    }

    public static class SslErrorHandlerImp implements SslErrorHandler {
        public SslErrorHandlerInterface mHandler;

        public SslErrorHandlerImp(SslErrorHandlerInterface sslErrorHandlerInterface) {
            this.mHandler = sslErrorHandlerInterface;
        }

        public void cancel() {
            this.mHandler.cancel();
        }

        public void proceed() {
            this.mHandler.proceed();
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

    public static WebResourceError createPSWebResourceError(final WebResourceErrorInterface webResourceErrorInterface) {
        if (webResourceErrorInterface == null) {
            return null;
        }
        return new WebResourceError() {
            public CharSequence getDescription() {
                return WebResourceErrorInterface.this.getDescription();
            }

            public int getErrorCode() {
                return WebResourceErrorInterface.this.getErrorCode();
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
                XWebLog.m21909e(TAG, "create webkit WebResourceResponse error:" + th + ", statusCode:" + webResourceResponse.getStatusCode());
            }
        }
        android.webkit.WebResourceResponse webResourceResponse2 = new android.webkit.WebResourceResponse(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getData());
        if (webResourceResponse.getStatusCode() > 100 && webResourceResponse.getReasonPhrase() != null && !webResourceResponse.getReasonPhrase().isEmpty()) {
            webResourceResponse2.setStatusCodeAndReasonPhrase(webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
        webResourceResponse2.setResponseHeaders(webResourceResponse.getResponseHeaders());
        return webResourceResponse2;
    }

    public static class PsWebJsPromptResultImpl extends JsPromptResult {
        public JsResultInterface mJsResult;

        public PsWebJsPromptResultImpl(JsResultInterface jsResultInterface) {
            this.mJsResult = jsResultInterface;
        }

        public void cancel() {
            JsResultInterface jsResultInterface = this.mJsResult;
            if (jsResultInterface != null) {
                jsResultInterface.cancel();
            }
        }

        public void confirm(String str) {
            JsResultInterface jsResultInterface = this.mJsResult;
            if (jsResultInterface != null) {
                jsResultInterface.confirm(str);
            }
        }

        public void confirm() {
            JsResultInterface jsResultInterface = this.mJsResult;
            if (jsResultInterface != null) {
                jsResultInterface.confirm();
            }
        }
    }
}
