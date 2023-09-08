package p242ti;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: ti.b */
public final class C13926b extends MMBaseAccessibilityConfig {

    /* renamed from: ti.b$a */
    public static final class C13927a extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C13927a f39128d = new C13927a();

        public C13927a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C87412m.m108589b(view.getTag(C0966R.C0970id.bp8), Boolean.TRUE));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13926b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.bw7);
        root.view(C0966R.C0970id.f358464fa0).checkOn(C13927a.f39128d);
        root.view(C0966R.C0970id.am9).disableChildren();
        root.view(C0966R.C0970id.am9).disable();
        root.view(C0966R.C0970id.j_h).disable();
    }
}
