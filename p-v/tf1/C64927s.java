package tf1;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import rx3.C13598b0;
import tf1.C13914m;

/* renamed from: tf1.s */
public final class C64927s<T extends C13914m> implements C13915n<T> {

    /* renamed from: a */
    public final long f186952a;

    /* renamed from: b */
    public volatile boolean f186953b;

    /* renamed from: c */
    public volatile IResponse<T> f186954c;

    /* renamed from: d */
    public final ReentrantLock f186955d;

    /* renamed from: e */
    public final Condition f186956e;

    public C64927s(long j, int i, C8480h hVar) {
        this.f186952a = (i & 1) != 0 ? 0 : j;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f186955d = reentrantLock;
        this.f186956e = reentrantLock.newCondition();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo13385a(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "call");
        this.f186955d.lock();
        try {
            this.f186953b = true;
            this.f186955d.unlock();
            aVar.invoke();
        } catch (Throwable th) {
            this.f186955d.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public void mo13386b(C32226l<? super IResponse<T>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "call");
        this.f186955d.lock();
        try {
            if (this.f186953b) {
                long uptimeMillis = SystemClock.uptimeMillis();
                this.f186956e.await(1, TimeUnit.MINUTES);
                long uptimeMillis2 = this.f186952a - (SystemClock.uptimeMillis() - uptimeMillis);
                if (uptimeMillis2 > 0) {
                    this.f186956e.await(uptimeMillis2, TimeUnit.MILLISECONDS);
                }
            } else if (this.f186954c != null) {
                long j = this.f186952a;
                if (j > 0) {
                    this.f186956e.await(j, TimeUnit.MILLISECONDS);
                }
            }
            this.f186955d.unlock();
            IResponse<T> iResponse = this.f186954c;
            this.f186954c = null;
            lVar.invoke(iResponse);
        } catch (Throwable th) {
            this.f186955d.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public void mo13387c(IResponse<T> iResponse) {
        C87412m.m108594g(iResponse, "response");
        this.f186955d.lock();
        try {
            this.f186954c = iResponse;
            this.f186956e.signalAll();
        } finally {
            this.f186953b = false;
            this.f186955d.unlock();
        }
    }

    /* renamed from: d */
    public final boolean mo89085d() {
        try {
            this.f186955d.lock();
            boolean z = this.f186954c != null;
            this.f186954c = null;
            return z;
        } finally {
            this.f186955d.unlock();
        }
    }
}
