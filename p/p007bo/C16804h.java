package p007bo;

import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C19636w0;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import p227rn.C22240c0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: bo.h */
public final class C16804h {

    /* renamed from: a */
    public static final C16804h f45407a = new C16804h();

    /* renamed from: b */
    public static boolean f45408b = false;

    /* renamed from: c */
    public static boolean f45409c = true;

    /* renamed from: d */
    public static long f45410d = -1;

    /* renamed from: e */
    public static boolean f45411e = true;

    /* renamed from: f */
    public static final C13601g f45412f = C36568h.m40985a(C16808c.f45417d);

    /* renamed from: g */
    public static final C13601g f45413g = C36568h.m40985a(C16809d.f45418d);

    /* renamed from: h */
    public static final C16806b f45414h = new C16806b();

    /* renamed from: bo.h$a */
    public static final class C16805a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f45415d;

        public C16805a(String str) {
            this.f45415d = str;
        }

        public final void run() {
            if (C16804h.f45408b) {
                C16804h.f45408b = false;
                C16804h.f45409c = true;
                Log.m105924i("MicroMsg.BizFlutterInstantsHelper", "killFlutterInstants from = " + this.f45415d);
                ((C22240c0) C86312j.m106911c(C22240c0.class)).Ca0();
                if (C16801f.f45399a.mo17845e()) {
                    C16813m mVar = C16813m.f45424a;
                    mVar.mo17857c().setIsKeepPosAsync(mVar.mo17858d(), false);
                }
            }
        }
    }

    /* renamed from: bo.h$b */
    public static final class C16806b extends C80401d {

        /* renamed from: bo.h$b$a */
        public static final class C16807a implements Runnable {

            /* renamed from: d */
            public static final C16807a f45416d = new C16807a();

            public final void run() {
                C16804h.f45407a.mo17847b("onEnterBackground");
            }
        }

        /* renamed from: a */
        public void mo17850a() {
            C119179t tVar = C119157j.f356862d;
            C16807a aVar = C16807a.f45416d;
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183889t(aVar, 3000, (String) null);
        }

        /* renamed from: b */
        public void mo17851b() {
        }
    }

    /* renamed from: bo.h$c */
    public static final class C16808c extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C16808c f45417d = new C16808c();

        public C16808c() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: bo.h$d */
    public static final class C16809d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C16809d f45418d = new C16809d();

        public C16809d() {
            super(0);
        }

        public Object invoke() {
            int decodeInt = ((MultiProcessMMKV) ((C36570n) C16804h.f45412f).getValue()).decodeInt("RecycleFlutterEnginOnBackground", -1);
            if (decodeInt == 0) {
                return Boolean.FALSE;
            }
            boolean z = true;
            if (decodeInt == 1) {
                return Boolean.TRUE;
            }
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32738b.clicfg_biz_rccycle_flutter_engin_on_background, 1) != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.BizFlutterInstantsHelper", "recycleFlutterEnginOnBackground " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: a */
    public final boolean mo17846a(String str) {
        C87412m.m108594g(str, "from");
        if (!f45408b || !mo17848c()) {
            return false;
        }
        mo17847b(str);
        return true;
    }

    /* renamed from: b */
    public final void mo17847b(String str) {
        C87412m.m108594g(str, "from");
        ((C119157j) C119157j.f356862d).mo183895z(new C16805a(str));
    }

    /* renamed from: c */
    public final boolean mo17848c() {
        if (f45410d < 0) {
            return false;
        }
        return System.currentTimeMillis() - f45410d > ((long) C19636w0.m21163e()) * 1000;
    }
}
