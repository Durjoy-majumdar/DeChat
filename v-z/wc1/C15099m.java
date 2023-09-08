package wc1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import xc1.C15641a;

/* renamed from: wc1.m */
public final class C15099m extends C15641a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15099m(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.j3w).view(C0966R.C0970id.e3e).desc((int) C0966R.C0970id.d8_).disableChildren();
        focusFirst(C0966R.C0970id.e3f);
        focusOrder().next((int) C0966R.C0970id.e3f).next((int) C0966R.C0970id.e3e).next((int) C0966R.C0970id.e3d);
    }
}
