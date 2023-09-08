package ij2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C54497y;
import bl3.C54498z;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C58085t0;
import gy3.C87412m;
import rx3.C36570n;

/* renamed from: ij2.k */
public final class C60328k extends C54497y<C60327j> {

    /* renamed from: d */
    public final C60327j f171977d = new C60327j();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60328k(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: W2 */
    public C54498z mo75316W2() {
        return this.f171977d;
    }

    public void onCleared() {
        super.onCleared();
        C60327j jVar = this.f171977d;
        ((C58085t0) ((C36570n) jVar.f152777d).getValue()).mo82832d(jVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60328k(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
