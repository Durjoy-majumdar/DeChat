package wc1;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import xc1.C15641a;

@C113200q(initialMode = 2)
/* renamed from: wc1.t */
public final class C15124t extends C15641a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15124t(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.d3d).view(C0966R.C0970id.huj).desc((int) C0966R.string.etq);
    }
}
