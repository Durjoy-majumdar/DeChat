package rs1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: rs1.r2 */
public final class C13390r2 extends UIComponent {

    /* renamed from: d */
    public boolean f37929d;

    /* renamed from: e */
    public final HashMap<Long, Boolean> f37930e = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13390r2(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13390r2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
