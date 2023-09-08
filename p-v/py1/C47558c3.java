package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.c3 */
public class C47558c3 extends C47465a {

    /* renamed from: d */
    public C47623l5 f127625d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C47558c3) && C46238a.m51546a(this.f127625d, ((C47558c3) aVar).f127625d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47623l5 l5Var = this.f127625d;
            if (l5Var != null) {
                aVar.mo74322i(1, l5Var.computeSize());
                this.f127625d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C47623l5 l5Var2 = this.f127625d;
            if (l5Var2 != null) {
                return 0 + C52418a.m58682i(1, l5Var2.computeSize());
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
            C47558c3 c3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C47623l5 l5Var3 = new C47623l5();
                if (bArr != null && bArr.length > 0) {
                    l5Var3.parseFrom(bArr);
                }
                c3Var.f127625d = l5Var3;
            }
            return 0;
        }
    }
}
