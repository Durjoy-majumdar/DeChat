package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n */
public class C64566n extends C47465a {

    /* renamed from: d */
    public String f184409d;

    /* renamed from: e */
    public String f184410e;

    /* renamed from: f */
    public long f184411f;

    /* renamed from: g */
    public String f184412g;

    /* renamed from: h */
    public int f184413h;

    /* renamed from: i */
    public int f184414i;

    /* renamed from: j */
    public String f184415j;

    /* renamed from: n */
    public String f184416n;

    /* renamed from: o */
    public String f184417o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64566n)) {
            return false;
        }
        C64566n nVar = (C64566n) aVar;
        return C46238a.m51546a(this.f184409d, nVar.f184409d) && C46238a.m51546a(this.f184410e, nVar.f184410e) && C46238a.m51546a(Long.valueOf(this.f184411f), Long.valueOf(nVar.f184411f)) && C46238a.m51546a(this.f184412g, nVar.f184412g) && C46238a.m51546a(Integer.valueOf(this.f184413h), Integer.valueOf(nVar.f184413h)) && C46238a.m51546a(Integer.valueOf(this.f184414i), Integer.valueOf(nVar.f184414i)) && C46238a.m51546a(this.f184415j, nVar.f184415j) && C46238a.m51546a(this.f184416n, nVar.f184416n) && C46238a.m51546a(this.f184417o, nVar.f184417o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184409d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184410e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f184411f);
            String str3 = this.f184412g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(10, this.f184413h);
            aVar.mo74318e(11, this.f184414i);
            String str4 = this.f184415j;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            String str5 = this.f184416n;
            if (str5 != null) {
                aVar.mo74323j(13, str5);
            }
            String str6 = this.f184417o;
            if (str6 != null) {
                aVar.mo74323j(14, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f184409d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f184410e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            int h = i2 + C52418a.m58681h(3, this.f184411f);
            String str9 = this.f184412g;
            if (str9 != null) {
                h += C52418a.m58683j(5, str9);
            }
            int e = h + C52418a.m58678e(10, this.f184413h) + C52418a.m58678e(11, this.f184414i);
            String str10 = this.f184415j;
            if (str10 != null) {
                e += C52418a.m58683j(12, str10);
            }
            String str11 = this.f184416n;
            if (str11 != null) {
                e += C52418a.m58683j(13, str11);
            }
            String str12 = this.f184417o;
            return str12 != null ? e + C52418a.m58683j(14, str12) : e;
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
            C64566n nVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nVar.f184409d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                nVar.f184410e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                nVar.f184411f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                switch (intValue) {
                    case 10:
                        nVar.f184413h = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        nVar.f184414i = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        nVar.f184415j = aVar3.mo141633k(intValue);
                        return 0;
                    case 13:
                        nVar.f184416n = aVar3.mo141633k(intValue);
                        return 0;
                    case 14:
                        nVar.f184417o = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                nVar.f184412g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
