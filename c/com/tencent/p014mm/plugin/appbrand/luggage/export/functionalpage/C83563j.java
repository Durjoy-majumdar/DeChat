package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import android.content.Context;
import bt0.C79815i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83033t;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C1933m;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C1937p;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83581k;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83585r;
import com.tencent.p014mm.plugin.appbrand.page.C83745a;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p385u2.C111105a;
import p547hb.C46016a;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j */
public class C83563j extends C83928t1 implements C1938p {

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j$a */
    public static final class C83564a extends C83745a<C83563j> {

        /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j$a$a */
        public class C83565a implements Runnable {
            public C83565a() {
            }

            public void run() {
                C79815i.C79816a aVar = C79815i.C79816a.WHITE;
                C79815i.C79816a aVar2 = C79815i.C79816a.BLACK;
                ((C83563j) C83564a.this.mo124764Z()).f244554F.mo109614d(false);
                ((C83563j) C83564a.this.mo124764Z()).f244554F.setNavHidden(false);
                ((C83563j) C83564a.this.mo124764Z()).f244554F.setMainTitle(C83564a.this.mo125216c0().getResources().getString(C0966R.string.a58));
                ((C83563j) C83564a.this.mo124764Z()).f244554F.setBackgroundColor(C111105a.m151500b(C83564a.this.mo125216c0(), C0966R.color.a7_));
                ((C83563j) C83564a.this.mo124764Z()).f244554F.setForegroundStyle((C85875k4.m106211z() ? aVar : aVar2).name());
                C83563j jVar = (C83563j) C83564a.this.mo124764Z();
                if (!C85875k4.m106211z()) {
                    aVar = aVar2;
                }
                jVar.mo116201v1(aVar.name());
                ((C83563j) C83564a.this.mo124764Z()).f244552D.setBackgroundColor(C111105a.m151500b(C83564a.this.mo125216c0(), C0966R.color.a7a));
                ((C83563j) C83564a.this.mo124764Z()).mo116208z0(false);
                ((C83563j) C83564a.this.mo124764Z()).mo116176e1("onLoadURL");
            }
        }

        public C83564a(C83563j jVar) {
            super(jVar);
        }

        /* renamed from: J */
        public boolean mo111243J(String str, C83817h4 h4Var) {
            ((C83563j) mo124764Z()).mo109673t(new C83565a());
            return true;
        }

        /* renamed from: a */
        public boolean mo111249a(int i, String str) {
            Objects.requireNonNull((C83563j) mo124764Z());
            ((C83563j) mo124764Z()).getRuntime().f244153R1.mo115875a((C1938p) mo124764Z(), i, str);
            return true;
        }

        /* renamed from: p */
        public Map<String, C82870p> mo111268p() {
            HashMap hashMap = new HashMap(C83033t.m101845f());
            for (C82870p pVar : C64197v.m75537f(new C83581k(), new C1933m(), new C1937p(), new C83585r())) {
                hashMap.put(pVar.mo114779e(), pVar);
            }
            return hashMap;
        }

        /* renamed from: p0 */
        public C83797e3 mo114318p0(Context context) {
            return new C46016a();
        }
    }

    public C83563j() {
        super(C83564a.class);
    }

    /* renamed from: G1 */
    public void mo115898G1() {
        this.f244554F.setNavHidden(false);
    }

    /* renamed from: S1 */
    public void mo115900S1() {
    }

    /* renamed from: T1 */
    public C83588k getRuntime() {
        return (C83588k) super.getRuntime();
    }

    /* renamed from: j1 */
    public void mo115902j1() {
        try {
            super.mo115902j1();
        } catch (NullPointerException e) {
            if (BuildInfo.DEBUG) {
                throw e;
            }
        }
    }

    /* renamed from: o0 */
    public void mo115903o0(C83817h4 h4Var) {
        super.mo115903o0(h4Var);
        this.f244554F.setNavHidden(true);
    }
}
