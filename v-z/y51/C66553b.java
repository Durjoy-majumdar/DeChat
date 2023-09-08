package y51;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: y51.b */
public final class C66553b extends MMBaseAccessibilityConfig {

    /* renamed from: y51.b$a */
    public static final class C66554a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C66553b f191410d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66554a(C66553b bVar) {
            super(1);
            this.f191410d = bVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            return this.f191410d.getString(C0966R.string.c4c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66553b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.f6299b1).view(C0966R.C0970id.f5421eo).desc((C32226l<? super View, String>) new C66554a(this));
    }
}
