package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.x6 */
public class C51929x6 extends C47465a {

    /* renamed from: d */
    public LinkedList<C52072y6> f144481d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C51929x6) && C46238a.m51546a(this.f144481d, ((C51929x6) aVar).f144481d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f144481d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f144481d) + 0;
        } else {
            if (i == 2) {
                this.f144481d.clear();
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                C51929x6 x6Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52072y6 y6Var = new C52072y6();
                    if (bArr != null && bArr.length > 0) {
                        y6Var.parseFrom(bArr);
                    }
                    x6Var.f144481d.add(y6Var);
                }
                return 0;
            }
        }
    }
}
