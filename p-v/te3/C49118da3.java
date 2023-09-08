package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.da3 */
public class C49118da3 extends C47465a {

    /* renamed from: d */
    public float f132211d;

    /* renamed from: e */
    public float f132212e;

    /* renamed from: f */
    public float f132213f;

    /* renamed from: g */
    public float f132214g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49118da3)) {
            return false;
        }
        C49118da3 da32 = (C49118da3) aVar;
        return C46238a.m51546a(Float.valueOf(this.f132211d), Float.valueOf(da32.f132211d)) && C46238a.m51546a(Float.valueOf(this.f132212e), Float.valueOf(da32.f132212e)) && C46238a.m51546a(Float.valueOf(this.f132213f), Float.valueOf(da32.f132213f)) && C46238a.m51546a(Float.valueOf(this.f132214g), Float.valueOf(da32.f132214g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f132211d);
            aVar.mo74317d(2, this.f132212e);
            aVar.mo74317d(3, this.f132213f);
            aVar.mo74317d(4, this.f132214g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f132211d) + 0 + C52418a.m58677d(2, this.f132212e) + C52418a.m58677d(3, this.f132213f) + C52418a.m58677d(4, this.f132214g);
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
                C49118da3 da32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    da32.f132211d = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 2) {
                    da32.f132212e = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 3) {
                    da32.f132213f = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    da32.f132214g = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }
}
