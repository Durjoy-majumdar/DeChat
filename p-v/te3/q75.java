package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class q75 extends C47465a {

    /* renamed from: d */
    public e75 f140176d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof q75) && C46238a.m51546a(this.f140176d, ((q75) aVar).f140176d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            e75 e75 = this.f140176d;
            if (e75 != null) {
                aVar.mo74322i(1, e75.computeSize());
                this.f140176d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            e75 e752 = this.f140176d;
            if (e752 != null) {
                return 0 + C52418a.m58682i(1, e752.computeSize());
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
            q75 q75 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                e75 e753 = new e75();
                if (bArr != null && bArr.length > 0) {
                    e753.parseFrom(bArr);
                }
                q75.f140176d = e753;
            }
            return 0;
        }
    }
}
