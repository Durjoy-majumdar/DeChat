package com.tencent.p014mm.plugin.luckymoney.model;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.o */
public class C56847o extends C47465a {

    /* renamed from: d */
    public String f162880d;

    /* renamed from: e */
    public LinkedList<C56846h> f162881e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C56847o)) {
            return false;
        }
        C56847o oVar = (C56847o) aVar;
        return C46238a.m51546a(this.f162880d, oVar.f162880d) && C46238a.m51546a(this.f162881e, oVar.f162881e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f162880d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f162881e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f162880d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f162881e);
        } else if (i == 2) {
            this.f162881e.clear();
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
            C56847o oVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                oVar.f162880d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C56846h hVar = new C56846h();
                    if (bArr != null && bArr.length > 0) {
                        hVar.parseFrom(bArr);
                    }
                    oVar.f162881e.add(hVar);
                }
                return 0;
            }
        }
    }
}
