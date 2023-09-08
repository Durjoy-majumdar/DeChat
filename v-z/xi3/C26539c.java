package xi3;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kw0.C46746a;

/* renamed from: xi3.c */
public final class C26539c extends MMBaseAccessibilityConfig {

    /* renamed from: xi3.c$a */
    public static final class C26540a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C26540a f73872d = new C26540a();

        public C26540a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return C46746a.f125826a.mo71970c(view);
        }
    }

    /* renamed from: xi3.c$b */
    public static final class C26541b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C26541b f73873d = new C26541b();

        public C26541b() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return C46746a.f125826a.mo71970c(view);
        }
    }

    /* renamed from: xi3.c$c */
    public static final class C26542c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C26542c f73874d = new C26542c();

        public C26542c() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return C46746a.f125826a.mo71970c(view);
        }
    }

    /* renamed from: xi3.c$d */
    public static final class C26543d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C26543d f73875d = new C26543d();

        public C26543d() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return C46746a.f125826a.mo71970c(view);
        }
    }

    /* renamed from: xi3.c$e */
    public static final class C26544e extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C26544e f73876d = new C26544e();

        public C26544e() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return C46746a.f125826a.mo71970c(view);
        }
    }

    /* renamed from: xi3.c$f */
    public static final class C26545f extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C26545f f73877d = new C26545f();

        public C26545f() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return C46746a.f125826a.mo71970c(view);
        }
    }

    /* renamed from: xi3.c$g */
    public static final class C26546g extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C26546g f73878d = new C26546g();

        public C26546g() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return C46746a.f125826a.mo71970c(view);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26539c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.f6866qo).view(C0966R.C0970id.kqy).desc((C32226l<? super View, String>) C26540a.f73872d).disableChildren();
        root(C0966R.C0971layout.f6864qm).view(C0966R.C0970id.c8x).desc((C32226l<? super View, String>) C26541b.f73873d).disableChildren();
        root(C0966R.C0971layout.f6865qn).view(C0966R.C0970id.c8w).desc((C32226l<? super View, String>) C26542c.f73874d).disableChildren();
        root(C0966R.C0971layout.f6869qr).view(C0966R.C0970id.kil).desc((C32226l<? super View, String>) C26543d.f73875d).disableChildren();
        root(C0966R.C0971layout.f6870qs).view(C0966R.C0970id.b9b).desc((C32226l<? super View, String>) C26544e.f73876d).disableChildren();
        root(C0966R.C0971layout.f6871qt).view(C0966R.C0970id.b5x).desc((C32226l<? super View, String>) C26545f.f73877d).disableChildren();
        root(C0966R.C0971layout.f6868qq).view(C0966R.C0970id.b5r).desc((C32226l<? super View, String>) C26546g.f73878d).disableChildren();
    }
}
