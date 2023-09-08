package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yk */
public class C52127yk extends C47465a {

    /* renamed from: d */
    public int f145330d;

    /* renamed from: e */
    public String f145331e;

    /* renamed from: f */
    public String f145332f;

    /* renamed from: g */
    public String f145333g;

    /* renamed from: h */
    public String f145334h;

    /* renamed from: i */
    public String f145335i;

    /* renamed from: j */
    public String f145336j;

    /* renamed from: n */
    public String f145337n;

    /* renamed from: o */
    public int f145338o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52127yk)) {
            return false;
        }
        C52127yk ykVar = (C52127yk) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145330d), Integer.valueOf(ykVar.f145330d)) && C46238a.m51546a(this.f145331e, ykVar.f145331e) && C46238a.m51546a(this.f145332f, ykVar.f145332f) && C46238a.m51546a(this.f145333g, ykVar.f145333g) && C46238a.m51546a(this.f145334h, ykVar.f145334h) && C46238a.m51546a(this.f145335i, ykVar.f145335i) && C46238a.m51546a(this.f145336j, ykVar.f145336j) && C46238a.m51546a(this.f145337n, ykVar.f145337n) && C46238a.m51546a(Integer.valueOf(this.f145338o), Integer.valueOf(ykVar.f145338o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145330d);
            String str = this.f145331e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f145332f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f145333g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f145334h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f145335i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f145336j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f145337n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            aVar.mo74318e(9, this.f145338o);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145330d) + 0;
            String str8 = this.f145331e;
            if (str8 != null) {
                e += C52418a.m58683j(2, str8);
            }
            String str9 = this.f145332f;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            String str10 = this.f145333g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f145334h;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            String str12 = this.f145335i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f145336j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f145337n;
            if (str14 != null) {
                e += C52418a.m58683j(8, str14);
            }
            return e + C52418a.m58678e(9, this.f145338o);
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
            C52127yk ykVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ykVar.f145330d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ykVar.f145331e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ykVar.f145332f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ykVar.f145333g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ykVar.f145334h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ykVar.f145335i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ykVar.f145336j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ykVar.f145337n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ykVar.f145338o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
