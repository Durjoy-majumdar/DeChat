package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sc0 */
public class C101841sc0 extends C47465a {

    /* renamed from: A */
    public C64659qk1 f299399A;

    /* renamed from: B */
    public C64581nk1 f299400B;

    /* renamed from: C */
    public C64719t23 f299401C;

    /* renamed from: D */
    public C64730tk1 f299402D;

    /* renamed from: E */
    public C64730tk1 f299403E;

    /* renamed from: F */
    public C64831xk1 f299404F;

    /* renamed from: d */
    public C101846tc0 f299405d;

    /* renamed from: e */
    public C101871zc0 f299406e;

    /* renamed from: f */
    public C101756ae0 f299407f;

    /* renamed from: g */
    public C101793jd0 f299408g;

    /* renamed from: h */
    public C101850ud0 f299409h;

    /* renamed from: i */
    public String f299410i;

    /* renamed from: j */
    public String f299411j;

    /* renamed from: n */
    public String f299412n;

    /* renamed from: o */
    public long f299413o;

    /* renamed from: p */
    public boolean f299414p = false;

    /* renamed from: q */
    public int f299415q = -1;

    /* renamed from: r */
    public boolean f299416r = false;

    /* renamed from: s */
    public long f299417s;

    /* renamed from: t */
    public boolean f299418t = false;

    /* renamed from: u */
    public C77911cd0 f299419u;

    /* renamed from: v */
    public C90431pc0 f299420v;

    /* renamed from: w */
    public C101755ad0 f299421w;

    /* renamed from: x */
    public C101755ad0 f299422x;

    /* renamed from: y */
    public C64682rk1 f299423y;

    /* renamed from: z */
    public C64623p81 f299424z;

    /* renamed from: A */
    public final C101841sc0 mo141280A(C101756ae0 ae02) {
        this.f299407f = ae02;
        return this;
    }

    /* renamed from: b */
    public final C90431pc0 mo141281b() {
        return this.f299420v;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101841sc0)) {
            return false;
        }
        C101841sc0 sc02 = (C101841sc0) aVar;
        return C46238a.m51546a(this.f299405d, sc02.f299405d) && C46238a.m51546a(this.f299406e, sc02.f299406e) && C46238a.m51546a(this.f299407f, sc02.f299407f) && C46238a.m51546a(this.f299408g, sc02.f299408g) && C46238a.m51546a(this.f299409h, sc02.f299409h) && C46238a.m51546a(this.f299410i, sc02.f299410i) && C46238a.m51546a(this.f299411j, sc02.f299411j) && C46238a.m51546a(this.f299412n, sc02.f299412n) && C46238a.m51546a(Long.valueOf(this.f299413o), Long.valueOf(sc02.f299413o)) && C46238a.m51546a(Integer.valueOf(this.f299415q), Integer.valueOf(sc02.f299415q)) && C46238a.m51546a(Long.valueOf(this.f299417s), Long.valueOf(sc02.f299417s)) && C46238a.m51546a(this.f299419u, sc02.f299419u) && C46238a.m51546a(this.f299420v, sc02.f299420v) && C46238a.m51546a(this.f299421w, sc02.f299421w) && C46238a.m51546a(this.f299422x, sc02.f299422x) && C46238a.m51546a(this.f299423y, sc02.f299423y) && C46238a.m51546a(this.f299424z, sc02.f299424z) && C46238a.m51546a(this.f299399A, sc02.f299399A) && C46238a.m51546a(this.f299400B, sc02.f299400B) && C46238a.m51546a(this.f299401C, sc02.f299401C) && C46238a.m51546a(this.f299402D, sc02.f299402D) && C46238a.m51546a(this.f299403E, sc02.f299403E) && C46238a.m51546a(this.f299404F, sc02.f299404F);
    }

    /* renamed from: d */
    public final C101846tc0 mo141282d() {
        return this.f299405d;
    }

    /* renamed from: f */
    public final C64730tk1 mo141283f() {
        return this.f299403E;
    }

    /* renamed from: j */
    public final C64581nk1 mo141284j() {
        return this.f299400B;
    }

    /* renamed from: k */
    public final C64682rk1 mo141285k() {
        return this.f299423y;
    }

    /* renamed from: l */
    public final C64623p81 mo141286l() {
        return this.f299424z;
    }

    /* renamed from: m */
    public final C64659qk1 mo141287m() {
        return this.f299399A;
    }

    /* renamed from: n */
    public final C64831xk1 mo141288n() {
        return this.f299404F;
    }

    /* renamed from: o */
    public final C64730tk1 mo141289o() {
        return this.f299402D;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C101846tc0 tc02 = this.f299405d;
            if (tc02 != null) {
                aVar.mo74322i(1, tc02.computeSize());
                this.f299405d.writeFields(aVar);
            }
            C101871zc0 zc02 = this.f299406e;
            if (zc02 != null) {
                aVar.mo74322i(2, zc02.computeSize());
                this.f299406e.writeFields(aVar);
            }
            C101756ae0 ae02 = this.f299407f;
            if (ae02 != null) {
                aVar.mo74322i(3, ae02.computeSize());
                this.f299407f.writeFields(aVar);
            }
            C101793jd0 jd02 = this.f299408g;
            if (jd02 != null) {
                aVar.mo74322i(4, jd02.computeSize());
                this.f299408g.writeFields(aVar);
            }
            C101850ud0 ud02 = this.f299409h;
            if (ud02 != null) {
                aVar.mo74322i(5, ud02.computeSize());
                this.f299409h.writeFields(aVar);
            }
            String str = this.f299410i;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f299411j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            String str3 = this.f299412n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            if (this.f299414p) {
                aVar.mo74321h(9, this.f299413o);
            }
            if (this.f299416r) {
                aVar.mo74318e(101, this.f299415q);
            }
            if (this.f299418t) {
                aVar.mo74321h(11, this.f299417s);
            }
            C77911cd0 cd02 = this.f299419u;
            if (cd02 != null) {
                aVar.mo74322i(12, cd02.computeSize());
                this.f299419u.writeFields(aVar);
            }
            C90431pc0 pc02 = this.f299420v;
            if (pc02 != null) {
                aVar.mo74322i(13, pc02.computeSize());
                this.f299420v.writeFields(aVar);
            }
            C101755ad0 ad02 = this.f299421w;
            if (ad02 != null) {
                aVar.mo74322i(14, ad02.computeSize());
                this.f299421w.writeFields(aVar);
            }
            C101755ad0 ad03 = this.f299422x;
            if (ad03 != null) {
                aVar.mo74322i(15, ad03.computeSize());
                this.f299422x.writeFields(aVar);
            }
            C64682rk1 rk12 = this.f299423y;
            if (rk12 != null) {
                aVar.mo74322i(16, rk12.computeSize());
                this.f299423y.writeFields(aVar);
            }
            C64623p81 p812 = this.f299424z;
            if (p812 != null) {
                aVar.mo74322i(17, p812.computeSize());
                this.f299424z.writeFields(aVar);
            }
            C64659qk1 qk12 = this.f299399A;
            if (qk12 != null) {
                aVar.mo74322i(18, qk12.computeSize());
                this.f299399A.writeFields(aVar);
            }
            C64581nk1 nk12 = this.f299400B;
            if (nk12 != null) {
                aVar.mo74322i(19, nk12.computeSize());
                this.f299400B.writeFields(aVar);
            }
            C64719t23 t232 = this.f299401C;
            if (t232 != null) {
                aVar.mo74322i(20, t232.computeSize());
                this.f299401C.writeFields(aVar);
            }
            C64730tk1 tk12 = this.f299402D;
            if (tk12 != null) {
                aVar.mo74322i(21, tk12.computeSize());
                this.f299402D.writeFields(aVar);
            }
            C64730tk1 tk13 = this.f299403E;
            if (tk13 != null) {
                aVar.mo74322i(22, tk13.computeSize());
                this.f299403E.writeFields(aVar);
            }
            C64831xk1 xk12 = this.f299404F;
            if (xk12 != null) {
                aVar.mo74322i(23, xk12.computeSize());
                this.f299404F.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C101846tc0 tc03 = this.f299405d;
            if (tc03 != null) {
                i3 = C52418a.m58682i(1, tc03.computeSize()) + 0;
            }
            C101871zc0 zc03 = this.f299406e;
            if (zc03 != null) {
                i3 += C52418a.m58682i(2, zc03.computeSize());
            }
            C101756ae0 ae03 = this.f299407f;
            if (ae03 != null) {
                i3 += C52418a.m58682i(3, ae03.computeSize());
            }
            C101793jd0 jd03 = this.f299408g;
            if (jd03 != null) {
                i3 += C52418a.m58682i(4, jd03.computeSize());
            }
            C101850ud0 ud03 = this.f299409h;
            if (ud03 != null) {
                i3 += C52418a.m58682i(5, ud03.computeSize());
            }
            String str4 = this.f299410i;
            if (str4 != null) {
                i3 += C52418a.m58683j(6, str4);
            }
            String str5 = this.f299411j;
            if (str5 != null) {
                i3 += C52418a.m58683j(7, str5);
            }
            String str6 = this.f299412n;
            if (str6 != null) {
                i3 += C52418a.m58683j(8, str6);
            }
            if (this.f299414p) {
                i3 += C52418a.m58681h(9, this.f299413o);
            }
            if (this.f299416r) {
                i3 += C52418a.m58678e(101, this.f299415q);
            }
            if (this.f299418t) {
                i3 += C52418a.m58681h(11, this.f299417s);
            }
            C77911cd0 cd03 = this.f299419u;
            if (cd03 != null) {
                i3 += C52418a.m58682i(12, cd03.computeSize());
            }
            C90431pc0 pc03 = this.f299420v;
            if (pc03 != null) {
                i3 += C52418a.m58682i(13, pc03.computeSize());
            }
            C101755ad0 ad04 = this.f299421w;
            if (ad04 != null) {
                i3 += C52418a.m58682i(14, ad04.computeSize());
            }
            C101755ad0 ad05 = this.f299422x;
            if (ad05 != null) {
                i3 += C52418a.m58682i(15, ad05.computeSize());
            }
            C64682rk1 rk13 = this.f299423y;
            if (rk13 != null) {
                i3 += C52418a.m58682i(16, rk13.computeSize());
            }
            C64623p81 p813 = this.f299424z;
            if (p813 != null) {
                i3 += C52418a.m58682i(17, p813.computeSize());
            }
            C64659qk1 qk13 = this.f299399A;
            if (qk13 != null) {
                i3 += C52418a.m58682i(18, qk13.computeSize());
            }
            C64581nk1 nk13 = this.f299400B;
            if (nk13 != null) {
                i3 += C52418a.m58682i(19, nk13.computeSize());
            }
            C64719t23 t233 = this.f299401C;
            if (t233 != null) {
                i3 += C52418a.m58682i(20, t233.computeSize());
            }
            C64730tk1 tk14 = this.f299402D;
            if (tk14 != null) {
                i3 += C52418a.m58682i(21, tk14.computeSize());
            }
            C64730tk1 tk15 = this.f299403E;
            if (tk15 != null) {
                i3 += C52418a.m58682i(22, tk15.computeSize());
            }
            C64831xk1 xk13 = this.f299404F;
            return xk13 != null ? i3 + C52418a.m58682i(23, xk13.computeSize()) : i3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101841sc0 sc02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 101) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            byte[] bArr = j.get(i4);
                            C101846tc0 tc04 = new C101846tc0();
                            if (bArr != null && bArr.length > 0) {
                                tc04.parseFrom(bArr);
                            }
                            sc02.f299405d = tc04;
                        }
                        sc02.getClass();
                        return 0;
                    case 2:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C101871zc0 zc04 = new C101871zc0();
                            if (bArr2 != null && bArr2.length > 0) {
                                zc04.parseFrom(bArr2);
                            }
                            sc02.f299406e = zc04;
                        }
                        sc02.getClass();
                        return 0;
                    case 3:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            byte[] bArr3 = j3.get(i6);
                            C101756ae0 ae04 = new C101756ae0();
                            if (bArr3 != null && bArr3.length > 0) {
                                ae04.parseFrom(bArr3);
                            }
                            sc02.f299407f = ae04;
                        }
                        sc02.getClass();
                        return 0;
                    case 4:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i7 = 0; i7 < size4; i7++) {
                            byte[] bArr4 = j4.get(i7);
                            C101793jd0 jd04 = new C101793jd0();
                            if (bArr4 != null && bArr4.length > 0) {
                                jd04.parseFrom(bArr4);
                            }
                            sc02.f299408g = jd04;
                        }
                        sc02.getClass();
                        return 0;
                    case 5:
                        LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                        int size5 = j5.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            byte[] bArr5 = j5.get(i8);
                            C101850ud0 ud04 = new C101850ud0();
                            if (bArr5 != null && bArr5.length > 0) {
                                ud04.parseFrom(bArr5);
                            }
                            sc02.f299409h = ud04;
                        }
                        sc02.getClass();
                        return 0;
                    case 6:
                        sc02.f299410i = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        sc02.f299411j = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        sc02.f299412n = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        sc02.f299413o = aVar3.mo141631i(intValue);
                        sc02.f299414p = true;
                        return 0;
                    default:
                        switch (intValue) {
                            case 11:
                                sc02.f299417s = aVar3.mo141631i(intValue);
                                sc02.f299418t = true;
                                return 0;
                            case 12:
                                LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                                int size6 = j6.size();
                                for (int i9 = 0; i9 < size6; i9++) {
                                    byte[] bArr6 = j6.get(i9);
                                    C77911cd0 cd04 = new C77911cd0();
                                    if (bArr6 != null && bArr6.length > 0) {
                                        cd04.parseFrom(bArr6);
                                    }
                                    sc02.f299419u = cd04;
                                }
                                sc02.getClass();
                                return 0;
                            case 13:
                                LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                                int size7 = j7.size();
                                for (int i15 = 0; i15 < size7; i15++) {
                                    byte[] bArr7 = j7.get(i15);
                                    C90431pc0 pc04 = new C90431pc0();
                                    if (bArr7 != null && bArr7.length > 0) {
                                        pc04.parseFrom(bArr7);
                                    }
                                    sc02.f299420v = pc04;
                                }
                                sc02.getClass();
                                return 0;
                            case 14:
                                LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                                int size8 = j8.size();
                                for (int i16 = 0; i16 < size8; i16++) {
                                    byte[] bArr8 = j8.get(i16);
                                    C101755ad0 ad06 = new C101755ad0();
                                    if (bArr8 != null && bArr8.length > 0) {
                                        ad06.parseFrom(bArr8);
                                    }
                                    sc02.f299421w = ad06;
                                }
                                sc02.getClass();
                                return 0;
                            case 15:
                                LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                                int size9 = j9.size();
                                for (int i17 = 0; i17 < size9; i17++) {
                                    byte[] bArr9 = j9.get(i17);
                                    C101755ad0 ad07 = new C101755ad0();
                                    if (bArr9 != null && bArr9.length > 0) {
                                        ad07.parseFrom(bArr9);
                                    }
                                    sc02.f299422x = ad07;
                                }
                                sc02.getClass();
                                return 0;
                            case 16:
                                LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                                int size10 = j15.size();
                                for (int i18 = 0; i18 < size10; i18++) {
                                    byte[] bArr10 = j15.get(i18);
                                    C64682rk1 rk14 = new C64682rk1();
                                    if (bArr10 != null && bArr10.length > 0) {
                                        rk14.parseFrom(bArr10);
                                    }
                                    sc02.f299423y = rk14;
                                }
                                sc02.getClass();
                                return 0;
                            case 17:
                                LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                                int size11 = j16.size();
                                for (int i19 = 0; i19 < size11; i19++) {
                                    byte[] bArr11 = j16.get(i19);
                                    C64623p81 p814 = new C64623p81();
                                    if (bArr11 != null && bArr11.length > 0) {
                                        p814.parseFrom(bArr11);
                                    }
                                    sc02.f299424z = p814;
                                }
                                sc02.getClass();
                                return 0;
                            case 18:
                                LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                                int size12 = j17.size();
                                for (int i25 = 0; i25 < size12; i25++) {
                                    byte[] bArr12 = j17.get(i25);
                                    C64659qk1 qk14 = new C64659qk1();
                                    if (bArr12 != null && bArr12.length > 0) {
                                        qk14.parseFrom(bArr12);
                                    }
                                    sc02.f299399A = qk14;
                                }
                                sc02.getClass();
                                return 0;
                            case 19:
                                LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                                int size13 = j18.size();
                                for (int i26 = 0; i26 < size13; i26++) {
                                    byte[] bArr13 = j18.get(i26);
                                    C64581nk1 nk14 = new C64581nk1();
                                    if (bArr13 != null && bArr13.length > 0) {
                                        nk14.parseFrom(bArr13);
                                    }
                                    sc02.f299400B = nk14;
                                }
                                sc02.getClass();
                                return 0;
                            case 20:
                                LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                                int size14 = j19.size();
                                for (int i27 = 0; i27 < size14; i27++) {
                                    byte[] bArr14 = j19.get(i27);
                                    C64719t23 t234 = new C64719t23();
                                    if (bArr14 != null && bArr14.length > 0) {
                                        t234.parseFrom(bArr14);
                                    }
                                    sc02.f299401C = t234;
                                }
                                sc02.getClass();
                                return 0;
                            case 21:
                                LinkedList<byte[]> j25 = aVar3.mo141632j(intValue);
                                int size15 = j25.size();
                                for (int i28 = 0; i28 < size15; i28++) {
                                    byte[] bArr15 = j25.get(i28);
                                    C64730tk1 tk16 = new C64730tk1();
                                    if (bArr15 != null && bArr15.length > 0) {
                                        tk16.parseFrom(bArr15);
                                    }
                                    sc02.f299402D = tk16;
                                }
                                sc02.getClass();
                                return 0;
                            case 22:
                                LinkedList<byte[]> j26 = aVar3.mo141632j(intValue);
                                int size16 = j26.size();
                                for (int i29 = 0; i29 < size16; i29++) {
                                    byte[] bArr16 = j26.get(i29);
                                    C64730tk1 tk17 = new C64730tk1();
                                    if (bArr16 != null && bArr16.length > 0) {
                                        tk17.parseFrom(bArr16);
                                    }
                                    sc02.f299403E = tk17;
                                }
                                sc02.getClass();
                                return 0;
                            case 23:
                                LinkedList<byte[]> j27 = aVar3.mo141632j(intValue);
                                int size17 = j27.size();
                                for (int i35 = 0; i35 < size17; i35++) {
                                    byte[] bArr17 = j27.get(i35);
                                    C64831xk1 xk14 = new C64831xk1();
                                    if (bArr17 != null && bArr17.length > 0) {
                                        xk14.parseFrom(bArr17);
                                    }
                                    sc02.f299404F = xk14;
                                }
                                sc02.getClass();
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                sc02.f299415q = aVar3.mo141629g(intValue);
                sc02.f299416r = true;
                return 0;
            }
        }
    }

    /* renamed from: p */
    public final C101755ad0 mo141290p() {
        return this.f299421w;
    }

    /* renamed from: q */
    public final C101755ad0 mo141291q() {
        return this.f299422x;
    }

    /* renamed from: r */
    public final C64719t23 mo141292r() {
        return this.f299401C;
    }

    /* renamed from: s */
    public final C101793jd0 mo141293s() {
        return this.f299408g;
    }

    /* renamed from: t */
    public final C101850ud0 mo141294t() {
        return this.f299409h;
    }

    /* renamed from: u */
    public final C101841sc0 mo141295u(C90431pc0 pc02) {
        this.f299420v = pc02;
        return this;
    }

    /* renamed from: v */
    public final C101841sc0 mo141296v(C64730tk1 tk12) {
        this.f299403E = tk12;
        return this;
    }

    /* renamed from: w */
    public final C101841sc0 mo141297w(C64581nk1 nk12) {
        this.f299400B = nk12;
        return this;
    }

    /* renamed from: x */
    public final C101841sc0 mo141298x(C64623p81 p812) {
        this.f299424z = p812;
        return this;
    }

    /* renamed from: y */
    public final C101841sc0 mo141299y(C64730tk1 tk12) {
        this.f299402D = tk12;
        return this;
    }

    /* renamed from: z */
    public final C101841sc0 mo141300z(C64719t23 t232) {
        this.f299401C = t232;
        return this;
    }
}
