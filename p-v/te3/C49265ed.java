package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ed */
public class C49265ed extends C49335eu3 {

    /* renamed from: d */
    public String f132868d;

    /* renamed from: e */
    public String f132869e;

    /* renamed from: f */
    public String f132870f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49265ed)) {
            return false;
        }
        C49265ed edVar = (C49265ed) aVar;
        return C46238a.m51546a(this.BaseResponse, edVar.BaseResponse) && C46238a.m51546a(this.f132868d, edVar.f132868d) && C46238a.m51546a(this.f132869e, edVar.f132869e) && C46238a.m51546a(this.f132870f, edVar.f132870f);
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
                String str = this.f132868d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f132869e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f132870f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str4 = this.f132868d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f132869e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f132870f;
            return str6 != null ? i2 + C52418a.m58683j(4, str6) : i2;
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
            C49265ed edVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    edVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                edVar.f132868d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                edVar.f132869e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                edVar.f132870f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
