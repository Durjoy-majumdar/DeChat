package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a23 */
public class C48656a23 extends C101820nt3 {

    /* renamed from: A */
    public C49203dy1 f130237A;

    /* renamed from: B */
    public LinkedList<db4> f130238B = new LinkedList<>();

    /* renamed from: C */
    public C51796w72 f130239C;

    /* renamed from: D */
    public C64840xw0 f130240D;

    /* renamed from: d */
    public C49842ig0 f130241d;

    /* renamed from: e */
    public C89349b f130242e;

    /* renamed from: f */
    public long f130243f;

    /* renamed from: g */
    public float f130244g;

    /* renamed from: h */
    public float f130245h;

    /* renamed from: i */
    public int f130246i;

    /* renamed from: j */
    public String f130247j;

    /* renamed from: n */
    public String f130248n;

    /* renamed from: o */
    public int f130249o;

    /* renamed from: p */
    public String f130250p;

    /* renamed from: q */
    public C50141kk1 f130251q;

    /* renamed from: r */
    public C51969xg0 f130252r;

    /* renamed from: s */
    public C89349b f130253s;

    /* renamed from: t */
    public C49704hh0 f130254t;

    /* renamed from: u */
    public String f130255u;

    /* renamed from: v */
    public String f130256v;

    /* renamed from: w */
    public C50018jp0 f130257w;

    /* renamed from: x */
    public String f130258x;

    /* renamed from: y */
    public C89349b f130259y;

    /* renamed from: z */
    public vd4 f130260z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48656a23)) {
            return false;
        }
        C48656a23 a232 = (C48656a23) aVar;
        return C46238a.m51546a(this.BaseRequest, a232.BaseRequest) && C46238a.m51546a(this.f130241d, a232.f130241d) && C46238a.m51546a(this.f130242e, a232.f130242e) && C46238a.m51546a(Long.valueOf(this.f130243f), Long.valueOf(a232.f130243f)) && C46238a.m51546a(Float.valueOf(this.f130244g), Float.valueOf(a232.f130244g)) && C46238a.m51546a(Float.valueOf(this.f130245h), Float.valueOf(a232.f130245h)) && C46238a.m51546a(Integer.valueOf(this.f130246i), Integer.valueOf(a232.f130246i)) && C46238a.m51546a(this.f130247j, a232.f130247j) && C46238a.m51546a(this.f130248n, a232.f130248n) && C46238a.m51546a(Integer.valueOf(this.f130249o), Integer.valueOf(a232.f130249o)) && C46238a.m51546a(this.f130250p, a232.f130250p) && C46238a.m51546a(this.f130251q, a232.f130251q) && C46238a.m51546a(this.f130252r, a232.f130252r) && C46238a.m51546a(this.f130253s, a232.f130253s) && C46238a.m51546a(this.f130254t, a232.f130254t) && C46238a.m51546a(this.f130255u, a232.f130255u) && C46238a.m51546a(this.f130256v, a232.f130256v) && C46238a.m51546a(this.f130257w, a232.f130257w) && C46238a.m51546a(this.f130258x, a232.f130258x) && C46238a.m51546a(this.f130259y, a232.f130259y) && C46238a.m51546a(this.f130260z, a232.f130260z) && C46238a.m51546a(this.f130237A, a232.f130237A) && C46238a.m51546a(this.f130238B, a232.f130238B) && C46238a.m51546a(this.f130239C, a232.f130239C) && C46238a.m51546a(this.f130240D, a232.f130240D);
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
            C49842ig0 ig02 = this.f130241d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f130241d.writeFields(aVar);
            }
            C89349b bVar = this.f130242e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f130243f);
            aVar.mo74317d(6, this.f130244g);
            aVar.mo74317d(7, this.f130245h);
            aVar.mo74318e(5, this.f130246i);
            String str = this.f130247j;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            String str2 = this.f130248n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            aVar.mo74318e(10, this.f130249o);
            String str3 = this.f130250p;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            C50141kk1 kk12 = this.f130251q;
            if (kk12 != null) {
                aVar.mo74322i(12, kk12.computeSize());
                this.f130251q.writeFields(aVar);
            }
            C51969xg0 xg02 = this.f130252r;
            if (xg02 != null) {
                aVar.mo74322i(13, xg02.computeSize());
                this.f130252r.writeFields(aVar);
            }
            C89349b bVar2 = this.f130253s;
            if (bVar2 != null) {
                aVar.mo74315b(14, bVar2);
            }
            C49704hh0 hh02 = this.f130254t;
            if (hh02 != null) {
                aVar.mo74322i(15, hh02.computeSize());
                this.f130254t.writeFields(aVar);
            }
            String str4 = this.f130255u;
            if (str4 != null) {
                aVar.mo74323j(16, str4);
            }
            String str5 = this.f130256v;
            if (str5 != null) {
                aVar.mo74323j(17, str5);
            }
            C50018jp0 jp02 = this.f130257w;
            if (jp02 != null) {
                aVar.mo74322i(18, jp02.computeSize());
                this.f130257w.writeFields(aVar);
            }
            String str6 = this.f130258x;
            if (str6 != null) {
                aVar.mo74323j(19, str6);
            }
            C89349b bVar3 = this.f130259y;
            if (bVar3 != null) {
                aVar.mo74315b(20, bVar3);
            }
            vd4 vd4 = this.f130260z;
            if (vd4 != null) {
                aVar.mo74322i(21, vd4.computeSize());
                this.f130260z.writeFields(aVar);
            }
            C49203dy1 dy12 = this.f130237A;
            if (dy12 != null) {
                aVar.mo74322i(22, dy12.computeSize());
                this.f130237A.writeFields(aVar);
            }
            aVar.mo74320g(23, 8, this.f130238B);
            C51796w72 w722 = this.f130239C;
            if (w722 != null) {
                aVar.mo74322i(24, w722.computeSize());
                this.f130239C.writeFields(aVar);
            }
            C64840xw0 xw02 = this.f130240D;
            if (xw02 != null) {
                aVar.mo74322i(25, xw02.computeSize());
                this.f130240D.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f130241d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar4 = this.f130242e;
            if (bVar4 != null) {
                i3 += C52418a.m58675b(3, bVar4);
            }
            int h = i3 + C52418a.m58681h(4, this.f130243f) + C52418a.m58677d(6, this.f130244g) + C52418a.m58677d(7, this.f130245h) + C52418a.m58678e(5, this.f130246i);
            String str7 = this.f130247j;
            if (str7 != null) {
                h += C52418a.m58683j(8, str7);
            }
            String str8 = this.f130248n;
            if (str8 != null) {
                h += C52418a.m58683j(9, str8);
            }
            int e = h + C52418a.m58678e(10, this.f130249o);
            String str9 = this.f130250p;
            if (str9 != null) {
                e += C52418a.m58683j(11, str9);
            }
            C50141kk1 kk13 = this.f130251q;
            if (kk13 != null) {
                e += C52418a.m58682i(12, kk13.computeSize());
            }
            C51969xg0 xg03 = this.f130252r;
            if (xg03 != null) {
                e += C52418a.m58682i(13, xg03.computeSize());
            }
            C89349b bVar5 = this.f130253s;
            if (bVar5 != null) {
                e += C52418a.m58675b(14, bVar5);
            }
            C49704hh0 hh03 = this.f130254t;
            if (hh03 != null) {
                e += C52418a.m58682i(15, hh03.computeSize());
            }
            String str10 = this.f130255u;
            if (str10 != null) {
                e += C52418a.m58683j(16, str10);
            }
            String str11 = this.f130256v;
            if (str11 != null) {
                e += C52418a.m58683j(17, str11);
            }
            C50018jp0 jp03 = this.f130257w;
            if (jp03 != null) {
                e += C52418a.m58682i(18, jp03.computeSize());
            }
            String str12 = this.f130258x;
            if (str12 != null) {
                e += C52418a.m58683j(19, str12);
            }
            C89349b bVar6 = this.f130259y;
            if (bVar6 != null) {
                e += C52418a.m58675b(20, bVar6);
            }
            vd4 vd42 = this.f130260z;
            if (vd42 != null) {
                e += C52418a.m58682i(21, vd42.computeSize());
            }
            C49203dy1 dy13 = this.f130237A;
            if (dy13 != null) {
                e += C52418a.m58682i(22, dy13.computeSize());
            }
            int g = e + C52418a.m58680g(23, 8, this.f130238B);
            C51796w72 w723 = this.f130239C;
            if (w723 != null) {
                g += C52418a.m58682i(24, w723.computeSize());
            }
            C64840xw0 xw03 = this.f130240D;
            return xw03 != null ? g + C52418a.m58682i(25, xw03.computeSize()) : g;
        } else if (i2 == 2) {
            this.f130238B.clear();
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
            C48656a23 a232 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        a232.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        a232.f130241d = ig04;
                    }
                    return 0;
                case 3:
                    a232.f130242e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    a232.f130243f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    a232.f130246i = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    a232.f130244g = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    a232.f130245h = aVar3.mo141628f(intValue);
                    return 0;
                case 8:
                    a232.f130247j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    a232.f130248n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    a232.f130249o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    a232.f130250p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C50141kk1 kk14 = new C50141kk1();
                        if (bArr3 != null && bArr3.length > 0) {
                            kk14.parseFrom(bArr3);
                        }
                        a232.f130251q = kk14;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51969xg0 xg04 = new C51969xg0();
                        if (bArr4 != null && bArr4.length > 0) {
                            xg04.parseFrom(bArr4);
                        }
                        a232.f130252r = xg04;
                    }
                    return 0;
                case 14:
                    a232.f130253s = aVar3.mo141626d(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr5 != null && bArr5.length > 0) {
                            hh04.parseFrom(bArr5);
                        }
                        a232.f130254t = hh04;
                    }
                    return 0;
                case 16:
                    a232.f130255u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    a232.f130256v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C50018jp0 jp04 = new C50018jp0();
                        if (bArr6 != null && bArr6.length > 0) {
                            jp04.parseFrom(bArr6);
                        }
                        a232.f130257w = jp04;
                    }
                    return 0;
                case 19:
                    a232.f130258x = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    a232.f130259y = aVar3.mo141626d(intValue);
                    return 0;
                case 21:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        vd4 vd43 = new vd4();
                        if (bArr7 != null && bArr7.length > 0) {
                            vd43.parseFrom(bArr7);
                        }
                        a232.f130260z = vd43;
                    }
                    return 0;
                case 22:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C49203dy1 dy14 = new C49203dy1();
                        if (bArr8 != null && bArr8.length > 0) {
                            dy14.parseFrom(bArr8);
                        }
                        a232.f130237A = dy14;
                    }
                    return 0;
                case 23:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        db4 db4 = new db4();
                        if (bArr9 != null && bArr9.length > 0) {
                            db4.parseFrom(bArr9);
                        }
                        a232.f130238B.add(db4);
                    }
                    return 0;
                case 24:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C51796w72 w724 = new C51796w72();
                        if (bArr10 != null && bArr10.length > 0) {
                            w724.parseFrom(bArr10);
                        }
                        a232.f130239C = w724;
                    }
                    return 0;
                case 25:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C64840xw0 xw04 = new C64840xw0();
                        if (bArr11 != null && bArr11.length > 0) {
                            xw04.parseFrom(bArr11);
                        }
                        a232.f130240D = xw04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
