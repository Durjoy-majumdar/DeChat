package t83;

import a70.C112760b;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.core.C5843f0;
import com.tencent.p014mm.plugin.webview.core.C5853h;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.plugin.webview.webcompt.C44463z;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import d93.C45310h;
import di3.C86312j;
import e00.C45511f0;
import e00.C45518r0;
import e00.C45520t;
import e00.C7580y;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.XWalkEnvironment;
import p1035sf.C90183c;
import p225rc.C89925n;
import p564iq.C87790d;
import p749xh.C66261f3;
import p823sg.C101614i;
import p823sg.C48379o;
import rx3.C36570n;
import s93.C48302a;
import t83.C13851h1;
import t93.C48618a;
import u83.C52477a;
import v83.C52805a;
import x83.C53298a;
import zt3.C119157j;

/* renamed from: t83.l */
public class C48590l implements C53298a, C48586h, C13849g, C7580y {

    /* renamed from: A */
    public String f129981A;

    /* renamed from: B */
    public String f129982B;

    /* renamed from: C */
    public C101614i f129983C;

    /* renamed from: D */
    public C52805a f129984D;

    /* renamed from: E */
    public C13860l1 f129985E;

    /* renamed from: F */
    public HashMap<String, C13848e> f129986F;

    /* renamed from: G */
    public JsapiPermissionWrapper f129987G;

    /* renamed from: H */
    public Bundle f129988H;

    /* renamed from: I */
    public boolean f129989I;

    /* renamed from: J */
    public String f129990J;

    /* renamed from: K */
    public String f129991K;

    /* renamed from: L */
    public volatile String f129992L;

    /* renamed from: M */
    public volatile int f129993M;

    /* renamed from: N */
    public long f129994N;

    /* renamed from: O */
    public C44463z f129995O;

    /* renamed from: a */
    public MMWebView f129996a;

    /* renamed from: b */
    public String f129997b;

    /* renamed from: c */
    public Context f129998c;

    /* renamed from: d */
    public final List<String> f129999d;

    /* renamed from: e */
    public final LinkedList<C13851h1> f130000e;

    /* renamed from: f */
    public MMHandler f130001f;

    /* renamed from: g */
    public Map<String, Object> f130002g;

    /* renamed from: h */
    public boolean f130003h;

    /* renamed from: i */
    public boolean f130004i;

    /* renamed from: j */
    public long f130005j;

    /* renamed from: k */
    public boolean f130006k;

    /* renamed from: l */
    public C43791l f130007l;

    /* renamed from: m */
    public C6107m f130008m;

    /* renamed from: n */
    public BaseWebViewController f130009n;

    /* renamed from: o */
    public C45310h f130010o;

    /* renamed from: p */
    public boolean f130011p;

    /* renamed from: q */
    public String f130012q;

    /* renamed from: r */
    public boolean f130013r;

    /* renamed from: s */
    public int f130014s;

    /* renamed from: t */
    public l$$m0 f130015t;

    /* renamed from: u */
    public Set<String> f130016u;

    /* renamed from: v */
    public boolean f130017v;

    /* renamed from: w */
    public C13853i f130018w;

    /* renamed from: x */
    public List<C52477a> f130019x;

    /* renamed from: y */
    public C13859k1 f130020y;

    /* renamed from: z */
    public C48302a f130021z;

    public C48590l() {
        this.f129997b = null;
        this.f129999d = new LinkedList();
        this.f130000e = new LinkedList<>();
        this.f130001f = null;
        this.f130003h = false;
        this.f130004i = true;
        this.f130005j = 0;
        this.f130006k = false;
        this.f130011p = false;
        this.f130012q = "";
        this.f130013r = false;
        this.f130016u = null;
        this.f130017v = false;
        this.f130018w = null;
        this.f130019x = new ArrayList();
        this.f130020y = new C13859k1();
        C5843f0 f0Var = C5843f0.f22025a;
        this.f129983C = new C101614i(((Number) ((C36570n) C5843f0.f22027c).getValue()).intValue());
        this.f129984D = null;
        this.f129985E = null;
        this.f129986F = new HashMap<>();
        this.f129989I = false;
        new LinkedList();
        this.f129992L = null;
        this.f129993M = 0;
        this.f129994N = 0;
        this.f130021z = new C48302a(this);
    }

    /* renamed from: j */
    public static void m53978j(C48590l lVar) {
        if (((LinkedList) lVar.f129999d).size() <= 0) {
            Log.m105924i("MicroMsg.JsApiHandler", "dealMsgQueue fail, resultValueList is empty");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "dealMsgQueue, pre msgList = " + lVar.f130000e.size());
        List<C13851h1> b = C13854i1.m13149b((String) ((LinkedList) lVar.f129999d).remove(0), lVar.f130011p, lVar.f130012q);
        if (!Util.isNullOrNil((List) b)) {
            lVar.f130000e.addAll(b);
            Log.m105925i("MicroMsg.JsApiHandler", "now msg list size : %d", Integer.valueOf(lVar.f130000e.size()));
        }
        Log.m105924i("MicroMsg.JsApiHandler", "dealMsgQueue, post msgList = " + lVar.f130000e.size());
        lVar.mo73247n();
        MMHandler mMHandler = lVar.f130001f;
        if (mMHandler != null) {
            mMHandler.post(new C48608t0(lVar));
        }
    }

    /* renamed from: k */
    public static String m53979k(C48590l lVar, String str) {
        String url = lVar.f129996a.getUrl();
        try {
            String str2 = C112760b.m154242n() + C48379o.m53725b(url + str);
            Log.m105925i("MicroMsg.JsApiHandler", "generate upload file name, url=%s, tag=%s, fullName=%s", url, str, str2);
            return str2;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiHandler", "generating temp file name failed, url is " + url);
            Log.printErrStackTrace("MicroMsg.JsApiHandler", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: t */
    public static String m53980t(String str) {
        return String.format("javascript:WeixinJSBridge._handleMessageFromWeixin(%s)", new Object[]{Util.nullAsNil(str)});
    }

    /* renamed from: A */
    public void mo73204A(String str, String str2) {
        if (!this.f130003h) {
            Log.m105921e("MicroMsg.JsApiHandler", "onActivityStateChanged fail, not ready %s", str);
            return;
        }
        Log.m105925i("MicroMsg.JsApiHandler", "onActivityStateChanged, state %s, extData %s", str, str2);
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("extData", str2);
        String c = C13851h1.C13852a.m13143c("activity:state_change", hashMap, this.f130011p, this.f130012q);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            try {
                MMWebView mMWebView = this.f129996a;
                mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
            } catch (Exception e) {
                Log.m105929w("MicroMsg.JsApiHandler", "onActivityStateChanged, ex = %s", e.getMessage());
            }
        } else {
            MMHandlerThread.postToMainThread(new l$$f(this, c));
        }
    }

    /* renamed from: B */
    public void mo73205B(boolean z) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", Boolean.valueOf(z));
        MMHandlerThread.postToMainThread(new l$$q(this, C13851h1.C13852a.m13143c("onAddShortcutStatus", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: C */
    public void mo73206C(String str, long j, int i, float f) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onDownloadStateChange fail, not ready");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appid", str);
        hashMap.put("download_id", Long.valueOf(j));
        hashMap.put("progress", Integer.valueOf(i));
        hashMap.put("progress_float", Float.valueOf(f));
        MMHandlerThread.postToMainThread(new l$$d(this, C13851h1.C13852a.m13143c("wxdownload:progress_change", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: D */
    public void mo73207D(Bundle bundle, String str) {
        if (!this.f130003h || bundle == null) {
            Log.m105920e("MicroMsg.JsApiHandler", "onDownloadStateChange fail, not ready");
            return;
        }
        long j = bundle.getLong("download_manager_downloadid");
        String string = bundle.getString("download_manager_appid", "");
        int i = bundle.getInt("download_manager_errcode");
        Log.m105924i("MicroMsg.JsApiHandler", "onDownloadStateChange, downloadId = " + j + ", state = " + str + ", errCode = " + i);
        HashMap hashMap = new HashMap();
        hashMap.put("appid", string);
        hashMap.put("download_id", Long.valueOf(j));
        hashMap.put("err_code", Integer.valueOf(i));
        hashMap.put("state", str);
        MMHandlerThread.postToMainThread(new l$$c(this, C13851h1.C13852a.m13143c("wxdownload:state_change", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: E */
    public void mo73208E(String str, String str2) {
        if (this.f130003h) {
            HashMap hashMap = new HashMap();
            hashMap.put("videoVid", str);
            hashMap.put("result", str2);
            hashMap.put("action", "onEmbedMpVideoShare");
            String c = C13851h1.C13852a.m13143c("onMPPageAction", hashMap, this.f130011p, this.f130012q);
            MMWebView mMWebView = this.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
        }
    }

    /* renamed from: F */
    public void mo73209F(boolean z) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onEmojiStoreShowLoading fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onEmojiStoreShowLoading success, ready");
        HashMap hashMap = new HashMap();
        hashMap.put("needShow", Boolean.valueOf(z));
        MMHandlerThread.postToMainThread(new l$$i0(this, C13851h1.C13852a.m13143c("showLoading", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: G */
    public void mo73210G(String str, String str2, int i, int i2, String str3, String str4) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onEmoticonIsChosen fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onEmoticonIsChosen success, ready");
        HashMap hashMap = new HashMap();
        hashMap.put("md5", str);
        hashMap.put("thumbPath", str2);
        hashMap.put("tab", Integer.valueOf(i));
        hashMap.put("asyncDownload", Integer.valueOf(i2));
        hashMap.put("emojiUrl", str3);
        hashMap.put("aesKey", str4);
        MMHandlerThread.postToMainThread(new l$$b0(this, C13851h1.C13852a.m13143c("emoticonIsChosen", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: H */
    public void mo73211H() {
        if (this.f130003h) {
            String c = C13851h1.C13852a.m13143c("onEnterFullscreen", new HashMap(), this.f130011p, this.f130012q);
            MMWebView mMWebView = this.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
        }
    }

    /* renamed from: I */
    public void mo73212I() {
        if (this.f130003h) {
            String c = C13851h1.C13852a.m13143c("onExitFullscreen", new HashMap(), this.f130011p, this.f130012q);
            MMWebView mMWebView = this.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
        }
    }

    /* renamed from: J */
    public void mo73213J(HashMap<String, String> hashMap, int i) {
        Log.m105925i("MicroMsg.JsApiHandler", "onFavorite %b", Boolean.valueOf(this.f130003h));
        if (!this.f130003h) {
            try {
                this.f130007l.mo68088Bk(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "favorite", this.f130014s);
                mo73256r0(mo73267y(hashMap), "sendAppMessage");
            } catch (Exception e) {
                Log.m105928w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + e.getMessage());
            }
        } else {
            Bundle x = mo73265x(1);
            if (x == null || !x.getBoolean("WebViewShare_reslut", false)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "favorite");
                hashMap2.put("favScene", Integer.valueOf(i));
                String c = C13851h1.C13852a.m13143c("menu:share:appmessage", hashMap2, this.f130011p, this.f130012q);
                MMWebView mMWebView = this.f129996a;
                mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
                try {
                    this.f130007l.mo68088Bk(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "favorite", this.f130014s);
                } catch (Exception e2) {
                    Log.m105928w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + e2.getMessage());
                }
            } else {
                try {
                    this.f130007l.mo68088Bk(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "favorite", this.f130014s);
                } catch (Exception e3) {
                    Log.m105928w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + e3.getMessage());
                }
                mo73256r0(x, "sendAppMessage");
            }
        }
    }

    /* renamed from: K */
    public void mo73214K(String str, Map<String, String> map) {
        Log.m105919d("MicroMsg.JsApiHandler", "onGetA8KeyUrl, fullUrl = %s", str);
        if (!Util.isNullOrNil(str)) {
            this.f129992L = str;
            if (map == null || map.size() == 0) {
                this.f129993M = 0;
            } else {
                this.f129993M = 1;
            }
            MMHandlerThread.postToMainThread(new l$$r(this, map, str, mo73263w(str, this.f129993M)));
        }
    }

    /* renamed from: L */
    public void mo73215L(int i, int i2) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("height", Integer.valueOf(Math.round(((float) i) / this.f129996a.getMMDensity())));
        if (i2 != 0) {
            hashMap.put("inputHeight", Integer.valueOf(Math.round(((float) i2) / this.f129996a.getMMDensity())));
        }
        MMHandlerThread.postToMainThread(new l$$p(this, C13851h1.C13852a.m13143c("onGetKeyboardHeight", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: M */
    public void mo73216M(String str, int i) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onImageDownloadProgress fail, not ready");
            return;
        }
        Log.m105925i("MicroMsg.JsApiHandler", "onImageDownloadProgress, serverId id : %s, percent : %d", str, Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("serverId", str);
        hashMap.put("percent", Integer.valueOf(i));
        MMHandlerThread.postToMainThread(new l$$k(this, C13851h1.C13852a.m13143c("onImageDownloadProgress", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: N */
    public void mo73217N(String str, int i) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onImageUploadProgress fail, not ready");
            return;
        }
        Log.m105925i("MicroMsg.JsApiHandler", "onImageUploadProgress, local id : %s, percent : %d", str, Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put(C66261f3.COL_LOCALID, str);
        hashMap.put("percent", Integer.valueOf(i));
        MMHandlerThread.postToMainThread(new l$$j(this, C13851h1.C13852a.m13143c("onImageUploadProgress", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: O */
    public void mo73218O(int i, String str, String str2, String str3, String str4) {
        if (!this.f130003h) {
            Log.m105921e("MicroMsg.JsApiHandler", "%s fail, not ready", str4);
            return;
        }
        Log.m105925i("MicroMsg.JsApiHandler", "%s success, ready", str4);
        HashMap hashMap = new HashMap();
        hashMap.put("retCode", Integer.valueOf(i));
        hashMap.put("errMsg", str);
        hashMap.put("json", str2);
        if (!Util.isNullOrNil(str3)) {
            hashMap.put("requestId", str3);
        }
        MMHandlerThread.postToMainThread(new l$$e0(this, C13851h1.C13852a.m13143c(str4, hashMap, this.f130011p, this.f130012q), str4));
    }

    /* renamed from: P */
    public void mo73219P(String str) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onMPCustomMenuItemClick fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onMPCustomMenuItemClick success, ready");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String obj = jSONObject.opt(FFmpegMetadataRetriever.METADATA_KEY_TITLE).toString();
            String obj2 = jSONObject.opt("id").toString();
            HashMap hashMap = new HashMap();
            hashMap.put("id", obj2);
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, obj);
            String c = C13851h1.C13852a.m13143c("onMPCustomMenuItemClick", hashMap, this.f130011p, this.f130012q);
            Log.m105924i("MicroMsg.JsApiHandler", "onMPCustomMenuItemClick  event:" + c);
            MMWebView mMWebView = this.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.JsApiHandler", e, "", new Object[0]);
        }
    }

    /* renamed from: Q */
    public void mo73220Q(String str, int i, String str2, int i2, int i3) {
        if (this.f130003h) {
            HashMap hashMap = new HashMap();
            hashMap.put("action", str);
            hashMap.put("personal_comment_id", Integer.valueOf(i));
            if ("praiseComment".equals(str)) {
                hashMap.put("reply_id", Integer.valueOf(i2));
                hashMap.put("is_like", Integer.valueOf(i3));
            } else {
                hashMap.put("replyId", Integer.valueOf(i2));
                hashMap.put(Scopes.OPEN_ID, str2);
            }
            String c = C13851h1.C13852a.m13143c("onMPPageAction", hashMap, this.f130011p, this.f130012q);
            MMWebView mMWebView = this.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
        }
    }

    /* renamed from: R */
    public void mo73221R(String str, int i) {
        if (this.f130003h) {
            HashMap hashMap = new HashMap();
            hashMap.put("action", str);
            hashMap.put("shareFuncFlag", Integer.valueOf(i));
            String c = C13851h1.C13852a.m13143c("onMPPageAction", hashMap, this.f130011p, this.f130012q);
            MMWebView mMWebView = this.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
        }
    }

    /* renamed from: S */
    public void mo73222S(String str) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        MMWebView mMWebView = this.f129996a;
        String url = mMWebView == null ? "" : mMWebView.getUrl();
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        boolean z = false;
        if (!Util.isNullOrNil(url)) {
            try {
                if (new URL(url).getHost().equals(WeChatHosts.domainString(C0966R.string.f360885fm3))) {
                    z = true;
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewUtil", "create url fail : " + e.getLocalizedMessage());
            }
        }
        if (z) {
            Log.m105924i("MicroMsg.JsApiHandler", "onMenuClick");
            HashMap hashMap = new HashMap();
            hashMap.put("action", str);
            String c = C13851h1.C13852a.m13143c("onMenuClick", hashMap, this.f130011p, this.f130012q);
            MMWebView mMWebView2 = this.f129996a;
            mMWebView2.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
        }
    }

    /* renamed from: T */
    public void mo73223T(String str, int i) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onMusicStatusChanged fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onMusicStatusChanged success, ready");
        HashMap hashMap = new HashMap();
        hashMap.put("snsid", str);
        hashMap.put("status", Integer.valueOf(i));
        MMHandlerThread.postToMainThread(new l$$g0(this, C13851h1.C13852a.m13143c("onMusicStatusChanged", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: U */
    public void mo73224U() {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onNavigationBarRightButtonClick fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onNavigationBarRightButtonClick success, ready");
        String c = C13851h1.C13852a.m13143c("onNavigationBarRightButtonClick", new HashMap(), this.f130011p, this.f130012q);
        MMWebView mMWebView = this.f129996a;
        mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
    }

    /* renamed from: V */
    public void mo73225V(String str) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "not ready");
        } else if (!Util.isNullOrNil(str)) {
            Log.m105918d("MicroMsg.JsApiHandler", "onNetWorkChange");
            HashMap hashMap = new HashMap();
            hashMap.put(DownloadInfo.NETTYPE, str);
            Context context = MMApplicationContext.getContext();
            if (!NetStatusUtil.isConnected(context)) {
                hashMap.put("networkType", "none");
            }
            if (NetStatusUtil.is2G(context)) {
                Log.m105924i("MicroMsg.JsApiHandler", "onNetWorkChange 2g");
                hashMap.put("networkType", "2g");
            }
            if (NetStatusUtil.is3G(context)) {
                Log.m105924i("MicroMsg.JsApiHandler", "onNetWorkChange 3g");
                hashMap.put("networkType", "3g");
            }
            if (NetStatusUtil.is4G(context)) {
                Log.m105924i("MicroMsg.JsApiHandler", "onNetWorkChange 4g");
                hashMap.put("networkType", "4g");
            }
            if (NetStatusUtil.is5G(context)) {
                Log.m105924i("MicroMsg.JsApiHandler", "onNetWorkChange 5g");
                hashMap.put("networkType", "5g");
            }
            if (NetStatusUtil.isWifi(context)) {
                Log.m105924i("MicroMsg.JsApiHandler", "onNetWorkChange wifi");
                hashMap.put("networkType", "wifi");
            }
            C43791l lVar = this.f130007l;
            if (lVar != null) {
                try {
                    int i = lVar.mo68114V5(110, new Bundle()).getInt("sim_card_type", 0);
                    int i2 = i == 0 ? 0 : i == 1 ? 1 : 2;
                    hashMap.put("simType", Integer.valueOf(i2));
                    Log.m105919d("MicroMsg.JsApiHandler", "onNetWorkChange simType=%s", Integer.valueOf(i2));
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.JsApiHandler", "invokeAsResult ex %s", e.getMessage());
                }
            }
            MMHandlerThread.postToMainThread(new l$$j0(this, C13851h1.C13852a.m13143c("onNetWorkChange", hashMap, this.f130011p, this.f130012q)));
        }
    }

    /* renamed from: W */
    public void mo73226W(int i, int i2) {
        if (this.f130003h) {
            HashMap hashMap = new HashMap();
            hashMap.put("newOrientation", Integer.valueOf(i));
            hashMap.put("sysLock", Integer.valueOf(i2));
            String c = C13851h1.C13852a.m13143c("onOrientationsChange", hashMap, this.f130011p, this.f130012q);
            MMWebView mMWebView = this.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
        }
    }

    /* renamed from: X */
    public void mo73227X(boolean z) {
        mo73258s0(z);
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onPageStateChange fail, not ready");
            return;
        }
        Log.m105925i("MicroMsg.JsApiHandler", "onPageStateChange success, ready, active = %b", Boolean.valueOf(z));
        HashMap hashMap = new HashMap();
        hashMap.put("active", String.valueOf(z));
        MMHandlerThread.postToMainThread(new l$$h0(this, m53980t(C13851h1.C13852a.m13143c("onPageStateChange", hashMap, this.f130011p, this.f130012q))));
    }

    /* renamed from: Y */
    public void mo73228Y(String str, boolean z, String str2) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onSearchDataReady fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onSearchDataReady success, ready");
        HashMap hashMap = new HashMap();
        hashMap.put("json", str);
        hashMap.put("newQuery", Boolean.valueOf(z));
        hashMap.put("requestId", str2);
        MMHandlerThread.postToMainThread(new l$$u(this, C13851h1.C13852a.m13143c("onSearchDataReady", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: Z */
    public void mo73229Z(int i, String str) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onSearchImageListReady fail, not ready");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ret", Integer.valueOf(i));
        hashMap.put("data", str);
        MMHandlerThread.postToMainThread(new l$$a0(this, C13851h1.C13852a.m13143c("onSearchImageListReady", hashMap, this.f130011p, this.f130012q)));
    }

    @JavascriptInterface
    public void _getAllHosts(String str) {
        if (str != null) {
            this.f130001f.post(new C48615x0(this, str));
        }
    }

    @JavascriptInterface
    public String _getDgtVerifyRandomStr() {
        return (!C44625c2.m49078k() || this.f130013r) ? this.f130012q : "";
    }

    @JavascriptInterface
    public void _getHtmlContent(String str) {
        if (str != null) {
            this.f130001f.post(new C48617y0(this, str));
        }
    }

    @JavascriptInterface
    public boolean _isDgtVerifyEnabled() {
        return this.f130011p;
    }

    @JavascriptInterface
    public void _ready(boolean z) {
        this.f130003h = z;
    }

    @JavascriptInterface
    public void _sendMessage(String str) {
        boolean z;
        synchronized (this) {
            if (mo73264w0()) {
                if (!Util.isNullOrNil(str)) {
                    this.f129983C.put(Integer.valueOf(str.hashCode()), str);
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            Log.m105918d("MicroMsg.JsApiHandler", "_sendMessage pendingJsApi");
            return;
        }
        Log.m105918d("MicroMsg.JsApiHandler", "_sendMessage");
        if (this.f130001f != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = str;
            this.f130001f.sendMessage(obtain);
            return;
        }
        Log.m105920e("MicroMsg.JsApiHandler", "msgQueueHandler err");
    }

    /* renamed from: a */
    public void mo10774a(String str, String str2, Map<String, Object> map) {
        if (str2 == null || str2.length() == 0 || str == null) {
            Log.m105920e("MicroMsg.JsApiHandler", "doCallback, invalid args, ret = " + str2);
        } else if (this.f129986F.containsKey(str)) {
            C13848e eVar = this.f129986F.get(str);
            if (eVar != null) {
                eVar.mo10774a(str, str2, map);
                this.f129986F.remove(str);
            }
        } else if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "doCallback fail, not ready");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("err_msg", str2);
            if (map != null && map.size() > 0) {
                Log.m105924i("MicroMsg.JsApiHandler", "doCallback, retValue size = " + map.size());
                hashMap.putAll(map);
            }
            String a = C13851h1.C13852a.m13141a(str, hashMap, this.f130011p, this.f130012q);
            Log.m105924i("MicroMsg.JsApiHandler", "doCallback, ret = " + str2 + ", cb = " + a);
            if (a != null && this.f129996a != null) {
                l$$s l__s = new l$$s(this, a);
                if (MMHandlerThread.isMainThread()) {
                    l__s.run();
                } else {
                    MMHandlerThread.postToMainThread(l__s);
                }
                if (!((ArrayList) this.f130019x).isEmpty()) {
                    Iterator it = ((ArrayList) this.f130019x).iterator();
                    while (it.hasNext()) {
                        C52477a aVar = (C52477a) it.next();
                        if (aVar != null) {
                            aVar.mo14386b(str, str2, map);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a0 */
    public void mo73232a0(String str, String str2, JSONArray jSONArray, int i) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onSearchInputChange fail, not ready");
            return;
        }
        Log.m105925i("MicroMsg.JsApiHandler", "onSearchInputChange success, ready %s %s %s", str, str2, jSONArray.toString());
        HashMap hashMap = new HashMap();
        hashMap.put(SearchIntents.EXTRA_QUERY, str);
        hashMap.put("custom", str2);
        hashMap.put("tagList", jSONArray);
        hashMap.put("isCancelButtonClick", Integer.valueOf(i));
        MMHandlerThread.postToMainThread(new l$$w(this, C13851h1.C13852a.m13143c("onSearchInputChange", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: b */
    public boolean mo67829b(String str) {
        this.f129996a.evaluateJavascript("javascript:WeixinJSBridge._fetchQueue()", new l$$o(this, str));
        return true;
    }

    /* renamed from: b0 */
    public void mo73233b0(String str) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onSearchSuggestionDataReady fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onSearchSuggestionDataReady success, ready");
        HashMap hashMap = new HashMap();
        hashMap.put("json", str);
        MMHandlerThread.postToMainThread(new l$$z(this, C13851h1.C13852a.m13143c("onSearchSuggestionDataReady", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: c */
    public C13853i mo13177c() {
        return this.f130018w;
    }

    /* renamed from: c0 */
    public void mo73234c0(String str, String str2) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadDataFinish fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadDataFinish success, ready");
        HashMap hashMap = new HashMap();
        hashMap.put("widgetId", str);
        hashMap.put("data", str2);
        MMHandlerThread.postToMainThread(new l$$v(this, C13851h1.C13852a.m13143c("onSearchWAWidgetReloadDataFinish", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: d */
    public void mo8700d() {
        Log.m105927v("MicroMsg.JsApiHandler", "doAttachRunOn3rdApis, ready(%s).", Boolean.valueOf(this.f130003h));
        MMWebView mMWebView = this.f129996a;
        if (mMWebView != null && this.f130003h) {
            StringBuilder sb = new StringBuilder();
            sb.append("javascript:WeixinJSBridge._handleMessageFromWeixin(");
            HashMap hashMap = new HashMap();
            JsapiPermissionWrapper c = this.f130010o.mo70860c();
            LinkedList linkedList = new LinkedList();
            if (c != null) {
                if (c.mo69447f(88)) {
                    linkedList.add("menu:share:timeline");
                }
                if (c.mo69447f(89)) {
                    linkedList.add("menu:share:appmessage");
                }
                if (c.mo69447f(94)) {
                    linkedList.add("menu:share:qq");
                }
                if (c.mo69447f(109)) {
                    linkedList.add("menu:share:weiboApp");
                }
                if (c.mo69447f(134)) {
                    linkedList.add("menu:share:QZone");
                }
                if (c.mo69447f(219)) {
                    linkedList.add("sys:record");
                }
                linkedList.add("onVisibleHeightChange");
                linkedList.add("onVoiceRecordEnd");
                linkedList.add("onVoicePlayBegin");
                linkedList.add("onVoicePlayEnd");
                linkedList.add("onLocalImageUploadProgress");
                linkedList.add("onImageDownloadProgress");
                linkedList.add("onVoiceUploadProgress");
                linkedList.add("onVoiceDownloadProgress");
                linkedList.add("onVideoUploadProgress");
                linkedList.add("onPlayerProcessStateChanged");
                linkedList.add("onMediaFileUploadProgress");
                linkedList.add("menu:setfont");
                linkedList.add("menu:haokan");
                linkedList.add("topbar:click");
                linkedList.add("reportOnLeaveForMP");
                linkedList.add("onMPPageAction");
                linkedList.add("onMPVideoStateChange");
                linkedList.add("onReceiveMPPageData");
                linkedList.add("onMPAdWebviewStateChange");
                linkedList.add("onScreenShot");
                linkedList.add("menu:share:email");
                linkedList.add("wxdownload:state_change");
                linkedList.add("wxdownload:progress_change");
                linkedList.add("hdOnDeviceStateChanged");
                linkedList.add("activity:state_change");
                linkedList.add("onWindowFocusChanged");
                linkedList.add("onVideoPlay");
                linkedList.add("onVideoPause");
                linkedList.add("onVideoEnded");
                linkedList.add("onVideoWaiting");
                linkedList.add("onVideoBufferUpdate");
                linkedList.add("onVideoTimeUpdate");
                linkedList.add("onVideoError");
                linkedList.add("onVideoLoadedMetaData");
                linkedList.add("onEnterFullscreen");
                linkedList.add("onExitFullscreen");
                linkedList.add("onOrientationsChange");
                linkedList.add("onWXDeviceBluetoothStateChange");
                linkedList.add("onWXDeviceLanStateChange");
                linkedList.add("onWXDeviceBindStateChange");
                linkedList.add("onReceiveDataFromWXDevice");
                linkedList.add("onScanWXDeviceResult");
                linkedList.add("onWXDeviceStateChange");
                linkedList.add("onNfcTouch");
                linkedList.add("menu:custom");
                linkedList.add("onMenuClick");
                linkedList.add("onNavShadowClick");
                linkedList.add("onSearchWAWidgetOpenApp");
                linkedList.add("onSearchDataReady");
                linkedList.add("onCurrentLocationReady");
                linkedList.add("onClientNavAction");
                linkedList.add("onNavBarShadowManuallyHidden");
                linkedList.add("onChatSearchDataReady");
                linkedList.add("onGetPoiInfoReturn");
                linkedList.add("onSearchHistoryReady");
                linkedList.add("onSearchWAWidgetOnTapCallback");
                linkedList.add("onSearchImageListReady");
                linkedList.add("onTeachSearchDataReady");
                linkedList.add("onSearchGuideDataReady");
                linkedList.add("onUxOplogDataReady");
                linkedList.add("onSearchInputChange");
                linkedList.add("onSearchInputConfirm");
                linkedList.add("onSearchSuggestionDataReady");
                linkedList.add("onMusicStatusChanged");
                linkedList.add("switchToTabSearch");
                linkedList.add("onVideoPlayerCallback");
                linkedList.add("onSelectContact");
                linkedList.add("onSearchWAWidgetAttrChanged");
                linkedList.add("onSearchWAWidgetReloadData");
                linkedList.add("onSearchWAWidgetReloadDataFinish");
                linkedList.add("onSearchWAWidgetStateChange");
                linkedList.add("onSearchWAWidgetDataPush");
                linkedList.add("emoticonIsChosen");
                linkedList.add("onSimilarEmoticonReady");
                linkedList.add("onSearchWebQueryReady");
                linkedList.add("onDeviceMotionFired");
                linkedList.add("onGetVertSearchEntriesData");
                linkedList.add("onMPCustomMenuItemClick");
                linkedList.add("onPullDownRefresh");
                linkedList.add("onPageStateChange");
                linkedList.add("onGetKeyboardHeight");
                linkedList.add("onGetSmiley");
                linkedList.add("onAddShortcutStatus");
                linkedList.add("onFocusSearchInput");
                linkedList.add("onGetA8KeyUrl");
                linkedList.add("deleteAccountSuccess");
                linkedList.add("onGetMsgProofItems");
                linkedList.add("WNJSHandlerInsert");
                linkedList.add("WNJSHandlerMultiInsert");
                linkedList.add("WNJSHandlerExportData");
                linkedList.add("WNJSHandlerHeaderAndFooterChange");
                linkedList.add("WNJSHandlerEditableChange");
                linkedList.add("WNJSHandlerEditingChange");
                linkedList.add("WNJSHandlerSaveSelectionRange");
                linkedList.add("WNJSHandlerLoadSelectionRange");
                linkedList.add("onCustomGameMenuClicked");
                linkedList.add("showLoading");
                linkedList.add("getSearchEmotionDataCallBack");
                linkedList.add("onNavigationBarRightButtonClick");
                linkedList.add("onSearchActionSheetClick");
                linkedList.add("onGetMatchContactList");
                linkedList.add("onUiInit");
                linkedList.add("onNetWorkChange");
                linkedList.add("onMiniProgramData");
                linkedList.add("onBackgroundAudioStateChange");
                linkedList.add("onArticleReadingBtnClicked");
                if (!Util.isNullOrNil((List) null)) {
                    linkedList.addAll((Collection) null);
                }
                linkedList.add("onReceivePageData");
                linkedList.add("onPageAuthOK");
                linkedList.add("onScrollViewDidScroll");
                linkedList.add("onPublishHaowanEnd");
                linkedList.add("onPublishHaowanProgress");
                linkedList.add("onAccessibilityStateChange");
                linkedList.add("onClickBottomToast");
                linkedList.add("onCallWebTranslateApi");
                linkedList.add("onUserGoBack");
                linkedList.add("onShareCustomMenuItemClick");
                linkedList.add("onMultiPickerViewChange");
                linkedList.add("onFinderViewEvent");
                linkedList.add("onFinderFeedInfoUpdated");
                linkedList.add("onExitFinderFullscreen");
                linkedList.add("onEnterFinderFullscreen");
                linkedList.add("onShareEmbedExcerptEvent");
                linkedList.add("onImagePreviewChanged");
            }
            hashMap.put("__runOn3rd_apis", new JSONArray(linkedList));
            sb.append(C13851h1.C13852a.m13143c("sys:attach_runOn3rd_apis", hashMap, this.f130011p, this.f130012q));
            sb.append(")");
            mMWebView.evaluateJavascript(sb.toString(), new l$$f0(this));
        }
    }

    /* renamed from: d0 */
    public void mo73235d0(Map<String, Object> map) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onSelectContact fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onSelectContact success, ready");
        MMHandlerThread.postToMainThread(new l$$t(this, C13851h1.C13852a.m13143c("onSelectContact", map, this.f130011p, this.f130012q)));
    }

    /* renamed from: e */
    public boolean mo67830e(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        return C89925n.m112490c(str, "weixin://dispatch_message/");
    }

    /* renamed from: e0 */
    public final void mo73236e0(String str, Map<String, Object> map, JSONObject jSONObject) {
        String str2 = "";
        if (!this.f130003h || str == null || (map == null && jSONObject == null)) {
            Object[] objArr = new Object[1];
            if (str == null) {
                str = str2;
            }
            objArr[0] = str;
            Log.m105921e("MicroMsg.JsApiHandler", "onSendEventToJSBridge fail, event=%s", objArr);
            return;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = str;
        objArr2[1] = map == null ? str2 : map.toString();
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        }
        objArr2[2] = str2;
        Log.m105925i("MicroMsg.JsApiHandler", "onSendEventToJSBridge success, event=%s, params=%s, jsonParams=%s", objArr2);
        l$$y l__y = new l$$y(this, map != null ? C13851h1.C13852a.m13143c(str, map, this.f130011p, this.f130012q) : C13851h1.C13852a.m13144d(str, jSONObject, this.f130011p, this.f130012q), str);
        if (MMHandlerThread.isMainThread()) {
            l__y.run();
        } else {
            MMHandlerThread.postToMainThread(l__y);
        }
    }

    /* renamed from: f */
    public void mo8701f(String str, Map<String, Object> map) {
        if (!this.f130003h) {
            Log.m105921e("MicroMsg.JsApiHandler", "not ready, event=%s", str);
            return;
        }
        String c = C13851h1.C13852a.m13143c(str, map, this.f130011p, this.f130012q);
        Log.m105927v("MicroMsg.JsApiHandler", "dispatchEvent eventJs: %s", c);
        MMHandlerThread.postToMainThread(new l$$k0(this, c));
    }

    /* renamed from: f0 */
    public void mo73237f0(HashMap<String, String> hashMap, int i) {
        Log.m105925i("MicroMsg.JsApiHandler", "onSendToFriend %b", Boolean.valueOf(this.f130003h));
        if (i == 2 || i == 4) {
            this.f130007l.mo68088Bk(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "recentFriend", this.f130014s);
            this.f130007l.mo68088Bk("sourUserName", hashMap.get("sourUserName"), this.f130014s);
        } else {
            try {
                this.f130007l.mo68088Bk(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "friend", this.f130014s);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + e.getMessage());
            }
        }
        if (!this.f130003h) {
            Log.m105928w("MicroMsg.JsApiHandler", "onSendToFriend not ready");
            mo73256r0(mo73267y(hashMap), "sendAppMessage");
        } else if (i == 3 || i == 4) {
            mo73256r0(mo73267y(hashMap), "sendAppMessage");
        } else {
            Bundle x = mo73265x(1);
            if (x == null || !x.getBoolean("WebViewShare_reslut", false)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "friend");
                hashMap2.put("shareScene", Integer.valueOf(i));
                String c = C13851h1.C13852a.m13143c("menu:share:appmessage", hashMap2, this.f130011p, this.f130012q);
                MMWebView mMWebView = this.f129996a;
                mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
                return;
            }
            mo73256r0(x, "sendAppMessage");
        }
    }

    /* renamed from: g */
    public void mo8702g(String str, String str2, Map<String, Object> map, boolean z) {
        MMHandler mMHandler;
        if (!Util.isNullOrNil(str)) {
            mo10774a(str, str2, map);
        }
        if (z && (mMHandler = this.f130001f) != null) {
            mMHandler.post(new C48616y(this));
        }
    }

    /* renamed from: g0 */
    public void mo73238g0(int i, HashMap<String, String> hashMap, int i2) {
        Log.m105925i("MicroMsg.JsApiHandler", "onShareTimeline %b", Boolean.valueOf(this.f130003h));
        if (!this.f130003h) {
            Log.m105928w("MicroMsg.JsApiHandler", "onShareTimeline not ready");
            mo73256r0(mo73267y(hashMap), C82980n.NAME);
        } else if (i2 == 2) {
            mo73256r0(mo73267y(hashMap), C82980n.NAME);
        } else {
            Bundle x = mo73265x(2);
            if (x == null || !x.getBoolean("WebViewShare_reslut", false)) {
                try {
                    C43791l lVar = this.f130007l;
                    lVar.mo68088Bk("urlAttribute", i + "", this.f130014s);
                } catch (RemoteException e) {
                    Log.printErrStackTrace("MicroMsg.JsApiHandler", e, "", new Object[0]);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("shareScene", Integer.valueOf(i2));
                String c = C13851h1.C13852a.m13143c("menu:share:timeline", hashMap2, this.f130011p, this.f130012q);
                MMWebView mMWebView = this.f129996a;
                mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
                return;
            }
            mo73256r0(x, C82980n.NAME);
        }
    }

    public int getBinderID() {
        return this.f130014s;
    }

    /* renamed from: h */
    public void mo63613h(C13851h1 h1Var, C13848e eVar) {
        mo73249o(h1Var, this.f129987G, this.f129988H, eVar);
    }

    /* renamed from: h0 */
    public void mo73239h0(String str, String str2, JSONArray jSONArray, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(SearchIntents.EXTRA_QUERY, str);
        hashMap.put("custom", str2);
        hashMap.put("tagList", jSONArray);
        mo73236e0("onSearchInputChange", hashMap, (JSONObject) null);
    }

    /* renamed from: i */
    public C6107m mo8703i() {
        return this.f130008m;
    }

    /* renamed from: i0 */
    public void mo73240i0(int i, String str, int i2) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onTeachSearchDataReady fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onTeachSearchDataReady success, ready");
        HashMap hashMap = new HashMap();
        hashMap.put("requestType", Integer.valueOf(i));
        hashMap.put("json", str);
        hashMap.put("isCacheData", Integer.valueOf(i2));
        MMHandlerThread.postToMainThread(new l$$c0(this, C13851h1.C13852a.m13143c("onTeachSearchDataReady", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: j0 */
    public void mo73241j0(int i, long j, String str) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onUxOplogDataReady fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onUxOplogDataReady success, ready");
        HashMap hashMap = new HashMap();
        hashMap.put("ret", Integer.valueOf(i));
        hashMap.put("reqId", Long.valueOf(j));
        hashMap.put("json", str);
        MMHandlerThread.postToMainThread(new l$$d0(this, C13851h1.C13852a.m13143c("onUxOplogDataReady", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: k0 */
    public void mo73242k0(String str, int i) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onVideoUploadoadProgress fail, not ready");
            return;
        }
        Log.m105925i("MicroMsg.JsApiHandler", "onVideoUploadoadProgress, local id : %s, percent : %d", str, Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put(C66261f3.COL_LOCALID, str);
        hashMap.put("percent", Integer.valueOf(i));
        MMHandlerThread.postToMainThread(new l$$n(this, C13851h1.C13852a.m13143c("onVideoUploadProgress", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: l */
    public void mo73243l(String str, boolean z) {
        try {
            this.f130007l.C70(str, z, this.f130014s);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.JsApiHandler", "addInvokedJsApiFromMenu, ex = " + e);
        }
    }

    /* renamed from: l0 */
    public void mo73244l0(String str, int i) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onVoiceDownloadProgress fail, not ready");
            return;
        }
        Log.m105925i("MicroMsg.JsApiHandler", "onVoiceDownloadProgress, serverId id : %s, percent : %d", str, Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("serverId", str);
        hashMap.put("percent", Integer.valueOf(i));
        MMHandlerThread.postToMainThread(new l$$m(this, C13851h1.C13852a.m13143c("onVoiceDownloadProgress", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: m */
    public void mo73245m() {
        C44463z zVar;
        if (this.f130003h && (zVar = this.f129995O) != null) {
            zVar.mo69225a();
        }
    }

    /* renamed from: m0 */
    public void mo73246m0(Map<String, Object> map) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onVoicePlayEnd fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onVoicePlayEnd");
        MMHandlerThread.postToMainThread(new l$$h(this, C13851h1.C13852a.m13143c("onVoicePlayEnd", map, this.f130011p, this.f130012q)));
    }

    /* renamed from: n */
    public final void mo73247n() {
        boolean z;
        boolean z2;
        do {
            z = false;
            if (Util.isNullOrNil((List) this.f130000e)) {
                Log.m105924i("MicroMsg.JsApiHandler", "dealNextMsg stop, msgList is empty");
                continue;
            } else {
                try {
                    z2 = this.f130007l.mo68152ys(this.f130014s);
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.JsApiHandler", "isBusy, ex = " + e.getMessage());
                    z2 = false;
                }
                Log.m105924i("MicroMsg.JsApiHandler", "dealNextMsg isBusy = " + z2);
                if (z2) {
                    Log.m105928w("MicroMsg.JsApiHandler", "dealNextMsg fail, msgHandler is busy now");
                    continue;
                } else if (this.f130000e.size() == 0) {
                    Log.m105928w("MicroMsg.JsApiHandler", "msgList size is 0.");
                    continue;
                } else {
                    C13851h1 remove = this.f130000e.remove(0);
                    if (remove == null) {
                        Log.m105920e("MicroMsg.JsApiHandler", "dealNextMsg fail, msg is null");
                        z = true;
                        continue;
                    } else {
                        String str = remove.f38996i;
                        String str2 = remove.f38990c;
                        Map<String, Object> map = remove.f38995h;
                        if (!((ArrayList) this.f130019x).isEmpty()) {
                            Iterator it = ((ArrayList) this.f130019x).iterator();
                            while (it.hasNext()) {
                                C52477a aVar = (C52477a) it.next();
                                if (aVar != null) {
                                    aVar.mo14385a(str, str2, map);
                                }
                            }
                        }
                        z = mo73249o(remove, remove.f38993f, remove.f38992e, remove.f38994g);
                        String str3 = remove.f38996i;
                        String str4 = remove.f38990c;
                        Map<String, Object> map2 = remove.f38995h;
                        if (!((ArrayList) this.f130019x).isEmpty()) {
                            Iterator it4 = ((ArrayList) this.f130019x).iterator();
                            while (it4.hasNext()) {
                                C52477a aVar2 = (C52477a) it4.next();
                                if (aVar2 != null) {
                                    aVar2.mo14387c(str3, str4, map2);
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
            }
        } while (z);
    }

    /* renamed from: n0 */
    public void mo73248n0(Map<String, Object> map) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onVoiceRecordEnd fail, not ready");
            return;
        }
        Log.m105924i("MicroMsg.JsApiHandler", "onVoiceRecordEnd");
        String c = C13851h1.C13852a.m13143c("onVoiceRecordEnd", map, this.f130011p, this.f130012q);
        Log.m105925i("MicroMsg.JsApiHandler", "onVoiceRecordEnd event : %s", c);
        MMHandlerThread.postToMainThread(new l$$i(this, c));
    }

    /* JADX WARNING: Removed duplicated region for block: B:200:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04f0 A[ADDED_TO_REGION] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo73249o(t83.C13851h1 r28, com.tencent.p014mm.protocal.JsapiPermissionWrapper r29, android.os.Bundle r30, t83.C13848e r31) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            r0 = r30
            r1 = r31
            java.lang.String r2 = "key_webview_init_url"
            java.lang.String r3 = "key_wxapp_path"
            java.lang.String r4 = "key_wxapp_id"
            java.lang.String r9 = "MicroMsg.JsApiHandler"
            r10 = 1
            if (r8 != 0) goto L_0x0019
            java.lang.String r0 = "dealNextMsg fail, msg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            return r10
        L_0x0019:
            java.lang.String r5 = r8.f38996i
            java.lang.String r6 = "getBrandWCPayRequest"
            boolean r5 = r6.equals(r5)
            r11 = 2
            java.lang.String r12 = "jsapiHandleResult"
            if (r5 == 0) goto L_0x003e
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r5 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.PaymentH5Jsb
            android.content.Context r6 = r27.mo73255r()
            boolean r5 = r5.checkAvailable(r6)
            if (r5 != 0) goto L_0x003e
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38995h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r12, r1)
            return r10
        L_0x003e:
            java.lang.String r13 = "getBrandWCPayBindCardRequest"
            java.lang.String r14 = "openWCPaySpecificView"
            java.lang.String r15 = "verifyWCPayPassword"
            java.lang.String r16 = "getH5TransactionRequest"
            java.lang.String r17 = "getH5PrepayRequest"
            java.lang.String r18 = "getWCPayRealnameVerify"
            java.lang.String r19 = "selectWalletCurrency"
            java.lang.String r20 = "changePayActivityView"
            java.lang.String r21 = "unbindBankCard"
            java.lang.String r22 = "uploadIdCardSuccess"
            java.lang.String r23 = "idCardRealnameVerify"
            java.lang.String r24 = "setWCPayPassword"
            java.lang.String r25 = "handleWCPayWalletBuffer"
            java.lang.String r26 = "faceVerifyForPay"
            java.lang.String[] r5 = new java.lang.String[]{r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26}
            java.util.List r5 = java.util.Arrays.asList(r5)
            java.lang.String r6 = r8.f38996i
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0084
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r5 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.PaymentH5Jsb
            android.content.Context r6 = r27.mo73255r()
            boolean r5 = r5.checkAvailable(r6)
            if (r5 != 0) goto L_0x0084
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38995h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r12, r1)
            return r10
        L_0x0084:
            boolean r5 = r7.f130006k
            r6 = 3
            if (r5 == 0) goto L_0x009a
            java.lang.String r0 = "dealNextMsg fail, floating now"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38995h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r12, r1)
            return r10
        L_0x009a:
            java.lang.String r5 = r8.f38996i
            if (r5 == 0) goto L_0x04f6
            java.util.Map<java.lang.String, java.lang.Object> r13 = r8.f38983a
            if (r13 == 0) goto L_0x04f6
            java.lang.String r13 = r8.f38989b
            if (r13 == 0) goto L_0x04f6
            boolean r13 = r7.f129989I
            if (r13 != 0) goto L_0x00b0
            com.tencent.mm.ui.widget.MMWebView r13 = r7.f129996a
            if (r13 != 0) goto L_0x00b0
            goto L_0x04f6
        L_0x00b0:
            boolean r13 = r7.f130017v
            r14 = 0
            if (r13 == 0) goto L_0x00e3
            java.util.Set<java.lang.String> r13 = r7.f130016u
            if (r13 == 0) goto L_0x00bf
            boolean r5 = r13.contains(r5)
            if (r5 != 0) goto L_0x00e3
        L_0x00bf:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = r8.f38996i
            r0[r14] = r1
            java.lang.String r1 = "limited mode, call unsupported JsApi: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
            zt3.t r0 = zt3.C119157j.f356862d
            t83.l$$l0 r1 = new t83.l$$l0
            r1.<init>(r7, r8)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38995h
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r12, r1)
            return r10
        L_0x00e3:
            if (r0 == 0) goto L_0x00e7
            r8.f38992e = r0
        L_0x00e7:
            if (r1 == 0) goto L_0x00f0
            java.util.HashMap<java.lang.String, t83.e> r0 = r7.f129986F
            java.lang.String r5 = r8.f38990c
            r0.put(r5, r1)
        L_0x00f0:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.f130002g
            if (r0 == 0) goto L_0x011d
            java.lang.String r1 = "srcUsername"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x011d
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.f130002g
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x011d
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.f130002g
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "src_username"
            r0.put(r5, r1)
        L_0x011d:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.f130002g
            if (r0 == 0) goto L_0x014a
            java.lang.String r1 = "srcDisplayname"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x014a
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.f130002g
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x014a
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.f130002g
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "src_displayname"
            r0.put(r5, r1)
        L_0x014a:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.f130002g
            if (r0 == 0) goto L_0x0177
            java.lang.String r1 = "KTemplateId"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0177
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.f130002g
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0177
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.f130002g
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "tempalate_id"
            r0.put(r5, r1)
        L_0x0177:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.f130002g
            if (r0 == 0) goto L_0x0216
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.f38983a
            java.lang.String r5 = "message_id"
            java.lang.Object r0 = r0.get(r5)
            r1.put(r5, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.f130002g
            java.lang.String r5 = "message_index"
            java.lang.Object r1 = r1.get(r5)
            r0.put(r5, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.f130002g
            java.lang.String r5 = "scene"
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r5 = "webview_scene"
            r0.put(r5, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.f130002g
            java.lang.String r5 = "pay_channel"
            java.lang.Object r1 = r1.get(r5)
            r0.put(r5, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.f130002g
            java.lang.String r5 = "pay_scene"
            java.lang.Object r1 = r1.get(r5)
            r0.put(r5, r1)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.f130002g
            java.lang.String r5 = "pay_package"
            java.lang.Object r1 = r1.get(r5)
            r0[r14] = r1
            java.lang.String r1 = "getPackageName %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.f130002g
            java.lang.Object r0 = r0.get(r5)
            if (r0 == 0) goto L_0x01e3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.f130002g
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r5 = "pay_packageName"
            r0.put(r5, r1)
        L_0x01e3:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.f130002g
            java.lang.String r5 = "stastic_scene"
            java.lang.Object r1 = r1.get(r5)
            r0.put(r5, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.f130002g
            java.lang.String r5 = "from_scence"
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r5 = "open_from_scene"
            r0.put(r5, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.tencent.mm.ui.widget.MMWebView r5 = r7.f129996a
            java.lang.String r5 = r5.getUrl()
            java.lang.String r13 = "__jsapi_fw_ext_info_key_current_url"
            r1.putString(r13, r5)
            java.lang.String r5 = "__jsapi_fw_ext_info"
            r0.put(r5, r1)
        L_0x0216:
            com.tencent.mm.ui.widget.MMWebView r0 = r7.f129996a
            java.lang.String r1 = "request"
            if (r0 == 0) goto L_0x02b0
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "shareWeibo"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02b0
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "openUrlByExtBrowser"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02b0
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "log"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02b0
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "openUrlWithExtraWebview"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02b0
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "openCustomWebview"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02b0
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "openGameWebView"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02b0
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "addToEmoticon"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02b0
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "shareEmoticon"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02b0
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "openGameUrlWithExtraWebView"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02b0
            java.lang.String r0 = r8.f38996i
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02b0
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "handleMPPageAction"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02b0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            com.tencent.mm.ui.widget.MMWebView r5 = r7.f129996a
            java.lang.String r5 = r5.getUrl()
            java.lang.String r13 = "url"
            r0.put(r13, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "cuiqi wv.getUrl:"
            r0.append(r5)
            com.tencent.mm.ui.widget.MMWebView r5 = r7.f129996a
            java.lang.String r5 = r5.getUrl()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x02b0:
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "openDesignerEmojiView"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 != 0) goto L_0x02fc
            java.lang.String r0 = r8.f38996i
            java.lang.String r13 = "openEmotionDetailViewLocal"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x02fc
            java.lang.String r0 = r8.f38996i
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 != 0) goto L_0x02fc
            java.lang.String r0 = r8.f38996i
            java.lang.String r13 = "openDesignerEmojiViewLocal"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 != 0) goto L_0x02fc
            java.lang.String r0 = r8.f38996i
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 != 0) goto L_0x02fc
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "openDesignerProfile"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 != 0) goto L_0x02fc
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "openDesignerProfileLocal"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 != 0) goto L_0x02fc
            java.lang.String r0 = r8.f38996i
            java.lang.String r5 = "getSearchEmotionData"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x031c
        L_0x02fc:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            long r15 = r27.mo73257s()
            java.lang.Long r5 = java.lang.Long.valueOf(r15)
            java.lang.String r13 = "searchID"
            r0.put(r13, r5)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            long r15 = r27.mo73257s()
            java.lang.Long r5 = java.lang.Long.valueOf(r15)
            r0[r14] = r5
            java.lang.String r5 = "emoji search id:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r5, r0)
        L_0x031c:
            java.lang.String r0 = r8.f38996i
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x033a
            java.lang.String r0 = r7.f129990J
            if (r0 == 0) goto L_0x032f
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.f38983a
            java.lang.String r5 = "key_request_full_url_query"
            r1.put(r5, r0)
        L_0x032f:
            java.lang.String r0 = r7.f129991K
            if (r0 == 0) goto L_0x033a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.f38983a
            java.lang.String r5 = "key_request_header"
            r1.put(r5, r0)
        L_0x033a:
            java.lang.String r0 = r8.f38996i
            java.lang.String r1 = "imagePreview"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x034c
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            com.tencent.mm.ui.widget.MMWebView r1 = r7.f129996a
            r5 = 0
            com.tencent.p014mm.plugin.webview.modeltools.C6085v.m5953d(r0, r1, r5)
        L_0x034c:
            java.lang.String r0 = r8.f38996i
            java.lang.String r1 = "preVerifyJSAPI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0366
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38983a
            java.lang.String r1 = "verifyOpenTagList"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0366
            com.tencent.mm.plugin.webview.webcompt.c$b r0 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
            r0.mo69194l(r14)
        L_0x0366:
            java.lang.String r13 = ""
            if (r29 == 0) goto L_0x036d
            r0 = r29
            goto L_0x0373
        L_0x036d:
            d93.h r0 = r7.f130010o     // Catch:{ Exception -> 0x0495 }
            com.tencent.mm.protocal.JsapiPermissionWrapper r0 = r0.mo70860c()     // Catch:{ Exception -> 0x0495 }
        L_0x0373:
            android.os.Bundle r15 = new android.os.Bundle     // Catch:{ Exception -> 0x0495 }
            r15.<init>()     // Catch:{ Exception -> 0x0495 }
            if (r0 == 0) goto L_0x039e
            byte[] r1 = r0.f121048d     // Catch:{ Exception -> 0x03cd }
            java.lang.String r5 = "jsapi_perm_wrapper_bytes"
            r15.putByteArray(r5, r1)     // Catch:{ Exception -> 0x03cd }
            int r1 = r0.f121049e     // Catch:{ Exception -> 0x03cd }
            java.lang.String r5 = "jsapi_perm_wrapper_hardcodePermission"
            r15.putInt(r5, r1)     // Catch:{ Exception -> 0x03cd }
            int[] r1 = r0.mo69441c()     // Catch:{ Exception -> 0x03cd }
            java.lang.String r5 = "jsapi_perm_wrapper_blacklist"
            r15.putIntArray(r5, r1)     // Catch:{ Exception -> 0x03cd }
            int[] r1 = r0.mo69445e()     // Catch:{ Exception -> 0x03cd }
            java.lang.String r5 = "jsapi_perm_wrapper_whitelist"
            r15.putIntArray(r5, r1)     // Catch:{ Exception -> 0x03cd }
            goto L_0x039e
        L_0x039b:
            r1 = 0
            goto L_0x0498
        L_0x039e:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.f38983a     // Catch:{ Exception -> 0x0495 }
            android.os.Bundle r1 = t83.C13851h1.m13139b(r1)     // Catch:{ Exception -> 0x0495 }
            java.lang.String r5 = r7.f129981A     // Catch:{ Exception -> 0x0495 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x0495 }
            if (r5 != 0) goto L_0x03cf
            java.lang.String r5 = r7.f129981A     // Catch:{ Exception -> 0x03cd }
            r1.putString(r4, r5)     // Catch:{ Exception -> 0x03cd }
            java.lang.String r5 = r7.f129982B     // Catch:{ Exception -> 0x03cd }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r13)     // Catch:{ Exception -> 0x03cd }
            r1.putString(r3, r5)     // Catch:{ Exception -> 0x03cd }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.f38983a     // Catch:{ Exception -> 0x03cd }
            java.lang.String r11 = r7.f129981A     // Catch:{ Exception -> 0x03cd }
            r5.put(r4, r11)     // Catch:{ Exception -> 0x03cd }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.f38983a     // Catch:{ Exception -> 0x03cd }
            java.lang.String r5 = r7.f129982B     // Catch:{ Exception -> 0x03cd }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r13)     // Catch:{ Exception -> 0x03cd }
            r4.put(r3, r5)     // Catch:{ Exception -> 0x03cd }
            goto L_0x03cf
        L_0x03cd:
            r0 = move-exception
            goto L_0x039b
        L_0x03cf:
            com.tencent.mm.plugin.webview.core.BaseWebViewController r3 = r7.f130009n     // Catch:{ Exception -> 0x0495 }
            if (r3 == 0) goto L_0x03e3
            java.lang.String r3 = r3.mo63683n0()     // Catch:{ Exception -> 0x03cd }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r13)     // Catch:{ Exception -> 0x03cd }
            r1.putString(r2, r3)     // Catch:{ Exception -> 0x03cd }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.f38983a     // Catch:{ Exception -> 0x03cd }
            r4.put(r2, r3)     // Catch:{ Exception -> 0x03cd }
        L_0x03e3:
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ Exception -> 0x0495 }
            r11.<init>(r6)     // Catch:{ Exception -> 0x0495 }
            android.os.Bundle r2 = r8.f38992e     // Catch:{ Exception -> 0x0495 }
            if (r2 == 0) goto L_0x03f8
            java.lang.String r3 = "jsEngine"
            r11.putBundle(r3, r2)     // Catch:{ Exception -> 0x03cd }
            if (r1 != 0) goto L_0x03f8
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Exception -> 0x03cd }
            r1.<init>()     // Catch:{ Exception -> 0x03cd }
        L_0x03f8:
            java.lang.String r2 = "compatParams"
            r11.putBundle(r2, r1)     // Catch:{ Exception -> 0x0495 }
            org.json.JSONObject r1 = r8.f38991d     // Catch:{ Exception -> 0x0495 }
            if (r1 == 0) goto L_0x040a
            java.lang.String r2 = "rawParams"
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x03cd }
            r11.putString(r2, r1)     // Catch:{ Exception -> 0x03cd }
        L_0x040a:
            java.lang.String r1 = "dealNextMsg start %s"
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0495 }
            java.lang.String r3 = r8.f38996i     // Catch:{ Exception -> 0x0495 }
            r2[r14] = r3     // Catch:{ Exception -> 0x0495 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r9, r1, r2)     // Catch:{ Exception -> 0x0495 }
            t83.l$$m0 r1 = r7.f130015t     // Catch:{ Exception -> 0x0495 }
            if (r1 == 0) goto L_0x0420
            boolean r1 = r1.mo63697a(r8, r0)     // Catch:{ Exception -> 0x03cd }
            r16 = r1
            goto L_0x0422
        L_0x0420:
            r16 = 0
        L_0x0422:
            if (r16 != 0) goto L_0x0443
            t83.j r6 = new t83.j     // Catch:{ Exception -> 0x043f }
            android.content.Context r2 = r27.mo73255r()     // Catch:{ Exception -> 0x043f }
            com.tencent.mm.plugin.webview.stub.l r4 = r7.f130007l     // Catch:{ Exception -> 0x043f }
            com.tencent.mm.ui.widget.MMWebView r5 = r7.f129996a     // Catch:{ Exception -> 0x043f }
            r1 = r6
            r3 = r0
            r0 = r5
            r5 = r27
            r14 = r6
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x043f }
            t83.n1 r0 = t83.C13862n1.f39019a     // Catch:{ Exception -> 0x043f }
            boolean r16 = r0.mo13195a(r14, r8)     // Catch:{ Exception -> 0x043f }
            goto L_0x0443
        L_0x043f:
            r0 = move-exception
        L_0x0440:
            r1 = 0
            r14 = 0
            goto L_0x049a
        L_0x0443:
            r1 = r16
            if (r1 == 0) goto L_0x045c
            java.lang.String r0 = "dealNextMsg intercepted %s"
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0456 }
            java.lang.String r3 = r8.f38996i     // Catch:{ Exception -> 0x0456 }
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0456 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r9, r0, r2)     // Catch:{ Exception -> 0x0456 }
            r0 = 1
            goto L_0x04c6
        L_0x0456:
            r0 = move-exception
            r16 = r1
            r1 = 0
            r14 = 1
            goto L_0x049a
        L_0x045c:
            com.tencent.mm.plugin.webview.stub.l r0 = r7.f130007l     // Catch:{ Exception -> 0x0491 }
            if (r0 == 0) goto L_0x048f
            android.content.Context r0 = r27.mo73255r()     // Catch:{ Exception -> 0x0491 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x0491 }
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106145B(r0)     // Catch:{ Exception -> 0x0491 }
            if (r0 == 0) goto L_0x0473
            java.lang.String r0 = "CurUIDarkMode"
            r11.putInt(r0, r10)     // Catch:{ Exception -> 0x0491 }
        L_0x0473:
            com.tencent.mm.plugin.webview.stub.l r0 = r7.f130007l     // Catch:{ Exception -> 0x0491 }
            java.lang.String r2 = r8.f38989b     // Catch:{ Exception -> 0x0491 }
            java.lang.String r3 = r8.f38996i     // Catch:{ Exception -> 0x0491 }
            java.lang.String r4 = r8.f38990c     // Catch:{ Exception -> 0x0491 }
            int r5 = r7.f130014s     // Catch:{ Exception -> 0x0491 }
            r6 = r15
            r15 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r6
            r20 = r11
            r21 = r5
            boolean r1 = r15.V50(r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0491 }
        L_0x048f:
            r0 = 0
            goto L_0x04c6
        L_0x0491:
            r0 = move-exception
            r16 = r1
            goto L_0x0440
        L_0x0495:
            r0 = move-exception
            r1 = 0
            r14 = 0
        L_0x0498:
            r16 = 0
        L_0x049a:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r13, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleMsg, ex = "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38995h
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r12, r1)
            r0 = r14
            r1 = r16
        L_0x04c6:
            int r2 = com.tencent.p014mm.plugin.webview.modeltools.C6085v.f22418b
            long r2 = java.lang.System.currentTimeMillis()
            com.tencent.p014mm.plugin.webview.modeltools.C6085v.f22417a = r2
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r8.f38996i
            r4 = 0
            r2[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2[r10] = r3
            java.lang.String r3 = "dealNextMsg, %s, handleRet = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r2)
            if (r1 == 0) goto L_0x04ee
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.f38995h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r12, r3)
        L_0x04ee:
            if (r1 == 0) goto L_0x04f5
            if (r0 == 0) goto L_0x04f3
            goto L_0x04f5
        L_0x04f3:
            r1 = 0
            return r1
        L_0x04f5:
            return r10
        L_0x04f6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dealNextMsg fail, can cause nullpointer, function = "
            r0.append(r1)
            java.lang.String r1 = r8.f38996i
            r0.append(r1)
            java.lang.String r1 = ", params = "
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.f38983a
            r0.append(r1)
            java.lang.String r1 = ", type = "
            r0.append(r1)
            java.lang.String r1 = r8.f38989b
            r0.append(r1)
            java.lang.String r1 = ", wv = "
            r0.append(r1)
            com.tencent.mm.ui.widget.MMWebView r1 = r7.f129996a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f38995h
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r12, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t83.C48590l.mo73249o(t83.h1, com.tencent.mm.protocal.JsapiPermissionWrapper, android.os.Bundle, t83.e):boolean");
    }

    /* renamed from: o0 */
    public void mo73250o0(String str, int i) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onVoiceUploadProgress fail, not ready");
            return;
        }
        Log.m105925i("MicroMsg.JsApiHandler", "onVoiceUploadProgress, local id : %s, percent : %d", str, Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put(C66261f3.COL_LOCALID, str);
        hashMap.put("percent", Integer.valueOf(i));
        MMHandlerThread.postToMainThread(new l$$l(this, C13851h1.C13852a.m13143c("onVoiceUploadProgress", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: p */
    public void mo73251p() {
        mo73245m();
        this.f130003h = false;
        this.f130000e.clear();
        ((LinkedList) this.f129999d).clear();
        this.f130001f = null;
        C48302a aVar = this.f130021z;
        aVar.getClass();
        C45511f0 Pl = ((C45518r0) C86312j.m106911c(C45518r0.class)).mo70754Pl();
        C48302a.C48303a aVar2 = aVar.f129352b;
        ((C48618a) Pl).getClass();
        C87412m.m108594g(aVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ArrayList<C45511f0.C45512a> arrayList = C48618a.f130144b;
        synchronized (arrayList) {
            Log.m105919d("MicroMsg.WebViewExtEventService", "unregisterOnImagePreviewPositionChangedListener size: %s", Integer.valueOf(arrayList.size()));
            arrayList.remove(aVar2);
        }
    }

    /* renamed from: p0 */
    public void mo73252p0(String str, int i) {
        if (!this.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onExdeviceStateChange fail, not ready");
            return;
        }
        Log.m105925i("MicroMsg.JsApiHandler", "onExdeviceStateChange: device id = %s, state = %s", str, Integer.valueOf(i));
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.JsApiHandler", "parameter error!!!");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceId", str);
        if (i == 2) {
            hashMap.put("state", "connected");
        } else if (i == 1) {
            hashMap.put("state", "connecting");
        } else {
            hashMap.put("state", "disconnected");
        }
        MMHandlerThread.postToMainThread(new l$$e(this, C13851h1.C13852a.m13143c("onWXDeviceStateChange", hashMap, this.f130011p, this.f130012q)));
    }

    /* renamed from: q */
    public String mo73253q(String str) {
        Context r = mo73255r();
        return r instanceof C5853h ? ((C5853h) r).mo6898S(str) : "";
    }

    /* renamed from: q0 */
    public void mo73254q0(boolean z, boolean z2) {
        if (!this.f130003h) {
            Log.m105921e("MicroMsg.JsApiHandler", "onWindowFocusChanged fail, not ready %b", Boolean.valueOf(z));
        } else if (this.f129996a != null) {
            C45696d dVar = (C45696d) C86709a0.m107533q(C45696d.class);
            if (z2 || dVar == null || dVar.B60(this.f129996a.getUrl())) {
                Log.m105918d("MicroMsg.JsApiHandler", "onWindowFocusChanged, hasFocus = " + z);
                HashMap hashMap = new HashMap();
                hashMap.put("hasFocus", Integer.valueOf(z ? 1 : 0));
                String c = C13851h1.C13852a.m13143c("onWindowFocusChanged", hashMap, this.f130011p, this.f130012q);
                ((C119157j) C119157j.f356862d).mo183895z(new l$$g(this, c));
            }
        }
    }

    /* renamed from: r */
    public Context mo73255r() {
        if (this.f129989I) {
            Context context = this.f129998c;
            return context != null ? context : MMApplicationContext.getContext();
        }
        MMWebView mMWebView = this.f129996a;
        if (mMWebView == null) {
            return null;
        }
        return mMWebView.getActivityContextIfHas();
    }

    /* renamed from: r0 */
    public final void mo73256r0(Bundle bundle, String str) {
        if (bundle == null) {
            Log.m105928w("MicroMsg.JsApiHandler", "sendDataWithSetData data is null");
            return;
        }
        MMHandler mMHandler = this.f130001f;
        if (mMHandler != null) {
            mMHandler.post(new l$$b(this, bundle, str));
        }
    }

    /* renamed from: s */
    public long mo73257s() {
        Log.m105919d("MicroMsg.JsApiHandler", "cpan emoji get SearchID:%d", Long.valueOf(this.f129994N));
        return this.f129994N;
    }

    /* renamed from: s0 */
    public void mo73258s0(boolean z) {
        this.f130004i = z;
        if (z) {
            synchronized (this) {
                if (this.f129983C.size() > 0) {
                    Iterator it = this.f129983C.entrySet().iterator();
                    while (!mo73264w0() && it.hasNext()) {
                        String str = (String) ((Map.Entry) it.next()).getValue();
                        if (!Util.isNullOrNil(str)) {
                            _sendMessage(str);
                        }
                    }
                    this.f129983C.clear();
                }
            }
            return;
        }
        this.f130005j = System.currentTimeMillis();
    }

    /* renamed from: t0 */
    public void mo73259t0(boolean z) {
        if (this.f130011p != z) {
            this.f130011p = z;
            String randomString = C90183c.m112859g(this.f129996a.getRandomStr()) ? Util.getRandomString(16) : this.f129996a.getRandomStr();
            this.f130012q = randomString;
            Log.m105925i("MicroMsg.JsApiHandler", "js digest verification randomStr = %s, hashCode: %d", randomString, Integer.valueOf(hashCode()));
        }
    }

    /* renamed from: u */
    public C45520t mo8704u() {
        return this.f130009n;
    }

    /* renamed from: u0 */
    public void mo73260u0(int i, String str, int i2) {
        if (this.f130003h) {
            HashMap hashMap = new HashMap();
            hashMap.put("recommend", Integer.valueOf(i));
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str);
            hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(i2));
            String c = C13851h1.C13852a.m13143c("menu:haokan", hashMap, this.f130011p, this.f130012q);
            MMWebView mMWebView = this.f129996a;
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
        }
    }

    /* renamed from: v */
    public void mo73261v(boolean z) {
        C43791l lVar;
        List<String> list;
        Log.m105925i("MicroMsg.JsApiHandler", "getHtmlContent, ready(%s).", Boolean.valueOf(this.f130003h));
        MMWebView mMWebView = this.f129996a;
        if (mMWebView != null && (lVar = this.f130007l) != null && this.f130003h) {
            if (z) {
                mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + C13851h1.C13852a.m13143c("sys:get_html_content", new HashMap(), this.f130011p, this.f130012q) + ")", (ValueCallback<String>) null);
                return;
            }
            try {
                list = lVar.tf0();
            } catch (RemoteException e) {
                Log.printErrStackTrace("MicroMsg.JsApiHandler", e, "", new Object[0]);
                list = null;
            }
            Uri parse = Uri.parse(this.f129996a.getUrl());
            if (parse != null) {
                Log.m105918d("MicroMsg.JsApiHandler", "wv hijack url host" + parse.getHost());
            }
            if (list != null && parse != null && list.contains(parse.getHost())) {
                this.f129996a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + C13851h1.C13852a.m13143c("sys:get_html_content", new HashMap(), this.f130011p, this.f130012q) + ")", (ValueCallback<String>) null);
            }
        }
    }

    /* renamed from: v0 */
    public void mo73262v0(boolean z) {
        this.f130003h = z;
        Log.m105925i("MicroMsg.JsApiHandler", "js ready %b", Boolean.valueOf(z));
    }

    /* renamed from: w */
    public final String mo73263w(String str, int i) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("url", str);
        hashMap.put("set_cookie", Integer.valueOf(i));
        return m53980t(C13851h1.C13852a.m13143c("onGetA8KeyUrl", hashMap, this.f130011p, this.f130012q));
    }

    /* renamed from: w0 */
    public final boolean mo73264w0() {
        if (!this.f130004i) {
            C5843f0 f0Var = C5843f0.f22025a;
            return ((Boolean) ((C36570n) C5843f0.f22028d).getValue()).booleanValue() && System.currentTimeMillis() - this.f130005j > ((long) ((Number) ((C36570n) C5843f0.f22026b).getValue()).intValue()) && !(this.f129996a instanceof BaseWebSearchWebView);
        }
        return false;
    }

    /* renamed from: x */
    public Bundle mo73265x(int i) {
        try {
            if (this.f129996a == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("WebViewShare_type", i);
            bundle.putInt("WebViewShare_BinderID", this.f130014s);
            bundle.putString("WebViewShare_wv_url", this.f129996a.getUrl());
            BaseWebViewController baseWebViewController = this.f130009n;
            if (baseWebViewController != null) {
                bundle.putString("WebViewShare_commit_url", baseWebViewController.f117522C);
            }
            Bundle V5 = this.f130007l.mo68114V5(105, bundle);
            V5.putBoolean("use_update_jsapi_data", true);
            return V5;
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.JsApiHandler", "getShareData err %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: x0 */
    public void mo73266x0() {
        Log.m105924i("MicroMsg.JsApiHandler", "alvinluo updateRandomStr");
        if (this.f130011p && C44625c2.m49078k()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("__event_id", "sys:updateRandomStr");
                jSONObject2.put("randomStr", this.f130012q);
                jSONObject.put("__json_message", jSONObject2);
                MMWebView mMWebView = this.f129996a;
                mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + jSONObject.toString() + ")", new l$$x(this));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: y */
    public final Bundle mo73267y(Map<String, String> map) {
        String str;
        Bundle bundle = new Bundle();
        String url = this.f129996a.getUrl();
        if (map != null) {
            String str2 = map.get("share_report_pre_msg_url");
            if (Util.isNullOrNil(str2)) {
                str2 = url;
            }
            str = map.get("share_report_pre_msg_title");
            if (Util.isNullOrNil(str)) {
                str = this.f129996a.getTitle();
            }
            String str3 = map.get("share_report_pre_msg_desc");
            if (Util.isNullOrNil(str3)) {
                str3 = url;
            }
            bundle.putString("link", str2);
            bundle.putString("desc", str3);
            bundle.putString("img_url", Util.nullAsNil(map.get("share_report_pre_msg_icon_url")));
            bundle.putString("appid", Util.nullAsNil(map.get("share_report_pre_msg_appid")));
        } else {
            str = this.f129996a.getTitle();
            bundle.putString("link", url);
            bundle.putString("desc", url);
            bundle.putString("img_url", "");
        }
        if (Util.isNullOrNil(str)) {
            if (!Util.isNullOrNil(url)) {
                Uri parse = Uri.parse(url);
                if (parse.getHost() != null) {
                    url = parse.getHost();
                }
                str = url;
            } else {
                str = MMApplicationContext.getContext().getString(C0966R.string.f361639lg0);
            }
        }
        bundle.putString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str);
        bundle.putBoolean("use_update_jsapi_data", false);
        return bundle;
    }

    /* renamed from: z */
    public C44463z mo73268z() {
        if (!((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
            Log.m105920e("MicroMsg.JsApiHandler", "AppBrand Expansion is not Installed, WebCompt return null");
            return null;
        }
        if (this.f129995O == null) {
            this.f129995O = new C44463z(this);
        }
        return this.f129995O;
    }

    public C48590l(MMWebView mMWebView, C45310h hVar, int i) {
        this();
        int i2;
        this.f129996a = mMWebView;
        this.f130010o = hVar;
        this.f130014s = i;
        this.f130001f = new C48601q(this, Looper.getMainLooper());
        Object[] objArr = new Object[2];
        if (mMWebView == null) {
            i2 = 0;
        } else {
            i2 = mMWebView.hashCode();
        }
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = Integer.valueOf(hashCode());
        Log.m105925i("MicroMsg.JsApiHandler", "Abe-Debug JsApiHandler<init>, webview: %d, this: %d", objArr);
    }

    public C48590l(MMWebView mMWebView, C45310h hVar, int i, C13853i iVar) {
        this();
        int i2;
        this.f129996a = mMWebView;
        this.f130010o = hVar;
        this.f130014s = i;
        this.f130018w = iVar;
        this.f130001f = new C48601q(this, Looper.getMainLooper());
        Object[] objArr = new Object[3];
        if (mMWebView == null) {
            i2 = 0;
        } else {
            i2 = mMWebView.hashCode();
        }
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = Integer.valueOf(hashCode());
        objArr[2] = iVar;
        Log.m105925i("MicroMsg.JsApiHandler", "Abe-Debug JsApiHandler<init>, webview: %d, this: %d, jsApiPool: %s", objArr);
    }
}
