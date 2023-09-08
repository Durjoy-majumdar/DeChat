package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.q3 */
public class C47656q3 extends C47465a {

    /* renamed from: d */
    public String f127947d;

    /* renamed from: e */
    public String f127948e;

    /* renamed from: f */
    public String f127949f;

    /* renamed from: g */
    public String f127950g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47656q3)) {
            return false;
        }
        C47656q3 q3Var = (C47656q3) aVar;
        return C46238a.m51546a(this.f127947d, q3Var.f127947d) && C46238a.m51546a(this.f127948e, q3Var.f127948e) && C46238a.m51546a(this.f127949f, q3Var.f127949f) && C46238a.m51546a(this.f127950g, q3Var.f127950g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127947d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f127948e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f127949f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f127950g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f127947d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f127948e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f127949f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f127950g;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
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
            C47656q3 q3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                q3Var.f127947d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                q3Var.f127948e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                q3Var.f127949f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                q3Var.f127950g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
