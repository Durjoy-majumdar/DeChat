package com.tencent.p014mm.plugin.luckymoney.model;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.e1 */
public class C69209e1 extends C47465a {

    /* renamed from: d */
    public String f199136d;

    /* renamed from: e */
    public String f199137e;

    /* renamed from: f */
    public String f199138f;

    /* renamed from: g */
    public String f199139g;

    /* renamed from: h */
    public String f199140h;

    /* renamed from: i */
    public String f199141i;

    /* renamed from: j */
    public int f199142j;

    /* renamed from: n */
    public int f199143n;

    /* renamed from: o */
    public String f199144o;

    /* renamed from: p */
    public String f199145p;

    /* renamed from: q */
    public String f199146q;

    /* renamed from: r */
    public String f199147r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C69209e1)) {
            return false;
        }
        C69209e1 e1Var = (C69209e1) aVar;
        return C46238a.m51546a(this.f199136d, e1Var.f199136d) && C46238a.m51546a(this.f199137e, e1Var.f199137e) && C46238a.m51546a(this.f199138f, e1Var.f199138f) && C46238a.m51546a(this.f199139g, e1Var.f199139g) && C46238a.m51546a(this.f199140h, e1Var.f199140h) && C46238a.m51546a(this.f199141i, e1Var.f199141i) && C46238a.m51546a(Integer.valueOf(this.f199142j), Integer.valueOf(e1Var.f199142j)) && C46238a.m51546a(Integer.valueOf(this.f199143n), Integer.valueOf(e1Var.f199143n)) && C46238a.m51546a(this.f199144o, e1Var.f199144o) && C46238a.m51546a(this.f199145p, e1Var.f199145p) && C46238a.m51546a(this.f199146q, e1Var.f199146q) && C46238a.m51546a(this.f199147r, e1Var.f199147r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f199136d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f199137e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f199138f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f199139g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f199140h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f199141i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            aVar.mo74318e(7, this.f199142j);
            aVar.mo74318e(8, this.f199143n);
            String str7 = this.f199144o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            String str8 = this.f199145p;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            String str9 = this.f199146q;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            String str10 = this.f199147r;
            if (str10 != null) {
                aVar.mo74323j(12, str10);
            }
            return 0;
        } else if (i == 1) {
            String str11 = this.f199136d;
            if (str11 != null) {
                i2 = 0 + C52418a.m58683j(1, str11);
            }
            String str12 = this.f199137e;
            if (str12 != null) {
                i2 += C52418a.m58683j(2, str12);
            }
            String str13 = this.f199138f;
            if (str13 != null) {
                i2 += C52418a.m58683j(3, str13);
            }
            String str14 = this.f199139g;
            if (str14 != null) {
                i2 += C52418a.m58683j(4, str14);
            }
            String str15 = this.f199140h;
            if (str15 != null) {
                i2 += C52418a.m58683j(5, str15);
            }
            String str16 = this.f199141i;
            if (str16 != null) {
                i2 += C52418a.m58683j(6, str16);
            }
            int e = i2 + C52418a.m58678e(7, this.f199142j) + C52418a.m58678e(8, this.f199143n);
            String str17 = this.f199144o;
            if (str17 != null) {
                e += C52418a.m58683j(9, str17);
            }
            String str18 = this.f199145p;
            if (str18 != null) {
                e += C52418a.m58683j(10, str18);
            }
            String str19 = this.f199146q;
            if (str19 != null) {
                e += C52418a.m58683j(11, str19);
            }
            String str20 = this.f199147r;
            return str20 != null ? e + C52418a.m58683j(12, str20) : e;
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
            C69209e1 e1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e1Var.f199136d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    e1Var.f199137e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    e1Var.f199138f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    e1Var.f199139g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    e1Var.f199140h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    e1Var.f199141i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    e1Var.f199142j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    e1Var.f199143n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    e1Var.f199144o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    e1Var.f199145p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    e1Var.f199146q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    e1Var.f199147r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
