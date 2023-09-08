package i12;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: i12.b */
public class C76255b extends C47465a {

    /* renamed from: d */
    public int f223378d;

    /* renamed from: e */
    public String f223379e;

    /* renamed from: f */
    public String f223380f;

    /* renamed from: g */
    public String f223381g;

    /* renamed from: h */
    public String f223382h;

    /* renamed from: i */
    public String f223383i;

    /* renamed from: j */
    public String f223384j;

    /* renamed from: n */
    public String f223385n;

    /* renamed from: o */
    public String f223386o;

    /* renamed from: p */
    public String f223387p;

    /* renamed from: q */
    public String f223388q;

    /* renamed from: r */
    public String f223389r;

    /* renamed from: s */
    public String f223390s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C76255b)) {
            return false;
        }
        C76255b bVar = (C76255b) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f223378d), Integer.valueOf(bVar.f223378d)) && C46238a.m51546a(this.f223379e, bVar.f223379e) && C46238a.m51546a(this.f223380f, bVar.f223380f) && C46238a.m51546a(this.f223381g, bVar.f223381g) && C46238a.m51546a(this.f223382h, bVar.f223382h) && C46238a.m51546a(this.f223383i, bVar.f223383i) && C46238a.m51546a(this.f223384j, bVar.f223384j) && C46238a.m51546a(this.f223385n, bVar.f223385n) && C46238a.m51546a(this.f223386o, bVar.f223386o) && C46238a.m51546a(this.f223387p, bVar.f223387p) && C46238a.m51546a(this.f223388q, bVar.f223388q) && C46238a.m51546a(this.f223389r, bVar.f223389r) && C46238a.m51546a(this.f223390s, bVar.f223390s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f223378d);
            String str = this.f223379e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f223380f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f223381g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f223382h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f223383i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f223384j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f223385n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f223386o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            String str9 = this.f223387p;
            if (str9 != null) {
                aVar.mo74323j(10, str9);
            }
            String str10 = this.f223388q;
            if (str10 != null) {
                aVar.mo74323j(11, str10);
            }
            String str11 = this.f223389r;
            if (str11 != null) {
                aVar.mo74323j(12, str11);
            }
            String str12 = this.f223390s;
            if (str12 == null) {
                return 0;
            }
            aVar.mo74323j(13, str12);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f223378d) + 0;
            String str13 = this.f223379e;
            if (str13 != null) {
                e += C52418a.m58683j(2, str13);
            }
            String str14 = this.f223380f;
            if (str14 != null) {
                e += C52418a.m58683j(3, str14);
            }
            String str15 = this.f223381g;
            if (str15 != null) {
                e += C52418a.m58683j(4, str15);
            }
            String str16 = this.f223382h;
            if (str16 != null) {
                e += C52418a.m58683j(5, str16);
            }
            String str17 = this.f223383i;
            if (str17 != null) {
                e += C52418a.m58683j(6, str17);
            }
            String str18 = this.f223384j;
            if (str18 != null) {
                e += C52418a.m58683j(7, str18);
            }
            String str19 = this.f223385n;
            if (str19 != null) {
                e += C52418a.m58683j(8, str19);
            }
            String str20 = this.f223386o;
            if (str20 != null) {
                e += C52418a.m58683j(9, str20);
            }
            String str21 = this.f223387p;
            if (str21 != null) {
                e += C52418a.m58683j(10, str21);
            }
            String str22 = this.f223388q;
            if (str22 != null) {
                e += C52418a.m58683j(11, str22);
            }
            String str23 = this.f223389r;
            if (str23 != null) {
                e += C52418a.m58683j(12, str23);
            }
            String str24 = this.f223390s;
            return str24 != null ? e + C52418a.m58683j(13, str24) : e;
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
            C76255b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bVar.f223378d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    bVar.f223379e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bVar.f223380f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bVar.f223381g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bVar.f223382h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bVar.f223383i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bVar.f223384j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bVar.f223385n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    bVar.f223386o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    bVar.f223387p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    bVar.f223388q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    bVar.f223389r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    bVar.f223390s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
