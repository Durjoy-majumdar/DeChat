package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.m */
public class C62567m extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f177715d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<Long> f177716e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62567m)) {
            return false;
        }
        C62567m mVar = (C62567m) aVar;
        return C46238a.m51546a(this.f177715d, mVar.f177715d) && C46238a.m51546a(this.f177716e, mVar.f177716e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f177715d);
            aVar.mo74320g(2, 3, this.f177716e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 1, this.f177715d) + 0 + C52418a.m58680g(2, 3, this.f177716e);
        } else {
            if (i == 2) {
                this.f177715d.clear();
                this.f177716e.clear();
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
                C62567m mVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    mVar.f177715d.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    mVar.f177716e.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    return 0;
                }
            }
        }
    }
}
