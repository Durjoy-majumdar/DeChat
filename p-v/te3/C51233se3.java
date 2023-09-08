package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.se3 */
public class C51233se3 extends C47465a {

    /* renamed from: d */
    public float f141462d;

    /* renamed from: e */
    public float f141463e;

    /* renamed from: f */
    public int f141464f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51233se3)) {
            return false;
        }
        C51233se3 se32 = (C51233se3) aVar;
        return C46238a.m51546a(Float.valueOf(this.f141462d), Float.valueOf(se32.f141462d)) && C46238a.m51546a(Float.valueOf(this.f141463e), Float.valueOf(se32.f141463e)) && C46238a.m51546a(Integer.valueOf(this.f141464f), Integer.valueOf(se32.f141464f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f141462d);
            aVar.mo74317d(2, this.f141463e);
            aVar.mo74318e(3, this.f141464f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f141462d) + 0 + C52418a.m58677d(2, this.f141463e) + C52418a.m58678e(3, this.f141464f);
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
                C51233se3 se32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    se32.f141462d = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 2) {
                    se32.f141463e = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    se32.f141464f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
