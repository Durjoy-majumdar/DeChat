package fc1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: fc1.b */
public final class C8006b extends MMBaseAccessibilityConfig {

    /* renamed from: fc1.b$a */
    public static final class C8007a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C8006b f26699d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8007a(C8006b bVar) {
            super(1);
            this.f26699d = bVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            if (!C87412m.m108589b(view.getTag(C0966R.C0970id.ke7), Integer.valueOf(C0966R.raw.actionbar_icon_dark_more))) {
                return "";
            }
            String string = "1".equals(view.getTag(C0966R.C0970id.f359346ke3)) ? this.f26699d.getContext().getString(C0966R.string.h_j) : this.f26699d.getContext().getString(C0966R.string.k3h);
            C87412m.m108593f(string, "{\n                      …  }\n                    }");
            return string;
        }
    }

    /* renamed from: fc1.b$b */
    public static final class C8008b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C8008b f26700d = new C8008b();

        public C8008b() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            Object tag = view.getTag(C0966R.C0970id.f359346ke3);
            return tag instanceof String ? (String) tag : "";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8006b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        ViewSetter view = view(C0966R.C0970id.f5421eo, C0966R.C0970id.f5421eo);
        ViewType viewType = ViewType.Button;
        view.type(viewType).desc((C32226l<? super View, String>) new C8007a(this));
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.bl_);
        root.view(C0966R.C0970id.lpb).desc((int) C0966R.string.h_6);
        root.view(C0966R.C0970id.lpc).desc((int) C0966R.string.h_7);
        root.view(C0966R.C0970id.lpa).desc((int) C0966R.string.h_5);
        root.view(C0966R.C0970id.lpd).desc((int) C0966R.string.h_9);
        root.view(C0966R.C0970id.lpe).desc((int) C0966R.string.h_8);
        root.view(C0966R.C0970id.lrd).desc((int) C0966R.string.f361650ll3);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.bl_);
        root2.view(C0966R.C0970id.gz7).desc((int) C0966R.string.f361649ll2).type(viewType).clickAs(C0966R.C0970id.gz6).disableChildren();
        root2.view(C0966R.C0970id.lrc).desc((int) C0966R.string.f361648ll1).type(viewType).clickAs(C0966R.C0970id.f3n).disableChildren();
        root2.view(C0966R.C0970id.lra).desc((int) C0966R.string.lkw).type(viewType).clickAs(C0966R.C0970id.cwz).disableChildren();
        root2.view(C0966R.C0970id.lrd).desc((int) C0966R.string.f361650ll3).type(viewType).clickAs(C0966R.C0970id.f3o).disableChildren();
        root2.view(C0966R.C0970id.lrb).desc((int) C0966R.string.lkz).type(viewType).clickAs(C0966R.C0970id.f3m).disableChildren();
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0971layout.bla);
        root3.view(C0966R.C0970id.f358870hj2).desc((int) C0966R.string.f361648ll1).type(viewType).clickAs(C0966R.C0970id.f358869hj1).disableChildren();
        root3.view(C0966R.C0970id.caw).desc((int) C0966R.string.h_6).type(viewType).clickAs(C0966R.C0970id.cav).disableChildren();
        root3.view(C0966R.C0970id.l7l).desc((int) C0966R.string.lkt).type(viewType).clickAs(C0966R.C0970id.l7k).disableChildren();
        MMBaseAccessibilityConfig.ConfigHelper root4 = root(C0966R.C0970id.lar);
        root4.view(C0966R.C0970id.lat).desc((int) C0966R.string.f361498kd0).type(viewType);
        root4.view(C0966R.C0970id.lax).desc((C32226l<? super View, String>) C8008b.f26700d);
        ViewSetter desc = root4.view(C0966R.C0970id.law).desc((int) C0966R.string.f361499kd1);
        ViewType viewType2 = ViewType.TextView;
        desc.type(viewType2).clickAs(C0966R.C0970id.lau).disableChildren();
        root4.view(C0966R.C0970id.lar).desc((int) C0966R.string.f361100ha1).type(viewType2);
    }
}
