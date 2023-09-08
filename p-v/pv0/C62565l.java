package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.l */
public class C62565l extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f177709d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<Long> f177710e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62565l)) {
            return false;
        }
        C62565l lVar = (C62565l) aVar;
        return C46238a.m51546a(this.f177709d, lVar.f177709d) && C46238a.m51546a(this.f177710e, lVar.f177710e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f177709d);
            aVar.mo74320g(2, 3, this.f177710e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 1, this.f177709d) + 0 + C52418a.m58680g(2, 3, this.f177710e);
        } else {
            if (i == 2) {
                this.f177709d.clear();
                this.f177710e.clear();
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
                C62565l lVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    lVar.f177709d.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    lVar.f177710e.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    return 0;
                }
            }
        }
    }
}
