package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class z25 extends C47465a {

    /* renamed from: d */
    public String f145662d;

    /* renamed from: e */
    public LinkedList<String> f145663e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof z25)) {
            return false;
        }
        z25 z25 = (z25) aVar;
        return C46238a.m51546a(this.f145662d, z25.f145662d) && C46238a.m51546a(this.f145663e, z25.f145663e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145662d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 1, this.f145663e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f145662d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 1, this.f145663e);
        } else if (i == 2) {
            this.f145663e.clear();
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
            z25 z25 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                z25.f145662d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                z25.f145663e.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
