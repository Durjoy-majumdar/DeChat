package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eb1 */
public class C49258eb1 extends C47465a {

    /* renamed from: d */
    public int f132834d;

    /* renamed from: e */
    public LinkedList<Integer> f132835e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<Integer> f132836f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49258eb1)) {
            return false;
        }
        C49258eb1 eb12 = (C49258eb1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132834d), Integer.valueOf(eb12.f132834d)) && C46238a.m51546a(this.f132835e, eb12.f132835e) && C46238a.m51546a(this.f132836f, eb12.f132836f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132834d);
            aVar.mo74320g(2, 2, this.f132835e);
            aVar.mo74320g(3, 2, this.f132836f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f132834d) + 0 + C52418a.m58680g(2, 2, this.f132835e) + C52418a.m58680g(3, 2, this.f132836f);
        } else {
            if (i == 2) {
                this.f132835e.clear();
                this.f132836f.clear();
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
                C49258eb1 eb12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    eb12.f132834d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    eb12.f132835e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    eb12.f132836f.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                }
            }
        }
    }
}
