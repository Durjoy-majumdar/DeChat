package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ia2 */
public class C49820ia2 extends C49335eu3 {

    /* renamed from: d */
    public String f135188d;

    /* renamed from: e */
    public String f135189e;

    /* renamed from: f */
    public dk4 f135190f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49820ia2)) {
            return false;
        }
        C49820ia2 ia22 = (C49820ia2) aVar;
        return C46238a.m51546a(this.BaseResponse, ia22.BaseResponse) && C46238a.m51546a(this.f135188d, ia22.f135188d) && C46238a.m51546a(this.f135189e, ia22.f135189e) && C46238a.m51546a(this.f135190f, ia22.f135190f);
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
                String str = this.f135188d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f135189e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                dk4 dk4 = this.f135190f;
                if (dk4 != null) {
                    aVar.mo74322i(4, dk4.computeSize());
                    this.f135190f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f135188d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f135189e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            dk4 dk42 = this.f135190f;
            return dk42 != null ? i2 + C52418a.m58682i(4, dk42.computeSize()) : i2;
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
            C49820ia2 ia22 = objArr[1];
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
                    ia22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ia22.f135188d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ia22.f135189e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    dk4 dk43 = new dk4();
                    if (bArr2 != null && bArr2.length > 0) {
                        dk43.parseFrom(bArr2);
                    }
                    ia22.f135190f = dk43;
                }
                return 0;
            }
        }
    }
}
