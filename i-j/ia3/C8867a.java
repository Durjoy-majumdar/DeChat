package ia3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: ia3.a */
public final class C8867a extends MMBaseAccessibilityConfig {

    /* renamed from: ia3.a$a */
    public static final class C8868a extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C8868a f28133d = new C8868a();

        public C8868a() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBox checkBox;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            return Boolean.valueOf((viewGroup == null || (checkBox = (CheckBox) viewGroup.findViewById(C0966R.C0970id.kbi)) == null) ? false : checkBox.isChecked());
        }
    }

    /* renamed from: ia3.a$b */
    public static final class C8869b extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C8869b f28134d = new C8869b();

        public C8869b() {
            super(1);
        }

        public Object invoke(Object obj) {
            CheckBox checkBox;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            return Boolean.valueOf((viewGroup == null || (checkBox = (CheckBox) viewGroup.findViewById(C0966R.C0970id.a1i)) == null) ? false : checkBox.isChecked());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8867a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f7136ze);
        ViewSetter view = root.view(C0966R.C0970id.kbj);
        ViewType viewType = ViewType.CheckBox;
        view.type(viewType).desc((int) C0966R.C0970id.kbf).checkOn(C8868a.f28133d);
        root.view(C0966R.C0970id.a1k).type(viewType).desc((int) C0966R.C0970id.a1j).checkOn(C8869b.f28134d);
    }
}
