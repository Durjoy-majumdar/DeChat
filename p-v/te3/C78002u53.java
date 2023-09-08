package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u53 */
public class C78002u53 extends C49335eu3 {

    /* renamed from: A */
    public C52159yr2 f228280A;

    /* renamed from: B */
    public String f228281B;

    /* renamed from: d */
    public int f228282d;

    /* renamed from: e */
    public String f228283e;

    /* renamed from: f */
    public C78015xr2 f228284f;

    /* renamed from: g */
    public String f228285g;

    /* renamed from: h */
    public String f228286h;

    /* renamed from: i */
    public String f228287i;

    /* renamed from: j */
    public int f228288j;

    /* renamed from: n */
    public String f228289n;

    /* renamed from: o */
    public String f228290o;

    /* renamed from: p */
    public C64578nc0 f228291p;

    /* renamed from: q */
    public String f228292q;

    /* renamed from: r */
    public boolean f228293r;

    /* renamed from: s */
    public boolean f228294s;

    /* renamed from: t */
    public boolean f228295t;

    /* renamed from: u */
    public LinkedList<C64514l50> f228296u = new LinkedList<>();

    /* renamed from: v */
    public String f228297v;

    /* renamed from: w */
    public LinkedList<C51892wy> f228298w = new LinkedList<>();

    /* renamed from: x */
    public String f228299x;

    /* renamed from: y */
    public LinkedList<C49702hg2> f228300y = new LinkedList<>();

    /* renamed from: z */
    public LinkedList<C64557mj3> f228301z = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78002u53)) {
            return false;
        }
        C78002u53 u532 = (C78002u53) aVar;
        return C46238a.m51546a(this.BaseResponse, u532.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228282d), Integer.valueOf(u532.f228282d)) && C46238a.m51546a(this.f228283e, u532.f228283e) && C46238a.m51546a(this.f228284f, u532.f228284f) && C46238a.m51546a(this.f228285g, u532.f228285g) && C46238a.m51546a(this.f228286h, u532.f228286h) && C46238a.m51546a(this.f228287i, u532.f228287i) && C46238a.m51546a(Integer.valueOf(this.f228288j), Integer.valueOf(u532.f228288j)) && C46238a.m51546a(this.f228289n, u532.f228289n) && C46238a.m51546a(this.f228290o, u532.f228290o) && C46238a.m51546a(this.f228291p, u532.f228291p) && C46238a.m51546a(this.f228292q, u532.f228292q) && C46238a.m51546a(Boolean.valueOf(this.f228293r), Boolean.valueOf(u532.f228293r)) && C46238a.m51546a(Boolean.valueOf(this.f228294s), Boolean.valueOf(u532.f228294s)) && C46238a.m51546a(Boolean.valueOf(this.f228295t), Boolean.valueOf(u532.f228295t)) && C46238a.m51546a(this.f228296u, u532.f228296u) && C46238a.m51546a(this.f228297v, u532.f228297v) && C46238a.m51546a(this.f228298w, u532.f228298w) && C46238a.m51546a(this.f228299x, u532.f228299x) && C46238a.m51546a(this.f228300y, u532.f228300y) && C46238a.m51546a(this.f228301z, u532.f228301z) && C46238a.m51546a(this.f228280A, u532.f228280A) && C46238a.m51546a(this.f228281B, u532.f228281B);
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
                aVar.mo74318e(2, this.f228282d);
                String str = this.f228283e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C78015xr2 xr22 = this.f228284f;
                if (xr22 != null) {
                    aVar.mo74322i(4, xr22.computeSize());
                    this.f228284f.writeFields(aVar);
                }
                String str2 = this.f228285g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f228286h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f228287i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                aVar.mo74318e(8, this.f228288j);
                String str5 = this.f228289n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                String str6 = this.f228290o;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                C64578nc0 nc02 = this.f228291p;
                if (nc02 != null) {
                    aVar.mo74322i(11, nc02.computeSize());
                    this.f228291p.writeFields(aVar);
                }
                String str7 = this.f228292q;
                if (str7 != null) {
                    aVar.mo74323j(12, str7);
                }
                aVar.mo74314a(13, this.f228293r);
                aVar.mo74314a(14, this.f228294s);
                aVar.mo74314a(15, this.f228295t);
                aVar.mo74320g(16, 8, this.f228296u);
                String str8 = this.f228297v;
                if (str8 != null) {
                    aVar.mo74323j(17, str8);
                }
                aVar.mo74320g(18, 8, this.f228298w);
                String str9 = this.f228299x;
                if (str9 != null) {
                    aVar.mo74323j(19, str9);
                }
                aVar.mo74320g(20, 8, this.f228300y);
                aVar.mo74320g(98, 8, this.f228301z);
                C52159yr2 yr22 = this.f228280A;
                if (yr22 != null) {
                    aVar.mo74322i(99, yr22.computeSize());
                    this.f228280A.writeFields(aVar);
                }
                String str10 = this.f228281B;
                if (str10 != null) {
                    aVar.mo74323j(100, str10);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f228282d);
            String str11 = this.f228283e;
            if (str11 != null) {
                e += C52418a.m58683j(3, str11);
            }
            C78015xr2 xr23 = this.f228284f;
            if (xr23 != null) {
                e += C52418a.m58682i(4, xr23.computeSize());
            }
            String str12 = this.f228285g;
            if (str12 != null) {
                e += C52418a.m58683j(5, str12);
            }
            String str13 = this.f228286h;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            String str14 = this.f228287i;
            if (str14 != null) {
                e += C52418a.m58683j(7, str14);
            }
            int e2 = e + C52418a.m58678e(8, this.f228288j);
            String str15 = this.f228289n;
            if (str15 != null) {
                e2 += C52418a.m58683j(9, str15);
            }
            String str16 = this.f228290o;
            if (str16 != null) {
                e2 += C52418a.m58683j(10, str16);
            }
            C64578nc0 nc03 = this.f228291p;
            if (nc03 != null) {
                e2 += C52418a.m58682i(11, nc03.computeSize());
            }
            String str17 = this.f228292q;
            if (str17 != null) {
                e2 += C52418a.m58683j(12, str17);
            }
            int a = e2 + C52418a.m58674a(13, this.f228293r) + C52418a.m58674a(14, this.f228294s) + C52418a.m58674a(15, this.f228295t) + C52418a.m58680g(16, 8, this.f228296u);
            String str18 = this.f228297v;
            if (str18 != null) {
                a += C52418a.m58683j(17, str18);
            }
            int g = a + C52418a.m58680g(18, 8, this.f228298w);
            String str19 = this.f228299x;
            if (str19 != null) {
                g += C52418a.m58683j(19, str19);
            }
            int g2 = g + C52418a.m58680g(20, 8, this.f228300y) + C52418a.m58680g(98, 8, this.f228301z);
            C52159yr2 yr23 = this.f228280A;
            if (yr23 != null) {
                g2 += C52418a.m58682i(99, yr23.computeSize());
            }
            String str20 = this.f228281B;
            return str20 != null ? g2 + C52418a.m58683j(100, str20) : g2;
        } else if (i2 == 2) {
            this.f228296u.clear();
            this.f228298w.clear();
            this.f228300y.clear();
            this.f228301z.clear();
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
            C78002u53 u532 = objArr[1];
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
                        u532.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    u532.f228282d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    u532.f228283e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C78015xr2 xr24 = new C78015xr2();
                        if (bArr2 != null && bArr2.length > 0) {
                            xr24.parseFrom(bArr2);
                        }
                        u532.f228284f = xr24;
                    }
                    return 0;
                case 5:
                    u532.f228285g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    u532.f228286h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    u532.f228287i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    u532.f228288j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    u532.f228289n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    u532.f228290o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64578nc0 nc04 = new C64578nc0();
                        if (bArr3 != null && bArr3.length > 0) {
                            nc04.parseFrom(bArr3);
                        }
                        u532.f228291p = nc04;
                    }
                    return 0;
                case 12:
                    u532.f228292q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    u532.f228293r = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    u532.f228294s = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    u532.f228295t = aVar3.mo141625c(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64514l50 l502 = new C64514l50();
                        if (bArr4 != null && bArr4.length > 0) {
                            l502.parseFrom(bArr4);
                        }
                        u532.f228296u.add(l502);
                    }
                    return 0;
                case 17:
                    u532.f228297v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51892wy wyVar = new C51892wy();
                        if (bArr5 != null && bArr5.length > 0) {
                            wyVar.parseFrom(bArr5);
                        }
                        u532.f228298w.add(wyVar);
                    }
                    return 0;
                case 19:
                    u532.f228299x = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C49702hg2 hg22 = new C49702hg2();
                        if (bArr6 != null && bArr6.length > 0) {
                            hg22.parseFrom(bArr6);
                        }
                        u532.f228300y.add(hg22);
                    }
                    return 0;
                default:
                    switch (intValue) {
                        case 98:
                            LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                            int size7 = j7.size();
                            for (int i15 = 0; i15 < size7; i15++) {
                                byte[] bArr7 = j7.get(i15);
                                C64557mj3 mj32 = new C64557mj3();
                                if (bArr7 != null && bArr7.length > 0) {
                                    mj32.parseFrom(bArr7);
                                }
                                u532.f228301z.add(mj32);
                            }
                            return 0;
                        case 99:
                            LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                            int size8 = j8.size();
                            for (int i16 = 0; i16 < size8; i16++) {
                                byte[] bArr8 = j8.get(i16);
                                C52159yr2 yr24 = new C52159yr2();
                                if (bArr8 != null && bArr8.length > 0) {
                                    yr24.parseFrom(bArr8);
                                }
                                u532.f228280A = yr24;
                            }
                            return 0;
                        case 100:
                            u532.f228281B = aVar3.mo141633k(intValue);
                            return 0;
                        default:
                            return -1;
                    }
            }
        }
    }
}
