package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.gl1 */
public class C49576gl1 extends C47465a {

    /* renamed from: d */
    public LinkedList<Long> f134118d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C49576gl1) && C46238a.m51546a(this.f134118d, ((C49576gl1) aVar).f134118d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 3, this.f134118d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 3, this.f134118d) + 0;
        } else {
            if (i == 2) {
                this.f134118d.clear();
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
                C49576gl1 gl12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                gl12.f134118d.add(Long.valueOf(aVar2.mo141631i(intValue)));
                return 0;
            }
        }
    }
}
