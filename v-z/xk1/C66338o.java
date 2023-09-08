package xk1;

import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import wg1.C66089v;
import wg1.C66096w;

/* renamed from: xk1.o */
public final class C66338o extends UIComponent {

    /* renamed from: d */
    public C66089v f190964d;

    /* renamed from: e */
    public C66096w f190965e;

    /* renamed from: f */
    public ViewGroup f190966f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66338o(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final ViewGroup mo90446c3() {
        ViewGroup viewGroup = this.f190966f;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("view");
        throw null;
    }

    public void onDestroy() {
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159363Q = null;
    }
}
