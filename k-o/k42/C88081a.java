package k42;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.tencent.p014mm.plugin.magicbrush.C85244b0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: k42.a */
public final class C88081a implements C85244b0 {

    /* renamed from: d */
    public final C85244b0 f254736d;

    /* renamed from: e */
    public final C32226l<String, C13598b0> f254737e;

    /* renamed from: f */
    public boolean f254738f = true;

    /* renamed from: k42.a$a */
    public static final class C88082a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254739d;

        /* renamed from: e */
        public final /* synthetic */ String f254740e;

        /* renamed from: f */
        public final /* synthetic */ String f254741f;

        /* renamed from: g */
        public final /* synthetic */ String f254742g;

        /* renamed from: h */
        public final /* synthetic */ int f254743h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88082a(C88081a aVar, String str, String str2, String str3, int i) {
            super(0);
            this.f254739d = aVar;
            this.f254740e = str;
            this.f254741f = str2;
            this.f254742g = str3;
            this.f254743h = i;
        }

        public Object invoke() {
            this.f254739d.f254736d.p00(this.f254740e, this.f254741f, this.f254742g, this.f254743h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.a$b */
    public static final class C88083b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254744d;

        /* renamed from: e */
        public final /* synthetic */ String f254745e;

        /* renamed from: f */
        public final /* synthetic */ String f254746f;

        /* renamed from: g */
        public final /* synthetic */ String f254747g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88083b(C88081a aVar, String str, String str2, String str3) {
            super(0);
            this.f254744d = aVar;
            this.f254745e = str;
            this.f254746f = str2;
            this.f254747g = str3;
        }

        public Object invoke() {
            String fr02 = this.f254744d.f254736d.fr0(this.f254745e, this.f254746f, this.f254747g);
            C87412m.m108593f(fr02, "client.invokeSync(instanceName, event, data)");
            return fr02;
        }
    }

    /* renamed from: k42.a$c */
    public static final class C88084c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254748d;

        /* renamed from: e */
        public final /* synthetic */ String f254749e;

        /* renamed from: f */
        public final /* synthetic */ int f254750f;

        /* renamed from: g */
        public final /* synthetic */ int f254751g;

        /* renamed from: h */
        public final /* synthetic */ int f254752h;

        /* renamed from: i */
        public final /* synthetic */ int f254753i;

        /* renamed from: j */
        public final /* synthetic */ int f254754j;

        /* renamed from: n */
        public final /* synthetic */ int f254755n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88084c(C88081a aVar, String str, int i, int i2, int i3, int i4, int i5, int i6) {
            super(0);
            this.f254748d = aVar;
            this.f254749e = str;
            this.f254750f = i;
            this.f254751g = i2;
            this.f254752h = i3;
            this.f254753i = i4;
            this.f254754j = i5;
            this.f254755n = i6;
        }

        public Object invoke() {
            this.f254748d.f254736d.q80(this.f254749e, this.f254750f, this.f254751g, this.f254752h, this.f254753i, this.f254754j, this.f254755n);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.a$d */
    public static final class C88085d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254756d;

        /* renamed from: e */
        public final /* synthetic */ String f254757e;

        /* renamed from: f */
        public final /* synthetic */ int f254758f;

        /* renamed from: g */
        public final /* synthetic */ boolean f254759g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88085d(C88081a aVar, String str, int i, boolean z) {
            super(0);
            this.f254756d = aVar;
            this.f254757e = str;
            this.f254758f = i;
            this.f254759g = z;
        }

        public Object invoke() {
            this.f254756d.f254736d.mo118385Ym(this.f254757e, this.f254758f, this.f254759g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.a$e */
    public static final class C88086e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254760d;

        /* renamed from: e */
        public final /* synthetic */ String f254761e;

        /* renamed from: f */
        public final /* synthetic */ int f254762f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88086e(C88081a aVar, String str, int i) {
            super(0);
            this.f254760d = aVar;
            this.f254761e = str;
            this.f254762f = i;
        }

        public Object invoke() {
            this.f254760d.f254736d.mo118387gq(this.f254761e, this.f254762f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.a$f */
    public static final class C88087f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254763d;

        /* renamed from: e */
        public final /* synthetic */ String f254764e;

        /* renamed from: f */
        public final /* synthetic */ int f254765f;

        /* renamed from: g */
        public final /* synthetic */ float[] f254766g;

        /* renamed from: h */
        public final /* synthetic */ float[] f254767h;

        /* renamed from: i */
        public final /* synthetic */ float[] f254768i;

        /* renamed from: j */
        public final /* synthetic */ float[] f254769j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88087f(C88081a aVar, String str, int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
            super(0);
            this.f254763d = aVar;
            this.f254764e = str;
            this.f254765f = i;
            this.f254766g = fArr;
            this.f254767h = fArr2;
            this.f254768i = fArr3;
            this.f254769j = fArr4;
        }

        public Object invoke() {
            this.f254763d.f254736d.x90(this.f254764e, this.f254765f, this.f254766g, this.f254767h, this.f254768i, this.f254769j);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.a$g */
    public static final class C88088g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254770d;

        /* renamed from: e */
        public final /* synthetic */ String f254771e;

        /* renamed from: f */
        public final /* synthetic */ int f254772f;

        /* renamed from: g */
        public final /* synthetic */ int f254773g;

        /* renamed from: h */
        public final /* synthetic */ int f254774h;

        /* renamed from: i */
        public final /* synthetic */ int f254775i;

        /* renamed from: j */
        public final /* synthetic */ int f254776j;

        /* renamed from: n */
        public final /* synthetic */ int f254777n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88088g(C88081a aVar, String str, int i, int i2, int i3, int i4, int i5, int i6) {
            super(0);
            this.f254770d = aVar;
            this.f254771e = str;
            this.f254772f = i;
            this.f254773g = i2;
            this.f254774h = i3;
            this.f254775i = i4;
            this.f254776j = i5;
            this.f254777n = i6;
        }

        public Object invoke() {
            this.f254770d.f254736d.mo118384WI(this.f254771e, this.f254772f, this.f254773g, this.f254774h, this.f254775i, this.f254776j, this.f254777n);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.a$h */
    public static final class C88089h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254778d;

        /* renamed from: e */
        public final /* synthetic */ String f254779e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88089h(C88081a aVar, String str) {
            super(0);
            this.f254778d = aVar;
            this.f254779e = str;
        }

        public Object invoke() {
            this.f254778d.f254736d.mo118382TY(this.f254779e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.a$i */
    public static final class C88090i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254780d;

        /* renamed from: e */
        public final /* synthetic */ String f254781e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88090i(C88081a aVar, String str) {
            super(0);
            this.f254780d = aVar;
            this.f254781e = str;
        }

        public Object invoke() {
            this.f254780d.f254736d.mo118381O3(this.f254781e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.a$j */
    public static final class C88091j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254782d;

        /* renamed from: e */
        public final /* synthetic */ String f254783e;

        /* renamed from: f */
        public final /* synthetic */ boolean f254784f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88091j(C88081a aVar, String str, boolean z) {
            super(0);
            this.f254782d = aVar;
            this.f254783e = str;
            this.f254784f = z;
        }

        public Object invoke() {
            this.f254782d.f254736d.mo118388hq(this.f254783e, this.f254784f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.a$k */
    public static final class C88092k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254785d;

        /* renamed from: e */
        public final /* synthetic */ String f254786e;

        /* renamed from: f */
        public final /* synthetic */ int f254787f;

        /* renamed from: g */
        public final /* synthetic */ String f254788g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88092k(C88081a aVar, String str, int i, String str2) {
            super(0);
            this.f254785d = aVar;
            this.f254786e = str;
            this.f254787f = i;
            this.f254788g = str2;
        }

        public Object invoke() {
            this.f254785d.f254736d.Tn0(this.f254786e, this.f254787f, this.f254788g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.a$l */
    public static final class C88093l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254789d;

        /* renamed from: e */
        public final /* synthetic */ String f254790e;

        /* renamed from: f */
        public final /* synthetic */ String f254791f;

        /* renamed from: g */
        public final /* synthetic */ String f254792g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88093l(C88081a aVar, String str, String str2, String str3) {
            super(0);
            this.f254789d = aVar;
            this.f254790e = str;
            this.f254791f = str2;
            this.f254792g = str3;
        }

        public Object invoke() {
            this.f254789d.f254736d.mo118380O(this.f254790e, this.f254791f, this.f254792g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.a$m */
    public static final class C88094m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254793d;

        /* renamed from: e */
        public final /* synthetic */ String f254794e;

        /* renamed from: f */
        public final /* synthetic */ String f254795f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88094m(C88081a aVar, String str, String str2) {
            super(0);
            this.f254793d = aVar;
            this.f254794e = str;
            this.f254795f = str2;
        }

        public Object invoke() {
            this.f254793d.f254736d.mo118379LL(this.f254794e, this.f254795f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.a$n */
    public static final class C88095n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88081a f254796d;

        /* renamed from: e */
        public final /* synthetic */ String f254797e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88095n(C88081a aVar, String str) {
            super(0);
            this.f254796d = aVar;
            this.f254797e = str;
        }

        public Object invoke() {
            this.f254796d.f254736d.mo118392yu(this.f254797e);
            return C13598b0.f38549a;
        }
    }

    public C88081a(C85244b0 b0Var, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(b0Var, "client");
        C87412m.m108594g(lVar, "errorCallback");
        this.f254736d = b0Var;
        this.f254737e = lVar;
    }

    /* renamed from: LL */
    public void mo118379LL(String str, String str2) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "logStr");
        mo122507a(new C88094m(this, str, str2));
    }

    /* renamed from: O */
    public void mo118380O(String str, String str2, String str3) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "envId");
        C87412m.m108594g(str3, "msg");
        mo122507a(new C88093l(this, str, str2, str3));
    }

    /* renamed from: O3 */
    public void mo118381O3(String str) {
        C87412m.m108594g(str, "instanceName");
        mo122507a(new C88090i(this, str));
    }

    /* renamed from: TY */
    public void mo118382TY(String str) {
        C87412m.m108594g(str, "instanceName");
        mo122507a(new C88089h(this, str));
    }

    public void Tn0(String str, int i, String str2) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "msg");
        mo122507a(new C88092k(this, str, i, str2));
    }

    /* renamed from: WI */
    public void mo118384WI(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        C87412m.m108594g(str, "instanceName");
        mo122507a(new C88088g(this, str, i, i2, i3, i4, i5, i6));
    }

    /* renamed from: Ym */
    public void mo118385Ym(String str, int i, boolean z) {
        C87412m.m108594g(str, "instanceName");
        mo122507a(new C88085d(this, str, i, z));
    }

    /* renamed from: a */
    public final void mo122507a(C32224a<C13598b0> aVar) {
        try {
            if (this.f254738f) {
                aVar.invoke();
            }
        } catch (RemoteException e) {
            this.f254738f = false;
            C32226l<String, C13598b0> lVar = this.f254737e;
            String stackTraceString = Log.getStackTraceString(e);
            C87412m.m108593f(stackTraceString, "getStackTraceString(e)");
            lVar.invoke(stackTraceString);
        }
    }

    public IBinder asBinder() {
        IBinder asBinder = this.f254736d.asBinder();
        C87412m.m108593f(asBinder, "client.asBinder()");
        return asBinder;
    }

    public String fr0(String str, String str2, String str3) {
        Object obj;
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "event");
        C87412m.m108594g(str3, "data");
        C88083b bVar = new C88083b(this, str, str2, str3);
        try {
            if (this.f254738f) {
                obj = bVar.invoke();
                return (String) obj;
            }
        } catch (RemoteException e) {
            this.f254738f = false;
            C32226l<String, C13598b0> lVar = this.f254737e;
            String stackTraceString = Log.getStackTraceString(e);
            C87412m.m108593f(stackTraceString, "getStackTraceString(e)");
            lVar.invoke(stackTraceString);
        }
        obj = "{\"errMsg\":\"Not handled\", \"errCode\": -1}";
        return (String) obj;
    }

    /* renamed from: gq */
    public void mo118387gq(String str, int i) {
        C87412m.m108594g(str, "instanceName");
        mo122507a(new C88086e(this, str, i));
    }

    /* renamed from: hq */
    public void mo118388hq(String str, boolean z) {
        C87412m.m108594g(str, "instanceName");
        mo122507a(new C88091j(this, str, z));
    }

    public void p00(String str, String str2, String str3, int i) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "event");
        C87412m.m108594g(str3, "data");
        mo122507a(new C88082a(this, str, str2, str3, i));
    }

    public void q80(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        C87412m.m108594g(str, "instanceName");
        mo122507a(new C88084c(this, str, i, i2, i3, i4, i5, i6));
    }

    public void x90(String str, int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(fArr, "left");
        C87412m.m108594g(fArr2, "top");
        C87412m.m108594g(fArr3, "width");
        C87412m.m108594g(fArr4, "height");
        mo122507a(new C88087f(this, str, i, fArr, fArr2, fArr3, fArr4));
    }

    /* renamed from: yu */
    public void mo118392yu(String str) {
        C87412m.m108594g(str, "instanceName");
        mo122507a(new C88095n(this, str));
    }
}
