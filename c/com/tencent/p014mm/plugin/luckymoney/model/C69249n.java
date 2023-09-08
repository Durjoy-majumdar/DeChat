package com.tencent.p014mm.plugin.luckymoney.model;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.n */
public class C69249n extends C47465a {

    /* renamed from: d */
    public int f199277d;

    /* renamed from: e */
    public String f199278e;

    /* renamed from: f */
    public String f199279f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C69249n)) {
            return false;
        }
        C69249n nVar = (C69249n) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f199277d), Integer.valueOf(nVar.f199277d)) && C46238a.m51546a(this.f199278e, nVar.f199278e) && C46238a.m51546a(this.f199279f, nVar.f199279f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f199277d);
            String str = this.f199278e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f199279f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f199277d) + 0;
            String str3 = this.f199278e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f199279f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            C69249n nVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nVar.f199277d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                nVar.f199278e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                nVar.f199279f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
