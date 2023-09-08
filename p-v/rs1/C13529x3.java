package rs1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: rs1.x3 */
public final class C13529x3 extends UIComponent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13529x3(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13529x3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
