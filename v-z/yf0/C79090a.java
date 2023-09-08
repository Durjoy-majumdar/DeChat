package yf0;

import android.view.View;
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

/* renamed from: yf0.a */
public final class C79090a extends MMBaseAccessibilityConfig {

    /* renamed from: yf0.a$a */
    public static final class C79091a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C79091a f232238d = new C79091a();

        public C79091a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence charSequence = null;
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                charSequence = textView.getText();
            }
            return String.valueOf(charSequence);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79090a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f6258w);
        root.focusFirst(C0966R.C0970id.koj);
        ViewSetter view = root.view(C0966R.C0970id.b_6);
        ViewType viewType = ViewType.Button;
        view.type(viewType);
        root(C0966R.C0971layout.b3v).disable(C0966R.C0970id.lg_);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.b3x);
        root2.disable(C0966R.C0970id.fip);
        root2.disable(C0966R.C0970id.fhz);
        root2.disable(C0966R.C0970id.fhx);
        root2.disable(C0966R.C0970id.fih);
        root2.focusFirst(C0966R.C0970id.fig);
        root2.view(C0966R.C0970id.fig).type(viewType);
        ViewSetter view2 = root2.view(C0966R.C0970id.fio);
        ViewType viewType2 = ViewType.EditText;
        view2.type(viewType2).descFormat(C0966R.string.g38).valueByKey("LAUNCH_AA_TOTAL_MONEY_EDIT_FORM_VALUE_KEY").valueByView(C0966R.C0970id.fin);
        root2.view(C0966R.C0970id.fi5).type(viewType).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.fi6).valueByView(C0966R.C0970id.fi7);
        root2.view(C0966R.C0970id.fiu).type(viewType).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.f358502fi2).valueByView(C0966R.C0970id.f358501fi1);
        root2.view(C0966R.C0970id.fim).clickAs(C0966R.C0970id.fik);
        root2.view(C0966R.C0970id.fiy).desc((C32226l<? super View, String>) C79091a.f232238d);
        root2.view(C0966R.C0970id.bry).type(viewType).desc((int) C0966R.string.g4_);
        root(C0966R.C0971layout.b3t).view(C0966R.C0970id.f359109ix0).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.l2o).valueByView(C0966R.C0970id.f5800p3);
        root(C0966R.C0971layout.f7052w9).disable(C0966R.C0970id.f358392ev2);
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0971layout.f6311bc);
        root3.view(C0966R.C0970id.f359398kp3).descFormat(C0966R.string.jun).valueByView(16908308);
        root3.disable(16908308);
        root3.focusOrder().next(C0966R.C0970id.f5470g0).next(C0966R.C0970id.f359398kp3);
        root(C0966R.C0971layout.b3s).view(C0966R.C0970id.bdd).type(viewType);
        MMBaseAccessibilityConfig.ConfigHelper root4 = root(C0966R.C0971layout.b3r);
        root4.disable(C0966R.C0970id.iwc);
        root4.disable(C0966R.C0970id.a1p);
        root4.disable(C0966R.C0970id.fi4);
        root4.view(C0966R.C0970id.l2p).type(ViewType.TextView).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.l2o).valueByView(C0966R.C0970id.k9w);
        MMBaseAccessibilityConfig.ConfigHelper root5 = root(C0966R.C0971layout.bma);
        root5.disable(C0966R.C0970id.hsx);
        root5.disable(C0966R.C0970id.hsq);
        root5.focusFirst(C0966R.C0970id.htb);
        root5.view(C0966R.C0970id.f358912ht0).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.f358915ht3).valueByView(C0966R.C0970id.hap);
        root5.view(C0966R.C0970id.htf).type(viewType);
        root5.view(C0966R.C0970id.hsu).type(viewType);
        root5.view(C0966R.C0970id.hsp).type(viewType);
        root(C0966R.C0971layout.bm_).disable(C0966R.C0970id.ht7);
        MMBaseAccessibilityConfig.ConfigHelper root6 = root(C0966R.C0971layout.f6267a5);
        root6.disable(C0966R.C0970id.f5281at);
        root6.disable(C0966R.C0970id.iwh);
        root6.view(C0966R.C0970id.f5597je).type(viewType);
        root6.view(C0966R.C0970id.f5283av).type(viewType2).descFormat(C0966R.string.jun).valueByKey("REMITTANCE_AA_MONEY_EDIT_FORM_VALUE_KEY");
        MMBaseAccessibilityConfig.ConfigHelper root7 = root(C0966R.C0971layout.cga);
        root7.disable(C0966R.C0970id.ljn);
        root7.disable(C0966R.C0970id.lg_);
        root(C0966R.C0971layout.f6299b1).view(C0966R.C0970id.f5421eo).desc((int) C0966R.string.kzi);
        root(C0966R.C0971layout.f6265a3).view(C0966R.C0970id.f5276ao).type(viewType).desc((int) C0966R.string.f7288bo);
    }
}
