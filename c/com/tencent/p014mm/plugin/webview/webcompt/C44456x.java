package com.tencent.p014mm.plugin.webview.webcompt;

import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import c30.C26827e;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.webcompt.C44408c;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o40.C61926c;
import ob0.C47350c;
import p206nj.C117627q;
import pe3.C47465a;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import t83.C13848e;
import t83.C13851h1;
import t83.C13854i1;
import t83.C13866z0;
import t83.C48590l;
import te3.e25;
import te3.f25;
import wc3.C53143h0;
import wx3.C15601d;
import wx3.C66212f;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.x */
public final class C44456x {

    /* renamed from: a */
    public final C44408c f120558a;

    /* renamed from: b */
    public final String f120559b;

    /* renamed from: c */
    public JsapiPermissionWrapper f120560c;

    /* renamed from: d */
    public final C13848e f120561d = new C44457a(this);

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.x$a */
    public static final class C44457a implements C13848e {

        /* renamed from: a */
        public final /* synthetic */ C44456x f120562a;

        public C44457a(C44456x xVar) {
            this.f120562a = xVar;
        }

        /* renamed from: a */
        public final void mo10774a(String str, String str2, Map<String, Object> map) {
            HashMap hashMap = new HashMap();
            C87412m.m108593f(str2, "ret");
            hashMap.put("err_msg", str2);
            if (map != null) {
                hashMap.putAll(map);
            }
            String a = C13851h1.C13852a.m13141a(str, hashMap, false, "");
            Log.m105918d("WebComptContextJsApiHandler", "invoke callback: " + str2 + ", " + a);
            C44456x xVar = this.f120562a;
            StringBuilder sb = new StringBuilder();
            sb.append("WeixinWebCompt._callback(");
            C87412m.m108593f(str, "callbackId");
            sb.append(C44404a.m48767d(str));
            sb.append(", ");
            sb.append(a);
            sb.append("['__params'])");
            C44456x.m48810a(xVar, sb.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.x$b */
    public static final class C44458b implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C44456x f120563a;

        /* renamed from: b */
        public final /* synthetic */ String f120564b;

        public C44458b(C44456x xVar, String str) {
            this.f120563a = xVar;
            this.f120564b = str;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            String str2;
            if (i == 0 && i2 == 0) {
                C44456x xVar = this.f120563a;
                StringBuilder sb = new StringBuilder();
                sb.append("WeixinWebCompt._callback(");
                sb.append(C44404a.m48767d(this.f120564b));
                sb.append(", ");
                C47465a aVar = cVar.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WebComptCommCgiResp");
                sb.append(((f25) aVar).f133257d);
                sb.append(')');
                C44456x.m48810a(xVar, sb.toString());
                return;
            }
            C44456x xVar2 = this.f120563a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("WeixinWebCompt._callback(");
            sb4.append(C44404a.m48767d(this.f120564b));
            sb4.append(", {errType:");
            sb4.append(i);
            sb4.append(", errCode:");
            sb4.append(i2);
            sb4.append(", errMsg:");
            if (str == null || (str2 = C44404a.m48767d(str)) == null) {
                str2 = "";
            }
            sb4.append(str2);
            sb4.append("})");
            C44456x.m48810a(xVar2, sb4.toString());
            C44462y yVar = this.f120563a.f120558a.f120410b;
            if (yVar != null) {
                yVar.mo69224a(C44406b.REQUEST_CGI_ERR);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.x$c */
    public static final class C44459c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44456x f120565d;

        /* renamed from: e */
        public final /* synthetic */ String f120566e;

        public C44459c(C44456x xVar, String str) {
            this.f120565d = xVar;
            this.f120566e = str;
        }

        public final void run() {
            C44456x.m48811b(this.f120565d, this.f120566e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.x$d */
    public static final class C44460d extends C87413o implements C32226l<C44408c.C44426j, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C44456x f120567d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44460d(C44456x xVar) {
            super(1);
            this.f120567d = xVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C44408c.C44426j) obj, "ex");
            C44456x xVar = this.f120567d;
            C44456x.m48810a(xVar, "WeixinWebCompt.onError({retCode: 20002, webComptName:" + C44404a.m48767d(this.f120567d.f120559b) + ", error:'refresh a8key failed'})");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.x$e */
    public static final class C44461e extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C44456x f120568d;

        /* renamed from: e */
        public final /* synthetic */ String f120569e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44461e(C44456x xVar, String str) {
            super(1);
            this.f120568d = xVar;
            this.f120569e = str;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            C44456x xVar = this.f120568d;
            C44456x.m48810a(xVar, "WeixinWebCompt._callback(" + C44404a.m48767d(this.f120569e) + ',' + str + ')');
            return C13598b0.f38549a;
        }
    }

    public C44456x(C44408c cVar, String str) {
        C87412m.m108594g(cVar, "webComponent");
        C87412m.m108594g(str, "webComptName");
        this.f120558a = cVar;
        this.f120559b = str;
    }

    /* renamed from: a */
    public static final void m48810a(C44456x xVar, String str) {
        C40480g f = xVar.f120558a.mo69181f(xVar.f120559b);
        if (f != null) {
            f.evaluateJavascript(str, (ValueCallback<String>) null);
        }
    }

    /* renamed from: b */
    public static final void m48811b(C44456x xVar, String str) {
        C48590l lVar;
        MMHandler mMHandler;
        WeakReference<C48590l> weakReference = xVar.f120558a.f120409a;
        if (weakReference != null && (lVar = weakReference.get()) != null) {
            JsapiPermissionWrapper jsapiPermissionWrapper = xVar.f120560c;
            if (jsapiPermissionWrapper != null) {
                Bundle bundle = new Bundle();
                bundle.putString("name", xVar.f120559b);
                C13598b0 b0Var = C13598b0.f38549a;
                C13848e eVar = xVar.f120561d;
                boolean z = false;
                C13851h1 h1Var = (C13851h1) ((LinkedList) C13854i1.m13149b("[" + str + "]", false, lVar.f130012q)).remove(0);
                if (h1Var != null) {
                    try {
                        z = lVar.f130007l.mo68152ys(lVar.f130014s);
                    } catch (Exception e) {
                        Log.m105928w("MicroMsg.JsApiHandler", "isBusy, ex = " + e.getMessage());
                    }
                    Log.m105924i("MicroMsg.JsApiHandler", "checkIsMsgQueueBusy isBusy = " + z);
                    if (z && (mMHandler = lVar.f130001f) != null) {
                        h1Var.f38992e = bundle;
                        h1Var.f38993f = jsapiPermissionWrapper;
                        h1Var.f38994g = eVar;
                        mMHandler.post(new C13866z0(lVar, h1Var));
                        return;
                    }
                }
                lVar.mo73249o(h1Var, jsapiPermissionWrapper, bundle, eVar);
                return;
            }
            C87412m.m108603p("jsPerm");
            throw null;
        }
    }

    @JavascriptInterface
    public final void cgi(String str, String str2) {
        C87412m.m108594g(str, "callbackId");
        C87412m.m108594g(str2, "request");
        C44462y yVar = this.f120558a.f120410b;
        if (yVar != null) {
            yVar.mo69224a(C44406b.REQUEST_CGI);
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        e25 e25 = new e25();
        e25.f132652d = str2;
        bVar.f127066a = e25;
        bVar.f127067b = new f25();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/webcompt/webcomptcommcgi";
        bVar.f127069d = 2936;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C44458b(this, str));
    }

    @JavascriptInterface
    public final void errReport(String str, String str2, int i, int i2) {
        C87412m.m108594g(str, "errMsg");
        C87412m.m108594g(str2, "errStack");
        this.f120558a.mo69182g(this.f120559b, str, str2, i, i2);
    }

    @JavascriptInterface
    public final void idkey(long j, long j2, long j3) {
        C115669n.INSTANCE.mo175913w(j, j2, j3);
    }

    @JavascriptInterface
    public final void idkeyList(String str) {
        C87412m.m108594g(str, "list");
        C26827e eVar = new C26827e(str);
        LinkedList linkedList = new LinkedList();
        int length = eVar.length();
        for (int i = 0; i < length; i++) {
            C26827e n = eVar.mo53807h(i);
            linkedList.add(new IDKey(n.getLong(0), n.getLong(1), n.getLong(2)));
        }
        C115669n.INSTANCE.mo160124a(new ArrayList(linkedList), false);
    }

    @JavascriptInterface
    public final void invoke(String str) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        if (!(str.length() == 0)) {
            Log.m105918d("WebComptContextJsApiHandler", "invoke: " + str);
            if (MMHandlerThread.isMainThread()) {
                m48811b(this, str);
            } else {
                MMHandlerThread.postToMainThread(new C44459c(this, str));
            }
        }
    }

    @JavascriptInterface
    /* renamed from: kv */
    public final void mo69218kv(int i, String str) {
        C87412m.m108594g(str, "data");
        C115669n.INSTANCE.kvStat(i, str);
    }

    @JavascriptInterface
    public final void log(int i, String str, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "msg");
        String str3 = "webCompt[" + str + ']';
        if (i == 0) {
            Log.m105926v(str3, str2);
        } else if (i == 1) {
            Log.m105918d(str3, str2);
        } else if (i == 2) {
            Log.m105924i(str3, str2);
        } else if (i == 3) {
            Log.m105928w(str3, str2);
        } else if (i == 4) {
            Log.m105920e(str3, str2);
        } else if (i == 5) {
            Log.m105922f(str3, str2);
        }
    }

    @JavascriptInterface
    public final String performance(String str) {
        String str2;
        C53143h0 h0Var;
        String str3 = str;
        C87412m.m108594g(str3, "frontEndPerformance");
        C44408c cVar = this.f120558a;
        String str4 = this.f120559b;
        cVar.getClass();
        C87412m.m108594g(str4, "webCompt");
        C44408c.C44428l.C44429a aVar = (C44408c.C44428l.C44429a) cVar.mo69184j().get(str4);
        if (aVar == null || (h0Var = aVar.f120478l) == null) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            List<C44408c.C44427k> f = C64197v.m75537f(C44408c.C44427k.STEP_EVAL_MAIN_FRAME, C44408c.C44427k.STEP_FETCH_WORKER, C44408c.C44427k.STEP_GET_APP_SCRIPT, C44408c.C44427k.STEP_GET_A8KEY);
            LinkedList linkedList = new LinkedList();
            for (C44408c.C44427k kVar : f) {
                String str5 = str4;
                linkedList.add(String.valueOf(h0Var.mo73830b(kVar.f120462d + "_START", h0Var.f148278a) - h0Var.f148278a));
                linkedList.add(String.valueOf(h0Var.mo73830b(kVar.f120462d + "_END", h0Var.f148278a) - h0Var.f148278a));
                str4 = str5;
                aVar = aVar;
            }
            String str6 = str4;
            C44408c.C44428l.C44429a aVar2 = aVar;
            sb.append(C110818d0.m150921S(linkedList, ",", (CharSequence) null, ",", 0, (CharSequence) null, (C32226l) null, 58, (Object) null) + C112551y.m153813m("0,", (9 - f.size()) * 2));
            sb.append(str3);
            str2 = sb.toString();
            String str7 = C44408c.f120397g;
            Log.m105924i(str7, "performance: " + str2);
            Object[] objArr = new Object[6];
            C48590l lVar = cVar.f120409a.get();
            String str8 = lVar != null ? lVar.f129997b : null;
            if (str8 == null) {
                str8 = "";
            }
            HashMap<String, Integer> hashMap = C44404a.f120354a;
            objArr[0] = C117627q.m165909b(str8, "UTF-8");
            C44408c.C44428l.C44429a aVar3 = aVar2;
            String str9 = aVar3.f120474h;
            C87412m.m108594g(str9, "<this>");
            objArr[1] = C117627q.m165909b(str9, "UTF-8");
            objArr[2] = aVar3.f120473g;
            objArr[3] = str6;
            objArr[4] = Integer.valueOf(((Number) ((C36570n) C44408c.f120395e.mo69192j().f120436b).getValue()).intValue());
            objArr[5] = aVar3.f120477k;
            String S = C110818d0.m150921S(C64197v.m75537f(objArr), ",", (CharSequence) null, ",", 0, (CharSequence) null, (C32226l) null, 58, (Object) null);
            C115669n nVar = C115669n.INSTANCE;
            nVar.kvStat(18151, S + str2);
        }
        return str2 == null ? "" : str2;
    }

    @JavascriptInterface
    public final void refreshA8Key(String str) {
        C87412m.m108594g(str, "callbackId");
        C44408c cVar = this.f120558a;
        String str2 = this.f120559b;
        C44460d dVar = new C44460d(this);
        C44461e eVar = new C44461e(this, str);
        cVar.getClass();
        C87412m.m108594g(str2, "webCompt");
        C44408c.C44428l.C44429a aVar = (C44408c.C44428l.C44429a) cVar.mo69184j().get(str2);
        if (aVar != null && (!C112551y.m153811k(aVar.f120475i))) {
            C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C44453r(cVar, aVar, eVar, dVar, (C15601d<? super C44453r>) null), 3, (Object) null);
        }
    }

    @JavascriptInterface
    public final void sendMessage(String str) {
        C87412m.m108594g(str, "data");
        C44408c cVar = this.f120558a;
        cVar.getClass();
        String str2 = C44408c.f120397g;
        Log.m105926v(str2, "postToFront " + str);
        C61926c.m72668M(new C44450o(cVar, "window.WeixinOpenTags && window.WeixinOpenTags.onMessage(" + str + ')', C30622m.f82443d));
        cVar.f120410b.mo69224a(C44406b.SEND_TO_MAIN_FRAME);
    }
}
