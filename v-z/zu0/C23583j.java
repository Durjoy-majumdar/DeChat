package zu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMConditionVariable;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import oa1.C117731d;
import zt3.C119157j;

/* renamed from: zu0.j */
public final class C23583j<T> {

    /* renamed from: a */
    public final ConcurrentHashMap<Long, C23585o<T>> f67600a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public volatile AtomicLong f67601b = new AtomicLong(0);

    /* renamed from: c */
    public volatile AtomicLong f67602c = new AtomicLong(0);

    /* renamed from: d */
    public volatile Lock f67603d = new ReentrantLock();

    /* renamed from: e */
    public final MMConditionVariable f67604e = new MMConditionVariable(true);

    /* renamed from: f */
    public final MMConditionVariable f67605f = new MMConditionVariable(true);

    /* renamed from: g */
    public boolean f67606g;

    /* renamed from: h */
    public boolean f67607h;

    /* renamed from: i */
    public int f67608i;

    /* renamed from: j */
    public volatile AtomicLong f67609j;

    /* renamed from: k */
    public volatile AtomicLong f67610k;

    public C23583j() {
        new MMConditionVariable(true);
        this.f67608i = C117731d.m166007c().mo182443e("clicfg_backup_cache_size", 41943040, false, true);
        this.f67609j = new AtomicLong(0);
        this.f67610k = new AtomicLong(0);
        ((C119157j) C119157j.f356862d).mo183884o(new C23581h(this));
    }

    /* renamed from: a */
    public final void mo37041a(C23586p<T> pVar, long j) {
        C87412m.m108594g(pVar, "task");
        ((ReentrantLock) this.f67603d).lock();
        this.f67609j.addAndGet(j);
        while (this.f67609j.get() > ((long) this.f67608i) && !this.f67606g) {
            this.f67605f.close();
            this.f67605f.block(500);
        }
        if (!this.f67606g) {
            long j2 = this.f67601b.get();
            Log.m105925i("MicroMsg.BackupFlowQueue", "execute index:%d, cacheSize:%d", Long.valueOf(j2), Long.valueOf(this.f67609j.get()));
            ((C119157j) C119157j.f356862d).mo183870a(new C23580g(pVar, j, this, j2));
            this.f67601b.addAndGet(1);
        }
        ((ReentrantLock) this.f67603d).unlock();
    }

    /* renamed from: b */
    public final void mo37042b() {
        this.f67601b.set(0);
        this.f67602c.set(0);
        this.f67604e.open();
        this.f67605f.open();
        this.f67600a.clear();
        this.f67609j.set(0);
        this.f67610k.set(0);
    }
}
