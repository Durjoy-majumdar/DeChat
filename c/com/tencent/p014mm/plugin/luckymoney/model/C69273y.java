package com.tencent.p014mm.plugin.luckymoney.model;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.y */
public class C69273y extends C47465a {

    /* renamed from: A */
    public double f199370A;

    /* renamed from: d */
    public int f199371d;

    /* renamed from: e */
    public double f199372e;

    /* renamed from: f */
    public String f199373f;

    /* renamed from: g */
    public String f199374g;

    /* renamed from: h */
    public double f199375h;

    /* renamed from: i */
    public double f199376i;

    /* renamed from: j */
    public double f199377j;

    /* renamed from: n */
    public int f199378n;

    /* renamed from: o */
    public int f199379o;

    /* renamed from: p */
    public String f199380p;

    /* renamed from: q */
    public String f199381q;

    /* renamed from: r */
    public String f199382r;

    /* renamed from: s */
    public String f199383s;

    /* renamed from: t */
    public String f199384t;

    /* renamed from: u */
    public String f199385u;

    /* renamed from: v */
    public boolean f199386v;

    /* renamed from: w */
    public C69258q f199387w;

    /* renamed from: x */
    public int f199388x;

    /* renamed from: y */
    public double f199389y;

    /* renamed from: z */
    public double f199390z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C69273y)) {
            return false;
        }
        C69273y yVar = (C69273y) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f199371d), Integer.valueOf(yVar.f199371d)) && C46238a.m51546a(Double.valueOf(this.f199372e), Double.valueOf(yVar.f199372e)) && C46238a.m51546a(this.f199373f, yVar.f199373f) && C46238a.m51546a(this.f199374g, yVar.f199374g) && C46238a.m51546a(Double.valueOf(this.f199375h), Double.valueOf(yVar.f199375h)) && C46238a.m51546a(Double.valueOf(this.f199376i), Double.valueOf(yVar.f199376i)) && C46238a.m51546a(Double.valueOf(this.f199377j), Double.valueOf(yVar.f199377j)) && C46238a.m51546a(Integer.valueOf(this.f199378n), Integer.valueOf(yVar.f199378n)) && C46238a.m51546a(Integer.valueOf(this.f199379o), Integer.valueOf(yVar.f199379o)) && C46238a.m51546a(this.f199380p, yVar.f199380p) && C46238a.m51546a(this.f199381q, yVar.f199381q) && C46238a.m51546a(this.f199382r, yVar.f199382r) && C46238a.m51546a(this.f199383s, yVar.f199383s) && C46238a.m51546a(this.f199384t, yVar.f199384t) && C46238a.m51546a(this.f199385u, yVar.f199385u) && C46238a.m51546a(Boolean.valueOf(this.f199386v), Boolean.valueOf(yVar.f199386v)) && C46238a.m51546a(this.f199387w, yVar.f199387w) && C46238a.m51546a(Integer.valueOf(this.f199388x), Integer.valueOf(yVar.f199388x)) && C46238a.m51546a(Double.valueOf(this.f199389y), Double.valueOf(yVar.f199389y)) && C46238a.m51546a(Double.valueOf(this.f199390z), Double.valueOf(yVar.f199390z)) && C46238a.m51546a(Double.valueOf(this.f199370A), Double.valueOf(yVar.f199370A));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f199371d);
            aVar.mo74316c(2, this.f199372e);
            String str = this.f199373f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f199374g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74316c(5, this.f199375h);
            aVar.mo74316c(6, this.f199376i);
            aVar.mo74316c(7, this.f199377j);
            aVar.mo74318e(8, this.f199378n);
            aVar.mo74318e(9, this.f199379o);
            String str3 = this.f199380p;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            String str4 = this.f199381q;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            String str5 = this.f199382r;
            if (str5 != null) {
                aVar.mo74323j(12, str5);
            }
            String str6 = this.f199383s;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            String str7 = this.f199384t;
            if (str7 != null) {
                aVar.mo74323j(14, str7);
            }
            String str8 = this.f199385u;
            if (str8 != null) {
                aVar.mo74323j(15, str8);
            }
            aVar.mo74314a(16, this.f199386v);
            C69258q qVar = this.f199387w;
            if (qVar != null) {
                aVar.mo74322i(17, qVar.computeSize());
                this.f199387w.writeFields(aVar);
            }
            aVar.mo74318e(18, this.f199388x);
            aVar.mo74316c(19, this.f199389y);
            aVar.mo74316c(20, this.f199390z);
            aVar.mo74316c(21, this.f199370A);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f199371d) + 0 + C52418a.m58676c(2, this.f199372e);
            String str9 = this.f199373f;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            String str10 = this.f199374g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            int c = e + C52418a.m58676c(5, this.f199375h) + C52418a.m58676c(6, this.f199376i) + C52418a.m58676c(7, this.f199377j) + C52418a.m58678e(8, this.f199378n) + C52418a.m58678e(9, this.f199379o);
            String str11 = this.f199380p;
            if (str11 != null) {
                c += C52418a.m58683j(10, str11);
            }
            String str12 = this.f199381q;
            if (str12 != null) {
                c += C52418a.m58683j(11, str12);
            }
            String str13 = this.f199382r;
            if (str13 != null) {
                c += C52418a.m58683j(12, str13);
            }
            String str14 = this.f199383s;
            if (str14 != null) {
                c += C52418a.m58683j(13, str14);
            }
            String str15 = this.f199384t;
            if (str15 != null) {
                c += C52418a.m58683j(14, str15);
            }
            String str16 = this.f199385u;
            if (str16 != null) {
                c += C52418a.m58683j(15, str16);
            }
            int a = c + C52418a.m58674a(16, this.f199386v);
            C69258q qVar2 = this.f199387w;
            if (qVar2 != null) {
                a += C52418a.m58682i(17, qVar2.computeSize());
            }
            return a + C52418a.m58678e(18, this.f199388x) + C52418a.m58676c(19, this.f199389y) + C52418a.m58676c(20, this.f199390z) + C52418a.m58676c(21, this.f199370A);
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
            C69273y yVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yVar.f199371d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    yVar.f199372e = aVar3.mo141627e(intValue);
                    return 0;
                case 3:
                    yVar.f199373f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    yVar.f199374g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    yVar.f199375h = aVar3.mo141627e(intValue);
                    return 0;
                case 6:
                    yVar.f199376i = aVar3.mo141627e(intValue);
                    return 0;
                case 7:
                    yVar.f199377j = aVar3.mo141627e(intValue);
                    return 0;
                case 8:
                    yVar.f199378n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    yVar.f199379o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    yVar.f199380p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    yVar.f199381q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    yVar.f199382r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    yVar.f199383s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    yVar.f199384t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    yVar.f199385u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    yVar.f199386v = aVar3.mo141625c(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C69258q qVar3 = new C69258q();
                        if (bArr != null && bArr.length > 0) {
                            qVar3.parseFrom(bArr);
                        }
                        yVar.f199387w = qVar3;
                    }
                    return 0;
                case 18:
                    yVar.f199388x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    yVar.f199389y = aVar3.mo141627e(intValue);
                    return 0;
                case 20:
                    yVar.f199390z = aVar3.mo141627e(intValue);
                    return 0;
                case 21:
                    yVar.f199370A = aVar3.mo141627e(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
