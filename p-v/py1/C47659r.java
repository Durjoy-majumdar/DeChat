package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.r */
public class C47659r extends C47465a {

    /* renamed from: d */
    public String f127955d;

    /* renamed from: e */
    public String f127956e;

    /* renamed from: f */
    public String f127957f;

    /* renamed from: g */
    public String f127958g;

    /* renamed from: h */
    public int f127959h;

    /* renamed from: i */
    public String f127960i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47659r)) {
            return false;
        }
        C47659r rVar = (C47659r) aVar;
        return C46238a.m51546a(this.f127955d, rVar.f127955d) && C46238a.m51546a(this.f127956e, rVar.f127956e) && C46238a.m51546a(this.f127957f, rVar.f127957f) && C46238a.m51546a(this.f127958g, rVar.f127958g) && C46238a.m51546a(Integer.valueOf(this.f127959h), Integer.valueOf(rVar.f127959h)) && C46238a.m51546a(this.f127960i, rVar.f127960i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127955d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: IconUrl");
            } else if (this.f127956e == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f127958g != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f127956e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f127957f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f127958g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                aVar.mo74318e(5, this.f127959h);
                String str5 = this.f127960i;
                if (str5 != null) {
                    aVar.mo74323j(6, str5);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: JumpUrl");
            }
        } else if (i == 1) {
            String str6 = this.f127955d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f127956e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f127957f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f127958g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            int e = i2 + C52418a.m58678e(5, this.f127959h);
            String str10 = this.f127960i;
            return str10 != null ? e + C52418a.m58683j(6, str10) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127955d == null) {
                throw new C52419b("Not all required fields were included: IconUrl");
            } else if (this.f127956e == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f127958g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: JumpUrl");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47659r rVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rVar.f127955d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rVar.f127956e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rVar.f127957f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rVar.f127958g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rVar.f127959h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    rVar.f127960i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
