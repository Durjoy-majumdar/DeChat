package th0;

import com.tencent.p014mm.modelcdntran.C55385t;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import p159gw.C98250h;
import p434ig.C98672d;

/* renamed from: th0.i */
public final class C64931i implements C92795s {

    /* renamed from: d */
    public final /* synthetic */ C98672d f186967d;

    /* renamed from: e */
    public final /* synthetic */ String f186968e;

    /* renamed from: f */
    public final /* synthetic */ MMActivity f186969f;

    public C64931i(C98672d dVar, String str, MMActivity mMActivity) {
        this.f186967d = dVar;
        this.f186968e = str;
        this.f186969f = mMActivity;
    }

    /* renamed from: o2 */
    public void mo76200o2(int i, C55385t tVar) {
        Class cls = C98250h.class;
        C87412m.m108594g(tVar, "info");
        if (C87412m.m108589b(tVar.f157721c, this.f186967d.mo55264K())) {
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    if (this.f186967d.mo55274P() == 4) {
                        MMActivity mMActivity = this.f186969f;
                        String str = this.f186968e;
                        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        C87412m.m108594g(str, "path");
                        ((C98250h) C86312j.m106911c(cls)).mo137342Lm(mMActivity, str, new C13924g(str, mMActivity));
                        return;
                    }
                    MMActivity mMActivity2 = this.f186969f;
                    String str2 = this.f186968e;
                    C87412m.m108594g(mMActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    C87412m.m108594g(str2, "path");
                    ((C98250h) C86312j.m106911c(cls)).mo137346Zv(mMActivity2, str2, new C64929f(mMActivity2));
                }
            } else if (this.f186967d.mo55274P() == 4) {
                String str3 = tVar.f157726h;
                if (!(str3 == null || str3.length() == 0)) {
                    z = false;
                }
                String str4 = z ? this.f186968e : tVar.f157726h;
                if (str4 != null) {
                    MMActivity mMActivity3 = this.f186969f;
                    C87412m.m108594g(mMActivity3, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    ((C98250h) C86312j.m106911c(cls)).mo137342Lm(mMActivity3, str4, new C13924g(str4, mMActivity3));
                }
            } else {
                String str5 = tVar.f157726h;
                if (!(str5 == null || str5.length() == 0)) {
                    z = false;
                }
                String str6 = z ? this.f186968e : tVar.f157726h;
                if (str6 != null) {
                    MMActivity mMActivity4 = this.f186969f;
                    C87412m.m108594g(mMActivity4, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    ((C98250h) C86312j.m106911c(cls)).mo137346Zv(mMActivity4, str6, new C64929f(mMActivity4));
                }
            }
        }
    }
}
