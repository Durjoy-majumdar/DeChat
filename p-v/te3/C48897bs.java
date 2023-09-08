package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.bs */
public class C48897bs extends C47465a {

    /* renamed from: d */
    public LinkedList<Long> f131282d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C48897bs) && C46238a.m51546a(this.f131282d, ((C48897bs) aVar).f131282d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 3, this.f131282d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 3, this.f131282d) + 0;
        } else {
            if (i == 2) {
                this.f131282d.clear();
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
                C48897bs bsVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                bsVar.f131282d.add(Long.valueOf(aVar2.mo141631i(intValue)));
                return 0;
            }
        }
    }
}
