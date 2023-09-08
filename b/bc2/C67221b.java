package bc2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmlist.BaseMvvmListActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import yb2.C15946a;
import zb2.C103001d;

/* renamed from: bc2.b */
public class C67221b<T extends C103001d<T>> extends C15946a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67221b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final C0262a<T> mo91383g3() {
        if (!(getActivity() instanceof BaseMvvmListActivity)) {
            return null;
        }
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.mvvmlist.BaseMvvmListActivity<T of com.tencent.mm.plugin.mvvmlist.uic.BaseMvvmListUIC>");
        for (UIComponent uIComponent : ((BaseMvvmListActivity) activity).getUiComponents()) {
            boolean z = uIComponent instanceof C0262a;
            if (z) {
                if (z) {
                    return (C0262a) uIComponent;
                }
                return null;
            }
        }
        return null;
    }
}
