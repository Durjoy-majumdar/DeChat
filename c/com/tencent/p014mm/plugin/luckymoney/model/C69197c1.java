package com.tencent.p014mm.plugin.luckymoney.model;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.c1 */
public class C69197c1 extends C47465a {

    /* renamed from: d */
    public String f199090d;

    /* renamed from: e */
    public String f199091e;

    /* renamed from: f */
    public long f199092f;

    /* renamed from: g */
    public String f199093g;

    /* renamed from: h */
    public int f199094h;

    /* renamed from: i */
    public String f199095i;

    /* renamed from: j */
    public String f199096j;

    /* renamed from: n */
    public long f199097n;

    /* renamed from: o */
    public long f199098o;

    /* renamed from: p */
    public long f199099p;

    /* renamed from: q */
    public int f199100q;

    /* renamed from: r */
    public int f199101r;

    /* renamed from: s */
    public String f199102s;

    /* renamed from: t */
    public String f199103t;

    /* renamed from: u */
    public int f199104u;

    /* renamed from: v */
    public String f199105v;

    /* renamed from: w */
    public String f199106w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C69197c1)) {
            return false;
        }
        C69197c1 c1Var = (C69197c1) aVar;
        return C46238a.m51546a(this.f199090d, c1Var.f199090d) && C46238a.m51546a(this.f199091e, c1Var.f199091e) && C46238a.m51546a(Long.valueOf(this.f199092f), Long.valueOf(c1Var.f199092f)) && C46238a.m51546a(this.f199093g, c1Var.f199093g) && C46238a.m51546a(Integer.valueOf(this.f199094h), Integer.valueOf(c1Var.f199094h)) && C46238a.m51546a(this.f199095i, c1Var.f199095i) && C46238a.m51546a(this.f199096j, c1Var.f199096j) && C46238a.m51546a(Long.valueOf(this.f199097n), Long.valueOf(c1Var.f199097n)) && C46238a.m51546a(Long.valueOf(this.f199098o), Long.valueOf(c1Var.f199098o)) && C46238a.m51546a(Long.valueOf(this.f199099p), Long.valueOf(c1Var.f199099p)) && C46238a.m51546a(Integer.valueOf(this.f199100q), Integer.valueOf(c1Var.f199100q)) && C46238a.m51546a(Integer.valueOf(this.f199101r), Integer.valueOf(c1Var.f199101r)) && C46238a.m51546a(this.f199102s, c1Var.f199102s) && C46238a.m51546a(this.f199103t, c1Var.f199103t) && C46238a.m51546a(Integer.valueOf(this.f199104u), Integer.valueOf(c1Var.f199104u)) && C46238a.m51546a(this.f199105v, c1Var.f199105v) && C46238a.m51546a(this.f199106w, c1Var.f199106w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f199090d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f199091e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f199092f);
            String str3 = this.f199093g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f199094h);
            String str4 = this.f199095i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f199096j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74321h(8, this.f199097n);
            aVar.mo74321h(9, this.f199098o);
            aVar.mo74321h(10, this.f199099p);
            aVar.mo74318e(11, this.f199100q);
            aVar.mo74318e(12, this.f199101r);
            String str6 = this.f199102s;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            String str7 = this.f199103t;
            if (str7 != null) {
                aVar.mo74323j(14, str7);
            }
            aVar.mo74318e(15, this.f199104u);
            String str8 = this.f199105v;
            if (str8 != null) {
                aVar.mo74323j(16, str8);
            }
            String str9 = this.f199106w;
            if (str9 != null) {
                aVar.mo74323j(17, str9);
            }
            return 0;
        } else if (i2 == 1) {
            String str10 = this.f199090d;
            if (str10 != null) {
                i3 = C52418a.m58683j(1, str10) + 0;
            }
            String str11 = this.f199091e;
            if (str11 != null) {
                i3 += C52418a.m58683j(2, str11);
            }
            int h = i3 + C52418a.m58681h(3, this.f199092f);
            String str12 = this.f199093g;
            if (str12 != null) {
                h += C52418a.m58683j(4, str12);
            }
            int e = h + C52418a.m58678e(5, this.f199094h);
            String str13 = this.f199095i;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            String str14 = this.f199096j;
            if (str14 != null) {
                e += C52418a.m58683j(7, str14);
            }
            int h2 = e + C52418a.m58681h(8, this.f199097n) + C52418a.m58681h(9, this.f199098o) + C52418a.m58681h(10, this.f199099p) + C52418a.m58678e(11, this.f199100q) + C52418a.m58678e(12, this.f199101r);
            String str15 = this.f199102s;
            if (str15 != null) {
                h2 += C52418a.m58683j(13, str15);
            }
            String str16 = this.f199103t;
            if (str16 != null) {
                h2 += C52418a.m58683j(14, str16);
            }
            int e2 = h2 + C52418a.m58678e(15, this.f199104u);
            String str17 = this.f199105v;
            if (str17 != null) {
                e2 += C52418a.m58683j(16, str17);
            }
            String str18 = this.f199106w;
            return str18 != null ? e2 + C52418a.m58683j(17, str18) : e2;
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
            C69197c1 c1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    c1Var.f199090d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    c1Var.f199091e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    c1Var.f199092f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    c1Var.f199093g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    c1Var.f199094h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    c1Var.f199095i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    c1Var.f199096j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    c1Var.f199097n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    c1Var.f199098o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    c1Var.f199099p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    c1Var.f199100q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    c1Var.f199101r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    c1Var.f199102s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    c1Var.f199103t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    c1Var.f199104u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    c1Var.f199105v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    c1Var.f199106w = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
