package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cf1 */
public class C48996cf1 extends C47465a {

    /* renamed from: d */
    public int f131693d;

    /* renamed from: e */
    public String f131694e;

    /* renamed from: f */
    public String f131695f;

    /* renamed from: g */
    public String f131696g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48996cf1)) {
            return false;
        }
        C48996cf1 cf12 = (C48996cf1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131693d), Integer.valueOf(cf12.f131693d)) && C46238a.m51546a(this.f131694e, cf12.f131694e) && C46238a.m51546a(this.f131695f, cf12.f131695f) && C46238a.m51546a(this.f131696g, cf12.f131696g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131693d);
            String str = this.f131694e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f131695f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f131696g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131693d) + 0;
            String str4 = this.f131694e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f131695f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f131696g;
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
            C48996cf1 cf12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cf12.f131693d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                cf12.f131694e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                cf12.f131695f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                cf12.f131696g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
