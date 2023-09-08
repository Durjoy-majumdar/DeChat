package qe1;

import com.tencent.p014mm.plugin.finder.config.base.FinderDynConfigMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C86484b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.lang.ref.WeakReference;
import lc3.C10485b;
import p645pj.C77093f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rx3.C90107a;

/* renamed from: qe1.d */
public final class C35842d<T> extends C35839a<T> {

    /* renamed from: e */
    public final String f95668e;

    /* renamed from: f */
    public final C13601g f95669f = C36568h.m40985a(C35843a.f95671d);

    /* renamed from: g */
    public boolean f95670g;

    /* renamed from: qe1.d$a */
    public static final class C35843a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C35843a f95671d = new C35843a();

        public C35843a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_config_get_expt_every_time, 0));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35842d(T t, String str, C32224a<C13598b0> aVar) {
        super(t, "SVR", aVar);
        C87412m.m108594g(str, "expname");
        C87412m.m108594g(aVar, "onConfigChanged");
        this.f95668e = str;
        try {
            mo60441b();
            this.f95670g = true;
        } catch (C86484b e) {
            Log.m105924i("ConfigItem", "[updateValueFromSvr2] catch AccountNotReadyException, " + C90107a.m112736b(e));
            this.f95670g = false;
        }
        FinderDynConfigMonitor finderDynConfigMonitor = FinderDynConfigMonitor.f81089d;
        String str2 = this.f95668e;
        finderDynConfigMonitor.getClass();
        C87412m.m108594g(str2, "key");
        if (!FinderDynConfigMonitor.f81090e.containsKey(str2)) {
            FinderDynConfigMonitor.f81090e.put(str2, new WeakReference(this));
        }
    }

    /* renamed from: b */
    public void mo60441b() {
        Class cls = C10485b.class;
        if (C86709a0.m107533q(cls) == null || ((C10485b) C86709a0.m107533q(cls)).vh0() == null) {
            this.f95667d = this.f95664a;
            Log.m105924i("ConfigItem", "[updateValueFromSvr2] keyName:" + this.f95668e + ", has update to " + this.f95667d);
        } else {
            T t = this.f95664a;
            if (t instanceof Integer) {
                C77093f vh02 = ((C10485b) C86709a0.m107533q(cls)).vh0();
                String str = this.f95668e;
                T t2 = this.f95664a;
                C87412m.m108592e(t2, "null cannot be cast to non-null type kotlin.Int");
                t = Integer.valueOf(vh02.mo107404b(str, ((Integer) t2).intValue()));
            } else if (t instanceof Long) {
                C77093f vh03 = ((C10485b) C86709a0.m107533q(cls)).vh0();
                String str2 = this.f95668e;
                T t3 = this.f95664a;
                C87412m.m108592e(t3, "null cannot be cast to non-null type kotlin.Int");
                t = (Long) Integer.valueOf(vh03.mo107404b(str2, ((Integer) t3).intValue()));
            } else if (t instanceof String) {
                String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c(this.f95668e);
                T t4 = this.f95664a;
                C87412m.m108592e(t4, "null cannot be cast to non-null type kotlin.String");
                t = Util.nullAs(c, (String) t4);
            }
            this.f95667d = t;
        }
        Log.m105924i("ConfigItem", "[updateValueFromSvr] keyName:" + this.f95668e + ", has update to " + this.f95667d);
    }

    /* renamed from: c */
    public T mo60442c() {
        if (((Number) ((C36570n) this.f95669f).getValue()).intValue() == 1 || !this.f95670g) {
            mo60441b();
            this.f95670g = true;
        }
        T t = this.f95667d;
        return t == null ? this.f95664a : t;
    }
}
