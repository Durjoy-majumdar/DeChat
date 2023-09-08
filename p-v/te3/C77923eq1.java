package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eq1 */
public class C77923eq1 extends C49335eu3 {

    /* renamed from: A */
    public C77944hq1 f227270A;

    /* renamed from: B */
    public int f227271B;

    /* renamed from: C */
    public String f227272C;

    /* renamed from: D */
    public String f227273D;

    /* renamed from: E */
    public String f227274E;

    /* renamed from: F */
    public int f227275F;

    /* renamed from: G */
    public String f227276G;

    /* renamed from: H */
    public int f227277H;

    /* renamed from: I */
    public int f227278I;

    /* renamed from: J */
    public String f227279J;

    /* renamed from: K */
    public String f227280K;

    /* renamed from: L */
    public C64264bq1 f227281L;

    /* renamed from: d */
    public int f227282d = 0;

    /* renamed from: e */
    public String f227283e = "ok";

    /* renamed from: f */
    public int f227284f;

    /* renamed from: g */
    public int f227285g;

    /* renamed from: h */
    public long f227286h;

    /* renamed from: i */
    public String f227287i;

    /* renamed from: j */
    public long f227288j;

    /* renamed from: n */
    public String f227289n;

    /* renamed from: o */
    public int f227290o;

    /* renamed from: p */
    public String f227291p;

    /* renamed from: q */
    public LinkedList<C77944hq1> f227292q = new LinkedList<>();

    /* renamed from: r */
    public int f227293r;

    /* renamed from: s */
    public int f227294s;

    /* renamed from: t */
    public int f227295t;

    /* renamed from: u */
    public int f227296u;

    /* renamed from: v */
    public String f227297v;

    /* renamed from: w */
    public String f227298w;

    /* renamed from: x */
    public int f227299x;

    /* renamed from: y */
    public long f227300y;

    /* renamed from: z */
    public LinkedList<C77914cq1> f227301z = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77923eq1)) {
            return false;
        }
        C77923eq1 eq12 = (C77923eq1) aVar;
        return C46238a.m51546a(this.BaseResponse, eq12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f227282d), Integer.valueOf(eq12.f227282d)) && C46238a.m51546a(this.f227283e, eq12.f227283e) && C46238a.m51546a(Integer.valueOf(this.f227284f), Integer.valueOf(eq12.f227284f)) && C46238a.m51546a(Integer.valueOf(this.f227285g), Integer.valueOf(eq12.f227285g)) && C46238a.m51546a(Long.valueOf(this.f227286h), Long.valueOf(eq12.f227286h)) && C46238a.m51546a(this.f227287i, eq12.f227287i) && C46238a.m51546a(Long.valueOf(this.f227288j), Long.valueOf(eq12.f227288j)) && C46238a.m51546a(this.f227289n, eq12.f227289n) && C46238a.m51546a(Integer.valueOf(this.f227290o), Integer.valueOf(eq12.f227290o)) && C46238a.m51546a(this.f227291p, eq12.f227291p) && C46238a.m51546a(this.f227292q, eq12.f227292q) && C46238a.m51546a(Integer.valueOf(this.f227293r), Integer.valueOf(eq12.f227293r)) && C46238a.m51546a(Integer.valueOf(this.f227294s), Integer.valueOf(eq12.f227294s)) && C46238a.m51546a(Integer.valueOf(this.f227295t), Integer.valueOf(eq12.f227295t)) && C46238a.m51546a(Integer.valueOf(this.f227296u), Integer.valueOf(eq12.f227296u)) && C46238a.m51546a(this.f227297v, eq12.f227297v) && C46238a.m51546a(this.f227298w, eq12.f227298w) && C46238a.m51546a(Integer.valueOf(this.f227299x), Integer.valueOf(eq12.f227299x)) && C46238a.m51546a(Long.valueOf(this.f227300y), Long.valueOf(eq12.f227300y)) && C46238a.m51546a(this.f227301z, eq12.f227301z) && C46238a.m51546a(this.f227270A, eq12.f227270A) && C46238a.m51546a(Integer.valueOf(this.f227271B), Integer.valueOf(eq12.f227271B)) && C46238a.m51546a(this.f227272C, eq12.f227272C) && C46238a.m51546a(this.f227273D, eq12.f227273D) && C46238a.m51546a(this.f227274E, eq12.f227274E) && C46238a.m51546a(Integer.valueOf(this.f227275F), Integer.valueOf(eq12.f227275F)) && C46238a.m51546a(this.f227276G, eq12.f227276G) && C46238a.m51546a(Integer.valueOf(this.f227277H), Integer.valueOf(eq12.f227277H)) && C46238a.m51546a(Integer.valueOf(this.f227278I), Integer.valueOf(eq12.f227278I)) && C46238a.m51546a(this.f227279J, eq12.f227279J) && C46238a.m51546a(this.f227280K, eq12.f227280K) && C46238a.m51546a(this.f227281L, eq12.f227281L);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f227282d);
                String str = this.f227283e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f227284f);
                aVar.mo74318e(5, this.f227285g);
                aVar.mo74321h(6, this.f227286h);
                String str2 = this.f227287i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                aVar.mo74321h(8, this.f227288j);
                String str3 = this.f227289n;
                if (str3 != null) {
                    aVar.mo74323j(9, str3);
                }
                aVar.mo74318e(10, this.f227290o);
                String str4 = this.f227291p;
                if (str4 != null) {
                    aVar.mo74323j(11, str4);
                }
                aVar.mo74320g(12, 8, this.f227292q);
                aVar.mo74318e(13, this.f227293r);
                aVar.mo74318e(14, this.f227294s);
                aVar.mo74318e(15, this.f227295t);
                aVar.mo74318e(16, this.f227296u);
                String str5 = this.f227297v;
                if (str5 != null) {
                    aVar.mo74323j(17, str5);
                }
                String str6 = this.f227298w;
                if (str6 != null) {
                    aVar.mo74323j(18, str6);
                }
                aVar.mo74318e(19, this.f227299x);
                aVar.mo74321h(20, this.f227300y);
                aVar.mo74320g(21, 8, this.f227301z);
                C77944hq1 hq12 = this.f227270A;
                if (hq12 != null) {
                    aVar.mo74322i(22, hq12.computeSize());
                    this.f227270A.writeFields(aVar);
                }
                aVar.mo74318e(23, this.f227271B);
                String str7 = this.f227272C;
                if (str7 != null) {
                    aVar.mo74323j(24, str7);
                }
                String str8 = this.f227273D;
                if (str8 != null) {
                    aVar.mo74323j(25, str8);
                }
                String str9 = this.f227274E;
                if (str9 != null) {
                    aVar.mo74323j(26, str9);
                }
                aVar.mo74318e(27, this.f227275F);
                String str10 = this.f227276G;
                if (str10 != null) {
                    aVar.mo74323j(28, str10);
                }
                aVar.mo74318e(29, this.f227277H);
                aVar.mo74318e(30, this.f227278I);
                String str11 = this.f227279J;
                if (str11 != null) {
                    aVar.mo74323j(31, str11);
                }
                String str12 = this.f227280K;
                if (str12 != null) {
                    aVar.mo74323j(32, str12);
                }
                C64264bq1 bq12 = this.f227281L;
                if (bq12 != null) {
                    aVar.mo74322i(33, bq12.computeSize());
                    this.f227281L.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f227282d);
            String str13 = this.f227283e;
            if (str13 != null) {
                e += C52418a.m58683j(3, str13);
            }
            int e2 = e + C52418a.m58678e(4, this.f227284f) + C52418a.m58678e(5, this.f227285g) + C52418a.m58681h(6, this.f227286h);
            String str14 = this.f227287i;
            if (str14 != null) {
                e2 += C52418a.m58683j(7, str14);
            }
            int h = e2 + C52418a.m58681h(8, this.f227288j);
            String str15 = this.f227289n;
            if (str15 != null) {
                h += C52418a.m58683j(9, str15);
            }
            int e3 = h + C52418a.m58678e(10, this.f227290o);
            String str16 = this.f227291p;
            if (str16 != null) {
                e3 += C52418a.m58683j(11, str16);
            }
            int g = e3 + C52418a.m58680g(12, 8, this.f227292q) + C52418a.m58678e(13, this.f227293r) + C52418a.m58678e(14, this.f227294s) + C52418a.m58678e(15, this.f227295t) + C52418a.m58678e(16, this.f227296u);
            String str17 = this.f227297v;
            if (str17 != null) {
                g += C52418a.m58683j(17, str17);
            }
            String str18 = this.f227298w;
            if (str18 != null) {
                g += C52418a.m58683j(18, str18);
            }
            int e4 = g + C52418a.m58678e(19, this.f227299x) + C52418a.m58681h(20, this.f227300y) + C52418a.m58680g(21, 8, this.f227301z);
            C77944hq1 hq13 = this.f227270A;
            if (hq13 != null) {
                e4 += C52418a.m58682i(22, hq13.computeSize());
            }
            int e5 = e4 + C52418a.m58678e(23, this.f227271B);
            String str19 = this.f227272C;
            if (str19 != null) {
                e5 += C52418a.m58683j(24, str19);
            }
            String str20 = this.f227273D;
            if (str20 != null) {
                e5 += C52418a.m58683j(25, str20);
            }
            String str21 = this.f227274E;
            if (str21 != null) {
                e5 += C52418a.m58683j(26, str21);
            }
            int e6 = e5 + C52418a.m58678e(27, this.f227275F);
            String str22 = this.f227276G;
            if (str22 != null) {
                e6 += C52418a.m58683j(28, str22);
            }
            int e7 = e6 + C52418a.m58678e(29, this.f227277H) + C52418a.m58678e(30, this.f227278I);
            String str23 = this.f227279J;
            if (str23 != null) {
                e7 += C52418a.m58683j(31, str23);
            }
            String str24 = this.f227280K;
            if (str24 != null) {
                e7 += C52418a.m58683j(32, str24);
            }
            C64264bq1 bq13 = this.f227281L;
            return bq13 != null ? e7 + C52418a.m58682i(33, bq13.computeSize()) : e7;
        } else if (i2 == 2) {
            this.f227292q.clear();
            this.f227301z.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77923eq1 eq12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        eq12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    eq12.f227282d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    eq12.f227283e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    eq12.f227284f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    eq12.f227285g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    eq12.f227286h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    eq12.f227287i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    eq12.f227288j = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    eq12.f227289n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    eq12.f227290o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    eq12.f227291p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C77944hq1 hq14 = new C77944hq1();
                        if (bArr2 != null && bArr2.length > 0) {
                            hq14.parseFrom(bArr2);
                        }
                        eq12.f227292q.add(hq14);
                    }
                    return 0;
                case 13:
                    eq12.f227293r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    eq12.f227294s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    eq12.f227295t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    eq12.f227296u = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    eq12.f227297v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    eq12.f227298w = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    eq12.f227299x = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    eq12.f227300y = aVar3.mo141631i(intValue);
                    return 0;
                case 21:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C77914cq1 cq12 = new C77914cq1();
                        if (bArr3 != null && bArr3.length > 0) {
                            cq12.parseFrom(bArr3);
                        }
                        eq12.f227301z.add(cq12);
                    }
                    return 0;
                case 22:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C77944hq1 hq15 = new C77944hq1();
                        if (bArr4 != null && bArr4.length > 0) {
                            hq15.parseFrom(bArr4);
                        }
                        eq12.f227270A = hq15;
                    }
                    return 0;
                case 23:
                    eq12.f227271B = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    eq12.f227272C = aVar3.mo141633k(intValue);
                    return 0;
                case 25:
                    eq12.f227273D = aVar3.mo141633k(intValue);
                    return 0;
                case 26:
                    eq12.f227274E = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    eq12.f227275F = aVar3.mo141629g(intValue);
                    return 0;
                case 28:
                    eq12.f227276G = aVar3.mo141633k(intValue);
                    return 0;
                case 29:
                    eq12.f227277H = aVar3.mo141629g(intValue);
                    return 0;
                case 30:
                    eq12.f227278I = aVar3.mo141629g(intValue);
                    return 0;
                case 31:
                    eq12.f227279J = aVar3.mo141633k(intValue);
                    return 0;
                case 32:
                    eq12.f227280K = aVar3.mo141633k(intValue);
                    return 0;
                case 33:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C64264bq1 bq14 = new C64264bq1();
                        if (bArr5 != null && bArr5.length > 0) {
                            bq14.parseFrom(bArr5);
                        }
                        eq12.f227281L = bq14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
