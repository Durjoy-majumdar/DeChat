package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.f2 */
public final class C104815f2 implements C84732d1 {

    /* renamed from: d */
    public final ConcurrentHashMap<String, C104816a> f311297d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public final ConcurrentHashMap<String, Object> f311298e = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.f2$a */
    public static final class C104816a {

        /* renamed from: a */
        public final ReentrantLock f311299a;

        /* renamed from: b */
        public final Condition f311300b;

        public C104816a(ReentrantLock reentrantLock, Condition condition) {
            C87412m.m108594g(reentrantLock, "lock");
            C87412m.m108594g(condition, "condition");
            this.f311299a = reentrantLock;
            this.f311300b = condition;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C104816a)) {
                return false;
            }
            C104816a aVar = (C104816a) obj;
            return C87412m.m108589b(this.f311299a, aVar.f311299a) && C87412m.m108589b(this.f311300b, aVar.f311300b);
        }

        public int hashCode() {
            return (this.f311299a.hashCode() * 31) + this.f311300b.hashCode();
        }

        public String toString() {
            return "LockAndCondition(lock=" + this.f311299a + ", condition=" + this.f311300b + ')';
        }
    }

    /* renamed from: H */
    public boolean mo117454H(String str, long j) {
        C104816a aVar;
        C87412m.m108594g(str, "tag");
        if ((this.f311297d.get(str) != null) && (aVar = this.f311297d.get(str)) != null) {
            aVar.f311299a.lock();
            try {
                aVar.f311300b.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Log.m105920e("MicroMsg.SyncWaiter", "hy: wait from async fail due to timeout!");
                return false;
            } finally {
                aVar.f311299a.unlock();
            }
        }
        return true;
    }

    /* renamed from: a0 */
    public void mo117455a0(String str, Object obj) {
        C87412m.m108594g(str, "tag");
        C104816a remove = this.f311297d.remove(str);
        if (remove != null) {
            this.f311298e.put(str, obj);
            remove.f311299a.lock();
            remove.f311300b.signalAll();
            remove.f311299a.unlock();
        }
    }

    /* renamed from: f */
    public Object mo117456f(String str) {
        C87412m.m108594g(str, "tag");
        return this.f311298e.get(str);
    }

    /* renamed from: h */
    public void mo117457h(String str) {
        C87412m.m108594g(str, "tag");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        ConcurrentHashMap<String, C104816a> concurrentHashMap = this.f311297d;
        C87412m.m108593f(newCondition, "condition");
        concurrentHashMap.put(str, new C104816a(reentrantLock, newCondition));
    }
}
