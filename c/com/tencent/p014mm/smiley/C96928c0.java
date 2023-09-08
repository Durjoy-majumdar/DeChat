package com.tencent.p014mm.smiley;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.smiley.c0 */
public class C96928c0 extends C47465a {

    /* renamed from: d */
    public int f283945d;

    /* renamed from: e */
    public C96938h f283946e;

    /* renamed from: f */
    public int f283947f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C96928c0)) {
            return false;
        }
        C96928c0 c0Var = (C96928c0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f283945d), Integer.valueOf(c0Var.f283945d)) && C46238a.m51546a(this.f283946e, c0Var.f283946e) && C46238a.m51546a(Integer.valueOf(this.f283947f), Integer.valueOf(c0Var.f283947f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f283945d);
            C96938h hVar = this.f283946e;
            if (hVar != null) {
                aVar.mo74322i(2, hVar.computeSize());
                this.f283946e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f283947f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f283945d) + 0;
            C96938h hVar2 = this.f283946e;
            if (hVar2 != null) {
                e += C52418a.m58682i(2, hVar2.computeSize());
            }
            return e + C52418a.m58678e(3, this.f283947f);
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
            C96928c0 c0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c0Var.f283945d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C96938h hVar3 = new C96938h();
                    if (bArr != null && bArr.length > 0) {
                        hVar3.parseFrom(bArr);
                    }
                    c0Var.f283946e = hVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                c0Var.f283947f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
