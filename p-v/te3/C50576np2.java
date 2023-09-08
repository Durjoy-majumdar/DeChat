package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.np2 */
public class C50576np2 extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f138714d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C50576np2) && C46238a.m51546a(this.f138714d, ((C50576np2) aVar).f138714d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 1, this.f138714d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 1, this.f138714d) + 0;
        } else {
            if (i == 2) {
                this.f138714d.clear();
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
                C50576np2 np22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                np22.f138714d.add(aVar2.mo141633k(intValue));
                return 0;
            }
        }
    }
}
