package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xd2 */
public class C64826xd2 extends C47465a {

    /* renamed from: d */
    public int f186289d;

    /* renamed from: e */
    public int f186290e;

    /* renamed from: f */
    public boolean f186291f;

    /* renamed from: g */
    public boolean f186292g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64826xd2)) {
            return false;
        }
        C64826xd2 xd22 = (C64826xd2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186289d), Integer.valueOf(xd22.f186289d)) && C46238a.m51546a(Integer.valueOf(this.f186290e), Integer.valueOf(xd22.f186290e)) && C46238a.m51546a(Boolean.valueOf(this.f186291f), Boolean.valueOf(xd22.f186291f)) && C46238a.m51546a(Boolean.valueOf(this.f186292g), Boolean.valueOf(xd22.f186292g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186289d);
            aVar.mo74318e(2, this.f186290e);
            aVar.mo74314a(3, this.f186291f);
            aVar.mo74314a(4, this.f186292g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f186289d) + 0 + C52418a.m58678e(2, this.f186290e) + C52418a.m58674a(3, this.f186291f) + C52418a.m58674a(4, this.f186292g);
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
                C64826xd2 xd22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    xd22.f186289d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    xd22.f186290e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    xd22.f186291f = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    xd22.f186292g = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
