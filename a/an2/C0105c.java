package an2;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: an2.c */
public final class C0105c extends MMBaseAccessibilityConfig {

    /* renamed from: an2.c$a */
    public static final class C0106a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C0105c f547d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0106a(C0105c cVar) {
            super(1);
            this.f547d = cVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            Object tag = ((TextView) view.findViewById(C0966R.C0970id.kue)).getTag(C0966R.C0970id.f359170jd3);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            int intValue = num != null ? num.intValue() : -1;
            if (intValue == 1) {
                String string = this.f547d.getContext().getString(C0966R.string.f7402fa);
                C87412m.m108593f(string, "{\n                      …tn)\n                    }");
                return string;
            } else if (intValue != 2) {
                return ((TextView) view.findViewById(C0966R.C0970id.kuj)).getText().toString();
            } else {
                String string2 = this.f547d.getContext().getString(C0966R.string.f360334by2);
                C87412m.m108593f(string2, "{\n                      …tn)\n                    }");
                return string2;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0105c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.by7).view(C0966R.C0970id.kuh).desc((C32226l<? super View, String>) new C0106a(this)).type(ViewType.Button);
    }
}
