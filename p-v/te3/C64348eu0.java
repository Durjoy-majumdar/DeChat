package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eu0 */
public class C64348eu0 extends C47465a {

    /* renamed from: d */
    public int f183030d;

    /* renamed from: e */
    public int f183031e;

    /* renamed from: f */
    public int f183032f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64348eu0)) {
            return false;
        }
        C64348eu0 eu02 = (C64348eu0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183030d), Integer.valueOf(eu02.f183030d)) && C46238a.m51546a(Integer.valueOf(this.f183031e), Integer.valueOf(eu02.f183031e)) && C46238a.m51546a(Integer.valueOf(this.f183032f), Integer.valueOf(eu02.f183032f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183030d);
            aVar.mo74318e(2, this.f183031e);
            aVar.mo74318e(3, this.f183032f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f183030d) + 0 + C52418a.m58678e(2, this.f183031e) + C52418a.m58678e(3, this.f183032f);
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
                C64348eu0 eu02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    eu02.f183030d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    eu02.f183031e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    eu02.f183032f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
