package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i43 */
public class C49799i43 extends C47465a {

    /* renamed from: d */
    public C77949j3 f135104d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C49799i43) && C46238a.m51546a(this.f135104d, ((C49799i43) aVar).f135104d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C77949j3 j3Var = this.f135104d;
            if (j3Var != null) {
                aVar.mo74322i(1, j3Var.computeSize());
                this.f135104d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C77949j3 j3Var2 = this.f135104d;
            if (j3Var2 != null) {
                return 0 + C52418a.m58682i(1, j3Var2.computeSize());
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
            C49799i43 i432 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C77949j3 j3Var3 = new C77949j3();
                if (bArr != null && bArr.length > 0) {
                    j3Var3.parseFrom(bArr);
                }
                i432.f135104d = j3Var3;
            }
            return 0;
        }
    }
}
