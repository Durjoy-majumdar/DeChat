package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ro3 */
public class C51135ro3 extends C47465a {

    /* renamed from: d */
    public int f141061d;

    /* renamed from: e */
    public int f141062e;

    /* renamed from: f */
    public int f141063f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51135ro3)) {
            return false;
        }
        C51135ro3 ro32 = (C51135ro3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141061d), Integer.valueOf(ro32.f141061d)) && C46238a.m51546a(Integer.valueOf(this.f141062e), Integer.valueOf(ro32.f141062e)) && C46238a.m51546a(Integer.valueOf(this.f141063f), Integer.valueOf(ro32.f141063f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141061d);
            aVar.mo74318e(2, this.f141062e);
            aVar.mo74318e(3, this.f141063f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f141061d) + 0 + C52418a.m58678e(2, this.f141062e) + C52418a.m58678e(3, this.f141063f);
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
                C51135ro3 ro32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ro32.f141061d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    ro32.f141062e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    ro32.f141063f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
