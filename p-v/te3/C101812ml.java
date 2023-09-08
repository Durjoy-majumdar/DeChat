package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ml */
public class C101812ml extends C47465a {

    /* renamed from: d */
    public String f298820d;

    /* renamed from: e */
    public String f298821e;

    /* renamed from: f */
    public int f298822f;

    /* renamed from: g */
    public int f298823g;

    /* renamed from: h */
    public int f298824h;

    /* renamed from: i */
    public String f298825i;

    /* renamed from: j */
    public String f298826j;

    /* renamed from: n */
    public int f298827n;

    /* renamed from: o */
    public int f298828o;

    /* renamed from: p */
    public int f298829p;

    /* renamed from: q */
    public String f298830q;

    /* renamed from: r */
    public String f298831r;

    /* renamed from: s */
    public String f298832s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101812ml)) {
            return false;
        }
        C101812ml mlVar = (C101812ml) aVar;
        return C46238a.m51546a(this.f298820d, mlVar.f298820d) && C46238a.m51546a(this.f298821e, mlVar.f298821e) && C46238a.m51546a(Integer.valueOf(this.f298822f), Integer.valueOf(mlVar.f298822f)) && C46238a.m51546a(Integer.valueOf(this.f298823g), Integer.valueOf(mlVar.f298823g)) && C46238a.m51546a(Integer.valueOf(this.f298824h), Integer.valueOf(mlVar.f298824h)) && C46238a.m51546a(this.f298825i, mlVar.f298825i) && C46238a.m51546a(this.f298826j, mlVar.f298826j) && C46238a.m51546a(Integer.valueOf(this.f298827n), Integer.valueOf(mlVar.f298827n)) && C46238a.m51546a(Integer.valueOf(this.f298828o), Integer.valueOf(mlVar.f298828o)) && C46238a.m51546a(Integer.valueOf(this.f298829p), Integer.valueOf(mlVar.f298829p)) && C46238a.m51546a(this.f298830q, mlVar.f298830q) && C46238a.m51546a(this.f298831r, mlVar.f298831r) && C46238a.m51546a(this.f298832s, mlVar.f298832s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298820d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: aeskey");
            } else if (this.f298821e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f298821e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74318e(3, this.f298822f);
                aVar.mo74318e(4, this.f298823g);
                aVar.mo74318e(5, this.f298824h);
                String str3 = this.f298825i;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f298826j;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                aVar.mo74318e(8, this.f298827n);
                aVar.mo74318e(9, this.f298828o);
                aVar.mo74318e(10, this.f298829p);
                String str5 = this.f298830q;
                if (str5 != null) {
                    aVar.mo74323j(11, str5);
                }
                String str6 = this.f298831r;
                if (str6 != null) {
                    aVar.mo74323j(12, str6);
                }
                String str7 = this.f298832s;
                if (str7 != null) {
                    aVar.mo74323j(13, str7);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: url");
            }
        } else if (i2 == 1) {
            String str8 = this.f298820d;
            if (str8 != null) {
                i3 = C52418a.m58683j(1, str8) + 0;
            }
            String str9 = this.f298821e;
            if (str9 != null) {
                i3 += C52418a.m58683j(2, str9);
            }
            int e = i3 + C52418a.m58678e(3, this.f298822f) + C52418a.m58678e(4, this.f298823g) + C52418a.m58678e(5, this.f298824h);
            String str10 = this.f298825i;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            String str11 = this.f298826j;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            int e2 = e + C52418a.m58678e(8, this.f298827n) + C52418a.m58678e(9, this.f298828o) + C52418a.m58678e(10, this.f298829p);
            String str12 = this.f298830q;
            if (str12 != null) {
                e2 += C52418a.m58683j(11, str12);
            }
            String str13 = this.f298831r;
            if (str13 != null) {
                e2 += C52418a.m58683j(12, str13);
            }
            String str14 = this.f298832s;
            return str14 != null ? e2 + C52418a.m58683j(13, str14) : e2;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298820d == null) {
                throw new C52419b("Not all required fields were included: aeskey");
            } else if (this.f298821e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: url");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101812ml mlVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mlVar.f298820d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    mlVar.f298821e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mlVar.f298822f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    mlVar.f298823g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    mlVar.f298824h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    mlVar.f298825i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    mlVar.f298826j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    mlVar.f298827n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    mlVar.f298828o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    mlVar.f298829p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    mlVar.f298830q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    mlVar.f298831r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    mlVar.f298832s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
