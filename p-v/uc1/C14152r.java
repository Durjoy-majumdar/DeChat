package uc1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import xc1.C15641a;

/* renamed from: uc1.r */
public final class C14152r extends C15641a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14152r(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.cd_).view(C0966R.C0970id.cd_).desc((int) C0966R.string.d0d);
        root(C0966R.C0970id.i0c).view(C0966R.C0970id.i0c).desc((int) C0966R.string.d6g);
    }
}
