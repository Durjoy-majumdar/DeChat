package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.og1 */
public class C50677og1 extends C47465a {

    /* renamed from: d */
    public C51822we1 f139153d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C50677og1) && C46238a.m51546a(this.f139153d, ((C50677og1) aVar).f139153d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51822we1 we12 = this.f139153d;
            if (we12 != null) {
                aVar.mo74322i(1, we12.computeSize());
                this.f139153d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C51822we1 we13 = this.f139153d;
            if (we13 != null) {
                return 0 + C52418a.m58682i(1, we13.computeSize());
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
            C50677og1 og12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C51822we1 we14 = new C51822we1();
                if (bArr != null && bArr.length > 0) {
                    we14.parseFrom(bArr);
                }
                og12.f139153d = we14;
            }
            return 0;
        }
    }
}
