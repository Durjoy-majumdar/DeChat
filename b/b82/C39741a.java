package b82;

import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;

/* renamed from: b82.a */
public final class C39741a extends MMBaseAccessibilityConfig {

    /* renamed from: b82.a$a */
    public static final class C39742a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C39742a f106631d = new C39742a();

        public C39742a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            Object tag = view.getTag(C0966R.C0970id.keb);
            C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.String");
            return (String) tag;
        }
    }

    /* renamed from: b82.a$b */
    public static final class C39743b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C39741a f106632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39743b(C39741a aVar) {
            super(1);
            this.f106632d = aVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            ViewParent parent = view.getParent();
            Object obj2 = null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                obj2 = view2.getTag(C0966R.C0970id.kea);
            }
            String format = String.format(this.f106632d.getString(C0966R.string.gyk), Arrays.copyOf(new Object[]{String.valueOf(obj2)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: b82.a$c */
    public static final class C39744c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C39741a f106633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39744c(C39741a aVar) {
            super(1);
            this.f106633d = aVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            ViewParent parent = view.getParent();
            Object obj2 = null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                obj2 = view2.getTag(C0966R.C0970id.kea);
            }
            String format = String.format(this.f106633d.getString(C0966R.string.gyl), Arrays.copyOf(new Object[]{String.valueOf(obj2)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39741a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.bhj);
        root.view(C0966R.C0970id.f9b).descFormat(C0966R.string.gzh).valueByView(C0966R.C0970id.f9c);
        root.view(C0966R.C0970id.f359224jn2).desc((C32226l<? super View, String>) C39742a.f106631d);
        root.view(C0966R.C0970id.f359225jn3).disable();
        root.view(C0966R.C0970id.f8l).disable();
        root.view(C0966R.C0970id.f9a).disable();
        root(C0966R.C0971layout.b_w).view(C0966R.C0970id.goy).descFormat(C0966R.string.f361063h01).valueByView(C0966R.C0970id.a2k);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.bhg);
        root2.view(C0966R.C0970id.h4_).descFormat(C0966R.string.gze).valueByView(C0966R.C0970id.f2i);
        root2.view(C0966R.C0970id.f2i).disable();
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0971layout.bhe);
        root3.view(C0966R.C0970id.eeq).desc((C32226l<? super View, String>) new C39743b(this));
        root3.view(C0966R.C0970id.eew).desc((C32226l<? super View, String>) new C39744c(this));
    }
}
