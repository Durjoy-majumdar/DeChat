package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import bp3.C79758p;
import c00.C0408t;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55511i;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.topstory.p113ui.home.C43255a;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchWebView;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.soter.core.biometric.FaceManager;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebBroadcastListener;
import d62.C75339i;
import di3.C86312j;
import eb0.C31543z5;
import ex0.C45696d;
import ex0.C45698f;
import ex0.C45700h;
import ex0.C45706i;
import f40.C86709a0;
import g83.C59379b;
import g83.C59390n;
import h81.C32735h;
import hc0.C20937c;
import ht1.C60200t1;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import kr0.C76630x0;
import o03.C21723h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p03.C21912d;
import p03.C21914h;
import p167hz.C21031j;
import p227rn.C48050d0;
import p227rn.C48051r;
import p237sp.C90271s;
import p646pn.C110234e;
import qo3.C77407n;
import s03.C22291j;
import s03.C36614d;
import s03.C48214a;
import s03.C77599f;
import s90.C77630j;
import s90.C77631m;
import t03.C22420e;
import t03.C22426h;
import t03.C36929i;
import t83.C13851h1;
import te3.C49768hy;
import te3.C50676og0;
import te3.C51138rp1;
import te3.C51279sp1;
import te3.C52109yf2;
import te3.C52129yk2;
import te3.jh4;
import te3.rh4;
import te3.uh4;
import u73.C101987v0;
import u73.C78137s0;
import yf3.C112441c;
import yf3.C112442d;
import z73.C53759a;
import zd2.C91667a;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e */
public class C19391e extends C59379b<jh4> {

    /* renamed from: i */
    public static HashSet<String> f54729i;

    /* renamed from: c */
    public C43263c f54730c;

    /* renamed from: d */
    public WebSearchWebView f54731d;

    /* renamed from: e */
    public jh4 f54732e;

    /* renamed from: f */
    public LinkedList<C49768hy> f54733f;

    /* renamed from: g */
    public C21031j f54734g;

    /* renamed from: h */
    public boolean f54735h = true;

    static {
        HashSet<String> hashSet = new HashSet<>();
        f54729i = hashSet;
        hashSet.add("launchApplication");
        f54729i.add("openFinderView");
        f54729i.add("openWeApp");
    }

    public C19391e(WebSearchWebView webSearchWebView, jh4 jh4, C43263c cVar, LinkedList<C49768hy> linkedList, C21031j jVar) {
        new LinkedList();
        this.f54731d = webSearchWebView;
        this.f54732e = jh4;
        this.f54730c = cVar;
        this.f54733f = linkedList;
        this.f54734g = jVar;
    }

    @JavascriptInterface
    public void checkHaoKanCommentPermission(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, params = %s.", str);
        Context context = null;
        try {
            WeakReference<Activity> g = AppForegroundDelegate.m161224g();
            if (g.get() != null) {
                context = g.get();
            }
            if (context == null) {
                mo25057o("notifyHaoKanCommentPermission", false, false);
                Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, context = null.");
            } else if (!MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("tophitory_show_comment_dialog", false)) {
                C59390n.f169735a.mo84516c(context, new e$$j(this), false);
            } else {
                mo25057o("notifyHaoKanCommentPermission", true, false);
                Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, isgrant no dilaog.");
            }
        } catch (Exception e) {
            Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyReddot " + e.getMessage());
        }
    }

    @JavascriptInterface
    public void checkHaoKanPermission(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission, params = %s.", str);
        WeakReference<Activity> g = AppForegroundDelegate.m161224g();
        Context context = g.get() != null ? g.get() : null;
        if (context == null) {
            mo25057o("notifyHaoKanPermission", false, false);
            Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission context = null.");
            return;
        }
        try {
            if (!MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("tophitory_show_init_dialog", false)) {
                ((C0408t) C86312j.m106911c(C0408t.class)).mo450FR(context, new e$$i(this), context.getString(C0966R.string.m2i));
                return;
            }
            mo25057o("notifyHaoKanPermission", true, false);
            Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission, is grant no dilaog.");
        } catch (Exception e) {
            Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyReddot " + e.getMessage());
        }
    }

    @JavascriptInterface
    public void createWebViewForFastLoad(String str) {
        try {
            Log.m105927v("MicroMsg.TopStory.TopStoryWebViewJSApi", "createWebViewForFastLoad %s", str);
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
            JSONArray optJSONArray = jSONObject.optJSONArray("itemShowTypes");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    int optInt2 = optJSONArray.optInt(i, -1);
                    if (optInt2 != -1) {
                        arrayList.add(Integer.valueOf(optInt2));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add(0);
            }
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "createWebViewForFastLoad openScene: %d, itemShowTypeList: %s", Integer.valueOf(optInt), arrayList);
            ((C45696d) C86709a0.m107533q(C45696d.class)).mo70988e3(optInt, arrayList);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "createWebViewForFastLoad exception", new Object[0]);
        }
    }

    @JavascriptInterface
    public String doGoToRecVideoList(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doGoToRecVideoList %s", str);
        try {
            uh4 n = C21914h.m25166n(new JSONObject(str));
            if (mo25054l() != null) {
                C101987v0.m134279m(mo25054l().mo24914t(), n, 1);
            }
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "doGoToRecVideoList", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public void doNegFeedback(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doNegFeedback %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("filterDocid")) {
                return;
            }
            if (jSONObject.has("category")) {
                String string = jSONObject.getString("filterDocid");
                ((C22420e) C86312j.m106911c(C22420e.class)).T60().mo67493a(jSONObject.getInt("category"), string);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "doNegFeedback", new Object[0]);
        }
    }

    @JavascriptInterface
    public void downloadPageDataForFastLoad(String str) {
        Class cls = C45696d.class;
        try {
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "downloadPageDataForFastLoad params: %s", str);
            JSONArray optJSONArray = new JSONObject(str).optJSONArray("itemList");
            if (optJSONArray != null) {
                if (optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("url", "");
                            if (!Util.isNullOrNil(optString)) {
                                int optInt = optJSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
                                if (!((C45696d) C86709a0.m107533q(cls)).mo70957E5(optInt)) {
                                    Log.m105929w("MicroMsg.TopStory.TopStoryWebViewJSApi", "downloadPageDataForFastLoad can not preload openScene: %d", Integer.valueOf(optInt));
                                } else {
                                    int optInt2 = optJSONObject.optInt("item_show_type", -1);
                                    Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "downloadPageDataForFastLoad itemShowType: %d, openScene: %d, url: %s", Integer.valueOf(optInt2), Integer.valueOf(optInt), optString);
                                    ((C45696d) C86709a0.m107533q(cls)).Tn0(optString, optInt2, optInt, new Object[0]);
                                }
                            }
                        }
                    }
                    return;
                }
            }
            Log.m105920e("MicroMsg.TopStory.TopStoryWebViewJSApi", "downloadPageDataForFastLoad item list is empty");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "createWebViewForFastLoad exception", new Object[0]);
        }
    }

    @JavascriptInterface
    public void extTransfer(String str) {
        String str2;
        TransferRequestInfo transferRequestInfo;
        Exception e;
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "TopStoryTransfer extTransfer, paramsStr = %s", str);
        TransferRequestInfo transferRequestInfo2 = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            str2 = jSONObject.optString("objectid", "");
            try {
                transferRequestInfo = new TransferRequestInfo();
                try {
                    transferRequestInfo.f109024d = 1;
                    transferRequestInfo.f109026f = jSONObject.optString("scope", "");
                    C52129yk2 yk22 = new C52129yk2();
                    transferRequestInfo.f109028h = yk22;
                    yk22.f145341d = jSONObject.optString("reqUrl", "");
                    transferRequestInfo.f109028h.f145342e = jSONObject.optString("reqBody", "");
                    transferRequestInfo.f109028h.f145343f = Util.safeParseInt(jSONObject.optString("cgiCmdId", ""));
                    transferRequestInfo.f109028h.f145345h = Util.safeParseInt(jSONObject.optString(FirebaseAnalytics.C113379b.METHOD, ""));
                    transferRequestInfo.f109029i = jSONObject.optBoolean("is_security_check", false);
                    transferRequestInfo.f109035r = Util.nullAs(mo25056n(jSONObject.optString("debug_env", "")), "");
                    transferRequestInfo.f109025e = "weixin://resourceid/TopStories/";
                    try {
                        String optString = jSONObject.optString("header", "");
                        if (!Util.isNullOrNil(optString)) {
                            JSONObject jSONObject2 = new JSONObject(optString);
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String optString2 = jSONObject2.optString(next, "");
                                C52109yf2 yf22 = new C52109yf2();
                                yf22.f145258d = next;
                                yf22.f145259e = optString2;
                                transferRequestInfo.f109028h.f145344g.push(yf22);
                            }
                        }
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e2, "TopStoryTransfer extTransfer parseTransferRequestInfo exception", new Object[0]);
                    }
                } catch (Exception e3) {
                    e = e3;
                    transferRequestInfo2 = transferRequestInfo;
                }
            } catch (Exception e4) {
                e = e4;
                Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "TopStoryTransfer extTransfer", new Object[0]);
                transferRequestInfo = transferRequestInfo2;
                ((C45698f) C86709a0.m107533q(C45698f.class)).mo71195RT(transferRequestInfo, new e$$p(this, str2));
            }
        } catch (Exception e5) {
            e = e5;
            str2 = "";
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "TopStoryTransfer extTransfer", new Object[0]);
            transferRequestInfo = transferRequestInfo2;
            ((C45698f) C86709a0.m107533q(C45698f.class)).mo71195RT(transferRequestInfo, new e$$p(this, str2));
        }
        ((C45698f) C86709a0.m107533q(C45698f.class)).mo71195RT(transferRequestInfo, new e$$p(this, str2));
    }

    @JavascriptInterface
    public String fetchNumReddot(String str) {
        rh4 first;
        Class cls = C21912d.class;
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl fetchNumReddot %s", str);
        try {
            int p = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo34005p();
            rh4 o = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo34004o();
            C21723h hVar = (C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4();
            synchronized (hVar.f61500d) {
                first = Util.isNullOrNil((List) hVar.f61500d) ? null : hVar.f61500d.getFirst();
            }
            mo25065p(first.f64533d, o.f64533d, first.f64546t, o.f64546t, p, o.f64547u);
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String fetchReddot(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl fetchReddot %s", str);
        try {
            rh4 rh4 = ((C21723h) ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4()).f61498b;
            if (rh4 != null) {
                mo25068q(rh4.f64533d, rh4.f64541o, rh4.f64538i);
            }
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String getSearchData(String str) {
        Class cls = C110234e.class;
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "getSearchData %s", str);
        if (mo25054l() != null) {
            mo25054l().mo24893R5();
        }
        C22426h.m26099a(this.f54732e, "getSearchData", C31543z5.m39453c());
        try {
            JSONObject jSONObject = new JSONObject(str);
            jh4 jh4 = new jh4();
            jh4.f64038p = this.f54732e.f64038p;
            jh4.f64033h = jSONObject.optString(SearchIntents.EXTRA_QUERY, "");
            jh4.f64032g = jSONObject.optInt("offset", 0);
            jh4.f64034i = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 21);
            jh4.f64030e = jSONObject.optString("sessionId", "");
            jh4.f64031f = jSONObject.optString("subSessionId", "");
            jh4.f64029d = jSONObject.optString("searchId", "");
            jh4.f64036n = jSONObject.optString("requestId", "");
            jh4.f64041s = jSONObject.optInt("tagId", 0);
            jh4.f64042t = jSONObject.optString("navigationId", "");
            jh4.f64045w = C43471q.m46979c();
            jh4.f64028D = jSONObject.optBoolean("directRequest", false);
            jh4.f64026B = jSONObject.optString("homeMsgId", "");
            jh4.f64027C = jSONObject.optString("redPointMsgId", "");
            String optString = jSONObject.optString("extReqParams", "");
            if (!Util.isNullOrNil(optString)) {
                JSONArray jSONArray = new JSONArray(optString);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    C49768hy hyVar = new C49768hy();
                    hyVar.f134951d = jSONObject2.optString("key", "");
                    hyVar.f134952e = (long) jSONObject2.optInt("uintValue", 0);
                    hyVar.f134953f = jSONObject2.optString("textValue", "");
                    jh4.f64037o.add(hyVar);
                }
            }
            LinkedList<C49768hy> linkedList = this.f54733f;
            if (linkedList != null && !linkedList.isEmpty()) {
                jh4.f64037o.addAll(this.f54733f);
            }
            if (((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149148x().size() > 0) {
                jh4.f64025A = new C51138rp1();
                for (BallInfo next : ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149148x()) {
                    if (next.f311686d == 2) {
                        String h = next.mo149045h("rawUrl", "");
                        if (!Util.isNullOrNil(h)) {
                            if (!h.startsWith(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/s")) {
                                if (!h.startsWith(HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/s")) {
                                }
                            }
                            C51279sp1 sp12 = new C51279sp1();
                            sp12.f141662d = h;
                            jh4.f64025A.f141071d.add(sp12);
                            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "add float ball url %s", h);
                        }
                    }
                }
            }
            int f = C79758p.f233760a.mo109883f(new C112442d());
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "channelId = %s directRequest = %s preRequestMode = %s", Integer.valueOf(jh4.f64041s), Boolean.valueOf(jh4.f64028D), Integer.valueOf(f));
            if (f == 1) {
                this.f54730c.mo67501d(jh4, true, jh4.f64028D, mo25054l() == null ? 0 : mo25054l().mo24892J4());
            } else {
                if (f == 2) {
                    jh4.f64028D = false;
                }
                String c = this.f54730c.mo67500c(jh4);
                if (Util.isNullOrNil(c) || jh4.f64028D) {
                    this.f54730c.mo67501d(jh4, true, jh4.f64028D, mo25054l() == null ? 0 : mo25054l().mo24892J4());
                } else {
                    Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "use cache callback");
                    mo25072s(c);
                }
            }
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "getSearchData", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String getSearchDisplayNameList(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new JSONObject(str).optString("data"));
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String str2 = "";
                String string = jSONObject.has("id") ? jSONObject.getString("id") : str2;
                if (jSONObject.has("userName")) {
                    str2 = jSONObject.getString("userName");
                }
                String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", string);
                jSONObject2.put("userName", str2);
                jSONObject2.put("displayName", displayName);
                jSONArray2.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ret", 0);
            jSONObject3.put("data", jSONArray2.toString());
            return jSONObject3.toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "getSearchDisplayNameList", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String getTopStoryTabConfig(String str) {
        return C78137s0.m94340d("topstoryTopTabParam").toString();
    }

    @JavascriptInterface
    public String hideNavBarShadow(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl hideNavBarShadow %s", str);
        try {
            mo25054l().mo24911m3();
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    /* renamed from: i */
    public int mo25052i() {
        return 2;
    }

    /* renamed from: k */
    public final void mo25053k(String str, HashMap<String, Object> hashMap) {
        this.f54731d.post(new e$$c(this, C13851h1.C13852a.m13141a(str, hashMap, false, "")));
    }

    /* renamed from: l */
    public final C43255a mo25054l() {
        C53759a aVar = this.f150904a;
        if (aVar != null) {
            return (C43255a) aVar;
        }
        return null;
    }

    /* renamed from: m */
    public final Context mo25055m() {
        if (mo25054l() == null) {
            return MMApplicationContext.getContext();
        }
        Context k0 = mo25054l().mo24908k0();
        return k0 != null ? k0 : MMApplicationContext.getContext();
    }

    /* renamed from: n */
    public final String mo25056n(String str) {
        IPCString iPCString;
        if (!C45706i.m50950a() || (iPCString = (IPCString) C80907o.m98783f(WeChatProcess.PROCESS_PUSH, new IPCString(str), e$$o.class)) == null) {
            return null;
        }
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "getTransferDebugIPSync key: %s, result: %s", str, iPCString.f10315d);
        return iPCString.f10315d;
    }

    /* renamed from: o */
    public final void mo25057o(String str, boolean z, boolean z2) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyJsEvent, fun = %s, granted = %s, dialogShowed = %s.", str, Boolean.valueOf(z), Boolean.valueOf(z2));
        MMHandlerThread.postToMainThread(new e$$k(this, z, z2, str));
    }

    @JavascriptInterface
    public void onWebPageUrlExposed(String str) {
        Class cls = C45700h.class;
        try {
            Log.m105919d("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebPageUrlExposed %s", str);
            JSONObject jSONObject = new JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray("urlList");
            if (optJSONArray != null) {
                if (optJSONArray.length() > 0) {
                    int optInt = jSONObject.optInt("bizType", 0);
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("url", "");
                            if (!Util.isNullOrNil(optString)) {
                                C45700h.C45702b bVar = new C45700h.C45702b();
                                bVar.f123504a = optString;
                                bVar.f123512i = optJSONObject.optString("extInfo", "");
                                bVar.f123506c = 213;
                                bVar.f123513j = optJSONObject.optInt("bizScene", 0);
                                bVar.f123505b = optJSONObject.optString("prefetchId", "");
                                arrayList.add(bVar);
                            }
                        }
                    }
                    Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebPageUrlExposed bizType: %s, preAuthInfoList size: %s", Integer.valueOf(optInt), Integer.valueOf(arrayList.size()));
                    if (arrayList.isEmpty()) {
                        Log.m105920e("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebPageUrlExposed preAuthList is empty");
                        return;
                    } else if (optInt == 1) {
                        ((C45700h) C86709a0.m107533q(cls)).mo71034Ym(arrayList);
                        return;
                    } else {
                        ((C45700h) C86709a0.m107533q(cls)).mo71031UP(arrayList);
                        return;
                    }
                }
            }
            Log.m105920e("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebPageUrlExposed url list is empty");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "onWebPageUrlExposed exception", new Object[0]);
        }
    }

    @JavascriptInterface
    public String openFinderFeed(String str) {
        Class cls = C60200t1.class;
        try {
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openFinderFeed %s", str);
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("feedId", jSONObject.optString("feedId", ""));
            jSONObject2.put("extInfo", new JSONObject(jSONObject.optString("extInfo", "")));
            jSONObject2.put(TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, jSONObject.optString(TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, ""));
            Intent intent = new Intent();
            intent.putExtra("tab_type", 7);
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(7, 2, 25, intent);
            ((C60200t1) C86312j.m106911c(cls)).mo76781MY(mo25055m(), jSONObject2.toString(), intent);
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, C55511i.NAME, new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String openFinderProfile(String str) {
        Class cls = C60200t1.class;
        try {
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openFinderProfile %s", str);
            String optString = new JSONObject(str).optString("userName", "");
            Intent intent = new Intent();
            intent.putExtra("finder_username", optString);
            intent.putExtra("report_scene", 15);
            intent.putExtra("key_enter_profile_type", 1);
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(7, 2, 32, intent);
            ((C60200t1) C86312j.m106911c(cls)).mo76819V1(mo25055m(), intent);
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, C55511i.NAME, new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String openProfileWithOpenId(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openProfileWithOpenId %s", str);
        try {
            String string = new JSONObject(str).getString("openId");
            if (!Util.isNullOrNil(string)) {
                Context m = mo25055m();
                C20937c cVar = C22426h.f63540a;
                C36614d dVar = new C36614d(string);
                C86709a0.m107524d().mo123455a(2830, new C36929i(dVar, m));
                C86709a0.m107524d().mo123460f(dVar);
            }
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0156 A[Catch:{ Exception -> 0x01ef }] */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String openSearchWebView(java.lang.String r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "seq"
            java.lang.String r2 = "title"
            java.lang.String r3 = "sessionId"
            java.lang.String r4 = "query"
            java.lang.String r5 = "extParams"
            java.lang.String r6 = ""
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 0
            r8[r9] = r0
            java.lang.String r10 = "MicroMsg.TopStory.TopStoryWebViewJSApi"
            java.lang.String r11 = "openSearchWebView %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r8)
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x01ef }
            r8.<init>(r0)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r0 = "actionType"
            int r0 = r8.optInt(r0)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r11 = r8.optString(r5, r6)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r12 = "publishId"
            java.lang.String r12 = r8.optString(r12, r6)     // Catch:{ Exception -> 0x01ef }
            r14 = 3
            r15 = 2
            if (r0 == r15) goto L_0x019c
            java.lang.String r12 = "scene"
            if (r0 == r14) goto L_0x0058
            r1 = 6
            if (r0 == r1) goto L_0x0041
            goto L_0x01e6
        L_0x0041:
            r0 = 53
            int r0 = r8.optInt(r12, r0)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r1 = "subScene"
            r2 = 5
            int r1 = r8.optInt(r1, r2)     // Catch:{ Exception -> 0x01ef }
            com.tencent.mm.plugin.topstory.ui.home.a r2 = r19.mo25054l()     // Catch:{ Exception -> 0x01ef }
            r2.mo24891E1(r0, r1)     // Catch:{ Exception -> 0x01ef }
            goto L_0x01e6
        L_0x0058:
            java.lang.String r14 = r8.optString(r4, r6)     // Catch:{ Exception -> 0x01ef }
            int r13 = r8.optInt(r12, r9)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r15 = r8.optString(r3, r6)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r7 = u73.C101987v0.m134271e(r13)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r0 = "tagId"
            r16 = r1
            int r1 = r8.optInt(r0, r9)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r0 = "navBarColor"
            java.lang.String r0 = r8.optString(r0, r6)     // Catch:{ Exception -> 0x007e }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x007e }
            r17 = r0
            goto L_0x0080
        L_0x007e:
            r17 = 0
        L_0x0080:
            java.lang.String r0 = "navBarBgColorType"
            r18 = r1
            int r1 = r8.optInt(r0, r9)     // Catch:{ Exception -> 0x01ef }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ef }
            r0.<init>()     // Catch:{ Exception -> 0x01ef }
            java.lang.String r9 = "navBarBgColorType = "
            r0.append(r9)     // Catch:{ Exception -> 0x01ef }
            r0.append(r1)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01ef }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r0 = "nativeConfig"
            java.lang.String r0 = r8.optString(r0, r6)     // Catch:{ Exception -> 0x01ef }
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01ef }
            if (r9 != 0) goto L_0x00bf
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b8 }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x00b8 }
            boolean r0 = r9.has(r2)     // Catch:{ JSONException -> 0x00b8 }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = r9.optString(r2)     // Catch:{ JSONException -> 0x00b8 }
            goto L_0x00c0
        L_0x00b8:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01ef }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r6, r9)     // Catch:{ Exception -> 0x01ef }
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            java.lang.String r2 = "preRequest"
            r9 = 1
            int r2 = r8.optInt(r2, r9)     // Catch:{ Exception -> 0x01ef }
            long r9 = eb0.C31543z5.m39453c()     // Catch:{ Exception -> 0x01ef }
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x01ef }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x01ef }
            r9.<init>()     // Catch:{ Exception -> 0x01ef }
            java.lang.String r10 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x01ef }
            r9.put(r12, r10)     // Catch:{ Exception -> 0x01ef }
            r9.put(r4, r14)     // Catch:{ Exception -> 0x01ef }
            r9.put(r3, r15)     // Catch:{ Exception -> 0x01ef }
            r9.put(r5, r11)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r3 = "subSessionId"
            r9.put(r3, r7)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r3 = "requestId"
            r9.put(r3, r2)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r3 = "pRequestId"
            r9.put(r3, r2)     // Catch:{ Exception -> 0x01ef }
            r3 = r16
            r9.put(r3, r2)     // Catch:{ Exception -> 0x01ef }
            te3.jh4 r4 = new te3.jh4     // Catch:{ Exception -> 0x01ef }
            r4.<init>()     // Catch:{ Exception -> 0x01ef }
            java.lang.String r5 = t03.C22426h.m26102d()     // Catch:{ Exception -> 0x01ef }
            r4.f64038p = r5     // Catch:{ Exception -> 0x01ef }
            r4.f64034i = r13     // Catch:{ Exception -> 0x01ef }
            r4.f64029d = r6     // Catch:{ Exception -> 0x01ef }
            r4.f64033h = r14     // Catch:{ Exception -> 0x01ef }
            r4.f64030e = r15     // Catch:{ Exception -> 0x01ef }
            r4.f64031f = r15     // Catch:{ Exception -> 0x01ef }
            r5 = 2
            r4.f64043u = r5     // Catch:{ Exception -> 0x01ef }
            java.lang.String r5 = p03.C21914h.m25156d(r9)     // Catch:{ Exception -> 0x01ef }
            r4.f64035j = r5     // Catch:{ Exception -> 0x01ef }
            r4.f64044v = r0     // Catch:{ Exception -> 0x01ef }
            r5 = r18
            r4.f64041s = r5     // Catch:{ Exception -> 0x01ef }
            r4.f64036n = r2     // Catch:{ Exception -> 0x01ef }
            java.lang.String r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46979c()     // Catch:{ Exception -> 0x01ef }
            r4.f64045w = r0     // Catch:{ Exception -> 0x01ef }
            te3.hy r0 = new te3.hy     // Catch:{ Exception -> 0x01ef }
            r0.<init>()     // Catch:{ Exception -> 0x01ef }
            java.lang.String r7 = "rec_category"
            r0.f134951d = r7     // Catch:{ Exception -> 0x01ef }
            long r9 = (long) r5     // Catch:{ Exception -> 0x01ef }
            r0.f134952e = r9     // Catch:{ Exception -> 0x01ef }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x01ef }
            r0.f134953f = r5     // Catch:{ Exception -> 0x01ef }
            java.util.LinkedList<te3.hy> r5 = r4.f64037o     // Catch:{ Exception -> 0x01ef }
            r5.add(r0)     // Catch:{ Exception -> 0x01ef }
            te3.hy r0 = new te3.hy     // Catch:{ Exception -> 0x01ef }
            r0.<init>()     // Catch:{ Exception -> 0x01ef }
            r0.f134951d = r3     // Catch:{ Exception -> 0x01ef }
            r0.f134953f = r2     // Catch:{ Exception -> 0x01ef }
            java.util.LinkedList<te3.hy> r3 = r4.f64037o     // Catch:{ Exception -> 0x01ef }
            r3.add(r0)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r0 = "extReqParams"
            java.lang.String r0 = r8.optString(r0, r6)     // Catch:{ Exception -> 0x01ef }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x01ef }
            if (r3 != 0) goto L_0x018f
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x01ef }
            r3.<init>(r0)     // Catch:{ Exception -> 0x01ef }
            r0 = 0
        L_0x015c:
            int r5 = r3.length()     // Catch:{ Exception -> 0x01ef }
            if (r0 >= r5) goto L_0x018f
            org.json.JSONObject r5 = r3.getJSONObject(r0)     // Catch:{ Exception -> 0x01ef }
            te3.hy r7 = new te3.hy     // Catch:{ Exception -> 0x01ef }
            r7.<init>()     // Catch:{ Exception -> 0x01ef }
            java.lang.String r8 = "key"
            java.lang.String r8 = r5.optString(r8, r6)     // Catch:{ Exception -> 0x01ef }
            r7.f134951d = r8     // Catch:{ Exception -> 0x01ef }
            java.lang.String r8 = "uintValue"
            r9 = 0
            int r8 = r5.optInt(r8, r9)     // Catch:{ Exception -> 0x01ef }
            long r8 = (long) r8     // Catch:{ Exception -> 0x01ef }
            r7.f134952e = r8     // Catch:{ Exception -> 0x01ef }
            java.lang.String r8 = "textValue"
            java.lang.String r5 = r5.optString(r8, r6)     // Catch:{ Exception -> 0x01ef }
            r7.f134953f = r5     // Catch:{ Exception -> 0x01ef }
            java.util.LinkedList<te3.hy> r5 = r4.f64037o     // Catch:{ Exception -> 0x01ef }
            r5.add(r7)     // Catch:{ Exception -> 0x01ef }
            int r0 = r0 + 1
            goto L_0x015c
        L_0x018f:
            r9 = r17
            r4.f64048z = r9     // Catch:{ Exception -> 0x01ef }
            android.content.Context r0 = r19.mo25055m()     // Catch:{ Exception -> 0x01ef }
            r3 = 1
            t03.C22426h.m26111m(r0, r4, r2, r3, r1)     // Catch:{ Exception -> 0x01ef }
            goto L_0x01e6
        L_0x019c:
            java.lang.String r0 = "srcUserName"
            java.lang.String r0 = r8.optString(r0)     // Catch:{ Exception -> 0x01ef }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x01ef }
            r1.<init>()     // Catch:{ Exception -> 0x01ef }
            java.lang.String r2 = "jumpUrl"
            java.lang.String r2 = r8.optString(r2, r6)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r3 = "rawUrl"
            r1.putExtra(r3, r2)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r3 = "KPublisherId"
            r1.putExtra(r3, r12)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r3 = "srcUsername"
            r1.putExtra(r3, r0)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r3 = "geta8key_scene"
            r4 = 64
            r1.putExtra(r3, r4)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r3 = "jump url = %s, publishId = %s srcUserName = %s"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x01ef }
            r5 = 0
            r4[r5] = r2     // Catch:{ Exception -> 0x01ef }
            r2 = 1
            r4[r2] = r12     // Catch:{ Exception -> 0x01ef }
            r2 = 2
            r4[r2] = r0     // Catch:{ Exception -> 0x01ef }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r4)     // Catch:{ Exception -> 0x01ef }
            com.tencent.mm.plugin.topstory.ui.home.a r0 = r19.mo25054l()     // Catch:{ Exception -> 0x01ef }
            com.tencent.mm.ui.MMActivity r0 = r0.mo24914t()     // Catch:{ Exception -> 0x01ef }
            java.lang.String r2 = "webview"
            java.lang.String r3 = ".ui.tools.WebViewUI"
            r4 = 0
            ke3.C88144b.m109791i(r0, r2, r3, r1, r4)     // Catch:{ Exception -> 0x01ef }
        L_0x01e6:
            org.json.JSONObject r0 = r19.mo74341e()     // Catch:{ Exception -> 0x01ef }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01ef }
            return r0
        L_0x01ef:
            org.json.JSONObject r0 = r19.mo74340d()
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.topstory.p113ui.webview.C19391e.openSearchWebView(java.lang.String):java.lang.String");
    }

    @JavascriptInterface
    public String openWeAppPage(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openWeAppPage %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
            appBrandStatObject.f245533f = FaceManager.FACE_ACQUIRED_UP;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(MMApplicationContext.getContext(), jSONObject.getString("userName"), jSONObject.getString("appid"), jSONObject.optInt("debugMode", 0), 0, jSONObject.getString("path"), appBrandStatObject);
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "openWeAppPage", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String openWowColikeSetting(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openWowColikeSetting %s", str);
        try {
            C22426h.m26108j(MMApplicationContext.getContext());
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "openWowColikeSetting", new Object[0]);
            return mo74340d().toString();
        }
    }

    /* renamed from: p */
    public void mo25065p(String str, String str2, int i, int i2, int i3, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("beginMsgId", str);
            jSONObject.put("endMsgId", str2);
            jSONObject.put("beginSeq", i);
            jSONObject.put("endSeq", i2);
            jSONObject.put("reddotNum", i3);
            jSONObject.put("extInfo", str3);
            MMHandlerThread.postToMainThread(new e$$m(this, jSONObject));
        } catch (JSONException e) {
            Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyNumReddotChange " + e.getMessage());
        }
    }

    @JavascriptInterface
    public String postComments(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl postComments %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f54730c.getClass();
            C86709a0.m107524d().mo123460f(new C77599f(jSONObject));
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String preloadFinderFeed(String str) {
        long j;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            int optInt = jSONObject.optInt("batchLoadScene", 0);
            if (optJSONArray == null) {
                return mo74341e().toString();
            }
            LinkedList linkedList = new LinkedList();
            int min = Math.min(optJSONArray.length(), ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_search_h5_preload_max_per_count, 20));
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "preloadFinderFeed %s", str);
            for (int i = 0; i < min; i++) {
                C50676og0 og02 = new C50676og0();
                JSONObject jSONObject2 = (JSONObject) optJSONArray.get(i);
                String string = jSONObject2.getString("feedId");
                if (string != null) {
                    if (!string.isEmpty()) {
                        j = new BigInteger(string).longValue();
                        og02.f139150d = j;
                        og02.f139151e = jSONObject2.getString("encryptId");
                        og02.f139152f = jSONObject2.getString("nonceId");
                        linkedList.add(og02);
                    }
                }
                j = 0;
                og02.f139150d = j;
                og02.f139151e = jSONObject2.getString("encryptId");
                og02.f139152f = jSONObject2.getString("nonceId");
                linkedList.add(og02);
            }
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76733AN(linkedList, 39, optInt);
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "", new Object[0]);
        }
    }

    /* renamed from: q */
    public void mo25068q(String str, long j, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msgId", str);
            jSONObject.put("latestTimeStamp", j);
            jSONObject.put("reddotType", i);
            MMHandlerThread.postToMainThread(new e$$n(this, jSONObject));
        } catch (JSONException e) {
            Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyReddot " + e.getMessage());
        }
    }

    @JavascriptInterface
    public String queryWebCommCgi(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl queryWebCommCgi %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("requestId", "");
            String optString2 = jSONObject.optString("commReq", "");
            this.f54730c.getClass();
            C86709a0.m107524d().mo123460f(new C48214a(optString, optString2));
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    /* renamed from: r */
    public void mo25070r(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", str);
            jSONObject.put("sessionId", this.f54732e.f64030e);
            jSONObject.put("subSessionId", this.f54732e.f64031f);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f54732e.f64034i);
            MMHandlerThread.postToMainThread(new e$$g(this, jSONObject));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public String renderFinish(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "renderFinish %s", str);
        try {
            mo25054l().mo24917w0();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "renderFinish error", new Object[0]);
        }
        return mo74341e().toString();
    }

    /* renamed from: s */
    public void mo25072s(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("json", str);
            jSONObject.put("newQuery", this.f54735h);
            jSONObject.put("isCache", false);
            MMHandlerThread.postToMainThread(new e$$l(this, jSONObject));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public String searchDataHasResult(String str) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT;
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "searchDataHasResult %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("tagId", 0);
            int optInt2 = jSONObject.optInt("resultCount", 0);
            if (C21914h.m25162j(optInt)) {
                if (optInt2 > 0) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                } else {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                }
            }
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "searchDataHasResult", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String setComments(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl setComments %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f54730c.getClass();
            C86709a0.m107524d().mo123460f(new C22291j(jSONObject));
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String shareImage(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl shareImage %s", str);
        try {
            String optString = new JSONObject(str).optString("imagePath");
            if (TextUtils.isEmpty(optString)) {
                return mo74340d().toString();
            }
            MMActivity t = mo25054l().mo24914t();
            C77407n nVar = new C77407n((Context) t, 1, false);
            nVar.f225771i = new e$$d(this);
            nVar.f225782p = new e$$e(this, t, optString);
            nVar.f225761d = new e$$f(this);
            nVar.mo107573q();
            return mo74341e().toString();
        } catch (Throwable unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String showNavBarShadow(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl showNavBarShadow %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("color");
            int parseInt = Integer.parseInt(string.substring(1, string.length()), 16);
            mo25054l().mo24916v7(parseInt, (int) (jSONObject.getDouble("alpha") * 255.0d));
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String stage(String str) {
        try {
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "stage %s", str);
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.keys() != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    long optLong = jSONObject.optLong(next);
                    if (optLong < 0) {
                        C22426h.m26099a(this.f54732e, next, C31543z5.m39453c());
                    } else {
                        C22426h.m26099a(this.f54732e, next, optLong);
                    }
                }
            }
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, IXWebBroadcastListener.STAGE_TAG, new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String startSearchItemDetailPage(String str) {
        boolean z;
        Intent intent;
        String str2 = str;
        Class cls = C45696d.class;
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage %s", str2);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("jumpUrl", "");
            String optString2 = jSONObject.optString("publishId", "");
            Intent intent2 = new Intent();
            intent2.putExtra("KPublisherId", optString2);
            intent2.putExtra("srcUsername", jSONObject.optString("srcUserName"));
            intent2.putExtra("geta8key_scene", 64);
            int optInt = jSONObject.optInt("openScene", 10000);
            int optInt2 = jSONObject.optInt("subScene", -1);
            int optInt3 = jSONObject.optInt("itemType", -1);
            intent2.putExtra(C74928u.C45093i.f122318j, optInt3);
            intent2.putExtra("KWebPrefetcherId", jSONObject.optString("prefetchId", ""));
            String F2 = ((C45696d) C86709a0.m107533q(cls)).mo70959F2(optString, optInt, optInt2, ((int) System.currentTimeMillis()) / 1000);
            intent2.putExtra("rawUrl", F2);
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "jump url = %s, publishId = %s", F2, optString2);
            if (optInt3 == 5) {
                Bundle bundle = new Bundle();
                C48050d0 Me0 = ((C48051r) C86312j.m106911c(C48051r.class)).Me0();
                C77631m mVar = (C77631m) Me0;
                mVar.getClass();
                mVar.f226303j = jSONObject.optString("srcUserName");
                mVar.f226304n = jSONObject.optString("srcDisplayName");
                C77630j jVar = mVar.f226307q;
                jVar.f226326e = F2;
                jVar.f226325d = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                mVar.f226307q.f226332n = jSONObject.optString("digest");
                mVar.f226307q.f226330i = jSONObject.optString("cover");
                C77630j jVar2 = mVar.f226307q;
                jVar2.f226333o = optInt3;
                jVar2.f226329h = (long) jSONObject.optInt("pubTime");
                mVar.f226307q.f226335q = jSONObject.optInt("duration");
                mVar.f226307q.f226313E = jSONObject.optInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
                mVar.f226307q.f226314F = jSONObject.optInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
                mVar.f226307q.f226315G = jSONObject.optString(TPReportKeys.Common.COMMON_VID);
                ((C77631m) Me0).mo107809b(bundle);
                intent2.putExtras(bundle);
                z = true;
            } else {
                z = false;
            }
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openScene:%s, subScene:%s, itemType:%s", Integer.valueOf(optInt), Integer.valueOf(optInt2), Integer.valueOf(optInt3));
            if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(7)) {
                int i = optInt2;
                boolean z2 = z;
                intent = intent2;
                if (((C45696d) C86709a0.m107533q(cls)).Ms0(mo25054l().mo24914t(), F2, optInt3, z2, optInt, i, intent)) {
                    Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage jump to TmplWebview");
                    return mo74341e().toString();
                }
            } else {
                intent = intent2;
            }
            Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage jump to WebViewUI");
            C88144b.m109791i(mo25054l().mo24914t(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "reportSearchRealTimeReport", new Object[0]);
            return mo74340d().toString();
        }
    }

    /* renamed from: t */
    public void mo25079t(String str, int i, int i2, String str2, boolean z) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "onTabSelected: %s, %s, %s, %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tabInfo", str);
            jSONObject.put("contentReddot", i);
            jSONObject.put("numberReddot", i2);
            jSONObject.put("msgId", str2);
            jSONObject.put("isByScroll", z);
        } catch (JSONException e) {
            Log.m105928w("MicroMsg.TopStory.TopStoryWebViewJSApi", "onTabSelected json exception: " + e.getMessage());
        }
        C43261a.m46837a(this, "onTabSelected", jSONObject.toString());
    }

    @JavascriptInterface
    public String updateNumReddot(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl updateNumReddot %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            ((C21723h) ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4()).mo33997h("", jSONObject.getLong("latestTimeStamp"), false, jSONObject.getInt(TPReportKeys.Common.COMMON_SEQ), true);
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "lxl updateNumReddot", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String updateReddotTimeStamps(String str) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "updateReddotTimeStamps %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            ((C21723h) ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4()).mo33987G(jSONObject.optLong("reddotTimeStamps", 0));
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e, "updateReddotTimeStamps", new Object[0]);
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String webViewUIReady(String str) {
        try {
            if (this.f54735h) {
                this.f54735h = false;
                if (mo25054l() != null) {
                    mo25054l().mo24918y6();
                }
                C22426h.m26099a(this.f54732e, "webViewUIReady", C31543z5.m39453c());
                if (C79758p.f233760a.mo109883f(new C112441c()) == 1) {
                    Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", C22426h.m26112n(this.f54732e));
                }
            }
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public void wxadInvoke(String str, String str2, String str3) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "invoke: func:%s, msg:%s, callbackId:%s", str, str2, str3);
        if (f54729i.contains(str)) {
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doFunc,func:%s,msg:%s,callbackId:%s", str, str2, str3);
            str.getClass();
            int hashCode = str.hashCode();
            char c = 65535;
            if (hashCode != -1150858339) {
                if (hashCode != -411577899) {
                    if (hashCode == 1538465865 && str.equals("openWeApp")) {
                        c = 2;
                    }
                } else if (str.equals("openFinderView")) {
                    c = 1;
                }
            } else if (str.equals("launchApplication")) {
                c = 0;
            }
            if (c == 0) {
                ((C90271s) C86312j.m106911c(C90271s.class)).mo12602Yn(mo25055m(), new JSONObject(str2), new e$$a(this, str3));
            } else if (c == 1) {
                HashMap hashMap = new HashMap(2);
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76898xr(mo25055m(), str2, new e$$b(hashMap));
                if (hashMap.size() < 1) {
                    hashMap.put("err_msg", "openFinderView:ok");
                }
                mo25053k(str3, hashMap);
            } else if (c != 2) {
                Log.m105921e("MicroMsg.TopStory.TopStoryWebViewJSApi", "func:%s not found", str);
            } else {
                JSONObject jSONObject = new JSONObject(str2);
                StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                startAppBrandUIFromOuterEvent.f9522d.f9531f = mo25055m();
                startAppBrandUIFromOuterEvent.f9522d.f9526a = jSONObject.optString("userName");
                startAppBrandUIFromOuterEvent.f9522d.f9533h = jSONObject.optString("appId");
                startAppBrandUIFromOuterEvent.f9522d.f9527b = jSONObject.optString("relativeURL");
                startAppBrandUIFromOuterEvent.f9522d.f9534i = jSONObject.optInt("appVersion", 0);
                startAppBrandUIFromOuterEvent.f9522d.f9529d = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1238);
                startAppBrandUIFromOuterEvent.f9522d.f9530e = jSONObject.optString("sceneNote");
                startAppBrandUIFromOuterEvent.f9522d.f9536k = jSONObject.optString("downloadURL");
                startAppBrandUIFromOuterEvent.f9522d.f9528c = jSONObject.optInt("openType", 0);
                startAppBrandUIFromOuterEvent.f9522d.f9537l = jSONObject.optString("checkSumMd5");
                StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                aVar.f9539n = false;
                aVar.f9540o.f237920f = jSONObject.optString("extJsonInfo");
                startAppBrandUIFromOuterEvent.f9522d.f9548w = jSONObject.optString("privateExtraData");
                startAppBrandUIFromOuterEvent.f9522d.f9550y = jSONObject.optString("extraData");
                startAppBrandUIFromOuterEvent.f9522d.f9549x = jSONObject.optString("adUxInfo");
                if (TextUtils.isEmpty(startAppBrandUIFromOuterEvent.f9522d.f9549x)) {
                    Log.m105920e("MicroMsg.TopStory.TopStoryWebViewJSApi", "doOpenWeApp param lose adUxInfo");
                } else {
                    C91667a.m115207c("WebViewUI", "openWeApp", startAppBrandUIFromOuterEvent.f9522d.f9549x, "topStory");
                }
                startAppBrandUIFromOuterEvent.publish();
                HashMap hashMap2 = new HashMap(1);
                if (startAppBrandUIFromOuterEvent.f9523e.f9552a) {
                    hashMap2.put("err_msg", "openWeApp:ok");
                } else {
                    hashMap2.put("err_msg", "openWeApp:fail:" + Util.nullAsNil(startAppBrandUIFromOuterEvent.f9523e.f9553b));
                }
                mo25053k(str3, hashMap2);
            }
        } else {
            this.f54734g.mo13943b(mo25055m());
            this.f54734g.mo13942a(str, str2, str3, new e$$h(this));
        }
    }
}
