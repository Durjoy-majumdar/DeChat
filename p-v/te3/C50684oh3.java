package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oh3 */
public class C50684oh3 extends C47465a {

    /* renamed from: d */
    public int f139184d;

    /* renamed from: e */
    public String f139185e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50684oh3)) {
            return false;
        }
        C50684oh3 oh32 = (C50684oh3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139184d), Integer.valueOf(oh32.f139184d)) && C46238a.m51546a(this.f139185e, oh32.f139185e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139184d);
            String str = this.f139185e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139184d) + 0;
            String str2 = this.f139185e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
        } else if (i == 2) {
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
            C50684oh3 oh32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                oh32.f139184d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                oh32.f139185e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
