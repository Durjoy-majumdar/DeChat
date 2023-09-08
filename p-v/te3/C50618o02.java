package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o02 */
public class C50618o02 extends C49335eu3 {

    /* renamed from: d */
    public int f138884d;

    /* renamed from: e */
    public String f138885e;

    /* renamed from: f */
    public int f138886f;

    /* renamed from: g */
    public String f138887g;

    /* renamed from: h */
    public String f138888h;

    /* renamed from: i */
    public String f138889i;

    /* renamed from: j */
    public String f138890j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50618o02)) {
            return false;
        }
        C50618o02 o022 = (C50618o02) aVar;
        return C46238a.m51546a(this.BaseResponse, o022.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f138884d), Integer.valueOf(o022.f138884d)) && C46238a.m51546a(this.f138885e, o022.f138885e) && C46238a.m51546a(Integer.valueOf(this.f138886f), Integer.valueOf(o022.f138886f)) && C46238a.m51546a(this.f138887g, o022.f138887g) && C46238a.m51546a(this.f138888h, o022.f138888h) && C46238a.m51546a(this.f138889i, o022.f138889i) && C46238a.m51546a(this.f138890j, o022.f138890j);
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
                aVar.mo74318e(2, this.f138884d);
                String str = this.f138885e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f138886f);
                String str2 = this.f138887g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f138888h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f138889i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f138890j;
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
            int e = i2 + C52418a.m58678e(2, this.f138884d);
            String str6 = this.f138885e;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            int e2 = e + C52418a.m58678e(4, this.f138886f);
            String str7 = this.f138887g;
            if (str7 != null) {
                e2 += C52418a.m58683j(5, str7);
            }
            String str8 = this.f138888h;
            if (str8 != null) {
                e2 += C52418a.m58683j(6, str8);
            }
            String str9 = this.f138889i;
            if (str9 != null) {
                e2 += C52418a.m58683j(7, str9);
            }
            String str10 = this.f138890j;
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
            C50618o02 o022 = objArr[1];
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
                        o022.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    o022.f138884d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    o022.f138885e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    o022.f138886f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    o022.f138887g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    o022.f138888h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    o022.f138889i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    o022.f138890j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
