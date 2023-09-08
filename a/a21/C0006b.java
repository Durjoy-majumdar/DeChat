package a21;

import android.text.SpannedString;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: a21.b */
public final class C0006b extends MMBaseAccessibilityConfig {

    /* renamed from: a21.b$a */
    public static final class C0007a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C0006b f4d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0007a(C0006b bVar) {
            super(1);
            this.f4d = bVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            CharSequence text = ((TextView) this.f4d.findViewById(16908310)).getText();
            C87412m.m108592e(text, "null cannot be cast to non-null type android.text.SpannedString");
            String obj2 = ((WalletTextView) this.f4d.findViewById(16908304)).mo105014a().toString();
            return ((SpannedString) text).toString() + obj2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0006b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.f7023v8).disable(16908298);
        root(C0966R.C0971layout.f7027vb).view(C0966R.C0970id.hs5).disableChildren().desc((C32226l<? super View, String>) new C0007a(this));
        root(C0966R.C0971layout.f7024v9).disable(C0966R.C0970id.bhe);
        ViewSetter view = root(C0966R.C0971layout.f7022v7).view(C0966R.C0970id.f357486a34);
        ViewType viewType = ViewType.Button;
        view.type(viewType).desc((int) C0966R.string.bfj);
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f7025v_);
        root.disable(C0966R.C0970id.bhp);
        root.disable(C0966R.C0970id.bhh);
        root.view(C0966R.C0970id.bi9).type(viewType).desc((int) C0966R.string.b_u);
        root.view(C0966R.C0970id.bhf).type(viewType).desc((int) C0966R.string.hqa);
        root.view(C0966R.C0970id.bik).type(viewType);
        root.view(C0966R.C0970id.bhw).type(viewType);
        root.view(C0966R.C0970id.bgf).type(viewType).desc((int) C0966R.string.bgq).disableChildren();
        root.view(C0966R.C0970id.bha).descFormat(C0966R.string.bhj).valueByView(C0966R.C0970id.bhb).valueByView(C0966R.C0970id.bha);
        root(C0966R.C0971layout.bkt).view(C0966R.C0970id.f359415kt1).type(viewType).desc((int) C0966R.string.bfj);
        root(C0966R.C0971layout.f7125z1).view(C0966R.C0970id.f359415kt1).type(viewType);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.atk);
        ViewSetter view2 = root2.view(C0966R.C0970id.mjf);
        ViewType viewType2 = ViewType.TextView;
        view2.type(viewType2);
        root2.view(C0966R.C0970id.mje).type(viewType2);
        root(2306886).disable(2306886);
        root(2306885).disable(2306885);
        focusOrder().next(16908308);
    }
}
