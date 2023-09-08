package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y63 */
public class C52076y63 extends C47465a {

    /* renamed from: d */
    public String f145143d;

    /* renamed from: e */
    public int f145144e;

    /* renamed from: f */
    public String f145145f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52076y63)) {
            return false;
        }
        C52076y63 y632 = (C52076y63) aVar;
        return C46238a.m51546a(this.f145143d, y632.f145143d) && C46238a.m51546a(Integer.valueOf(this.f145144e), Integer.valueOf(y632.f145144e)) && C46238a.m51546a(this.f145145f, y632.f145145f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145143d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f145144e);
            String str2 = this.f145145f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f145143d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f145144e);
            String str4 = this.f145145f;
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
            C52076y63 y632 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                y632.f145143d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                y632.f145144e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                y632.f145145f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
