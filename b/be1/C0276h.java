package be1;

import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import od1.C11404g;
import te3.C51270sn1;

/* renamed from: be1.h */
public final class C0276h extends C11404g<C51270sn1> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0276h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: d3 */
    public void mo327d3(int i, String str) {
        FrameLayout frameLayout = this.f33560g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }
}
