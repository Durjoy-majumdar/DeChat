package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vf3 */
public class C118475vf3 extends C47465a {

    /* renamed from: d */
    public double f354500d;

    /* renamed from: e */
    public double f354501e;

    /* renamed from: f */
    public double f354502f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118475vf3)) {
            return false;
        }
        C118475vf3 vf32 = (C118475vf3) aVar;
        return C46238a.m51546a(Double.valueOf(this.f354500d), Double.valueOf(vf32.f354500d)) && C46238a.m51546a(Double.valueOf(this.f354501e), Double.valueOf(vf32.f354501e)) && C46238a.m51546a(Double.valueOf(this.f354502f), Double.valueOf(vf32.f354502f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74316c(1, this.f354500d);
            aVar.mo74316c(2, this.f354501e);
            aVar.mo74316c(3, this.f354502f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58676c(1, this.f354500d) + 0 + C52418a.m58676c(2, this.f354501e) + C52418a.m58676c(3, this.f354502f);
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
                C118475vf3 vf32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    vf32.f354500d = aVar3.mo141627e(intValue);
                    return 0;
                } else if (intValue == 2) {
                    vf32.f354501e = aVar3.mo141627e(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    vf32.f354502f = aVar3.mo141627e(intValue);
                    return 0;
                }
            }
        }
    }
}
