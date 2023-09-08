package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vh */
public class C51694vh extends C47465a {

    /* renamed from: d */
    public boolean f143482d;

    /* renamed from: e */
    public LinkedList<Integer> f143483e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51694vh)) {
            return false;
        }
        C51694vh vhVar = (C51694vh) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f143482d), Boolean.valueOf(vhVar.f143482d)) && C46238a.m51546a(this.f143483e, vhVar.f143483e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f143482d);
            aVar.mo74320g(2, 2, this.f143483e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f143482d) + 0 + C52418a.m58680g(2, 2, this.f143483e);
        } else {
            if (i == 2) {
                this.f143483e.clear();
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
                C51694vh vhVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    vhVar.f143482d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    vhVar.f143483e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                }
            }
        }
    }
}
