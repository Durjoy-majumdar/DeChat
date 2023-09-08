package wg1;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C113200q;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.C55757d0;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import ht1.C8817y2;
import ht1.C8819z2;

@C113200q(initialMode = 2)
/* renamed from: wg1.y1 */
public final class C15368y1 extends UIComponent implements C8817y2 {

    /* renamed from: d */
    public final C55757d0 f41724d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15368y1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f41724d = new C55757d0((Activity) appCompatActivity);
    }

    public void onDestroy() {
        this.f41724d.onDetach();
    }

    /* renamed from: v2 */
    public C8819z2 mo9643v2() {
        return this.f41724d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15368y1(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        this.f41724d = new C55757d0(fragment);
    }
}
