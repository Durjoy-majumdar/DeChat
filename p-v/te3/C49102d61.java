package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d61 */
public class C49102d61 extends C47465a {

    /* renamed from: d */
    public String f132141d;

    /* renamed from: e */
    public int f132142e;

    /* renamed from: f */
    public String f132143f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49102d61)) {
            return false;
        }
        C49102d61 d612 = (C49102d61) aVar;
        return C46238a.m51546a(this.f132141d, d612.f132141d) && C46238a.m51546a(Integer.valueOf(this.f132142e), Integer.valueOf(d612.f132142e)) && C46238a.m51546a(this.f132143f, d612.f132143f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132141d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f132142e);
            String str2 = this.f132143f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f132141d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f132142e);
            String str4 = this.f132143f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            C49102d61 d612 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d612.f132141d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                d612.f132142e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                d612.f132143f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
