package y51;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: y51.a */
public final class C66551a extends MMBaseAccessibilityConfig {

    /* renamed from: y51.a$a */
    public static final class C66552a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C66551a f191409d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66552a(C66551a aVar) {
            super(1);
            this.f191409d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            return this.f191409d.getString(C0966R.string.c6l);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66551a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.a1m).view(C0966R.C0970id.f358470fb2).descFormat(C0966R.string.c7v).valueByView(C0966R.C0970id.fbd);
        view(C0966R.C0970id.f5421eo, C0966R.C0970id.f5421eo).type(ViewType.Button).desc((C32226l<? super View, String>) new C66552a(this));
    }
}
