package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import di3.C86312j;
import fm0.C86962m1;
import gy3.C87412m;
import java.util.Map;
import kr0.C10403n0;
import lp3.C88631d;
import lp3.C88633e;
import rx3.C13604l;
import sx3.C90364q0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import t83.C48590l;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.m */
public final class C6274m extends C15053a {

    /* renamed from: d */
    public static final C6274m f23079d = new C6274m();

    /* renamed from: e */
    public static final int f23080e = C86962m1.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23081f = "reportMiniProgramPageData";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.m$a */
    public static final class C6275a<T> implements C88631d.C88632b {

        /* renamed from: a */
        public final /* synthetic */ C13855j f23082a;

        /* renamed from: b */
        public final /* synthetic */ C13851h1 f23083b;

        public C6275a(C13855j jVar, C13851h1 h1Var) {
            this.f23082a = jVar;
            this.f23083b = h1Var;
        }

        /* renamed from: a */
        public void mo1772a(Object obj) {
            C13849g gVar = this.f23082a.f39001d;
            String str = this.f23083b.f38990c;
            StringBuilder sb = new StringBuilder();
            C6274m.f23079d.getClass();
            sb.append(C6274m.f23081f);
            sb.append(":ok");
            gVar.mo10774a(str, sb.toString(), C90364q0.m113146e(new C13604l("reportId", (Integer) obj)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.m$b */
    public static final class C6276b<T> implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ C13855j f23084a;

        /* renamed from: b */
        public final /* synthetic */ C13851h1 f23085b;

        public C6276b(C13855j jVar, C13851h1 h1Var) {
            this.f23084a = jVar;
            this.f23085b = h1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
            if (r5 == null) goto L_0x001b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1720a(java.lang.Object r5) {
            /*
                r4 = this;
                if (r5 == 0) goto L_0x001b
                java.lang.String r5 = r5.toString()
                if (r5 == 0) goto L_0x001b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "fail "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                if (r5 != 0) goto L_0x001d
            L_0x001b:
                java.lang.String r5 = "fail"
            L_0x001d:
                t83.j r0 = r4.f23084a
                t83.g r0 = r0.f39001d
                t83.h1 r1 = r4.f23085b
                java.lang.String r1 = r1.f38990c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                com.tencent.mm.plugin.webview.ui.tools.jsapi.m r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6274m.f23079d
                r3.getClass()
                java.lang.String r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6274m.f23081f
                r2.append(r3)
                r3 = 58
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r2 = 0
                r0.mo10774a(r1, r5, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6274m.C6276b.mo1720a(java.lang.Object):void");
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Object obj = h1Var.f38983a.get("miniProgramAppId");
        MMFragmentActivity mMFragmentActivity = null;
        String obj2 = obj != null ? obj.toString() : null;
        if (obj2 == null || obj2.length() == 0) {
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, f23081f + ":fail invalid appId", (Map<String, Object>) null);
        } else {
            C88633e<Integer> TP = ((C10403n0) C86312j.m106911c(C10403n0.class)).mo10715TP(obj2);
            C13849g gVar2 = jVar.f39001d;
            C48590l lVar = gVar2 instanceof C48590l ? (C48590l) gVar2 : null;
            Context r = lVar != null ? lVar.mo73255r() : null;
            if (r instanceof MMFragmentActivity) {
                mMFragmentActivity = (MMFragmentActivity) r;
            }
            if (mMFragmentActivity != null) {
                TP.mo11397F(mMFragmentActivity);
            }
            TP.mo114038a(new C6275a(jVar, h1Var)).mo123065b(new C6276b(jVar, h1Var));
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23080e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23081f;
    }
}
