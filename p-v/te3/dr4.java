package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class dr4 extends C47465a {

    /* renamed from: d */
    public hr4 f132515d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof dr4) && C46238a.m51546a(this.f132515d, ((dr4) aVar).f132515d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            hr4 hr4 = this.f132515d;
            if (hr4 != null) {
                aVar.mo74322i(1, hr4.computeSize());
                this.f132515d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            hr4 hr42 = this.f132515d;
            if (hr42 != null) {
                return 0 + C52418a.m58682i(1, hr42.computeSize());
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
            dr4 dr4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                hr4 hr43 = new hr4();
                if (bArr != null && bArr.length > 0) {
                    hr43.parseFrom(bArr);
                }
                dr4.f132515d = hr43;
            }
            return 0;
        }
    }
}
