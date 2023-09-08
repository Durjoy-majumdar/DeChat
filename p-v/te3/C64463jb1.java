package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jb1 */
public class C64463jb1 extends C47465a {

    /* renamed from: d */
    public float f183775d;

    /* renamed from: e */
    public float f183776e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64463jb1)) {
            return false;
        }
        C64463jb1 jb12 = (C64463jb1) aVar;
        return C46238a.m51546a(Float.valueOf(this.f183775d), Float.valueOf(jb12.f183775d)) && C46238a.m51546a(Float.valueOf(this.f183776e), Float.valueOf(jb12.f183776e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f183775d);
            aVar.mo74317d(2, this.f183776e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f183775d) + 0 + C52418a.m58677d(2, this.f183776e);
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
                C64463jb1 jb12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    jb12.f183775d = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    jb12.f183776e = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }
}
