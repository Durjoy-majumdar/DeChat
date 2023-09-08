package bl3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: bl3.k */
public final class C0321k extends UIComponent implements C0319i {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0321k(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: S1 */
    public void mo370S1() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0321k(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
