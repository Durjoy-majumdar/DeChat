package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pr0 */
public class C50863pr0 extends C49335eu3 {

    /* renamed from: d */
    public int f139909d;

    /* renamed from: e */
    public int f139910e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50863pr0)) {
            return false;
        }
        C50863pr0 pr02 = (C50863pr0) aVar;
        return C46238a.m51546a(this.BaseResponse, pr02.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139909d), Integer.valueOf(pr02.f139909d)) && C46238a.m51546a(Integer.valueOf(this.f139910e), Integer.valueOf(pr02.f139910e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f139909d);
            aVar.mo74318e(3, this.f139910e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f139909d) + C52418a.m58678e(3, this.f139910e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50863pr0 pr02 = objArr[1];
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
                    pr02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                pr02.f139909d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                pr02.f139910e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
