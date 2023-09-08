package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ej2 */
public class C49293ej2 extends C47465a {

    /* renamed from: d */
    public String f132957d;

    /* renamed from: e */
    public int f132958e;

    /* renamed from: f */
    public String f132959f;

    /* renamed from: g */
    public String f132960g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49293ej2)) {
            return false;
        }
        C49293ej2 ej22 = (C49293ej2) aVar;
        return C46238a.m51546a(this.f132957d, ej22.f132957d) && C46238a.m51546a(Integer.valueOf(this.f132958e), Integer.valueOf(ej22.f132958e)) && C46238a.m51546a(this.f132959f, ej22.f132959f) && C46238a.m51546a(this.f132960g, ej22.f132960g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132957d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f132958e);
            String str2 = this.f132959f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f132960g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f132957d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f132958e);
            String str5 = this.f132959f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f132960g;
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
            C49293ej2 ej22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ej22.f132957d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ej22.f132958e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ej22.f132959f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ej22.f132960g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
