package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui;

import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.os.RemoteException;
import android.webkit.JavascriptInterface;
import androidx.camera.core.FocusMeteringAction;
import ay0.C28157b;
import ay0.C39647a;
import ay0.C39648c;
import ay0.C39649d;
import ay0.C39650e;
import ay0.C39651f;
import ay0.C39652g;
import ay0.C39654i;
import ay0.C39655j;
import ay0.C39656k;
import ba3.C39750a;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40715i0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40744p;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40752u;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.core.C43504a0;
import com.tencent.p014mm.plugin.webview.core.C43505b0;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMFileSlotManager;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.p014mm.vfs.C45112n1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebScript;
import d93.C45298c;
import di3.C86312j;
import e00.C45520t;
import ea3.C45590f;
import ea3.C45604u;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import g93.C32355a;
import gy3.C24560g0;
import gy3.C24565l;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j40.C46396a;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import jp3.C9486a;
import jp3.C9487b;
import kg3.C76577a;
import kotlin.Metadata;
import o40.C61926c;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import t83.C13851h1;
import t83.C48583f1;
import t83.C48590l;
import t83.l$$m0;
import te3.C52018xt1;
import te3.C52115yg3;
import te3.ah4;
import wx3.C15601d;
import wx3.C66212f;
import xx0.C53458b;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController */
public final class MpWebViewController extends C43522y {

    /* renamed from: a2 */
    public static final C40760c f109580a2 = new C40760c((C8480h) null);

    /* renamed from: F1 */
    public final ah4 f109581F1;

    /* renamed from: G1 */
    public final C13601g f109582G1 = C36568h.m40985a(new C29779d(this));

    /* renamed from: H1 */
    public final C40752u f109583H1;

    /* renamed from: I1 */
    public long f109584I1;

    /* renamed from: J1 */
    public long f109585J1;

    /* renamed from: K1 */
    public long f109586K1;

    /* renamed from: L1 */
    public boolean f109587L1;

    /* renamed from: M1 */
    public boolean f109588M1;

    /* renamed from: N1 */
    public final long f109589N1;

    /* renamed from: O1 */
    public final C13601g f109590O1;

    /* renamed from: P1 */
    public String f109591P1;

    /* renamed from: Q1 */
    public String f109592Q1;

    /* renamed from: R1 */
    public boolean f109593R1;

    /* renamed from: S1 */
    public final String f109594S1;

    /* renamed from: T1 */
    public final List<BaseWebViewController.C30570e> f109595T1;

    /* renamed from: U1 */
    public final String f109596U1;

    /* renamed from: V1 */
    public boolean f109597V1;

    /* renamed from: W1 */
    public final HashSet<String> f109598W1;

    /* renamed from: X1 */
    public boolean f109599X1;

    /* renamed from: Y1 */
    public boolean f109600Y1;

    /* renamed from: Z1 */
    public final Runnable f109601Z1;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$a */
    public static final class C29777a extends C87413o implements C32226l<String, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ MpWebViewController f80786d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29777a(MpWebViewController mpWebViewController) {
            super(1);
            this.f80786d = mpWebViewController;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            MpWebViewController mpWebViewController = this.f80786d;
            if (str == null) {
                str = "";
            }
            return Boolean.valueOf(mpWebViewController.mo63678d1(str));
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$b */
    public static final class C29778b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ MpWebViewController f80787d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29778b(MpWebViewController mpWebViewController) {
            super(0);
            this.f80787d = mpWebViewController;
        }

        public Object invoke() {
            return this.f80787d.getCurrentUrl();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$d */
    public static final class C29779d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ MpWebViewController f80788d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29779d(MpWebViewController mpWebViewController) {
            super(0);
            this.f80788d = mpWebViewController;
        }

        public Object invoke() {
            return "MicroMsg.MpWebViewController:" + this.f80788d.mo67719g();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$g */
    public static final class C29780g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MpWebViewController f80789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29780g(MpWebViewController mpWebViewController) {
            super(0);
            this.f80789d = mpWebViewController;
        }

        public Object invoke() {
            C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C29781a(this.f80789d, (C15601d<? super C29781a>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/MpWebViewController$ForceUrl;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ControllerAction;", "()V", "verify", "", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$ForceUrl */
    public static final class ForceUrl extends BaseWebViewController.ControllerAction {
        public boolean verify() {
            BaseWebViewController controller = getController();
            C87412m.m108592e(controller, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
            return (waitFor(-103) || waitFor((int) ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS) || waitFor((int) ExportErrorStatus.END_WRITE_AUDIO_SAMPLE)) && waitFor(((MpWebViewController) controller).f117558c0);
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/MpWebViewController$NotifyAuth;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ControllerAction;", "()V", "verify", "", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$NotifyAuth */
    public static final class NotifyAuth extends BaseWebViewController.ControllerAction {
        public boolean verify() {
            BaseWebViewController controller = getController();
            C87412m.m108592e(controller, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
            return waitFor(-102) && ((waitFor(((MpWebViewController) controller).f117556b0) && waitFor((int) ExportErrorStatus.WRITE_VIDEO_SAMPLE)) || waitFor((int) ExportErrorStatus.WRITE_AUDIO_SAMPLE));
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/MpWebViewController$PreloadNext;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ControllerAction;", "()V", "verify", "", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$PreloadNext */
    public static final class PreloadNext extends BaseWebViewController.ControllerAction {
        public boolean verify() {
            BaseWebViewController controller = getController();
            C87412m.m108592e(controller, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
            MpWebViewController mpWebViewController = (MpWebViewController) controller;
            return waitFor((int) ExportErrorStatus.ENCODER_NOT_READY_TIME_OUT);
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/MpWebViewController$StartPreload;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ControllerAction;", "()V", "verify", "", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$StartPreload */
    public static final class StartPreload extends BaseWebViewController.ControllerAction {
        public boolean verify() {
            BaseWebViewController controller = getController();
            C87412m.m108592e(controller, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
            return waitFor(((MpWebViewController) controller).f117558c0);
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/MpWebViewController$UpdateData;", "Lcom/tencent/mm/plugin/webview/core/BaseWebViewController$ControllerAction;", "()V", "verify", "", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$UpdateData */
    public static final class UpdateData extends BaseWebViewController.ControllerAction {
        public boolean verify() {
            BaseWebViewController controller = getController();
            C87412m.m108592e(controller, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
            MpWebViewController mpWebViewController = (MpWebViewController) controller;
            return waitFor(-102) && waitFor((int) ExportErrorStatus.APPEND_VIDEO_SAMPLE_MAKE_CURRENT);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$c */
    public static final class C40760c {
        public C40760c(C8480h hVar) {
        }

        /* renamed from: a */
        public static final WebResourceResponse m44062a(C40760c cVar, WebView webView, String str) {
            WebResourceResponse webResourceResponse;
            InputStream inputStream;
            cVar.getClass();
            String str2 = null;
            if (!C86013q1.m106450k(str)) {
                Log.m105920e("MicroMsg.WebViewController", "tmpl file not found:" + str);
                return null;
            }
            String mimeTypeByFilePath = MimeTypeUtil.getMimeTypeByFilePath(str);
            if (!C112551y.m153808h(str, ".js", false, 2, (Object) null) || !C48583f1.m53973d(webView)) {
                try {
                    inputStream = C86013q1.m106423E(str);
                } catch (FileNotFoundException e) {
                    Log.printErrStackTrace("MicroMsg.WebViewController", e, "", new Object[0]);
                    inputStream = null;
                }
                if (inputStream == null) {
                    Log.m105920e("MicroMsg.WebViewController", "stream is null, err");
                    return null;
                }
                webResourceResponse = new WebResourceResponse(mimeTypeByFilePath, "UTF-8", inputStream);
            } else {
                XWebScript xWebScript = new XWebScript(3, 256, webView);
                xWebScript.setJsSrcAsPath(str);
                str2 = xWebScript.toString();
                Charset charset = StandardCharsets.UTF_8;
                C87412m.m108593f(charset, "UTF_8");
                byte[] bytes = str2.getBytes(charset);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                webResourceResponse = new WebResourceResponse(mimeTypeByFilePath, "UTF-8", new ByteArrayInputStream(bytes));
            }
            HashMap hashMap = new HashMap();
            String hexString = Integer.toHexString(str.hashCode() & -1);
            C87412m.m108593f(hexString, "toHexString(fileName.hashCode() and (-1).ushr(32))");
            String lowerCase = hexString.toLowerCase();
            C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
            hashMap.put("Cache-Control", "max-age=31536000");
            hashMap.put("ETag", lowerCase);
            if (str2 != null) {
                hashMap.put("RunLocalJS", str2);
            }
            webResourceResponse.setResponseHeaders(hashMap);
            Log.m105925i("MicroMsg.WebViewController", "readFileWebResp:%s\nETag:%s", str, lowerCase);
            return webResourceResponse;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$e */
    public static final class C40761e extends C43505b0 {

        /* renamed from: c */
        public final ah4 f109602c;

        /* renamed from: d */
        public final MMWebView f109603d;

        /* renamed from: e */
        public final C43504a0 f109604e = new C40762a();

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$e$a */
        public static final class C40762a extends C43504a0 {
            /* renamed from: r */
            public void mo63690r(C45604u uVar) {
                C87412m.m108594g(uVar, "performanceHelper");
                uVar.f123342i = true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$e$b */
        public static final class C40763b {

            /* renamed from: a */
            public final String f109605a;

            /* renamed from: b */
            public final boolean f109606b;

            public C40763b(String str, boolean z) {
                C87412m.m108594g(str, "path");
                this.f109605a = str;
                this.f109606b = z;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C40763b)) {
                    return false;
                }
                C40763b bVar = (C40763b) obj;
                return C87412m.m108589b(this.f109605a, bVar.f109605a) && this.f109606b == bVar.f109606b;
            }

            public int hashCode() {
                int hashCode = this.f109605a.hashCode() * 31;
                boolean z = this.f109606b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            public String toString() {
                return "InterceptInfo(path=" + this.f109605a + ", isZip=" + this.f109606b + ')';
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$e$c */
        public static final class C40764c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C43558z f109607d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C40764c(C43558z zVar) {
                super(0);
                this.f109607d = zVar;
            }

            public Object invoke() {
                this.f109607d.mo67858n();
                return C13598b0.f38549a;
            }
        }

        public C40761e(ah4 ah4, MMWebView mMWebView) {
            C87412m.m108594g(ah4, "tmplParams");
            C87412m.m108594g(mMWebView, "viewWV");
            this.f109602c = ah4;
            this.f109603d = mMWebView;
        }

        /* renamed from: d */
        public C43558z mo63687d() {
            return this.f109604e;
        }

        /* renamed from: f */
        public WebResourceResponse mo62378f(WebView webView, WebResourceRequest webResourceRequest) {
            C40763b bVar;
            C87412m.m108594g(webView, "webview");
            C87412m.m108594g(webResourceRequest, "request");
            String uri = webResourceRequest.getUrl().toString();
            C87412m.m108593f(uri, "request.url.toString()");
            if (!C87412m.m108589b(uri, this.f109602c.f130538f)) {
                String str = C53458b.f150360c;
                C87412m.m108593f(str, "PREFIX");
                if (!C112551y.m153819s(uri, str, false)) {
                    Log.m105918d("MicroMsg.WebViewController", "WebView-Trace intercept return");
                    return null;
                }
            }
            Log.m105925i("MicroMsg.WebViewController", "getResourceResponse, requrl:%s, url:%s", uri, this.f109602c.f130539g);
            if (webResourceRequest.isForMainFrame()) {
                String str2 = this.f109602c.f130539g;
                C87412m.m108593f(str2, "tmplParams.initFilePath");
                bVar = new C40763b(str2, false);
            } else {
                String str3 = C53458b.f150359b;
                C87412m.m108593f(str3, "HARDCODE_URL");
                if (C112551y.m153819s(uri, str3, false)) {
                    ah4 ah4 = this.f109602c;
                    int i = ah4.f130536d;
                    String str4 = ah4.f130541i;
                    C87412m.m108593f(str4, "tmplParams.uid");
                    C87412m.m108593f(str3, "HARDCODE_URL");
                    Pattern compile = Pattern.compile(str3);
                    C87412m.m108593f(compile, "compile(pattern)");
                    String replaceFirst = compile.matcher(uri).replaceFirst("");
                    C87412m.m108593f(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
                    bVar = new C40763b(C40715i0.m43972b(i, str4, replaceFirst), true);
                } else {
                    String str5 = C53458b.f150360c;
                    C87412m.m108593f(str5, "PREFIX");
                    if (C112551y.m153819s(uri, str5, false)) {
                        ah4 ah42 = this.f109602c;
                        int i2 = ah42.f130536d;
                        String str6 = ah42.f130541i;
                        C87412m.m108593f(str6, "tmplParams.uid");
                        C87412m.m108593f(str5, "PREFIX");
                        Pattern compile2 = Pattern.compile(str5);
                        C87412m.m108593f(compile2, "compile(pattern)");
                        String replaceFirst2 = compile2.matcher(uri).replaceFirst("");
                        C87412m.m108593f(replaceFirst2, "nativePattern.matcher(in…replaceFirst(replacement)");
                        bVar = new C40763b(C40715i0.m43972b(i2, str6, replaceFirst2), true);
                    } else {
                        bVar = null;
                    }
                }
            }
            if (bVar != null) {
                Log.m105926v("MicroMsg.WebViewController", "response path: " + bVar.f109605a);
                WebResourceResponse a = C40760c.m44062a(MpWebViewController.f109580a2, this.f109603d, bVar.f109605a);
                if (a != null) {
                    Log.m105924i("MicroMsg.WebViewController", "return intercepted success");
                    return a;
                }
                Log.m105920e("MicroMsg.WebViewController", "return intercepted null");
                C32355a.m39690b(this.f109602c.f130544o, 126, 1, true);
                if (bVar.f109606b) {
                    C32355a.m39690b(this.f109602c.f130544o, 233, 1, true);
                }
            }
            return null;
        }

        /* renamed from: m */
        public boolean mo63688m(String str) {
            C87412m.m108594g(str, "url");
            BaseWebViewController c = mo67777c();
            MpWebViewController mpWebViewController = c instanceof MpWebViewController ? (MpWebViewController) c : null;
            if (mpWebViewController == null) {
                return false;
            }
            if (!mpWebViewController.mo67748s0(mpWebViewController.f117558c0) || !C87412m.m108589b(C40714i.m43962k(str), C40714i.m43962k(mpWebViewController.mo63683n0()))) {
                if (!mpWebViewController.mo67748s0(ExportErrorStatus.WRITE_VIDEO_SAMPLE)) {
                    return false;
                }
                String k = C40714i.m43962k(str);
                String str2 = mpWebViewController.f109591P1;
                if (str2 == null) {
                    C87412m.m108603p("fullUrl");
                    throw null;
                } else if (!C87412m.m108589b(k, C40714i.m43962k(str2))) {
                    return false;
                }
            }
            if (!mo67777c().mo67692R()) {
                return false;
            }
            for (C43558z cVar : mpWebViewController.f117547U) {
                C61926c.m72668M(new C40764c(cVar));
            }
            mpWebViewController.f117549W = true;
            mpWebViewController.mo67706Z0(mpWebViewController.mo63666D1(str), true, 8);
            return true;
        }

        /* renamed from: q */
        public C43505b0.C43506a mo62381q(WebView webView, WebResourceRequest webResourceRequest) {
            C87412m.m108594g(webView, "webView");
            C87412m.m108594g(webResourceRequest, "request");
            BaseWebViewController c = mo67777c();
            MpWebViewController mpWebViewController = c instanceof MpWebViewController ? (MpWebViewController) c : null;
            if (!(mpWebViewController == null || !webResourceRequest.isForMainFrame() || webResourceRequest.getUrl() == null)) {
                Log.m105924i(mpWebViewController.mo63662A1(), "edw opt, shouldOverride url isForMainFrame");
                String uri = webResourceRequest.getUrl().toString();
                C87412m.m108593f(uri, "request.url.toString()");
                String str = C32355a.f85865a;
                C87412m.m108593f(str, "HARDCODE_URL");
                if (!C112551y.m153819s(uri, str, false) && mo67777c().mo67692R()) {
                    Log.m105924i(mpWebViewController.mo63662A1(), "edw opt, shouldOverride url exitTmpl");
                    mpWebViewController.mo63668G1();
                    mpWebViewController.f117549W = true;
                }
            }
            return super.mo62381q(webView, webResourceRequest);
        }

        /* renamed from: s */
        public boolean mo63689s(int i, boolean z, String str, String str2) {
            C87412m.m108594g(str, "reqUrl");
            C87412m.m108594g(str2, "fullUrl");
            if (i == 0 && C45590f.m50653m(str2) && C87412m.m108589b(C40714i.m43962k(str), C40714i.m43962k(str2))) {
                return true;
            }
            super.mo63689s(i, z, str, str2);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$f */
    public /* synthetic */ class C40765f extends C24565l implements C32224a<C13598b0> {
        public C40765f(Object obj) {
            super(0, obj, MpWebViewController.class, "updateData", "updateData()V", 0);
        }

        public Object invoke() {
            int i;
            MpWebViewController mpWebViewController = (MpWebViewController) this.receiver;
            mpWebViewController.getClass();
            long now = MMSlotKt.now();
            mpWebViewController.f117543Q.mo73829a("onInjectStart", now);
            String A1 = mpWebViewController.mo63662A1();
            StringBuilder sb = new StringBuilder();
            sb.append("[updateData]data contentId:");
            String str = mpWebViewController.f109592Q1;
            if (str != null) {
                sb.append(str);
                sb.append(" startLoadPage:");
                sb.append(mpWebViewController.f109584I1);
                sb.append(" receivePageData:");
                sb.append(mpWebViewController.f109586K1);
                Log.m105924i(A1, sb.toString());
                JSONObject put = new JSONObject().put("data", "@param").put(AppMeasurement.Param.TIMESTAMP, new JSONObject().put("startLoadPage", mpWebViewController.f109584I1).put("receivePageData", mpWebViewController.f109586K1)).put("url", mpWebViewController.mo63683n0()).put("key", mpWebViewController.f117553a.getRandomStr());
                C39750a aVar = C39750a.f106644a;
                String str2 = "";
                if (aVar.mo62385a()) {
                    Log.m105924i("MicroMsg.MPVideoPreviewDataMgr", "getOnReceiveNativeData");
                    JSONObject jSONObject = new JSONObject();
                    MMKVSlotManager mMKVSlotManager = C39750a.f106646c;
                    String decodeString = mMKVSlotManager.decodeString("MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid", str2);
                    if (Util.isNullOrNil(decodeString)) {
                        Log.m105924i("MicroMsg.MPVideoPreviewDataMgr", "getOnReceiveNativeData vid null");
                    } else {
                        ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode("MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid", str2);
                        Map<String, Object> b = aVar.mo62386b(decodeString);
                        Object obj = b != null ? b.get("videoInitialSnapshot") : null;
                        String str3 = obj instanceof String ? (String) obj : null;
                        if (str3 == null) {
                            str3 = str2;
                        }
                        if (Util.isNullOrNil(str3)) {
                            Log.m105924i("MicroMsg.MPVideoPreviewDataMgr", "getOnReceiveNativeData snap null");
                        } else {
                            if (b == null || (i = b.get("videoInitialTime")) == null) {
                                i = 0;
                            }
                            jSONObject.put("videoInitialTime", i);
                            jSONObject.put("videoInitialSnapshot", b != null ? b.get("videoInitialSnapshot") : null);
                            str2 = ",window.onReceiveNativeData(" + jSONObject + ')';
                            Log.m105926v("MicroMsg.MPVideoPreviewDataMgr", "getOnReceiveNativeData result = " + str2);
                        }
                    }
                }
                String jSONObject2 = put.toString();
                C87412m.m108593f(jSONObject2, "jsonObj.toString()");
                String str4 = "[window.onReceivePageData(" + jSONObject2 + "),Date.now()" + str2 + "].join(',')";
                String r = C112551y.m153818r(str4, "\"@param\"", mpWebViewController.f109596U1, false, 4, (Object) null);
                long currentTimeMillis = System.currentTimeMillis();
                C8477a0 a0Var = new C8477a0();
                MMFileSlotManager mMFileSlotManager = C40789z.f109644e;
                String str5 = mpWebViewController.f109592Q1;
                if (str5 != null) {
                    C86009m1 c = C40714i.m43954c(mMFileSlotManager, str5);
                    if (mpWebViewController.f117553a.supportFeature(2008) && c != null) {
                        String q = C112551y.m153817q(str4, "\"@param\"", "@param", false);
                        Log.m105924i(mpWebViewController.mo63662A1(), "onReceivePageData buff parse native:" + q);
                        XWebScript xWebScript = new XWebScript(0, 0, mpWebViewController.f117553a);
                        xWebScript.setJsSrcAsRawString(q);
                        xWebScript.setJsParamAsFilePath(c.mo119976n());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(mpWebViewController.f109594S1 + ".__log(JSON.stringify(" + "{err:window['___xweb_script_err']}" + "));console.log('__log', " + "{err:window['___xweb_script_err']}" + ");");
                        sb4.append(10);
                        sb4.append(r);
                        xWebScript.setFallBackLogic(sb4.toString());
                        str4 = xWebScript.toString();
                        C87412m.m108593f(str4, "XWebScript(\n            …\n            }.toString()");
                        a0Var.f27482d = true;
                        C32355a.m39692d(120, System.currentTimeMillis() - currentTimeMillis);
                    }
                    if (!a0Var.f27482d) {
                        str4 = "javascript:" + r;
                    }
                    mpWebViewController.mo67690Q(str4, new C39654i(mpWebViewController, now, a0Var, currentTimeMillis));
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("contentId");
                throw null;
            }
            C87412m.m108603p("contentId");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$h */
    public /* synthetic */ class C40766h extends C24565l implements C32224a<C13598b0> {
        public C40766h(Object obj) {
            super(0, obj, MpWebViewController.class, "tryPreloadNextWebView", "tryPreloadNextWebView()V", 0);
        }

        public Object invoke() {
            MpWebViewController mpWebViewController = (MpWebViewController) this.receiver;
            String A1 = mpWebViewController.mo63662A1();
            Log.m105924i(A1, "[preloadNextWebView] " + mpWebViewController.f109587L1);
            if (mpWebViewController.f109587L1) {
                C39656k.f106417a.mo62221d(mpWebViewController.mo63663B1().f145281g);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$i */
    public static final class C40767i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MpWebViewController f109608d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40767i(MpWebViewController mpWebViewController) {
            super(0);
            this.f109608d = mpWebViewController;
        }

        public Object invoke() {
            MpWebViewController mpWebViewController = this.f109608d;
            boolean z = !mpWebViewController.mo67748s0(ExportErrorStatus.WRITE_AUDIO_SAMPLE);
            StringBuilder sb = new StringBuilder();
            sb.append("history.replaceState({},\"\",\"");
            String str = mpWebViewController.f109591P1;
            if (str != null) {
                sb.append(str);
                sb.append("\");");
                mpWebViewController.mo67690Q(sb.toString(), new C39650e(mpWebViewController));
                int i = mpWebViewController.f117578m0;
                String str2 = mpWebViewController.f109591P1;
                if (str2 != null) {
                    mpWebViewController.mo67686O(i, str2);
                    if (z) {
                        String str3 = mpWebViewController.f109591P1;
                        if (str3 != null) {
                            String a = C45590f.m50641a(str3, mpWebViewController.mo63663B1());
                            Log.m105925i(mpWebViewController.mo63662A1(), "[updateAuth]ok fullUrl:%s", a);
                            mpWebViewController.mo67690Q("window.onPageAuthOK(" + new JSONObject().put("fullUrl", a) + ')', new C39651f(mpWebViewController));
                            C32355a.m39690b(mpWebViewController.f109581F1.f130544o, 133, 1, true);
                        } else {
                            C87412m.m108603p("fullUrl");
                            throw null;
                        }
                    } else {
                        Log.m105924i(mpWebViewController.mo63662A1(), "[updateAuth]fail");
                        mpWebViewController.mo67690Q("window.onPageAuthFail()", new C39652g(mpWebViewController));
                        C32355a.m39690b(mpWebViewController.f109581F1.f130544o, 134, 1, true);
                    }
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("fullUrl");
                throw null;
            }
            C87412m.m108603p("fullUrl");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$j */
    public static final class C40768j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MpWebViewController f109609d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40768j(MpWebViewController mpWebViewController) {
            super(0);
            this.f109609d = mpWebViewController;
        }

        public Object invoke() {
            MpWebViewController mpWebViewController = this.f109609d;
            mpWebViewController.mo63664C1(mpWebViewController.mo63683n0());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$k */
    public static final class C40769k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MpWebViewController f109610d;

        public C40769k(MpWebViewController mpWebViewController) {
            this.f109610d = mpWebViewController;
        }

        public final void run() {
            String A1 = this.f109610d.mo63662A1();
            Log.m105926v(A1, "checkNotifyPageTimer isNotifyPageSuccess=" + this.f109610d.f109599X1 + ", isStopCheckNotifyPage=" + this.f109610d.f109600Y1);
            MpWebViewController mpWebViewController = this.f109610d;
            if (!mpWebViewController.f109599X1 && !mpWebViewController.f109600Y1) {
                C32355a.m39689a(92);
                MpWebViewController mpWebViewController2 = this.f109610d;
                C40752u uVar = mpWebViewController2.f109583H1;
                uVar.f109554l0 = true;
                uVar.f109556m0 = true;
                mpWebViewController2.mo63670I1();
                this.f109610d.mo67685N(ExportErrorStatus.END_WRITE_AUDIO_SAMPLE);
                Log.m105920e(this.f109610d.mo63662A1(), "check notifyPage timeout");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$l */
    public static final class C40770l {

        /* renamed from: a */
        public final /* synthetic */ MpWebViewController f109611a;

        public C40770l(MpWebViewController mpWebViewController) {
            this.f109611a = mpWebViewController;
        }

        @JavascriptInterface
        public final String __getString() {
            String str = this.f109611a.f109592Q1;
            if (str != null) {
                C86009m1 c = C40714i.m43954c(C40789z.f109644e, str);
                return c != null ? C45112n1.m49954a(c, (Charset) null, 1, (Object) null) : "";
            }
            C87412m.m108603p("contentId");
            throw null;
        }

        @JavascriptInterface
        public final void __log(String str) {
            JSONObject jSONObject;
            MpWebViewController mpWebViewController = this.f109611a;
            mpWebViewController.getClass();
            if (str != null && (jSONObject = new JSONObject(str).getJSONObject("err")) != null) {
                int i = jSONObject.getInt("errCode");
                String string = jSONObject.getString("msg");
                String A1 = mpWebViewController.mo63662A1();
                StringBuilder sb = new StringBuilder();
                sb.append("onWebLog:");
                String str2 = mpWebViewController.f109592Q1;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append(',');
                    sb.append(i);
                    sb.append(',');
                    sb.append(string);
                    Log.m105920e(A1, sb.toString());
                    C32355a.m39691c(114);
                    return;
                }
                C87412m.m108603p("contentId");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$m */
    public static final class C40771m implements l$$m0 {

        /* renamed from: a */
        public final /* synthetic */ MpWebViewController f109612a;

        public C40771m(MpWebViewController mpWebViewController) {
            this.f109612a = mpWebViewController;
        }

        /* renamed from: a */
        public final boolean mo63697a(C13851h1 h1Var, JsapiPermissionWrapper jsapiPermissionWrapper) {
            MpWebViewController mpWebViewController;
            if (C87412m.m108589b(h1Var.f38996i, "notifyPageInfo")) {
                String A1 = this.f109612a.mo63662A1();
                Log.m105926v(A1, "handleMsg " + h1Var.f38996i);
                mpWebViewController = this.f109612a;
                mpWebViewController.getClass();
                try {
                    mpWebViewController.mo63667E1(MpWebViewController.m44036F1(h1Var));
                    mpWebViewController.mo67720g0().mo10774a(h1Var.f38990c, "notifyPageInfo:ok", (Map<String, Object>) null);
                    C32355a.m39689a(90);
                    C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C28157b(mpWebViewController, (C15601d<? super C28157b>) null), 3, (Object) null);
                } catch (JSONException e) {
                    Log.printErrStackTrace(mpWebViewController.mo63662A1(), e, "", new Object[0]);
                } catch (RemoteException e2) {
                    Log.printErrStackTrace(mpWebViewController.mo63662A1(), e2, "", new Object[0]);
                }
            } else if (!C87412m.m108589b(h1Var.f38996i, "updatePageAuth")) {
                return false;
            } else {
                String A12 = this.f109612a.mo63662A1();
                Log.m105926v(A12, "handleMsg " + h1Var.f38996i);
                MpWebViewController mpWebViewController2 = this.f109612a;
                mpWebViewController2.getClass();
                C32355a.m39689a(80);
                String n0 = mpWebViewController2.mo63683n0();
                if (mpWebViewController2.f109598W1.contains(n0)) {
                    Log.m105920e(mpWebViewController2.mo63662A1(), "updatePageAuth fail, url:%s already run");
                    C48590l g0 = mpWebViewController2.mo67720g0();
                    if (g0 != null) {
                        String str = h1Var.f38990c;
                        g0.mo10774a(str, h1Var.f38996i + ":fail updating", (Map<String, Object>) null);
                    }
                    C32355a.m39689a(82);
                } else {
                    mpWebViewController2.f109598W1.add(n0);
                    C45298c U = mpWebViewController2.mo67698U();
                    C39655j jVar = new C39655j(mpWebViewController2, n0, h1Var);
                    synchronized (U) {
                        ((C40324j) C86312j.m106911c(C40324j.class)).mo63015hC(U.mo70838c(n0, 8), C45298c.f122681D, jVar, (C9487b<? extends C9486a>) null);
                    }
                }
            }
            return true;
            mpWebViewController.mo67720g0().mo10774a(h1Var.f38990c, "notifyPageInfo:fail", (Map<String, Object>) null);
            C32355a.m39689a(91);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$n */
    public static final class C40772n extends C87413o implements C32228q<String, String, List<? extends C13604l<? extends String, ? extends String>>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MpWebViewController f109613d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40772n(MpWebViewController mpWebViewController) {
            super(3);
            this.f109613d = mpWebViewController;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            String str2 = (String) obj2;
            List list = (List) obj3;
            C87412m.m108594g(str, "titles");
            C87412m.m108594g(str2, "data");
            C87412m.m108594g(list, "performance");
            MpWebViewController mpWebViewController = this.f109613d;
            mpWebViewController.f117543Q.mo71121c(str, str2, mpWebViewController.f117553a, list);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$o */
    public static final class C40773o extends C87413o implements C32224a<C52115yg3> {

        /* renamed from: d */
        public final /* synthetic */ MpWebViewController f109614d;

        /* renamed from: e */
        public final /* synthetic */ MMWebView f109615e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40773o(MpWebViewController mpWebViewController, MMWebView mMWebView) {
            super(0);
            this.f109614d = mpWebViewController;
            this.f109615e = mMWebView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[Catch:{ Exception -> 0x0045 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[Catch:{ Exception -> 0x0045 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r6 = this;
                r0 = 0
                r1 = 1
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r2 = r6.f109614d     // Catch:{ Exception -> 0x0045 }
                android.content.Intent r2 = r2.mo67715e0()     // Catch:{ Exception -> 0x0045 }
                java.lang.String r3 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122320l     // Catch:{ Exception -> 0x0045 }
                java.lang.String r4 = "KTmplSession"
                gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x0045 }
                byte[] r2 = r2.getByteArrayExtra(r3)     // Catch:{ Exception -> 0x0045 }
                if (r2 == 0) goto L_0x0037
                int r3 = r2.length     // Catch:{ Exception -> 0x0045 }
                if (r3 != 0) goto L_0x001a
                r3 = 1
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                r3 = r3 ^ r1
                if (r3 == 0) goto L_0x0037
                java.lang.Class<te3.yg3> r3 = te3.C52115yg3.class
                java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x002d }
                r4 = r3
                pe3.a r4 = (pe3.C47465a) r4     // Catch:{ Exception -> 0x002d }
                r4.parseFrom(r2)     // Catch:{ Exception -> 0x002d }
                pe3.a r3 = (pe3.C47465a) r3     // Catch:{ Exception -> 0x002d }
                goto L_0x0038
            L_0x002d:
                r2 = move-exception
                java.lang.String r3 = "Intent.decodeProtoBuffer"
                java.lang.String r4 = "decode ProtoBuffer"
                java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0045 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r4, r5)     // Catch:{ Exception -> 0x0045 }
            L_0x0037:
                r3 = 0
            L_0x0038:
                te3.yg3 r3 = (te3.C52115yg3) r3     // Catch:{ Exception -> 0x0045 }
                if (r3 == 0) goto L_0x003d
                goto L_0x00b7
            L_0x003d:
                android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ Exception -> 0x0045 }
                java.lang.String r3 = "TmplSession"
                r2.<init>(r3)     // Catch:{ Exception -> 0x0045 }
                throw r2     // Catch:{ Exception -> 0x0045 }
            L_0x0045:
                r2 = move-exception
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r3 = r6.f109614d
                java.lang.String r3 = r3.mo63662A1()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "session is null, "
                r4.append(r5)
                java.lang.String r2 = r2.getMessage()
                r4.append(r2)
                r2 = 32
                r4.append(r2)
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r2 = r6.f109614d
                android.content.Intent r2 = r2.mo67715e0()
                java.lang.String r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40744p.m44018d(r2)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
                r2 = 153(0x99, float:2.14E-43)
                g93.C32355a.m39691c(r2)
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 17260(0x436c, float:2.4186E-41)
                r4 = 2
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5[r0] = r4
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController r0 = r6.f109614d
                android.content.Intent r0 = r0.mo67715e0()
                java.lang.String r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40744p.m44018d(r0)
                r5[r1] = r0
                r2.mo160131h(r3, r5)
                com.tencent.mm.ui.widget.MMWebView r0 = r6.f109615e
                android.content.Context r0 = r0.getActivityContextIfHas()
                boolean r0 = r0 instanceof android.app.Activity
                if (r0 == 0) goto L_0x00b2
                com.tencent.mm.ui.widget.MMWebView r0 = r6.f109615e
                android.content.Context r0 = r0.getActivityContextIfHas()
                java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
                gy3.C87412m.m108592e(r0, r1)
                android.app.Activity r0 = (android.app.Activity) r0
                r0.finish()
            L_0x00b2:
                te3.yg3 r3 = new te3.yg3
                r3.<init>()
            L_0x00b7:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.MpWebViewController.C40773o.invoke():java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MpWebViewController(ah4 ah4, MMWebView mMWebView) {
        super(mMWebView, new C43704h2(), new C45520t.C45522b((C45520t.C45523c) null, false, false, false, false, 0, false, 127, (C8480h) null));
        C87412m.m108594g(ah4, "tmplParams");
        C87412m.m108594g(mMWebView, "viewWV");
        this.f109581F1 = ah4;
        C40752u uVar = new C40752u();
        uVar.f109531a = ah4;
        this.f109583H1 = uVar;
        this.f109587L1 = true;
        this.f109589N1 = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
        this.f109590O1 = C36568h.m40985a(new C40773o(this, mMWebView));
        this.f109594S1 = "__tmpl_webview_inject_data";
        C39656k.C39657a aVar = mMWebView instanceof C39656k.C39657a ? (C39656k.C39657a) mMWebView : null;
        if (aVar != null) {
            aVar.setValidUrlProxy(new C29777a(this));
            aVar.setCurrentUrlProxy(new C29778b(this));
        }
        List<BaseWebViewController.C30570e> list = this.f117590s0;
        list.addAll(C64197v.m75537f(new BaseWebViewController.C30570e(new UpdateData(), new C40765f(this)), new BaseWebViewController.C30570e(new StartPreload(), new C29780g(this)), new BaseWebViewController.C30570e(new PreloadNext(), new C40766h(this)), new BaseWebViewController.C30570e(new NotifyAuth(), new C40767i(this)), new BaseWebViewController.C30570e(new ForceUrl(), new C40768j(this))));
        this.f109595T1 = list;
        this.f109596U1 = "__tmpl_webview_inject_data.__getString()";
        this.f109598W1 = new HashSet<>();
        this.f109601Z1 = new C40769k(this);
    }

    /* renamed from: F1 */
    public static final String m44036F1(C13851h1 h1Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("performance", (String) h1Var.f38983a.get("performance"));
        jSONObject.put("injectPageDataResult", (String) h1Var.f38983a.get("injectPageDataResult"));
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "pageInfo.toString()");
        return jSONObject2;
    }

    /* renamed from: A */
    public void mo63661A(int i, String str, int i2, int i3, String str2) {
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(str2, "errMsg");
        super.mo63661A(i, str, i2, i3, str2);
        if (i == 0) {
            this.f109591P1 = str;
            mo67685N(ExportErrorStatus.WRITE_AUDIO_SAMPLE);
        }
    }

    /* renamed from: A1 */
    public final String mo63662A1() {
        return (String) ((C36570n) this.f109582G1).getValue();
    }

    /* renamed from: B1 */
    public final C52115yg3 mo63663B1() {
        return (C52115yg3) ((C36570n) this.f109590O1).getValue();
    }

    /* renamed from: C1 */
    public final void mo63664C1(String str) {
        C87412m.m108594g(str, "forceUrl");
        Log.m105924i(mo63662A1(), "loadForceUrl");
        this.f109583H1.f109554l0 = true;
        mo63668G1();
        if (!C29783w.m38875a().getBoolean("preload_tmpl_test_noredir", false)) {
            mo67692R();
            this.f117549W = true;
            mo67706Z0(mo63666D1(str), true, 8);
        }
    }

    /* renamed from: D0 */
    public boolean mo63665D0() {
        return false;
    }

    /* renamed from: D1 */
    public final String mo63666D1(String str) {
        return C45590f.m50642b(C45590f.m50644d(C45590f.m50644d(C45590f.m50644d(str, "fasttmpl_flag", false, 2, (Object) null), "fasttmpl_type", false, 2, (Object) null), "fasttmpl_fullversion", false, 2, (Object) null), "forceh5", "1");
    }

    /* renamed from: E1 */
    public final void mo63667E1(String str) {
        String A1 = mo63662A1();
        Log.m105924i(A1, "notifyPageInfo pageInfo:" + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("performance"));
            long optLong = jSONObject2.optLong("compileTime");
            long optLong2 = jSONObject2.optLong("receivePageDataTimestamp");
            long optLong3 = jSONObject2.optLong("firstScreenTimestamp");
            long optLong4 = jSONObject2.optLong("firstScreenTime");
            this.f117543Q.mo73829a("firstScreenTimestamp", optLong3);
            this.f117543Q.mo73829a("firstScreenTime", optLong4);
            C40752u uVar = this.f109583H1;
            uVar.f109557n = optLong;
            uVar.f109559o = optLong2;
            uVar.f109551k = optLong3;
            uVar.f109555m = optLong4;
            if (C87412m.m108589b(jSONObject.optString("injectPageDataResult", "fail"), "ok")) {
                this.f109599X1 = true;
                C40752u uVar2 = this.f109583H1;
                uVar2.f109528X = true;
                uVar2.mo63657l(new C40772n(this));
                C32355a.m39690b(this.f109581F1.f130544o, 131, 1, true);
                C32355a.m39691c(108);
            } else {
                this.f109583H1.f109554l0 = true;
                mo67685N(ExportErrorStatus.END_WRITE_AUDIO_SAMPLE);
                Log.m105924i(mo63662A1(), "notifyPageInfo fail");
            }
        } catch (JSONException e) {
            Log.printErrStackTrace(mo63662A1(), e, "notifyPageInfo", new Object[0]);
            this.f109583H1.f109554l0 = true;
            mo67685N(ExportErrorStatus.END_WRITE_AUDIO_SAMPLE);
        }
        this.f109583H1.f109506B = MMSlotKt.now();
        mo63670I1();
        mo63668G1();
    }

    /* renamed from: G1 */
    public final void mo63668G1() {
        Log.m105918d(mo63662A1(), "stopCheckNotifyPage");
        mo67712d0().removeCallbacks(this.f109601Z1);
        this.f109600Y1 = true;
    }

    /* renamed from: H1 */
    public final void mo63669H1(String str, long j, long j2) {
        C87412m.m108594g(str, "contentId");
        String A1 = mo63662A1();
        Log.m105926v(A1, "[updateData] " + mo63683n0());
        C40789z.m44096l(mo63683n0());
        String n0 = mo63683n0();
        this.f117597w = n0;
        mo67702W0(n0);
        mo67697T0(n0);
        this.f117518A = n0;
        this.f109592Q1 = str;
        this.f109584I1 = j;
        this.f109586K1 = j2;
        mo67685N(ExportErrorStatus.APPEND_VIDEO_SAMPLE_MAKE_CURRENT);
    }

    /* renamed from: I1 */
    public final void mo63670I1() {
        Log.m105926v(mo63662A1(), "terry trace updateKV");
        this.f109583H1.f109569w = this.f117543Q.mo73830b("onInjectStart", 0);
        this.f109583H1.f109570x = this.f117543Q.mo73830b("onInjectEnd", 0);
        this.f109583H1.f109572z = this.f117543Q.mo73830b("onTmplLoadStart", 0);
        this.f109583H1.f109505A = this.f117543Q.mo73830b("onTmplLoadEnd", 0);
        this.f109583H1.f109567u = this.f117543Q.mo73830b("onCreateStart", 0);
        this.f109583H1.f109568v = this.f117543Q.mo73830b("onCreateEnd", 0);
        C40752u uVar = this.f109583H1;
        uVar.f109518N = this.f109597V1;
        uVar.f109571y = this.f117543Q.mo73830b("onWebInjectEnd", 0);
        C40752u uVar2 = this.f109583H1;
        String randomStr = this.f117553a.getRandomStr();
        C87412m.m108593f(randomStr, "viewWV.randomStr");
        uVar2.getClass();
        uVar2.f109533b = randomStr;
        this.f109583H1.f109519O = mo67748s0(-102);
    }

    /* renamed from: J0 */
    public void mo63682j(int i, String str, String str2, C52018xt1 xt12) {
        C87412m.m108594g(str, "reqUrl");
        C87412m.m108594g(str2, "fullUrl");
        C87412m.m108594g(xt12, "response");
        if (i == 0) {
            this.f117597w = str2;
            mo67702W0(str2);
            mo67697T0(str2);
            this.f117518A = str2;
        }
        super.mo63682j(i, str, str2, xt12);
        if (i == 0) {
            this.f109591P1 = str2;
            Map<String, String> f = C45298c.m50183f(xt12.f144958x);
            C32355a.m39690b(this.f109581F1.f130544o, 117, 1, true);
            this.f109583H1.f109566t = MMSlotKt.now();
            this.f109583H1.f109527W = true;
            mo63670I1();
            this.f109583H1.mo63657l(new C39648c(this));
            mo63672J1(str, str2, f);
            mo67685N(ExportErrorStatus.WRITE_VIDEO_SAMPLE);
        }
    }

    /* renamed from: J1 */
    public final void mo63672J1(String str, String str2, Map<String, String> map) {
        String A1 = mo63662A1();
        Log.m105924i(A1, "[updatePageAuth]reqUrl:" + str + " fullUrl:" + str2 + " httpHeader:" + map);
        String userAgentString = this.f117553a.getSettings().getUserAgentString();
        C87412m.m108593f(userAgentString, "viewWV.settings.userAgentString");
        map.put("User-agent", userAgentString);
        mo67720g0().f129991K = new JSONObject(map).toString();
        mo67720g0().f129990J = Uri.parse(str2).getQueryParameter("pass_ticket");
    }

    /* renamed from: M */
    public boolean mo63673M(String str) {
        if (C87412m.m108589b(str, this.f109581F1.f130538f)) {
            return true;
        }
        return str != null && C112551y.m153819s(str, "file://", false);
    }

    /* renamed from: N0 */
    public void mo63674N0() {
        char c;
        Log.m105924i(mo63662A1(), "onStartLoad");
        Intent e0 = mo67715e0();
        Log.m105926v(mo63662A1(), "processData");
        this.f117603z = e0;
        this.f109585J1 = MMSlotKt.now();
        boolean z = true;
        this.f109587L1 = e0.getBooleanExtra(C74928u.C45093i.f122311c, true);
        this.f109584I1 = e0.getLongExtra(C74928u.C45093i.f122312d, 0);
        C46396a.C46397a aVar = C86709a0.m107531m().mo58407a().f124992e;
        String stringExtra = e0.getStringExtra(C74928u.C45093i.f122313e);
        if (e0.getStringExtra("rawUrl") == null || stringExtra == null) {
            String A1 = mo63662A1();
            Log.m105920e(A1, "rawUrl is null, " + C40744p.m44018d(e0));
            C32355a.m39691c(151);
            C115669n.INSTANCE.mo160131h(17260, 1, C40744p.m44018d(e0));
            z = false;
        } else {
            C40752u uVar = this.f109583H1;
            boolean z2 = aVar.f125000h < this.f109584I1;
            uVar.f109525U = z2;
            C32355a.m39691c(z2 ? 104 : 103);
            int intExtra = e0.getIntExtra(C74928u.C45093i.f122317i, -1);
            long j = this.f109584I1;
            int myPid = Process.myPid();
            long j2 = aVar.f124993a;
            C13601g gVar = C40716j0.f109362a;
            StringBuilder sb = new StringBuilder();
            sb.append(intExtra);
            sb.append('-');
            sb.append(j);
            int hashCode = sb.toString().hashCode();
            if (C40716j0.m43979g().getInt("_tmpl_lastest_mm_open", 0) == hashCode) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(myPid);
                sb4.append('-');
                sb4.append(j2);
                int hashCode2 = sb4.toString().hashCode();
                if (C40716j0.m43979g().getInt("_tmpl_lastest_mp_open", 0) == hashCode2) {
                    c = 2;
                } else {
                    C40716j0.m43979g().putInt("_tmpl_lastest_mp_open", hashCode2);
                    c = 1;
                }
            } else {
                C40716j0.m43979g().putInt("_tmpl_lastest_mm_open", hashCode);
                c = 0;
            }
            if (c == 1) {
                this.f109583H1.f109526V = 1;
                this.f109584I1 = aVar.f124993a;
            } else if (c == 2) {
                this.f109583H1.f109526V = 2;
                this.f109584I1 = -1;
            }
            this.f109583H1.f109521Q = mo63663B1().f145288q;
            this.f109583H1.f109522R = mo63663B1().f145289r;
            this.f109583H1.f109523S = C48583f1.m53973d(this.f117553a);
            this.f109583H1.f109524T = mo63663B1().f145291t;
            C40752u uVar2 = this.f109583H1;
            uVar2.f109507C = aVar.f124993a;
            uVar2.f109508D = aVar.f124994b;
            uVar2.f109509E = aVar.f124995c;
            uVar2.f109510F = aVar.f124996d;
            uVar2.f109511G = aVar.f124997e;
            uVar2.f109512H = 0;
            uVar2.f109513I = aVar.f124998f;
            uVar2.f109514J = aVar.f124999g;
            uVar2.f109515K = aVar.f125000h;
            uVar2.f109549j = this.f109584I1;
            uVar2.f109561p = this.f109585J1;
            uVar2.f109558n0 = mo63663B1().f145282h;
            C40789z.f109640a.mo63717h(this, stringExtra, mo63663B1(), new C39649d(this));
        }
        if (!z) {
            mo67674G0();
            return;
        }
        C40752u uVar3 = this.f109583H1;
        ah4 ah4 = this.f109581F1;
        uVar3.getClass();
        C87412m.m108594g(ah4, "<set-?>");
        uVar3.f109531a = ah4;
        C40752u uVar4 = this.f109583H1;
        String n0 = mo63683n0();
        uVar4.getClass();
        C87412m.m108594g(n0, "<set-?>");
        uVar4.f109535c = n0;
        boolean s0 = mo67748s0(-102);
        C40752u uVar5 = this.f109583H1;
        uVar5.f109517M = s0;
        uVar5.f109516L = this.f109588M1;
        uVar5.f109550j0 = this.f117553a.getCurrentInstanceWebCoreType().name();
        C32355a.m39691c(s0 ? 106 : 105);
        mo63676Y0(mo63683n0(), false);
        if (!this.f109599X1) {
            mo63668G1();
            Log.m105924i(mo63662A1(), "check notifyPage");
            this.f109600Y1 = false;
            mo67712d0().postUIDelayed(this.f109601Z1, this.f109589N1);
        }
    }

    /* renamed from: W */
    public List<BaseWebViewController.C30570e> mo63675W() {
        return this.f109595T1;
    }

    /* renamed from: Y0 */
    public boolean mo63676Y0(String str, boolean z) {
        C87412m.m108594g(str, "url");
        return !C87412m.m108589b(str, this.f109581F1.f130538f) && super.mo63676Y0(str, z);
    }

    /* renamed from: Z */
    public boolean mo63677Z() {
        return mo67748s0(ExportErrorStatus.RENDER_SAMPLE_BUFFER) || mo67748s0(ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS);
    }

    /* renamed from: d1 */
    public boolean mo63678d1(String str) {
        C87412m.m108594g(str, "url");
        return super.mo63678d1(str) && !C87412m.m108589b(str, this.f109581F1.f130538f);
    }

    /* renamed from: e1 */
    public boolean mo63679e1(String str) {
        C87412m.m108594g(str, "url");
        return super.mo63678d1(str) && !C87412m.m108589b(str, this.f109581F1.f130538f);
    }

    /* renamed from: g1 */
    public boolean mo63680g1() {
        return mo67748s0(this.f117560d0) && mo67748s0(-102);
    }

    /* renamed from: h1 */
    public boolean mo63681h1() {
        boolean contains;
        synchronized (this) {
            contains = this.f117600x0.contains(C24560g0.m30725a(BaseWebViewController.Inject.class).mo51264h());
        }
        return contains && mo67748s0(ExportErrorStatus.WRITE_VIDEO_SAMPLE);
    }

    /* renamed from: n0 */
    public String mo63683n0() {
        try {
            return C112551y.m153818r(BaseWebViewController.f117516J0.mo6892a(mo67715e0()), HttpWrapperBase.PROTOCAL_HTTP, HttpWrapperBase.PROTOCAL_HTTPS, false, 4, (Object) null);
        } catch (Exception e) {
            Log.m105920e(mo63662A1(), String.valueOf(e.getMessage()));
            mo67674G0();
            return "";
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (C87412m.m108589b(str, this.f109581F1.f130538f) && !mo67748s0(-102) && !mo67748s0(-101)) {
            Log.m105924i(mo63662A1(), "checkInject start");
            C32355a.m39690b(this.f109581F1.f130544o, 113, 1, true);
            mo67690Q("JSON.stringify(window.__appmsg_skeleton_success__)", new C39647a(this));
            int A = C76577a.m92145A(this.f117553a.getContext());
            float g = C76577a.m92156g(this.f117553a.getContext());
            String A1 = mo63662A1();
            Log.m105924i(A1, "adjustInnerWidth() screenWidth:" + A + ", density:" + g);
            if (A > 0 && g > 0.0f) {
                int i = (int) (((float) A) / g);
                String A12 = mo63662A1();
                Log.m105924i(A12, "adjustInnerWidth() innerWidth:" + i);
                mo67690Q("window.innerWidth = " + i, (C32226l<? super String, C13598b0>) null);
            }
            Log.m105924i(mo63662A1(), "[onPageReady]");
        }
    }

    /* renamed from: t0 */
    public void mo63684t0() {
        mo67679J(new C40761e(this.f109581F1, this.f117553a));
        super.mo63684t0();
        this.f117553a.addJavascriptInterface(new C40770l(this), this.f109594S1);
        mo67720g0().mo73259t0(true);
        mo67720g0().f130015t = new C40771m(this);
        String str = this.f109581F1.f130538f;
        Log.m105925i(mo63662A1(), "WebView-Trace loadTmpl getResourceResponse, requrl:%s, url:%s", str, this.f109581F1.f130539g);
        String str2 = this.f109581F1.f130539g;
        C87412m.m108593f(str2, "tmplParams.initFilePath");
        String A1 = mo63662A1();
        Log.m105926v(A1, "response path:" + Util.nullAs(str2, "null"));
        if (C40760c.m44062a(f109580a2, this.f117553a, str2) != null) {
            Log.m105924i(mo63662A1(), "return intercepted success");
            mo67685N(this.f117562e0);
            this.f117553a.loadUrl(str);
            mo67685N(this.f117560d0);
            return;
        }
        Log.m105920e(mo63662A1(), "return intercepted null");
        C32355a.m39690b(this.f109581F1.f130544o, 126, 1, true);
    }

    /* renamed from: z0 */
    public boolean mo63685z0() {
        return mo67748s0(this.f117560d0);
    }
}
