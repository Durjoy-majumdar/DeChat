package bl3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: bl3.j */
public final class C0320j extends UIComponent implements C0318h {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0320j(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: I0 */
    public void mo369I0() {
    }

    public int getLayoutId() {
        return super.getLayoutId();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0320j(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
