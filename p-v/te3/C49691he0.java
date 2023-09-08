package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.he0 */
public class C49691he0 extends C47465a {

    /* renamed from: d */
    public long f134578d = 0;

    /* renamed from: e */
    public long f134579e = 0;

    /* renamed from: f */
    public int f134580f = 0;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49691he0)) {
            return false;
        }
        C49691he0 he02 = (C49691he0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f134578d), Long.valueOf(he02.f134578d)) && C46238a.m51546a(Long.valueOf(this.f134579e), Long.valueOf(he02.f134579e)) && C46238a.m51546a(Integer.valueOf(this.f134580f), Integer.valueOf(he02.f134580f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f134578d);
            aVar.mo74321h(2, this.f134579e);
            aVar.mo74318e(3, this.f134580f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f134578d) + 0 + C52418a.m58681h(2, this.f134579e) + C52418a.m58678e(3, this.f134580f);
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
                C49691he0 he02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    he02.f134578d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    he02.f134579e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    he02.f134580f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
