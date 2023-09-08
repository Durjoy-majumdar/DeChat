package c92;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: c92.g */
public final class C104329g {

    /* renamed from: a */
    public static final C104329g f308829a = new C104329g();

    /* renamed from: b */
    public static final C104330a[] f308830b;

    /* renamed from: c */
    public static final Map<Integer, Integer> f308831c = C90364q0.m113147f(new C13604l(0, 0), new C13604l(1, 3), new C13604l(2, 6), new C13604l(3, 9), new C13604l(4, 12));

    /* renamed from: d */
    public static final int[] f308832d = new int[2];

    /* renamed from: e */
    public static long f308833e;

    /* renamed from: f */
    public static long f308834f;

    /* renamed from: g */
    public static long f308835g;

    /* renamed from: h */
    public static long f308836h;

    /* renamed from: i */
    public static int f308837i;

    /* renamed from: c92.g$a */
    public static final class C104330a {

        /* renamed from: a */
        public final int f308838a;

        /* renamed from: b */
        public long f308839b;

        /* renamed from: c */
        public int f308840c;

        public C104330a(int i, long j, int i2) {
            this.f308838a = i;
            this.f308839b = j;
            this.f308840c = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C104330a)) {
                return false;
            }
            C104330a aVar = (C104330a) obj;
            return this.f308838a == aVar.f308838a && this.f308839b == aVar.f308839b && this.f308840c == aVar.f308840c;
        }

        public int hashCode() {
            long j = this.f308839b;
            return (((this.f308838a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f308840c;
        }

        public String toString() {
            return "CostInfo(idx=" + this.f308838a + ", totalCost=" + this.f308839b + ", times=" + this.f308840c + ')';
        }
    }

    static {
        C104330a[] aVarArr = new C104330a[5];
        for (int i = 0; i < 5; i++) {
            aVarArr[i] = new C104330a(i, 0, 0);
        }
        f308830b = aVarArr;
    }

    /* renamed from: a */
    public final void mo146027a(int i, long j) {
        C104330a aVar = f308830b[i];
        aVar.f308840c++;
        aVar.f308839b += j;
    }

    /* renamed from: b */
    public final void mo146028b(int i) {
        if (f308837i == 0) {
            f308833e = System.currentTimeMillis();
        }
        if (i != f308837i) {
            if (i == 1) {
                int[] iArr = f308832d;
                iArr[0] = iArr[0] + 1;
                long currentTimeMillis = System.currentTimeMillis() - f308833e;
                f308835g += currentTimeMillis;
                f308834f += currentTimeMillis;
            } else if (i == 2) {
                int[] iArr2 = f308832d;
                iArr2[1] = iArr2[1] + 1;
                long currentTimeMillis2 = System.currentTimeMillis() - f308833e;
                f308836h += currentTimeMillis2;
                f308834f += currentTimeMillis2;
            }
            f308833e = System.currentTimeMillis();
            f308837i = i;
        }
    }

    /* renamed from: c */
    public final void mo146029c(int i, long j) {
        Log.m105924i("MultitalkReportHelper", "report avg key: " + i + " value: " + j);
        C115669n.INSTANCE.mo160138m(1438, i, i + 1, (int) j, false);
    }

    /* renamed from: d */
    public final void mo146030d() {
        C104330a[] aVarArr = f308830b;
        for (int i = 0; i < 5; i++) {
            C104330a aVar = aVarArr[i];
            aVar.f308839b = 0;
            aVar.f308840c = 0;
        }
        int length = f308832d.length;
        for (int i2 = 0; i2 < length; i2++) {
            f308832d[i2] = 0;
        }
        f308833e = 0;
        f308834f = 0;
        f308836h = 0;
        f308835g = 0;
        f308837i = 0;
    }
}
