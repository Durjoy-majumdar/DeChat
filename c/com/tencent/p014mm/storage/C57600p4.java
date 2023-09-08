package com.tencent.p014mm.storage;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.storage.p4 */
public class C57600p4 extends C47465a {

    /* renamed from: d */
    public String f164920d;

    /* renamed from: e */
    public long f164921e;

    /* renamed from: f */
    public int f164922f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C57600p4)) {
            return false;
        }
        C57600p4 p4Var = (C57600p4) aVar;
        return C46238a.m51546a(this.f164920d, p4Var.f164920d) && C46238a.m51546a(Long.valueOf(this.f164921e), Long.valueOf(p4Var.f164921e)) && C46238a.m51546a(Integer.valueOf(this.f164922f), Integer.valueOf(p4Var.f164922f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f164920d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f164921e);
            aVar.mo74318e(3, this.f164922f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f164920d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f164921e) + C52418a.m58678e(3, this.f164922f);
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
            C57600p4 p4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p4Var.f164920d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                p4Var.f164921e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                p4Var.f164922f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
