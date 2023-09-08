package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.q2 */
public class C47655q2 extends C47465a {

    /* renamed from: d */
    public C47669s2 f127946d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C47655q2) && C46238a.m51546a(this.f127946d, ((C47655q2) aVar).f127946d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47669s2 s2Var = this.f127946d;
            if (s2Var != null) {
                aVar.mo74322i(1, s2Var.computeSize());
                this.f127946d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C47669s2 s2Var2 = this.f127946d;
            if (s2Var2 != null) {
                return 0 + C52418a.m58682i(1, s2Var2.computeSize());
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
            C47655q2 q2Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C47669s2 s2Var3 = new C47669s2();
                if (bArr != null && bArr.length > 0) {
                    s2Var3.parseFrom(bArr);
                }
                q2Var.f127946d = s2Var3;
            }
            return 0;
        }
    }
}
