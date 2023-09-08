package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p00 */
public class C64617p00 extends C47465a {

    /* renamed from: d */
    public String f184723d;

    /* renamed from: e */
    public String f184724e;

    /* renamed from: f */
    public int f184725f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64617p00)) {
            return false;
        }
        C64617p00 p002 = (C64617p00) aVar;
        return C46238a.m51546a(this.f184723d, p002.f184723d) && C46238a.m51546a(this.f184724e, p002.f184724e) && C46238a.m51546a(Integer.valueOf(this.f184725f), Integer.valueOf(p002.f184725f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184723d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184724e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f184725f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f184723d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f184724e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f184725f);
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
            C64617p00 p002 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p002.f184723d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                p002.f184724e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                p002.f184725f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
