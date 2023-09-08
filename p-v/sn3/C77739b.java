package sn3;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import d62.C7250m;
import um3.C78237b;
import wd3.C65953v0;

/* renamed from: sn3.b */
public final class C77739b implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ C77741d f226550a;

    /* renamed from: b */
    public final /* synthetic */ String f226551b;

    /* renamed from: c */
    public final /* synthetic */ String f226552c;

    public C77739b(C77741d dVar, String str, String str2) {
        this.f226550a = dVar;
        this.f226551b = str;
        this.f226552c = str2;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        this.f226550a.mo14600f3();
        if (z) {
            C77741d.m93797g3(this.f226550a, this.f226551b, this.f226552c);
            if (!Util.isNullOrNil(str)) {
                C7250m.m7431a().mo136252Ar(str, this.f226551b);
            }
            C77741d dVar = this.f226550a;
            UIStateCenter e3 = dVar.mo14599e3();
            if (e3 != null) {
                e3.dispatch(new C78237b());
            }
            dVar.getActivity().finish();
        }
    }
}
