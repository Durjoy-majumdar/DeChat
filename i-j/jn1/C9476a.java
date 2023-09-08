package jn1;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import it1.C9256k;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import o40.C61926c;
import qt1.C12932c;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: jn1.a */
public abstract class C9476a<T> {

    /* renamed from: d */
    public String f29555d = ("Finder.Nearby.Preload." + getClass().getSimpleName() + "_@" + hashCode());

    /* renamed from: e */
    public int f29556e;

    /* renamed from: f */
    public int f29557f;

    /* renamed from: g */
    public C9256k<T> f29558g;

    /* renamed from: h */
    public final ReentrantLock f29559h;

    /* renamed from: i */
    public final Condition f29560i;

    /* renamed from: j */
    public final C12932c f29561j;

    /* renamed from: n */
    public volatile C9477a f29562n;

    /* renamed from: jn1.a$a */
    public enum C9477a {
        IDLE,
        LOADING,
        EXPIRED,
        FAILED,
        OK
    }

    /* renamed from: jn1.a$b */
    public static final class C9478b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C9256k<T>, C13598b0> f29569d;

        /* renamed from: e */
        public final /* synthetic */ C9476a<T> f29570e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9478b(C32226l<? super C9256k<T>, C13598b0> lVar, C9476a<T> aVar) {
            super(0);
            this.f29569d = lVar;
            this.f29570e = aVar;
        }

        public Object invoke() {
            this.f29569d.invoke(this.f29570e.mo10164e());
            return C13598b0.f38549a;
        }
    }

    public C9476a() {
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        this.f29556e = C37521f.f99278S.mo60266n().intValue();
        fVar.getClass();
        this.f29557f = C37521f.f99269R.mo60266n().intValue();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f29559h = reentrantLock;
        this.f29560i = reentrantLock.newCondition();
        this.f29561j = new C12932c(this.f29555d);
        this.f29562n = C9477a.IDLE;
        String str = this.f29555d;
        Log.m105924i(str, "init WAITING_PRELOAD_TIMEOUT_MS:" + this.f29556e + " PRELOAD_RESPONSE_EXPIRED_MS:" + this.f29557f + ' ');
    }

    /* renamed from: b */
    public abstract void mo10161b();

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo10162c(C9256k<T> kVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f29561j.mo12482c("handleFetchDoneInternal begin");
        this.f29559h.lock();
        try {
            aVar.invoke();
            if (kVar != null && kVar.f29000a == 0 && kVar.f29001b == 0) {
                mo10166g(C9477a.OK);
            } else {
                mo10166g(C9477a.FAILED);
            }
            this.f29560i.signalAll();
            this.f29559h.unlock();
            this.f29561j.mo11310b("handleFetchDoneInternal end");
        } catch (Throwable th) {
            this.f29559h.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public final boolean mo10163d(C9256k<T> kVar) {
        C87412m.m108594g(kVar, "response");
        long elapsedRealtime = SystemClock.elapsedRealtime() - kVar.f29004e;
        if (elapsedRealtime <= ((long) this.f29557f)) {
            return false;
        }
        String str = this.f29555d;
        Log.m105924i(str, "isExpiredResponse expiredMs:" + elapsedRealtime);
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public C9256k<T> mo10164e() {
        String str = this.f29555d;
        Log.m105924i(str, "requestCache state:" + this.f29562n);
        this.f29559h.lock();
        this.f29561j.mo12482c("requestCache");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (this.f29562n == C9477a.LOADING) {
                Log.m105924i(this.f29555d, "requestCache waiting.");
                this.f29560i.await((long) this.f29556e, TimeUnit.MILLISECONDS);
            }
            this.f29559h.unlock();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (this.f29558g == null) {
                String str2 = this.f29555d;
                Log.m105924i(str2, "requestCache hit null, state:" + this.f29562n + " time:" + elapsedRealtime2);
            } else {
                String str3 = this.f29555d;
                Log.m105924i(str3, "requestCache hit cache state:" + this.f29562n + " response:" + this.f29558g + " time:" + elapsedRealtime2);
                C9256k<T> kVar = this.f29558g;
                C87412m.m108591d(kVar);
                if (mo10163d(kVar)) {
                    mo10166g(C9477a.EXPIRED);
                    return null;
                }
            }
            return this.f29558g;
        } catch (Throwable th) {
            this.f29559h.unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public final void mo10165f(C32226l<? super C9256k<T>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        String str = this.f29555d;
        Log.m105924i(str, "requestCacheAsync state:" + this.f29562n);
        C61926c.m72656A((String) null, new C9478b(lVar, this));
    }

    /* renamed from: g */
    public final void mo10166g(C9477a aVar) {
        String str = this.f29555d;
        Log.m105924i(str, "setLoadingState from " + this.f29562n + " to " + aVar);
        this.f29562n = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public void mo10167h() {
        if (this.f29562n != C9477a.IDLE) {
            String str = this.f29555d;
            Log.m105924i(str, "startPreload return for state:" + this.f29562n);
            return;
        }
        Log.m105924i(this.f29555d, "startPreload");
        this.f29561j.mo12481a("startPreload begin");
        this.f29559h.lock();
        try {
            mo10166g(C9477a.LOADING);
            mo10161b();
            this.f29559h.unlock();
            this.f29561j.mo12482c("startPreload end");
        } catch (Throwable th) {
            this.f29559h.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public void mo10168i() {
        String str = this.f29555d;
        Log.m105924i(str, "stopPreload state:" + this.f29562n);
        this.f29559h.lock();
        try {
            this.f29560i.signalAll();
            this.f29559h.unlock();
            this.f29558g = null;
            mo10166g(C9477a.IDLE);
        } catch (Throwable th) {
            this.f29559h.unlock();
            throw th;
        }
    }
}
