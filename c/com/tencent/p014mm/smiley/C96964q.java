package com.tencent.p014mm.smiley;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.smiley.q */
public class C96964q extends C47465a {

    /* renamed from: d */
    public LinkedList<C96927c> f284064d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C96971s0> f284065e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C96928c0> f284066f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C96964q)) {
            return false;
        }
        C96964q qVar = (C96964q) aVar;
        return C46238a.m51546a(this.f284064d, qVar.f284064d) && C46238a.m51546a(this.f284065e, qVar.f284065e) && C46238a.m51546a(this.f284066f, qVar.f284066f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f284064d);
            aVar.mo74320g(2, 8, this.f284065e);
            aVar.mo74320g(3, 8, this.f284066f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f284064d) + 0 + C52418a.m58680g(2, 8, this.f284065e) + C52418a.m58680g(3, 8, this.f284066f);
        } else {
            if (i == 2) {
                this.f284064d.clear();
                this.f284065e.clear();
                this.f284066f.clear();
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
                C96964q qVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C96927c cVar = new C96927c();
                        if (bArr != null && bArr.length > 0) {
                            cVar.parseFrom(bArr);
                        }
                        qVar.f284064d.add(cVar);
                    }
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C96971s0 s0Var = new C96971s0();
                        if (bArr2 != null && bArr2.length > 0) {
                            s0Var.parseFrom(bArr2);
                        }
                        qVar.f284065e.add(s0Var);
                    }
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C96928c0 c0Var = new C96928c0();
                        if (bArr3 != null && bArr3.length > 0) {
                            c0Var.parseFrom(bArr3);
                        }
                        qVar.f284066f.add(c0Var);
                    }
                    return 0;
                }
            }
        }
    }
}
