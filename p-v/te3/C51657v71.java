package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v71 */
public class C51657v71 extends C47465a {

    /* renamed from: d */
    public int f143374d;

    /* renamed from: e */
    public LinkedList<Integer> f143375e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51657v71)) {
            return false;
        }
        C51657v71 v712 = (C51657v71) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143374d), Integer.valueOf(v712.f143374d)) && C46238a.m51546a(this.f143375e, v712.f143375e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143374d);
            aVar.mo74320g(2, 2, this.f143375e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f143374d) + 0 + C52418a.m58680g(2, 2, this.f143375e);
        } else {
            if (i == 2) {
                this.f143375e.clear();
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
                C51657v71 v712 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    v712.f143374d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    v712.f143375e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                }
            }
        }
    }
}
