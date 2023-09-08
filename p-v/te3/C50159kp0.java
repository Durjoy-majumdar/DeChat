package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kp0 */
public class C50159kp0 extends C101820nt3 {

    /* renamed from: A */
    public C49203dy1 f136925A;

    /* renamed from: B */
    public LinkedList<db4> f136926B = new LinkedList<>();

    /* renamed from: C */
    public C51796w72 f136927C;

    /* renamed from: D */
    public C64840xw0 f136928D;

    /* renamed from: E */
    public C50185kw0 f136929E;

    /* renamed from: F */
    public int f136930F;

    /* renamed from: G */
    public int f136931G;

    /* renamed from: H */
    public int f136932H;

    /* renamed from: I */
    public C51395th0 f136933I;

    /* renamed from: J */
    public int f136934J;

    /* renamed from: d */
    public C49842ig0 f136935d;

    /* renamed from: e */
    public C89349b f136936e;

    /* renamed from: f */
    public long f136937f;

    /* renamed from: g */
    public int f136938g;

    /* renamed from: h */
    public float f136939h;

    /* renamed from: i */
    public float f136940i;

    /* renamed from: j */
    public String f136941j;

    /* renamed from: n */
    public String f136942n;

    /* renamed from: o */
    public int f136943o;

    /* renamed from: p */
    public String f136944p;

    /* renamed from: q */
    public C50141kk1 f136945q;

    /* renamed from: r */
    public C51969xg0 f136946r;

    /* renamed from: s */
    public C89349b f136947s;

    /* renamed from: t */
    public C49704hh0 f136948t;

    /* renamed from: u */
    public String f136949u;

    /* renamed from: v */
    public String f136950v;

    /* renamed from: w */
    public C50018jp0 f136951w;

    /* renamed from: x */
    public String f136952x;

    /* renamed from: y */
    public C89349b f136953y;

    /* renamed from: z */
    public vd4 f136954z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50159kp0)) {
            return false;
        }
        C50159kp0 kp02 = (C50159kp0) aVar;
        return C46238a.m51546a(this.BaseRequest, kp02.BaseRequest) && C46238a.m51546a(this.f136935d, kp02.f136935d) && C46238a.m51546a(this.f136936e, kp02.f136936e) && C46238a.m51546a(Long.valueOf(this.f136937f), Long.valueOf(kp02.f136937f)) && C46238a.m51546a(Integer.valueOf(this.f136938g), Integer.valueOf(kp02.f136938g)) && C46238a.m51546a(Float.valueOf(this.f136939h), Float.valueOf(kp02.f136939h)) && C46238a.m51546a(Float.valueOf(this.f136940i), Float.valueOf(kp02.f136940i)) && C46238a.m51546a(this.f136941j, kp02.f136941j) && C46238a.m51546a(this.f136942n, kp02.f136942n) && C46238a.m51546a(Integer.valueOf(this.f136943o), Integer.valueOf(kp02.f136943o)) && C46238a.m51546a(this.f136944p, kp02.f136944p) && C46238a.m51546a(this.f136945q, kp02.f136945q) && C46238a.m51546a(this.f136946r, kp02.f136946r) && C46238a.m51546a(this.f136947s, kp02.f136947s) && C46238a.m51546a(this.f136948t, kp02.f136948t) && C46238a.m51546a(this.f136949u, kp02.f136949u) && C46238a.m51546a(this.f136950v, kp02.f136950v) && C46238a.m51546a(this.f136951w, kp02.f136951w) && C46238a.m51546a(this.f136952x, kp02.f136952x) && C46238a.m51546a(this.f136953y, kp02.f136953y) && C46238a.m51546a(this.f136954z, kp02.f136954z) && C46238a.m51546a(this.f136925A, kp02.f136925A) && C46238a.m51546a(this.f136926B, kp02.f136926B) && C46238a.m51546a(this.f136927C, kp02.f136927C) && C46238a.m51546a(this.f136928D, kp02.f136928D) && C46238a.m51546a(this.f136929E, kp02.f136929E) && C46238a.m51546a(Integer.valueOf(this.f136930F), Integer.valueOf(kp02.f136930F)) && C46238a.m51546a(Integer.valueOf(this.f136931G), Integer.valueOf(kp02.f136931G)) && C46238a.m51546a(Integer.valueOf(this.f136932H), Integer.valueOf(kp02.f136932H)) && C46238a.m51546a(this.f136933I, kp02.f136933I) && C46238a.m51546a(Integer.valueOf(this.f136934J), Integer.valueOf(kp02.f136934J));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f136935d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f136935d.writeFields(aVar);
            }
            C89349b bVar = this.f136936e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f136937f);
            aVar.mo74318e(5, this.f136938g);
            aVar.mo74317d(6, this.f136939h);
            aVar.mo74317d(7, this.f136940i);
            String str = this.f136941j;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            String str2 = this.f136942n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            aVar.mo74318e(10, this.f136943o);
            String str3 = this.f136944p;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            C50141kk1 kk12 = this.f136945q;
            if (kk12 != null) {
                aVar.mo74322i(12, kk12.computeSize());
                this.f136945q.writeFields(aVar);
            }
            C51969xg0 xg02 = this.f136946r;
            if (xg02 != null) {
                aVar.mo74322i(13, xg02.computeSize());
                this.f136946r.writeFields(aVar);
            }
            C89349b bVar2 = this.f136947s;
            if (bVar2 != null) {
                aVar.mo74315b(14, bVar2);
            }
            C49704hh0 hh02 = this.f136948t;
            if (hh02 != null) {
                aVar.mo74322i(15, hh02.computeSize());
                this.f136948t.writeFields(aVar);
            }
            String str4 = this.f136949u;
            if (str4 != null) {
                aVar.mo74323j(16, str4);
            }
            String str5 = this.f136950v;
            if (str5 != null) {
                aVar.mo74323j(17, str5);
            }
            C50018jp0 jp02 = this.f136951w;
            if (jp02 != null) {
                aVar.mo74322i(18, jp02.computeSize());
                this.f136951w.writeFields(aVar);
            }
            String str6 = this.f136952x;
            if (str6 != null) {
                aVar.mo74323j(19, str6);
            }
            C89349b bVar3 = this.f136953y;
            if (bVar3 != null) {
                aVar.mo74315b(20, bVar3);
            }
            vd4 vd4 = this.f136954z;
            if (vd4 != null) {
                aVar.mo74322i(21, vd4.computeSize());
                this.f136954z.writeFields(aVar);
            }
            C49203dy1 dy12 = this.f136925A;
            if (dy12 != null) {
                aVar.mo74322i(22, dy12.computeSize());
                this.f136925A.writeFields(aVar);
            }
            aVar.mo74320g(23, 8, this.f136926B);
            C51796w72 w722 = this.f136927C;
            if (w722 != null) {
                aVar.mo74322i(24, w722.computeSize());
                this.f136927C.writeFields(aVar);
            }
            C64840xw0 xw02 = this.f136928D;
            if (xw02 != null) {
                aVar.mo74322i(25, xw02.computeSize());
                this.f136928D.writeFields(aVar);
            }
            C50185kw0 kw02 = this.f136929E;
            if (kw02 != null) {
                aVar.mo74322i(26, kw02.computeSize());
                this.f136929E.writeFields(aVar);
            }
            aVar.mo74318e(27, this.f136930F);
            aVar.mo74318e(28, this.f136931G);
            aVar.mo74318e(29, this.f136932H);
            C51395th0 th02 = this.f136933I;
            if (th02 != null) {
                aVar.mo74322i(46, th02.computeSize());
                this.f136933I.writeFields(aVar);
            }
            aVar.mo74318e(47, this.f136934J);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f136935d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar4 = this.f136936e;
            if (bVar4 != null) {
                i3 += C52418a.m58675b(3, bVar4);
            }
            int h = i3 + C52418a.m58681h(4, this.f136937f) + C52418a.m58678e(5, this.f136938g) + C52418a.m58677d(6, this.f136939h) + C52418a.m58677d(7, this.f136940i);
            String str7 = this.f136941j;
            if (str7 != null) {
                h += C52418a.m58683j(8, str7);
            }
            String str8 = this.f136942n;
            if (str8 != null) {
                h += C52418a.m58683j(9, str8);
            }
            int e = h + C52418a.m58678e(10, this.f136943o);
            String str9 = this.f136944p;
            if (str9 != null) {
                e += C52418a.m58683j(11, str9);
            }
            C50141kk1 kk13 = this.f136945q;
            if (kk13 != null) {
                e += C52418a.m58682i(12, kk13.computeSize());
            }
            C51969xg0 xg03 = this.f136946r;
            if (xg03 != null) {
                e += C52418a.m58682i(13, xg03.computeSize());
            }
            C89349b bVar5 = this.f136947s;
            if (bVar5 != null) {
                e += C52418a.m58675b(14, bVar5);
            }
            C49704hh0 hh03 = this.f136948t;
            if (hh03 != null) {
                e += C52418a.m58682i(15, hh03.computeSize());
            }
            String str10 = this.f136949u;
            if (str10 != null) {
                e += C52418a.m58683j(16, str10);
            }
            String str11 = this.f136950v;
            if (str11 != null) {
                e += C52418a.m58683j(17, str11);
            }
            C50018jp0 jp03 = this.f136951w;
            if (jp03 != null) {
                e += C52418a.m58682i(18, jp03.computeSize());
            }
            String str12 = this.f136952x;
            if (str12 != null) {
                e += C52418a.m58683j(19, str12);
            }
            C89349b bVar6 = this.f136953y;
            if (bVar6 != null) {
                e += C52418a.m58675b(20, bVar6);
            }
            vd4 vd42 = this.f136954z;
            if (vd42 != null) {
                e += C52418a.m58682i(21, vd42.computeSize());
            }
            C49203dy1 dy13 = this.f136925A;
            if (dy13 != null) {
                e += C52418a.m58682i(22, dy13.computeSize());
            }
            int g = e + C52418a.m58680g(23, 8, this.f136926B);
            C51796w72 w723 = this.f136927C;
            if (w723 != null) {
                g += C52418a.m58682i(24, w723.computeSize());
            }
            C64840xw0 xw03 = this.f136928D;
            if (xw03 != null) {
                g += C52418a.m58682i(25, xw03.computeSize());
            }
            C50185kw0 kw03 = this.f136929E;
            if (kw03 != null) {
                g += C52418a.m58682i(26, kw03.computeSize());
            }
            int e2 = g + C52418a.m58678e(27, this.f136930F) + C52418a.m58678e(28, this.f136931G) + C52418a.m58678e(29, this.f136932H);
            C51395th0 th03 = this.f136933I;
            if (th03 != null) {
                e2 += C52418a.m58682i(46, th03.computeSize());
            }
            return e2 + C52418a.m58678e(47, this.f136934J);
        } else if (i2 == 2) {
            this.f136926B.clear();
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
            C50159kp0 kp02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 46) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i4 = 0; i4 < size; i4++) {
                    byte[] bArr = j.get(i4);
                    C51395th0 th04 = new C51395th0();
                    if (bArr != null && bArr.length > 0) {
                        th04.parseFrom(bArr);
                    }
                    kp02.f136933I = th04;
                }
                return 0;
            } else if (intValue != 47) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C90417ia iaVar3 = new C90417ia();
                            if (bArr2 != null && bArr2.length > 0) {
                                iaVar3.parseFrom(bArr2);
                            }
                            kp02.BaseRequest = iaVar3;
                        }
                        return 0;
                    case 2:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            byte[] bArr3 = j3.get(i6);
                            C49842ig0 ig04 = new C49842ig0();
                            if (bArr3 != null && bArr3.length > 0) {
                                ig04.parseFrom(bArr3);
                            }
                            kp02.f136935d = ig04;
                        }
                        return 0;
                    case 3:
                        kp02.f136936e = aVar3.mo141626d(intValue);
                        return 0;
                    case 4:
                        kp02.f136937f = aVar3.mo141631i(intValue);
                        return 0;
                    case 5:
                        kp02.f136938g = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        kp02.f136939h = aVar3.mo141628f(intValue);
                        return 0;
                    case 7:
                        kp02.f136940i = aVar3.mo141628f(intValue);
                        return 0;
                    case 8:
                        kp02.f136941j = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        kp02.f136942n = aVar3.mo141633k(intValue);
                        return 0;
                    case 10:
                        kp02.f136943o = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        kp02.f136944p = aVar3.mo141633k(intValue);
                        return 0;
                    case 12:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i7 = 0; i7 < size4; i7++) {
                            byte[] bArr4 = j4.get(i7);
                            C50141kk1 kk14 = new C50141kk1();
                            if (bArr4 != null && bArr4.length > 0) {
                                kk14.parseFrom(bArr4);
                            }
                            kp02.f136945q = kk14;
                        }
                        return 0;
                    case 13:
                        LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                        int size5 = j5.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            byte[] bArr5 = j5.get(i8);
                            C51969xg0 xg04 = new C51969xg0();
                            if (bArr5 != null && bArr5.length > 0) {
                                xg04.parseFrom(bArr5);
                            }
                            kp02.f136946r = xg04;
                        }
                        return 0;
                    case 14:
                        kp02.f136947s = aVar3.mo141626d(intValue);
                        return 0;
                    case 15:
                        LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                        int size6 = j6.size();
                        for (int i9 = 0; i9 < size6; i9++) {
                            byte[] bArr6 = j6.get(i9);
                            C49704hh0 hh04 = new C49704hh0();
                            if (bArr6 != null && bArr6.length > 0) {
                                hh04.parseFrom(bArr6);
                            }
                            kp02.f136948t = hh04;
                        }
                        return 0;
                    case 16:
                        kp02.f136949u = aVar3.mo141633k(intValue);
                        return 0;
                    case 17:
                        kp02.f136950v = aVar3.mo141633k(intValue);
                        return 0;
                    case 18:
                        LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                        int size7 = j7.size();
                        for (int i15 = 0; i15 < size7; i15++) {
                            byte[] bArr7 = j7.get(i15);
                            C50018jp0 jp04 = new C50018jp0();
                            if (bArr7 != null && bArr7.length > 0) {
                                jp04.parseFrom(bArr7);
                            }
                            kp02.f136951w = jp04;
                        }
                        return 0;
                    case 19:
                        kp02.f136952x = aVar3.mo141633k(intValue);
                        return 0;
                    case 20:
                        kp02.f136953y = aVar3.mo141626d(intValue);
                        return 0;
                    case 21:
                        LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                        int size8 = j8.size();
                        for (int i16 = 0; i16 < size8; i16++) {
                            byte[] bArr8 = j8.get(i16);
                            vd4 vd43 = new vd4();
                            if (bArr8 != null && bArr8.length > 0) {
                                vd43.parseFrom(bArr8);
                            }
                            kp02.f136954z = vd43;
                        }
                        return 0;
                    case 22:
                        LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                        int size9 = j9.size();
                        for (int i17 = 0; i17 < size9; i17++) {
                            byte[] bArr9 = j9.get(i17);
                            C49203dy1 dy14 = new C49203dy1();
                            if (bArr9 != null && bArr9.length > 0) {
                                dy14.parseFrom(bArr9);
                            }
                            kp02.f136925A = dy14;
                        }
                        return 0;
                    case 23:
                        LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                        int size10 = j15.size();
                        for (int i18 = 0; i18 < size10; i18++) {
                            byte[] bArr10 = j15.get(i18);
                            db4 db4 = new db4();
                            if (bArr10 != null && bArr10.length > 0) {
                                db4.parseFrom(bArr10);
                            }
                            kp02.f136926B.add(db4);
                        }
                        return 0;
                    case 24:
                        LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                        int size11 = j16.size();
                        for (int i19 = 0; i19 < size11; i19++) {
                            byte[] bArr11 = j16.get(i19);
                            C51796w72 w724 = new C51796w72();
                            if (bArr11 != null && bArr11.length > 0) {
                                w724.parseFrom(bArr11);
                            }
                            kp02.f136927C = w724;
                        }
                        return 0;
                    case 25:
                        LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                        int size12 = j17.size();
                        for (int i25 = 0; i25 < size12; i25++) {
                            byte[] bArr12 = j17.get(i25);
                            C64840xw0 xw04 = new C64840xw0();
                            if (bArr12 != null && bArr12.length > 0) {
                                xw04.parseFrom(bArr12);
                            }
                            kp02.f136928D = xw04;
                        }
                        return 0;
                    case 26:
                        LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                        int size13 = j18.size();
                        for (int i26 = 0; i26 < size13; i26++) {
                            byte[] bArr13 = j18.get(i26);
                            C50185kw0 kw04 = new C50185kw0();
                            if (bArr13 != null && bArr13.length > 0) {
                                kw04.parseFrom(bArr13);
                            }
                            kp02.f136929E = kw04;
                        }
                        return 0;
                    case 27:
                        kp02.f136930F = aVar3.mo141629g(intValue);
                        return 0;
                    case 28:
                        kp02.f136931G = aVar3.mo141629g(intValue);
                        return 0;
                    case 29:
                        kp02.f136932H = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                kp02.f136934J = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
