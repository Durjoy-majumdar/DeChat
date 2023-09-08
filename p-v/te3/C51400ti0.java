package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ti0 */
public class C51400ti0 extends C47465a {

    /* renamed from: d */
    public float f142237d;

    /* renamed from: e */
    public float f142238e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51400ti0)) {
            return false;
        }
        C51400ti0 ti02 = (C51400ti0) aVar;
        return C46238a.m51546a(Float.valueOf(this.f142237d), Float.valueOf(ti02.f142237d)) && C46238a.m51546a(Float.valueOf(this.f142238e), Float.valueOf(ti02.f142238e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f142237d);
            aVar.mo74317d(2, this.f142238e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f142237d) + 0 + C52418a.m58677d(2, this.f142238e);
        } else {
            if (i == 2) {
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
                C51400ti0 ti02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ti02.f142237d = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    ti02.f142238e = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }
}
