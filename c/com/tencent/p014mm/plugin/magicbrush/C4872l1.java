package com.tencent.p014mm.plugin.magicbrush;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C7169q;
import di3.C86301e;
import di3.C86312j;
import e42.C86434m;
import e42.C86436p;
import ei3.C86522b;
import fy3.C32224a;
import g70.C8239c;
import gy3.C87412m;
import gy3.C87413o;
import h70.C8494c;
import java.util.HashMap;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;

@C86522b
/* renamed from: com.tencent.mm.plugin.magicbrush.l1 */
public final class C4872l1 extends C86301e implements C30193g0 {

    /* renamed from: d */
    public final C13601g f19961d = C36568h.m40985a(C4873a.f19962d);

    /* renamed from: com.tencent.mm.plugin.magicbrush.l1$a */
    public static final class C4873a extends C87413o implements C32224a<HashMap<String, C7169q>> {

        /* renamed from: d */
        public static final C4873a f19962d = new C4873a();

        public C4873a() {
            super(0);
        }

        public Object invoke() {
            C8239c provide = ((C8494c) C86312j.m106911c(C8494c.class)).provide();
            C87412m.m108592e(provide, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.api.IMBPluginProvider");
            return C90364q0.m113146e(new C13604l(MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE, provide));
        }
    }

    /* renamed from: Q */
    public C86434m mo5784Q(String str, String str2) {
        C86434m u;
        C87412m.m108594g(str, "provider");
        C87412m.m108594g(str2, ProviderConstants.API_COLNAME_FEATURE_VERSION);
        Log.m105924i("MagicBrushPluginMgrFeat", "providePlugin by " + str + ", version is " + str2);
        C7169q qVar = (C7169q) ((HashMap) ((C36570n) this.f19961d).getValue()).get(str);
        if (qVar == null || (u = qVar.mo8353u(str2)) == null) {
            Log.m105920e("MagicBrushPluginMgrFeat", "plugin " + str + " not provided");
            return new C86436p(";console.error(\"plugin " + str + " not provided\")");
        }
        Log.m105924i("MagicBrushPluginMgrFeat", "providePlugin done");
        return u;
    }
}
