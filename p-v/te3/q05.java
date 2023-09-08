package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class q05 extends C47465a {

    /* renamed from: d */
    public int f140082d;

    /* renamed from: e */
    public String f140083e;

    /* renamed from: f */
    public String f140084f;

    /* renamed from: g */
    public String f140085g;

    /* renamed from: h */
    public C89349b f140086h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof q05)) {
            return false;
        }
        q05 q05 = (q05) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140082d), Integer.valueOf(q05.f140082d)) && C46238a.m51546a(this.f140083e, q05.f140083e) && C46238a.m51546a(this.f140084f, q05.f140084f) && C46238a.m51546a(this.f140085g, q05.f140085g) && C46238a.m51546a(this.f140086h, q05.f140086h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f140083e == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f140084f == null) {
                throw new C52419b("Not all required fields were included: NickName");
            } else if (this.f140085g != null) {
                aVar.mo74318e(1, this.f140082d);
                String str = this.f140083e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f140084f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f140085g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                C89349b bVar = this.f140086h;
                if (bVar != null) {
                    aVar.mo74315b(5, bVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Content");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140082d) + 0;
            String str4 = this.f140083e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f140084f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f140085g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            C89349b bVar2 = this.f140086h;
            return bVar2 != null ? e + C52418a.m58675b(5, bVar2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f140083e == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f140084f == null) {
                throw new C52419b("Not all required fields were included: NickName");
            } else if (this.f140085g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Content");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            q05 q05 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                q05.f140082d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                q05.f140083e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                q05.f140084f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                q05.f140085g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                q05.f140086h = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
