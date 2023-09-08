package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.n6 */
public class C50499n6 extends C47465a {

    /* renamed from: d */
    public LinkedList<C50358m6> f138426d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C50499n6) && C46238a.m51546a(this.f138426d, ((C50499n6) aVar).f138426d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f138426d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f138426d) + 0;
        } else {
            if (i == 2) {
                this.f138426d.clear();
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
                C50499n6 n6Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50358m6 m6Var = new C50358m6();
                    if (bArr != null && bArr.length > 0) {
                        m6Var.parseFrom(bArr);
                    }
                    n6Var.f138426d.add(m6Var);
                }
                return 0;
            }
        }
    }
}
