package com.tencent.p014mm.plugin.luckymoney.model;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.m2 */
public class C69248m2 extends C47465a {

    /* renamed from: d */
    public int f199270d;

    /* renamed from: e */
    public String f199271e;

    /* renamed from: f */
    public String f199272f;

    /* renamed from: g */
    public String f199273g;

    /* renamed from: h */
    public int f199274h;

    /* renamed from: i */
    public String f199275i;

    /* renamed from: j */
    public int f199276j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C69248m2)) {
            return false;
        }
        C69248m2 m2Var = (C69248m2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f199270d), Integer.valueOf(m2Var.f199270d)) && C46238a.m51546a(this.f199271e, m2Var.f199271e) && C46238a.m51546a(this.f199272f, m2Var.f199272f) && C46238a.m51546a(this.f199273g, m2Var.f199273g) && C46238a.m51546a(Integer.valueOf(this.f199274h), Integer.valueOf(m2Var.f199274h)) && C46238a.m51546a(this.f199275i, m2Var.f199275i) && C46238a.m51546a(Integer.valueOf(this.f199276j), Integer.valueOf(m2Var.f199276j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f199270d);
            String str = this.f199271e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f199272f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f199273g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f199274h);
            String str4 = this.f199275i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f199276j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f199270d) + 0;
            String str5 = this.f199271e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            String str6 = this.f199272f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f199273g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            int e2 = e + C52418a.m58678e(5, this.f199274h);
            String str8 = this.f199275i;
            if (str8 != null) {
                e2 += C52418a.m58683j(6, str8);
            }
            return e2 + C52418a.m58678e(7, this.f199276j);
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
            C69248m2 m2Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    m2Var.f199270d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    m2Var.f199271e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    m2Var.f199272f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    m2Var.f199273g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m2Var.f199274h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    m2Var.f199275i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    m2Var.f199276j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
