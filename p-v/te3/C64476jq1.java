package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jq1 */
public class C64476jq1 extends C49335eu3 {

    /* renamed from: d */
    public int f183818d = 0;

    /* renamed from: e */
    public String f183819e = "ok";

    /* renamed from: f */
    public String f183820f;

    /* renamed from: g */
    public String f183821g;

    /* renamed from: h */
    public int f183822h;

    /* renamed from: i */
    public int f183823i;

    /* renamed from: j */
    public int f183824j;

    /* renamed from: n */
    public String f183825n;

    /* renamed from: o */
    public int f183826o;

    /* renamed from: p */
    public String f183827p;

    /* renamed from: q */
    public String f183828q;

    /* renamed from: r */
    public boolean f183829r = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64476jq1)) {
            return false;
        }
        C64476jq1 jq12 = (C64476jq1) aVar;
        return C46238a.m51546a(this.BaseResponse, jq12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f183818d), Integer.valueOf(jq12.f183818d)) && C46238a.m51546a(this.f183819e, jq12.f183819e) && C46238a.m51546a(this.f183820f, jq12.f183820f) && C46238a.m51546a(this.f183821g, jq12.f183821g) && C46238a.m51546a(Integer.valueOf(this.f183822h), Integer.valueOf(jq12.f183822h)) && C46238a.m51546a(Integer.valueOf(this.f183823i), Integer.valueOf(jq12.f183823i)) && C46238a.m51546a(Integer.valueOf(this.f183824j), Integer.valueOf(jq12.f183824j)) && C46238a.m51546a(this.f183825n, jq12.f183825n) && C46238a.m51546a(Integer.valueOf(this.f183826o), Integer.valueOf(jq12.f183826o)) && C46238a.m51546a(this.f183827p, jq12.f183827p) && C46238a.m51546a(this.f183828q, jq12.f183828q) && C46238a.m51546a(Boolean.valueOf(this.f183829r), Boolean.valueOf(jq12.f183829r));
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
                aVar.mo74318e(2, this.f183818d);
                String str = this.f183819e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f183820f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f183821g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f183822h);
                aVar.mo74318e(7, this.f183823i);
                aVar.mo74318e(8, this.f183824j);
                String str4 = this.f183825n;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                aVar.mo74318e(10, this.f183826o);
                String str5 = this.f183827p;
                if (str5 != null) {
                    aVar.mo74323j(11, str5);
                }
                String str6 = this.f183828q;
                if (str6 != null) {
                    aVar.mo74323j(12, str6);
                }
                aVar.mo74314a(13, this.f183829r);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f183818d);
            String str7 = this.f183819e;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f183820f;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f183821g;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            int e2 = e + C52418a.m58678e(6, this.f183822h) + C52418a.m58678e(7, this.f183823i) + C52418a.m58678e(8, this.f183824j);
            String str10 = this.f183825n;
            if (str10 != null) {
                e2 += C52418a.m58683j(9, str10);
            }
            int e3 = e2 + C52418a.m58678e(10, this.f183826o);
            String str11 = this.f183827p;
            if (str11 != null) {
                e3 += C52418a.m58683j(11, str11);
            }
            String str12 = this.f183828q;
            if (str12 != null) {
                e3 += C52418a.m58683j(12, str12);
            }
            return e3 + C52418a.m58674a(13, this.f183829r);
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
            C64476jq1 jq12 = objArr[1];
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
                        jq12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    jq12.f183818d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    jq12.f183819e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    jq12.f183820f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    jq12.f183821g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jq12.f183822h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    jq12.f183823i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    jq12.f183824j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    jq12.f183825n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    jq12.f183826o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    jq12.f183827p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    jq12.f183828q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    jq12.f183829r = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
