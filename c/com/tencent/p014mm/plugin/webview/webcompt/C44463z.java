package com.tencent.p014mm.plugin.webview.webcompt;

import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.webview.webcompt.C44408c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import t83.C48590l;
import te3.C48869bk2;
import wc3.C53143h0;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.z */
public final class C44463z {

    /* renamed from: a */
    public final C48590l f120571a;

    /* renamed from: b */
    public final C13601g f120572b = C36568h.m40985a(new C44466c(this));

    /* renamed from: c */
    public boolean f120573c = true;

    /* renamed from: d */
    public String f120574d = "";

    /* renamed from: e */
    public final HashMap<String, C48869bk2> f120575e = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.z$a */
    public static final class C44464a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LinkedList<C48869bk2> f120576d;

        /* renamed from: e */
        public final /* synthetic */ C44463z f120577e;

        /* renamed from: f */
        public final /* synthetic */ C53143h0 f120578f;

        /* renamed from: g */
        public final /* synthetic */ String f120579g;

        /* renamed from: h */
        public final /* synthetic */ String f120580h;

        /* renamed from: i */
        public final /* synthetic */ C8477a0 f120581i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44464a(LinkedList<C48869bk2> linkedList, C44463z zVar, C53143h0 h0Var, String str, String str2, C8477a0 a0Var) {
            super(0);
            this.f120576d = linkedList;
            this.f120577e = zVar;
            this.f120578f = h0Var;
            this.f120579g = str;
            this.f120580h = str2;
            this.f120581i = a0Var;
        }

        public Object invoke() {
            try {
                LinkedList<C48869bk2> linkedList = this.f120576d;
                C44463z zVar = this.f120577e;
                C53143h0 h0Var = this.f120578f;
                String str = this.f120579g;
                String str2 = this.f120580h;
                C8477a0 a0Var = this.f120581i;
                for (C48869bk2 bk22 : linkedList) {
                    if (zVar.f120575e.containsKey(bk22.f131168d)) {
                        C44408c c = zVar.mo69227c();
                        c.getClass();
                        C87412m.m108594g(h0Var, "performanceHelper");
                        C44408c.C44428l.C44429a aVar = (C44408c.C44428l.C44429a) c.mo69184j().get(bk22.f131168d);
                        if (aVar != null) {
                            c.mo69178c(aVar.mo69209a(), bk22, h0Var.f148278a, false);
                        }
                    } else {
                        HashMap<String, C48869bk2> hashMap = zVar.f120575e;
                        String str3 = bk22.f131168d;
                        C87412m.m108593f(str3, "webCompt.name");
                        hashMap.put(str3, bk22);
                        zVar.mo69227c().mo69179d(str, str2, bk22, h0Var, a0Var.f27482d);
                        zVar.mo69227c().f120410b.f120570a.add(Long.valueOf((long) bk22.f131172h));
                    }
                }
            } catch (Exception e) {
                C44408c.f120395e.getClass();
                Log.printErrStackTrace(C44408c.f120397g, e, "config webcompt", new Object[0]);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.z$b */
    public static final class C44465b extends C87413o implements C32224a<View.OnLongClickListener> {

        /* renamed from: d */
        public final /* synthetic */ C44463z f120582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44465b(C44463z zVar) {
            super(0);
            this.f120582d = zVar;
        }

        public Object invoke() {
            return new C44407b0(this.f120582d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.z$c */
    public static final class C44466c extends C87413o implements C32224a<C44408c> {

        /* renamed from: d */
        public final /* synthetic */ C44463z f120583d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44466c(C44463z zVar) {
            super(0);
            this.f120583d = zVar;
        }

        public Object invoke() {
            return new C44408c(new WeakReference(this.f120583d.f120571a));
        }
    }

    public C44463z(C48590l lVar) {
        C87412m.m108594g(lVar, "jsapi");
        this.f120571a = lVar;
        C36568h.m40985a(new C44465b(this));
    }

    /* renamed from: a */
    public final void mo69225a() {
        this.f120574d = "";
        this.f120573c = true;
        this.f120575e.clear();
        C44408c c = mo69227c();
        synchronized (c) {
            C44408c.C44410b.C44412b h = C44408c.f120395e.mo69190h();
            h.f120422a.clear();
            h.f120423b.clear();
            if (c.f120411c) {
                c.mo69184j().mo69198a(c.f120410b);
            }
        }
    }

    /* renamed from: b */
    public final void mo69226b(String str, String str2, LinkedList<C48869bk2> linkedList) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "url");
        C87412m.m108594g(linkedList, "webCompts");
        if (linkedList.isEmpty()) {
            C44408c.f120395e.getClass();
            Log.m105928w(C44408c.f120397g, "webCompt is null");
            return;
        }
        C53143h0 h0Var = new C53143h0();
        if (this.f120575e.isEmpty() && (!linkedList.isEmpty())) {
            mo69227c().f120410b.mo69224a(C44406b.AUTH_WITH_FIRST_TIME);
        }
        C8477a0 a0Var = new C8477a0();
        if (this.f120573c) {
            a0Var.f27482d = true;
        } else if (!C87412m.m108589b(this.f120574d, str)) {
            mo69225a();
            C44408c c = mo69227c();
            if (c.f120411c) {
                C61926c.m72668M(new C44450o(c, "window.WeixinOpenTags && window.WeixinOpenTags.onClean()", C30622m.f82443d));
                c.f120410b.mo69224a(C44406b.AUTH_WITH_APP_CHANGE);
            }
            mo69227c().f120410b.f120570a.clear();
        } else {
            mo69227c().f120410b.mo69224a(C44406b.REAUTH);
        }
        this.f120574d = str;
        this.f120573c = false;
        if (!linkedList.isEmpty()) {
            C44408c.f120395e.getClass();
            C61926c.m72659D(C44408c.f120397g, false, new C44464a(linkedList, this, h0Var, str, str2, a0Var), 2, (Object) null);
        }
    }

    /* renamed from: c */
    public final C44408c mo69227c() {
        return (C44408c) ((C36570n) this.f120572b).getValue();
    }

    @JavascriptInterface
    public final void sendMessage(String str, String str2) {
        C87412m.m108594g(str, "webCompt");
        C87412m.m108594g(str2, StateEvent.Name.MESSAGE);
        C44408c c = mo69227c();
        c.getClass();
        String str3 = C44408c.f120397g;
        Log.m105926v(str3, "postToBack " + str + ' ' + str2);
        C40480g f = c.mo69181f(str);
        if (f != null) {
            f.evaluateJavascript("WeixinWebCompt.onMessage(" + str2 + ')', (ValueCallback<String>) null);
        }
        c.f120410b.mo69224a(C44406b.SEND_TO_JS_CONTEXT);
    }
}
