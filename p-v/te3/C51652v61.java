package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v61 */
public class C51652v61 extends C47465a {

    /* renamed from: d */
    public long f143342d;

    /* renamed from: e */
    public int f143343e;

    /* renamed from: f */
    public int f143344f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51652v61)) {
            return false;
        }
        C51652v61 v612 = (C51652v61) aVar;
        return C46238a.m51546a(Long.valueOf(this.f143342d), Long.valueOf(v612.f143342d)) && C46238a.m51546a(Integer.valueOf(this.f143343e), Integer.valueOf(v612.f143343e)) && C46238a.m51546a(Integer.valueOf(this.f143344f), Integer.valueOf(v612.f143344f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f143342d);
            aVar.mo74318e(2, this.f143343e);
            aVar.mo74318e(3, this.f143344f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f143342d) + 0 + C52418a.m58678e(2, this.f143343e) + C52418a.m58678e(3, this.f143344f);
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
                C51652v61 v612 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    v612.f143342d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    v612.f143343e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    v612.f143344f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
