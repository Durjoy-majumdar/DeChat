package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ln1 */
public class C50287ln1 extends C49335eu3 {

    /* renamed from: d */
    public C89349b f137524d;

    /* renamed from: e */
    public long f137525e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50287ln1)) {
            return false;
        }
        C50287ln1 ln12 = (C50287ln1) aVar;
        return C46238a.m51546a(this.BaseResponse, ln12.BaseResponse) && C46238a.m51546a(this.f137524d, ln12.f137524d) && C46238a.m51546a(Long.valueOf(this.f137525e), Long.valueOf(ln12.f137525e));
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
            C89349b bVar = this.f137524d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74321h(3, this.f137525e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C89349b bVar2 = this.f137524d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58681h(3, this.f137525e);
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
            C50287ln1 ln12 = objArr[1];
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
                    ln12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ln12.f137524d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ln12.f137525e = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
