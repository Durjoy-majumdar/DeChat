package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ie0 */
public class C64444ie0 extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f183682d = new LinkedList<>();

    /* renamed from: e */
    public int f183683e = 1;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64444ie0)) {
            return false;
        }
        C64444ie0 ie02 = (C64444ie0) aVar;
        return C46238a.m51546a(this.f183682d, ie02.f183682d) && C46238a.m51546a(Integer.valueOf(this.f183683e), Integer.valueOf(ie02.f183683e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f183682d);
            aVar.mo74318e(2, this.f183683e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 1, this.f183682d) + 0 + C52418a.m58678e(2, this.f183683e);
        } else {
            if (i == 2) {
                this.f183682d.clear();
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
                C64444ie0 ie02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ie02.f183682d.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    ie02.f183683e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
