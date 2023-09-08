package p380r7;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.Arrays;
import java.util.LinkedList;
import p294b7.C16743g;
import p294b7.C16748l;
import p300c8.C16870b;
import p300c8.C16876u;
import p333e8.C20536j;
import p370p7.C21920c;
import p370p7.C21952p;
import p370p7.C21954q;
import p370p7.C21958s;
import p370p7.C21961u;
import p370p7.C21962v;
import p373q7.C22074a;
import p380r7.C22202c;

/* renamed from: r7.j */
public final class C22212j implements C16876u.C16877a<C22074a>, C16876u.C16880d, C21958s, C16743g, C21954q.C21956b {

    /* renamed from: A */
    public int f62915A;

    /* renamed from: B */
    public boolean f62916B;

    /* renamed from: C */
    public boolean[] f62917C;

    /* renamed from: D */
    public boolean[] f62918D;

    /* renamed from: E */
    public long f62919E;

    /* renamed from: F */
    public long f62920F;

    /* renamed from: G */
    public boolean f62921G;

    /* renamed from: H */
    public boolean f62922H;

    /* renamed from: I */
    public boolean f62923I;

    /* renamed from: d */
    public final int f62924d;

    /* renamed from: e */
    public final C22214b f62925e;

    /* renamed from: f */
    public final C22202c f62926f;

    /* renamed from: g */
    public final C16870b f62927g;

    /* renamed from: h */
    public final Format f62928h;

    /* renamed from: i */
    public final int f62929i;

    /* renamed from: j */
    public final C16876u f62930j = new C16876u("Loader:HlsSampleStreamWrapper");

    /* renamed from: n */
    public final C21920c.C21921a f62931n;

    /* renamed from: o */
    public final C22202c.C22204b f62932o = new C22202c.C22204b();

    /* renamed from: p */
    public final LinkedList<C22208f> f62933p = new LinkedList<>();

    /* renamed from: q */
    public final Runnable f62934q = new C22213a();

    /* renamed from: r */
    public final Handler f62935r = new Handler();

    /* renamed from: s */
    public C21954q[] f62936s = new C21954q[0];

    /* renamed from: t */
    public int[] f62937t = new int[0];

    /* renamed from: u */
    public boolean f62938u;

    /* renamed from: v */
    public boolean f62939v;

    /* renamed from: w */
    public int f62940w;

    /* renamed from: x */
    public Format f62941x;

    /* renamed from: y */
    public boolean f62942y;

    /* renamed from: z */
    public C21962v f62943z;

    /* renamed from: r7.j$a */
    public class C22213a implements Runnable {
        public C22213a() {
        }

        public void run() {
            C22212j.this.mo35343v();
        }
    }

    /* renamed from: r7.j$b */
    public interface C22214b extends C21958s.C21959a<C22212j> {
    }

    public C22212j(int i, C22214b bVar, C22202c cVar, C16870b bVar2, long j, Format format, int i2, C21920c.C21921a aVar) {
        this.f62924d = i;
        this.f62925e = bVar;
        this.f62926f = cVar;
        this.f62927g = bVar2;
        this.f62928h = format;
        this.f62929i = i2;
        this.f62931n = aVar;
        this.f62919E = j;
        this.f62920F = j;
    }

    /* renamed from: s */
    public static Format m25696s(Format format, Format format2) {
        Format format3 = format;
        Format format4 = format2;
        if (format3 == null) {
            return format4;
        }
        String str = null;
        int c = C20536j.m22251c(format4.f45777i);
        if (c == 1) {
            str = m25697t(format3.f45774f, 1);
        } else if (c == 2) {
            str = m25697t(format3.f45774f, 2);
        }
        String str2 = str;
        String str3 = format3.f45772d;
        int i = format3.f45773e;
        int i2 = format3.f45781p;
        int i3 = format3.f45782q;
        int i4 = format3.f45768D;
        String str4 = format3.f45769E;
        String str5 = format4.f45776h;
        int i5 = i4;
        String str6 = str4;
        return new Format(str3, str5, format4.f45777i, str2, i, format4.f45778j, i2, i3, format4.f45783r, format4.f45784s, format4.f45785t, format4.f45787v, format4.f45786u, format4.f45788w, format4.f45789x, format4.f45790y, format4.f45791z, format4.f45765A, format4.f45766B, i5, str6, format4.f45770F, format4.f45767C, format4.f45779n, format4.f45780o, format4.f45775g);
    }

    /* renamed from: t */
    public static String m25697t(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (i == C20536j.m22251c(C20536j.m22249a(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: a */
    public long mo34983a() {
        long j;
        if (this.f62923I) {
            return Long.MIN_VALUE;
        }
        if (mo35342u()) {
            return this.f62920F;
        }
        long j2 = this.f62919E;
        C22208f last = this.f62933p.getLast();
        if (!last.f62874F) {
            if (this.f62933p.size() > 1) {
                LinkedList<C22208f> linkedList = this.f62933p;
                last = linkedList.get(linkedList.size() - 2);
            } else {
                last = null;
            }
        }
        if (last != null) {
            j2 = Math.max(j2, last.f62460g);
        }
        for (C21954q qVar : this.f62936s) {
            C21952p pVar = qVar.f62149c;
            synchronized (pVar) {
                j = pVar.f62139n;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0153  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34984b(long r34) {
        /*
            r33 = this;
            r0 = r33
            boolean r1 = r0.f62923I
            if (r1 != 0) goto L_0x031a
            c8.u r1 = r0.f62930j
            boolean r1 = r1.mo17934a()
            if (r1 == 0) goto L_0x0010
            goto L_0x031a
        L_0x0010:
            r7.c r1 = r0.f62926f
            java.util.LinkedList<r7.f> r3 = r0.f62933p
            boolean r3 = r3.isEmpty()
            r4 = 0
            if (r3 == 0) goto L_0x001d
            r3 = r4
            goto L_0x0025
        L_0x001d:
            java.util.LinkedList<r7.f> r3 = r0.f62933p
            java.lang.Object r3 = r3.getLast()
            r7.f r3 = (p380r7.C22208f) r3
        L_0x0025:
            long r5 = r0.f62920F
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r5 = r34
        L_0x0033:
            r7.c$b r9 = r0.f62932o
            if (r3 != 0) goto L_0x0039
            r8 = -1
            goto L_0x0041
        L_0x0039:
            p7.u r8 = r1.f62850f
            com.google.android.exoplayer2.Format r10 = r3.f62456c
            int r8 = r8.mo35036a(r10)
        L_0x0041:
            r1.f62855k = r4
            r10 = 0
            if (r3 != 0) goto L_0x0048
            goto L_0x0056
        L_0x0048:
            boolean r12 = r1.f62856l
            if (r12 == 0) goto L_0x004f
            long r13 = r3.f62460g
            goto L_0x0051
        L_0x004f:
            long r13 = r3.f62459f
        L_0x0051:
            long r13 = r13 - r5
            long r10 = java.lang.Math.max(r10, r13)
        L_0x0056:
            b8.f r12 = r1.f62861q
            r12.mo17782g(r10)
            b8.f r10 = r1.f62861q
            int r10 = r10.mo17789b()
            r13 = 1
            if (r8 == r10) goto L_0x0066
            r11 = 1
            goto L_0x0067
        L_0x0066:
            r11 = 0
        L_0x0067:
            s7.a$a[] r12 = r1.f62848d
            r12 = r12[r10]
            s7.e r14 = r1.f62849e
            java.util.IdentityHashMap<s7.a$a, s7.e$b> r14 = r14.f63245g
            java.lang.Object r14 = r14.get(r12)
            s7.e$b r14 = (p381s7.C22305e.C22307b) r14
            s7.b r15 = r14.f63258g
            if (r15 != 0) goto L_0x007e
            r20 = r5
            r19 = r8
            goto L_0x00a9
        L_0x007e:
            long r15 = android.os.SystemClock.elapsedRealtime()
            r19 = r8
            r7 = 30000(0x7530, double:1.4822E-319)
            s7.b r2 = r14.f63258g
            r20 = r5
            long r4 = r2.f63230p
            long r4 = p396x6.C22994b.m27204b(r4)
            long r4 = java.lang.Math.max(r7, r4)
            s7.b r2 = r14.f63258g
            boolean r6 = r2.f63226l
            if (r6 != 0) goto L_0x00ab
            int r2 = r2.f63217c
            r6 = 2
            if (r2 == r6) goto L_0x00ab
            if (r2 == r13) goto L_0x00ab
            long r6 = r14.f63259h
            long r6 = r6 + r4
            int r2 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r2 = 0
            goto L_0x00ac
        L_0x00ab:
            r2 = 1
        L_0x00ac:
            if (r2 != 0) goto L_0x00b4
            r9.f62866c = r12
            r1.f62855k = r12
            goto L_0x0282
        L_0x00b4:
            s7.e r2 = r1.f62849e
            s7.b r2 = r2.mo35460a(r12)
            boolean r4 = r2.f63225k
            r1.f62856l = r4
            if (r3 == 0) goto L_0x00c8
            if (r11 == 0) goto L_0x00c3
            goto L_0x00c8
        L_0x00c3:
            int r4 = r3.f62465i
            int r4 = r4 + r13
            goto L_0x0143
        L_0x00c8:
            if (r3 != 0) goto L_0x00cd
            r5 = r20
            goto L_0x00d4
        L_0x00cd:
            if (r4 == 0) goto L_0x00d2
            long r5 = r3.f62460g
            goto L_0x00d4
        L_0x00d2:
            long r5 = r3.f62459f
        L_0x00d4:
            boolean r4 = r2.f63226l
            if (r4 != 0) goto L_0x00eb
            long r7 = r2.f63219e
            long r14 = r2.f63230p
            long r7 = r7 + r14
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x00eb
            int r4 = r2.f63222h
            java.util.List<s7.b$a> r5 = r2.f63229o
            int r5 = r5.size()
            int r4 = r4 + r5
            goto L_0x0143
        L_0x00eb:
            java.util.List<s7.b$a> r4 = r2.f63229o
            long r7 = r2.f63219e
            long r5 = r5 - r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            s7.e r6 = r1.f62849e
            boolean r6 = r6.f63254s
            if (r6 == 0) goto L_0x00ff
            if (r3 != 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r6 = 0
            goto L_0x0100
        L_0x00ff:
            r6 = 1
        L_0x0100:
            int r7 = p333e8.C20551y.f57835a
            int r7 = java.util.Collections.binarySearch(r4, r5)
            if (r7 >= 0) goto L_0x010c
            r8 = 2
            int r7 = r7 + r8
            int r4 = -r7
            goto L_0x011f
        L_0x010c:
            r8 = -1
        L_0x010d:
            int r7 = r7 + r8
            if (r7 < 0) goto L_0x011d
            java.lang.Object r11 = r4.get(r7)
            java.lang.Comparable r11 = (java.lang.Comparable) r11
            int r11 = r11.compareTo(r5)
            if (r11 != 0) goto L_0x011d
            goto L_0x010d
        L_0x011d:
            int r4 = r7 + 1
        L_0x011f:
            if (r6 == 0) goto L_0x0126
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L_0x0126:
            int r5 = r2.f63222h
            int r4 = r4 + r5
            if (r4 >= r5) goto L_0x0143
            if (r3 == 0) goto L_0x0143
            s7.a$a[] r2 = r1.f62848d
            r2 = r2[r19]
            s7.e r4 = r1.f62849e
            s7.b r4 = r4.mo35460a(r2)
            int r5 = r3.f62465i
            int r5 = r5 + r13
            r14 = r5
            r8 = r19
            r32 = r4
            r4 = r2
            r2 = r32
            goto L_0x0146
        L_0x0143:
            r14 = r4
            r8 = r10
            r4 = r12
        L_0x0146:
            int r5 = r2.f63222h
            if (r14 >= r5) goto L_0x0153
            p7.f r2 = new p7.f
            r2.<init>()
            r1.f62854j = r2
            goto L_0x0282
        L_0x0153:
            int r5 = r14 - r5
            java.util.List<s7.b$a> r6 = r2.f63229o
            int r6 = r6.size()
            if (r5 < r6) goto L_0x016b
            boolean r2 = r2.f63226l
            if (r2 == 0) goto L_0x0165
            r9.f62865b = r13
            goto L_0x0282
        L_0x0165:
            r9.f62866c = r4
            r1.f62855k = r4
            goto L_0x0282
        L_0x016b:
            java.util.List<s7.b$a> r6 = r2.f63229o
            java.lang.Object r5 = r6.get(r5)
            r15 = r5
            s7.b$a r15 = (p381s7.C22302b.C22303a) r15
            boolean r5 = r15.f63235h
            if (r5 == 0) goto L_0x01dc
            java.lang.String r5 = r2.f63240a
            java.lang.String r6 = r15.f63236i
            android.net.Uri r5 = p333e8.C86466w.m107141c(r5, r6)
            android.net.Uri r6 = r1.f62857m
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x01ca
            java.lang.String r2 = r15.f63237j
            b8.f r3 = r1.f62861q
            int r3 = r3.mo17785j()
            b8.f r4 = r1.f62861q
            java.lang.Object r4 = r4.mo17784i()
            c8.j r6 = new c8.j
            r26 = 0
            r28 = -1
            r30 = 0
            r31 = 1
            r24 = r6
            r25 = r5
            r24.<init>(r25, r26, r28, r30, r31)
            r7.c$a r5 = new r7.c$a
            c8.g r7 = r1.f62846b
            s7.a$a[] r10 = r1.f62848d
            r8 = r10[r8]
            com.google.android.exoplayer2.Format r8 = r8.f63216b
            byte[] r1 = r1.f62853i
            r24 = r5
            r25 = r7
            r26 = r6
            r27 = r8
            r28 = r3
            r29 = r4
            r30 = r1
            r31 = r2
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r9.f62864a = r5
            goto L_0x0282
        L_0x01ca:
            java.lang.String r6 = r15.f63237j
            java.lang.String r7 = r1.f62859o
            boolean r6 = p333e8.C20551y.m22311a(r6, r7)
            if (r6 != 0) goto L_0x01e5
            java.lang.String r6 = r15.f63237j
            byte[] r7 = r1.f62858n
            r1.mo35336a(r5, r6, r7)
            goto L_0x01e5
        L_0x01dc:
            r5 = 0
            r1.f62857m = r5
            r1.f62858n = r5
            r1.f62859o = r5
            r1.f62860p = r5
        L_0x01e5:
            s7.b$a r5 = r2.f63228n
            if (r5 == 0) goto L_0x0204
            java.lang.String r6 = r2.f63240a
            java.lang.String r7 = r5.f63231d
            android.net.Uri r25 = p333e8.C86466w.m107141c(r6, r7)
            c8.j r6 = new c8.j
            long r7 = r5.f63238n
            long r10 = r5.f63239o
            r30 = 0
            r24 = r6
            r26 = r7
            r28 = r10
            r24.<init>(r25, r26, r28, r30)
            r8 = r6
            goto L_0x0205
        L_0x0204:
            r8 = 0
        L_0x0205:
            long r5 = r2.f63219e
            long r10 = r15.f63234g
            long r20 = r5 + r10
            int r5 = r2.f63221g
            int r6 = r15.f63233f
            int r12 = r5 + r6
            r7.k r5 = r1.f62847c
            android.util.SparseArray<e8.u> r6 = r5.f62945a
            java.lang.Object r6 = r6.get(r12)
            e8.u r6 = (p333e8.C20549u) r6
            if (r6 != 0) goto L_0x022c
            e8.u r6 = new e8.u
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.<init>(r10)
            android.util.SparseArray<e8.u> r5 = r5.f62945a
            r5.put(r12, r6)
        L_0x022c:
            r24 = r6
            java.lang.String r2 = r2.f63240a
            java.lang.String r5 = r15.f63231d
            android.net.Uri r26 = p333e8.C86466w.m107141c(r2, r5)
            c8.j r25 = new c8.j
            r7 = r25
            long r5 = r15.f63238n
            long r10 = r15.f63239o
            r31 = 0
            r27 = r5
            r29 = r10
            r25.<init>(r26, r27, r29, r31)
            r7.f r2 = new r7.f
            r5 = r2
            c8.g r6 = r1.f62845a
            java.util.List<com.google.android.exoplayer2.Format> r10 = r1.f62851g
            b8.f r11 = r1.f62861q
            int r11 = r11.mo17785j()
            b8.f r13 = r1.f62861q
            java.lang.Object r13 = r13.mo17784i()
            r25 = r12
            r12 = r13
            r26 = r14
            long r13 = r15.f63232e
            long r15 = r20 + r13
            boolean r13 = r1.f62852h
            r19 = r13
            byte[] r13 = r1.f62858n
            r22 = r13
            byte[] r1 = r1.f62860p
            r23 = r1
            r1 = r9
            r9 = r4
            r4 = r26
            r13 = r20
            r17 = r4
            r18 = r25
            r20 = r24
            r21 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            r1.f62864a = r2
        L_0x0282:
            r7.c$b r1 = r0.f62932o
            boolean r2 = r1.f62865b
            q7.a r3 = r1.f62864a
            s7.a$a r4 = r1.f62866c
            r5 = 0
            r1.f62864a = r5
            r6 = 0
            r1.f62865b = r6
            r1.f62866c = r5
            if (r2 == 0) goto L_0x029f
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f62920F = r1
            r5 = 1
            r0.f62923I = r5
            return r5
        L_0x029f:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 1
            if (r3 != 0) goto L_0x02bc
            if (r4 == 0) goto L_0x02ba
            r7.j$b r1 = r0.f62925e
            r7.g r1 = (p380r7.C22209g) r1
            s7.e r1 = r1.f62892d
            java.util.IdentityHashMap<s7.a$a, s7.e$b> r1 = r1.f63245g
            java.lang.Object r1 = r1.get(r4)
            s7.e$b r1 = (p381s7.C22305e.C22307b) r1
            r1.mo35462b()
        L_0x02ba:
            r1 = 0
            return r1
        L_0x02bc:
            boolean r4 = r3 instanceof p380r7.C22208f
            if (r4 == 0) goto L_0x02ee
            r0.f62920F = r1
            r1 = r3
            r7.f r1 = (p380r7.C22208f) r1
            r1.f62872D = r0
            int r2 = r1.f62875j
            boolean r4 = r1.f62885t
            p7.q[] r6 = r0.f62936s
            int r7 = r6.length
            r8 = 0
        L_0x02cf:
            if (r8 >= r7) goto L_0x02da
            r9 = r6[r8]
            p7.p r9 = r9.f62149c
            r9.f62143r = r2
            int r8 = r8 + 1
            goto L_0x02cf
        L_0x02da:
            if (r4 == 0) goto L_0x02e9
            p7.q[] r2 = r0.f62936s
            int r4 = r2.length
            r6 = 0
        L_0x02e0:
            if (r6 >= r4) goto L_0x02e9
            r7 = r2[r6]
            r7.f62157k = r5
            int r6 = r6 + 1
            goto L_0x02e0
        L_0x02e9:
            java.util.LinkedList<r7.f> r2 = r0.f62933p
            r2.add(r1)
        L_0x02ee:
            c8.u r1 = r0.f62930j
            int r2 = r0.f62929i
            long r18 = r1.mo17937d(r3, r0, r2)
            p7.c$a r7 = r0.f62931n
            c8.j r8 = r3.f62454a
            int r9 = r3.f62455b
            int r10 = r0.f62924d
            com.google.android.exoplayer2.Format r11 = r3.f62456c
            int r12 = r3.f62457d
            java.lang.Object r13 = r3.f62458e
            long r14 = r3.f62459f
            long r1 = r3.f62460g
            p7.c r3 = r7.f61981b
            if (r3 == 0) goto L_0x0319
            android.os.Handler r3 = r7.f61980a
            p7.b r4 = new p7.b
            r6 = r4
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r18)
            r3.post(r4)
        L_0x0319:
            return r5
        L_0x031a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p380r7.C22212j.mo34984b(long):boolean");
    }

    /* renamed from: c */
    public long mo34985c() {
        if (mo35342u()) {
            return this.f62920F;
        }
        if (this.f62923I) {
            return Long.MIN_VALUE;
        }
        return this.f62933p.getLast().f62460g;
    }

    /* renamed from: d */
    public void mo35007d(Format format) {
        this.f62935r.post(this.f62934q);
    }

    /* renamed from: f */
    public void mo17948f() {
        mo35344w();
    }

    /* renamed from: g */
    public void mo17750g(C16748l lVar) {
    }

    /* renamed from: i */
    public void mo17751i() {
        this.f62938u = true;
        this.f62935r.post(this.f62934q);
    }

    /* renamed from: j */
    public void mo17938j(C16876u.C16879c cVar, long j, long j2) {
        C22074a aVar = (C22074a) cVar;
        C22202c cVar2 = this.f62926f;
        cVar2.getClass();
        if (aVar instanceof C22202c.C22203a) {
            C22202c.C22203a aVar2 = (C22202c.C22203a) aVar;
            cVar2.f62853i = aVar2.f62462i;
            cVar2.mo35336a(aVar2.f62454a.f234181a, aVar2.f62862l, aVar2.f62863m);
        }
        this.f62931n.mo34974d(aVar.f62454a, aVar.f62455b, this.f62924d, aVar.f62456c, aVar.f62457d, aVar.f62458e, aVar.f62459f, aVar.f62460g, j, j2, aVar.mo35171d());
        if (!this.f62939v) {
            mo34984b(this.f62919E);
        } else {
            ((C22209g) this.f62925e).mo34988g(this);
        }
    }

    /* renamed from: l */
    public void mo17939l(C16876u.C16879c cVar, long j, long j2, boolean z) {
        C22074a aVar = (C22074a) cVar;
        this.f62931n.mo34972b(aVar.f62454a, aVar.f62455b, this.f62924d, aVar.f62456c, aVar.f62457d, aVar.f62458e, aVar.f62459f, aVar.f62460g, j, j2, aVar.mo35171d());
        if (!z) {
            mo35344w();
            if (this.f62940w > 0) {
                ((C22209g) this.f62925e).mo34988g(this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo17940p(p300c8.C16876u.C16879c r23, long r24, long r26, java.io.IOException r28) {
        /*
            r22 = this;
            r0 = r22
            r14 = r28
            r12 = r23
            q7.a r12 = (p373q7.C22074a) r12
            long r1 = r12.mo35171d()
            boolean r3 = r12 instanceof p380r7.C22208f
            r4 = 1
            r20 = 0
            if (r3 == 0) goto L_0x001c
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = 0
            goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            r7.c r2 = r0.f62926f
            if (r1 == 0) goto L_0x0068
            b8.f r1 = r2.f62861q
            p7.u r2 = r2.f62850f
            com.google.android.exoplayer2.Format r5 = r12.f62456c
            int r2 = r2.mo35036a(r5)
            int r2 = r1.mo17792e(r2)
            boolean r5 = r14 instanceof p300c8.C79958t.C79962d
            if (r5 == 0) goto L_0x0042
            r5 = r14
            c8.t$d r5 = (p300c8.C79958t.C79962d) r5
            int r5 = r5.f234227d
            r6 = 404(0x194, float:5.66E-43)
            if (r5 == r6) goto L_0x0040
            r6 = 410(0x19a, float:5.75E-43)
            if (r5 != r6) goto L_0x0042
        L_0x0040:
            r5 = 1
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            if (r5 == 0) goto L_0x0063
            r5 = 60000(0xea60, double:2.9644E-319)
            boolean r5 = r1.mo17795h(r2, r5)
            r6 = r14
            c8.t$d r6 = (p300c8.C79958t.C79962d) r6
            int r6 = r6.f234227d
            if (r5 == 0) goto L_0x005b
            com.google.android.exoplayer2.Format r1 = r1.mo17791d(r2)
            java.util.Objects.toString(r1)
            goto L_0x0064
        L_0x005b:
            com.google.android.exoplayer2.Format r1 = r1.mo17791d(r2)
            java.util.Objects.toString(r1)
            goto L_0x0064
        L_0x0063:
            r5 = 0
        L_0x0064:
            if (r5 == 0) goto L_0x006b
            r1 = 1
            goto L_0x006c
        L_0x0068:
            r2.getClass()
        L_0x006b:
            r1 = 0
        L_0x006c:
            if (r1 == 0) goto L_0x008f
            if (r3 == 0) goto L_0x008c
            java.util.LinkedList<r7.f> r1 = r0.f62933p
            java.lang.Object r1 = r1.removeLast()
            r7.f r1 = (p380r7.C22208f) r1
            if (r1 != r12) goto L_0x007c
            r1 = 1
            goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            p333e8.C20528a.m22240d(r1)
            java.util.LinkedList<r7.f> r1 = r0.f62933p
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x008c
            long r1 = r0.f62919E
            r0.f62920F = r1
        L_0x008c:
            r21 = 1
            goto L_0x0091
        L_0x008f:
            r21 = 0
        L_0x0091:
            p7.c$a r1 = r0.f62931n
            c8.j r2 = r12.f62454a
            int r3 = r12.f62455b
            int r4 = r0.f62924d
            com.google.android.exoplayer2.Format r5 = r12.f62456c
            int r6 = r12.f62457d
            java.lang.Object r7 = r12.f62458e
            long r8 = r12.f62459f
            long r10 = r12.f62460g
            long r16 = r12.mo35171d()
            r12 = r24
            r14 = r26
            r18 = r28
            r19 = r21
            r1.mo34976f(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r16, r18, r19)
            if (r21 == 0) goto L_0x00c7
            boolean r1 = r0.f62939v
            if (r1 != 0) goto L_0x00be
            long r1 = r0.f62919E
            r0.mo34984b(r1)
            goto L_0x00c5
        L_0x00be:
            r7.j$b r1 = r0.f62925e
            r7.g r1 = (p380r7.C22209g) r1
            r1.mo34988g(r0)
        L_0x00c5:
            r20 = 2
        L_0x00c7:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: p380r7.C22212j.mo17940p(c8.u$c, long, long, java.io.IOException):int");
    }

    /* renamed from: u */
    public final boolean mo35342u() {
        return this.f62920F != -9223372036854775807L;
    }

    /* renamed from: v */
    public final void mo35343v() {
        if (!this.f62942y && !this.f62939v && this.f62938u) {
            C21954q[] qVarArr = this.f62936s;
            int length = qVarArr.length;
            int i = 0;
            while (i < length) {
                if (qVarArr[i].mo35030i() != null) {
                    i++;
                } else {
                    return;
                }
            }
            int length2 = this.f62936s.length;
            int i2 = 0;
            char c = 0;
            int i3 = -1;
            while (true) {
                char c2 = 3;
                if (i2 >= length2) {
                    break;
                }
                String str = this.f62936s[i2].mo35030i().f45777i;
                if (!C20536j.m22253e(str)) {
                    c2 = C20536j.m22252d(str) ? 2 : MimeTypes.BASE_TYPE_TEXT.equals(C20536j.m22250b(str)) ? (char) 1 : 0;
                }
                if (c2 > c) {
                    i3 = i2;
                    c = c2;
                } else if (c2 == c && i3 != -1) {
                    i3 = -1;
                }
                i2++;
            }
            C21961u uVar = this.f62926f.f62850f;
            int i4 = uVar.f62173a;
            this.f62915A = -1;
            this.f62917C = new boolean[length2];
            this.f62918D = new boolean[length2];
            C21961u[] uVarArr = new C21961u[length2];
            for (int i5 = 0; i5 < length2; i5++) {
                Format i6 = this.f62936s[i5].mo35030i();
                String str2 = i6.f45777i;
                boolean z = C20536j.m22253e(str2) || C20536j.m22252d(str2);
                this.f62918D[i5] = z;
                this.f62916B = z | this.f62916B;
                if (i5 == i3) {
                    Format[] formatArr = new Format[i4];
                    for (int i7 = 0; i7 < i4; i7++) {
                        formatArr[i7] = m25696s(uVar.f62174b[i7], i6);
                    }
                    uVarArr[i5] = new C21961u(formatArr);
                    this.f62915A = i5;
                } else {
                    uVarArr[i5] = new C21961u(m25696s((c != 3 || !C20536j.m22252d(i6.f45777i)) ? null : this.f62928h, i6));
                }
            }
            this.f62943z = new C21962v(uVarArr);
            this.f62939v = true;
            C22209g gVar = (C22209g) this.f62925e;
            int i8 = gVar.f62901p - 1;
            gVar.f62901p = i8;
            if (i8 <= 0) {
                int i9 = 0;
                for (C22212j jVar : gVar.f62903r) {
                    i9 += jVar.f62943z.f62177a;
                }
                C21961u[] uVarArr2 = new C21961u[i9];
                int i15 = 0;
                for (C22212j jVar2 : gVar.f62903r) {
                    int i16 = jVar2.f62943z.f62177a;
                    int i17 = 0;
                    while (i17 < i16) {
                        uVarArr2[i15] = jVar2.f62943z.f62178b[i17];
                        i17++;
                        i15++;
                    }
                }
                gVar.f62902q = new C21962v(uVarArr2);
                gVar.f62900o.mo34987f(gVar);
            }
        }
    }

    /* renamed from: w */
    public final void mo35344w() {
        for (C21954q m : this.f62936s) {
            m.mo35034m(this.f62921G);
        }
        this.f62921G = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r10 = false;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo35345x(long r8, boolean r10) {
        /*
            r7 = this;
            r7.f62919E = r8
            r0 = 1
            r1 = 0
            if (r10 != 0) goto L_0x0048
            boolean r10 = r7.mo35342u()
            if (r10 != 0) goto L_0x0048
            p7.q[] r10 = r7.f62936s
            int r10 = r10.length
            r2 = 0
        L_0x0010:
            if (r2 >= r10) goto L_0x0044
            p7.q[] r3 = r7.f62936s
            r3 = r3[r2]
            r3.mo35035n()
            boolean r4 = r3.mo35026e(r8, r0, r1)
            if (r4 != 0) goto L_0x002b
            boolean[] r4 = r7.f62918D
            boolean r4 = r4[r2]
            if (r4 != 0) goto L_0x0029
            boolean r4 = r7.f62916B
            if (r4 != 0) goto L_0x002b
        L_0x0029:
            r10 = 0
            goto L_0x0045
        L_0x002b:
            p7.p r4 = r3.f62149c
            monitor-enter(r4)
            int r5 = r4.f62137l     // Catch:{ all -> 0x0041 }
            if (r5 != 0) goto L_0x0036
            r5 = -1
            monitor-exit(r4)
            goto L_0x003b
        L_0x0036:
            long r5 = r4.mo35020a(r5)     // Catch:{ all -> 0x0041 }
            monitor-exit(r4)
        L_0x003b:
            r3.mo35027f(r5)
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0041:
            r8 = move-exception
            monitor-exit(r4)
            throw r8
        L_0x0044:
            r10 = 1
        L_0x0045:
            if (r10 == 0) goto L_0x0048
            return r1
        L_0x0048:
            r7.f62920F = r8
            r7.f62923I = r1
            java.util.LinkedList<r7.f> r8 = r7.f62933p
            r8.clear()
            c8.u r8 = r7.f62930j
            boolean r8 = r8.mo17934a()
            if (r8 == 0) goto L_0x0061
            c8.u r8 = r7.f62930j
            c8.u$b<? extends c8.u$c> r8 = r8.f45618b
            r8.mo17941a(r1)
            goto L_0x0064
        L_0x0061:
            r7.mo35344w()
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p380r7.C22212j.mo35345x(long, boolean):boolean");
    }

    /* renamed from: y */
    public C21954q mo17752o(int i, int i2) {
        int length = this.f62936s.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f62937t[i3] == i) {
                return this.f62936s[i3];
            }
        }
        C21954q qVar = new C21954q(this.f62927g);
        qVar.f62158l = this;
        int i4 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f62937t, i4);
        this.f62937t = copyOf;
        copyOf[length] = i;
        C21954q[] qVarArr = (C21954q[]) Arrays.copyOf(this.f62936s, i4);
        this.f62936s = qVarArr;
        qVarArr[length] = qVar;
        return qVar;
    }
}
