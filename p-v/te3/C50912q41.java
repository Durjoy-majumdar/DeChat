package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q41 */
public class C50912q41 extends C49335eu3 {

    /* renamed from: d */
    public C50542nh0 f140127d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50912q41)) {
            return false;
        }
        C50912q41 q412 = (C50912q41) aVar;
        return C46238a.m51546a(this.BaseResponse, q412.BaseResponse) && C46238a.m51546a(this.f140127d, q412.f140127d);
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
            C50542nh0 nh02 = this.f140127d;
            if (nh02 != null) {
                aVar.mo74322i(2, nh02.computeSize());
                this.f140127d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C50542nh0 nh03 = this.f140127d;
            return nh03 != null ? i2 + C52418a.m58682i(2, nh03.computeSize()) : i2;
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
            C50912q41 q412 = objArr[1];
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
                    q412.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50542nh0 nh04 = new C50542nh0();
                    if (bArr2 != null && bArr2.length > 0) {
                        nh04.parseFrom(bArr2);
                    }
                    q412.f140127d = nh04;
                }
                return 0;
            }
        }
    }
}
