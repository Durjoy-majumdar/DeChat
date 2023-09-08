package com.tencent.p014mm.storage;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.storage.k4 */
public class C57599k4 extends C47465a {

    /* renamed from: d */
    public long f164917d;

    /* renamed from: e */
    public long f164918e;

    /* renamed from: f */
    public long f164919f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C57599k4)) {
            return false;
        }
        C57599k4 k4Var = (C57599k4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f164917d), Long.valueOf(k4Var.f164917d)) && C46238a.m51546a(Long.valueOf(this.f164918e), Long.valueOf(k4Var.f164918e)) && C46238a.m51546a(Long.valueOf(this.f164919f), Long.valueOf(k4Var.f164919f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f164917d);
            aVar.mo74321h(2, this.f164918e);
            aVar.mo74321h(3, this.f164919f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f164917d) + 0 + C52418a.m58681h(2, this.f164918e) + C52418a.m58681h(3, this.f164919f);
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
                C57599k4 k4Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    k4Var.f164917d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    k4Var.f164918e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    k4Var.f164919f = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
