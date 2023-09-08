package g73;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: g73.c */
public final class C8245c extends MMBaseAccessibilityConfig {

    /* renamed from: d */
    public String f27174d = "";

    /* renamed from: g73.c$a */
    public static final class C8246a extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C8245c f27175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8246a(C8245c cVar) {
            super(1);
            this.f27175d = cVar;
        }

        public Object invoke(Object obj) {
            boolean z;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String str = this.f27175d.f27174d;
            boolean z2 = view instanceof TextView;
            CharSequence charSequence = null;
            TextView textView = z2 ? (TextView) view : null;
            if (!C87412m.m108589b(str, String.valueOf(textView != null ? textView.getText() : null))) {
                C8245c cVar = this.f27175d;
                TextView textView2 = z2 ? (TextView) view : null;
                if (textView2 != null) {
                    charSequence = textView2.getText();
                }
                String valueOf = String.valueOf(charSequence);
                cVar.getClass();
                cVar.f27174d = valueOf;
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8245c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.b1p);
        root.focusFirst(C0966R.C0970id.kwv);
        root.view(C0966R.C0970id.f7v).disable();
        root.view(C0966R.C0970id.hrr).desc((int) C0966R.string.kvt);
        root.view(C0966R.C0970id.kwv).talkOn(new C8246a(this));
    }
}
