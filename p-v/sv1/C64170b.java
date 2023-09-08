package sv1;

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

/* renamed from: sv1.b */
public final class C64170b extends MMBaseAccessibilityConfig {

    /* renamed from: sv1.b$a */
    public static final class C64171a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C64170b f181892d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64171a(C64170b bVar) {
            super(1);
            this.f181892d = bVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            return this.f181892d.getString(C0966R.string.ihp);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64170b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        view(C0966R.C0970id.cij, C0966R.C0970id.cij).disable();
        view(C0966R.C0970id.bec, C0966R.C0970id.bec).desc((C32226l<? super View, String>) new C64171a(this)).type(ViewType.Button);
    }
}
