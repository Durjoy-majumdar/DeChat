package je0;

import a14.C53934p0;
import android.content.Context;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cc0.C113267d;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import g62.C75875l;
import gy3.C87412m;
import gy3.C87413o;
import ie0.C46220j;
import ie0.C46225p;
import java.util.Locale;
import rx3.C13598b0;
import wb2.C65946a;
import wx3.C15601d;
import zt3.C119157j;

/* renamed from: je0.j0 */
public final class C46477j0 {

    /* renamed from: a */
    public static final C46477j0 f125215a = new C46477j0();

    /* renamed from: b */
    public static C92411b.C92412a f125216b;

    /* renamed from: je0.j0$a */
    public static final class C46478a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f125217d;

        /* renamed from: e */
        public final /* synthetic */ C46220j f125218e;

        /* renamed from: f */
        public final /* synthetic */ Context f125219f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46478a(C32226l<? super Boolean, C13598b0> lVar, C46220j jVar, Context context) {
            super(1);
            this.f125217d = lVar;
            this.f125218e = jVar;
            this.f125219f = context;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f125217d.invoke(Boolean.valueOf(booleanValue));
            Log.m105925i("MicroMsg.OpenIMKefuLocationReqController", "reportLocation success:%s", Boolean.valueOf(booleanValue));
            if (booleanValue) {
                C46477j0 j0Var = C46477j0.f125215a;
                C46220j jVar = this.f125218e;
                String str = jVar.field_username;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                String string = this.f125219f.getString(C0966R.string.m8l, new Object[]{jVar.field_nickname});
                C87412m.m108593f(string, "context.getString(\n     …ame\n                    )");
                C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
                C72963f4 f4Var = new C72963f4();
                f4Var.mo108733M2(C31543z5.m39451a());
                f4Var.mo108749c3(str);
                f4Var.mo108732L2(string);
                f4Var.setType(10000);
                ((C72972g4) LE).my0(f4Var);
                C46220j jVar2 = this.f125218e;
                jVar2.field_needReport = true;
                jVar2.field_hasSetReport = true;
                C46225p.m51525c(jVar2);
                C46220j jVar3 = this.f125218e;
                String str3 = jVar3.field_username;
                if (str3 != null) {
                    str2 = str3;
                }
                j0Var.mo71851b(str2, jVar3.mo71443U(), 2, C9291i0.f29053d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: je0.j0$b */
    public static final class C46479b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C46479b f125220d = new C46479b();

        public C46479b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: je0.j0$c */
    public static final class C46480c implements C92411b.C92412a {

        /* renamed from: d */
        public final /* synthetic */ String f125221d;

        /* renamed from: e */
        public final /* synthetic */ boolean f125222e;

        /* renamed from: f */
        public final /* synthetic */ int f125223f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f125224g;

        /* renamed from: je0.j0$c$a */
        public static final class C46481a implements Runnable {

            /* renamed from: d */
            public static final C46481a f125225d = new C46481a();

            public final void run() {
                C113267d.m155072k().mo126408b(C46477j0.f125216b);
            }
        }

        public C46480c(String str, boolean z, int i, C32226l<? super Boolean, C13598b0> lVar) {
            this.f125221d = str;
            this.f125222e = z;
            this.f125223f = i;
            this.f125224g = lVar;
        }

        public final boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            int i2 = i;
            ((C119157j) C119157j.f356862d).mo183895z(C46481a.f125225d);
            Log.m105925i("MicroMsg.OpenIMKefuLocationReqController", "LocationGet isOk = %s, talkUsername = %s, useWgs84 = %s, fromScene = %s", Boolean.valueOf(z), this.f125221d, Boolean.valueOf(this.f125222e), Integer.valueOf(this.f125223f));
            if (!z) {
                return false;
            }
            String str = "WGS84";
            if (i2 != 0 && i2 == 1) {
                str = "GCJ02";
            }
            String str2 = str;
            double d4 = (double) f;
            double d5 = (double) f2;
            String str3 = this.f125221d;
            int i3 = this.f125223f;
            C32226l<Boolean, C13598b0> lVar = this.f125224g;
            C87412m.m108594g(str3, "kfUsername");
            C87412m.m108594g(lVar, "successCallback");
            LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
            if (lifecycleScope != null) {
                LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C46485l0(str3, str2, d4, d5, d2, i3, lVar, (C15601d<? super C46485l0>) null), 1, (Object) null);
            }
            return false;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m51766c(C46477j0 j0Var, String str, String str2, int i, C32226l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "wgs84";
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            lVar = C46479b.f125220d;
        }
        j0Var.mo71851b(str, str2, i, lVar);
    }

    /* renamed from: a */
    public final void mo71850a(Context context, C46220j jVar, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(jVar, "contact");
        C87412m.m108594g(lVar, "callback");
        Log.m105924i("MicroMsg.OpenIMKefuLocationReqController", "ACCESS_FINE_LOCATION onPermissionGranted");
        String str = jVar.field_username;
        if (str == null) {
            str = "";
        }
        C46478a aVar = new C46478a(lVar, jVar, context);
        C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C65946a.class);
        C87412m.m108593f(a, "UICProvider.of(context).…ycleScopeUIC::class.java)");
        C65946a aVar2 = (C65946a) a;
        LifecycleScope.launchDefault$default(aVar2.mo89983c3(), (C53934p0) null, new C46488m0(aVar2, str, true, aVar, (C15601d<? super C46488m0>) null), 1, (Object) null);
    }

    /* renamed from: b */
    public final void mo71851b(String str, String str2, int i, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(str, "talkUsername");
        C87412m.m108594g(str2, "locationType");
        C87412m.m108594g(lVar, "successCallback");
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        boolean b = C87412m.m108589b(lowerCase, "wgs84");
        if (f125216b == null) {
            f125216b = new C46480c(str, b, i, lVar);
        }
        if (b) {
            C113267d.m155072k().mo126409c(f125216b, false, true);
        } else {
            C113267d.m155072k().mo126412f(f125216b, false);
        }
    }
}
