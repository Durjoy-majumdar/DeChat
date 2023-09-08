package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nm2 */
public class C64585nm2 extends C47465a {

    /* renamed from: d */
    public int f184497d;

    /* renamed from: e */
    public String f184498e;

    /* renamed from: f */
    public int f184499f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64585nm2)) {
            return false;
        }
        C64585nm2 nm22 = (C64585nm2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184497d), Integer.valueOf(nm22.f184497d)) && C46238a.m51546a(this.f184498e, nm22.f184498e) && C46238a.m51546a(Integer.valueOf(this.f184499f), Integer.valueOf(nm22.f184499f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184497d);
            String str = this.f184498e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f184499f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184497d) + 0;
            String str2 = this.f184498e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58678e(3, this.f184499f);
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
            C64585nm2 nm22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nm22.f184497d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                nm22.f184498e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                nm22.f184499f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
