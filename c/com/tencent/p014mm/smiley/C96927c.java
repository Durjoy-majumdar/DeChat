package com.tencent.p014mm.smiley;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.smiley.c */
public class C96927c extends C47465a {

    /* renamed from: d */
    public LinkedList<Integer> f283943d = new LinkedList<>();

    /* renamed from: e */
    public C96930d0 f283944e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C96927c)) {
            return false;
        }
        C96927c cVar = (C96927c) aVar;
        return C46238a.m51546a(this.f283943d, cVar.f283943d) && C46238a.m51546a(this.f283944e, cVar.f283944e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 2, this.f283943d);
            C96930d0 d0Var = this.f283944e;
            if (d0Var != null) {
                aVar.mo74322i(2, d0Var.computeSize());
                this.f283944e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 2, this.f283943d) + 0;
            C96930d0 d0Var2 = this.f283944e;
            return d0Var2 != null ? g + C52418a.m58682i(2, d0Var2.computeSize()) : g;
        } else if (i == 2) {
            this.f283943d.clear();
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
            C96927c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cVar.f283943d.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C96930d0 d0Var3 = new C96930d0();
                    if (bArr != null && bArr.length > 0) {
                        d0Var3.parseFrom(bArr);
                    }
                    cVar.f283944e = d0Var3;
                }
                return 0;
            }
        }
    }
}
