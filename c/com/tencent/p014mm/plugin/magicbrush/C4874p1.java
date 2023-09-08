package com.tencent.p014mm.plugin.magicbrush;

import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86189r;
import d42.C86190s;
import di3.C86301e;
import di3.C86312j;
import e42.C7594e;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h70.C8494c;
import java.util.HashMap;
import java.util.HashSet;
import p005bg.C0277c;
import rx3.C13604l;
import sx3.C90364q0;

@C86522b
/* renamed from: com.tencent.mm.plugin.magicbrush.p1 */
public final class C4874p1 extends C86301e implements C30200i0 {

    /* renamed from: d */
    public final HashMap<String, C32224a<C86189r<?>>> f19963d = C90364q0.m113146e(new C13604l(MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE, C4876b.f19964d), new C13604l(MagicBrushConstants$PublicServiceNames.BIZ_AD_PUBLIC_SERVICE, C4877c.f19965d));

    /* renamed from: com.tencent.mm.plugin.magicbrush.p1$a */
    public static final class C4875a implements C86189r<T> {
        /* renamed from: G */
        public void mo5786G(C86190s sVar) {
            C87412m.m108594g(sVar, "dispatcher");
        }

        /* renamed from: H */
        public void mo5787H(int i) {
        }

        /* renamed from: b */
        public void mo5788b() {
        }

        /* renamed from: i */
        public void mo5789i(String str, String str2) {
            C87412m.m108594g(str, "envId");
            C87412m.m108594g(str2, "msg");
        }

        /* renamed from: k */
        public void mo5790k(int i) {
        }

        public void onCreated() {
        }

        public void onDestroy() {
        }

        /* renamed from: s */
        public MBBuildConfig<T> mo5793s() {
            return new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
        }

        /* renamed from: w */
        public void mo5794w(int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.p1$b */
    public static final class C4876b extends C87413o implements C32224a<C86189r<?>> {

        /* renamed from: d */
        public static final C4876b f19964d = new C4876b();

        public C4876b() {
            super(0);
        }

        public Object invoke() {
            return ((C8494c) C86312j.m106911c(C8494c.class)).provide();
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.p1$c */
    public static final class C4877c extends C87413o implements C32224a<C86189r<?>> {

        /* renamed from: d */
        public static final C4877c f19965d = new C4877c();

        public C4877c() {
            super(0);
        }

        public Object invoke() {
            return ((C0277c) C86312j.m106911c(C0277c.class)).h30();
        }
    }

    /* renamed from: LL */
    public <T extends C7594e> C86189r<T> mo5785LL(String str) {
        C87412m.m108594g(str, "serviceId");
        Log.m105924i("MagicBrushPublicService", "providePublicServiceDelegate for " + str);
        C32224a aVar = this.f19963d.get(str);
        C86189r<T> rVar = aVar != null ? (C86189r) aVar.invoke() : null;
        if (rVar != null) {
            return rVar;
        }
        Log.m105920e("MagicBrushPublicService", "provide service delegate not found");
        return new C4875a();
    }
}
