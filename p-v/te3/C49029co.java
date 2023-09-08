package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.co */
public class C49029co extends C47465a {

    /* renamed from: d */
    public String f131848d;

    /* renamed from: e */
    public String f131849e;

    /* renamed from: f */
    public String f131850f;

    /* renamed from: g */
    public String f131851g;

    /* renamed from: h */
    public String f131852h;

    /* renamed from: i */
    public String f131853i;

    /* renamed from: j */
    public String f131854j;

    /* renamed from: n */
    public float f131855n;

    /* renamed from: o */
    public float f131856o;

    /* renamed from: p */
    public float f131857p;

    /* renamed from: q */
    public String f131858q;

    /* renamed from: r */
    public String f131859r;

    /* renamed from: s */
    public String f131860s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49029co)) {
            return false;
        }
        C49029co coVar = (C49029co) aVar;
        return C46238a.m51546a(this.f131848d, coVar.f131848d) && C46238a.m51546a(this.f131849e, coVar.f131849e) && C46238a.m51546a(this.f131850f, coVar.f131850f) && C46238a.m51546a(this.f131851g, coVar.f131851g) && C46238a.m51546a(this.f131852h, coVar.f131852h) && C46238a.m51546a(this.f131853i, coVar.f131853i) && C46238a.m51546a(this.f131854j, coVar.f131854j) && C46238a.m51546a(Float.valueOf(this.f131855n), Float.valueOf(coVar.f131855n)) && C46238a.m51546a(Float.valueOf(this.f131856o), Float.valueOf(coVar.f131856o)) && C46238a.m51546a(Float.valueOf(this.f131857p), Float.valueOf(coVar.f131857p)) && C46238a.m51546a(this.f131858q, coVar.f131858q) && C46238a.m51546a(this.f131859r, coVar.f131859r) && C46238a.m51546a(this.f131860s, coVar.f131860s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131848d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131849e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f131850f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f131851g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f131852h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f131853i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f131854j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            aVar.mo74317d(8, this.f131855n);
            aVar.mo74317d(9, this.f131856o);
            aVar.mo74317d(10, this.f131857p);
            String str8 = this.f131858q;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.f131859r;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            String str10 = this.f131860s;
            if (str10 == null) {
                return 0;
            }
            aVar.mo74323j(13, str10);
            return 0;
        } else if (i2 == 1) {
            String str11 = this.f131848d;
            int j = str11 != null ? 0 + C52418a.m58683j(1, str11) : 0;
            String str12 = this.f131849e;
            if (str12 != null) {
                j += C52418a.m58683j(2, str12);
            }
            String str13 = this.f131850f;
            if (str13 != null) {
                j += C52418a.m58683j(3, str13);
            }
            String str14 = this.f131851g;
            if (str14 != null) {
                j += C52418a.m58683j(4, str14);
            }
            String str15 = this.f131852h;
            if (str15 != null) {
                j += C52418a.m58683j(5, str15);
            }
            String str16 = this.f131853i;
            if (str16 != null) {
                j += C52418a.m58683j(6, str16);
            }
            String str17 = this.f131854j;
            if (str17 != null) {
                j += C52418a.m58683j(7, str17);
            }
            int d = j + C52418a.m58677d(8, this.f131855n) + C52418a.m58677d(9, this.f131856o) + C52418a.m58677d(10, this.f131857p);
            String str18 = this.f131858q;
            if (str18 != null) {
                d += C52418a.m58683j(11, str18);
            }
            String str19 = this.f131859r;
            if (str19 != null) {
                d += C52418a.m58683j(12, str19);
            }
            String str20 = this.f131860s;
            return str20 != null ? d + C52418a.m58683j(13, str20) : d;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49029co coVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    coVar.f131848d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    coVar.f131849e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    coVar.f131850f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    coVar.f131851g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    coVar.f131852h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    coVar.f131853i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    coVar.f131854j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    coVar.f131855n = aVar3.mo141628f(intValue);
                    return 0;
                case 9:
                    coVar.f131856o = aVar3.mo141628f(intValue);
                    return 0;
                case 10:
                    coVar.f131857p = aVar3.mo141628f(intValue);
                    return 0;
                case 11:
                    coVar.f131858q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    coVar.f131859r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    coVar.f131860s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
