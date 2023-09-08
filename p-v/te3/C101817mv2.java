package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mv2 */
public class C101817mv2 extends C47465a {

    /* renamed from: d */
    public float f298875d;

    /* renamed from: e */
    public float f298876e;

    /* renamed from: f */
    public float f298877f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101817mv2)) {
            return false;
        }
        C101817mv2 mv22 = (C101817mv2) aVar;
        return C46238a.m51546a(Float.valueOf(this.f298875d), Float.valueOf(mv22.f298875d)) && C46238a.m51546a(Float.valueOf(this.f298876e), Float.valueOf(mv22.f298876e)) && C46238a.m51546a(Float.valueOf(this.f298877f), Float.valueOf(mv22.f298877f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f298875d);
            aVar.mo74317d(2, this.f298876e);
            aVar.mo74317d(3, this.f298877f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f298875d) + 0 + C52418a.m58677d(2, this.f298876e) + C52418a.m58677d(3, this.f298877f);
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
                C101817mv2 mv22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    mv22.f298875d = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 2) {
                    mv22.f298876e = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    mv22.f298877f = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }
}
