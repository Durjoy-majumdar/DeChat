package pk1;

import cl1.C0702z0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fj1.C45795b;
import gy3.C87412m;
import te3.C22532vt0;

/* renamed from: pk1.n */
public final class C11972n {

    /* renamed from: a */
    public final MMActivity f34919a;

    /* renamed from: b */
    public final C45795b f34920b;

    public C11972n(MMActivity mMActivity, C45795b bVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bVar, "liveData");
        this.f34919a = mMActivity;
        this.f34920b = bVar;
    }

    /* renamed from: a */
    public static final void m11665a(C11972n nVar, C22532vt0 vt02) {
        ((C0702z0) nVar.f34920b.mo71262a(C0702z0.class)).f1684u.postValue(vt02);
    }
}
