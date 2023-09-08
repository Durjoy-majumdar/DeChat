package com.tencent.p014mm.smiley;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.smiley.s0 */
public class C96971s0 extends C47465a {

    /* renamed from: d */
    public int f284088d;

    /* renamed from: e */
    public C96938h f284089e;

    /* renamed from: f */
    public int f284090f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C96971s0)) {
            return false;
        }
        C96971s0 s0Var = (C96971s0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f284088d), Integer.valueOf(s0Var.f284088d)) && C46238a.m51546a(this.f284089e, s0Var.f284089e) && C46238a.m51546a(Integer.valueOf(this.f284090f), Integer.valueOf(s0Var.f284090f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f284088d);
            C96938h hVar = this.f284089e;
            if (hVar != null) {
                aVar.mo74322i(2, hVar.computeSize());
                this.f284089e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f284090f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f284088d) + 0;
            C96938h hVar2 = this.f284089e;
            if (hVar2 != null) {
                e += C52418a.m58682i(2, hVar2.computeSize());
            }
            return e + C52418a.m58678e(3, this.f284090f);
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
            C96971s0 s0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s0Var.f284088d = aVar3.mo141629g(intValue);
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
                    s0Var.f284089e = hVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                s0Var.f284090f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
