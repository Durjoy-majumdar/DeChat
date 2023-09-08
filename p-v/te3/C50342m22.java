package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m22 */
public class C50342m22 extends C49335eu3 {

    /* renamed from: d */
    public String f137767d;

    /* renamed from: e */
    public int f137768e;

    /* renamed from: f */
    public String f137769f;

    /* renamed from: g */
    public String f137770g;

    /* renamed from: h */
    public int f137771h;

    /* renamed from: i */
    public String f137772i;

    /* renamed from: j */
    public String f137773j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50342m22)) {
            return false;
        }
        C50342m22 m222 = (C50342m22) aVar;
        return C46238a.m51546a(this.BaseResponse, m222.BaseResponse) && C46238a.m51546a(this.f137767d, m222.f137767d) && C46238a.m51546a(Integer.valueOf(this.f137768e), Integer.valueOf(m222.f137768e)) && C46238a.m51546a(this.f137769f, m222.f137769f) && C46238a.m51546a(this.f137770g, m222.f137770g) && C46238a.m51546a(Integer.valueOf(this.f137771h), Integer.valueOf(m222.f137771h)) && C46238a.m51546a(this.f137772i, m222.f137772i) && C46238a.m51546a(this.f137773j, m222.f137773j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f137767d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f137768e);
                String str2 = this.f137769f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f137770g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f137771h);
                String str4 = this.f137772i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f137773j;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str6 = this.f137767d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f137768e);
            String str7 = this.f137769f;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f137770g;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            int e2 = e + C52418a.m58678e(6, this.f137771h);
            String str9 = this.f137772i;
            if (str9 != null) {
                e2 += C52418a.m58683j(7, str9);
            }
            String str10 = this.f137773j;
            return str10 != null ? e2 + C52418a.m58683j(8, str10) : e2;
        } else if (i == 2) {
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
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50342m22 m222 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        m222.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    m222.f137767d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    m222.f137768e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    m222.f137769f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m222.f137770g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    m222.f137771h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    m222.f137772i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    m222.f137773j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
