package rs1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C36568h;
import ye1.C66632n;

/* renamed from: rs1.w5 */
public class C63663w5 extends UIComponent {

    /* renamed from: rs1.w5$a */
    public static final class C63664a extends C87413o implements C32224a<C66632n> {

        /* renamed from: d */
        public final /* synthetic */ C63663w5 f180484d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63664a(C63663w5 w5Var) {
            super(0);
            this.f180484d = w5Var;
        }

        public Object invoke() {
            return C66632n.m78606a(this.f180484d.getRootView().findViewById(C0966R.C0970id.edb));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63663w5(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C36568h.m40985a(new C63664a(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63663w5(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C36568h.m40985a(new C63664a(this));
    }
}
