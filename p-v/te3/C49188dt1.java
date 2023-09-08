package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dt1 */
public class C49188dt1 extends C47465a {

    /* renamed from: d */
    public boolean f132521d;

    /* renamed from: e */
    public int f132522e;

    /* renamed from: f */
    public int f132523f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49188dt1)) {
            return false;
        }
        C49188dt1 dt12 = (C49188dt1) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f132521d), Boolean.valueOf(dt12.f132521d)) && C46238a.m51546a(Integer.valueOf(this.f132522e), Integer.valueOf(dt12.f132522e)) && C46238a.m51546a(Integer.valueOf(this.f132523f), Integer.valueOf(dt12.f132523f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f132521d);
            aVar.mo74318e(2, this.f132522e);
            aVar.mo74318e(3, this.f132523f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f132521d) + 0 + C52418a.m58678e(2, this.f132522e) + C52418a.m58678e(3, this.f132523f);
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
                C49188dt1 dt12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    dt12.f132521d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue == 2) {
                    dt12.f132522e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    dt12.f132523f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
