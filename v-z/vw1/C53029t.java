package vw1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: vw1.t */
public class C53029t extends C47465a {

    /* renamed from: d */
    public double f148026d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C53029t) && C46238a.m51546a(Double.valueOf(this.f148026d), Double.valueOf(((C53029t) aVar).f148026d));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74316c(1, this.f148026d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58676c(1, this.f148026d) + 0;
        } else {
            if (i == 2) {
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
                C53029t tVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                tVar.f148026d = aVar2.mo141627e(intValue);
                return 0;
            }
        }
    }
}
