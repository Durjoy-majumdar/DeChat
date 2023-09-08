package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ad2 */
public class C48698ad2 extends C49335eu3 {

    /* renamed from: d */
    public int f130444d;

    /* renamed from: e */
    public String f130445e;

    /* renamed from: f */
    public int f130446f;

    /* renamed from: g */
    public String f130447g;

    /* renamed from: h */
    public C48686aa3 f130448h;

    /* renamed from: i */
    public LinkedList<C49496g03> f130449i = new LinkedList<>();

    /* renamed from: j */
    public String f130450j;

    /* renamed from: n */
    public String f130451n;

    /* renamed from: o */
    public int f130452o;

    /* renamed from: p */
    public String f130453p;

    /* renamed from: q */
    public String f130454q;

    /* renamed from: r */
    public String f130455r;

    /* renamed from: s */
    public String f130456s;

    /* renamed from: t */
    public String f130457t;

    /* renamed from: u */
    public LinkedList<m65> f130458u = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48698ad2)) {
            return false;
        }
        C48698ad2 ad22 = (C48698ad2) aVar;
        return C46238a.m51546a(this.BaseResponse, ad22.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f130444d), Integer.valueOf(ad22.f130444d)) && C46238a.m51546a(this.f130445e, ad22.f130445e) && C46238a.m51546a(Integer.valueOf(this.f130446f), Integer.valueOf(ad22.f130446f)) && C46238a.m51546a(this.f130447g, ad22.f130447g) && C46238a.m51546a(this.f130448h, ad22.f130448h) && C46238a.m51546a(this.f130449i, ad22.f130449i) && C46238a.m51546a(this.f130450j, ad22.f130450j) && C46238a.m51546a(this.f130451n, ad22.f130451n) && C46238a.m51546a(Integer.valueOf(this.f130452o), Integer.valueOf(ad22.f130452o)) && C46238a.m51546a(this.f130453p, ad22.f130453p) && C46238a.m51546a(this.f130454q, ad22.f130454q) && C46238a.m51546a(this.f130455r, ad22.f130455r) && C46238a.m51546a(this.f130456s, ad22.f130456s) && C46238a.m51546a(this.f130457t, ad22.f130457t) && C46238a.m51546a(this.f130458u, ad22.f130458u);
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
                aVar.mo74318e(2, this.f130444d);
                String str = this.f130445e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f130446f);
                String str2 = this.f130447g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                C48686aa3 aa32 = this.f130448h;
                if (aa32 != null) {
                    aVar.mo74322i(6, aa32.computeSize());
                    this.f130448h.writeFields(aVar);
                }
                aVar.mo74320g(7, 8, this.f130449i);
                String str3 = this.f130450j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                String str4 = this.f130451n;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                aVar.mo74318e(10, this.f130452o);
                String str5 = this.f130453p;
                if (str5 != null) {
                    aVar.mo74323j(11, str5);
                }
                String str6 = this.f130454q;
                if (str6 != null) {
                    aVar.mo74323j(12, str6);
                }
                String str7 = this.f130455r;
                if (str7 != null) {
                    aVar.mo74323j(13, str7);
                }
                String str8 = this.f130456s;
                if (str8 != null) {
                    aVar.mo74323j(14, str8);
                }
                String str9 = this.f130457t;
                if (str9 != null) {
                    aVar.mo74323j(15, str9);
                }
                aVar.mo74320g(16, 8, this.f130458u);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f130444d);
            String str10 = this.f130445e;
            if (str10 != null) {
                e += C52418a.m58683j(3, str10);
            }
            int e2 = e + C52418a.m58678e(4, this.f130446f);
            String str11 = this.f130447g;
            if (str11 != null) {
                e2 += C52418a.m58683j(5, str11);
            }
            C48686aa3 aa33 = this.f130448h;
            if (aa33 != null) {
                e2 += C52418a.m58682i(6, aa33.computeSize());
            }
            int g = e2 + C52418a.m58680g(7, 8, this.f130449i);
            String str12 = this.f130450j;
            if (str12 != null) {
                g += C52418a.m58683j(8, str12);
            }
            String str13 = this.f130451n;
            if (str13 != null) {
                g += C52418a.m58683j(9, str13);
            }
            int e3 = g + C52418a.m58678e(10, this.f130452o);
            String str14 = this.f130453p;
            if (str14 != null) {
                e3 += C52418a.m58683j(11, str14);
            }
            String str15 = this.f130454q;
            if (str15 != null) {
                e3 += C52418a.m58683j(12, str15);
            }
            String str16 = this.f130455r;
            if (str16 != null) {
                e3 += C52418a.m58683j(13, str16);
            }
            String str17 = this.f130456s;
            if (str17 != null) {
                e3 += C52418a.m58683j(14, str17);
            }
            String str18 = this.f130457t;
            if (str18 != null) {
                e3 += C52418a.m58683j(15, str18);
            }
            return e3 + C52418a.m58680g(16, 8, this.f130458u);
        } else if (i2 == 2) {
            this.f130449i.clear();
            this.f130458u.clear();
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
            C48698ad2 ad22 = objArr[1];
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
                        ad22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ad22.f130444d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ad22.f130445e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ad22.f130446f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ad22.f130447g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C48686aa3 aa34 = new C48686aa3();
                        if (bArr2 != null && bArr2.length > 0) {
                            aa34.parseFrom(bArr2);
                        }
                        ad22.f130448h = aa34;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49496g03 g032 = new C49496g03();
                        if (bArr3 != null && bArr3.length > 0) {
                            g032.parseFrom(bArr3);
                        }
                        ad22.f130449i.add(g032);
                    }
                    return 0;
                case 8:
                    ad22.f130450j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ad22.f130451n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ad22.f130452o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    ad22.f130453p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    ad22.f130454q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    ad22.f130455r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    ad22.f130456s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    ad22.f130457t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        m65 m65 = new m65();
                        if (bArr4 != null && bArr4.length > 0) {
                            m65.parseFrom(bArr4);
                        }
                        ad22.f130458u.add(m65);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
