package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class fx4 extends C47465a {

    /* renamed from: d */
    public ew4 f133733d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof fx4) && C46238a.m51546a(this.f133733d, ((fx4) aVar).f133733d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            ew4 ew4 = this.f133733d;
            if (ew4 != null) {
                if (ew4 != null) {
                    aVar.mo74322i(1, ew4.computeSize());
                    this.f133733d.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_response");
        } else if (i == 1) {
            ew4 ew42 = this.f133733d;
            if (ew42 != null) {
                return 0 + C52418a.m58682i(1, ew42.computeSize());
            }
            return 0;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133733d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_response");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            fx4 fx4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                ew4 ew43 = new ew4();
                if (bArr != null && bArr.length > 0) {
                    ew43.parseFrom(bArr);
                }
                fx4.f133733d = ew43;
            }
            return 0;
        }
    }
}
