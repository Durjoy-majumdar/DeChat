package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wp2 */
public class C64809wp2 extends C47465a {

    /* renamed from: d */
    public boolean f186152d;

    /* renamed from: e */
    public boolean f186153e;

    /* renamed from: f */
    public boolean f186154f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64809wp2)) {
            return false;
        }
        C64809wp2 wp22 = (C64809wp2) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f186152d), Boolean.valueOf(wp22.f186152d)) && C46238a.m51546a(Boolean.valueOf(this.f186153e), Boolean.valueOf(wp22.f186153e)) && C46238a.m51546a(Boolean.valueOf(this.f186154f), Boolean.valueOf(wp22.f186154f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f186152d);
            aVar.mo74314a(2, this.f186153e);
            aVar.mo74314a(3, this.f186154f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f186152d) + 0 + C52418a.m58674a(2, this.f186153e) + C52418a.m58674a(3, this.f186154f);
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
                C64809wp2 wp22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    wp22.f186152d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue == 2) {
                    wp22.f186153e = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    wp22.f186154f = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
