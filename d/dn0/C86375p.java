package dn0;

import an0.C79592a;
import dn0.C86377r;
import fn0.C87002g;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: dn0.p */
public class C86375p {

    /* renamed from: v */
    public static AtomicInteger f251129v = new AtomicInteger(10000);

    /* renamed from: a */
    public Future<?> f251130a;

    /* renamed from: b */
    public int f251131b = 0;

    /* renamed from: c */
    public int f251132c = 0;

    /* renamed from: d */
    public C86376q f251133d;

    /* renamed from: e */
    public final Object f251134e = new Object();

    /* renamed from: f */
    public int f251135f = f251129v.incrementAndGet();

    /* renamed from: g */
    public int f251136g = 0;

    /* renamed from: h */
    public int f251137h = -1;

    /* renamed from: i */
    public long f251138i;

    /* renamed from: j */
    public long f251139j;

    /* renamed from: k */
    public long f251140k = -1;

    /* renamed from: l */
    public boolean f251141l;

    /* renamed from: m */
    public String f251142m;

    /* renamed from: n */
    public String f251143n;

    /* renamed from: o */
    public String f251144o;

    /* renamed from: p */
    public String f251145p;

    /* renamed from: q */
    public String f251146q;

    /* renamed from: r */
    public String f251147r = "";

    /* renamed from: s */
    public C86358b f251148s = C86358b.f251077c;

    /* renamed from: t */
    public int f251149t;

    /* renamed from: u */
    public long f251150u = System.currentTimeMillis();

    /* renamed from: a */
    public final boolean mo120771a(int i) {
        boolean z;
        synchronized (this.f251134e) {
            z = this.f251132c == i;
        }
        return z;
    }

    /* renamed from: b */
    public void mo120772b() {
        if (mo120792u(1, 2)) {
            C86376q qVar = this.f251133d;
            if (qVar != null) {
                qVar.getClass();
            }
            if (C79592a.m96648a().f233399b) {
                String f = mo120776f();
                C87002g.m108023q(3, f, "cancel proceeding, seq=" + this.f251135f, (Throwable) null);
            }
        }
    }

    /* renamed from: c */
    public void mo120773c() {
        if (mo120792u(2, 3)) {
            C86376q qVar = this.f251133d;
            if (qVar != null) {
                ((C86377r.C86378a) qVar).f251152a.countDown();
            }
            if (C79592a.m96648a().f233399b) {
                String f = mo120776f();
                C87002g.m108023q(3, f, "cancel success, seq=" + this.f251135f, (Throwable) null);
            }
        }
    }

    /* renamed from: d */
    public int mo120774d() {
        return this.f251136g;
    }

    /* renamed from: e */
    public synchronized C86358b mo120775e() {
        return this.f251148s;
    }

    /* renamed from: f */
    public String mo120776f() {
        return this.f251147r + "VideoRequest";
    }

    /* renamed from: g */
    public int mo120777g() {
        return this.f251137h;
    }

    /* renamed from: h */
    public long mo120778h() {
        return this.f251139j;
    }

    /* renamed from: i */
    public long mo120779i() {
        return this.f251138i;
    }

    /* renamed from: j */
    public String mo120780j() {
        return this.f251146q;
    }

    /* renamed from: k */
    public int mo120781k() {
        return this.f251135f;
    }

    /* renamed from: l */
    public String mo120782l() {
        return this.f251144o;
    }

    /* renamed from: m */
    public String mo120783m() {
        return this.f251142m;
    }

    /* renamed from: n */
    public String mo120784n() {
        return this.f251143n;
    }

    /* renamed from: o */
    public boolean mo120785o() {
        return mo120771a(2);
    }

    /* renamed from: p */
    public boolean mo120786p() {
        String str = this.f251146q;
        return str != null && str.toLowerCase().equals("head");
    }

    /* renamed from: q */
    public void mo120787q(int i) {
        this.f251136g = i;
    }

    /* renamed from: r */
    public synchronized void mo120788r(int i) {
    }

    /* renamed from: s */
    public void mo120789s(int i) {
        int i2 = this.f251131b;
        if ((i2 & i) == 0) {
            this.f251131b = i2 + i;
        }
    }

    /* renamed from: t */
    public boolean mo120790t() {
        return mo120771a(1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{seq=");
        sb.append(this.f251135f);
        sb.append(",priority=");
        sb.append(this.f251137h);
        sb.append(",range=[");
        sb.append(this.f251138i);
        sb.append(",");
        sb.append(this.f251139j);
        sb.append("],uuid=");
        sb.append(this.f251142m);
        sb.append(",contentType=");
        sb.append(this.f251145p);
        sb.append(",cancelState=");
        sb.append(this.f251132c);
        sb.append(",sourceUrl=");
        sb.append(this.f251144o);
        sb.append(",videoKey=");
        sb.append(this.f251143n);
        sb.append(",task=");
        Future<?> future = this.f251130a;
        sb.append(future == null ? "null" : future.toString());
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean mo120792u(int i, int i2) {
        synchronized (this.f251134e) {
            if (this.f251132c == i) {
                this.f251132c = i2;
                return true;
            }
            C87002g.m108023q(5, mo120776f(), String.format(Locale.US, "transState error, current %d, condition %d, newState %d", new Object[]{Integer.valueOf(this.f251132c), Integer.valueOf(i), Integer.valueOf(i2)}), (Throwable) null);
            return false;
        }
    }

    /* renamed from: v */
    public synchronized void mo120793v(long j, C86358b bVar) {
        this.f251140k = j;
        this.f251148s = bVar;
        if (bVar.equals(C86358b.f251079e)) {
            this.f251136g |= 8;
        }
    }

    /* renamed from: w */
    public synchronized void mo120794w(int i) {
        this.f251149t += i;
    }
}
