package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ho0 */
public class C49731ho0 extends C101820nt3 {

    /* renamed from: A */
    public C89349b f134763A;

    /* renamed from: B */
    public C89349b f134764B;

    /* renamed from: C */
    public int f134765C;

    /* renamed from: D */
    public C64414h71 f134766D;

    /* renamed from: E */
    public C89349b f134767E;

    /* renamed from: d */
    public C49842ig0 f134768d;

    /* renamed from: e */
    public C89349b f134769e;

    /* renamed from: f */
    public long f134770f;

    /* renamed from: g */
    public String f134771g;

    /* renamed from: h */
    public float f134772h;

    /* renamed from: i */
    public float f134773i;

    /* renamed from: j */
    public int f134774j;

    /* renamed from: n */
    public C49704hh0 f134775n;

    /* renamed from: o */
    public C64840xw0 f134776o;

    /* renamed from: p */
    public String f134777p;

    /* renamed from: q */
    public C50168kr0 f134778q;

    /* renamed from: r */
    public C52264zh1 f134779r;

    /* renamed from: s */
    public String f134780s;

    /* renamed from: t */
    public C51395th0 f134781t;

    /* renamed from: u */
    public LinkedList<db4> f134782u = new LinkedList<>();

    /* renamed from: v */
    public int f134783v;

    /* renamed from: w */
    public C50185kw0 f134784w;

    /* renamed from: x */
    public LinkedList<C48965c71> f134785x = new LinkedList<>();

    /* renamed from: y */
    public int f134786y;

    /* renamed from: z */
    public LinkedList<Long> f134787z = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49731ho0)) {
            return false;
        }
        C49731ho0 ho02 = (C49731ho0) aVar;
        return C46238a.m51546a(this.BaseRequest, ho02.BaseRequest) && C46238a.m51546a(this.f134768d, ho02.f134768d) && C46238a.m51546a(this.f134769e, ho02.f134769e) && C46238a.m51546a(Long.valueOf(this.f134770f), Long.valueOf(ho02.f134770f)) && C46238a.m51546a(this.f134771g, ho02.f134771g) && C46238a.m51546a(Float.valueOf(this.f134772h), Float.valueOf(ho02.f134772h)) && C46238a.m51546a(Float.valueOf(this.f134773i), Float.valueOf(ho02.f134773i)) && C46238a.m51546a(Integer.valueOf(this.f134774j), Integer.valueOf(ho02.f134774j)) && C46238a.m51546a(this.f134775n, ho02.f134775n) && C46238a.m51546a(this.f134776o, ho02.f134776o) && C46238a.m51546a(this.f134777p, ho02.f134777p) && C46238a.m51546a(this.f134778q, ho02.f134778q) && C46238a.m51546a(this.f134779r, ho02.f134779r) && C46238a.m51546a(this.f134780s, ho02.f134780s) && C46238a.m51546a(this.f134781t, ho02.f134781t) && C46238a.m51546a(this.f134782u, ho02.f134782u) && C46238a.m51546a(Integer.valueOf(this.f134783v), Integer.valueOf(ho02.f134783v)) && C46238a.m51546a(this.f134784w, ho02.f134784w) && C46238a.m51546a(this.f134785x, ho02.f134785x) && C46238a.m51546a(Integer.valueOf(this.f134786y), Integer.valueOf(ho02.f134786y)) && C46238a.m51546a(this.f134787z, ho02.f134787z) && C46238a.m51546a(this.f134763A, ho02.f134763A) && C46238a.m51546a(this.f134764B, ho02.f134764B) && C46238a.m51546a(Integer.valueOf(this.f134765C), Integer.valueOf(ho02.f134765C)) && C46238a.m51546a(this.f134766D, ho02.f134766D) && C46238a.m51546a(this.f134767E, ho02.f134767E);
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
            C49842ig0 ig02 = this.f134768d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f134768d.writeFields(aVar);
            }
            C89349b bVar = this.f134769e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f134770f);
            String str = this.f134771g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74317d(6, this.f134772h);
            aVar.mo74317d(7, this.f134773i);
            aVar.mo74318e(8, this.f134774j);
            C49704hh0 hh02 = this.f134775n;
            if (hh02 != null) {
                aVar.mo74322i(9, hh02.computeSize());
                this.f134775n.writeFields(aVar);
            }
            C64840xw0 xw02 = this.f134776o;
            if (xw02 != null) {
                aVar.mo74322i(10, xw02.computeSize());
                this.f134776o.writeFields(aVar);
            }
            String str2 = this.f134777p;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            C50168kr0 kr02 = this.f134778q;
            if (kr02 != null) {
                aVar.mo74322i(12, kr02.computeSize());
                this.f134778q.writeFields(aVar);
            }
            C52264zh1 zh12 = this.f134779r;
            if (zh12 != null) {
                aVar.mo74322i(13, zh12.computeSize());
                this.f134779r.writeFields(aVar);
            }
            String str3 = this.f134780s;
            if (str3 != null) {
                aVar.mo74323j(14, str3);
            }
            C51395th0 th02 = this.f134781t;
            if (th02 != null) {
                aVar.mo74322i(16, th02.computeSize());
                this.f134781t.writeFields(aVar);
            }
            aVar.mo74320g(17, 8, this.f134782u);
            aVar.mo74318e(18, this.f134783v);
            C50185kw0 kw02 = this.f134784w;
            if (kw02 != null) {
                aVar.mo74322i(19, kw02.computeSize());
                this.f134784w.writeFields(aVar);
            }
            aVar.mo74320g(20, 8, this.f134785x);
            aVar.mo74318e(21, this.f134786y);
            aVar.mo74320g(22, 3, this.f134787z);
            C89349b bVar2 = this.f134763A;
            if (bVar2 != null) {
                aVar.mo74315b(23, bVar2);
            }
            C89349b bVar3 = this.f134764B;
            if (bVar3 != null) {
                aVar.mo74315b(24, bVar3);
            }
            aVar.mo74318e(25, this.f134765C);
            C64414h71 h712 = this.f134766D;
            if (h712 != null) {
                aVar.mo74322i(26, h712.computeSize());
                this.f134766D.writeFields(aVar);
            }
            C89349b bVar4 = this.f134767E;
            if (bVar4 != null) {
                aVar.mo74315b(27, bVar4);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f134768d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar5 = this.f134769e;
            if (bVar5 != null) {
                i3 += C52418a.m58675b(3, bVar5);
            }
            int h = i3 + C52418a.m58681h(4, this.f134770f);
            String str4 = this.f134771g;
            if (str4 != null) {
                h += C52418a.m58683j(5, str4);
            }
            int d = h + C52418a.m58677d(6, this.f134772h) + C52418a.m58677d(7, this.f134773i) + C52418a.m58678e(8, this.f134774j);
            C49704hh0 hh03 = this.f134775n;
            if (hh03 != null) {
                d += C52418a.m58682i(9, hh03.computeSize());
            }
            C64840xw0 xw03 = this.f134776o;
            if (xw03 != null) {
                d += C52418a.m58682i(10, xw03.computeSize());
            }
            String str5 = this.f134777p;
            if (str5 != null) {
                d += C52418a.m58683j(11, str5);
            }
            C50168kr0 kr03 = this.f134778q;
            if (kr03 != null) {
                d += C52418a.m58682i(12, kr03.computeSize());
            }
            C52264zh1 zh13 = this.f134779r;
            if (zh13 != null) {
                d += C52418a.m58682i(13, zh13.computeSize());
            }
            String str6 = this.f134780s;
            if (str6 != null) {
                d += C52418a.m58683j(14, str6);
            }
            C51395th0 th03 = this.f134781t;
            if (th03 != null) {
                d += C52418a.m58682i(16, th03.computeSize());
            }
            int g = d + C52418a.m58680g(17, 8, this.f134782u) + C52418a.m58678e(18, this.f134783v);
            C50185kw0 kw03 = this.f134784w;
            if (kw03 != null) {
                g += C52418a.m58682i(19, kw03.computeSize());
            }
            int g2 = g + C52418a.m58680g(20, 8, this.f134785x) + C52418a.m58678e(21, this.f134786y) + C52418a.m58680g(22, 3, this.f134787z);
            C89349b bVar6 = this.f134763A;
            if (bVar6 != null) {
                g2 += C52418a.m58675b(23, bVar6);
            }
            C89349b bVar7 = this.f134764B;
            if (bVar7 != null) {
                g2 += C52418a.m58675b(24, bVar7);
            }
            int e = g2 + C52418a.m58678e(25, this.f134765C);
            C64414h71 h713 = this.f134766D;
            if (h713 != null) {
                e += C52418a.m58682i(26, h713.computeSize());
            }
            C89349b bVar8 = this.f134767E;
            return bVar8 != null ? e + C52418a.m58675b(27, bVar8) : e;
        } else if (i2 == 2) {
            this.f134782u.clear();
            this.f134785x.clear();
            this.f134787z.clear();
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
            C49731ho0 ho02 = objArr[1];
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
                        ho02.BaseRequest = iaVar3;
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
                        ho02.f134768d = ig04;
                    }
                    return 0;
                case 3:
                    ho02.f134769e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    ho02.f134770f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ho02.f134771g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ho02.f134772h = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    ho02.f134773i = aVar3.mo141628f(intValue);
                    return 0;
                case 8:
                    ho02.f134774j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hh04.parseFrom(bArr3);
                        }
                        ho02.f134775n = hh04;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64840xw0 xw04 = new C64840xw0();
                        if (bArr4 != null && bArr4.length > 0) {
                            xw04.parseFrom(bArr4);
                        }
                        ho02.f134776o = xw04;
                    }
                    return 0;
                case 11:
                    ho02.f134777p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C50168kr0 kr04 = new C50168kr0();
                        if (bArr5 != null && bArr5.length > 0) {
                            kr04.parseFrom(bArr5);
                        }
                        ho02.f134778q = kr04;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C52264zh1 zh14 = new C52264zh1();
                        if (bArr6 != null && bArr6.length > 0) {
                            zh14.parseFrom(bArr6);
                        }
                        ho02.f134779r = zh14;
                    }
                    return 0;
                case 14:
                    ho02.f134780s = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51395th0 th04 = new C51395th0();
                        if (bArr7 != null && bArr7.length > 0) {
                            th04.parseFrom(bArr7);
                        }
                        ho02.f134781t = th04;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        db4 db4 = new db4();
                        if (bArr8 != null && bArr8.length > 0) {
                            db4.parseFrom(bArr8);
                        }
                        ho02.f134782u.add(db4);
                    }
                    return 0;
                case 18:
                    ho02.f134783v = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C50185kw0 kw04 = new C50185kw0();
                        if (bArr9 != null && bArr9.length > 0) {
                            kw04.parseFrom(bArr9);
                        }
                        ho02.f134784w = kw04;
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C48965c71 c712 = new C48965c71();
                        if (bArr10 != null && bArr10.length > 0) {
                            c712.parseFrom(bArr10);
                        }
                        ho02.f134785x.add(c712);
                    }
                    return 0;
                case 21:
                    ho02.f134786y = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    ho02.f134787z.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    return 0;
                case 23:
                    ho02.f134763A = aVar3.mo141626d(intValue);
                    return 0;
                case 24:
                    ho02.f134764B = aVar3.mo141626d(intValue);
                    return 0;
                case 25:
                    ho02.f134765C = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C64414h71 h714 = new C64414h71();
                        if (bArr11 != null && bArr11.length > 0) {
                            h714.parseFrom(bArr11);
                        }
                        ho02.f134766D = h714;
                    }
                    return 0;
                case 27:
                    ho02.f134767E = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
