package p1221x4;

import androidx.work.C113041b;
import com.tencent.xweb.util.Scheduler;
import p1014o4.C109940q;
import p1014o4.C117681a;
import p1014o4.C117682c;
import p1014o4.C117693m;
import p1014o4.C117705u;

/* renamed from: x4.o */
public final class C118847o {

    /* renamed from: a */
    public String f355541a;

    /* renamed from: b */
    public C117705u f355542b = C117705u.ENQUEUED;

    /* renamed from: c */
    public String f355543c;

    /* renamed from: d */
    public String f355544d;

    /* renamed from: e */
    public C113041b f355545e;

    /* renamed from: f */
    public C113041b f355546f;

    /* renamed from: g */
    public long f355547g;

    /* renamed from: h */
    public long f355548h;

    /* renamed from: i */
    public long f355549i;

    /* renamed from: j */
    public C117682c f355550j;

    /* renamed from: k */
    public int f355551k;

    /* renamed from: l */
    public C117681a f355552l;

    /* renamed from: m */
    public long f355553m;

    /* renamed from: n */
    public long f355554n;

    /* renamed from: o */
    public long f355555o;

    /* renamed from: p */
    public long f355556p;

    /* renamed from: q */
    public boolean f355557q;

    /* renamed from: r */
    public C109940q f355558r;

    /* renamed from: x4.o$a */
    public static class C118848a {

        /* renamed from: a */
        public String f355559a;

        /* renamed from: b */
        public C117705u f355560b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C118848a)) {
                return false;
            }
            C118848a aVar = (C118848a) obj;
            if (this.f355560b != aVar.f355560b) {
                return false;
            }
            return this.f355559a.equals(aVar.f355559a);
        }

        public int hashCode() {
            return (this.f355559a.hashCode() * 31) + this.f355560b.hashCode();
        }
    }

    static {
        C117693m.m165967e("WorkSpec");
    }

    public C118847o(String str, String str2) {
        C113041b bVar = C113041b.f338352b;
        this.f355545e = bVar;
        this.f355546f = bVar;
        this.f355550j = C117682c.f351994i;
        this.f355552l = C117681a.EXPONENTIAL;
        this.f355553m = 30000;
        this.f355556p = -1;
        this.f355558r = C109940q.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f355541a = str;
        this.f355543c = str2;
    }

    /* renamed from: a */
    public long mo183544a() {
        boolean z = false;
        if (this.f355542b == C117705u.ENQUEUED && this.f355551k > 0) {
            if (this.f355552l == C117681a.LINEAR) {
                z = true;
            }
            return this.f355554n + Math.min(Scheduler.DEFAULT_EXPIRE_TIME, z ? this.f355553m * ((long) this.f355551k) : (long) Math.scalb((float) this.f355553m, this.f355551k - 1));
        }
        long j = 0;
        if (mo183546c()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.f355554n;
            int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i == 0) {
                j2 = this.f355547g + currentTimeMillis;
            }
            long j3 = this.f355549i;
            long j4 = this.f355548h;
            if (j3 != j4) {
                z = true;
            }
            if (z) {
                if (i == 0) {
                    j = j3 * -1;
                }
                return j2 + j4 + j;
            }
            if (i != 0) {
                j = j4;
            }
            return j2 + j;
        }
        long j5 = this.f355554n;
        if (j5 == 0) {
            j5 = System.currentTimeMillis();
        }
        return j5 + this.f355547g;
    }

    /* renamed from: b */
    public boolean mo183545b() {
        return !C117682c.f351994i.equals(this.f355550j);
    }

    /* renamed from: c */
    public boolean mo183546c() {
        return this.f355548h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C118847o.class != obj.getClass()) {
            return false;
        }
        C118847o oVar = (C118847o) obj;
        if (this.f355547g != oVar.f355547g || this.f355548h != oVar.f355548h || this.f355549i != oVar.f355549i || this.f355551k != oVar.f355551k || this.f355553m != oVar.f355553m || this.f355554n != oVar.f355554n || this.f355555o != oVar.f355555o || this.f355556p != oVar.f355556p || this.f355557q != oVar.f355557q || !this.f355541a.equals(oVar.f355541a) || this.f355542b != oVar.f355542b || !this.f355543c.equals(oVar.f355543c)) {
            return false;
        }
        String str = this.f355544d;
        if (str == null ? oVar.f355544d == null : str.equals(oVar.f355544d)) {
            return this.f355545e.equals(oVar.f355545e) && this.f355546f.equals(oVar.f355546f) && this.f355550j.equals(oVar.f355550j) && this.f355552l == oVar.f355552l && this.f355558r == oVar.f355558r;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f355541a.hashCode() * 31) + this.f355542b.hashCode()) * 31) + this.f355543c.hashCode()) * 31;
        String str = this.f355544d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.f355547g;
        long j2 = this.f355548h;
        long j3 = this.f355549i;
        long j4 = this.f355553m;
        long j5 = this.f355554n;
        long j6 = this.f355555o;
        long j7 = this.f355556p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f355545e.hashCode()) * 31) + this.f355546f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f355550j.hashCode()) * 31) + this.f355551k) * 31) + this.f355552l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f355557q ? 1 : 0)) * 31) + this.f355558r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f355541a + "}";
    }

    public C118847o(C118847o oVar) {
        C113041b bVar = C113041b.f338352b;
        this.f355545e = bVar;
        this.f355546f = bVar;
        this.f355550j = C117682c.f351994i;
        this.f355552l = C117681a.EXPONENTIAL;
        this.f355553m = 30000;
        this.f355556p = -1;
        this.f355558r = C109940q.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f355541a = oVar.f355541a;
        this.f355543c = oVar.f355543c;
        this.f355542b = oVar.f355542b;
        this.f355544d = oVar.f355544d;
        this.f355545e = new C113041b(oVar.f355545e);
        this.f355546f = new C113041b(oVar.f355546f);
        this.f355547g = oVar.f355547g;
        this.f355548h = oVar.f355548h;
        this.f355549i = oVar.f355549i;
        this.f355550j = new C117682c(oVar.f355550j);
        this.f355551k = oVar.f355551k;
        this.f355552l = oVar.f355552l;
        this.f355553m = oVar.f355553m;
        this.f355554n = oVar.f355554n;
        this.f355555o = oVar.f355555o;
        this.f355556p = oVar.f355556p;
        this.f355557q = oVar.f355557q;
        this.f355558r = oVar.f355558r;
    }
}
