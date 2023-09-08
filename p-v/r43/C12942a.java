package r43;

import android.text.Editable;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tenpay.android.wechat.TenpaySecureEditText;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: r43.a */
public final class C12942a extends MMBaseAccessibilityConfig {

    /* renamed from: r43.a$a */
    public static final class C12943a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C12942a f36962d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12943a(C12942a aVar) {
            super(1);
            this.f36962d = aVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            Editable text = ((TenpaySecureEditText) view.findViewById(C0966R.C0970id.lg_)).getText();
            if (Util.isNullOrNil((CharSequence) text)) {
                return String.valueOf(this.f36962d.getString(C0966R.string.kmb));
            }
            return this.f36962d.getString(C0966R.string.kmb) + ",¥" + text;
        }
    }

    /* renamed from: r43.a$b */
    public static final class C12944b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C12942a f36963d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12944b(C12942a aVar) {
            super(1);
            this.f36963d = aVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            Editable text = ((TenpaySecureEditText) view.findViewById(C0966R.C0970id.lg_)).getText();
            if (Util.isNullOrNil((CharSequence) text)) {
                return String.valueOf(this.f36963d.getString(C0966R.string.f361531kl2));
            }
            return this.f36963d.getString(C0966R.string.f361531kl2) + ",¥" + text;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12942a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.cdm);
        root.view(C0966R.C0970id.kmx).disable();
        root.view(C0966R.C0970id.lej).disable();
        root.view(C0966R.C0970id.ler).descFormat(C0966R.string.klk).valueByString(C0966R.string.klq).valueByView(C0966R.C0970id.gua);
        ViewSetter expand = root.view(C0966R.C0970id.a4x).expand(12, 12, 12, 12);
        ViewType viewType = ViewType.Button;
        expand.type(viewType).desc((int) C0966R.C0970id.a4y);
        root.view(C0966R.C0970id.lep).expand(12, 12, 12, 12).type(viewType);
        root.focusFirst(C0966R.C0970id.ler);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.cdp);
        root2.view(C0966R.C0970id.f357493a50).descFormat(C0966R.string.juq).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.f357494a51).valueByView(C0966R.C0970id.ew6).valueByView(C0966R.C0970id.ew7).type(viewType);
        root2.view(C0966R.C0970id.gbe).disable();
        view(C0966R.C0970id.gym, C0966R.C0970id.ljn).disable();
        ViewSetter desc = view(C0966R.C0970id.gym, C0966R.C0970id.lg_).desc((C32226l<? super View, String>) new C12943a(this));
        ViewType viewType2 = ViewType.TextView;
        desc.type(viewType2);
        root2.view(C0966R.C0970id.ga4).type(viewType);
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0971layout.cdl);
        root3.view(C0966R.C0970id.f357493a50).descFormat(C0966R.string.juq).valueByView(C0966R.C0970id.ljn).valueByView(C0966R.C0970id.f357494a51).valueByView(C0966R.C0970id.ew6).valueByView(C0966R.C0970id.ew7).type(viewType);
        root3.view(C0966R.C0970id.g97).disable();
        view(C0966R.C0970id.f357496a53, C0966R.C0970id.ljn).disable();
        view(C0966R.C0970id.f357496a53, C0966R.C0970id.lg_).desc((C32226l<? super View, String>) new C12944b(this)).type(viewType2);
        root3.view(C0966R.C0970id.czz).expand(12, 12, 12, 12).type(viewType);
        root3.view(C0966R.C0970id.czw).expand(12, 12, 12, 12).type(viewType);
        root3.view(C0966R.C0970id.m3q).descFormat(C0966R.string.ksf).valueByView(C0966R.C0970id.m3r).valueByView(C0966R.C0970id.m3q).expand(12, 12, 12, 12).type(viewType);
        root(C0966R.C0971layout.ch_).view(C0966R.C0970id.ffq).type(viewType).descFormat(C0966R.string.l9v).valueByKey("keyboard_title_key");
        root(C0966R.C0971layout.b98).view(C0966R.C0970id.gal).type(viewType).desc((int) C0966R.string.bfj);
        root(C0966R.C0971layout.f6299b1).view(C0966R.C0970id.f5421eo).desc((int) C0966R.string.kzi);
    }
}
