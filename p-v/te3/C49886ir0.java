package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ir0 */
public class C49886ir0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f135606d;

    /* renamed from: e */
    public C89349b f135607e;

    /* renamed from: f */
    public float f135608f;

    /* renamed from: g */
    public float f135609g;

    /* renamed from: h */
    public C49704hh0 f135610h;

    /* renamed from: i */
    public C64840xw0 f135611i;

    /* renamed from: j */
    public int f135612j;

    /* renamed from: n */
    public C49868im1 f135613n;

    /* renamed from: o */
    public LinkedList<C51449tu2> f135614o = new LinkedList<>();

    /* renamed from: p */
    public LinkedList<C49173do1> f135615p = new LinkedList<>();

    /* renamed from: q */
    public C51942x91 f135616q;

    /* renamed from: r */
    public int f135617r;

    /* renamed from: s */
    public C50168kr0 f135618s;

    /* renamed from: t */
    public int f135619t;

    /* renamed from: u */
    public C52264zh1 f135620u;

    /* renamed from: v */
    public String f135621v;

    /* renamed from: w */
    public int f135622w;

    /* renamed from: x */
    public long f135623x;

    /* renamed from: y */
    public C50185kw0 f135624y;

    /* renamed from: z */
    public int f135625z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49886ir0)) {
            return false;
        }
        C49886ir0 ir02 = (C49886ir0) aVar;
        return C46238a.m51546a(this.BaseRequest, ir02.BaseRequest) && C46238a.m51546a(this.f135606d, ir02.f135606d) && C46238a.m51546a(this.f135607e, ir02.f135607e) && C46238a.m51546a(Float.valueOf(this.f135608f), Float.valueOf(ir02.f135608f)) && C46238a.m51546a(Float.valueOf(this.f135609g), Float.valueOf(ir02.f135609g)) && C46238a.m51546a(this.f135610h, ir02.f135610h) && C46238a.m51546a(this.f135611i, ir02.f135611i) && C46238a.m51546a(Integer.valueOf(this.f135612j), Integer.valueOf(ir02.f135612j)) && C46238a.m51546a(this.f135613n, ir02.f135613n) && C46238a.m51546a(this.f135614o, ir02.f135614o) && C46238a.m51546a(this.f135615p, ir02.f135615p) && C46238a.m51546a(this.f135616q, ir02.f135616q) && C46238a.m51546a(Integer.valueOf(this.f135617r), Integer.valueOf(ir02.f135617r)) && C46238a.m51546a(this.f135618s, ir02.f135618s) && C46238a.m51546a(Integer.valueOf(this.f135619t), Integer.valueOf(ir02.f135619t)) && C46238a.m51546a(this.f135620u, ir02.f135620u) && C46238a.m51546a(this.f135621v, ir02.f135621v) && C46238a.m51546a(Integer.valueOf(this.f135622w), Integer.valueOf(ir02.f135622w)) && C46238a.m51546a(Long.valueOf(this.f135623x), Long.valueOf(ir02.f135623x)) && C46238a.m51546a(this.f135624y, ir02.f135624y) && C46238a.m51546a(Integer.valueOf(this.f135625z), Integer.valueOf(ir02.f135625z));
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
            C49842ig0 ig02 = this.f135606d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f135606d.writeFields(aVar);
            }
            C89349b bVar = this.f135607e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74317d(4, this.f135608f);
            aVar.mo74317d(5, this.f135609g);
            C49704hh0 hh02 = this.f135610h;
            if (hh02 != null) {
                aVar.mo74322i(6, hh02.computeSize());
                this.f135610h.writeFields(aVar);
            }
            C64840xw0 xw02 = this.f135611i;
            if (xw02 != null) {
                aVar.mo74322i(7, xw02.computeSize());
                this.f135611i.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f135612j);
            C49868im1 im12 = this.f135613n;
            if (im12 != null) {
                aVar.mo74322i(9, im12.computeSize());
                this.f135613n.writeFields(aVar);
            }
            aVar.mo74320g(10, 8, this.f135614o);
            aVar.mo74320g(11, 8, this.f135615p);
            C51942x91 x912 = this.f135616q;
            if (x912 != null) {
                aVar.mo74322i(12, x912.computeSize());
                this.f135616q.writeFields(aVar);
            }
            aVar.mo74318e(13, this.f135617r);
            C50168kr0 kr02 = this.f135618s;
            if (kr02 != null) {
                aVar.mo74322i(14, kr02.computeSize());
                this.f135618s.writeFields(aVar);
            }
            aVar.mo74318e(15, this.f135619t);
            C52264zh1 zh12 = this.f135620u;
            if (zh12 != null) {
                aVar.mo74322i(16, zh12.computeSize());
                this.f135620u.writeFields(aVar);
            }
            String str = this.f135621v;
            if (str != null) {
                aVar.mo74323j(17, str);
            }
            aVar.mo74318e(18, this.f135622w);
            aVar.mo74321h(19, this.f135623x);
            C50185kw0 kw02 = this.f135624y;
            if (kw02 != null) {
                aVar.mo74322i(20, kw02.computeSize());
                this.f135624y.writeFields(aVar);
            }
            aVar.mo74318e(21, this.f135625z);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f135606d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f135607e;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(3, bVar2);
            }
            int d = i3 + C52418a.m58677d(4, this.f135608f) + C52418a.m58677d(5, this.f135609g);
            C49704hh0 hh03 = this.f135610h;
            if (hh03 != null) {
                d += C52418a.m58682i(6, hh03.computeSize());
            }
            C64840xw0 xw03 = this.f135611i;
            if (xw03 != null) {
                d += C52418a.m58682i(7, xw03.computeSize());
            }
            int e = d + C52418a.m58678e(8, this.f135612j);
            C49868im1 im13 = this.f135613n;
            if (im13 != null) {
                e += C52418a.m58682i(9, im13.computeSize());
            }
            int g = e + C52418a.m58680g(10, 8, this.f135614o) + C52418a.m58680g(11, 8, this.f135615p);
            C51942x91 x913 = this.f135616q;
            if (x913 != null) {
                g += C52418a.m58682i(12, x913.computeSize());
            }
            int e2 = g + C52418a.m58678e(13, this.f135617r);
            C50168kr0 kr03 = this.f135618s;
            if (kr03 != null) {
                e2 += C52418a.m58682i(14, kr03.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(15, this.f135619t);
            C52264zh1 zh13 = this.f135620u;
            if (zh13 != null) {
                e3 += C52418a.m58682i(16, zh13.computeSize());
            }
            String str2 = this.f135621v;
            if (str2 != null) {
                e3 += C52418a.m58683j(17, str2);
            }
            int e4 = e3 + C52418a.m58678e(18, this.f135622w) + C52418a.m58681h(19, this.f135623x);
            C50185kw0 kw03 = this.f135624y;
            if (kw03 != null) {
                e4 += C52418a.m58682i(20, kw03.computeSize());
            }
            return e4 + C52418a.m58678e(21, this.f135625z);
        } else if (i2 == 2) {
            this.f135614o.clear();
            this.f135615p.clear();
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
            C49886ir0 ir02 = objArr[1];
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
                        ir02.BaseRequest = iaVar3;
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
                        ir02.f135606d = ig04;
                    }
                    return 0;
                case 3:
                    ir02.f135607e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    ir02.f135608f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    ir02.f135609g = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hh04.parseFrom(bArr3);
                        }
                        ir02.f135610h = hh04;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64840xw0 xw04 = new C64840xw0();
                        if (bArr4 != null && bArr4.length > 0) {
                            xw04.parseFrom(bArr4);
                        }
                        ir02.f135611i = xw04;
                    }
                    return 0;
                case 8:
                    ir02.f135612j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49868im1 im14 = new C49868im1();
                        if (bArr5 != null && bArr5.length > 0) {
                            im14.parseFrom(bArr5);
                        }
                        ir02.f135613n = im14;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51449tu2 tu22 = new C51449tu2();
                        if (bArr6 != null && bArr6.length > 0) {
                            tu22.parseFrom(bArr6);
                        }
                        ir02.f135614o.add(tu22);
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C49173do1 do12 = new C49173do1();
                        if (bArr7 != null && bArr7.length > 0) {
                            do12.parseFrom(bArr7);
                        }
                        ir02.f135615p.add(do12);
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C51942x91 x914 = new C51942x91();
                        if (bArr8 != null && bArr8.length > 0) {
                            x914.parseFrom(bArr8);
                        }
                        ir02.f135616q = x914;
                    }
                    return 0;
                case 13:
                    ir02.f135617r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C50168kr0 kr04 = new C50168kr0();
                        if (bArr9 != null && bArr9.length > 0) {
                            kr04.parseFrom(bArr9);
                        }
                        ir02.f135618s = kr04;
                    }
                    return 0;
                case 15:
                    ir02.f135619t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C52264zh1 zh14 = new C52264zh1();
                        if (bArr10 != null && bArr10.length > 0) {
                            zh14.parseFrom(bArr10);
                        }
                        ir02.f135620u = zh14;
                    }
                    return 0;
                case 17:
                    ir02.f135621v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    ir02.f135622w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    ir02.f135623x = aVar3.mo141631i(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C50185kw0 kw04 = new C50185kw0();
                        if (bArr11 != null && bArr11.length > 0) {
                            kw04.parseFrom(bArr11);
                        }
                        ir02.f135624y = kw04;
                    }
                    return 0;
                case 21:
                    ir02.f135625z = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
