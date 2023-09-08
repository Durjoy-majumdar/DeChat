package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cj3 */
public class C49010cj3 extends C49335eu3 {

    /* renamed from: d */
    public int f131780d;

    /* renamed from: e */
    public long f131781e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49010cj3)) {
            return false;
        }
        C49010cj3 cj32 = (C49010cj3) aVar;
        return C46238a.m51546a(this.BaseResponse, cj32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f131780d), Integer.valueOf(cj32.f131780d)) && C46238a.m51546a(Long.valueOf(this.f131781e), Long.valueOf(cj32.f131781e));
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
                aVar.mo74318e(2, this.f131780d);
                aVar.mo74321h(3, this.f131781e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f131780d) + C52418a.m58681h(3, this.f131781e);
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
            C49010cj3 cj32 = objArr[1];
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
                    cj32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                cj32.f131780d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                cj32.f131781e = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
