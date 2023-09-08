package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class d64 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f132157d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof d64) && C46238a.m51546a(this.f132157d, ((d64) aVar).f132157d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f132157d;
            if (rv32 != null) {
                aVar.mo74322i(1, rv32.computeSize());
                this.f132157d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C51163rv3 rv33 = this.f132157d;
            if (rv33 != null) {
                return 0 + C52418a.m58682i(1, rv33.computeSize());
            }
            return 0;
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
            d64 d64 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C51163rv3 rv34 = new C51163rv3();
                if (bArr != null && bArr.length > 0) {
                    rv34.mo73356d(bArr);
                }
                d64.f132157d = rv34;
            }
            return 0;
        }
    }
}
