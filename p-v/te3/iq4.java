package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class iq4 extends C49335eu3 {

    /* renamed from: d */
    public C64360f8 f183727d;

    /* renamed from: e */
    public String f183728e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof iq4)) {
            return false;
        }
        iq4 iq4 = (iq4) aVar;
        return C46238a.m51546a(this.BaseResponse, iq4.BaseResponse) && C46238a.m51546a(this.f183727d, iq4.f183727d) && C46238a.m51546a(this.f183728e, iq4.f183728e);
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
                C64360f8 f8Var = this.f183727d;
                if (f8Var != null) {
                    aVar.mo74322i(2, f8Var.computeSize());
                    this.f183727d.writeFields(aVar);
                }
                String str = this.f183728e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C64360f8 f8Var2 = this.f183727d;
            if (f8Var2 != null) {
                i2 += C52418a.m58682i(2, f8Var2.computeSize());
            }
            String str2 = this.f183728e;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            iq4 iq4 = objArr[1];
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
                    iq4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64360f8 f8Var3 = new C64360f8();
                    if (bArr2 != null && bArr2.length > 0) {
                        f8Var3.parseFrom(bArr2);
                    }
                    iq4.f183727d = f8Var3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                iq4.f183728e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
