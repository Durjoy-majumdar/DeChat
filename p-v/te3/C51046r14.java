package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r14 */
public class C51046r14 extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f140663d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<String> f140664e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51046r14)) {
            return false;
        }
        C51046r14 r142 = (C51046r14) aVar;
        return C46238a.m51546a(this.f140663d, r142.f140663d) && C46238a.m51546a(this.f140664e, r142.f140664e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f140663d);
            aVar.mo74320g(2, 1, this.f140664e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 1, this.f140663d) + 0 + C52418a.m58680g(2, 1, this.f140664e);
        } else {
            if (i == 2) {
                this.f140663d.clear();
                this.f140664e.clear();
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
                C51046r14 r142 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    r142.f140663d.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    r142.f140664e.add(aVar3.mo141633k(intValue));
                    return 0;
                }
            }
        }
    }
}
