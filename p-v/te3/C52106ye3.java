package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ye3 */
public class C52106ye3 extends C47465a {

    /* renamed from: d */
    public float f145249d;

    /* renamed from: e */
    public float f145250e;

    /* renamed from: f */
    public float f145251f;

    /* renamed from: g */
    public float f145252g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52106ye3)) {
            return false;
        }
        C52106ye3 ye32 = (C52106ye3) aVar;
        return C46238a.m51546a(Float.valueOf(this.f145249d), Float.valueOf(ye32.f145249d)) && C46238a.m51546a(Float.valueOf(this.f145250e), Float.valueOf(ye32.f145250e)) && C46238a.m51546a(Float.valueOf(this.f145251f), Float.valueOf(ye32.f145251f)) && C46238a.m51546a(Float.valueOf(this.f145252g), Float.valueOf(ye32.f145252g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f145249d);
            aVar.mo74317d(2, this.f145250e);
            aVar.mo74317d(3, this.f145251f);
            aVar.mo74317d(4, this.f145252g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f145249d) + 0 + C52418a.m58677d(2, this.f145250e) + C52418a.m58677d(3, this.f145251f) + C52418a.m58677d(4, this.f145252g);
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
                C52106ye3 ye32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ye32.f145249d = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 2) {
                    ye32.f145250e = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 3) {
                    ye32.f145251f = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    ye32.f145252g = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }
}
