package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n14 */
public class C118446n14 extends C47465a {

    /* renamed from: d */
    public String f354146d;

    /* renamed from: e */
    public String f354147e;

    /* renamed from: f */
    public String f354148f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118446n14)) {
            return false;
        }
        C118446n14 n142 = (C118446n14) aVar;
        return C46238a.m51546a(this.f354146d, n142.f354146d) && C46238a.m51546a(this.f354147e, n142.f354147e) && C46238a.m51546a(this.f354148f, n142.f354148f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354146d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f354147e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f354148f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f354146d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f354147e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f354148f;
            return str6 != null ? i2 + C52418a.m58683j(3, str6) : i2;
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
            C118446n14 n142 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n142.f354146d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                n142.f354147e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                n142.f354148f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
