package xq3;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ux3.C65486b;

/* renamed from: xq3.a */
public final class C38806a {

    /* renamed from: a */
    public final String f104641a;

    /* renamed from: b */
    public long f104642b;

    /* renamed from: c */
    public List<C38808b> f104643c = new ArrayList();

    /* renamed from: d */
    public final C13601g f104644d = C36568h.m40985a(new C38810d(this));

    /* renamed from: xq3.a$a */
    public static final class C38807a {

        /* renamed from: a */
        public final long f104645a;

        /* renamed from: b */
        public final long f104646b;

        /* renamed from: c */
        public final long f104647c;

        /* renamed from: d */
        public final int f104648d;

        /* renamed from: e */
        public final int f104649e;

        /* renamed from: f */
        public final int f104650f;

        /* renamed from: g */
        public final float f104651g;

        /* renamed from: h */
        public final float f104652h;

        public C38807a(long j, long j2, long j3, int i, int i2, int i3, float f, float f2) {
            this.f104645a = j;
            this.f104646b = j2;
            this.f104647c = j3;
            this.f104648d = i;
            this.f104649e = i2;
            this.f104650f = i3;
            this.f104651g = f;
            this.f104652h = f2;
        }

        public String toString() {
            float f = (float) 100;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f104651g * f)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f104652h * f)}, 1));
            C87412m.m108593f(format2, "format(format, *args)");
            return "totalInflateCost:" + this.f104645a + "  asyncInflateCost:" + this.f104646b + " mainThreadInflateCost:" + this.f104647c + " asyncCostRatio:" + format + "% \n totalInflateCount:" + this.f104648d + " asyncInflateCount:" + this.f104649e + " mainThreadInflateCount:" + this.f104650f + " asyncCountRatio:" + format2 + '%';
        }
    }

    /* renamed from: xq3.a$b */
    public static final class C38808b {

        /* renamed from: a */
        public int f104653a;

        /* renamed from: b */
        public long f104654b;

        /* renamed from: c */
        public boolean f104655c;

        public C38808b(int i, long j, boolean z) {
            this.f104653a = i;
            this.f104654b = j;
            this.f104655c = z;
        }
    }

    /* renamed from: xq3.a$c */
    public static final class C38809c {

        /* renamed from: a */
        public long f104656a;

        /* renamed from: b */
        public int f104657b;

        public C38809c() {
            this(0, 0, 3, (C8480h) null);
        }

        public C38809c(long j, int i, int i2, C8480h hVar) {
            j = (i2 & 1) != 0 ? 0 : j;
            i = (i2 & 2) != 0 ? 0 : i;
            this.f104656a = j;
            this.f104657b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38809c)) {
                return false;
            }
            C38809c cVar = (C38809c) obj;
            return this.f104656a == cVar.f104656a && this.f104657b == cVar.f104657b;
        }

        public int hashCode() {
            long j = this.f104656a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f104657b;
        }

        public String toString() {
            return "SortStruct(cost=" + this.f104656a + ", cnt=" + this.f104657b + ')';
        }
    }

    /* renamed from: xq3.a$d */
    public static final class C38810d extends C87413o implements C32224a<C38807a> {

        /* renamed from: d */
        public final /* synthetic */ C38806a f104658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38810d(C38806a aVar) {
            super(0);
            this.f104658d = aVar;
        }

        public Object invoke() {
            return this.f104658d.mo61775a();
        }
    }

    /* renamed from: xq3.a$e */
    public static final class C38811e<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((C38809c) ((Map.Entry) t2).getValue()).f104656a), Long.valueOf(((C38809c) ((Map.Entry) t).getValue()).f104656a));
        }
    }

    /* renamed from: xq3.a$f */
    public static final class C38812f<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((C38809c) ((Map.Entry) t2).getValue()).f104656a), Long.valueOf(((C38809c) ((Map.Entry) t).getValue()).f104656a));
        }
    }

    public C38806a(String str) {
        C87412m.m108594g(str, "actName");
        this.f104641a = str;
    }

    /* renamed from: a */
    public final C38807a mo61775a() {
        Iterator it = new ArrayList(this.f104643c).iterator();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C38808b bVar = (C38808b) it.next();
            if (bVar != null) {
                i++;
                long j4 = bVar.f104654b;
                j += j4;
                if (bVar.f104655c) {
                    i3++;
                    j3 += j4;
                } else {
                    i2++;
                    j2 += j4;
                }
            }
        }
        return new C38807a(j, j2, j3, i, i2, i3, ((float) j2) / ((float) j), ((float) i2) / ((float) i));
    }

    /* renamed from: b */
    public final String mo61776b() {
        return "act:" + this.f104641a + " startTime:" + this.f104642b + "ms \n" + mo61775a() + "\n sortInfo:" + mo61777c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: xq3.a$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: xq3.a$c} */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo61777c() {
        /*
            r13 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List<xq3.a$b> r3 = r13.f104643c
            r2.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0015:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0055
            java.lang.Object r3 = r2.next()
            xq3.a$b r3 = (xq3.C38806a.C38808b) r3
            if (r3 != 0) goto L_0x0024
            goto L_0x0015
        L_0x0024:
            boolean r4 = r3.f104655c
            if (r4 == 0) goto L_0x002a
            r4 = r0
            goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            int r5 = r3.f104653a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r4.get(r5)
            if (r6 != 0) goto L_0x0045
            xq3.a$c r6 = new xq3.a$c
            r8 = 0
            r10 = 0
            r11 = 3
            r12 = 0
            r7 = r6
            r7.<init>(r8, r10, r11, r12)
            r4.put(r5, r6)
        L_0x0045:
            xq3.a$c r6 = (xq3.C38806a.C38809c) r6
            long r4 = r6.f104656a
            long r7 = r3.f104654b
            long r4 = r4 + r7
            r6.f104656a = r4
            int r3 = r6.f104657b
            int r3 = r3 + 1
            r6.f104657b = r3
            goto L_0x0015
        L_0x0055:
            java.util.Set r0 = r0.entrySet()
            java.lang.String r2 = "mainThreadMap.entries"
            gy3.C87412m.m108593f(r0, r2)
            xq3.a$e r2 = new xq3.a$e
            r2.<init>()
            java.util.List r0 = sx3.C110818d0.m150943o0(r0, r2)
            java.util.Set r1 = r1.entrySet()
            java.lang.String r2 = "asyncThreadMap.entries"
            gy3.C87412m.m108593f(r1, r2)
            xq3.a$f r2 = new xq3.a$f
            r2.<init>()
            java.util.List r1 = sx3.C110818d0.m150943o0(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "---- mainThread uniqueCnt:"
            r3.append(r4)
            int r4 = r0.size()
            r3.append(r4)
            r4 = 10
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x009c:
            boolean r3 = r0.hasNext()
            r5 = 32
            java.lang.String r6 = "it.key"
            if (r3 == 0) goto L_0x00e2
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object r8 = r3.getKey()
            gy3.C87412m.m108593f(r8, r6)
            java.lang.Number r8 = (java.lang.Number) r8
            int r6 = r8.intValue()
            java.lang.String r6 = r7.getResourceEntryName(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r5)
            java.lang.Object r3 = r3.getValue()
            r7.append(r3)
            r7.append(r4)
            java.lang.String r3 = r7.toString()
            r2.append(r3)
            goto L_0x009c
        L_0x00e2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "---- asyncThread uniqueCnt:"
            r0.append(r3)
            int r3 = r1.size()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.util.Iterator r0 = r1.iterator()
        L_0x0101:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0143
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            java.lang.Object r7 = r1.getKey()
            gy3.C87412m.m108593f(r7, r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.String r3 = r3.getResourceEntryName(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r5)
            java.lang.Object r1 = r1.getValue()
            r7.append(r1)
            r7.append(r4)
            java.lang.String r1 = r7.toString()
            r2.append(r1)
            goto L_0x0101
        L_0x0143:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "sb.toString()"
            gy3.C87412m.m108593f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xq3.C38806a.mo61777c():java.lang.String");
    }

    public String toString() {
        return "act:" + this.f104641a + " startTime:" + this.f104642b + "ms \n" + ((C38807a) ((C36570n) this.f104644d).getValue());
    }
}
