package el1;

import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: el1.v */
public final class C7765v extends C7736a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7765v(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: n3 */
    public boolean mo8856n3() {
        return !getIntent().getBooleanExtra("KEY_PARAMS_IS_TEST_LIVE", false);
    }

    /* renamed from: o3 */
    public void mo8878o3(boolean z) {
        if (z) {
            mo8854l3();
            mo8855m3();
            ViewGroup viewGroup = this.f26189d;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.f26189d;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        mo8847d3();
    }
}
