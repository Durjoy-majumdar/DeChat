package wb2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: wb2.a */
public final class C65946a extends UIComponent {

    /* renamed from: d */
    public final C13601g f189606d = C36568h.m40985a(new C65947a(this));

    /* renamed from: wb2.a$a */
    public static final class C65947a extends C87413o implements C32224a<LifecycleScope> {

        /* renamed from: d */
        public final /* synthetic */ C65946a f189607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65947a(C65946a aVar) {
            super(0);
            this.f189607d = aVar;
        }

        public Object invoke() {
            return new LifecycleScope(this.f189607d.getActivity().getClass().getSimpleName() + "_LifecycleScopeUIC", this.f189607d.getActivity(), 0, 4, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65946a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final LifecycleScope mo89983c3() {
        return (LifecycleScope) ((C36570n) this.f189606d).getValue();
    }
}
