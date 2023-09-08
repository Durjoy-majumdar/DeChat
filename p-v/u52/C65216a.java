package u52;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: u52.a */
public final class C65216a extends MMBaseAccessibilityConfig {

    /* renamed from: u52.a$a */
    public static final class C65217a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C65217a f187737d = new C65217a();

        public C65217a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            return "";
        }
    }

    /* renamed from: u52.a$b */
    public static final class C65218b extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C65218b f187738d = new C65218b();

        public C65218b() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            View findViewById = view.findViewById(C0966R.C0970id.gt8);
            MMSwitchBtn mMSwitchBtn = findViewById instanceof MMSwitchBtn ? (MMSwitchBtn) findViewById : null;
            return Boolean.valueOf(mMSwitchBtn != null ? mMSwitchBtn.f220433y : false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65216a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f359872ba1);
        root.view(C0966R.C0970id.iwf).desc((C32226l<? super View, String>) C65217a.f187737d).clickAs(C0966R.C0970id.gt8).checkOn(C65218b.f187738d);
        root.disable(C0966R.C0970id.gt8);
    }
}
