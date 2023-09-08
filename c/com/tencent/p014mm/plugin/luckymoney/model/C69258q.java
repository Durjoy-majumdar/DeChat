package com.tencent.p014mm.plugin.luckymoney.model;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.q */
public class C69258q extends C47465a {

    /* renamed from: d */
    public boolean f199292d;

    /* renamed from: e */
    public String f199293e;

    /* renamed from: f */
    public String f199294f;

    /* renamed from: g */
    public int f199295g;

    /* renamed from: h */
    public String f199296h;

    /* renamed from: i */
    public String f199297i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C69258q)) {
            return false;
        }
        C69258q qVar = (C69258q) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f199292d), Boolean.valueOf(qVar.f199292d)) && C46238a.m51546a(this.f199293e, qVar.f199293e) && C46238a.m51546a(this.f199294f, qVar.f199294f) && C46238a.m51546a(Integer.valueOf(this.f199295g), Integer.valueOf(qVar.f199295g)) && C46238a.m51546a(this.f199296h, qVar.f199296h) && C46238a.m51546a(this.f199297i, qVar.f199297i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f199292d);
            String str = this.f199293e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f199294f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f199295g);
            String str3 = this.f199296h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f199297i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f199292d) + 0;
            String str5 = this.f199293e;
            if (str5 != null) {
                a += C52418a.m58683j(2, str5);
            }
            String str6 = this.f199294f;
            if (str6 != null) {
                a += C52418a.m58683j(3, str6);
            }
            int e = a + C52418a.m58678e(4, this.f199295g);
            String str7 = this.f199296h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f199297i;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
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
            C69258q qVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qVar.f199292d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    qVar.f199293e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qVar.f199294f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qVar.f199295g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    qVar.f199296h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qVar.f199297i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
