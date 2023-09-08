package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q2 */
public class C50903q2 extends C47465a {

    /* renamed from: d */
    public C52156yq3 f140095d;

    /* renamed from: e */
    public C52156yq3 f140096e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50903q2)) {
            return false;
        }
        C50903q2 q2Var = (C50903q2) aVar;
        return C46238a.m51546a(this.f140095d, q2Var.f140095d) && C46238a.m51546a(this.f140096e, q2Var.f140096e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52156yq3 yq32 = this.f140095d;
            if (yq32 != null) {
                aVar.mo74322i(1, yq32.computeSize());
                this.f140095d.writeFields(aVar);
            }
            C52156yq3 yq33 = this.f140096e;
            if (yq33 != null) {
                aVar.mo74322i(2, yq33.computeSize());
                this.f140096e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C52156yq3 yq34 = this.f140095d;
            if (yq34 != null) {
                i2 = 0 + C52418a.m58682i(1, yq34.computeSize());
            }
            C52156yq3 yq35 = this.f140096e;
            return yq35 != null ? i2 + C52418a.m58682i(2, yq35.computeSize()) : i2;
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
            C50903q2 q2Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52156yq3 yq36 = new C52156yq3();
                    if (bArr != null && bArr.length > 0) {
                        yq36.parseFrom(bArr);
                    }
                    q2Var.f140095d = yq36;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52156yq3 yq37 = new C52156yq3();
                    if (bArr2 != null && bArr2.length > 0) {
                        yq37.parseFrom(bArr2);
                    }
                    q2Var.f140096e = yq37;
                }
                return 0;
            }
        }
    }
}
