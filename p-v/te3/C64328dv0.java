package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dv0 */
public class C64328dv0 extends C47465a {

    /* renamed from: d */
    public boolean f182858d;

    /* renamed from: e */
    public long f182859e;

    /* renamed from: f */
    public double f182860f;

    /* renamed from: g */
    public long f182861g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64328dv0)) {
            return false;
        }
        C64328dv0 dv02 = (C64328dv0) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f182858d), Boolean.valueOf(dv02.f182858d)) && C46238a.m51546a(Long.valueOf(this.f182859e), Long.valueOf(dv02.f182859e)) && C46238a.m51546a(Double.valueOf(this.f182860f), Double.valueOf(dv02.f182860f)) && C46238a.m51546a(Long.valueOf(this.f182861g), Long.valueOf(dv02.f182861g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f182858d);
            aVar.mo74321h(2, this.f182859e);
            aVar.mo74316c(3, this.f182860f);
            aVar.mo74321h(4, this.f182861g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f182858d) + 0 + C52418a.m58681h(2, this.f182859e) + C52418a.m58676c(3, this.f182860f) + C52418a.m58681h(4, this.f182861g);
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
                C64328dv0 dv02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    dv02.f182858d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue == 2) {
                    dv02.f182859e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 3) {
                    dv02.f182860f = aVar3.mo141627e(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    dv02.f182861g = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
