package com.tencent.p014mm.plugin.report.service;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.service.e */
public class C57274e extends C47465a {

    /* renamed from: d */
    public int f164047d;

    /* renamed from: e */
    public int f164048e;

    /* renamed from: f */
    public int f164049f;

    /* renamed from: g */
    public boolean f164050g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C57274e)) {
            return false;
        }
        C57274e eVar = (C57274e) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f164047d), Integer.valueOf(eVar.f164047d)) && C46238a.m51546a(Integer.valueOf(this.f164048e), Integer.valueOf(eVar.f164048e)) && C46238a.m51546a(Integer.valueOf(this.f164049f), Integer.valueOf(eVar.f164049f)) && C46238a.m51546a(Boolean.valueOf(this.f164050g), Boolean.valueOf(eVar.f164050g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f164047d);
            aVar.mo74318e(2, this.f164048e);
            aVar.mo74318e(3, this.f164049f);
            aVar.mo74314a(4, this.f164050g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f164047d) + 0 + C52418a.m58678e(2, this.f164048e) + C52418a.m58678e(3, this.f164049f) + C52418a.m58674a(4, this.f164050g);
        } else {
            if (i == 2) {
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
                C57274e eVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    eVar.f164047d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    eVar.f164048e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    eVar.f164049f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    eVar.f164050g = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
