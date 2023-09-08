package p363n2;

import java.util.Arrays;
import p363n2.C21593h;
import p368o2.C21735e;

/* renamed from: n2.e */
public class C21589e {

    /* renamed from: o */
    public static int f61134o = 1000;

    /* renamed from: a */
    public int f61135a;

    /* renamed from: b */
    public C21590a f61136b;

    /* renamed from: c */
    public int f61137c;

    /* renamed from: d */
    public int f61138d;

    /* renamed from: e */
    public C21586b[] f61139e;

    /* renamed from: f */
    public boolean f61140f;

    /* renamed from: g */
    public boolean[] f61141g;

    /* renamed from: h */
    public int f61142h;

    /* renamed from: i */
    public int f61143i;

    /* renamed from: j */
    public int f61144j;

    /* renamed from: k */
    public final C21587c f61145k;

    /* renamed from: l */
    public C21593h[] f61146l;

    /* renamed from: m */
    public int f61147m;

    /* renamed from: n */
    public final C21590a f61148n;

    /* renamed from: n2.e$a */
    public interface C21590a {
    }

    public C21589e() {
        int i = 0;
        this.f61135a = 0;
        this.f61137c = 32;
        this.f61138d = 32;
        this.f61139e = null;
        this.f61140f = false;
        this.f61141g = new boolean[32];
        this.f61142h = 1;
        this.f61143i = 0;
        this.f61144j = 32;
        this.f61146l = new C21593h[f61134o];
        this.f61147m = 0;
        this.f61139e = new C21586b[32];
        while (true) {
            C21586b[] bVarArr = this.f61139e;
            if (i < bVarArr.length) {
                C21586b bVar = bVarArr[i];
                if (bVar != null) {
                    C21592g gVar = (C21592g) this.f61145k.f61131a;
                    int i2 = gVar.f61150b;
                    Object[] objArr = gVar.f61149a;
                    if (i2 < objArr.length) {
                        objArr[i2] = bVar;
                        gVar.f61150b = i2 + 1;
                    }
                }
                bVarArr[i] = null;
                i++;
            } else {
                C21587c cVar = new C21587c();
                this.f61145k = cVar;
                this.f61136b = new C21588d(cVar);
                this.f61148n = new C21586b(cVar);
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: n2.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p363n2.C21593h mo33834a(p363n2.C21593h.C21594a r6, java.lang.String r7) {
        /*
            r5 = this;
            n2.c r0 = r5.f61145k
            n2.f<n2.h> r0 = r0.f61132b
            n2.g r0 = (p363n2.C21592g) r0
            int r1 = r0.f61150b
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            int r1 = r1 + -1
            java.lang.Object[] r3 = r0.f61149a
            r4 = r3[r1]
            r3[r1] = r2
            r0.f61150b = r1
            r2 = r4
        L_0x0016:
            n2.h r2 = (p363n2.C21593h) r2
            if (r2 != 0) goto L_0x0022
            n2.h r2 = new n2.h
            r2.<init>(r6, r7)
            r2.f61156f = r6
            goto L_0x0027
        L_0x0022:
            r2.mo33854c()
            r2.f61156f = r6
        L_0x0027:
            int r6 = r5.f61147m
            int r7 = f61134o
            if (r6 < r7) goto L_0x003b
            int r7 = r7 * 2
            f61134o = r7
            n2.h[] r6 = r5.f61146l
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            n2.h[] r6 = (p363n2.C21593h[]) r6
            r5.f61146l = r6
        L_0x003b:
            n2.h[] r6 = r5.f61146l
            int r7 = r5.f61147m
            int r0 = r7 + 1
            r5.f61147m = r0
            r6[r7] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p363n2.C21589e.mo33834a(n2.h$a, java.lang.String):n2.h");
    }

    /* renamed from: b */
    public void mo33835b(C21593h hVar, C21593h hVar2, int i, float f, C21593h hVar3, C21593h hVar4, int i2, int i3) {
        C21586b k = mo33844k();
        if (hVar2 == hVar3) {
            k.f61129c.mo33825f(hVar, 1.0f);
            k.f61129c.mo33825f(hVar4, 1.0f);
            k.f61129c.mo33825f(hVar2, -2.0f);
        } else if (f == 0.5f) {
            k.f61129c.mo33825f(hVar, 1.0f);
            k.f61129c.mo33825f(hVar2, -1.0f);
            k.f61129c.mo33825f(hVar3, -1.0f);
            k.f61129c.mo33825f(hVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                k.f61128b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            k.f61129c.mo33825f(hVar, -1.0f);
            k.f61129c.mo33825f(hVar2, 1.0f);
            k.f61128b = (float) i;
        } else if (f >= 1.0f) {
            k.f61129c.mo33825f(hVar3, -1.0f);
            k.f61129c.mo33825f(hVar4, 1.0f);
            k.f61128b = (float) i2;
        } else {
            float f2 = 1.0f - f;
            k.f61129c.mo33825f(hVar, f2 * 1.0f);
            k.f61129c.mo33825f(hVar2, f2 * -1.0f);
            k.f61129c.mo33825f(hVar3, -1.0f * f);
            k.f61129c.mo33825f(hVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                k.f61128b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        if (i3 != 6) {
            k.mo33828a(this, i3);
        }
        mo33836c(k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        if (r7.f61159i <= 1) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
        if (r7.f61159i <= 1) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bc, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00db, code lost:
        if (r7.f61159i <= 1) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e4, code lost:
        if (r7.f61159i <= 1) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e9, code lost:
        r16 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33836c(p363n2.C21586b r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            n2.h$a r2 = p363n2.C21593h.C21594a.UNRESTRICTED
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            int r3 = r0.f61143i
            r4 = 1
            int r3 = r3 + r4
            int r5 = r0.f61144j
            if (r3 >= r5) goto L_0x0018
            int r3 = r0.f61142h
            int r3 = r3 + r4
            int r5 = r0.f61138d
            if (r3 < r5) goto L_0x001b
        L_0x0018:
            r19.mo33847n()
        L_0x001b:
            boolean r3 = r1.f61130d
            if (r3 != 0) goto L_0x01c2
            r19.mo33851r(r20)
            n2.h r3 = r1.f61127a
            r6 = 0
            if (r3 != 0) goto L_0x0035
            float r3 = r1.f61128b
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0035
            n2.a r3 = r1.f61129c
            int r3 = r3.f61117a
            if (r3 != 0) goto L_0x0035
            r3 = 1
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            if (r3 == 0) goto L_0x0039
            return
        L_0x0039:
            float r3 = r1.f61128b
            r7 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0060
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r8
            r1.f61128b = r3
            n2.a r3 = r1.f61129c
            int r9 = r3.f61124h
            r10 = 0
        L_0x004b:
            if (r9 == r7) goto L_0x0060
            int r11 = r3.f61117a
            if (r10 >= r11) goto L_0x0060
            float[] r11 = r3.f61123g
            r12 = r11[r9]
            float r12 = r12 * r8
            r11[r9] = r12
            int[] r11 = r3.f61122f
            r9 = r11[r9]
            int r10 = r10 + 1
            goto L_0x004b
        L_0x0060:
            n2.a r3 = r1.f61129c
            int r8 = r3.f61124h
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x006c:
            if (r8 == r7) goto L_0x0108
            int r5 = r3.f61117a
            if (r10 >= r5) goto L_0x0108
            float[] r5 = r3.f61123g
            r17 = r5[r8]
            r18 = 981668463(0x3a83126f, float:0.001)
            n2.c r7 = r3.f61119c
            n2.h[] r7 = r7.f61133c
            int[] r9 = r3.f61121e
            r9 = r9[r8]
            r7 = r7[r9]
            int r9 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0096
            r9 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r9 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x00a3
            r5[r8] = r6
            n2.b r5 = r3.f61118b
            r7.mo33853b(r5)
            goto L_0x00a1
        L_0x0096:
            int r9 = (r17 > r18 ? 1 : (r17 == r18 ? 0 : -1))
            if (r9 >= 0) goto L_0x00a3
            r5[r8] = r6
            n2.b r5 = r3.f61118b
            r7.mo33853b(r5)
        L_0x00a1:
            r17 = 0
        L_0x00a3:
            int r5 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x00ff
            n2.h$a r5 = r7.f61156f
            if (r5 != r2) goto L_0x00d1
            if (r12 != 0) goto L_0x00b2
            int r5 = r7.f61159i
            if (r5 > r4) goto L_0x00bc
            goto L_0x00ba
        L_0x00b2:
            int r5 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c1
            int r5 = r7.f61159i
            if (r5 > r4) goto L_0x00bc
        L_0x00ba:
            r14 = 1
            goto L_0x00bd
        L_0x00bc:
            r14 = 0
        L_0x00bd:
            r12 = r7
            r13 = r17
            goto L_0x00ff
        L_0x00c1:
            if (r14 != 0) goto L_0x00ff
            int r5 = r7.f61159i
            if (r5 > r4) goto L_0x00c9
            r5 = 1
            goto L_0x00ca
        L_0x00c9:
            r5 = 0
        L_0x00ca:
            if (r5 == 0) goto L_0x00ff
            r12 = r7
            r13 = r17
            r14 = 1
            goto L_0x00ff
        L_0x00d1:
            if (r12 != 0) goto L_0x00ff
            int r5 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ff
            if (r11 != 0) goto L_0x00de
            int r5 = r7.f61159i
            if (r5 > r4) goto L_0x00e9
            goto L_0x00e6
        L_0x00de:
            int r5 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ef
            int r5 = r7.f61159i
            if (r5 > r4) goto L_0x00e9
        L_0x00e6:
            r16 = 1
            goto L_0x00eb
        L_0x00e9:
            r16 = 0
        L_0x00eb:
            r11 = r7
            r15 = r17
            goto L_0x00ff
        L_0x00ef:
            if (r16 != 0) goto L_0x00ff
            int r5 = r7.f61159i
            if (r5 > r4) goto L_0x00f7
            r5 = 1
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            if (r5 == 0) goto L_0x00ff
            r11 = r7
            r15 = r17
            r16 = 1
        L_0x00ff:
            int[] r5 = r3.f61122f
            r8 = r5[r8]
            int r10 = r10 + 1
            r7 = -1
            goto L_0x006c
        L_0x0108:
            if (r12 == 0) goto L_0x010b
            r11 = r12
        L_0x010b:
            if (r11 != 0) goto L_0x010f
            r3 = 1
            goto L_0x0113
        L_0x010f:
            r1.mo33831d(r11)
            r3 = 0
        L_0x0113:
            n2.a r5 = r1.f61129c
            int r5 = r5.f61117a
            if (r5 != 0) goto L_0x011b
            r1.f61130d = r4
        L_0x011b:
            if (r3 == 0) goto L_0x01ac
            int r3 = r0.f61142h
            int r3 = r3 + r4
            int r5 = r0.f61138d
            if (r3 < r5) goto L_0x0127
            r19.mo33847n()
        L_0x0127:
            n2.h$a r3 = p363n2.C21593h.C21594a.SLACK
            r5 = 0
            n2.h r3 = r0.mo33834a(r3, r5)
            int r5 = r0.f61135a
            int r5 = r5 + r4
            r0.f61135a = r5
            int r7 = r0.f61142h
            int r7 = r7 + r4
            r0.f61142h = r7
            r3.f61151a = r5
            n2.c r7 = r0.f61145k
            n2.h[] r7 = r7.f61133c
            r7[r5] = r3
            r1.f61127a = r3
            r19.mo33841h(r20)
            n2.e$a r5 = r0.f61148n
            n2.b r5 = (p363n2.C21586b) r5
            r5.getClass()
            r7 = 0
            r5.f61127a = r7
            n2.a r7 = r5.f61129c
            r7.mo33821b()
            r7 = 0
        L_0x0155:
            n2.a r8 = r1.f61129c
            int r9 = r8.f61117a
            if (r7 >= r9) goto L_0x0182
            n2.h r8 = r8.mo33824e(r7)
            n2.a r9 = r1.f61129c
            int r10 = r9.f61124h
            r11 = 0
        L_0x0164:
            r12 = -1
            if (r10 == r12) goto L_0x0179
            int r12 = r9.f61117a
            if (r11 >= r12) goto L_0x0179
            if (r11 != r7) goto L_0x0172
            float[] r9 = r9.f61123g
            r9 = r9[r10]
            goto L_0x017a
        L_0x0172:
            int[] r12 = r9.f61122f
            r10 = r12[r10]
            int r11 = r11 + 1
            goto L_0x0164
        L_0x0179:
            r9 = 0
        L_0x017a:
            n2.a r10 = r5.f61129c
            r10.mo33820a(r8, r9, r4)
            int r7 = r7 + 1
            goto L_0x0155
        L_0x0182:
            n2.e$a r5 = r0.f61148n
            r0.mo33849p(r5, r4)
            int r5 = r3.f61152b
            r7 = -1
            if (r5 != r7) goto L_0x01aa
            n2.h r5 = r1.f61127a
            if (r5 != r3) goto L_0x019c
            n2.a r5 = r1.f61129c
            r7 = 0
            n2.h r3 = r5.mo33823d(r7, r3)
            if (r3 == 0) goto L_0x019c
            r1.mo33831d(r3)
        L_0x019c:
            boolean r3 = r1.f61130d
            if (r3 != 0) goto L_0x01a5
            n2.h r3 = r1.f61127a
            r3.mo33855d(r1)
        L_0x01a5:
            int r3 = r0.f61143i
            int r3 = r3 - r4
            r0.f61143i = r3
        L_0x01aa:
            r3 = 1
            goto L_0x01ad
        L_0x01ac:
            r3 = 0
        L_0x01ad:
            n2.h r5 = r1.f61127a
            if (r5 == 0) goto L_0x01bc
            n2.h$a r5 = r5.f61156f
            if (r5 == r2) goto L_0x01bd
            float r2 = r1.f61128b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x01bc
            goto L_0x01bd
        L_0x01bc:
            r4 = 0
        L_0x01bd:
            if (r4 != 0) goto L_0x01c0
            return
        L_0x01c0:
            r5 = r3
            goto L_0x01c3
        L_0x01c2:
            r5 = 0
        L_0x01c3:
            if (r5 != 0) goto L_0x01c8
            r19.mo33841h(r20)
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p363n2.C21589e.mo33836c(n2.b):void");
    }

    /* renamed from: d */
    public C21586b mo33837d(C21593h hVar, C21593h hVar2, int i, int i2) {
        C21586b k = mo33844k();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            k.f61128b = (float) i;
        }
        if (!z) {
            k.f61129c.mo33825f(hVar, -1.0f);
            k.f61129c.mo33825f(hVar2, 1.0f);
        } else {
            k.f61129c.mo33825f(hVar, 1.0f);
            k.f61129c.mo33825f(hVar2, -1.0f);
        }
        if (i2 != 6) {
            k.mo33828a(this, i2);
        }
        mo33836c(k);
        return k;
    }

    /* renamed from: e */
    public void mo33838e(C21593h hVar, int i) {
        int i2 = hVar.f61152b;
        if (i2 != -1) {
            C21586b bVar = this.f61139e[i2];
            if (bVar.f61130d) {
                bVar.f61128b = (float) i;
            } else if (bVar.f61129c.f61117a == 0) {
                bVar.f61130d = true;
                bVar.f61128b = (float) i;
            } else {
                C21586b k = mo33844k();
                if (i < 0) {
                    k.f61128b = (float) (i * -1);
                    k.f61129c.mo33825f(hVar, 1.0f);
                } else {
                    k.f61128b = (float) i;
                    k.f61129c.mo33825f(hVar, -1.0f);
                }
                mo33836c(k);
            }
        } else {
            C21586b k2 = mo33844k();
            k2.f61127a = hVar;
            float f = (float) i;
            hVar.f61154d = f;
            k2.f61128b = f;
            k2.f61130d = true;
            mo33836c(k2);
        }
    }

    /* renamed from: f */
    public void mo33839f(C21593h hVar, C21593h hVar2, int i, int i2) {
        C21586b k = mo33844k();
        C21593h l = mo33845l();
        l.f61153c = 0;
        k.mo33829b(hVar, hVar2, l, i);
        if (i2 != 6) {
            k.f61129c.mo33825f(mo33842i(i2, (String) null), (float) ((int) (k.f61129c.mo33822c(l) * -1.0f)));
        }
        mo33836c(k);
    }

    /* renamed from: g */
    public void mo33840g(C21593h hVar, C21593h hVar2, int i, int i2) {
        C21586b k = mo33844k();
        C21593h l = mo33845l();
        l.f61153c = 0;
        k.mo33830c(hVar, hVar2, l, i);
        if (i2 != 6) {
            k.f61129c.mo33825f(mo33842i(i2, (String) null), (float) ((int) (k.f61129c.mo33822c(l) * -1.0f)));
        }
        mo33836c(k);
    }

    /* renamed from: h */
    public final void mo33841h(C21586b bVar) {
        C21586b[] bVarArr = this.f61139e;
        int i = this.f61143i;
        C21586b bVar2 = bVarArr[i];
        if (bVar2 != null) {
            C21592g gVar = (C21592g) this.f61145k.f61131a;
            int i2 = gVar.f61150b;
            Object[] objArr = gVar.f61149a;
            if (i2 < objArr.length) {
                objArr[i2] = bVar2;
                gVar.f61150b = i2 + 1;
            }
        }
        bVarArr[i] = bVar;
        C21593h hVar = bVar.f61127a;
        hVar.f61152b = i;
        this.f61143i = i + 1;
        hVar.mo33855d(bVar);
    }

    /* renamed from: i */
    public C21593h mo33842i(int i, String str) {
        if (this.f61142h + 1 >= this.f61138d) {
            mo33847n();
        }
        C21593h a = mo33834a(C21593h.C21594a.ERROR, str);
        int i2 = this.f61135a + 1;
        this.f61135a = i2;
        this.f61142h++;
        a.f61151a = i2;
        a.f61153c = i;
        this.f61145k.f61133c[i2] = a;
        ((C21588d) this.f61136b).mo33833e(a);
        return a;
    }

    /* renamed from: j */
    public C21593h mo33843j(Object obj) {
        C21593h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f61142h + 1 >= this.f61138d) {
            mo33847n();
        }
        if (obj instanceof C21735e) {
            C21735e eVar = (C21735e) obj;
            hVar = eVar.f61538i;
            if (hVar == null) {
                eVar.mo34028e(this.f61145k);
                hVar = eVar.f61538i;
            }
            int i = hVar.f61151a;
            if (i == -1 || i > this.f61135a || this.f61145k.f61133c[i] == null) {
                if (i != -1) {
                    hVar.mo33854c();
                }
                int i2 = this.f61135a + 1;
                this.f61135a = i2;
                this.f61142h++;
                hVar.f61151a = i2;
                hVar.f61156f = C21593h.C21594a.UNRESTRICTED;
                this.f61145k.f61133c[i2] = hVar;
            }
        }
        return hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: n2.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p363n2.C21586b mo33844k() {
        /*
            r6 = this;
            n2.c r0 = r6.f61145k
            n2.f<n2.b> r1 = r0.f61131a
            n2.g r1 = (p363n2.C21592g) r1
            int r2 = r1.f61150b
            r3 = 0
            if (r2 <= 0) goto L_0x0016
            int r2 = r2 + -1
            java.lang.Object[] r4 = r1.f61149a
            r5 = r4[r2]
            r4[r2] = r3
            r1.f61150b = r2
            goto L_0x0017
        L_0x0016:
            r5 = r3
        L_0x0017:
            n2.b r5 = (p363n2.C21586b) r5
            if (r5 != 0) goto L_0x0021
            n2.b r5 = new n2.b
            r5.<init>(r0)
            goto L_0x002e
        L_0x0021:
            r5.f61127a = r3
            n2.a r0 = r5.f61129c
            r0.mo33821b()
            r0 = 0
            r5.f61128b = r0
            r0 = 0
            r5.f61130d = r0
        L_0x002e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p363n2.C21589e.mo33844k():n2.b");
    }

    /* renamed from: l */
    public C21593h mo33845l() {
        if (this.f61142h + 1 >= this.f61138d) {
            mo33847n();
        }
        C21593h a = mo33834a(C21593h.C21594a.SLACK, (String) null);
        int i = this.f61135a + 1;
        this.f61135a = i;
        this.f61142h++;
        a.f61151a = i;
        this.f61145k.f61133c[i] = a;
        return a;
    }

    /* renamed from: m */
    public int mo33846m(Object obj) {
        C21593h hVar = ((C21735e) obj).f61538i;
        if (hVar != null) {
            return (int) (hVar.f61154d + 0.5f);
        }
        return 0;
    }

    /* renamed from: n */
    public final void mo33847n() {
        int i = this.f61137c * 2;
        this.f61137c = i;
        this.f61139e = (C21586b[]) Arrays.copyOf(this.f61139e, i);
        C21587c cVar = this.f61145k;
        cVar.f61133c = (C21593h[]) Arrays.copyOf(cVar.f61133c, this.f61137c);
        int i2 = this.f61137c;
        this.f61141g = new boolean[i2];
        this.f61138d = i2;
        this.f61144j = i2;
    }

    /* renamed from: o */
    public void mo33848o(C21590a aVar) {
        float f;
        int i;
        boolean z;
        C21590a aVar2 = aVar;
        mo33851r((C21586b) aVar2);
        C21593h.C21594a aVar3 = C21593h.C21594a.UNRESTRICTED;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 >= this.f61143i) {
                z = false;
                break;
            }
            C21586b bVar = this.f61139e[i2];
            if (bVar.f61127a.f61156f != aVar3 && bVar.f61128b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                while (i4 < this.f61143i) {
                    C21586b bVar2 = this.f61139e[i4];
                    if (bVar2.f61127a.f61156f != aVar3 && !bVar2.f61130d && bVar2.f61128b < f) {
                        int i8 = 1;
                        while (i8 < this.f61142h) {
                            C21593h hVar = this.f61145k.f61133c[i8];
                            float c = bVar2.f61129c.mo33822c(hVar);
                            if (c > f) {
                                for (int i9 = 0; i9 < 7; i9++) {
                                    float f3 = hVar.f61155e[i9] / c;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i7 = i9;
                                        f2 = f3;
                                        i5 = i4;
                                        i6 = i8;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i4++;
                    f = 0.0f;
                }
                if (i5 != -1) {
                    C21586b bVar3 = this.f61139e[i5];
                    bVar3.f61127a.f61152b = -1;
                    bVar3.mo33831d(this.f61145k.f61133c[i6]);
                    C21593h hVar2 = bVar3.f61127a;
                    hVar2.f61152b = i5;
                    hVar2.mo33855d(bVar3);
                } else {
                    z2 = true;
                }
                if (i3 > this.f61142h / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        mo33849p(aVar2, false);
        for (int i15 = 0; i15 < this.f61143i; i15++) {
            C21586b bVar4 = this.f61139e[i15];
            bVar4.f61127a.f61154d = bVar4.f61128b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0 A[SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo33849p(p363n2.C21589e.C21590a r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = 0
        L_0x0004:
            int r3 = r0.f61142h
            if (r2 >= r3) goto L_0x000f
            boolean[] r3 = r0.f61141g
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0004
        L_0x000f:
            r2 = 0
            r3 = 0
        L_0x0011:
            if (r2 != 0) goto L_0x00bc
            int r3 = r3 + 1
            int r4 = r0.f61142h
            int r4 = r4 * 2
            if (r3 < r4) goto L_0x001c
            return r3
        L_0x001c:
            r4 = r17
            n2.b r4 = (p363n2.C21586b) r4
            n2.h r4 = r4.f61127a
            r5 = 1
            if (r4 == 0) goto L_0x0031
            boolean[] r4 = r0.f61141g
            r6 = r17
            n2.b r6 = (p363n2.C21586b) r6
            n2.h r6 = r6.f61127a
            int r6 = r6.f61151a
            r4[r6] = r5
        L_0x0031:
            boolean[] r4 = r0.f61141g
            r6 = r17
            n2.b r6 = (p363n2.C21586b) r6
            n2.a r6 = r6.f61129c
            r7 = 0
            n2.h r4 = r6.mo33823d(r4, r7)
            if (r4 == 0) goto L_0x004b
            boolean[] r6 = r0.f61141g
            int r7 = r4.f61151a
            boolean r8 = r6[r7]
            if (r8 == 0) goto L_0x0049
            return r3
        L_0x0049:
            r6[r7] = r5
        L_0x004b:
            if (r4 == 0) goto L_0x00b9
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = -1
            r8 = 0
            r9 = -1
        L_0x0053:
            int r10 = r0.f61143i
            if (r8 >= r10) goto L_0x00a3
            n2.b[] r10 = r0.f61139e
            r10 = r10[r8]
            n2.h r11 = r10.f61127a
            n2.h$a r11 = r11.f61156f
            n2.h$a r12 = p363n2.C21593h.C21594a.UNRESTRICTED
            if (r11 != r12) goto L_0x0064
            goto L_0x00a0
        L_0x0064:
            boolean r11 = r10.f61130d
            if (r11 == 0) goto L_0x0069
            goto L_0x00a0
        L_0x0069:
            n2.a r11 = r10.f61129c
            int r12 = r11.f61124h
            if (r12 != r7) goto L_0x0070
            goto L_0x0088
        L_0x0070:
            r13 = 0
        L_0x0071:
            if (r12 == r7) goto L_0x0088
            int r14 = r11.f61117a
            if (r13 >= r14) goto L_0x0088
            int[] r14 = r11.f61121e
            r14 = r14[r12]
            int r15 = r4.f61151a
            if (r14 != r15) goto L_0x0081
            r11 = 1
            goto L_0x0089
        L_0x0081:
            int[] r14 = r11.f61122f
            r12 = r14[r12]
            int r13 = r13 + 1
            goto L_0x0071
        L_0x0088:
            r11 = 0
        L_0x0089:
            if (r11 == 0) goto L_0x00a0
            n2.a r11 = r10.f61129c
            float r11 = r11.mo33822c(r4)
            r12 = 0
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x00a0
            float r10 = r10.f61128b
            float r10 = -r10
            float r10 = r10 / r11
            int r11 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r11 >= 0) goto L_0x00a0
            r9 = r8
            r6 = r10
        L_0x00a0:
            int r8 = r8 + 1
            goto L_0x0053
        L_0x00a3:
            if (r9 <= r7) goto L_0x00b9
            n2.b[] r5 = r0.f61139e
            r5 = r5[r9]
            n2.h r6 = r5.f61127a
            r6.f61152b = r7
            r5.mo33831d(r4)
            n2.h r4 = r5.f61127a
            r4.f61152b = r9
            r4.mo33855d(r5)
            goto L_0x0011
        L_0x00b9:
            r2 = 1
            goto L_0x0011
        L_0x00bc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p363n2.C21589e.mo33849p(n2.e$a, boolean):int");
    }

    /* renamed from: q */
    public void mo33850q() {
        C21587c cVar;
        int i = 0;
        while (true) {
            cVar = this.f61145k;
            C21593h[] hVarArr = cVar.f61133c;
            if (i >= hVarArr.length) {
                break;
            }
            C21593h hVar = hVarArr[i];
            if (hVar != null) {
                hVar.mo33854c();
            }
            i++;
        }
        C21591f<C21593h> fVar = cVar.f61132b;
        C21593h[] hVarArr2 = this.f61146l;
        int i2 = this.f61147m;
        C21592g gVar = (C21592g) fVar;
        gVar.getClass();
        if (i2 > hVarArr2.length) {
            i2 = hVarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C21593h hVar2 = hVarArr2[i3];
            int i4 = gVar.f61150b;
            Object[] objArr = gVar.f61149a;
            if (i4 < objArr.length) {
                objArr[i4] = hVar2;
                gVar.f61150b = i4 + 1;
            }
        }
        this.f61147m = 0;
        Arrays.fill(this.f61145k.f61133c, (Object) null);
        this.f61135a = 0;
        C21586b bVar = (C21586b) this.f61136b;
        bVar.f61129c.mo33821b();
        bVar.f61127a = null;
        bVar.f61128b = 0.0f;
        this.f61142h = 1;
        for (int i5 = 0; i5 < this.f61143i; i5++) {
            this.f61139e[i5].getClass();
        }
        int i6 = 0;
        while (true) {
            C21586b[] bVarArr = this.f61139e;
            if (i6 < bVarArr.length) {
                C21586b bVar2 = bVarArr[i6];
                if (bVar2 != null) {
                    C21592g gVar2 = (C21592g) this.f61145k.f61131a;
                    int i7 = gVar2.f61150b;
                    Object[] objArr2 = gVar2.f61149a;
                    if (i7 < objArr2.length) {
                        objArr2[i7] = bVar2;
                        gVar2.f61150b = i7 + 1;
                    }
                }
                bVarArr[i6] = null;
                i6++;
            } else {
                this.f61143i = 0;
                return;
            }
        }
    }

    /* renamed from: r */
    public final void mo33851r(C21586b bVar) {
        if (this.f61143i > 0) {
            C21585a aVar = bVar.f61129c;
            C21586b[] bVarArr = this.f61139e;
            int i = aVar.f61124h;
            loop0:
            while (true) {
                int i2 = 0;
                int i3 = 0;
                while (i != -1 && i3 < aVar.f61117a) {
                    C21593h hVar = aVar.f61119c.f61133c[aVar.f61121e[i]];
                    if (hVar.f61152b != -1) {
                        float f = aVar.f61123g[i];
                        aVar.mo33826g(hVar, true);
                        C21586b bVar2 = bVarArr[hVar.f61152b];
                        if (!bVar2.f61130d) {
                            C21585a aVar2 = bVar2.f61129c;
                            int i4 = aVar2.f61124h;
                            while (i4 != -1 && i2 < aVar2.f61117a) {
                                aVar.mo33820a(aVar.f61119c.f61133c[aVar2.f61121e[i4]], aVar2.f61123g[i4] * f, true);
                                i4 = aVar2.f61122f[i4];
                                i2++;
                            }
                        }
                        bVar.f61128b += bVar2.f61128b * f;
                        bVar2.f61127a.mo33853b(bVar);
                        i = aVar.f61124h;
                    } else {
                        i = aVar.f61122f[i];
                        i3++;
                    }
                }
            }
            if (bVar.f61129c.f61117a == 0) {
                bVar.f61130d = true;
            }
        }
    }
}
