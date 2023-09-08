package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.le1 */
public class C50251le1 extends C47465a {

    /* renamed from: d */
    public String f137356d;

    /* renamed from: e */
    public String f137357e;

    /* renamed from: f */
    public String f137358f;

    /* renamed from: g */
    public String f137359g;

    /* renamed from: h */
    public String f137360h;

    /* renamed from: i */
    public String f137361i;

    /* renamed from: j */
    public int f137362j;

    /* renamed from: n */
    public String f137363n;

    /* renamed from: o */
    public String f137364o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50251le1)) {
            return false;
        }
        C50251le1 le12 = (C50251le1) aVar;
        return C46238a.m51546a(this.f137356d, le12.f137356d) && C46238a.m51546a(this.f137357e, le12.f137357e) && C46238a.m51546a(this.f137358f, le12.f137358f) && C46238a.m51546a(this.f137359g, le12.f137359g) && C46238a.m51546a(this.f137360h, le12.f137360h) && C46238a.m51546a(this.f137361i, le12.f137361i) && C46238a.m51546a(Integer.valueOf(this.f137362j), Integer.valueOf(le12.f137362j)) && C46238a.m51546a(this.f137363n, le12.f137363n) && C46238a.m51546a(this.f137364o, le12.f137364o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137356d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137357e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f137358f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f137359g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f137360h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f137361i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            aVar.mo74318e(7, this.f137362j);
            String str7 = this.f137363n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f137364o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f137356d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f137357e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f137358f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f137359g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f137360h;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f137361i;
            if (str14 != null) {
                i2 += C52418a.m58683j(6, str14);
            }
            int e = i2 + C52418a.m58678e(7, this.f137362j);
            String str15 = this.f137363n;
            if (str15 != null) {
                e += C52418a.m58683j(8, str15);
            }
            String str16 = this.f137364o;
            return str16 != null ? e + C52418a.m58683j(9, str16) : e;
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
            C50251le1 le12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    le12.f137356d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    le12.f137357e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    le12.f137358f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    le12.f137359g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    le12.f137360h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    le12.f137361i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    le12.f137362j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    le12.f137363n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    le12.f137364o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
