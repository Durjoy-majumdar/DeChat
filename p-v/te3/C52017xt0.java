package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xt0 */
public class C52017xt0 extends C47465a {

    /* renamed from: d */
    public C50317lw0 f144935d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C52017xt0) && C46238a.m51546a(this.f144935d, ((C52017xt0) aVar).f144935d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50317lw0 lw02 = this.f144935d;
            if (lw02 != null) {
                aVar.mo74322i(1, lw02.computeSize());
                this.f144935d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C50317lw0 lw03 = this.f144935d;
            if (lw03 != null) {
                return 0 + C52418a.m58682i(1, lw03.computeSize());
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
            C52017xt0 xt02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C50317lw0 lw04 = new C50317lw0();
                if (bArr != null && bArr.length > 0) {
                    lw04.parseFrom(bArr);
                }
                xt02.f144935d = lw04;
            }
            return 0;
        }
    }
}
