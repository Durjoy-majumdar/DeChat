package ee3;

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

/* renamed from: ee3.a */
public final class C45650a extends MMBaseAccessibilityConfig {

    /* renamed from: ee3.a$a */
    public static final class C45651a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C45650a f123445d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45651a(C45650a aVar) {
            super(1);
            this.f123445d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f123445d.getContext().getString(C0966R.string.k3j);
            C87412m.m108593f(string, "context.getString(com.te…ing.top_item_desc_search)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45650a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.gs5).view(C0966R.C0970id.gs5).type(ViewType.Button).desc((C32226l<? super View, String>) new C45651a(this));
    }
}
