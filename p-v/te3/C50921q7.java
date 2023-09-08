package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.q7 */
public class C50921q7 extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f140167d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C50921q7) && C46238a.m51546a(this.f140167d, ((C50921q7) aVar).f140167d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 1, this.f140167d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 1, this.f140167d) + 0;
        } else {
            if (i == 2) {
                this.f140167d.clear();
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
                C50921q7 q7Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                q7Var.f140167d.add(aVar2.mo141633k(intValue));
                return 0;
            }
        }
    }
}
