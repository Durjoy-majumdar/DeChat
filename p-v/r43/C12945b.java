package r43;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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

/* renamed from: r43.b */
public final class C12945b extends MMBaseAccessibilityConfig {

    /* renamed from: r43.b$a */
    public static final class C12946a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C12945b f36964d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12946a(C12945b bVar) {
            super(1);
            this.f36964d = bVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence text = ((TextView) view.findViewById(C0966R.C0970id.g_u)).getText();
            if (((ImageView) view.findViewById(C0966R.C0970id.g_t)).getVisibility() != 0) {
                return String.valueOf(text);
            }
            return text + ',' + this.f36964d.getString(C0966R.string.kz5);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12945b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.cf7);
        root.view(C0966R.C0970id.g_x).descFormat(C0966R.string.l9v).valueByView(C0966R.C0970id.g_y);
        root.disable(C0966R.C0970id.g_y);
        ViewSetter view = root.view(C0966R.C0970id.g9y);
        ViewType viewType = ViewType.Button;
        view.type(viewType).descFormat(C0966R.string.l9v).valueByView(C0966R.C0970id.g9z);
        root.view(C0966R.C0970id.g_r).desc((C32226l<? super View, String>) new C12946a(this));
        root.disable(C0966R.C0970id.g_u);
        root.view(C0966R.C0970id.g_l).descFormat(C0966R.string.l9v).valueByView(C0966R.C0970id.g_m);
        root.disable(C0966R.C0970id.g_m);
        root.disable(C0966R.C0970id.g_k);
        root.view(C0966R.C0970id.g_z).type(viewType).descFormat(C0966R.string.l9v).valueByView(C0966R.C0970id.f358652ga0);
        root.disable(C0966R.C0970id.f358652ga0);
        root.view(C0966R.C0970id.g9q).type(viewType).descFormat(C0966R.string.l9y).valueByView(C0966R.C0970id.g9v).valueByView(C0966R.C0970id.gua).valueByView(C0966R.C0970id.m3w);
        root(C0966R.C0971layout.bgl).disable(C0966R.C0970id.gua);
        root.disable(C0966R.C0970id.g9v);
        root.disable(C0966R.C0970id.g9u);
        root.disable(C0966R.C0970id.g9x);
        root.disable(C0966R.C0970id.g9w);
        root.disable(C0966R.C0970id.m3x);
        root(C0966R.C0971layout.b8p).view(C0966R.C0970id.fm6).type(viewType).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.g_3).valueByView(C0966R.C0970id.g_1);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.b8z);
        root2.disable(C0966R.C0970id.gan);
        root2.view(C0966R.C0970id.gaz).type(viewType).descFormat(C0966R.string.l9v).valueByView(C0966R.C0970id.gay);
        root2.view(C0966R.C0970id.gar).type(viewType).descFormat(C0966R.string.f361604l60).valueByView(C0966R.C0970id.gas).valueByView(C0966R.C0970id.gau).valueByView(C0966R.C0970id.gaq).valueByView(C0966R.C0970id.gat);
        root.view(C0966R.C0970id.g_9).type(viewType).descFormat(C0966R.string.l9v).valueByView(C0966R.C0970id.g__);
        root.view(C0966R.C0970id.g_6).type(viewType).descFormat(C0966R.string.l9v).valueByView(C0966R.C0970id.g_7);
        root.view(C0966R.C0970id.g_a).type(viewType).descFormat(C0966R.string.l9v).valueByView(C0966R.C0970id.g_b);
        root(C0966R.C0971layout.f6299b1).view(C0966R.C0970id.f5421eo).desc((int) C0966R.string.kzi);
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0971layout.cfa);
        root3.view(C0966R.C0970id.g9d).type(viewType).descFormat(C0966R.string.l9y).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.g9c).valueByView(C0966R.C0970id.ew6);
        root3.disable(C0966R.C0970id.g9c);
        root3.disable(C0966R.C0970id.ew6);
        root3.disable(C0966R.C0970id.gb6);
        root3.disable(C0966R.C0970id.gb5);
        root3.disable(C0966R.C0970id.gkr);
        root3.disable(C0966R.C0970id.gbd);
        root3.disable(C0966R.C0970id.g9e);
        MMBaseAccessibilityConfig.ConfigHelper root4 = root(C0966R.C0971layout.ch_);
        root4.disable(C0966R.C0970id.ffr);
        root4.view(C0966R.C0970id.ffp).type(viewType);
        root4.view(C0966R.C0970id.ffq).type(viewType).descFormat(C0966R.string.l9v).valueByKey("keyboard_title_key");
        root(C0966R.C0971layout.cf_).disable(C0966R.C0970id.ljn);
        root3.view(C0966R.C0970id.gbh).type(viewType);
        MMBaseAccessibilityConfig.ConfigHelper root5 = root(C0966R.C0971layout.b98);
        root5.view(C0966R.C0970id.gal).type(viewType);
        root5.focusFirst(C0966R.C0970id.gbk);
        root3.view(C0966R.C0970id.gab).type(ViewType.TextView).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.gad).valueByView(C0966R.C0970id.gac);
        root3.disable(C0966R.C0970id.gad);
        MMBaseAccessibilityConfig.ConfigHelper root6 = root(C0966R.C0971layout.cf9);
        root6.view(C0966R.C0970id.f5804p7).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.f5811pd).valueByView(C0966R.C0970id.f5810pc);
        root6.focusFirst(C0966R.C0970id.k_e);
    }
}
