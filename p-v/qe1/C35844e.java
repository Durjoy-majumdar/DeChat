package qe1;

import com.tencent.p014mm.plugin.finder.config.base.FinderSvrConfigMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.lang.ref.WeakReference;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: qe1.e */
public final class C35844e<T> extends C35839a<T> {

    /* renamed from: e */
    public final C32735h.C32736a f95672e;

    /* renamed from: f */
    public final C13601g f95673f = C36568h.m40985a(C35845a.f95674d);

    /* renamed from: qe1.e$a */
    public static final class C35845a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C35845a f95674d = new C35845a();

        public C35845a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_config_get_expt_every_time, 0));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35844e(T t, C32735h.C32736a aVar, C32224a<C13598b0> aVar2) {
        super(t, "SVR", aVar2);
        C87412m.m108594g(aVar, "expname");
        C87412m.m108594g(aVar2, "onConfigChanged");
        this.f95672e = aVar;
        mo60441b();
        FinderSvrConfigMonitor finderSvrConfigMonitor = FinderSvrConfigMonitor.f81091d;
        String name = aVar.name();
        C87412m.m108593f(name, "expname.name()");
        finderSvrConfigMonitor.getClass();
        if (!FinderSvrConfigMonitor.f81092e.containsKey(name)) {
            FinderSvrConfigMonitor.f81092e.put(name, new WeakReference(this));
        }
    }

    /* renamed from: b */
    public void mo60441b() {
        Class cls = C32735h.class;
        T t = this.f95664a;
        if (t instanceof Integer) {
            C32735h.C32736a aVar = this.f95672e;
            T t2 = this.f95664a;
            C87412m.m108592e(t2, "null cannot be cast to non-null type kotlin.Int");
            t = Integer.valueOf(((C32735h) C86312j.m106911c(cls)).mo58779Qe(aVar, ((Integer) t2).intValue()));
        } else if (t instanceof Long) {
            C32735h.C32736a aVar2 = this.f95672e;
            T t3 = this.f95664a;
            C87412m.m108592e(t3, "null cannot be cast to non-null type kotlin.Long");
            t = Long.valueOf(((C32735h) C86312j.m106911c(cls)).mo58777He(aVar2, ((Long) t3).longValue()));
        } else if (t instanceof Boolean) {
            C32735h.C32736a aVar3 = this.f95672e;
            T t4 = this.f95664a;
            C87412m.m108592e(t4, "null cannot be cast to non-null type kotlin.Boolean");
            t = Boolean.valueOf(((C32735h) C86312j.m106911c(cls)).mo58784wf(aVar3, ((Boolean) t4).booleanValue()));
        } else if (t instanceof String) {
            C32735h.C32736a aVar4 = this.f95672e;
            T t5 = this.f95664a;
            C87412m.m108592e(t5, "null cannot be cast to non-null type kotlin.String");
            t = ((C32735h) C86312j.m106911c(cls)).Y60(aVar4, (String) t5);
        } else if (t instanceof Float) {
            C32735h.C32736a aVar5 = this.f95672e;
            T t6 = this.f95664a;
            C87412m.m108592e(t6, "null cannot be cast to non-null type kotlin.Float");
            t = Float.valueOf(((C32735h) C86312j.m106911c(cls)).mo58785xe(aVar5, ((Float) t6).floatValue()));
        }
        this.f95667d = t;
        Log.m105924i("ConfigItem", "[updateValueFromSvr] keyName:" + this.f95672e.name() + ", has update to " + this.f95667d);
    }

    /* renamed from: c */
    public T mo60442c() {
        if (((Number) this.f95673f.getValue()).intValue() == 1) {
            mo60441b();
        }
        T t = this.f95667d;
        return t == null ? this.f95664a : t;
    }
}
