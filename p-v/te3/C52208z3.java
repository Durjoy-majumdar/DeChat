package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z3 */
public class C52208z3 extends C47465a {

    /* renamed from: d */
    public C48743ao2 f145664d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C52208z3) && C46238a.m51546a(this.f145664d, ((C52208z3) aVar).f145664d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48743ao2 ao22 = this.f145664d;
            if (ao22 != null) {
                aVar.mo74322i(1, ao22.computeSize());
                this.f145664d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C48743ao2 ao23 = this.f145664d;
            if (ao23 != null) {
                return 0 + C52418a.m58682i(1, ao23.computeSize());
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
            C52208z3 z3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C48743ao2 ao24 = new C48743ao2();
                if (bArr != null && bArr.length > 0) {
                    ao24.parseFrom(bArr);
                }
                z3Var.f145664d = ao24;
            }
            return 0;
        }
    }
}
