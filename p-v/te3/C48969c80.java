package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c80 */
public class C48969c80 extends C47465a {

    /* renamed from: d */
    public String f131568d;

    /* renamed from: e */
    public int f131569e;

    /* renamed from: f */
    public int f131570f;

    /* renamed from: g */
    public String f131571g;

    /* renamed from: h */
    public String f131572h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48969c80)) {
            return false;
        }
        C48969c80 c802 = (C48969c80) aVar;
        return C46238a.m51546a(this.f131568d, c802.f131568d) && C46238a.m51546a(Integer.valueOf(this.f131569e), Integer.valueOf(c802.f131569e)) && C46238a.m51546a(Integer.valueOf(this.f131570f), Integer.valueOf(c802.f131570f)) && C46238a.m51546a(this.f131571g, c802.f131571g) && C46238a.m51546a(this.f131572h, c802.f131572h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131568d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f131569e);
            aVar.mo74318e(3, this.f131570f);
            String str2 = this.f131571g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f131572h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f131568d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f131569e) + C52418a.m58678e(3, this.f131570f);
            String str5 = this.f131571g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f131572h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C48969c80 c802 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c802.f131568d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                c802.f131569e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                c802.f131570f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                c802.f131571g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                c802.f131572h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
