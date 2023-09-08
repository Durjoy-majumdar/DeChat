package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import ea3.C58536w;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import nj3.C11184p0;
import nj3.C76875f0;
import rx3.C13598b0;
import t83.C48590l;
import wc3.C15133e0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.e */
public final class C44251e implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C15133e0 f119909d;

    /* renamed from: e */
    public final /* synthetic */ C58536w f119910e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<String, C13598b0> f119911f;

    /* renamed from: g */
    public final /* synthetic */ BaseWebViewController f119912g;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.e$a */
    public static final class C44252a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58536w f119913d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<String, C13598b0> f119914e;

        /* renamed from: f */
        public final /* synthetic */ BaseWebViewController f119915f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44252a(C58536w wVar, C32226l<? super String, C13598b0> lVar, BaseWebViewController baseWebViewController) {
            super(1);
            this.f119913d = wVar;
            this.f119914e = lVar;
            this.f119915f = baseWebViewController;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "username");
            this.f119913d.f167570b = 3;
            HashMap hashMap = new HashMap();
            hashMap.put("sourUserName", str);
            C58536w wVar = this.f119913d;
            wVar.getClass();
            wVar.f167569a = str;
            C32226l<String, C13598b0> lVar = this.f119914e;
            if (lVar != null) {
                lVar.invoke(str);
            } else {
                C48590l g0 = this.f119915f.mo67720g0();
                if (g0 != null) {
                    g0.mo73243l("sendAppMessage", true);
                    g0.mo73237f0(hashMap, 2);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C44251e(C15133e0 e0Var, C58536w wVar, C32226l<? super String, C13598b0> lVar, BaseWebViewController baseWebViewController) {
        this.f119909d = e0Var;
        this.f119910e = wVar;
        this.f119911f = lVar;
        this.f119912g = baseWebViewController;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem instanceof C76875f0) {
            this.f119909d.xc0((C76875f0) menuItem, new C44252a(this.f119910e, this.f119911f, this.f119912g));
        }
    }
}
