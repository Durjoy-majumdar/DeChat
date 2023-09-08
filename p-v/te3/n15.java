package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class n15 extends C47465a {

    /* renamed from: d */
    public String f138331d;

    /* renamed from: e */
    public String f138332e;

    /* renamed from: f */
    public String f138333f;

    /* renamed from: g */
    public int f138334g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof n15)) {
            return false;
        }
        n15 n15 = (n15) aVar;
        return C46238a.m51546a(this.f138331d, n15.f138331d) && C46238a.m51546a(this.f138332e, n15.f138332e) && C46238a.m51546a(this.f138333f, n15.f138333f) && C46238a.m51546a(Integer.valueOf(this.f138334g), Integer.valueOf(n15.f138334g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138331d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f138332e == null) {
                throw new C52419b("Not all required fields were included: MD5");
            } else if (this.f138333f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f138332e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f138333f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                aVar.mo74318e(4, this.f138334g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ProductId");
            }
        } else if (i == 1) {
            String str4 = this.f138331d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f138332e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f138333f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f138334g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138331d == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f138332e == null) {
                throw new C52419b("Not all required fields were included: MD5");
            } else if (this.f138333f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ProductId");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            n15 n15 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n15.f138331d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                n15.f138332e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                n15.f138333f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                n15.f138334g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
