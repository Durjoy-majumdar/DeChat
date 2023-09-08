package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n81 */
public class C50508n81 extends C47465a {

    /* renamed from: d */
    public String f138475d;

    /* renamed from: e */
    public String f138476e;

    /* renamed from: f */
    public boolean f138477f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50508n81)) {
            return false;
        }
        C50508n81 n812 = (C50508n81) aVar;
        return C46238a.m51546a(this.f138475d, n812.f138475d) && C46238a.m51546a(this.f138476e, n812.f138476e) && C46238a.m51546a(Boolean.valueOf(this.f138477f), Boolean.valueOf(n812.f138477f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138475d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138476e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74314a(3, this.f138477f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f138475d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f138476e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58674a(3, this.f138477f);
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
            C50508n81 n812 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n812.f138475d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                n812.f138476e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                n812.f138477f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
