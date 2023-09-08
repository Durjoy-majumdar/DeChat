package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kd0 */
public class C101801kd0 extends C47465a {

    /* renamed from: A */
    public long f298602A;

    /* renamed from: B */
    public boolean f298603B = false;

    /* renamed from: C */
    public C101850ud0 f298604C;

    /* renamed from: D */
    public boolean f298605D = false;

    /* renamed from: E */
    public int f298606E;

    /* renamed from: F */
    public boolean f298607F = false;

    /* renamed from: G */
    public C77911cd0 f298608G;

    /* renamed from: H */
    public boolean f298609H = false;

    /* renamed from: I */
    public C90431pc0 f298610I;

    /* renamed from: J */
    public boolean f298611J = false;

    /* renamed from: K */
    public C101755ad0 f298612K;

    /* renamed from: L */
    public boolean f298613L = false;

    /* renamed from: M */
    public C64682rk1 f298614M;

    /* renamed from: N */
    public boolean f298615N = false;

    /* renamed from: d */
    public C101835rd0 f298616d;

    /* renamed from: e */
    public boolean f298617e = false;

    /* renamed from: f */
    public LinkedList<C101834rc0> f298618f = new LinkedList<>();

    /* renamed from: g */
    public boolean f298619g = false;

    /* renamed from: h */
    public C101871zc0 f298620h;

    /* renamed from: i */
    public boolean f298621i = false;

    /* renamed from: j */
    public C101756ae0 f298622j;

    /* renamed from: n */
    public boolean f298623n = false;

    /* renamed from: o */
    public String f298624o;

    /* renamed from: p */
    public boolean f298625p = false;

    /* renamed from: q */
    public String f298626q;

    /* renamed from: r */
    public boolean f298627r = false;

    /* renamed from: s */
    public String f298628s;

    /* renamed from: t */
    public boolean f298629t = false;

    /* renamed from: u */
    public long f298630u;

    /* renamed from: v */
    public boolean f298631v = false;

    /* renamed from: w */
    public int f298632w = -1;

    /* renamed from: x */
    public boolean f298633x = false;

    /* renamed from: y */
    public C101793jd0 f298634y;

    /* renamed from: z */
    public boolean f298635z = false;

    /* renamed from: b */
    public final C101835rd0 mo141209b() {
        return this.f298616d;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101801kd0)) {
            return false;
        }
        C101801kd0 kd02 = (C101801kd0) aVar;
        return C46238a.m51546a(this.f298616d, kd02.f298616d) && C46238a.m51546a(this.f298618f, kd02.f298618f) && C46238a.m51546a(this.f298620h, kd02.f298620h) && C46238a.m51546a(this.f298622j, kd02.f298622j) && C46238a.m51546a(this.f298624o, kd02.f298624o) && C46238a.m51546a(this.f298626q, kd02.f298626q) && C46238a.m51546a(this.f298628s, kd02.f298628s) && C46238a.m51546a(Long.valueOf(this.f298630u), Long.valueOf(kd02.f298630u)) && C46238a.m51546a(Integer.valueOf(this.f298632w), Integer.valueOf(kd02.f298632w)) && C46238a.m51546a(this.f298634y, kd02.f298634y) && C46238a.m51546a(Long.valueOf(this.f298602A), Long.valueOf(kd02.f298602A)) && C46238a.m51546a(this.f298604C, kd02.f298604C) && C46238a.m51546a(Integer.valueOf(this.f298606E), Integer.valueOf(kd02.f298606E)) && C46238a.m51546a(this.f298608G, kd02.f298608G) && C46238a.m51546a(this.f298610I, kd02.f298610I) && C46238a.m51546a(this.f298612K, kd02.f298612K) && C46238a.m51546a(this.f298614M, kd02.f298614M);
    }

    /* renamed from: d */
    public final C101801kd0 mo141210d(int i) {
        this.f298632w = i;
        this.f298633x = true;
        return this;
    }

    /* renamed from: f */
    public final C101801kd0 mo141211f(LinkedList<C101834rc0> linkedList) {
        this.f298618f = linkedList;
        this.f298619g = true;
        return this;
    }

    /* renamed from: j */
    public final C101801kd0 mo141212j(String str) {
        this.f298628s = str;
        this.f298629t = true;
        return this;
    }

    /* renamed from: k */
    public final C101801kd0 mo141213k(long j) {
        this.f298602A = j;
        this.f298603B = true;
        return this;
    }

    /* renamed from: l */
    public final C101801kd0 mo141214l(C64682rk1 rk12) {
        this.f298614M = rk12;
        this.f298615N = true;
        return this;
    }

    /* renamed from: m */
    public final C101801kd0 mo141215m(C101871zc0 zc02) {
        this.f298620h = zc02;
        this.f298621i = true;
        return this;
    }

    /* renamed from: n */
    public final C101801kd0 mo141216n(C101755ad0 ad02) {
        this.f298612K = ad02;
        this.f298613L = true;
        return this;
    }

    /* renamed from: o */
    public final C101801kd0 mo141217o(C77911cd0 cd02) {
        this.f298608G = cd02;
        this.f298609H = true;
        return this;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C101835rd0 rd02 = this.f298616d;
            if (rd02 != null) {
                aVar.mo74322i(1, rd02.computeSize());
                this.f298616d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f298618f);
            C101871zc0 zc02 = this.f298620h;
            if (zc02 != null) {
                aVar.mo74322i(3, zc02.computeSize());
                this.f298620h.writeFields(aVar);
            }
            C101756ae0 ae02 = this.f298622j;
            if (ae02 != null) {
                aVar.mo74322i(4, ae02.computeSize());
                this.f298622j.writeFields(aVar);
            }
            String str = this.f298624o;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f298626q;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f298628s;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            if (this.f298631v) {
                aVar.mo74321h(8, this.f298630u);
            }
            if (this.f298633x) {
                aVar.mo74318e(91, this.f298632w);
            }
            C101793jd0 jd02 = this.f298634y;
            if (jd02 != null) {
                aVar.mo74322i(10, jd02.computeSize());
                this.f298634y.writeFields(aVar);
            }
            if (this.f298603B) {
                aVar.mo74321h(11, this.f298602A);
            }
            C101850ud0 ud02 = this.f298604C;
            if (ud02 != null) {
                aVar.mo74322i(12, ud02.computeSize());
                this.f298604C.writeFields(aVar);
            }
            if (this.f298607F) {
                aVar.mo74318e(13, this.f298606E);
            }
            C77911cd0 cd02 = this.f298608G;
            if (cd02 != null) {
                aVar.mo74322i(14, cd02.computeSize());
                this.f298608G.writeFields(aVar);
            }
            C90431pc0 pc02 = this.f298610I;
            if (pc02 != null) {
                aVar.mo74322i(15, pc02.computeSize());
                this.f298610I.writeFields(aVar);
            }
            C101755ad0 ad02 = this.f298612K;
            if (ad02 != null) {
                aVar.mo74322i(16, ad02.computeSize());
                this.f298612K.writeFields(aVar);
            }
            C64682rk1 rk12 = this.f298614M;
            if (rk12 != null) {
                aVar.mo74322i(17, rk12.computeSize());
                this.f298614M.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C101835rd0 rd03 = this.f298616d;
            if (rd03 != null) {
                i3 = C52418a.m58682i(1, rd03.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f298618f);
            C101871zc0 zc03 = this.f298620h;
            if (zc03 != null) {
                g += C52418a.m58682i(3, zc03.computeSize());
            }
            C101756ae0 ae03 = this.f298622j;
            if (ae03 != null) {
                g += C52418a.m58682i(4, ae03.computeSize());
            }
            String str4 = this.f298624o;
            if (str4 != null) {
                g += C52418a.m58683j(5, str4);
            }
            String str5 = this.f298626q;
            if (str5 != null) {
                g += C52418a.m58683j(6, str5);
            }
            String str6 = this.f298628s;
            if (str6 != null) {
                g += C52418a.m58683j(7, str6);
            }
            if (this.f298631v) {
                g += C52418a.m58681h(8, this.f298630u);
            }
            if (this.f298633x) {
                g += C52418a.m58678e(91, this.f298632w);
            }
            C101793jd0 jd03 = this.f298634y;
            if (jd03 != null) {
                g += C52418a.m58682i(10, jd03.computeSize());
            }
            if (this.f298603B) {
                g += C52418a.m58681h(11, this.f298602A);
            }
            C101850ud0 ud03 = this.f298604C;
            if (ud03 != null) {
                g += C52418a.m58682i(12, ud03.computeSize());
            }
            if (this.f298607F) {
                g += C52418a.m58678e(13, this.f298606E);
            }
            C77911cd0 cd03 = this.f298608G;
            if (cd03 != null) {
                g += C52418a.m58682i(14, cd03.computeSize());
            }
            C90431pc0 pc03 = this.f298610I;
            if (pc03 != null) {
                g += C52418a.m58682i(15, pc03.computeSize());
            }
            C101755ad0 ad03 = this.f298612K;
            if (ad03 != null) {
                g += C52418a.m58682i(16, ad03.computeSize());
            }
            C64682rk1 rk13 = this.f298614M;
            return rk13 != null ? g + C52418a.m58682i(17, rk13.computeSize()) : g;
        } else if (i2 == 2) {
            this.f298618f.clear();
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
            C101801kd0 kd02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 91) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            byte[] bArr = j.get(i4);
                            C101835rd0 rd04 = new C101835rd0();
                            if (bArr != null && bArr.length > 0) {
                                rd04.parseFrom(bArr);
                            }
                            kd02.f298616d = rd04;
                        }
                        kd02.f298617e = true;
                        return 0;
                    case 2:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C101834rc0 rc02 = new C101834rc0();
                            if (bArr2 != null && bArr2.length > 0) {
                                rc02.parseFrom(bArr2);
                            }
                            kd02.f298618f.add(rc02);
                        }
                        kd02.f298619g = true;
                        return 0;
                    case 3:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            byte[] bArr3 = j3.get(i6);
                            C101871zc0 zc04 = new C101871zc0();
                            if (bArr3 != null && bArr3.length > 0) {
                                zc04.parseFrom(bArr3);
                            }
                            kd02.f298620h = zc04;
                        }
                        kd02.f298621i = true;
                        return 0;
                    case 4:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i7 = 0; i7 < size4; i7++) {
                            byte[] bArr4 = j4.get(i7);
                            C101756ae0 ae04 = new C101756ae0();
                            if (bArr4 != null && bArr4.length > 0) {
                                ae04.parseFrom(bArr4);
                            }
                            kd02.f298622j = ae04;
                        }
                        kd02.f298623n = true;
                        return 0;
                    case 5:
                        kd02.f298624o = aVar3.mo141633k(intValue);
                        kd02.f298625p = true;
                        return 0;
                    case 6:
                        kd02.f298626q = aVar3.mo141633k(intValue);
                        kd02.f298627r = true;
                        return 0;
                    case 7:
                        kd02.f298628s = aVar3.mo141633k(intValue);
                        kd02.f298629t = true;
                        return 0;
                    case 8:
                        kd02.f298630u = aVar3.mo141631i(intValue);
                        kd02.f298631v = true;
                        return 0;
                    default:
                        switch (intValue) {
                            case 10:
                                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                                int size5 = j5.size();
                                for (int i8 = 0; i8 < size5; i8++) {
                                    byte[] bArr5 = j5.get(i8);
                                    C101793jd0 jd04 = new C101793jd0();
                                    if (bArr5 != null && bArr5.length > 0) {
                                        jd04.parseFrom(bArr5);
                                    }
                                    kd02.f298634y = jd04;
                                }
                                kd02.f298635z = true;
                                return 0;
                            case 11:
                                kd02.f298602A = aVar3.mo141631i(intValue);
                                kd02.f298603B = true;
                                return 0;
                            case 12:
                                LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                                int size6 = j6.size();
                                for (int i9 = 0; i9 < size6; i9++) {
                                    byte[] bArr6 = j6.get(i9);
                                    C101850ud0 ud04 = new C101850ud0();
                                    if (bArr6 != null && bArr6.length > 0) {
                                        ud04.parseFrom(bArr6);
                                    }
                                    kd02.f298604C = ud04;
                                }
                                kd02.f298605D = true;
                                return 0;
                            case 13:
                                kd02.f298606E = aVar3.mo141629g(intValue);
                                kd02.f298607F = true;
                                return 0;
                            case 14:
                                LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                                int size7 = j7.size();
                                for (int i15 = 0; i15 < size7; i15++) {
                                    byte[] bArr7 = j7.get(i15);
                                    C77911cd0 cd04 = new C77911cd0();
                                    if (bArr7 != null && bArr7.length > 0) {
                                        cd04.parseFrom(bArr7);
                                    }
                                    kd02.f298608G = cd04;
                                }
                                kd02.f298609H = true;
                                return 0;
                            case 15:
                                LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                                int size8 = j8.size();
                                for (int i16 = 0; i16 < size8; i16++) {
                                    byte[] bArr8 = j8.get(i16);
                                    C90431pc0 pc04 = new C90431pc0();
                                    if (bArr8 != null && bArr8.length > 0) {
                                        pc04.parseFrom(bArr8);
                                    }
                                    kd02.f298610I = pc04;
                                }
                                kd02.f298611J = true;
                                return 0;
                            case 16:
                                LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                                int size9 = j9.size();
                                for (int i17 = 0; i17 < size9; i17++) {
                                    byte[] bArr9 = j9.get(i17);
                                    C101755ad0 ad04 = new C101755ad0();
                                    if (bArr9 != null && bArr9.length > 0) {
                                        ad04.parseFrom(bArr9);
                                    }
                                    kd02.f298612K = ad04;
                                }
                                kd02.f298613L = true;
                                return 0;
                            case 17:
                                LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                                int size10 = j15.size();
                                for (int i18 = 0; i18 < size10; i18++) {
                                    byte[] bArr10 = j15.get(i18);
                                    C64682rk1 rk14 = new C64682rk1();
                                    if (bArr10 != null && bArr10.length > 0) {
                                        rk14.parseFrom(bArr10);
                                    }
                                    kd02.f298614M = rk14;
                                }
                                kd02.f298615N = true;
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                kd02.f298632w = aVar3.mo141629g(intValue);
                kd02.f298633x = true;
                return 0;
            }
        }
    }

    /* renamed from: p */
    public final C101801kd0 mo141218p(C101793jd0 jd02) {
        this.f298634y = jd02;
        this.f298635z = true;
        return this;
    }

    /* renamed from: q */
    public final C101801kd0 mo141219q(C101835rd0 rd02) {
        this.f298616d = rd02;
        this.f298617e = true;
        return this;
    }

    /* renamed from: r */
    public final C101801kd0 mo141220r(String str) {
        this.f298626q = str;
        this.f298627r = true;
        return this;
    }

    /* renamed from: s */
    public final C101801kd0 mo141221s(C101756ae0 ae02) {
        this.f298622j = ae02;
        this.f298623n = true;
        return this;
    }

    /* renamed from: t */
    public final C101801kd0 mo141222t(int i) {
        this.f298606E = i;
        this.f298607F = true;
        return this;
    }
}
