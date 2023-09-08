package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r31 */
public class C64671r31 extends C47465a {

    /* renamed from: d */
    public int f185102d;

    /* renamed from: e */
    public String f185103e;

    /* renamed from: f */
    public String f185104f;

    /* renamed from: g */
    public String f185105g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64671r31)) {
            return false;
        }
        C64671r31 r312 = (C64671r31) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185102d), Integer.valueOf(r312.f185102d)) && C46238a.m51546a(this.f185103e, r312.f185103e) && C46238a.m51546a(this.f185104f, r312.f185104f) && C46238a.m51546a(this.f185105g, r312.f185105g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185102d);
            String str = this.f185103e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185104f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f185105g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f185102d) + 0;
            String str4 = this.f185103e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f185104f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f185105g;
            return str6 != null ? e + C52418a.m58683j(4, str6) : e;
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
            C64671r31 r312 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                r312.f185102d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                r312.f185103e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                r312.f185104f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                r312.f185105g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
