package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zi1 */
public class C64882zi1 extends C47465a {

    /* renamed from: d */
    public int f186704d;

    /* renamed from: e */
    public long f186705e;

    /* renamed from: f */
    public int f186706f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64882zi1)) {
            return false;
        }
        C64882zi1 zi12 = (C64882zi1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186704d), Integer.valueOf(zi12.f186704d)) && C46238a.m51546a(Long.valueOf(this.f186705e), Long.valueOf(zi12.f186705e)) && C46238a.m51546a(Integer.valueOf(this.f186706f), Integer.valueOf(zi12.f186706f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186704d);
            aVar.mo74321h(2, this.f186705e);
            aVar.mo74318e(3, this.f186706f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f186704d) + 0 + C52418a.m58681h(2, this.f186705e) + C52418a.m58678e(3, this.f186706f);
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
                C64882zi1 zi12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    zi12.f186704d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    zi12.f186705e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    zi12.f186706f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
