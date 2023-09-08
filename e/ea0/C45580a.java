package ea0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import da0.C58246d;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C101218e0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ea0.a */
public final class C45580a implements C58246d {

    /* renamed from: a */
    public static final C45580a f123293a = new C45580a();

    /* renamed from: b */
    public static final C13601g f123294b = C36568h.m40985a(C31442a.f84151d);

    /* renamed from: ea0.a$a */
    public static final class C31442a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C31442a f84151d = new C31442a();

        public C31442a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("maas_permission_checker");
        }
    }

    /* renamed from: ea0.a$b */
    public static final class C45581b implements C101218e0.C77394n {

        /* renamed from: a */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f123295a;

        public C45581b(C32226l<? super Boolean, C13598b0> lVar) {
            this.f123295a = lVar;
        }

        public final void dismiss() {
            Log.m105924i("MaasPermissionCheckHelp", "requestPermission cancel");
            this.f123295a.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: ea0.a$c */
    public static final class C45582c implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f123296a;

        /* renamed from: b */
        public final /* synthetic */ C101218e0 f123297b;

        /* renamed from: ea0.a$c$a */
        public static final class C45583a implements C101218e0.C77394n {

            /* renamed from: a */
            public static final C45583a f123298a = new C45583a();

            public final void dismiss() {
            }
        }

        public C45582c(C32226l<? super Boolean, C13598b0> lVar, C101218e0 e0Var) {
            this.f123296a = lVar;
            this.f123297b = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            Log.m105924i("MaasPermissionCheckHelp", "requestPermission deny");
            this.f123296a.invoke(Boolean.FALSE);
            this.f123297b.mo140665l(C45583a.f123298a);
            this.f123297b.mo140680z();
        }
    }

    /* renamed from: ea0.a$d */
    public static final class C45584d implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ String f123299a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f123300b;

        /* renamed from: c */
        public final /* synthetic */ C101218e0 f123301c;

        /* renamed from: ea0.a$d$a */
        public static final class C45585a implements C101218e0.C77394n {

            /* renamed from: a */
            public static final C45585a f123302a = new C45585a();

            public final void dismiss() {
            }
        }

        public C45584d(String str, C32226l<? super Boolean, C13598b0> lVar, C101218e0 e0Var) {
            this.f123299a = str;
            this.f123300b = lVar;
            this.f123301c = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            Log.m105924i("MaasPermissionCheckHelp", "requestPermission ok");
            MultiProcessMMKV d = C45580a.f123293a.mo71106d();
            d.putBoolean(this.f123299a + "_enabled", true);
            this.f123300b.invoke(Boolean.TRUE);
            this.f123301c.mo140665l(C45585a.f123302a);
            this.f123301c.mo140680z();
        }
    }

    /* renamed from: a */
    public boolean mo71103a(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        MultiProcessMMKV d = mo71106d();
        boolean z = d.getBoolean(str + "_enabled", false);
        Log.m105924i("MaasPermissionCheckHelp", "checkPermission for " + str + ", hasPermission: " + z);
        return z;
    }

    /* renamed from: b */
    public void mo71104b(String str, Context context, C32226l<? super Boolean, C13598b0> lVar, C32226l<? super Boolean, C13598b0> lVar2) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(lVar, "resultOk");
        C87412m.m108594g(lVar2, "resultFail");
        mo71107e(str, context, false, lVar, lVar2);
    }

    /* renamed from: c */
    public boolean mo71105c(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        MultiProcessMMKV d = mo71106d();
        boolean z = d.getBoolean(str + "_requested", false);
        Log.m105924i("MaasPermissionCheckHelp", "hasRequested for " + str + ", hasRequestes: " + z);
        return z;
    }

    /* renamed from: d */
    public final MultiProcessMMKV mo71106d() {
        return (MultiProcessMMKV) ((C36570n) f123294b).getValue();
    }

    /* renamed from: e */
    public final void mo71107e(String str, Context context, boolean z, C32226l<? super Boolean, C13598b0> lVar, C32226l<? super Boolean, C13598b0> lVar2) {
        View view;
        MultiProcessMMKV d = mo71106d();
        if (d.getBoolean(str + "_enabled", false)) {
            Log.m105924i("MaasPermissionCheckHelp", "requestPermission has permission, no need to request for " + str);
            lVar.invoke(Boolean.FALSE);
            return;
        }
        Log.m105924i("MaasPermissionCheckHelp", "requestPermission for " + str);
        MultiProcessMMKV d2 = mo71106d();
        d2.putBoolean(str + "_requested", true);
        C101218e0 e0Var = new C101218e0(context, 1, 0, true);
        e0Var.mo140667n(context.getText(C0966R.string.m2_), context.getText(C0966R.string.m28));
        e0Var.mo140662i(C0966R.C0971layout.cnj);
        if (z && (view = e0Var.f296384g) != null) {
            ((TextView) view.findViewById(C0966R.C0970id.miv)).setText(C0966R.string.f361128m91);
            ((TextView) view.findViewById(C0966R.C0970id.miu)).setText(C0966R.string.f361127m90);
        }
        e0Var.mo140665l(new C45581b(lVar2));
        C45582c cVar = new C45582c(lVar2, e0Var);
        C45584d dVar = new C45584d(str, lVar, e0Var);
        e0Var.f296373D = cVar;
        e0Var.f296374E = dVar;
        e0Var.mo140655A();
    }
}
