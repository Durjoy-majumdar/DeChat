package sn3;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import d62.C7250m;
import um3.C78237b;
import wd3.C65953v0;

/* renamed from: sn3.f */
public final class C77744f implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ C77745g f226558a;

    /* renamed from: b */
    public final /* synthetic */ String f226559b;

    public C77744f(C77745g gVar, String str) {
        this.f226558a = gVar;
        this.f226559b = str;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        this.f226558a.mo14600f3();
        if (z) {
            C77745g.m93801g3(this.f226558a, this.f226559b);
            if (!Util.isNullOrNil(str)) {
                C7250m.m7431a().mo136252Ar(str, this.f226559b);
            }
            C77745g gVar = this.f226558a;
            UIStateCenter e3 = gVar.mo14599e3();
            if (e3 != null) {
                e3.dispatch(new C78237b());
            }
            gVar.getActivity().finish();
        }
    }
}
