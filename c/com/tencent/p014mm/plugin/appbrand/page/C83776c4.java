package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.page.c4 */
public final class C83776c4 extends C83910s1 {

    /* renamed from: com.tencent.mm.plugin.appbrand.page.c4$a */
    public static final class C83777a extends C83858n3 {

        /* renamed from: b */
        public final /* synthetic */ C83776c4 f244528b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83777a(C83776c4 c4Var) {
            super(c4Var);
            this.f244528b = c4Var;
        }

        /* renamed from: a */
        public String mo116116a(String str) {
            if (!C87412m.m108589b(str, "WAWebview.js")) {
                return super.mo116116a(str);
            }
            Object t = this.f244528b.mo116072t(ICommLibReader.class);
            C87412m.m108591d(t);
            String b = ((ICommLibReader) t).mo113372b("WAWebview.js");
            C87412m.m108591d(b);
            StringBuilder sb = new StringBuilder();
            C82381f Z = this.f244528b.mo124764Z();
            C87412m.m108592e(Z, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.MonkeyTestAppPageView");
            sb.append(((C83768b4) Z).f244513p1);
            sb.append("\n\n");
            sb.append(b);
            return sb.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83776c4(C83928t1 t1Var) {
        super(t1Var);
        C87412m.m108594g(t1Var, "pv");
    }

    /* renamed from: o0 */
    public C83816h3 mo116068o0() {
        return new C83777a(this);
    }
}
