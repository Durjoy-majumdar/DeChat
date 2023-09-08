package p345h7;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.tencent.xweb.util.WXWebReporter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p294b7.C16738b;
import p294b7.C16741e;
import p294b7.C16742f;
import p294b7.C16743g;
import p294b7.C16748l;
import p333e8.C20540l;
import p333e8.C20541m;
import p333e8.C20549u;
import p333e8.C20551y;
import p345h7.C20923v;

/* renamed from: h7.u */
public final class C20920u implements C16741e {

    /* renamed from: l */
    public static final long f59251l = ((long) C20551y.m22316f("AC-3"));

    /* renamed from: m */
    public static final long f59252m = ((long) C20551y.m22316f("EAC3"));

    /* renamed from: n */
    public static final long f59253n = ((long) C20551y.m22316f("HEVC"));

    /* renamed from: a */
    public final int f59254a;

    /* renamed from: b */
    public final List<C20549u> f59255b;

    /* renamed from: c */
    public final C20541m f59256c;

    /* renamed from: d */
    public final SparseIntArray f59257d;

    /* renamed from: e */
    public final C20923v.C20926c f59258e;

    /* renamed from: f */
    public final SparseArray<C20923v> f59259f;

    /* renamed from: g */
    public final SparseBooleanArray f59260g;

    /* renamed from: h */
    public C16743g f59261h;

    /* renamed from: i */
    public int f59262i;

    /* renamed from: j */
    public boolean f59263j;

    /* renamed from: k */
    public C20923v f59264k;

    /* renamed from: h7.u$a */
    public class C20921a implements C20916q {

        /* renamed from: a */
        public final C20540l f59265a = new C20540l(new byte[4], 4);

        public C20921a() {
        }

        /* renamed from: a */
        public void mo32630a(C20541m mVar) {
            if (mVar.mo32103n() == 0) {
                mVar.mo32114y(7);
                int i = (mVar.f57811c - mVar.f57810b) / 4;
                for (int i2 = 0; i2 < i; i2++) {
                    C20540l lVar = this.f59265a;
                    mVar.mo32091b(lVar.f57805a, 0, 4);
                    lVar.mo32088e(0);
                    int d = this.f59265a.mo32087d(16);
                    this.f59265a.mo32089f(3);
                    if (d == 0) {
                        this.f59265a.mo32089f(13);
                    } else {
                        int d2 = this.f59265a.mo32087d(13);
                        C20920u uVar = C20920u.this;
                        uVar.f59259f.put(d2, new C20917r(new C20922b(d2)));
                        C20920u.this.f59262i++;
                    }
                }
                C20920u uVar2 = C20920u.this;
                if (uVar2.f59254a != 2) {
                    uVar2.f59259f.remove(0);
                }
            }
        }

        /* renamed from: c */
        public void mo32631c(C20549u uVar, C16743g gVar, C20923v.C20927d dVar) {
        }
    }

    /* renamed from: h7.u$b */
    public class C20922b implements C20916q {

        /* renamed from: a */
        public final C20540l f59267a = new C20540l(new byte[5], 5);

        /* renamed from: b */
        public final SparseArray<C20923v> f59268b = new SparseArray<>();

        /* renamed from: c */
        public final SparseIntArray f59269c = new SparseIntArray();

        /* renamed from: d */
        public final int f59270d;

        public C20922b(int i) {
            this.f59270d = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:71:0x01d3  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x01dd A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo32630a(p333e8.C20541m r24) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                int r2 = r24.mo32103n()
                r3 = 2
                if (r2 == r3) goto L_0x000c
                return
            L_0x000c:
                h7.u r2 = p345h7.C20920u.this
                int r4 = r2.f59254a
                r5 = 1
                r6 = 0
                if (r4 == r5) goto L_0x0032
                if (r4 == r3) goto L_0x0032
                int r4 = r2.f59262i
                if (r4 != r5) goto L_0x001b
                goto L_0x0032
            L_0x001b:
                e8.u r4 = new e8.u
                java.util.List<e8.u> r2 = r2.f59255b
                java.lang.Object r2 = r2.get(r6)
                e8.u r2 = (p333e8.C20549u) r2
                long r7 = r2.f57832a
                r4.<init>(r7)
                h7.u r2 = p345h7.C20920u.this
                java.util.List<e8.u> r2 = r2.f59255b
                r2.add(r4)
                goto L_0x003b
            L_0x0032:
                java.util.List<e8.u> r2 = r2.f59255b
                java.lang.Object r2 = r2.get(r6)
                r4 = r2
                e8.u r4 = (p333e8.C20549u) r4
            L_0x003b:
                r1.mo32114y(r3)
                int r2 = r24.mo32108s()
                r7 = 5
                r1.mo32114y(r7)
                e8.l r8 = r0.f59267a
                byte[] r9 = r8.f57805a
                r1.mo32091b(r9, r6, r3)
                r8.mo32088e(r6)
                e8.l r8 = r0.f59267a
                r9 = 4
                r8.mo32089f(r9)
                e8.l r8 = r0.f59267a
                r10 = 12
                int r8 = r8.mo32087d(r10)
                r1.mo32114y(r8)
                h7.u r8 = p345h7.C20920u.this
                int r11 = r8.f59254a
                r12 = 21
                r13 = 0
                r14 = 8192(0x2000, float:1.14794E-41)
                if (r11 != r3) goto L_0x008f
                h7.v r8 = r8.f59264k
                if (r8 != 0) goto L_0x008f
                h7.v$b r8 = new h7.v$b
                byte[] r11 = new byte[r6]
                r8.<init>(r12, r13, r13, r11)
                h7.u r11 = p345h7.C20920u.this
                h7.v$c r15 = r11.f59258e
                h7.v r8 = r15.mo32615a(r12, r8)
                r11.f59264k = r8
                h7.u r8 = p345h7.C20920u.this
                h7.v r11 = r8.f59264k
                b7.g r8 = r8.f59261h
                h7.v$d r15 = new h7.v$d
                r15.<init>(r2, r12, r14)
                r11.mo32628c(r4, r8, r15)
            L_0x008f:
                android.util.SparseArray<h7.v> r8 = r0.f59268b
                r8.clear()
                android.util.SparseIntArray r8 = r0.f59269c
                r8.clear()
                int r8 = r1.f57811c
                int r11 = r1.f57810b
                int r8 = r8 - r11
            L_0x009e:
                if (r8 <= 0) goto L_0x01ed
                e8.l r15 = r0.f59267a
                byte[] r13 = r15.f57805a
                r1.mo32091b(r13, r6, r7)
                r15.mo32088e(r6)
                e8.l r13 = r0.f59267a
                r15 = 8
                int r13 = r13.mo32087d(r15)
                e8.l r15 = r0.f59267a
                r11 = 3
                r15.mo32089f(r11)
                e8.l r15 = r0.f59267a
                r5 = 13
                int r5 = r15.mo32087d(r5)
                e8.l r15 = r0.f59267a
                r15.mo32089f(r9)
                e8.l r15 = r0.f59267a
                int r15 = r15.mo32087d(r10)
                int r10 = r1.f57810b
                int r14 = r15 + r10
                r3 = 0
                r12 = -1
                r17 = 0
            L_0x00d3:
                int r6 = r1.f57810b
                if (r6 >= r14) goto L_0x017f
                int r6 = r24.mo32103n()
                int r16 = r24.mo32103n()
                int r9 = r1.f57810b
                int r9 = r9 + r16
                r11 = 89
                if (r6 != r7) goto L_0x010c
                long r19 = r24.mo32104o()
                long r21 = p345h7.C20920u.f59251l
                int r6 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r6 != 0) goto L_0x00f2
                goto L_0x0110
            L_0x00f2:
                long r21 = p345h7.C20920u.f59252m
                int r6 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r6 != 0) goto L_0x00f9
                goto L_0x011c
            L_0x00f9:
                long r21 = p345h7.C20920u.f59253n
                int r6 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r6 != 0) goto L_0x0108
                r6 = 36
                r18 = r4
                r7 = 4
                r12 = 36
                goto L_0x0172
            L_0x0108:
                r18 = r4
                r7 = 4
                goto L_0x0172
            L_0x010c:
                r7 = 106(0x6a, float:1.49E-43)
                if (r6 != r7) goto L_0x0118
            L_0x0110:
                r6 = 129(0x81, float:1.81E-43)
                r18 = r4
                r7 = 4
                r12 = 129(0x81, float:1.81E-43)
                goto L_0x0172
            L_0x0118:
                r7 = 122(0x7a, float:1.71E-43)
                if (r6 != r7) goto L_0x0124
            L_0x011c:
                r6 = 135(0x87, float:1.89E-43)
                r18 = r4
                r7 = 4
                r12 = 135(0x87, float:1.89E-43)
                goto L_0x0172
            L_0x0124:
                r7 = 123(0x7b, float:1.72E-43)
                if (r6 != r7) goto L_0x0130
                r6 = 138(0x8a, float:1.93E-43)
                r18 = r4
                r7 = 4
                r12 = 138(0x8a, float:1.93E-43)
                goto L_0x0172
            L_0x0130:
                r7 = 10
                if (r6 != r7) goto L_0x013e
                r7 = 3
                java.lang.String r6 = r1.mo32101l(r7)
                java.lang.String r17 = r6.trim()
                goto L_0x0108
            L_0x013e:
                r7 = 3
                if (r6 != r11) goto L_0x0108
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L_0x0146:
                int r6 = r1.f57810b
                if (r6 >= r9) goto L_0x016d
                java.lang.String r6 = r1.mo32101l(r7)
                java.lang.String r6 = r6.trim()
                int r12 = r24.mo32103n()
                r7 = 4
                byte[] r11 = new byte[r7]
                r18 = r4
                r4 = 0
                r1.mo32091b(r11, r4, r7)
                h7.v$a r4 = new h7.v$a
                r4.<init>(r6, r12, r11)
                r3.add(r4)
                r4 = r18
                r7 = 3
                r11 = 89
                goto L_0x0146
            L_0x016d:
                r18 = r4
                r7 = 4
                r12 = 89
            L_0x0172:
                int r4 = r1.f57810b
                int r9 = r9 - r4
                r1.mo32114y(r9)
                r4 = r18
                r7 = 5
                r9 = 4
                r11 = 3
                goto L_0x00d3
            L_0x017f:
                r18 = r4
                r7 = 4
                r1.mo32113x(r14)
                h7.v$b r4 = new h7.v$b
                byte[] r6 = r1.f57809a
                byte[] r6 = java.util.Arrays.copyOfRange(r6, r10, r14)
                r9 = r17
                r4.<init>(r12, r9, r3, r6)
                r3 = 6
                if (r13 != r3) goto L_0x0196
                r13 = r12
            L_0x0196:
                int r15 = r15 + 5
                int r8 = r8 - r15
                h7.u r3 = p345h7.C20920u.this
                int r6 = r3.f59254a
                r9 = 2
                if (r6 != r9) goto L_0x01a2
                r6 = r13
                goto L_0x01a3
            L_0x01a2:
                r6 = r5
            L_0x01a3:
                android.util.SparseBooleanArray r3 = r3.f59260g
                boolean r3 = r3.get(r6)
                if (r3 == 0) goto L_0x01ae
                r10 = 21
                goto L_0x01dd
            L_0x01ae:
                h7.u r3 = p345h7.C20920u.this
                int r10 = r3.f59254a
                if (r10 != r9) goto L_0x01bb
                r10 = 21
                if (r13 != r10) goto L_0x01bd
                h7.v r3 = r3.f59264k
                goto L_0x01c3
            L_0x01bb:
                r10 = 21
            L_0x01bd:
                h7.v$c r3 = r3.f59258e
                h7.v r3 = r3.mo32615a(r13, r4)
            L_0x01c3:
                h7.u r4 = p345h7.C20920u.this
                int r4 = r4.f59254a
                if (r4 != r9) goto L_0x01d3
                android.util.SparseIntArray r4 = r0.f59269c
                r9 = 8192(0x2000, float:1.14794E-41)
                int r4 = r4.get(r6, r9)
                if (r5 >= r4) goto L_0x01dd
            L_0x01d3:
                android.util.SparseIntArray r4 = r0.f59269c
                r4.put(r6, r5)
                android.util.SparseArray<h7.v> r4 = r0.f59268b
                r4.put(r6, r3)
            L_0x01dd:
                r4 = r18
                r3 = 2
                r5 = 1
                r6 = 0
                r7 = 5
                r9 = 4
                r10 = 12
                r12 = 21
                r13 = 0
                r14 = 8192(0x2000, float:1.14794E-41)
                goto L_0x009e
            L_0x01ed:
                r18 = r4
                android.util.SparseIntArray r1 = r0.f59269c
                int r1 = r1.size()
                r4 = 0
            L_0x01f6:
                if (r4 >= r1) goto L_0x0240
                android.util.SparseIntArray r3 = r0.f59269c
                int r3 = r3.keyAt(r4)
                h7.u r5 = p345h7.C20920u.this
                android.util.SparseBooleanArray r5 = r5.f59260g
                r6 = 1
                r5.put(r3, r6)
                android.util.SparseArray<h7.v> r5 = r0.f59268b
                java.lang.Object r5 = r5.valueAt(r4)
                h7.v r5 = (p345h7.C20923v) r5
                if (r5 == 0) goto L_0x0237
                h7.u r6 = p345h7.C20920u.this
                h7.v r7 = r6.f59264k
                if (r5 == r7) goto L_0x0225
                b7.g r6 = r6.f59261h
                h7.v$d r7 = new h7.v$d
                r8 = 8192(0x2000, float:1.14794E-41)
                r7.<init>(r2, r3, r8)
                r3 = r18
                r5.mo32628c(r3, r6, r7)
                goto L_0x0229
            L_0x0225:
                r3 = r18
                r8 = 8192(0x2000, float:1.14794E-41)
            L_0x0229:
                h7.u r6 = p345h7.C20920u.this
                android.util.SparseArray<h7.v> r6 = r6.f59259f
                android.util.SparseIntArray r7 = r0.f59269c
                int r7 = r7.valueAt(r4)
                r6.put(r7, r5)
                goto L_0x023b
            L_0x0237:
                r3 = r18
                r8 = 8192(0x2000, float:1.14794E-41)
            L_0x023b:
                int r4 = r4 + 1
                r18 = r3
                goto L_0x01f6
            L_0x0240:
                h7.u r1 = p345h7.C20920u.this
                int r2 = r1.f59254a
                r3 = 2
                if (r2 != r3) goto L_0x0259
                boolean r2 = r1.f59263j
                if (r2 != 0) goto L_0x027c
                b7.g r1 = r1.f59261h
                r1.mo17751i()
                h7.u r1 = p345h7.C20920u.this
                r2 = 0
                r1.f59262i = r2
                r3 = 1
                r1.f59263j = r3
                goto L_0x027c
            L_0x0259:
                r2 = 0
                r3 = 1
                android.util.SparseArray<h7.v> r1 = r1.f59259f
                int r4 = r0.f59270d
                r1.remove(r4)
                h7.u r1 = p345h7.C20920u.this
                int r4 = r1.f59254a
                if (r4 != r3) goto L_0x026a
                r6 = 0
                goto L_0x026f
            L_0x026a:
                int r2 = r1.f59262i
                r4 = -1
                int r6 = r2 + -1
            L_0x026f:
                r1.f59262i = r6
                if (r6 != 0) goto L_0x027c
                b7.g r1 = r1.f59261h
                r1.mo17751i()
                h7.u r1 = p345h7.C20920u.this
                r1.f59263j = r3
            L_0x027c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p345h7.C20920u.C20922b.mo32630a(e8.m):void");
        }

        /* renamed from: c */
        public void mo32631c(C20549u uVar, C16743g gVar, C20923v.C20927d dVar) {
        }
    }

    public C20920u(int i, int i2) {
        this(i, new C20549u(0), new C20898e(i2, Collections.emptyList()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009b, code lost:
        if (r10 != ((r7 + 1) & 15)) goto L_0x009f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo17745a(p294b7.C16742f r10, p294b7.C16747k r11) {
        /*
            r9 = this;
            e8.m r11 = r9.f59256c
            byte[] r0 = r11.f57809a
            int r1 = r11.f57810b
            int r2 = 9400 - r1
            r3 = 188(0xbc, float:2.63E-43)
            r4 = 0
            if (r2 >= r3) goto L_0x001a
            int r11 = r11.f57811c
            int r11 = r11 - r1
            if (r11 <= 0) goto L_0x0015
            java.lang.System.arraycopy(r0, r1, r0, r4, r11)
        L_0x0015:
            e8.m r1 = r9.f59256c
            r1.mo32111v(r0, r11)
        L_0x001a:
            e8.m r11 = r9.f59256c
            int r1 = r11.f57811c
            int r11 = r11.f57810b
            int r2 = r1 - r11
            if (r2 >= r3) goto L_0x0038
            int r11 = 9400 - r1
            r2 = r10
            b7.b r2 = (p294b7.C16738b) r2
            int r11 = r2.mo17735c(r0, r1, r11)
            r2 = -1
            if (r11 != r2) goto L_0x0031
            return r2
        L_0x0031:
            e8.m r2 = r9.f59256c
            int r1 = r1 + r11
            r2.mo32112w(r1)
            goto L_0x001a
        L_0x0038:
            if (r11 >= r1) goto L_0x0043
            byte r10 = r0[r11]
            r2 = 71
            if (r10 == r2) goto L_0x0043
            int r11 = r11 + 1
            goto L_0x0038
        L_0x0043:
            e8.m r10 = r9.f59256c
            r10.mo32113x(r11)
            int r11 = r11 + r3
            if (r11 <= r1) goto L_0x004c
            return r4
        L_0x004c:
            e8.m r10 = r9.f59256c
            int r10 = r10.mo32092c()
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r10
            if (r0 == 0) goto L_0x005d
            e8.m r10 = r9.f59256c
            r10.mo32113x(r11)
            return r4
        L_0x005d:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r10
            r2 = 1
            if (r0 == 0) goto L_0x0065
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            r3 = 2096896(0x1fff00, float:2.938377E-39)
            r3 = r3 & r10
            int r3 = r3 >> 8
            r5 = r10 & 32
            if (r5 == 0) goto L_0x0072
            r5 = 1
            goto L_0x0073
        L_0x0072:
            r5 = 0
        L_0x0073:
            r6 = r10 & 16
            if (r6 == 0) goto L_0x0079
            r6 = 1
            goto L_0x007a
        L_0x0079:
            r6 = 0
        L_0x007a:
            int r7 = r9.f59254a
            r8 = 2
            if (r7 == r8) goto L_0x009e
            r10 = r10 & 15
            android.util.SparseIntArray r7 = r9.f59257d
            int r8 = r10 + -1
            int r7 = r7.get(r3, r8)
            android.util.SparseIntArray r8 = r9.f59257d
            r8.put(r3, r10)
            if (r7 != r10) goto L_0x0098
            if (r6 == 0) goto L_0x009e
            e8.m r10 = r9.f59256c
            r10.mo32113x(r11)
            return r4
        L_0x0098:
            int r7 = r7 + r2
            r7 = r7 & 15
            if (r10 == r7) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r2 = 0
        L_0x009f:
            if (r5 == 0) goto L_0x00ac
            e8.m r10 = r9.f59256c
            int r10 = r10.mo32103n()
            e8.m r5 = r9.f59256c
            r5.mo32114y(r10)
        L_0x00ac:
            if (r6 == 0) goto L_0x00cc
            android.util.SparseArray<h7.v> r10 = r9.f59259f
            java.lang.Object r10 = r10.get(r3)
            h7.v r10 = (p345h7.C20923v) r10
            if (r10 == 0) goto L_0x00cc
            if (r2 == 0) goto L_0x00bd
            r10.mo32627b()
        L_0x00bd:
            e8.m r2 = r9.f59256c
            r2.mo32112w(r11)
            e8.m r2 = r9.f59256c
            r10.mo32626a(r2, r0)
            e8.m r10 = r9.f59256c
            r10.mo32112w(r1)
        L_0x00cc:
            e8.m r10 = r9.f59256c
            r10.mo32113x(r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p345h7.C20920u.mo17745a(b7.f, b7.k):int");
    }

    /* renamed from: b */
    public void mo17746b(long j, long j2) {
        int size = this.f59255b.size();
        for (int i = 0; i < size; i++) {
            this.f59255b.get(i).f57834c = -9223372036854775807L;
        }
        this.f59256c.mo32109t();
        this.f59257d.clear();
        mo32633d();
    }

    /* renamed from: c */
    public boolean mo17747c(C16742f fVar) {
        byte[] bArr = this.f59256c.f57809a;
        ((C16738b) fVar).mo17734b(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 != 5) {
                if (bArr[(i2 * WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            ((C16738b) fVar).mo17738f(i);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo32633d() {
        this.f59260g.clear();
        this.f59259f.clear();
        SparseArray<C20923v> b = this.f59258e.mo32616b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            this.f59259f.put(b.keyAt(i), b.valueAt(i));
        }
        this.f59259f.put(0, new C20917r(new C20921a()));
        this.f59264k = null;
    }

    /* renamed from: e */
    public void mo17748e(C16743g gVar) {
        this.f59261h = gVar;
        gVar.mo17750g(new C16748l.C16749a(-9223372036854775807L));
    }

    public void release() {
    }

    public C20920u(int i, C20549u uVar, C20923v.C20926c cVar) {
        cVar.getClass();
        this.f59258e = cVar;
        this.f59254a = i;
        if (i == 1 || i == 2) {
            this.f59255b = Collections.singletonList(uVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f59255b = arrayList;
            arrayList.add(uVar);
        }
        this.f59256c = new C20541m(9400);
        this.f59260g = new SparseBooleanArray();
        this.f59259f = new SparseArray<>();
        this.f59257d = new SparseIntArray();
        mo32633d();
    }
}
