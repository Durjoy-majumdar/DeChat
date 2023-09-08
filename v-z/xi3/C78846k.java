package xi3;

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

/* renamed from: xi3.k */
public final class C78846k extends MMBaseAccessibilityConfig {

    /* renamed from: xi3.k$a */
    public static final class C78847a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C78847a f231671d = new C78847a();

        public C78847a() {
            super(1);
        }

        public Object invoke(Object obj) {
            TextView textView;
            CharSequence text;
            String obj2;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            return (viewGroup == null || (textView = (TextView) viewGroup.findViewById(16908310)) == null || (text = textView.getText()) == null || (obj2 = text.toString()) == null) ? "" : obj2;
        }
    }

    /* renamed from: xi3.k$b */
    public static final class C78848b extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C78848b f231672d = new C78848b();

        public C78848b() {
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

    /* renamed from: xi3.k$c */
    public static final class C78849c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C78849c f231673d = new C78849c();

        public C78849c() {
            super(1);
        }

        public Object invoke(Object obj) {
            TextView textView;
            CharSequence text;
            String obj2;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            return (viewGroup == null || (textView = (TextView) viewGroup.findViewById(16908310)) == null || (text = textView.getText()) == null || (obj2 = text.toString()) == null) ? "" : obj2;
        }
    }

    /* renamed from: xi3.k$d */
    public static final class C78850d extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C78850d f231674d = new C78850d();

        public C78850d() {
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
    public C78846k(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.be_).disable(C0966R.C0970id.jn6);
        root(C0966R.C0971layout.f359885bd2).disable(16908310);
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.bf7);
        root.view(C0966R.C0970id.kp8).clickAs(C0966R.C0970id.bab).desc((C32226l<? super View, String>) C78847a.f231671d).checkOn(C78848b.f231672d);
        root.view(C0966R.C0970id.bab).disable();
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.bf8);
        root2.view(C0966R.C0970id.kp8).clickAs(C0966R.C0970id.bab).desc((C32226l<? super View, String>) C78849c.f231673d).checkOn(C78850d.f231674d);
        root2.view(C0966R.C0970id.bab).disable();
    }
}
