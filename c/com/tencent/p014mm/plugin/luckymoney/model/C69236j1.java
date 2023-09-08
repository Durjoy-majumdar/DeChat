package com.tencent.p014mm.plugin.luckymoney.model;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.j1 */
public class C69236j1 extends C47465a {

    /* renamed from: d */
    public String f199212d;

    /* renamed from: e */
    public String f199213e;

    /* renamed from: f */
    public long f199214f;

    /* renamed from: g */
    public String f199215g;

    /* renamed from: h */
    public String f199216h;

    /* renamed from: i */
    public String f199217i;

    /* renamed from: j */
    public String f199218j;

    /* renamed from: n */
    public String f199219n;

    /* renamed from: o */
    public String f199220o;

    /* renamed from: p */
    public String f199221p;

    /* renamed from: q */
    public boolean f199222q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C69236j1)) {
            return false;
        }
        C69236j1 j1Var = (C69236j1) aVar;
        return C46238a.m51546a(this.f199212d, j1Var.f199212d) && C46238a.m51546a(this.f199213e, j1Var.f199213e) && C46238a.m51546a(Long.valueOf(this.f199214f), Long.valueOf(j1Var.f199214f)) && C46238a.m51546a(this.f199215g, j1Var.f199215g) && C46238a.m51546a(this.f199216h, j1Var.f199216h) && C46238a.m51546a(this.f199217i, j1Var.f199217i) && C46238a.m51546a(this.f199218j, j1Var.f199218j) && C46238a.m51546a(this.f199219n, j1Var.f199219n) && C46238a.m51546a(this.f199220o, j1Var.f199220o) && C46238a.m51546a(this.f199221p, j1Var.f199221p) && C46238a.m51546a(Boolean.valueOf(this.f199222q), Boolean.valueOf(j1Var.f199222q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f199212d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f199213e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f199214f);
            String str3 = this.f199215g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f199216h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f199217i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f199218j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f199219n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f199220o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            String str9 = this.f199221p;
            if (str9 != null) {
                aVar.mo74323j(10, str9);
            }
            aVar.mo74314a(11, this.f199222q);
            return 0;
        } else if (i == 1) {
            String str10 = this.f199212d;
            if (str10 != null) {
                i2 = 0 + C52418a.m58683j(1, str10);
            }
            String str11 = this.f199213e;
            if (str11 != null) {
                i2 += C52418a.m58683j(2, str11);
            }
            int h = i2 + C52418a.m58681h(3, this.f199214f);
            String str12 = this.f199215g;
            if (str12 != null) {
                h += C52418a.m58683j(4, str12);
            }
            String str13 = this.f199216h;
            if (str13 != null) {
                h += C52418a.m58683j(5, str13);
            }
            String str14 = this.f199217i;
            if (str14 != null) {
                h += C52418a.m58683j(6, str14);
            }
            String str15 = this.f199218j;
            if (str15 != null) {
                h += C52418a.m58683j(7, str15);
            }
            String str16 = this.f199219n;
            if (str16 != null) {
                h += C52418a.m58683j(8, str16);
            }
            String str17 = this.f199220o;
            if (str17 != null) {
                h += C52418a.m58683j(9, str17);
            }
            String str18 = this.f199221p;
            if (str18 != null) {
                h += C52418a.m58683j(10, str18);
            }
            return h + C52418a.m58674a(11, this.f199222q);
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
            C69236j1 j1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    j1Var.f199212d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    j1Var.f199213e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    j1Var.f199214f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    j1Var.f199215g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    j1Var.f199216h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    j1Var.f199217i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    j1Var.f199218j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    j1Var.f199219n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    j1Var.f199220o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    j1Var.f199221p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    j1Var.f199222q = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
