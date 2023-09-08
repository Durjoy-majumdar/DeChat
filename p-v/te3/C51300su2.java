package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.su2 */
public class C51300su2 extends C47465a {

    /* renamed from: d */
    public float f141760d;

    /* renamed from: e */
    public float f141761e;

    /* renamed from: f */
    public float f141762f;

    /* renamed from: g */
    public float f141763g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51300su2)) {
            return false;
        }
        C51300su2 su22 = (C51300su2) aVar;
        return C46238a.m51546a(Float.valueOf(this.f141760d), Float.valueOf(su22.f141760d)) && C46238a.m51546a(Float.valueOf(this.f141761e), Float.valueOf(su22.f141761e)) && C46238a.m51546a(Float.valueOf(this.f141762f), Float.valueOf(su22.f141762f)) && C46238a.m51546a(Float.valueOf(this.f141763g), Float.valueOf(su22.f141763g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f141760d);
            aVar.mo74317d(2, this.f141761e);
            aVar.mo74317d(3, this.f141762f);
            aVar.mo74317d(4, this.f141763g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f141760d) + 0 + C52418a.m58677d(2, this.f141761e) + C52418a.m58677d(3, this.f141762f) + C52418a.m58677d(4, this.f141763g);
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
                C51300su2 su22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    su22.f141760d = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 2) {
                    su22.f141761e = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 3) {
                    su22.f141762f = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    su22.f141763g = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }
}
