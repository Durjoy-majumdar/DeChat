package kq1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import up1.C37521f;

/* renamed from: kq1.c */
public final class C10388c extends C10395r {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10388c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: d3 */
    public boolean mo10705d3() {
        C37521f.f99374d.getClass();
        return C37521f.f99345Z3.mo60266n().intValue() == 1;
    }

    /* renamed from: e3 */
    public int mo10706e3() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10388c(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
