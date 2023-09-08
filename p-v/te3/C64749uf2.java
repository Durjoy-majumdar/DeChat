package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uf2 */
public class C64749uf2 extends C47465a {

    /* renamed from: d */
    public int f185727d;

    /* renamed from: e */
    public String f185728e;

    /* renamed from: f */
    public String f185729f;

    /* renamed from: g */
    public String f185730g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64749uf2)) {
            return false;
        }
        C64749uf2 uf22 = (C64749uf2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185727d), Integer.valueOf(uf22.f185727d)) && C46238a.m51546a(this.f185728e, uf22.f185728e) && C46238a.m51546a(this.f185729f, uf22.f185729f) && C46238a.m51546a(this.f185730g, uf22.f185730g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185727d);
            String str = this.f185728e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185729f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f185730g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f185727d) + 0;
            String str4 = this.f185728e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f185729f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f185730g;
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
            C64749uf2 uf22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                uf22.f185727d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                uf22.f185728e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                uf22.f185729f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                uf22.f185730g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
