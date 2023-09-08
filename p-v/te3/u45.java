package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class u45 extends C49335eu3 {

    /* renamed from: d */
    public String f259842d;

    /* renamed from: e */
    public String f259843e;

    /* renamed from: f */
    public int f259844f;

    /* renamed from: g */
    public int f259845g;

    /* renamed from: h */
    public int f259846h;

    /* renamed from: i */
    public int f259847i;

    /* renamed from: j */
    public String f259848j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof u45)) {
            return false;
        }
        u45 u45 = (u45) aVar;
        return C46238a.m51546a(this.BaseResponse, u45.BaseResponse) && C46238a.m51546a(this.f259842d, u45.f259842d) && C46238a.m51546a(this.f259843e, u45.f259843e) && C46238a.m51546a(Integer.valueOf(this.f259844f), Integer.valueOf(u45.f259844f)) && C46238a.m51546a(Integer.valueOf(this.f259845g), Integer.valueOf(u45.f259845g)) && C46238a.m51546a(Integer.valueOf(this.f259846h), Integer.valueOf(u45.f259846h)) && C46238a.m51546a(Integer.valueOf(this.f259847i), Integer.valueOf(u45.f259847i)) && C46238a.m51546a(this.f259848j, u45.f259848j);
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
                String str = this.f259842d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f259843e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f259844f);
                aVar.mo74318e(5, this.f259845g);
                aVar.mo74318e(6, this.f259846h);
                aVar.mo74318e(7, this.f259847i);
                String str3 = this.f259848j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str4 = this.f259842d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f259843e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f259844f) + C52418a.m58678e(5, this.f259845g) + C52418a.m58678e(6, this.f259846h) + C52418a.m58678e(7, this.f259847i);
            String str6 = this.f259848j;
            return str6 != null ? e + C52418a.m58683j(8, str6) : e;
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
            u45 u45 = objArr[1];
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
                        u45.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    u45.f259842d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    u45.f259843e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    u45.f259844f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    u45.f259845g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    u45.f259846h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    u45.f259847i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    u45.f259848j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
