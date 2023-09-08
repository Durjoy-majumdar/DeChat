package p380r7;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import p300c8.C16870b;
import p333e8.C20528a;
import p370p7.C21920c;
import p370p7.C21932i;
import p370p7.C21947n;
import p370p7.C21957r;
import p370p7.C21958s;
import p370p7.C21962v;
import p380r7.C22212j;
import p381s7.C22300a;
import p381s7.C22305e;

/* renamed from: r7.g */
public final class C22209g implements C21947n, C22212j.C22214b, C22305e.C22308c {

    /* renamed from: d */
    public final C22305e f62892d;

    /* renamed from: e */
    public final C22206d f62893e;

    /* renamed from: f */
    public final int f62894f;

    /* renamed from: g */
    public final C21920c.C21921a f62895g;

    /* renamed from: h */
    public final C16870b f62896h;

    /* renamed from: i */
    public final IdentityHashMap<C21957r, Integer> f62897i = new IdentityHashMap<>();

    /* renamed from: j */
    public final C22215k f62898j = new C22215k();

    /* renamed from: n */
    public final Handler f62899n = new Handler();

    /* renamed from: o */
    public C21947n.C21948a f62900o;

    /* renamed from: p */
    public int f62901p;

    /* renamed from: q */
    public C21962v f62902q;

    /* renamed from: r */
    public C22212j[] f62903r = new C22212j[0];

    /* renamed from: s */
    public C22212j[] f62904s = new C22212j[0];

    /* renamed from: t */
    public C21932i f62905t;

    public C22209g(C22305e eVar, C22206d dVar, int i, C21920c.C21921a aVar, C16870b bVar) {
        this.f62892d = eVar;
        this.f62893e = dVar;
        this.f62894f = i;
        this.f62895g = aVar;
        this.f62896h = bVar;
    }

    /* renamed from: j */
    public static boolean m25674j(C22300a.C22301a aVar, String str) {
        String str2 = aVar.f63216b.f45774f;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String startsWith : str2.split("(\\s*,\\s*)|(\\s*$)")) {
            if (startsWith.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public long mo34983a() {
        return this.f62905t.mo34983a();
    }

    /* renamed from: b */
    public boolean mo34984b(long j) {
        return this.f62905t.mo34984b(j);
    }

    /* renamed from: c */
    public long mo34985c() {
        return this.f62905t.mo34985c();
    }

    /* renamed from: d */
    public void mo35339d(C22300a.C22301a aVar, long j) {
        int e;
        for (C22212j jVar : this.f62903r) {
            C22202c cVar = jVar.f62926f;
            int a = cVar.f62850f.mo35036a(aVar.f63216b);
            if (!(a == -1 || (e = cVar.f62861q.mo17792e(a)) == -1)) {
                cVar.f62861q.mo17795h(e, j);
            }
        }
        if (this.f62902q != null) {
            this.f62900o.mo34988g(this);
            return;
        }
        for (C22212j jVar2 : this.f62903r) {
            if (!jVar2.f62939v) {
                jVar2.mo34984b(jVar2.f62919E);
            }
        }
    }

    /* renamed from: e */
    public long mo34986e(long j) {
        C22212j[] jVarArr = this.f62904s;
        if (jVarArr.length > 0) {
            boolean x = jVarArr[0].mo35345x(j, false);
            int i = 1;
            while (true) {
                C22212j[] jVarArr2 = this.f62904s;
                if (i >= jVarArr2.length) {
                    break;
                }
                jVarArr2[i].mo35345x(j, x);
                i++;
            }
            if (x) {
                this.f62898j.f62945a.clear();
            }
        }
        return j;
    }

    /* renamed from: g */
    public void mo34988g(C21958s sVar) {
        C22212j jVar = (C22212j) sVar;
        if (this.f62902q != null) {
            this.f62900o.mo34988g(this);
        }
    }

    /* renamed from: h */
    public void mo34989h(C21947n.C21948a aVar, long j) {
        this.f62900o = aVar;
        ((ArrayList) this.f62892d.f63248j).add(this);
        C22300a aVar2 = this.f62892d.f63251p;
        ArrayList arrayList = new ArrayList(aVar2.f63210c);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C22300a.C22301a aVar3 = (C22300a.C22301a) arrayList.get(i);
            if (aVar3.f63216b.f45782q > 0 || m25674j(aVar3, "avc")) {
                arrayList2.add(aVar3);
            } else if (m25674j(aVar3, "mp4a")) {
                arrayList3.add(aVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List<C22300a.C22301a> list = aVar2.f63211d;
        List<C22300a.C22301a> list2 = aVar2.f63212e;
        int size = list.size() + 1 + list2.size();
        this.f62903r = new C22212j[size];
        this.f62901p = size;
        C20528a.m22237a(!arrayList.isEmpty());
        C22300a.C22301a[] aVarArr = new C22300a.C22301a[arrayList.size()];
        arrayList.toArray(aVarArr);
        C22212j i2 = mo35340i(0, aVarArr, aVar2.f63213f, aVar2.f63214g, j);
        this.f62903r[0] = i2;
        i2.f62926f.f62852h = true;
        if (!i2.f62939v) {
            i2.mo34984b(i2.f62919E);
        }
        int i3 = 0;
        int i4 = 1;
        while (i3 < list.size()) {
            C22212j i5 = mo35340i(1, new C22300a.C22301a[]{list.get(i3)}, (Format) null, Collections.emptyList(), j);
            int i6 = i4 + 1;
            this.f62903r[i4] = i5;
            if (!i5.f62939v) {
                i5.mo34984b(i5.f62919E);
            }
            i3++;
            i4 = i6;
        }
        int i7 = 0;
        while (i7 < list2.size()) {
            C22300a.C22301a aVar4 = list2.get(i7);
            C22212j i8 = mo35340i(3, new C22300a.C22301a[]{aVar4}, (Format) null, Collections.emptyList(), j);
            i8.mo17752o(0, -1).mo17741a(aVar4.f63216b);
            i8.f62938u = true;
            i8.mo35343v();
            this.f62903r[i4] = i8;
            i7++;
            i4++;
        }
        this.f62904s = this.f62903r;
    }

    /* renamed from: i */
    public final C22212j mo35340i(int i, C22300a.C22301a[] aVarArr, Format format, List<Format> list, long j) {
        C22202c cVar = new C22202c(this.f62892d, aVarArr, this.f62893e, this.f62898j, list);
        return new C22212j(i, this, cVar, this.f62896h, j, format, this.f62894f, this.f62895g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0238, code lost:
        if (r7 == r0[0]) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00de, code lost:
        if (r3 != r7.f62919E) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c5  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo34990k(p295b8.C16772f[] r27, boolean[] r28, p370p7.C21957r[] r29, boolean[] r30, long r31) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r29
            r3 = r31
            int r5 = r1.length
            int[] r5 = new int[r5]
            int r6 = r1.length
            int[] r6 = new int[r6]
            r8 = 0
        L_0x000f:
            int r9 = r1.length
            r10 = -1
            if (r8 >= r9) goto L_0x004a
            r9 = r2[r8]
            if (r9 != 0) goto L_0x0019
            r9 = -1
            goto L_0x0025
        L_0x0019:
            java.util.IdentityHashMap<p7.r, java.lang.Integer> r11 = r0.f62897i
            java.lang.Object r9 = r11.get(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
        L_0x0025:
            r5[r8] = r9
            r6[r8] = r10
            r9 = r1[r8]
            if (r9 == 0) goto L_0x0047
            p7.u r9 = r9.mo17794f()
            r11 = 0
        L_0x0032:
            r7.j[] r12 = r0.f62903r
            int r13 = r12.length
            if (r11 >= r13) goto L_0x0047
            r12 = r12[r11]
            p7.v r12 = r12.f62943z
            int r12 = r12.mo35039a(r9)
            if (r12 == r10) goto L_0x0044
            r6[r8] = r11
            goto L_0x0047
        L_0x0044:
            int r11 = r11 + 1
            goto L_0x0032
        L_0x0047:
            int r8 = r8 + 1
            goto L_0x000f
        L_0x004a:
            java.util.IdentityHashMap<p7.r, java.lang.Integer> r8 = r0.f62897i
            r8.clear()
            int r8 = r1.length
            p7.r[] r9 = new p370p7.C21957r[r8]
            int r11 = r1.length
            p7.r[] r12 = new p370p7.C21957r[r11]
            int r13 = r1.length
            b8.f[] r14 = new p295b8.C16772f[r13]
            r7.j[] r15 = r0.f62903r
            int r15 = r15.length
            r7.j[] r15 = new p380r7.C22212j[r15]
            r10 = 0
            r16 = 0
            r17 = 0
        L_0x0062:
            r7.j[] r7 = r0.f62903r
            int r7 = r7.length
            if (r10 >= r7) goto L_0x0260
            r19 = r8
            r7 = 0
        L_0x006a:
            int r8 = r1.length
            r20 = r15
            if (r7 >= r8) goto L_0x0088
            r8 = r5[r7]
            if (r8 != r10) goto L_0x0076
            r8 = r2[r7]
            goto L_0x0077
        L_0x0076:
            r8 = 0
        L_0x0077:
            r12[r7] = r8
            r8 = r6[r7]
            if (r8 != r10) goto L_0x0080
            r15 = r1[r7]
            goto L_0x0081
        L_0x0080:
            r15 = 0
        L_0x0081:
            r14[r7] = r15
            int r7 = r7 + 1
            r15 = r20
            goto L_0x006a
        L_0x0088:
            r7.j[] r7 = r0.f62903r
            r7 = r7[r10]
            boolean r8 = r7.f62939v
            p333e8.C20528a.m22240d(r8)
            int r8 = r7.f62940w
            r15 = 0
        L_0x0094:
            if (r15 >= r13) goto L_0x00cb
            r21 = r12[r15]
            if (r21 == 0) goto L_0x00c1
            r22 = r14[r15]
            if (r22 == 0) goto L_0x00a2
            boolean r22 = r28[r15]
            if (r22 != 0) goto L_0x00c1
        L_0x00a2:
            r2 = r21
            r7.i r2 = (p380r7.C22211i) r2
            int r2 = r2.f62913a
            r21 = r5
            boolean[] r5 = r7.f62917C
            boolean r5 = r5[r2]
            p333e8.C20528a.m22240d(r5)
            boolean[] r5 = r7.f62917C
            r18 = 0
            r5[r2] = r18
            int r2 = r7.f62940w
            r5 = -1
            int r2 = r2 + r5
            r7.f62940w = r2
            r2 = 0
            r12[r15] = r2
            goto L_0x00c4
        L_0x00c1:
            r21 = r5
            r5 = -1
        L_0x00c4:
            int r15 = r15 + 1
            r2 = r29
            r5 = r21
            goto L_0x0094
        L_0x00cb:
            r21 = r5
            r5 = -1
            if (r17 != 0) goto L_0x00e3
            boolean r15 = r7.f62922H
            if (r15 == 0) goto L_0x00d9
            if (r8 != 0) goto L_0x00d7
            goto L_0x00e3
        L_0x00d7:
            r8 = r6
            goto L_0x00e1
        L_0x00d9:
            r8 = r6
            long r5 = r7.f62919E
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r15 == 0) goto L_0x00e1
            goto L_0x00e4
        L_0x00e1:
            r5 = 0
            goto L_0x00e5
        L_0x00e3:
            r8 = r6
        L_0x00e4:
            r5 = 1
        L_0x00e5:
            r7.c r6 = r7.f62926f
            b8.f r6 = r6.f62861q
            r23 = r6
            r15 = 0
        L_0x00ec:
            if (r15 >= r13) goto L_0x0157
            r22 = r12[r15]
            if (r22 != 0) goto L_0x014a
            r2 = r14[r15]
            if (r2 == 0) goto L_0x014a
            r24 = r13
            p7.v r13 = r7.f62943z
            r25 = r14
            p7.u r14 = r2.mo17794f()
            int r13 = r13.mo35039a(r14)
            boolean[] r14 = r7.f62917C
            boolean r14 = r14[r13]
            r0 = 1
            if (r14 == r0) goto L_0x010d
            r14 = 1
            goto L_0x010e
        L_0x010d:
            r14 = 0
        L_0x010e:
            p333e8.C20528a.m22240d(r14)
            boolean[] r14 = r7.f62917C
            r14[r13] = r0
            int r14 = r7.f62940w
            int r14 = r14 + r0
            r7.f62940w = r14
            int r0 = r7.f62915A
            if (r13 != r0) goto L_0x0124
            r7.c r0 = r7.f62926f
            r0.f62861q = r2
            r23 = r2
        L_0x0124:
            r7.i r0 = new r7.i
            r0.<init>(r7, r13)
            r12[r15] = r0
            r0 = 1
            r30[r15] = r0
            if (r5 != 0) goto L_0x014e
            p7.q[] r2 = r7.f62936s
            r2 = r2[r13]
            r2.mo35035n()
            boolean r5 = r2.mo35026e(r3, r0, r0)
            if (r5 != 0) goto L_0x0148
            p7.p r0 = r2.f62149c
            int r2 = r0.f62135j
            int r0 = r0.f62137l
            int r2 = r2 + r0
            if (r2 == 0) goto L_0x0148
            r5 = 1
            goto L_0x014e
        L_0x0148:
            r5 = 0
            goto L_0x014e
        L_0x014a:
            r24 = r13
            r25 = r14
        L_0x014e:
            int r15 = r15 + 1
            r0 = r26
            r13 = r24
            r14 = r25
            goto L_0x00ec
        L_0x0157:
            r24 = r13
            r25 = r14
            int r0 = r7.f62940w
            if (r0 != 0) goto L_0x018e
            r7.c r0 = r7.f62926f
            r2 = 0
            r0.f62854j = r2
            r7.f62941x = r2
            java.util.LinkedList<r7.f> r0 = r7.f62933p
            r0.clear()
            c8.u r0 = r7.f62930j
            boolean r0 = r0.mo17934a()
            if (r0 == 0) goto L_0x018a
            p7.q[] r0 = r7.f62936s
            int r2 = r0.length
            r6 = 0
        L_0x0177:
            if (r6 >= r2) goto L_0x0181
            r13 = r0[r6]
            r13.mo35029h()
            int r6 = r6 + 1
            goto L_0x0177
        L_0x0181:
            c8.u r0 = r7.f62930j
            c8.u$b<? extends c8.u$c> r0 = r0.f45618b
            r2 = 0
            r0.mo17941a(r2)
            goto L_0x01e1
        L_0x018a:
            r7.mo35344w()
            goto L_0x01e1
        L_0x018e:
            java.util.LinkedList<r7.f> r0 = r7.f62933p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01cb
            r0 = r23
            boolean r2 = p333e8.C20551y.m22311a(r0, r6)
            if (r2 != 0) goto L_0x01cb
            boolean r2 = r7.f62922H
            if (r2 != 0) goto L_0x01c2
            r13 = 0
            r0.mo17782g(r13)
            r7.c r2 = r7.f62926f
            p7.u r2 = r2.f62850f
            java.util.LinkedList<r7.f> r6 = r7.f62933p
            java.lang.Object r6 = r6.getLast()
            r7.f r6 = (p380r7.C22208f) r6
            com.google.android.exoplayer2.Format r6 = r6.f62456c
            int r2 = r2.mo35036a(r6)
            int r0 = r0.mo17789b()
            if (r0 == r2) goto L_0x01c0
            goto L_0x01c2
        L_0x01c0:
            r0 = 0
            goto L_0x01c3
        L_0x01c2:
            r0 = 1
        L_0x01c3:
            if (r0 == 0) goto L_0x01cb
            r0 = 1
            r7.f62921G = r0
            r0 = 1
            r5 = 1
            goto L_0x01cd
        L_0x01cb:
            r0 = r17
        L_0x01cd:
            if (r5 == 0) goto L_0x01e1
            r7.mo35345x(r3, r0)
            r0 = 0
        L_0x01d3:
            if (r0 >= r11) goto L_0x01e1
            r2 = r12[r0]
            if (r2 == 0) goto L_0x01dd
            r2 = 1
            r30[r0] = r2
            goto L_0x01de
        L_0x01dd:
            r2 = 1
        L_0x01de:
            int r0 = r0 + 1
            goto L_0x01d3
        L_0x01e1:
            r2 = 1
            r7.f62922H = r2
            r0 = 0
            r2 = 0
        L_0x01e6:
            int r6 = r1.length
            if (r0 >= r6) goto L_0x021d
            r6 = r8[r0]
            if (r6 != r10) goto L_0x020a
            r2 = r12[r0]
            if (r2 == 0) goto L_0x01f3
            r2 = 1
            goto L_0x01f4
        L_0x01f3:
            r2 = 0
        L_0x01f4:
            p333e8.C20528a.m22240d(r2)
            r2 = r12[r0]
            r9[r0] = r2
            r6 = r26
            java.util.IdentityHashMap<p7.r, java.lang.Integer> r2 = r6.f62897i
            r13 = r12[r0]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r2.put(r13, r14)
            r2 = 1
            goto L_0x021a
        L_0x020a:
            r6 = r26
            r13 = r21[r0]
            if (r13 != r10) goto L_0x021a
            r13 = r12[r0]
            if (r13 != 0) goto L_0x0216
            r13 = 1
            goto L_0x0217
        L_0x0216:
            r13 = 0
        L_0x0217:
            p333e8.C20528a.m22240d(r13)
        L_0x021a:
            int r0 = r0 + 1
            goto L_0x01e6
        L_0x021d:
            r6 = r26
            if (r2 == 0) goto L_0x024b
            r0 = r16
            r20[r0] = r7
            int r16 = r0 + 1
            if (r0 != 0) goto L_0x0245
            r7.c r0 = r7.f62926f
            r2 = 1
            r0.f62852h = r2
            if (r5 != 0) goto L_0x023a
            r7.j[] r0 = r6.f62904s
            int r5 = r0.length
            if (r5 == 0) goto L_0x023a
            r5 = 0
            r0 = r0[r5]
            if (r7 == r0) goto L_0x024d
        L_0x023a:
            r7.k r0 = r6.f62898j
            android.util.SparseArray<e8.u> r0 = r0.f62945a
            r0.clear()
            r2 = 0
            r17 = 1
            goto L_0x024e
        L_0x0245:
            r7.c r0 = r7.f62926f
            r2 = 0
            r0.f62852h = r2
            goto L_0x024e
        L_0x024b:
            r0 = r16
        L_0x024d:
            r2 = 0
        L_0x024e:
            int r10 = r10 + 1
            r2 = r29
            r0 = r6
            r6 = r8
            r8 = r19
            r15 = r20
            r5 = r21
            r13 = r24
            r14 = r25
            goto L_0x0062
        L_0x0260:
            r6 = r0
            r5 = r2
            r7 = r8
            r20 = r15
            r0 = r16
            r2 = 0
            java.lang.System.arraycopy(r9, r2, r5, r2, r7)
            r1 = r20
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r7.j[] r0 = (p380r7.C22212j[]) r0
            r6.f62904s = r0
            p7.i r1 = new p7.i
            r1.<init>(r0)
            r6.f62905t = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p380r7.C22209g.mo34990k(b8.f[], boolean[], p7.r[], boolean[], long):long");
    }

    /* renamed from: m */
    public long mo34991m() {
        return -9223372036854775807L;
    }

    /* renamed from: n */
    public C21962v mo34992n() {
        return this.f62902q;
    }

    public void onPlaylistChanged() {
        if (this.f62902q != null) {
            this.f62900o.mo34988g(this);
            return;
        }
        for (C22212j jVar : this.f62903r) {
            if (!jVar.f62939v) {
                jVar.mo34984b(jVar.f62919E);
            }
        }
    }

    /* renamed from: q */
    public void mo34993q() {
        C22212j[] jVarArr = this.f62903r;
        int length = jVarArr.length;
        int i = 0;
        while (i < length) {
            C22212j jVar = jVarArr[i];
            jVar.f62930j.mo17935b();
            C22202c cVar = jVar.f62926f;
            IOException iOException = cVar.f62854j;
            if (iOException == null) {
                C22300a.C22301a aVar = cVar.f62855k;
                if (aVar != null) {
                    C22305e.C22307b bVar = cVar.f62849e.f63245g.get(aVar);
                    bVar.f63256e.mo17935b();
                    IOException iOException2 = bVar.f63264p;
                    if (iOException2 != null) {
                        throw iOException2;
                    }
                }
                i++;
            } else {
                throw iOException;
            }
        }
    }

    /* renamed from: r */
    public void mo34994r(long j) {
        for (C22212j jVar : this.f62904s) {
            int length = jVar.f62936s.length;
            for (int i = 0; i < length; i++) {
                jVar.f62936s[i].mo35028g(j, false, jVar.f62917C[i]);
            }
        }
    }
}
