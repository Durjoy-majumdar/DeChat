package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fe1 */
public class C49412fe1 extends C101820nt3 {

    /* renamed from: A */
    public C64414h71 f133443A;

    /* renamed from: d */
    public C49842ig0 f133444d;

    /* renamed from: e */
    public C89349b f133445e;

    /* renamed from: f */
    public float f133446f;

    /* renamed from: g */
    public float f133447g;

    /* renamed from: h */
    public C49704hh0 f133448h;

    /* renamed from: i */
    public C64840xw0 f133449i;

    /* renamed from: j */
    public int f133450j;

    /* renamed from: n */
    public C49868im1 f133451n;

    /* renamed from: o */
    public LinkedList<C51449tu2> f133452o = new LinkedList<>();

    /* renamed from: p */
    public LinkedList<C49173do1> f133453p = new LinkedList<>();

    /* renamed from: q */
    public int f133454q;

    /* renamed from: r */
    public C50168kr0 f133455r;

    /* renamed from: s */
    public int f133456s;

    /* renamed from: t */
    public C52264zh1 f133457t;

    /* renamed from: u */
    public String f133458u;

    /* renamed from: v */
    public C50185kw0 f133459v;

    /* renamed from: w */
    public int f133460w;

    /* renamed from: x */
    public long f133461x;

    /* renamed from: y */
    public LinkedList<C49208e00> f133462y = new LinkedList<>();

    /* renamed from: z */
    public C51942x91 f133463z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49412fe1)) {
            return false;
        }
        C49412fe1 fe12 = (C49412fe1) aVar;
        return C46238a.m51546a(this.BaseRequest, fe12.BaseRequest) && C46238a.m51546a(this.f133444d, fe12.f133444d) && C46238a.m51546a(this.f133445e, fe12.f133445e) && C46238a.m51546a(Float.valueOf(this.f133446f), Float.valueOf(fe12.f133446f)) && C46238a.m51546a(Float.valueOf(this.f133447g), Float.valueOf(fe12.f133447g)) && C46238a.m51546a(this.f133448h, fe12.f133448h) && C46238a.m51546a(this.f133449i, fe12.f133449i) && C46238a.m51546a(Integer.valueOf(this.f133450j), Integer.valueOf(fe12.f133450j)) && C46238a.m51546a(this.f133451n, fe12.f133451n) && C46238a.m51546a(this.f133452o, fe12.f133452o) && C46238a.m51546a(this.f133453p, fe12.f133453p) && C46238a.m51546a(Integer.valueOf(this.f133454q), Integer.valueOf(fe12.f133454q)) && C46238a.m51546a(this.f133455r, fe12.f133455r) && C46238a.m51546a(Integer.valueOf(this.f133456s), Integer.valueOf(fe12.f133456s)) && C46238a.m51546a(this.f133457t, fe12.f133457t) && C46238a.m51546a(this.f133458u, fe12.f133458u) && C46238a.m51546a(this.f133459v, fe12.f133459v) && C46238a.m51546a(Integer.valueOf(this.f133460w), Integer.valueOf(fe12.f133460w)) && C46238a.m51546a(Long.valueOf(this.f133461x), Long.valueOf(fe12.f133461x)) && C46238a.m51546a(this.f133462y, fe12.f133462y) && C46238a.m51546a(this.f133463z, fe12.f133463z) && C46238a.m51546a(this.f133443A, fe12.f133443A);
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
            C49842ig0 ig02 = this.f133444d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f133444d.writeFields(aVar);
            }
            C89349b bVar = this.f133445e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74317d(4, this.f133446f);
            aVar.mo74317d(5, this.f133447g);
            C49704hh0 hh02 = this.f133448h;
            if (hh02 != null) {
                aVar.mo74322i(6, hh02.computeSize());
                this.f133448h.writeFields(aVar);
            }
            C64840xw0 xw02 = this.f133449i;
            if (xw02 != null) {
                aVar.mo74322i(7, xw02.computeSize());
                this.f133449i.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f133450j);
            C49868im1 im12 = this.f133451n;
            if (im12 != null) {
                aVar.mo74322i(9, im12.computeSize());
                this.f133451n.writeFields(aVar);
            }
            aVar.mo74320g(10, 8, this.f133452o);
            aVar.mo74320g(11, 8, this.f133453p);
            aVar.mo74318e(12, this.f133454q);
            C50168kr0 kr02 = this.f133455r;
            if (kr02 != null) {
                aVar.mo74322i(13, kr02.computeSize());
                this.f133455r.writeFields(aVar);
            }
            aVar.mo74318e(14, this.f133456s);
            C52264zh1 zh12 = this.f133457t;
            if (zh12 != null) {
                aVar.mo74322i(15, zh12.computeSize());
                this.f133457t.writeFields(aVar);
            }
            String str = this.f133458u;
            if (str != null) {
                aVar.mo74323j(16, str);
            }
            C50185kw0 kw02 = this.f133459v;
            if (kw02 != null) {
                aVar.mo74322i(17, kw02.computeSize());
                this.f133459v.writeFields(aVar);
            }
            aVar.mo74318e(18, this.f133460w);
            aVar.mo74321h(19, this.f133461x);
            aVar.mo74320g(20, 8, this.f133462y);
            C51942x91 x912 = this.f133463z;
            if (x912 != null) {
                aVar.mo74322i(21, x912.computeSize());
                this.f133463z.writeFields(aVar);
            }
            C64414h71 h712 = this.f133443A;
            if (h712 != null) {
                aVar.mo74322i(22, h712.computeSize());
                this.f133443A.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f133444d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f133445e;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(3, bVar2);
            }
            int d = i3 + C52418a.m58677d(4, this.f133446f) + C52418a.m58677d(5, this.f133447g);
            C49704hh0 hh03 = this.f133448h;
            if (hh03 != null) {
                d += C52418a.m58682i(6, hh03.computeSize());
            }
            C64840xw0 xw03 = this.f133449i;
            if (xw03 != null) {
                d += C52418a.m58682i(7, xw03.computeSize());
            }
            int e = d + C52418a.m58678e(8, this.f133450j);
            C49868im1 im13 = this.f133451n;
            if (im13 != null) {
                e += C52418a.m58682i(9, im13.computeSize());
            }
            int g = e + C52418a.m58680g(10, 8, this.f133452o) + C52418a.m58680g(11, 8, this.f133453p) + C52418a.m58678e(12, this.f133454q);
            C50168kr0 kr03 = this.f133455r;
            if (kr03 != null) {
                g += C52418a.m58682i(13, kr03.computeSize());
            }
            int e2 = g + C52418a.m58678e(14, this.f133456s);
            C52264zh1 zh13 = this.f133457t;
            if (zh13 != null) {
                e2 += C52418a.m58682i(15, zh13.computeSize());
            }
            String str2 = this.f133458u;
            if (str2 != null) {
                e2 += C52418a.m58683j(16, str2);
            }
            C50185kw0 kw03 = this.f133459v;
            if (kw03 != null) {
                e2 += C52418a.m58682i(17, kw03.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(18, this.f133460w) + C52418a.m58681h(19, this.f133461x) + C52418a.m58680g(20, 8, this.f133462y);
            C51942x91 x913 = this.f133463z;
            if (x913 != null) {
                e3 += C52418a.m58682i(21, x913.computeSize());
            }
            C64414h71 h713 = this.f133443A;
            return h713 != null ? e3 + C52418a.m58682i(22, h713.computeSize()) : e3;
        } else if (i2 == 2) {
            this.f133452o.clear();
            this.f133453p.clear();
            this.f133462y.clear();
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
            C49412fe1 fe12 = objArr[1];
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
                        fe12.BaseRequest = iaVar3;
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
                        fe12.f133444d = ig04;
                    }
                    return 0;
                case 3:
                    fe12.f133445e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    fe12.f133446f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    fe12.f133447g = aVar3.mo141628f(intValue);
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
                        fe12.f133448h = hh04;
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
                        fe12.f133449i = xw04;
                    }
                    return 0;
                case 8:
                    fe12.f133450j = aVar3.mo141629g(intValue);
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
                        fe12.f133451n = im14;
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
                        fe12.f133452o.add(tu22);
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
                        fe12.f133453p.add(do12);
                    }
                    return 0;
                case 12:
                    fe12.f133454q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C50168kr0 kr04 = new C50168kr0();
                        if (bArr8 != null && bArr8.length > 0) {
                            kr04.parseFrom(bArr8);
                        }
                        fe12.f133455r = kr04;
                    }
                    return 0;
                case 14:
                    fe12.f133456s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C52264zh1 zh14 = new C52264zh1();
                        if (bArr9 != null && bArr9.length > 0) {
                            zh14.parseFrom(bArr9);
                        }
                        fe12.f133457t = zh14;
                    }
                    return 0;
                case 16:
                    fe12.f133458u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C50185kw0 kw04 = new C50185kw0();
                        if (bArr10 != null && bArr10.length > 0) {
                            kw04.parseFrom(bArr10);
                        }
                        fe12.f133459v = kw04;
                    }
                    return 0;
                case 18:
                    fe12.f133460w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    fe12.f133461x = aVar3.mo141631i(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C49208e00 e002 = new C49208e00();
                        if (bArr11 != null && bArr11.length > 0) {
                            e002.parseFrom(bArr11);
                        }
                        fe12.f133462y.add(e002);
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        C51942x91 x914 = new C51942x91();
                        if (bArr12 != null && bArr12.length > 0) {
                            x914.parseFrom(bArr12);
                        }
                        fe12.f133463z = x914;
                    }
                    return 0;
                case 22:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        C64414h71 h714 = new C64414h71();
                        if (bArr13 != null && bArr13.length > 0) {
                            h714.parseFrom(bArr13);
                        }
                        fe12.f133443A = h714;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
