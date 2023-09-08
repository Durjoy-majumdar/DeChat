package com.tencent.p014mm.plugin.report.service;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.service.d */
public class C57273d extends C47465a {

    /* renamed from: d */
    public int f164045d;

    /* renamed from: e */
    public LinkedList<C57274e> f164046e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C57273d)) {
            return false;
        }
        C57273d dVar = (C57273d) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f164045d), Integer.valueOf(dVar.f164045d)) && C46238a.m51546a(this.f164046e, dVar.f164046e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f164045d);
            aVar.mo74320g(2, 8, this.f164046e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f164045d) + 0 + C52418a.m58680g(2, 8, this.f164046e);
        } else {
            if (i == 2) {
                this.f164046e.clear();
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
                C57273d dVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    dVar.f164045d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C57274e eVar = new C57274e();
                        if (bArr != null && bArr.length > 0) {
                            eVar.parseFrom(bArr);
                        }
                        dVar.f164046e.add(eVar);
                    }
                    return 0;
                }
            }
        }
    }
}
