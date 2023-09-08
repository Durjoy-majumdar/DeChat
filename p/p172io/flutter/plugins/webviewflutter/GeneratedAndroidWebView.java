package p172io.flutter.plugins.webviewflutter;

import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugin.common.StandardMessageCodec;

/* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView */
public class GeneratedAndroidWebView {

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApi */
    public interface CookieManagerHostApi {

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApi$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: a */
            public static MessageCodec<Object> m23443a() {
                return CookieManagerHostApiCodec.INSTANCE;
            }

            /* renamed from: b */
            public static /* synthetic */ void m23444b(CookieManagerHostApi cookieManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    cookieManagerHostApi.clearCookies(new Result<Boolean>(hashMap, reply) {
                        public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                        public final /* synthetic */ Map val$wrapped;

                        {
                            this.val$wrapped = r1;
                            this.val$reply = r2;
                        }

                        public void error(Throwable th) {
                            this.val$wrapped.put("error", GeneratedAndroidWebView.wrapError(th));
                            this.val$reply.reply(this.val$wrapped);
                        }

                        public void success(Boolean bool) {
                            this.val$wrapped.put("result", bool);
                            this.val$reply.reply(this.val$wrapped);
                        }
                    });
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: c */
            public static /* synthetic */ void m23445c(CookieManagerHostApi cookieManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    String str = (String) arrayList.get(0);
                    if (str != null) {
                        String str2 = (String) arrayList.get(1);
                        if (str2 != null) {
                            cookieManagerHostApi.setCookie(str, str2);
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("valueArg unexpectedly null.");
                    }
                    throw new NullPointerException("urlArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: d */
            public static void m23446d(BinaryMessenger binaryMessenger, CookieManagerHostApi cookieManagerHostApi) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.CookieManagerHostApi.clearCookies", m23443a());
                if (cookieManagerHostApi != null) {
                    basicMessageChannel.setMessageHandler(new GeneratedAndroidWebView$CookieManagerHostApi$$a(cookieManagerHostApi));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.CookieManagerHostApi.setCookie", m23443a());
                if (cookieManagerHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new GeneratedAndroidWebView$CookieManagerHostApi$$b(cookieManagerHostApi));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }
        }

        void clearCookies(Result<Boolean> result);

        void setCookie(String str, String str2);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApiCodec */
    public static class CookieManagerHostApiCodec extends StandardMessageCodec {
        public static final CookieManagerHostApiCodec INSTANCE = new CookieManagerHostApiCodec();

        private CookieManagerHostApiCodec() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$DownloadListenerFlutterApi */
    public static class DownloadListenerFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$DownloadListenerFlutterApi$Reply */
        public interface Reply<T> {
            void reply(T t);
        }

        public DownloadListenerFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        public static MessageCodec<Object> getCodec() {
            return DownloadListenerFlutterApiCodec.INSTANCE;
        }

        public void dispose(Long l, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.DownloadListenerFlutterApi.dispose", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l})), new GeneratedAndroidWebView$DownloadListenerFlutterApi$$b(reply));
        }

        public void onDownloadStart(Long l, String str, String str2, String str3, String str4, Long l2, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.DownloadListenerFlutterApi.onDownloadStart", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l, str, str2, str3, str4, l2})), new GeneratedAndroidWebView$DownloadListenerFlutterApi$$a(reply));
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$DownloadListenerFlutterApiCodec */
    public static class DownloadListenerFlutterApiCodec extends StandardMessageCodec {
        public static final DownloadListenerFlutterApiCodec INSTANCE = new DownloadListenerFlutterApiCodec();

        private DownloadListenerFlutterApiCodec() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$DownloadListenerHostApi */
    public interface DownloadListenerHostApi {
        void create(Long l);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$DownloadListenerHostApiCodec */
    public static class DownloadListenerHostApiCodec extends StandardMessageCodec {
        public static final DownloadListenerHostApiCodec INSTANCE = new DownloadListenerHostApiCodec();

        private DownloadListenerHostApiCodec() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FlutterAssetManagerHostApi */
    public interface FlutterAssetManagerHostApi {
        String getAssetFilePathByName(String str);

        List<String> list(String str);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FlutterAssetManagerHostApiCodec */
    public static class FlutterAssetManagerHostApiCodec extends StandardMessageCodec {
        public static final FlutterAssetManagerHostApiCodec INSTANCE = new FlutterAssetManagerHostApiCodec();

        private FlutterAssetManagerHostApiCodec() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaScriptChannelFlutterApi */
    public static class JavaScriptChannelFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaScriptChannelFlutterApi$Reply */
        public interface Reply<T> {
            void reply(T t);
        }

        public JavaScriptChannelFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        public static MessageCodec<Object> getCodec() {
            return JavaScriptChannelFlutterApiCodec.INSTANCE;
        }

        public void dispose(Long l, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.dispose", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l})), new GeneratedAndroidWebView$JavaScriptChannelFlutterApi$$b(reply));
        }

        public void postMessage(Long l, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.postMessage", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l, str})), new GeneratedAndroidWebView$JavaScriptChannelFlutterApi$$a(reply));
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaScriptChannelFlutterApiCodec */
    public static class JavaScriptChannelFlutterApiCodec extends StandardMessageCodec {
        public static final JavaScriptChannelFlutterApiCodec INSTANCE = new JavaScriptChannelFlutterApiCodec();

        private JavaScriptChannelFlutterApiCodec() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaScriptChannelHostApi */
    public interface JavaScriptChannelHostApi {
        void create(Long l, String str);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaScriptChannelHostApiCodec */
    public static class JavaScriptChannelHostApiCodec extends StandardMessageCodec {
        public static final JavaScriptChannelHostApiCodec INSTANCE = new JavaScriptChannelHostApiCodec();

        private JavaScriptChannelHostApiCodec() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$Result */
    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi */
    public static class WebChromeClientFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply */
        public interface Reply<T> {
            void reply(T t);
        }

        public WebChromeClientFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        public static MessageCodec<Object> getCodec() {
            return WebChromeClientFlutterApiCodec.INSTANCE;
        }

        public void dispose(Long l, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebChromeClientFlutterApi.dispose", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l})), new GeneratedAndroidWebView$WebChromeClientFlutterApi$$a(reply));
        }

        public void onProgressChanged(Long l, Long l2, Long l3, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebChromeClientFlutterApi.onProgressChanged", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l, l2, l3})), new GeneratedAndroidWebView$WebChromeClientFlutterApi$$b(reply));
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApiCodec */
    public static class WebChromeClientFlutterApiCodec extends StandardMessageCodec {
        public static final WebChromeClientFlutterApiCodec INSTANCE = new WebChromeClientFlutterApiCodec();

        private WebChromeClientFlutterApiCodec() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi */
    public interface WebChromeClientHostApi {
        void create(Long l, Long l2);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApiCodec */
    public static class WebChromeClientHostApiCodec extends StandardMessageCodec {
        public static final WebChromeClientHostApiCodec INSTANCE = new WebChromeClientHostApiCodec();

        private WebChromeClientHostApiCodec() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebResourceErrorData */
    public static class WebResourceErrorData {
        private String description;
        private Long errorCode;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebResourceErrorData$Builder */
        public static final class Builder {
            private String description;
            private Long errorCode;

            public WebResourceErrorData build() {
                WebResourceErrorData webResourceErrorData = new WebResourceErrorData();
                webResourceErrorData.setErrorCode(this.errorCode);
                webResourceErrorData.setDescription(this.description);
                return webResourceErrorData;
            }

            public Builder setDescription(String str) {
                this.description = str;
                return this;
            }

            public Builder setErrorCode(Long l) {
                this.errorCode = l;
                return this;
            }
        }

        private WebResourceErrorData() {
        }

        public static WebResourceErrorData fromMap(Map<String, Object> map) {
            Long l;
            WebResourceErrorData webResourceErrorData = new WebResourceErrorData();
            Object obj = map.get(OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
            if (obj == null) {
                l = null;
            } else {
                l = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            webResourceErrorData.setErrorCode(l);
            webResourceErrorData.setDescription((String) map.get("description"));
            return webResourceErrorData;
        }

        public String getDescription() {
            return this.description;
        }

        public Long getErrorCode() {
            return this.errorCode;
        }

        public void setDescription(String str) {
            if (str != null) {
                this.description = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"description\" is null.");
        }

        public void setErrorCode(Long l) {
            if (l != null) {
                this.errorCode = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"errorCode\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, this.errorCode);
            hashMap.put("description", this.description);
            return hashMap;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebResourceRequestData */
    public static class WebResourceRequestData {
        private Boolean hasGesture;
        private Boolean isForMainFrame;
        private Boolean isRedirect;
        private String method;
        private Map<String, String> requestHeaders;
        private String url;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebResourceRequestData$Builder */
        public static final class Builder {
            private Boolean hasGesture;
            private Boolean isForMainFrame;
            private Boolean isRedirect;
            private String method;
            private Map<String, String> requestHeaders;
            private String url;

            public WebResourceRequestData build() {
                WebResourceRequestData webResourceRequestData = new WebResourceRequestData();
                webResourceRequestData.setUrl(this.url);
                webResourceRequestData.setIsForMainFrame(this.isForMainFrame);
                webResourceRequestData.setIsRedirect(this.isRedirect);
                webResourceRequestData.setHasGesture(this.hasGesture);
                webResourceRequestData.setMethod(this.method);
                webResourceRequestData.setRequestHeaders(this.requestHeaders);
                return webResourceRequestData;
            }

            public Builder setHasGesture(Boolean bool) {
                this.hasGesture = bool;
                return this;
            }

            public Builder setIsForMainFrame(Boolean bool) {
                this.isForMainFrame = bool;
                return this;
            }

            public Builder setIsRedirect(Boolean bool) {
                this.isRedirect = bool;
                return this;
            }

            public Builder setMethod(String str) {
                this.method = str;
                return this;
            }

            public Builder setRequestHeaders(Map<String, String> map) {
                this.requestHeaders = map;
                return this;
            }

            public Builder setUrl(String str) {
                this.url = str;
                return this;
            }
        }

        private WebResourceRequestData() {
        }

        public static WebResourceRequestData fromMap(Map<String, Object> map) {
            WebResourceRequestData webResourceRequestData = new WebResourceRequestData();
            webResourceRequestData.setUrl((String) map.get("url"));
            webResourceRequestData.setIsForMainFrame((Boolean) map.get("isForMainFrame"));
            webResourceRequestData.setIsRedirect((Boolean) map.get("isRedirect"));
            webResourceRequestData.setHasGesture((Boolean) map.get("hasGesture"));
            webResourceRequestData.setMethod((String) map.get(FirebaseAnalytics.C113379b.METHOD));
            webResourceRequestData.setRequestHeaders((Map) map.get("requestHeaders"));
            return webResourceRequestData;
        }

        public Boolean getHasGesture() {
            return this.hasGesture;
        }

        public Boolean getIsForMainFrame() {
            return this.isForMainFrame;
        }

        public Boolean getIsRedirect() {
            return this.isRedirect;
        }

        public String getMethod() {
            return this.method;
        }

        public Map<String, String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public String getUrl() {
            return this.url;
        }

        public void setHasGesture(Boolean bool) {
            if (bool != null) {
                this.hasGesture = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"hasGesture\" is null.");
        }

        public void setIsForMainFrame(Boolean bool) {
            if (bool != null) {
                this.isForMainFrame = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isForMainFrame\" is null.");
        }

        public void setIsRedirect(Boolean bool) {
            this.isRedirect = bool;
        }

        public void setMethod(String str) {
            if (str != null) {
                this.method = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"method\" is null.");
        }

        public void setRequestHeaders(Map<String, String> map) {
            if (map != null) {
                this.requestHeaders = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"requestHeaders\" is null.");
        }

        public void setUrl(String str) {
            if (str != null) {
                this.url = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"url\" is null.");
        }

        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.url);
            hashMap.put("isForMainFrame", this.isForMainFrame);
            hashMap.put("isRedirect", this.isRedirect);
            hashMap.put("hasGesture", this.hasGesture);
            hashMap.put(FirebaseAnalytics.C113379b.METHOD, this.method);
            hashMap.put("requestHeaders", this.requestHeaders);
            return hashMap;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApiCodec */
    public static class WebSettingsHostApiCodec extends StandardMessageCodec {
        public static final WebSettingsHostApiCodec INSTANCE = new WebSettingsHostApiCodec();

        private WebSettingsHostApiCodec() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebStorageHostApi */
    public interface WebStorageHostApi {
        void create(Long l);

        void deleteAllData(Long l);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebStorageHostApiCodec */
    public static class WebStorageHostApiCodec extends StandardMessageCodec {
        public static final WebStorageHostApiCodec INSTANCE = new WebStorageHostApiCodec();

        private WebStorageHostApiCodec() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi */
    public static class WebViewClientFlutterApi {
        private final BinaryMessenger binaryMessenger;

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$Reply */
        public interface Reply<T> {
            void reply(T t);
        }

        public WebViewClientFlutterApi(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        public static MessageCodec<Object> getCodec() {
            return WebViewClientFlutterApiCodec.INSTANCE;
        }

        public void dispose(Long l, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.dispose", getCodec()).send(new ArrayList(Arrays.asList(new Long[]{l})), new GeneratedAndroidWebView$WebViewClientFlutterApi$$d(reply));
        }

        public void onPageFinished(Long l, Long l2, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.onPageFinished", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l, l2, str})), new GeneratedAndroidWebView$WebViewClientFlutterApi$$f(reply));
        }

        public void onPageStarted(Long l, Long l2, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.onPageStarted", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l, l2, str})), new GeneratedAndroidWebView$WebViewClientFlutterApi$$c(reply));
        }

        public void onReceivedError(Long l, Long l2, Long l3, String str, String str2, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.onReceivedError", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l, l2, l3, str, str2})), new GeneratedAndroidWebView$WebViewClientFlutterApi$$g(reply));
        }

        public void onReceivedRequestError(Long l, Long l2, WebResourceRequestData webResourceRequestData, WebResourceErrorData webResourceErrorData, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.onReceivedRequestError", getCodec()).send(new ArrayList(Arrays.asList(new Object[]{l, l2, webResourceRequestData, webResourceErrorData})), new GeneratedAndroidWebView$WebViewClientFlutterApi$$a(reply));
        }

        public void requestLoading(Long l, Long l2, WebResourceRequestData webResourceRequestData, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.requestLoading", getCodec()).send(new ArrayList(Arrays.asList(new Object[]{l, l2, webResourceRequestData})), new GeneratedAndroidWebView$WebViewClientFlutterApi$$b(reply));
        }

        public void urlLoading(Long l, Long l2, String str, Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.WebViewClientFlutterApi.urlLoading", getCodec()).send(new ArrayList(Arrays.asList(new Serializable[]{l, l2, str})), new GeneratedAndroidWebView$WebViewClientFlutterApi$$e(reply));
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApiCodec */
    public static class WebViewClientFlutterApiCodec extends StandardMessageCodec {
        public static final WebViewClientFlutterApiCodec INSTANCE = new WebViewClientFlutterApiCodec();

        private WebViewClientFlutterApiCodec() {
        }

        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? b != -127 ? super.readValueOfType(b, byteBuffer) : WebResourceRequestData.fromMap((Map) readValue(byteBuffer)) : WebResourceErrorData.fromMap((Map) readValue(byteBuffer));
        }

        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof WebResourceErrorData) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((WebResourceErrorData) obj).toMap());
            } else if (obj instanceof WebResourceRequestData) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((WebResourceRequestData) obj).toMap());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientHostApi */
    public interface WebViewClientHostApi {
        void create(Long l, Boolean bool);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientHostApiCodec */
    public static class WebViewClientHostApiCodec extends StandardMessageCodec {
        public static final WebViewClientHostApiCodec INSTANCE = new WebViewClientHostApiCodec();

        private WebViewClientHostApiCodec() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApiCodec */
    public static class WebViewHostApiCodec extends StandardMessageCodec {
        public static final WebViewHostApiCodec INSTANCE = new WebViewHostApiCodec();

        private WebViewHostApiCodec() {
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi */
    public interface WebSettingsHostApi {
        void create(Long l, Long l2);

        void dispose(Long l);

        void setAllowFileAccess(Long l, Boolean bool);

        void setBuiltInZoomControls(Long l, Boolean bool);

        void setDisplayZoomControls(Long l, Boolean bool);

        void setDomStorageEnabled(Long l, Boolean bool);

        void setJavaScriptCanOpenWindowsAutomatically(Long l, Boolean bool);

        void setJavaScriptEnabled(Long l, Boolean bool);

        void setLoadWithOverviewMode(Long l, Boolean bool);

        void setMediaPlaybackRequiresUserGesture(Long l, Boolean bool);

        void setSupportMultipleWindows(Long l, Boolean bool);

        void setSupportZoom(Long l, Boolean bool);

        void setUseWideViewPort(Long l, Boolean bool);

        void setUserAgentString(Long l, String str);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi */
    public interface WebViewHostApi {

        /* renamed from: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: A */
            public static /* synthetic */ void m23460A(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        webViewHostApi.goBack(Long.valueOf(number.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: B */
            public static void m23461B(BinaryMessenger binaryMessenger, WebViewHostApi webViewHostApi) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.create", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$a(webViewHostApi));
                } else {
                    basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.dispose", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$c(webViewHostApi));
                } else {
                    basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.loadData", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$j(webViewHostApi));
                } else {
                    basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.loadDataWithBaseUrl", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel4.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$k(webViewHostApi));
                } else {
                    basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.loadUrl", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel5.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$m(webViewHostApi));
                } else {
                    basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.postUrl", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel6.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$n(webViewHostApi));
                } else {
                    basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getUrl", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel7.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$o(webViewHostApi));
                } else {
                    basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.canGoBack", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel8.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$p(webViewHostApi));
                } else {
                    basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.canGoForward", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel9.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$q(webViewHostApi));
                } else {
                    basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.goBack", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel10.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$r(webViewHostApi));
                } else {
                    basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.goForward", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel11.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$l(webViewHostApi));
                } else {
                    basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.reload", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel12.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$s(webViewHostApi));
                } else {
                    basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.clearCache", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel13.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$t(webViewHostApi));
                } else {
                    basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.evaluateJavascript", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel14.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$u(webViewHostApi));
                } else {
                    basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getTitle", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel15.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$v(webViewHostApi));
                } else {
                    basicMessageChannel15.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.scrollTo", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel16.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$w(webViewHostApi));
                } else {
                    basicMessageChannel16.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.scrollBy", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel17.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$x(webViewHostApi));
                } else {
                    basicMessageChannel17.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getScrollX", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel18.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$y(webViewHostApi));
                } else {
                    basicMessageChannel18.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getScrollY", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel19.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$z(webViewHostApi));
                } else {
                    basicMessageChannel19.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setWebContentsDebuggingEnabled", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel20.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$b(webViewHostApi));
                } else {
                    basicMessageChannel20.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setWebViewClient", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel21.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$d(webViewHostApi));
                } else {
                    basicMessageChannel21.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.addJavaScriptChannel", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel22.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$e(webViewHostApi));
                } else {
                    basicMessageChannel22.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.removeJavaScriptChannel", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel23.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$f(webViewHostApi));
                } else {
                    basicMessageChannel23.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel24 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setDownloadListener", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel24.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$g(webViewHostApi));
                } else {
                    basicMessageChannel24.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel25 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setWebChromeClient", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel25.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$h(webViewHostApi));
                } else {
                    basicMessageChannel25.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
                BasicMessageChannel basicMessageChannel26 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setBackgroundColor", m23462a());
                if (webViewHostApi != null) {
                    basicMessageChannel26.setMessageHandler(new GeneratedAndroidWebView$WebViewHostApi$$i(webViewHostApi));
                } else {
                    basicMessageChannel26.setMessageHandler((BasicMessageChannel.MessageHandler) null);
                }
            }

            /* renamed from: a */
            public static MessageCodec<Object> m23462a() {
                return WebViewHostApiCodec.INSTANCE;
            }

            /* renamed from: b */
            public static /* synthetic */ void m23463b(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Boolean bool = (Boolean) arrayList.get(1);
                        if (bool != null) {
                            webViewHostApi.create(Long.valueOf(number.longValue()), bool);
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("useHybridCompositionArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: c */
            public static /* synthetic */ void m23464c(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        webViewHostApi.dispose(Long.valueOf(number.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: d */
            public static /* synthetic */ void m23465d(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        webViewHostApi.goForward(Long.valueOf(number.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: e */
            public static /* synthetic */ void m23466e(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        webViewHostApi.reload(Long.valueOf(number.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: f */
            public static /* synthetic */ void m23467f(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Boolean bool = (Boolean) arrayList.get(1);
                        if (bool != null) {
                            webViewHostApi.clearCache(Long.valueOf(number.longValue()), bool);
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("includeDiskFilesArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: g */
            public static /* synthetic */ void m23468g(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        String str = (String) arrayList.get(1);
                        if (str != null) {
                            webViewHostApi.evaluateJavascript(Long.valueOf(number.longValue()), str, new Result<String>(hashMap, reply) {
                                public final /* synthetic */ BasicMessageChannel.Reply val$reply;
                                public final /* synthetic */ Map val$wrapped;

                                {
                                    this.val$wrapped = r1;
                                    this.val$reply = r2;
                                }

                                public void error(Throwable th) {
                                    this.val$wrapped.put("error", GeneratedAndroidWebView.wrapError(th));
                                    this.val$reply.reply(this.val$wrapped);
                                }

                                public void success(String str) {
                                    this.val$wrapped.put("result", str);
                                    this.val$reply.reply(this.val$wrapped);
                                }
                            });
                            return;
                        }
                        throw new NullPointerException("javascriptStringArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                    reply.reply(hashMap);
                }
            }

            /* renamed from: h */
            public static /* synthetic */ void m23469h(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        hashMap.put("result", webViewHostApi.getTitle(Long.valueOf(number.longValue())));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: i */
            public static /* synthetic */ void m23470i(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Number number2 = (Number) arrayList.get(1);
                        if (number2 != null) {
                            Number number3 = (Number) arrayList.get(2);
                            if (number3 != null) {
                                webViewHostApi.scrollTo(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()), Long.valueOf(number3.longValue()));
                                hashMap.put("result", (Object) null);
                                reply.reply(hashMap);
                                return;
                            }
                            throw new NullPointerException("yArg unexpectedly null.");
                        }
                        throw new NullPointerException("xArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: j */
            public static /* synthetic */ void m23471j(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Number number2 = (Number) arrayList.get(1);
                        if (number2 != null) {
                            Number number3 = (Number) arrayList.get(2);
                            if (number3 != null) {
                                webViewHostApi.scrollBy(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()), Long.valueOf(number3.longValue()));
                                hashMap.put("result", (Object) null);
                                reply.reply(hashMap);
                                return;
                            }
                            throw new NullPointerException("yArg unexpectedly null.");
                        }
                        throw new NullPointerException("xArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: k */
            public static /* synthetic */ void m23472k(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        hashMap.put("result", webViewHostApi.getScrollX(Long.valueOf(number.longValue())));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: l */
            public static /* synthetic */ void m23473l(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        hashMap.put("result", webViewHostApi.getScrollY(Long.valueOf(number.longValue())));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: m */
            public static /* synthetic */ void m23474m(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Boolean bool = (Boolean) ((ArrayList) obj).get(0);
                    if (bool != null) {
                        webViewHostApi.setWebContentsDebuggingEnabled(bool);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("enabledArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: n */
            public static /* synthetic */ void m23475n(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        String str = (String) arrayList.get(1);
                        if (str != null) {
                            webViewHostApi.loadData(Long.valueOf(number.longValue()), str, (String) arrayList.get(2), (String) arrayList.get(3));
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("dataArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: o */
            public static /* synthetic */ void m23476o(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Number number2 = (Number) arrayList.get(1);
                        if (number2 != null) {
                            webViewHostApi.setWebViewClient(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("webViewClientInstanceIdArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: p */
            public static /* synthetic */ void m23477p(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Number number2 = (Number) arrayList.get(1);
                        if (number2 != null) {
                            webViewHostApi.addJavaScriptChannel(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("javaScriptChannelInstanceIdArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: q */
            public static /* synthetic */ void m23478q(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Number number2 = (Number) arrayList.get(1);
                        if (number2 != null) {
                            webViewHostApi.removeJavaScriptChannel(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("javaScriptChannelInstanceIdArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: r */
            public static /* synthetic */ void m23479r(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Number number2 = (Number) arrayList.get(1);
                        webViewHostApi.setDownloadListener(Long.valueOf(number.longValue()), number2 == null ? null : Long.valueOf(number2.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: s */
            public static /* synthetic */ void m23480s(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Number number2 = (Number) arrayList.get(1);
                        webViewHostApi.setWebChromeClient(Long.valueOf(number.longValue()), number2 == null ? null : Long.valueOf(number2.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: t */
            public static /* synthetic */ void m23481t(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        Number number2 = (Number) arrayList.get(1);
                        if (number2 != null) {
                            webViewHostApi.setBackgroundColor(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("colorArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: u */
            public static /* synthetic */ void m23482u(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        String str = (String) arrayList.get(1);
                        String str2 = (String) arrayList.get(2);
                        if (str2 != null) {
                            WebViewHostApi webViewHostApi2 = webViewHostApi;
                            webViewHostApi2.loadDataWithBaseUrl(Long.valueOf(number.longValue()), str, str2, (String) arrayList.get(3), (String) arrayList.get(4), (String) arrayList.get(5));
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("dataArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: v */
            public static /* synthetic */ void m23483v(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        String str = (String) arrayList.get(1);
                        if (str != null) {
                            Map map = (Map) arrayList.get(2);
                            if (map != null) {
                                webViewHostApi.loadUrl(Long.valueOf(number.longValue()), str, map);
                                hashMap.put("result", (Object) null);
                                reply.reply(hashMap);
                                return;
                            }
                            throw new NullPointerException("headersArg unexpectedly null.");
                        }
                        throw new NullPointerException("urlArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: w */
            public static /* synthetic */ void m23484w(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    Number number = (Number) arrayList.get(0);
                    if (number != null) {
                        String str = (String) arrayList.get(1);
                        if (str != null) {
                            byte[] bArr = (byte[]) arrayList.get(2);
                            if (bArr != null) {
                                webViewHostApi.postUrl(Long.valueOf(number.longValue()), str, bArr);
                                hashMap.put("result", (Object) null);
                                reply.reply(hashMap);
                                return;
                            }
                            throw new NullPointerException("dataArg unexpectedly null.");
                        }
                        throw new NullPointerException("urlArg unexpectedly null.");
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: x */
            public static /* synthetic */ void m23485x(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        hashMap.put("result", webViewHostApi.getUrl(Long.valueOf(number.longValue())));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: y */
            public static /* synthetic */ void m23486y(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        hashMap.put("result", webViewHostApi.canGoBack(Long.valueOf(number.longValue())));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }

            /* renamed from: z */
            public static /* synthetic */ void m23487z(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
                HashMap hashMap = new HashMap();
                try {
                    Number number = (Number) ((ArrayList) obj).get(0);
                    if (number != null) {
                        hashMap.put("result", webViewHostApi.canGoForward(Long.valueOf(number.longValue())));
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("instanceIdArg unexpectedly null.");
                } catch (Error | RuntimeException e) {
                    hashMap.put("error", GeneratedAndroidWebView.wrapError(e));
                }
            }
        }

        void addJavaScriptChannel(Long l, Long l2);

        Boolean canGoBack(Long l);

        Boolean canGoForward(Long l);

        void clearCache(Long l, Boolean bool);

        void create(Long l, Boolean bool);

        void dispose(Long l);

        void evaluateJavascript(Long l, String str, Result<String> result);

        Long getScrollX(Long l);

        Long getScrollY(Long l);

        String getTitle(Long l);

        String getUrl(Long l);

        void goBack(Long l);

        void goForward(Long l);

        void loadData(Long l, String str, String str2, String str3);

        void loadDataWithBaseUrl(Long l, String str, String str2, String str3, String str4, String str5);

        void loadUrl(Long l, String str, Map<String, String> map);

        void postUrl(Long l, String str, byte[] bArr);

        void reload(Long l);

        void removeJavaScriptChannel(Long l, Long l2);

        void scrollBy(Long l, Long l2, Long l3);

        void scrollTo(Long l, Long l2, Long l3);

        void setBackgroundColor(Long l, Long l2);

        void setDownloadListener(Long l, Long l2);

        void setWebChromeClient(Long l, Long l2);

        void setWebContentsDebuggingEnabled(Boolean bool);

        void setWebViewClient(Long l, Long l2);
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> wrapError(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put(StateEvent.Name.MESSAGE, th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
