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

/* renamed from: g73.a */
public final class C8242a extends MMBaseAccessibilityConfig {

    /* renamed from: g73.a$a */
    public static final class C8243a extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C8243a f27171d = new C8243a();

        public C8243a() {
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
            return Boolean.valueOf(!(String.valueOf(charSequence).length() == 0));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8242a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.arm);
        root.focusFirst(C0966R.C0970id.e9m);
        root.view(C0966R.C0970id.e9m).talkOn(C8243a.f27171d);
    }
}
