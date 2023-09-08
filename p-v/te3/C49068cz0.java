package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cz0 */
public class C49068cz0 extends C47465a {

    /* renamed from: d */
    public int f132035d;

    /* renamed from: e */
    public float f132036e;

    /* renamed from: f */
    public float f132037f;

    /* renamed from: g */
    public int f132038g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49068cz0)) {
            return false;
        }
        C49068cz0 cz02 = (C49068cz0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132035d), Integer.valueOf(cz02.f132035d)) && C46238a.m51546a(Float.valueOf(this.f132036e), Float.valueOf(cz02.f132036e)) && C46238a.m51546a(Float.valueOf(this.f132037f), Float.valueOf(cz02.f132037f)) && C46238a.m51546a(Integer.valueOf(this.f132038g), Integer.valueOf(cz02.f132038g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132035d);
            aVar.mo74317d(2, this.f132036e);
            aVar.mo74317d(3, this.f132037f);
            aVar.mo74318e(4, this.f132038g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f132035d) + 0 + C52418a.m58677d(2, this.f132036e) + C52418a.m58677d(3, this.f132037f) + C52418a.m58678e(4, this.f132038g);
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
                C49068cz0 cz02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    cz02.f132035d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    cz02.f132036e = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 3) {
                    cz02.f132037f = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    cz02.f132038g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
