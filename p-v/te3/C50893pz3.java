package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pz3 */
public class C50893pz3 extends C49335eu3 {

    /* renamed from: d */
    public long f140064d;

    /* renamed from: e */
    public C89349b f140065e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50893pz3)) {
            return false;
        }
        C50893pz3 pz32 = (C50893pz3) aVar;
        return C46238a.m51546a(this.BaseResponse, pz32.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f140064d), Long.valueOf(pz32.f140064d)) && C46238a.m51546a(this.f140065e, pz32.f140065e);
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
            aVar.mo74321h(2, this.f140064d);
            C89349b bVar = this.f140065e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f140064d);
            C89349b bVar2 = this.f140065e;
            return bVar2 != null ? h + C52418a.m58675b(3, bVar2) : h;
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
            C50893pz3 pz32 = objArr[1];
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
                    pz32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                pz32.f140064d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                pz32.f140065e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
