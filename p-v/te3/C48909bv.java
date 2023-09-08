package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bv */
public class C48909bv extends C49335eu3 {

    /* renamed from: d */
    public boolean f131322d;

    /* renamed from: e */
    public boolean f131323e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48909bv)) {
            return false;
        }
        C48909bv bvVar = (C48909bv) aVar;
        return C46238a.m51546a(this.BaseResponse, bvVar.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f131322d), Boolean.valueOf(bvVar.f131322d)) && C46238a.m51546a(Boolean.valueOf(this.f131323e), Boolean.valueOf(bvVar.f131323e));
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
            aVar.mo74314a(2, this.f131322d);
            aVar.mo74314a(3, this.f131323e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58674a(2, this.f131322d) + C52418a.m58674a(3, this.f131323e);
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
            C48909bv bvVar = objArr[1];
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
                    bvVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                bvVar.f131322d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                bvVar.f131323e = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
