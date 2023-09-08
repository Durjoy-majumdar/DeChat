package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cp2 */
public class C49035cp2 extends C47465a {

    /* renamed from: d */
    public int f131889d;

    /* renamed from: e */
    public int f131890e;

    /* renamed from: f */
    public int f131891f;

    /* renamed from: g */
    public int f131892g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49035cp2)) {
            return false;
        }
        C49035cp2 cp22 = (C49035cp2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131889d), Integer.valueOf(cp22.f131889d)) && C46238a.m51546a(Integer.valueOf(this.f131890e), Integer.valueOf(cp22.f131890e)) && C46238a.m51546a(Integer.valueOf(this.f131891f), Integer.valueOf(cp22.f131891f)) && C46238a.m51546a(Integer.valueOf(this.f131892g), Integer.valueOf(cp22.f131892g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131889d);
            aVar.mo74318e(2, this.f131890e);
            aVar.mo74318e(3, this.f131891f);
            aVar.mo74318e(4, this.f131892g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f131889d) + 0 + C52418a.m58678e(2, this.f131890e) + C52418a.m58678e(3, this.f131891f) + C52418a.m58678e(4, this.f131892g);
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
                C49035cp2 cp22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    cp22.f131889d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    cp22.f131890e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    cp22.f131891f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    cp22.f131892g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
