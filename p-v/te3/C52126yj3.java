package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yj3 */
public class C52126yj3 extends C47465a {

    /* renamed from: d */
    public float f145327d;

    /* renamed from: e */
    public float f145328e;

    /* renamed from: f */
    public float f145329f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52126yj3)) {
            return false;
        }
        C52126yj3 yj32 = (C52126yj3) aVar;
        return C46238a.m51546a(Float.valueOf(this.f145327d), Float.valueOf(yj32.f145327d)) && C46238a.m51546a(Float.valueOf(this.f145328e), Float.valueOf(yj32.f145328e)) && C46238a.m51546a(Float.valueOf(this.f145329f), Float.valueOf(yj32.f145329f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f145327d);
            aVar.mo74317d(2, this.f145328e);
            aVar.mo74317d(3, this.f145329f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f145327d) + 0 + C52418a.m58677d(2, this.f145328e) + C52418a.m58677d(3, this.f145329f);
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
                C52126yj3 yj32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    yj32.f145327d = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 2) {
                    yj32.f145328e = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    yj32.f145329f = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }
}
