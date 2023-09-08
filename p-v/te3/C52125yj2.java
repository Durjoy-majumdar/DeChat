package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yj2 */
public class C52125yj2 extends C49335eu3 {

    /* renamed from: d */
    public C49713hj2 f145325d;

    /* renamed from: e */
    public wp4 f145326e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52125yj2)) {
            return false;
        }
        C52125yj2 yj22 = (C52125yj2) aVar;
        return C46238a.m51546a(this.BaseResponse, yj22.BaseResponse) && C46238a.m51546a(this.f145325d, yj22.f145325d) && C46238a.m51546a(this.f145326e, yj22.f145326e);
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
                C49713hj2 hj22 = this.f145325d;
                if (hj22 != null) {
                    aVar.mo74322i(2, hj22.computeSize());
                    this.f145325d.writeFields(aVar);
                }
                wp4 wp4 = this.f145326e;
                if (wp4 != null) {
                    aVar.mo74322i(3, wp4.computeSize());
                    this.f145326e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49713hj2 hj23 = this.f145325d;
            if (hj23 != null) {
                i2 += C52418a.m58682i(2, hj23.computeSize());
            }
            wp4 wp42 = this.f145326e;
            return wp42 != null ? i2 + C52418a.m58682i(3, wp42.computeSize()) : i2;
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
            C52125yj2 yj22 = objArr[1];
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
                    yj22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49713hj2 hj24 = new C49713hj2();
                    if (bArr2 != null && bArr2.length > 0) {
                        hj24.parseFrom(bArr2);
                    }
                    yj22.f145325d = hj24;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    wp4 wp43 = new wp4();
                    if (bArr3 != null && bArr3.length > 0) {
                        wp43.parseFrom(bArr3);
                    }
                    yj22.f145326e = wp43;
                }
                return 0;
            }
        }
    }
}
