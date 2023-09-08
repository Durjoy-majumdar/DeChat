package sn3;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import d62.C7250m;
import java.util.List;
import um3.C78237b;
import wd3.C65953v0;

/* renamed from: sn3.e */
public final class C77743e implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ C77745g f226556a;

    /* renamed from: b */
    public final /* synthetic */ List<String> f226557b;

    public C77743e(C77745g gVar, List<String> list) {
        this.f226556a = gVar;
        this.f226557b = list;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        this.f226556a.mo14600f3();
        if (z) {
            List<String> list = this.f226557b;
            C77745g gVar = this.f226556a;
            for (String str2 : list) {
                C77745g.m93801g3(gVar, str2);
                if (!Util.isNullOrNil(str)) {
                    C7250m.m7431a().mo136252Ar(str, str2);
                }
            }
            C77745g gVar2 = this.f226556a;
            UIStateCenter e3 = gVar2.mo14599e3();
            if (e3 != null) {
                e3.dispatch(new C78237b());
            }
            gVar2.getActivity().finish();
        }
    }
}
