package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class o15 extends C47465a {

    /* renamed from: d */
    public String f138905d;

    /* renamed from: e */
    public String f138906e;

    /* renamed from: f */
    public String f138907f;

    /* renamed from: g */
    public String f138908g;

    /* renamed from: h */
    public int f138909h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof o15)) {
            return false;
        }
        o15 o15 = (o15) aVar;
        return C46238a.m51546a(this.f138905d, o15.f138905d) && C46238a.m51546a(this.f138906e, o15.f138906e) && C46238a.m51546a(this.f138907f, o15.f138907f) && C46238a.m51546a(this.f138908g, o15.f138908g) && C46238a.m51546a(Integer.valueOf(this.f138909h), Integer.valueOf(o15.f138909h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138905d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f138906e == null) {
                throw new C52419b("Not all required fields were included: Text");
            } else if (this.f138907f == null) {
                throw new C52419b("Not all required fields were included: MD5");
            } else if (this.f138908g != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f138906e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f138907f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f138908g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                aVar.mo74318e(5, this.f138909h);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ProductId");
            }
        } else if (i == 1) {
            String str5 = this.f138905d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f138906e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f138907f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f138908g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58678e(5, this.f138909h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138905d == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f138906e == null) {
                throw new C52419b("Not all required fields were included: Text");
            } else if (this.f138907f == null) {
                throw new C52419b("Not all required fields were included: MD5");
            } else if (this.f138908g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ProductId");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            o15 o15 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                o15.f138905d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                o15.f138906e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                o15.f138907f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                o15.f138908g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                o15.f138909h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
