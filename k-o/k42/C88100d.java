package k42;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import com.tencent.p014mm.plugin.magicbrush.C85244b0;
import com.tencent.p014mm.plugin.magicbrush.C85270j0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: k42.d */
public final class C88100d implements C85270j0 {

    /* renamed from: d */
    public final C85270j0 f254809d;

    /* renamed from: e */
    public final C32226l<String, C13598b0> f254810e;

    /* renamed from: k42.d$a */
    public static final class C88101a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254811d;

        /* renamed from: e */
        public final /* synthetic */ String f254812e;

        /* renamed from: f */
        public final /* synthetic */ String f254813f;

        /* renamed from: g */
        public final /* synthetic */ int f254814g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88101a(C88100d dVar, String str, String str2, int i) {
            super(0);
            this.f254811d = dVar;
            this.f254812e = str;
            this.f254813f = str2;
            this.f254814g = i;
        }

        public Object invoke() {
            this.f254811d.f254809d.Y30(this.f254812e, this.f254813f, this.f254814g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$b */
    public static final class C88102b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254815d;

        /* renamed from: e */
        public final /* synthetic */ String f254816e;

        /* renamed from: f */
        public final /* synthetic */ int f254817f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88102b(C88100d dVar, String str, int i) {
            super(0);
            this.f254815d = dVar;
            this.f254816e = str;
            this.f254817f = i;
        }

        public Object invoke() {
            this.f254815d.f254809d.mo118440fH(this.f254816e, this.f254817f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$c */
    public static final class C88103c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254818d;

        /* renamed from: e */
        public final /* synthetic */ String f254819e;

        /* renamed from: f */
        public final /* synthetic */ int f254820f;

        /* renamed from: g */
        public final /* synthetic */ String f254821g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88103c(C88100d dVar, String str, int i, String str2) {
            super(0);
            this.f254818d = dVar;
            this.f254819e = str;
            this.f254820f = i;
            this.f254821g = str2;
        }

        public Object invoke() {
            this.f254818d.f254809d.t20(this.f254819e, this.f254820f, this.f254821g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$d */
    public static final class C88104d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254822d;

        /* renamed from: e */
        public final /* synthetic */ String f254823e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88104d(C88100d dVar, String str) {
            super(0);
            this.f254822d = dVar;
            this.f254823e = str;
        }

        public Object invoke() {
            this.f254822d.f254809d.mo118438dF(this.f254823e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$e */
    public static final class C88105e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254824d;

        /* renamed from: e */
        public final /* synthetic */ String f254825e;

        /* renamed from: f */
        public final /* synthetic */ int f254826f;

        /* renamed from: g */
        public final /* synthetic */ int f254827g;

        /* renamed from: h */
        public final /* synthetic */ int f254828h;

        /* renamed from: i */
        public final /* synthetic */ long f254829i;

        /* renamed from: j */
        public final /* synthetic */ int[] f254830j;

        /* renamed from: n */
        public final /* synthetic */ float[] f254831n;

        /* renamed from: o */
        public final /* synthetic */ float[] f254832o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88105e(C88100d dVar, String str, int i, int i2, int i3, long j, int[] iArr, float[] fArr, float[] fArr2) {
            super(0);
            this.f254824d = dVar;
            this.f254825e = str;
            this.f254826f = i;
            this.f254827g = i2;
            this.f254828h = i3;
            this.f254829i = j;
            this.f254830j = iArr;
            this.f254831n = fArr;
            this.f254832o = fArr2;
        }

        public Object invoke() {
            this.f254824d.f254809d.mo118435TE(this.f254825e, this.f254826f, this.f254827g, this.f254828h, this.f254829i, this.f254830j, this.f254831n, this.f254832o);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$f */
    public static final class C88106f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254833d;

        /* renamed from: e */
        public final /* synthetic */ String f254834e;

        /* renamed from: f */
        public final /* synthetic */ MBBuildConfig<?> f254835f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88106f(C88100d dVar, String str, MBBuildConfig<?> mBBuildConfig) {
            super(0);
            this.f254833d = dVar;
            this.f254834e = str;
            this.f254835f = mBBuildConfig;
        }

        public Object invoke() {
            this.f254833d.f254809d.mo118433Ed(this.f254834e, this.f254835f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$g */
    public static final class C88107g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254836d;

        /* renamed from: e */
        public final /* synthetic */ String f254837e;

        /* renamed from: f */
        public final /* synthetic */ String f254838f;

        /* renamed from: g */
        public final /* synthetic */ String f254839g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88107g(C88100d dVar, String str, String str2, String str3) {
            super(0);
            this.f254836d = dVar;
            this.f254837e = str;
            this.f254838f = str2;
            this.f254839g = str3;
        }

        public Object invoke() {
            this.f254836d.f254809d.mo118444rn(this.f254837e, this.f254838f, this.f254839g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$h */
    public static final class C88108h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254840d;

        /* renamed from: e */
        public final /* synthetic */ String f254841e;

        /* renamed from: f */
        public final /* synthetic */ int f254842f;

        /* renamed from: g */
        public final /* synthetic */ Surface f254843g;

        /* renamed from: h */
        public final /* synthetic */ int f254844h;

        /* renamed from: i */
        public final /* synthetic */ int f254845i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88108h(C88100d dVar, String str, int i, Surface surface, int i2, int i3) {
            super(0);
            this.f254840d = dVar;
            this.f254841e = str;
            this.f254842f = i;
            this.f254843g = surface;
            this.f254844h = i2;
            this.f254845i = i3;
        }

        public Object invoke() {
            this.f254840d.f254809d.mo118442hU(this.f254841e, this.f254842f, this.f254843g, this.f254844h, this.f254845i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$i */
    public static final class C88109i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254846d;

        /* renamed from: e */
        public final /* synthetic */ String f254847e;

        /* renamed from: f */
        public final /* synthetic */ int f254848f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88109i(C88100d dVar, String str, int i) {
            super(0);
            this.f254846d = dVar;
            this.f254847e = str;
            this.f254848f = i;
        }

        public Object invoke() {
            this.f254846d.f254809d.mo118432DN(this.f254847e, this.f254848f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$j */
    public static final class C88110j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254849d;

        /* renamed from: e */
        public final /* synthetic */ String f254850e;

        /* renamed from: f */
        public final /* synthetic */ int f254851f;

        /* renamed from: g */
        public final /* synthetic */ int f254852g;

        /* renamed from: h */
        public final /* synthetic */ int f254853h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88110j(C88100d dVar, String str, int i, int i2, int i3) {
            super(0);
            this.f254849d = dVar;
            this.f254850e = str;
            this.f254851f = i;
            this.f254852g = i2;
            this.f254853h = i3;
        }

        public Object invoke() {
            this.f254849d.f254809d.g50(this.f254850e, this.f254851f, this.f254852g, this.f254853h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$k */
    public static final class C88111k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254854d;

        /* renamed from: e */
        public final /* synthetic */ String f254855e;

        /* renamed from: f */
        public final /* synthetic */ C85244b0 f254856f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88111k(C88100d dVar, String str, C85244b0 b0Var) {
            super(0);
            this.f254854d = dVar;
            this.f254855e = str;
            this.f254856f = b0Var;
        }

        public Object invoke() {
            this.f254854d.f254809d.mo118443kG(this.f254855e, this.f254856f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$l */
    public static final class C88112l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254857d;

        /* renamed from: e */
        public final /* synthetic */ String f254858e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88112l(C88100d dVar, String str) {
            super(0);
            this.f254857d = dVar;
            this.f254858e = str;
        }

        public Object invoke() {
            this.f254857d.f254809d.Il0(this.f254858e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$m */
    public static final class C88113m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254859d;

        /* renamed from: e */
        public final /* synthetic */ String f254860e;

        /* renamed from: f */
        public final /* synthetic */ boolean f254861f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88113m(C88100d dVar, String str, boolean z) {
            super(0);
            this.f254859d = dVar;
            this.f254860e = str;
            this.f254861f = z;
        }

        public Object invoke() {
            this.f254859d.f254809d.V20(this.f254860e, this.f254861f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k42.d$n */
    public static final class C88114n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88100d f254862d;

        /* renamed from: e */
        public final /* synthetic */ String f254863e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88114n(C88100d dVar, String str) {
            super(0);
            this.f254862d = dVar;
            this.f254863e = str;
        }

        public Object invoke() {
            this.f254862d.f254809d.mo118439eV(this.f254863e);
            return C13598b0.f38549a;
        }
    }

    public C88100d(C85270j0 j0Var, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(j0Var, "service");
        C87412m.m108594g(lVar, "errorCallback");
        this.f254809d = j0Var;
        this.f254810e = lVar;
    }

    /* renamed from: DN */
    public void mo118432DN(String str, int i) {
        C87412m.m108594g(str, "instanceName");
        mo122511a(new C88109i(this, str, i));
    }

    /* renamed from: Ed */
    public void mo118433Ed(String str, MBBuildConfig<?> mBBuildConfig) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(mBBuildConfig, "config");
        mo122511a(new C88106f(this, str, mBBuildConfig));
    }

    public void Il0(String str) {
        C87412m.m108594g(str, "instanceName");
        mo122511a(new C88112l(this, str));
    }

    /* renamed from: TE */
    public void mo118435TE(String str, int i, int i2, int i3, long j, int[] iArr, float[] fArr, float[] fArr2) {
        C87412m.m108594g(str, "instanceName");
        int[] iArr2 = iArr;
        C87412m.m108594g(iArr2, "pointerIds");
        float[] fArr3 = fArr;
        C87412m.m108594g(fArr3, "x");
        float[] fArr4 = fArr2;
        C87412m.m108594g(fArr4, "y");
        mo122511a(new C88105e(this, str, i, i2, i3, j, iArr2, fArr3, fArr4));
    }

    public void V20(String str, boolean z) {
        C87412m.m108594g(str, "instanceName");
        mo122511a(new C88113m(this, str, z));
    }

    public void Y30(String str, String str2, int i) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "script");
        mo122511a(new C88101a(this, str, str2, i));
    }

    /* renamed from: a */
    public final void mo122511a(C32224a<C13598b0> aVar) {
        try {
            aVar.invoke();
        } catch (RemoteException e) {
            C32226l<String, C13598b0> lVar = this.f254810e;
            String stackTraceString = Log.getStackTraceString(e);
            C87412m.m108593f(stackTraceString, "getStackTraceString(e)");
            lVar.invoke(stackTraceString);
        }
    }

    public IBinder asBinder() {
        IBinder asBinder = this.f254809d.asBinder();
        C87412m.m108593f(asBinder, "service.asBinder()");
        return asBinder;
    }

    /* renamed from: dF */
    public void mo118438dF(String str) {
        C87412m.m108594g(str, "instanceName");
        mo122511a(new C88104d(this, str));
    }

    /* renamed from: eV */
    public void mo118439eV(String str) {
        C87412m.m108594g(str, "instanceName");
        mo122511a(new C88114n(this, str));
    }

    /* renamed from: fH */
    public void mo118440fH(String str, int i) {
        C87412m.m108594g(str, "instanceName");
        mo122511a(new C88102b(this, str, i));
    }

    public void g50(String str, int i, int i2, int i3) {
        C87412m.m108594g(str, "instanceName");
        mo122511a(new C88110j(this, str, i, i2, i3));
    }

    /* renamed from: hU */
    public void mo118442hU(String str, int i, Surface surface, int i2, int i3) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(surface, "surface");
        mo122511a(new C88108h(this, str, i, surface, i2, i3));
    }

    /* renamed from: kG */
    public void mo118443kG(String str, C85244b0 b0Var) {
        C87412m.m108594g(str, "process");
        C87412m.m108594g(b0Var, "mgr");
        mo122511a(new C88111k(this, str, b0Var));
    }

    /* renamed from: rn */
    public void mo118444rn(String str, String str2, String str3) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "event");
        C87412m.m108594g(str3, "data");
        mo122511a(new C88107g(this, str, str2, str3));
    }

    public void t20(String str, int i, String str2) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "result");
        mo122511a(new C88103c(this, str, i, str2));
    }
}
