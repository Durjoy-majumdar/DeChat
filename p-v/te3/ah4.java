package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ah4 extends C47465a {

    /* renamed from: d */
    public int f130536d = -1;

    /* renamed from: e */
    public int f130537e;

    /* renamed from: f */
    public String f130538f;

    /* renamed from: g */
    public String f130539g;

    /* renamed from: h */
    public String f130540h;

    /* renamed from: i */
    public String f130541i;

    /* renamed from: j */
    public String f130542j;

    /* renamed from: n */
    public long f130543n;

    /* renamed from: o */
    public int f130544o;

    /* renamed from: p */
    public String f130545p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ah4)) {
            return false;
        }
        ah4 ah4 = (ah4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130536d), Integer.valueOf(ah4.f130536d)) && C46238a.m51546a(Integer.valueOf(this.f130537e), Integer.valueOf(ah4.f130537e)) && C46238a.m51546a(this.f130538f, ah4.f130538f) && C46238a.m51546a(this.f130539g, ah4.f130539g) && C46238a.m51546a(this.f130540h, ah4.f130540h) && C46238a.m51546a(this.f130541i, ah4.f130541i) && C46238a.m51546a(this.f130542j, ah4.f130542j) && C46238a.m51546a(Long.valueOf(this.f130543n), Long.valueOf(ah4.f130543n)) && C46238a.m51546a(Integer.valueOf(this.f130544o), Integer.valueOf(ah4.f130544o)) && C46238a.m51546a(this.f130545p, ah4.f130545p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f130538f == null) {
                throw new C52419b("Not all required fields were included: initUrl");
            } else if (this.f130539g == null) {
                throw new C52419b("Not all required fields were included: initFilePath");
            } else if (this.f130540h == null) {
                throw new C52419b("Not all required fields were included: md5");
            } else if (this.f130541i == null) {
                throw new C52419b("Not all required fields were included: uid");
            } else if (this.f130542j != null) {
                aVar.mo74318e(1, this.f130536d);
                aVar.mo74318e(2, this.f130537e);
                String str = this.f130538f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f130539g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f130540h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f130541i;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f130542j;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                aVar.mo74321h(8, this.f130543n);
                aVar.mo74318e(9, this.f130544o);
                String str6 = this.f130545p;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: headers");
            }
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f130536d) + 0 + C52418a.m58678e(2, this.f130537e);
            String str7 = this.f130538f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f130539g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f130540h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f130541i;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            String str11 = this.f130542j;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            int h = e + C52418a.m58681h(8, this.f130543n) + C52418a.m58678e(9, this.f130544o);
            String str12 = this.f130545p;
            return str12 != null ? h + C52418a.m58683j(10, str12) : h;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f130538f == null) {
                throw new C52419b("Not all required fields were included: initUrl");
            } else if (this.f130539g == null) {
                throw new C52419b("Not all required fields were included: initFilePath");
            } else if (this.f130540h == null) {
                throw new C52419b("Not all required fields were included: md5");
            } else if (this.f130541i == null) {
                throw new C52419b("Not all required fields were included: uid");
            } else if (this.f130542j != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: headers");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ah4 ah4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ah4.f130536d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ah4.f130537e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ah4.f130538f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ah4.f130539g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ah4.f130540h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ah4.f130541i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ah4.f130542j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ah4.f130543n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    ah4.f130544o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ah4.f130545p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
