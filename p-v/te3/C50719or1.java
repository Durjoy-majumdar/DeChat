package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.or1 */
public class C50719or1 extends C47465a {

    /* renamed from: d */
    public String f139331d;

    /* renamed from: e */
    public String f139332e;

    /* renamed from: f */
    public String f139333f;

    /* renamed from: g */
    public int f139334g;

    /* renamed from: h */
    public String f139335h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50719or1)) {
            return false;
        }
        C50719or1 or12 = (C50719or1) aVar;
        return C46238a.m51546a(this.f139331d, or12.f139331d) && C46238a.m51546a(this.f139332e, or12.f139332e) && C46238a.m51546a(this.f139333f, or12.f139333f) && C46238a.m51546a(Integer.valueOf(this.f139334g), Integer.valueOf(or12.f139334g)) && C46238a.m51546a(this.f139335h, or12.f139335h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139331d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: AppID");
            } else if (this.f139332e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f139332e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f139333f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                aVar.mo74318e(4, this.f139334g);
                String str4 = this.f139335h;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RecommendKey");
            }
        } else if (i == 1) {
            String str5 = this.f139331d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f139332e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f139333f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int e = i2 + C52418a.m58678e(4, this.f139334g);
            String str8 = this.f139335h;
            return str8 != null ? e + C52418a.m58683j(5, str8) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f139331d == null) {
                throw new C52419b("Not all required fields were included: AppID");
            } else if (this.f139332e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RecommendKey");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50719or1 or12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                or12.f139331d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                or12.f139332e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                or12.f139333f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                or12.f139334g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                or12.f139335h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
