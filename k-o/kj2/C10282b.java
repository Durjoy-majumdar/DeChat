package kj2;

import java.util.HashMap;
import java.util.Map;

/* renamed from: kj2.b */
public class C10282b {

    /* renamed from: a */
    public int f31341a;

    /* renamed from: b */
    public long f31342b;

    /* renamed from: c */
    public long f31343c;

    /* renamed from: d */
    public HashMap<Integer, Long> f31344d = new HashMap<>();

    public C10282b(int i) {
        this.f31341a = i;
        this.f31342b = 300000;
    }

    /* renamed from: a */
    public final void mo10578a(int i, long j) {
        Long l = this.f31344d.get(Integer.valueOf(i));
        if (l != null) {
            j += l.longValue();
        }
        this.f31344d.put(Integer.valueOf(i), Long.valueOf(j));
    }

    /* renamed from: b */
    public void mo10579b(int i, int i2, long j) {
        synchronized (this) {
            mo10578a(i, j);
            mo10578a(i2, 1);
            mo10580c();
        }
    }

    /* renamed from: c */
    public final void mo10580c() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f31343c > this.f31342b) {
            for (Map.Entry next : this.f31344d.entrySet()) {
                C117407d.INSTANCE.idkeyStat((long) this.f31341a, (long) ((Integer) next.getKey()).intValue(), ((Long) next.getValue()).longValue(), false);
            }
            this.f31343c = currentTimeMillis;
        }
    }
}
