package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class d15 extends C47465a {

    /* renamed from: d */
    public LinkedList<Integer> f132070d = new LinkedList<>();

    /* renamed from: e */
    public boolean f132071e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof d15)) {
            return false;
        }
        d15 d15 = (d15) aVar;
        return C46238a.m51546a(this.f132070d, d15.f132070d) && C46238a.m51546a(Boolean.valueOf(this.f132071e), Boolean.valueOf(d15.f132071e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 2, this.f132070d);
            aVar.mo74314a(2, this.f132071e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 2, this.f132070d) + 0 + C52418a.m58674a(2, this.f132071e);
        } else {
            if (i == 2) {
                this.f132070d.clear();
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
                d15 d15 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    d15.f132070d.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    d15.f132071e = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
