package p001ak;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p006bk.C54479b;
import p006bk.C54484g;
import p006bk.C54486i;
import p848dk.C58297b;
import p848dk.C58301e;
import p848dk.C58306h;
import p871zj.C66836c;

/* renamed from: ak.a */
public abstract class C54053a<DATA, CONFIG extends C54484g> {

    /* renamed from: z */
    public static final AtomicInteger f151343z = new AtomicInteger();

    /* renamed from: a */
    public C54479b f151344a;

    /* renamed from: b */
    public final int f151345b = f151343z.incrementAndGet();

    /* renamed from: c */
    public long f151346c;

    /* renamed from: d */
    public C58301e f151347d;

    /* renamed from: e */
    public long f151348e;

    /* renamed from: f */
    public long f151349f = 2000;

    /* renamed from: g */
    public final PriorityQueue<C0045a> f151350g;

    /* renamed from: h */
    public float f151351h = -1.0f;

    /* renamed from: i */
    public float f151352i = -1.0f;

    /* renamed from: j */
    public float f151353j;

    /* renamed from: k */
    public int f151354k;

    /* renamed from: l */
    public boolean f151355l;

    /* renamed from: m */
    public Bitmap f151356m;

    /* renamed from: n */
    public Canvas f151357n;

    /* renamed from: o */
    public int f151358o;

    /* renamed from: p */
    public int f151359p = -1;

    /* renamed from: q */
    public boolean f151360q;

    /* renamed from: r */
    public boolean f151361r;

    /* renamed from: s */
    public boolean f151362s = false;

    /* renamed from: t */
    public float f151363t = -1.0f;

    /* renamed from: u */
    public float f151364u = -1.0f;

    /* renamed from: v */
    public volatile boolean f151365v = true;

    /* renamed from: w */
    public volatile boolean f151366w = true;

    /* renamed from: x */
    public DATA f151367x;

    /* renamed from: y */
    public CONFIG f151368y;

    /* renamed from: ak.a$a */
    public static final class C0045a implements Comparable<C0045a> {

        /* renamed from: d */
        public long f55d;

        public int compareTo(Object obj) {
            C0045a aVar = (C0045a) obj;
            if (aVar == null) {
                return 1;
            }
            int i = (this.f55d > aVar.f55d ? 1 : (this.f55d == aVar.f55d ? 0 : -1));
            if (i > 0) {
                return -1;
            }
            return i < 0 ? 1 : 0;
        }

        public String toString() {
            return "mRemainTime:" + this.f55d;
        }
    }

    public C54053a(C54479b bVar) {
        this.f151344a = bVar;
        this.f151350g = new PriorityQueue<>();
        try {
            this.f151368y = this.f151344a.mo75306b(mo74720j());
        } catch (Exception unused) {
            if (C66836c.f191968b) {
                throw new RuntimeException("IDanmakuUIConfig should been provided by IDanmakuUIConfigCreator in DanmakuContext");
            }
        }
        mo74728r();
    }

    /* renamed from: a */
    public void mo74709a() {
        this.f151365v = false;
    }

    /* renamed from: b */
    public abstract float mo74710b();

    /* renamed from: c */
    public abstract float[] mo74711c(long j);

    /* renamed from: d */
    public abstract float mo74712d();

    /* renamed from: e */
    public abstract float[] mo74713e(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DATA data = this.f151367x;
        DATA data2 = ((C54053a) obj).f151367x;
        return data != null ? data.equals(data2) : data2 == null;
    }

    /* renamed from: f */
    public abstract float mo74715f();

    /* renamed from: g */
    public int mo74716g() {
        return C54479b.m61196c().f152763j;
    }

    /* renamed from: h */
    public abstract float mo74717h();

    public int hashCode() {
        DATA data = this.f151367x;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    /* renamed from: i */
    public abstract float mo74719i();

    /* renamed from: j */
    public abstract int mo74720j();

    /* renamed from: k */
    public boolean mo74721k(long j) {
        long j2 = this.f151346c;
        return j2 > 0 && j - j2 >= this.f151347d.f166939a;
    }

    /* renamed from: l */
    public boolean mo74722l() {
        return this.f151351h >= 0.0f && this.f151352i >= 0.0f && !this.f151365v;
    }

    /* renamed from: m */
    public boolean mo74723m(long j) {
        return !this.f151361r && j - this.f151348e >= this.f151347d.f166939a;
    }

    /* renamed from: n */
    public C58297b mo74724n(C58306h hVar) {
        return new C58297b(-1);
    }

    /* renamed from: o */
    public abstract void mo74725o(float f, float f2, long j, long j2);

    /* renamed from: p */
    public abstract void mo74726p(long j);

    /* renamed from: q */
    public final void mo74727q(long j, long j2) {
        if (this.f151360q) {
            this.f151346c += j;
        }
        mo74726p(j2);
        if (!this.f151350g.isEmpty()) {
            Iterator<C0045a> it = this.f151350g.iterator();
            while (it.hasNext()) {
                C0045a next = it.next();
                long j3 = next.f55d - j;
                next.f55d = j3;
                if (j3 <= 0) {
                    it.remove();
                    throw null;
                }
            }
        }
    }

    /* renamed from: r */
    public void mo74728r() {
        C54486i c = C54479b.m61196c();
        this.f151353j = c.f152760g;
        this.f151355l = c.f152762i;
        this.f151350g.clear();
        this.f151351h = -1.0f;
        this.f151352i = -1.0f;
        this.f151354k = 0;
        this.f151356m = null;
        this.f151358o = 0;
        this.f151360q = false;
        this.f151362s = false;
        this.f151365v = true;
        this.f151366w = true;
        this.f151363t = -1.0f;
        this.f151364u = -1.0f;
        this.f151347d = new C58301e((long) C54479b.m61196c().f152754a);
    }

    public String toString() {
        return "BaseDanmaku" + this.f151345b + "[left:" + mo74712d() + ",top:" + mo74719i() + ",right:" + mo74715f() + ",bottom:" + mo74710b() + ", time:" + this.f151348e + ", mData=" + String.valueOf(this.f151367x) + "mType=" + mo74720j() + "]";
    }
}
