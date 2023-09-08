package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ix4 extends C47465a {

    /* renamed from: d */
    public dw4 f135738d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof ix4) && C46238a.m51546a(this.f135738d, ((ix4) aVar).f135738d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            dw4 dw4 = this.f135738d;
            if (dw4 != null) {
                if (dw4 != null) {
                    aVar.mo74322i(1, dw4.computeSize());
                    this.f135738d.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_request");
        } else if (i == 1) {
            dw4 dw42 = this.f135738d;
            if (dw42 != null) {
                return 0 + C52418a.m58682i(1, dw42.computeSize());
            }
            return 0;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135738d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_request");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ix4 ix4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                dw4 dw43 = new dw4();
                if (bArr != null && bArr.length > 0) {
                    dw43.parseFrom(bArr);
                }
                ix4.f135738d = dw43;
            }
            return 0;
        }
    }
}
