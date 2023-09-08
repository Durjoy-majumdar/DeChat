package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jc1 */
public class C64465jc1 extends C47465a {

    /* renamed from: d */
    public String f183779d;

    /* renamed from: e */
    public int f183780e;

    /* renamed from: f */
    public String f183781f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64465jc1)) {
            return false;
        }
        C64465jc1 jc12 = (C64465jc1) aVar;
        return C46238a.m51546a(this.f183779d, jc12.f183779d) && C46238a.m51546a(Integer.valueOf(this.f183780e), Integer.valueOf(jc12.f183780e)) && C46238a.m51546a(this.f183781f, jc12.f183781f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183779d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f183780e);
            String str2 = this.f183781f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f183779d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f183780e);
            String str4 = this.f183781f;
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
            C64465jc1 jc12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jc12.f183779d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                jc12.f183780e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                jc12.f183781f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
