package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.bp1 */
public class C48889bp1 extends C47465a {

    /* renamed from: d */
    public LinkedList<Float> f131245d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C48889bp1) && C46238a.m51546a(this.f131245d, ((C48889bp1) aVar).f131245d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 5, this.f131245d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 5, this.f131245d) + 0;
        } else {
            if (i == 2) {
                this.f131245d.clear();
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
                C48889bp1 bp12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                bp12.f131245d.add(Float.valueOf(aVar2.mo141628f(intValue)));
                return 0;
            }
        }
    }
}
