package ij2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C54497y;
import bl3.C54498z;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: ij2.m */
public final class C60330m extends C54497y<C60329l> implements C60306a {

    /* renamed from: d */
    public final C60329l f171979d = new C60329l();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60330m(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: W2 */
    public C54498z mo75316W2() {
        return this.f171979d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60330m(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
