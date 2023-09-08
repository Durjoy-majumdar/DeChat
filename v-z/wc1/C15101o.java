package wc1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import sx3.C64197v;
import xc1.C15641a;

/* renamed from: wc1.o */
public final class C15101o extends C15641a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15101o(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.g18);
        root.view(C0966R.C0970id.hyo).desc((int) C0966R.string.ehl).expand(12, 12, 12, 12);
        for (Number intValue : C64197v.m75537f(Integer.valueOf(C0966R.C0970id.hyw), Integer.valueOf(C0966R.C0970id.hyx), Integer.valueOf(C0966R.C0970id.hyp), Integer.valueOf(C0966R.C0970id.hyt), Integer.valueOf(C0966R.C0970id.hyy), Integer.valueOf(C0966R.C0970id.l54))) {
            ViewSetter view = root.view(intValue.intValue());
            C87412m.m108594g(view, "<this>");
            view.desc((C32226l<? super View, String>) C15100n.f41237d);
        }
    }
}
