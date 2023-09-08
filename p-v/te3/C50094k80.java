package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k80 */
public class C50094k80 extends C47465a {

    /* renamed from: d */
    public String f136606d;

    /* renamed from: e */
    public String f136607e;

    /* renamed from: f */
    public String f136608f;

    /* renamed from: g */
    public String f136609g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50094k80)) {
            return false;
        }
        C50094k80 k802 = (C50094k80) aVar;
        return C46238a.m51546a(this.f136606d, k802.f136606d) && C46238a.m51546a(this.f136607e, k802.f136607e) && C46238a.m51546a(this.f136608f, k802.f136608f) && C46238a.m51546a(this.f136609g, k802.f136609g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136606d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Label");
            } else if (this.f136607e == null) {
                throw new C52419b("Not all required fields were included: Number");
            } else if (this.f136608f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f136607e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f136608f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f136609g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Type");
            }
        } else if (i == 1) {
            String str5 = this.f136606d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f136607e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f136608f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f136609g;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136606d == null) {
                throw new C52419b("Not all required fields were included: Label");
            } else if (this.f136607e == null) {
                throw new C52419b("Not all required fields were included: Number");
            } else if (this.f136608f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Type");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50094k80 k802 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                k802.f136606d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                k802.f136607e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                k802.f136608f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                k802.f136609g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
