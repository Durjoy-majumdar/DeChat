package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iq0 */
public class C64450iq0 extends C47465a {

    /* renamed from: d */
    public float f183717d;

    /* renamed from: e */
    public float f183718e;

    /* renamed from: f */
    public float f183719f;

    /* renamed from: g */
    public float f183720g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64450iq0)) {
            return false;
        }
        C64450iq0 iq02 = (C64450iq0) aVar;
        return C46238a.m51546a(Float.valueOf(this.f183717d), Float.valueOf(iq02.f183717d)) && C46238a.m51546a(Float.valueOf(this.f183718e), Float.valueOf(iq02.f183718e)) && C46238a.m51546a(Float.valueOf(this.f183719f), Float.valueOf(iq02.f183719f)) && C46238a.m51546a(Float.valueOf(this.f183720g), Float.valueOf(iq02.f183720g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f183717d);
            aVar.mo74317d(2, this.f183718e);
            aVar.mo74317d(3, this.f183719f);
            aVar.mo74317d(4, this.f183720g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f183717d) + 0 + C52418a.m58677d(2, this.f183718e) + C52418a.m58677d(3, this.f183719f) + C52418a.m58677d(4, this.f183720g);
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
                C64450iq0 iq02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    iq02.f183717d = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 2) {
                    iq02.f183718e = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 3) {
                    iq02.f183719f = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    iq02.f183720g = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }
}
