package xi3;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

@C113200q(initialMode = 2)
/* renamed from: xi3.j */
public final class C15709j extends MMBaseAccessibilityConfig {

    /* renamed from: xi3.j$a */
    public static final class C15710a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ String f42399d;

        /* renamed from: e */
        public final /* synthetic */ String f42400e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15710a(String str, String str2) {
            super(1);
            this.f42399d = str;
            this.f42400e = str2;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return (C87412m.m108589b(view.getTag(C0966R.C0970id.ke7), Integer.valueOf(C0966R.raw.actionbar_icon_dark_close)) || C87412m.m108589b(view.getTag(C0966R.C0970id.ke7), Integer.valueOf(C0966R.raw.actionbar_icon_light_close))) ? this.f42399d : (C87412m.m108589b(view.getTag(C0966R.C0970id.ke7), Integer.valueOf(C0966R.raw.actionbar_icon_dark_back)) || C87412m.m108589b(view.getTag(C0966R.C0970id.ke7), Integer.valueOf(C0966R.raw.actionbar_icon_light_back))) ? this.f42400e : this.f42400e;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15709j(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        String string = getResources().getString(C0966R.string.f7933wn);
        C87412m.m108593f(string, "resources.getString(R.string.app_close)");
        String string2 = getResources().getString(C0966R.string.f7574k3);
        C87412m.m108593f(string2, "resources.getString(R.string.app_back)");
        C87412m.m108593f(getResources().getString(C0966R.string.f360097a31), "resources.getString(R.string.app_share)");
        view(C0966R.C0970id.f5470g0, C0966R.C0970id.f5470g0).type(ViewType.Button).desc((C32226l<? super View, String>) new C15710a(string, string2));
    }
}
