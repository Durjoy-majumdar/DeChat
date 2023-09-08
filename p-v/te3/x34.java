package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class x34 extends C49335eu3 {

    /* renamed from: d */
    public int f144431d;

    /* renamed from: e */
    public String f144432e;

    /* renamed from: f */
    public String f144433f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x34)) {
            return false;
        }
        x34 x34 = (x34) aVar;
        return C46238a.m51546a(this.BaseResponse, x34.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f144431d), Integer.valueOf(x34.f144431d)) && C46238a.m51546a(this.f144432e, x34.f144432e) && C46238a.m51546a(this.f144433f, x34.f144433f);
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
                aVar.mo74318e(2, this.f144431d);
                String str = this.f144432e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f144433f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f144431d);
            String str3 = this.f144432e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f144433f;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            x34 x34 = objArr[1];
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
                    x34.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                x34.f144431d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                x34.f144432e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                x34.f144433f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
