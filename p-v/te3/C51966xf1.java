package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xf1 */
public class C51966xf1 extends C47465a {

    /* renamed from: d */
    public long f144631d;

    /* renamed from: e */
    public boolean f144632e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51966xf1)) {
            return false;
        }
        C51966xf1 xf12 = (C51966xf1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f144631d), Long.valueOf(xf12.f144631d)) && C46238a.m51546a(Boolean.valueOf(this.f144632e), Boolean.valueOf(xf12.f144632e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f144631d);
            aVar.mo74314a(2, this.f144632e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f144631d) + 0 + C52418a.m58674a(2, this.f144632e);
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
                C51966xf1 xf12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    xf12.f144631d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    xf12.f144632e = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
