package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class dy4 extends C47465a {

    /* renamed from: d */
    public fy4 f132566d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof dy4) && C46238a.m51546a(this.f132566d, ((dy4) aVar).f132566d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            fy4 fy4 = this.f132566d;
            if (fy4 != null) {
                aVar.mo74322i(1, fy4.computeSize());
                this.f132566d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            fy4 fy42 = this.f132566d;
            if (fy42 != null) {
                return 0 + C52418a.m58682i(1, fy42.computeSize());
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
            dy4 dy4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                fy4 fy43 = new fy4();
                if (bArr != null && bArr.length > 0) {
                    fy43.parseFrom(bArr);
                }
                dy4.f132566d = fy43;
            }
            return 0;
        }
    }
}
