package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.l */
public class C54248l {

    /* renamed from: a */
    public static final Comparator<C54255g> f152269a = new C54249a();

    /* renamed from: androidx.recyclerview.widget.l$a */
    public static class C54249a implements Comparator<C54255g> {
        public int compare(Object obj, Object obj2) {
            C54255g gVar = (C54255g) obj;
            C54255g gVar2 = (C54255g) obj2;
            int i = gVar.f152284a - gVar2.f152284a;
            return i == 0 ? gVar.f152285b - gVar2.f152285b : i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$b */
    public static abstract class C54250b {
        /* renamed from: a */
        public abstract boolean mo11465a(int i, int i2);

        /* renamed from: b */
        public abstract boolean mo11466b(int i, int i2);

        /* renamed from: c */
        public Object mo11467c(int i, int i2) {
            return null;
        }

        /* renamed from: d */
        public abstract int mo11468d();

        /* renamed from: e */
        public abstract int mo11469e();
    }

    /* renamed from: androidx.recyclerview.widget.l$c */
    public static class C54251c {

        /* renamed from: a */
        public final List<C54255g> f152270a;

        /* renamed from: b */
        public final int[] f152271b;

        /* renamed from: c */
        public final int[] f152272c;

        /* renamed from: d */
        public final C54250b f152273d;

        /* renamed from: e */
        public final int f152274e;

        /* renamed from: f */
        public final int f152275f;

        /* renamed from: g */
        public final boolean f152276g;

        public C54251c(C54250b bVar, List<C54255g> list, int[] iArr, int[] iArr2, boolean z) {
            this.f152270a = list;
            this.f152271b = iArr;
            this.f152272c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f152273d = bVar;
            int e = bVar.mo11469e();
            this.f152274e = e;
            int d = bVar.mo11468d();
            this.f152275f = d;
            this.f152276g = z;
            C54255g gVar = list.isEmpty() ? null : list.get(0);
            if (!(gVar != null && gVar.f152284a == 0 && gVar.f152285b == 0)) {
                C54255g gVar2 = new C54255g();
                gVar2.f152284a = 0;
                gVar2.f152285b = 0;
                gVar2.f152287d = false;
                gVar2.f152286c = 0;
                gVar2.f152288e = false;
                list.add(0, gVar2);
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C54255g gVar3 = this.f152270a.get(size);
                int i = gVar3.f152284a;
                int i2 = gVar3.f152286c;
                int i3 = i + i2;
                int i4 = gVar3.f152285b + i2;
                if (this.f152276g) {
                    while (e > i3) {
                        int i5 = e - 1;
                        if (this.f152271b[i5] == 0) {
                            mo75047c(e, d, size, false);
                        }
                        e = i5;
                    }
                    while (d > i4) {
                        int i6 = d - 1;
                        if (this.f152272c[i6] == 0) {
                            mo75047c(e, d, size, true);
                        }
                        d = i6;
                    }
                }
                for (int i7 = 0; i7 < gVar3.f152286c; i7++) {
                    int i8 = gVar3.f152284a + i7;
                    int i9 = gVar3.f152285b + i7;
                    int i15 = this.f152273d.mo11465a(i8, i9) ? 1 : 2;
                    this.f152271b[i8] = (i9 << 5) | i15;
                    this.f152272c[i9] = (i8 << 5) | i15;
                }
                e = gVar3.f152284a;
                d = gVar3.f152285b;
            }
        }

        /* renamed from: d */
        public static C54253e m60955d(List<C54253e> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C54253e eVar = list.get(size);
                if (eVar.f152277a == i && eVar.f152279c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f152278b += z ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: a */
        public void mo75045a(C54258u uVar) {
            C54255g gVar;
            int i;
            C54258u uVar2 = uVar;
            C54233d dVar = uVar2 instanceof C54233d ? (C54233d) uVar2 : new C54233d(uVar2);
            ArrayList arrayList = new ArrayList();
            int i2 = this.f152274e;
            int i3 = this.f152275f;
            int size = this.f152270a.size() - 1;
            while (size >= 0) {
                C54255g gVar2 = this.f152270a.get(size);
                int i4 = gVar2.f152286c;
                int i5 = gVar2.f152284a + i4;
                int i6 = gVar2.f152285b + i4;
                int i7 = 4;
                if (i5 < i2) {
                    int i8 = i2 - i5;
                    if (!this.f152276g) {
                        dVar.mo2860a(i5, i8);
                    } else {
                        int i9 = i8 - 1;
                        while (i9 >= 0) {
                            int i15 = i5 + i9;
                            int i16 = this.f152271b[i15];
                            int i17 = i16 & 31;
                            if (i17 == 0) {
                                i = size;
                                gVar = gVar2;
                                int i18 = 1;
                                dVar.mo2860a(i15, 1);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((C54253e) it.next()).f152278b -= i18;
                                    i18 = 1;
                                }
                            } else if (i17 == i7 || i17 == 8) {
                                int i19 = i16 >> 5;
                                i = size;
                                C54253e d = m60955d(arrayList, i19, false);
                                gVar = gVar2;
                                dVar.mo2863d(i15, d.f152278b - 1);
                                if (i17 == 4) {
                                    dVar.mo2862c(d.f152278b - 1, 1, this.f152273d.mo11467c(i15, i19));
                                }
                            } else if (i17 == 16) {
                                arrayList.add(new C54253e(i15, i15, true));
                                i = size;
                                gVar = gVar2;
                            } else {
                                throw new IllegalStateException("unknown flag for pos " + i15 + " " + Long.toBinaryString((long) i17));
                            }
                            i9--;
                            size = i;
                            gVar2 = gVar;
                            i7 = 4;
                        }
                    }
                }
                int i25 = size;
                C54255g gVar3 = gVar2;
                if (i6 < i3) {
                    int i26 = i3 - i6;
                    if (!this.f152276g) {
                        dVar.mo2861b(i5, i26);
                    } else {
                        for (int i27 = i26 - 1; i27 >= 0; i27--) {
                            int i28 = i6 + i27;
                            int i29 = this.f152272c[i28];
                            int i35 = i29 & 31;
                            if (i35 != 0) {
                                if (i35 != 4) {
                                    if (i35 != 8) {
                                        if (i35 == 16) {
                                            arrayList.add(new C54253e(i28, i5, false));
                                        } else {
                                            throw new IllegalStateException("unknown flag for pos " + i28 + " " + Long.toBinaryString((long) i35));
                                        }
                                    }
                                }
                                int i36 = i29 >> 5;
                                dVar.mo2863d(m60955d(arrayList, i36, true).f152278b, i5);
                                if (i35 == 4) {
                                    dVar.mo2862c(i5, 1, this.f152273d.mo11467c(i36, i28));
                                }
                            } else {
                                int i37 = 1;
                                dVar.mo2861b(i5, 1);
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    ((C54253e) it4.next()).f152278b += i37;
                                    i37 = 1;
                                }
                            }
                        }
                    }
                }
                int i38 = i4 - 1;
                while (i38 >= 0) {
                    int[] iArr = this.f152271b;
                    C54255g gVar4 = gVar3;
                    int i39 = gVar4.f152284a;
                    if ((iArr[i39 + i38] & 31) == 2) {
                        dVar.mo2862c(i39 + i38, 1, this.f152273d.mo11467c(i39 + i38, gVar4.f152285b + i38));
                    }
                    i38--;
                    gVar3 = gVar4;
                }
                C54255g gVar5 = gVar3;
                i2 = gVar5.f152284a;
                i3 = gVar5.f152285b;
                size = i25 - 1;
            }
            dVar.mo75011e();
        }

        /* renamed from: b */
        public void mo75046b(RecyclerView.C16613e eVar) {
            mo75045a(new C54230b(eVar));
        }

        /* renamed from: c */
        public final boolean mo75047c(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C54255g gVar = this.f152270a.get(i3);
                int i6 = gVar.f152284a;
                int i7 = gVar.f152286c;
                int i8 = i6 + i7;
                int i9 = gVar.f152285b + i7;
                int i15 = 8;
                if (z) {
                    for (int i16 = i4 - 1; i16 >= i8; i16--) {
                        if (this.f152273d.mo11466b(i16, i5)) {
                            if (!this.f152273d.mo11465a(i16, i5)) {
                                i15 = 4;
                            }
                            this.f152272c[i5] = (i16 << 5) | 16;
                            this.f152271b[i16] = (i5 << 5) | i15;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i17 = i2 - 1; i17 >= i9; i17--) {
                        if (this.f152273d.mo11466b(i5, i17)) {
                            if (!this.f152273d.mo11465a(i5, i17)) {
                                i15 = 4;
                            }
                            int i18 = i - 1;
                            this.f152271b[i18] = (i17 << 5) | 16;
                            this.f152272c[i17] = (i18 << 5) | i15;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = gVar.f152284a;
                i2 = gVar.f152285b;
                i3--;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$d */
    public static abstract class C54252d<T> {
        /* renamed from: a */
        public abstract boolean mo75048a(T t, T t2);

        /* renamed from: b */
        public abstract boolean mo75049b(T t, T t2);
    }

    /* renamed from: androidx.recyclerview.widget.l$e */
    public static class C54253e {

        /* renamed from: a */
        public int f152277a;

        /* renamed from: b */
        public int f152278b;

        /* renamed from: c */
        public boolean f152279c;

        public C54253e(int i, int i2, boolean z) {
            this.f152277a = i;
            this.f152278b = i2;
            this.f152279c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$f */
    public static class C54254f {

        /* renamed from: a */
        public int f152280a;

        /* renamed from: b */
        public int f152281b;

        /* renamed from: c */
        public int f152282c;

        /* renamed from: d */
        public int f152283d;

        public C54254f() {
        }

        public C54254f(int i, int i2, int i3, int i4) {
            this.f152280a = i;
            this.f152281b = i2;
            this.f152282c = i3;
            this.f152283d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$g */
    public static class C54255g {

        /* renamed from: a */
        public int f152284a;

        /* renamed from: b */
        public int f152285b;

        /* renamed from: c */
        public int f152286c;

        /* renamed from: d */
        public boolean f152287d;

        /* renamed from: e */
        public boolean f152288e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0090, code lost:
        if (r7[r20 - 1] < r7[r20 + 1]) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0114, code lost:
        r22 = r0;
        r21 = r2;
        r20 = r3;
        r23 = r11;
        r24 = r13;
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0120, code lost:
        if (r0 > r9) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0122, code lost:
        r3 = r0 + r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0126, code lost:
        if (r3 == (r9 + r14)) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012a, code lost:
        if (r3 == (r6 + r14)) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012c, code lost:
        r11 = r5 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0138, code lost:
        if (r8[r11 - 1] >= r8[r11 + 1]) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013d, code lost:
        r11 = r8[(r5 + r3) + 1] - 1;
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0149, code lost:
        r11 = r8[(r5 + r3) - 1];
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0150, code lost:
        r15 = r11 - r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0152, code lost:
        if (r11 <= 0) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0154, code lost:
        if (r15 <= 0) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0156, code lost:
        r25 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0164, code lost:
        if (r1.mo11466b((r10 + r11) - 1, (r12 + r15) - 1) == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0166, code lost:
        r11 = r11 - 1;
        r15 = r15 - 1;
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016e, code lost:
        r25 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0170, code lost:
        r2 = r5 + r3;
        r8[r2] = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0174, code lost:
        if (r4 != false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0176, code lost:
        if (r3 < r6) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0178, code lost:
        if (r3 > r9) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017c, code lost:
        if (r7[r2] < r11) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017e, code lost:
        r0 = new androidx.recyclerview.widget.C54248l.C54255g();
        r4 = r8[r2];
        r0.f152284a = r4;
        r0.f152285b = r4 - r3;
        r0.f152286c = r7[r2] - r4;
        r0.f152287d = r13;
        r0.f152288e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0196, code lost:
        r0 = r0 + 2;
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019c, code lost:
        r25 = r10;
        r9 = r9 + 1;
        r15 = r19;
        r3 = r20;
        r2 = r21;
        r0 = r22;
        r11 = r23;
        r13 = r24;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x00ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0105 A[LOOP:2: B:13:0x007a->B:38:0x0105, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.recyclerview.widget.C54248l.C54251c m60949a(androidx.recyclerview.widget.C54248l.C54250b r27, boolean r28) {
        /*
            r1 = r27
            int r0 = r27.mo11469e()
            int r2 = r27.mo11468d()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            androidx.recyclerview.widget.l$f r5 = new androidx.recyclerview.widget.l$f
            r6 = 0
            r5.<init>(r6, r0, r6, r2)
            r4.add(r5)
            int r5 = r0 + r2
            int r0 = r0 - r2
            int r0 = java.lang.Math.abs(r0)
            int r5 = r5 + r0
            int r0 = r5 * 2
            int[] r7 = new int[r0]
            int[] r8 = new int[r0]
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0030:
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x0275
            int r2 = r4.size()
            r9 = 1
            int r2 = r2 - r9
            java.lang.Object r2 = r4.remove(r2)
            androidx.recyclerview.widget.l$f r2 = (androidx.recyclerview.widget.C54248l.C54254f) r2
            int r10 = r2.f152280a
            int r11 = r2.f152281b
            int r12 = r2.f152282c
            int r13 = r2.f152283d
            int r11 = r11 - r10
            int r13 = r13 - r12
            if (r11 < r9) goto L_0x01b6
            if (r13 >= r9) goto L_0x0052
            goto L_0x01b6
        L_0x0052:
            int r14 = r11 - r13
            int r15 = r11 + r13
            int r15 = r15 + r9
            int r15 = r15 / 2
            int r16 = r5 - r15
            int r6 = r16 + -1
            int r16 = r5 + r15
            r18 = r4
            int r4 = r16 + 1
            r9 = 0
            java.util.Arrays.fill(r7, r6, r4, r9)
            int r6 = r6 + r14
            int r4 = r4 + r14
            java.util.Arrays.fill(r8, r6, r4, r11)
            int r4 = r14 % 2
            if (r4 == 0) goto L_0x0072
            r4 = 1
            goto L_0x0073
        L_0x0072:
            r4 = 0
        L_0x0073:
            r9 = 0
        L_0x0074:
            if (r9 > r15) goto L_0x01ae
            int r6 = -r9
            r19 = r15
            r15 = r6
        L_0x007a:
            if (r15 > r9) goto L_0x0114
            if (r15 == r6) goto L_0x00a3
            if (r15 == r9) goto L_0x0093
            int r20 = r5 + r15
            int r21 = r20 + -1
            r22 = r0
            r0 = r7[r21]
            r16 = 1
            int r20 = r20 + 1
            r21 = r2
            r2 = r7[r20]
            if (r0 >= r2) goto L_0x0099
            goto L_0x00a9
        L_0x0093:
            r22 = r0
            r21 = r2
            r16 = 1
        L_0x0099:
            int r0 = r5 + r15
            int r0 = r0 + -1
            r0 = r7[r0]
            int r0 = r0 + 1
            r2 = 1
            goto L_0x00b0
        L_0x00a3:
            r22 = r0
            r21 = r2
            r16 = 1
        L_0x00a9:
            int r0 = r5 + r15
            int r0 = r0 + 1
            r0 = r7[r0]
            r2 = 0
        L_0x00b0:
            int r20 = r0 - r15
            r26 = r20
            r20 = r3
            r3 = r26
        L_0x00b8:
            if (r0 >= r11) goto L_0x00d3
            if (r3 >= r13) goto L_0x00d3
            r23 = r11
            int r11 = r10 + r0
            r24 = r13
            int r13 = r12 + r3
            boolean r11 = r1.mo11466b(r11, r13)
            if (r11 == 0) goto L_0x00d7
            int r0 = r0 + 1
            int r3 = r3 + 1
            r11 = r23
            r13 = r24
            goto L_0x00b8
        L_0x00d3:
            r23 = r11
            r24 = r13
        L_0x00d7:
            int r3 = r5 + r15
            r7[r3] = r0
            if (r4 == 0) goto L_0x0105
            int r11 = r14 - r9
            r13 = 1
            int r11 = r11 + r13
            if (r15 < r11) goto L_0x0105
            int r11 = r14 + r9
            int r11 = r11 - r13
            if (r15 > r11) goto L_0x0105
            r11 = r8[r3]
            if (r0 < r11) goto L_0x0105
            androidx.recyclerview.widget.l$g r0 = new androidx.recyclerview.widget.l$g
            r0.<init>()
            r4 = r8[r3]
            r0.f152284a = r4
            int r6 = r4 - r15
            r0.f152285b = r6
            r3 = r7[r3]
            int r3 = r3 - r4
            r0.f152286c = r3
            r0.f152287d = r2
            r2 = 0
            r0.f152288e = r2
            goto L_0x01bf
        L_0x0105:
            r2 = 0
            int r15 = r15 + 2
            r3 = r20
            r2 = r21
            r0 = r22
            r11 = r23
            r13 = r24
            goto L_0x007a
        L_0x0114:
            r22 = r0
            r21 = r2
            r20 = r3
            r23 = r11
            r24 = r13
            r2 = 0
            r0 = r6
        L_0x0120:
            if (r0 > r9) goto L_0x019c
            int r3 = r0 + r14
            int r11 = r9 + r14
            if (r3 == r11) goto L_0x0147
            int r11 = r6 + r14
            if (r3 == r11) goto L_0x013b
            int r11 = r5 + r3
            int r13 = r11 + -1
            r13 = r8[r13]
            r16 = 1
            int r11 = r11 + 1
            r11 = r8[r11]
            if (r13 >= r11) goto L_0x013d
            goto L_0x0149
        L_0x013b:
            r16 = 1
        L_0x013d:
            int r11 = r5 + r3
            int r11 = r11 + 1
            r11 = r8[r11]
            int r11 = r11 + -1
            r13 = 1
            goto L_0x0150
        L_0x0147:
            r16 = 1
        L_0x0149:
            int r11 = r5 + r3
            int r11 = r11 + -1
            r11 = r8[r11]
            r13 = 0
        L_0x0150:
            int r15 = r11 - r3
        L_0x0152:
            if (r11 <= 0) goto L_0x016e
            if (r15 <= 0) goto L_0x016e
            int r17 = r10 + r11
            int r2 = r17 + -1
            int r17 = r12 + r15
            r25 = r10
            int r10 = r17 + -1
            boolean r2 = r1.mo11466b(r2, r10)
            if (r2 == 0) goto L_0x0170
            int r11 = r11 + -1
            int r15 = r15 + -1
            r10 = r25
            r2 = 0
            goto L_0x0152
        L_0x016e:
            r25 = r10
        L_0x0170:
            int r2 = r5 + r3
            r8[r2] = r11
            if (r4 != 0) goto L_0x0196
            if (r3 < r6) goto L_0x0196
            if (r3 > r9) goto L_0x0196
            r10 = r7[r2]
            if (r10 < r11) goto L_0x0196
            androidx.recyclerview.widget.l$g r0 = new androidx.recyclerview.widget.l$g
            r0.<init>()
            r4 = r8[r2]
            r0.f152284a = r4
            int r3 = r4 - r3
            r0.f152285b = r3
            r2 = r7[r2]
            int r2 = r2 - r4
            r0.f152286c = r2
            r0.f152287d = r13
            r2 = 1
            r0.f152288e = r2
            goto L_0x01bf
        L_0x0196:
            int r0 = r0 + 2
            r10 = r25
            r2 = 0
            goto L_0x0120
        L_0x019c:
            r25 = r10
            int r9 = r9 + 1
            r15 = r19
            r3 = r20
            r2 = r21
            r0 = r22
            r11 = r23
            r13 = r24
            goto L_0x0074
        L_0x01ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x01b6:
            r22 = r0
            r21 = r2
            r20 = r3
            r18 = r4
            r0 = 0
        L_0x01bf:
            if (r0 == 0) goto L_0x0264
            int r2 = r0.f152286c
            if (r2 <= 0) goto L_0x01cb
            r2 = r20
            r2.add(r0)
            goto L_0x01cd
        L_0x01cb:
            r2 = r20
        L_0x01cd:
            int r3 = r0.f152284a
            r4 = r21
            int r6 = r4.f152280a
            int r3 = r3 + r6
            r0.f152284a = r3
            int r3 = r0.f152285b
            int r6 = r4.f152282c
            int r3 = r3 + r6
            r0.f152285b = r3
            boolean r3 = r22.isEmpty()
            if (r3 == 0) goto L_0x01eb
            androidx.recyclerview.widget.l$f r3 = new androidx.recyclerview.widget.l$f
            r3.<init>()
            r6 = r22
            goto L_0x01f9
        L_0x01eb:
            int r3 = r22.size()
            r6 = 1
            int r3 = r3 - r6
            r6 = r22
            java.lang.Object r3 = r6.remove(r3)
            androidx.recyclerview.widget.l$f r3 = (androidx.recyclerview.widget.C54248l.C54254f) r3
        L_0x01f9:
            int r9 = r4.f152280a
            r3.f152280a = r9
            int r9 = r4.f152282c
            r3.f152282c = r9
            boolean r9 = r0.f152288e
            if (r9 == 0) goto L_0x0211
            int r9 = r0.f152284a
            r3.f152281b = r9
            int r9 = r0.f152285b
            r3.f152283d = r9
            r9 = r18
            r10 = 1
            goto L_0x022c
        L_0x0211:
            boolean r9 = r0.f152287d
            if (r9 == 0) goto L_0x0220
            int r9 = r0.f152284a
            r10 = 1
            int r9 = r9 - r10
            r3.f152281b = r9
            int r9 = r0.f152285b
            r3.f152283d = r9
            goto L_0x022a
        L_0x0220:
            r10 = 1
            int r9 = r0.f152284a
            r3.f152281b = r9
            int r9 = r0.f152285b
            int r9 = r9 - r10
            r3.f152283d = r9
        L_0x022a:
            r9 = r18
        L_0x022c:
            r9.add(r3)
            boolean r3 = r0.f152288e
            if (r3 == 0) goto L_0x0254
            boolean r3 = r0.f152287d
            if (r3 == 0) goto L_0x0245
            int r3 = r0.f152284a
            int r11 = r0.f152286c
            int r3 = r3 + r11
            int r3 = r3 + r10
            r4.f152280a = r3
            int r0 = r0.f152285b
            int r0 = r0 + r11
            r4.f152282c = r0
            goto L_0x0260
        L_0x0245:
            int r3 = r0.f152284a
            int r10 = r0.f152286c
            int r3 = r3 + r10
            r4.f152280a = r3
            int r0 = r0.f152285b
            int r0 = r0 + r10
            r3 = 1
            int r0 = r0 + r3
            r4.f152282c = r0
            goto L_0x0260
        L_0x0254:
            int r3 = r0.f152284a
            int r10 = r0.f152286c
            int r3 = r3 + r10
            r4.f152280a = r3
            int r0 = r0.f152285b
            int r0 = r0 + r10
            r4.f152282c = r0
        L_0x0260:
            r9.add(r4)
            goto L_0x026f
        L_0x0264:
            r9 = r18
            r2 = r20
            r4 = r21
            r6 = r22
            r6.add(r4)
        L_0x026f:
            r3 = r2
            r0 = r6
            r4 = r9
            r6 = 0
            goto L_0x0030
        L_0x0275:
            r2 = r3
            java.util.Comparator<androidx.recyclerview.widget.l$g> r0 = f152269a
            java.util.Collections.sort(r2, r0)
            androidx.recyclerview.widget.l$c r6 = new androidx.recyclerview.widget.l$c
            r0 = r6
            r1 = r27
            r3 = r7
            r4 = r8
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C54248l.m60949a(androidx.recyclerview.widget.l$b, boolean):androidx.recyclerview.widget.l$c");
    }
}
