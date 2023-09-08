package r43;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: r43.d */
public final class C12948d extends MMBaseAccessibilityConfig {

    /* renamed from: r43.d$a */
    public static final class C12949a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C12949a f36965d = new C12949a();

        public C12949a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str;
            CharSequence text;
            String obj2;
            CharSequence text2;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            StringBuilder sb = new StringBuilder();
            TextView textView = (TextView) view.findViewById(16908310);
            String str2 = "";
            if (textView == null || (text2 = textView.getText()) == null || (str = text2.toString()) == null) {
                str = str2;
            }
            sb.append(str);
            sb.append(",");
            TextView textView2 = (TextView) view.findViewById(16908304);
            if (!(textView2 == null || (text = textView2.getText()) == null || (obj2 = text.toString()) == null)) {
                str2 = obj2;
            }
            sb.append(str2);
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "sp.toString()");
            return sb4;
        }
    }

    /* renamed from: r43.d$b */
    public static final class C12950b extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C12950b f36966d = new C12950b();

        public C12950b() {
            super(1);
        }

        public Object invoke(Object obj) {
            MMSwitchBtn mMSwitchBtn;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            return Boolean.valueOf((viewGroup == null || (mMSwitchBtn = (MMSwitchBtn) viewGroup.findViewById(C0966R.C0970id.bab)) == null) ? false : mMSwitchBtn.f220433y);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12948d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.cdn);
        root.view(C0966R.C0970id.l49).disableChildren();
        root.focusFirst(C0966R.C0970id.l49);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.f6546hu);
        root2.view(C0966R.C0970id.br8).disable();
        root2.view(C0966R.C0970id.j7a).disable();
        root2.view(C0966R.C0970id.ief).disable();
        root2.view(C0966R.C0970id.f359398kp3).disable();
        root2.view(C0966R.C0970id.h35).disableChildren().clickAs(C0966R.C0970id.bab).desc((C32226l<? super View, String>) C12949a.f36965d).checkOn(C12950b.f36966d);
        root(C0966R.C0970id.f5448fe).view(C0966R.C0970id.f359398kp3).disable();
    }
}
