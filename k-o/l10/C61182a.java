package l10;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: l10.a */
public class C61182a extends C47465a {

    /* renamed from: d */
    public String f174161d;

    /* renamed from: e */
    public String f174162e;

    /* renamed from: f */
    public String f174163f;

    /* renamed from: g */
    public String f174164g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C61182a)) {
            return false;
        }
        C61182a aVar2 = (C61182a) aVar;
        return C46238a.m51546a(this.f174161d, aVar2.f174161d) && C46238a.m51546a(this.f174162e, aVar2.f174162e) && C46238a.m51546a(this.f174163f, aVar2.f174163f) && C46238a.m51546a(this.f174164g, aVar2.f174164g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f174161d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: nickname");
            } else if (this.f174162e == null) {
                throw new C52419b("Not all required fields were included: username");
            } else if (this.f174163f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f174162e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f174163f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f174164g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: headUrl");
            }
        } else if (i == 1) {
            String str5 = this.f174161d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f174162e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f174163f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f174164g;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f174161d == null) {
                throw new C52419b("Not all required fields were included: nickname");
            } else if (this.f174162e == null) {
                throw new C52419b("Not all required fields were included: username");
            } else if (this.f174163f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: headUrl");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C61182a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                aVar4.f174161d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                aVar4.f174162e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                aVar4.f174163f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                aVar4.f174164g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
