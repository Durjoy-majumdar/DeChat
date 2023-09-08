package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class xi4 extends C101820nt3 {

    /* renamed from: d */
    public int f144693d;

    /* renamed from: e */
    public int f144694e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xi4)) {
            return false;
        }
        xi4 xi4 = (xi4) aVar;
        return C46238a.m51546a(this.BaseRequest, xi4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f144693d), Integer.valueOf(xi4.f144693d)) && C46238a.m51546a(Integer.valueOf(this.f144694e), Integer.valueOf(xi4.f144694e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f144693d);
            aVar.mo74318e(3, this.f144694e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f144693d) + C52418a.m58678e(3, this.f144694e);
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
            xi4 xi4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    xi4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                xi4.f144693d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                xi4.f144694e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
