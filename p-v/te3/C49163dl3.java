package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dl3 */
public class C49163dl3 extends C49335eu3 {

    /* renamed from: d */
    public int f132401d;

    /* renamed from: e */
    public String f132402e;

    /* renamed from: f */
    public int f132403f;

    /* renamed from: g */
    public String f132404g;

    /* renamed from: h */
    public int f132405h;

    /* renamed from: i */
    public int f132406i;

    /* renamed from: j */
    public String f132407j;

    /* renamed from: n */
    public String f132408n;

    /* renamed from: o */
    public String f132409o;

    /* renamed from: p */
    public String f132410p;

    /* renamed from: q */
    public String f132411q;

    /* renamed from: r */
    public String f132412r;

    /* renamed from: s */
    public String f132413s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49163dl3)) {
            return false;
        }
        C49163dl3 dl32 = (C49163dl3) aVar;
        return C46238a.m51546a(this.BaseResponse, dl32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f132401d), Integer.valueOf(dl32.f132401d)) && C46238a.m51546a(this.f132402e, dl32.f132402e) && C46238a.m51546a(Integer.valueOf(this.f132403f), Integer.valueOf(dl32.f132403f)) && C46238a.m51546a(this.f132404g, dl32.f132404g) && C46238a.m51546a(Integer.valueOf(this.f132405h), Integer.valueOf(dl32.f132405h)) && C46238a.m51546a(Integer.valueOf(this.f132406i), Integer.valueOf(dl32.f132406i)) && C46238a.m51546a(this.f132407j, dl32.f132407j) && C46238a.m51546a(this.f132408n, dl32.f132408n) && C46238a.m51546a(this.f132409o, dl32.f132409o) && C46238a.m51546a(this.f132410p, dl32.f132410p) && C46238a.m51546a(this.f132411q, dl32.f132411q) && C46238a.m51546a(this.f132412r, dl32.f132412r) && C46238a.m51546a(this.f132413s, dl32.f132413s);
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
                aVar.mo74318e(2, this.f132401d);
                String str = this.f132402e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f132403f);
                String str2 = this.f132404g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74318e(6, this.f132405h);
                aVar.mo74318e(7, this.f132406i);
                String str3 = this.f132407j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                String str4 = this.f132408n;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                String str5 = this.f132409o;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                String str6 = this.f132410p;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                String str7 = this.f132411q;
                if (str7 != null) {
                    aVar.mo74323j(12, str7);
                }
                String str8 = this.f132412r;
                if (str8 != null) {
                    aVar.mo74323j(14, str8);
                }
                String str9 = this.f132413s;
                if (str9 != null) {
                    aVar.mo74323j(15, str9);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f132401d);
            String str10 = this.f132402e;
            if (str10 != null) {
                e += C52418a.m58683j(3, str10);
            }
            int e2 = e + C52418a.m58678e(4, this.f132403f);
            String str11 = this.f132404g;
            if (str11 != null) {
                e2 += C52418a.m58683j(5, str11);
            }
            int e3 = e2 + C52418a.m58678e(6, this.f132405h) + C52418a.m58678e(7, this.f132406i);
            String str12 = this.f132407j;
            if (str12 != null) {
                e3 += C52418a.m58683j(8, str12);
            }
            String str13 = this.f132408n;
            if (str13 != null) {
                e3 += C52418a.m58683j(9, str13);
            }
            String str14 = this.f132409o;
            if (str14 != null) {
                e3 += C52418a.m58683j(10, str14);
            }
            String str15 = this.f132410p;
            if (str15 != null) {
                e3 += C52418a.m58683j(11, str15);
            }
            String str16 = this.f132411q;
            if (str16 != null) {
                e3 += C52418a.m58683j(12, str16);
            }
            String str17 = this.f132412r;
            if (str17 != null) {
                e3 += C52418a.m58683j(14, str17);
            }
            String str18 = this.f132413s;
            return str18 != null ? e3 + C52418a.m58683j(15, str18) : e3;
        } else if (i2 == 2) {
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
            C49163dl3 dl32 = objArr[1];
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
                        dl32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    dl32.f132401d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    dl32.f132402e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dl32.f132403f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    dl32.f132404g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dl32.f132405h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    dl32.f132406i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    dl32.f132407j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    dl32.f132408n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    dl32.f132409o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    dl32.f132410p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    dl32.f132411q = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    dl32.f132412r = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    dl32.f132413s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
