package com.tencent.p014mm.plugin.luckymoney.model;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.b1 */
public class C69195b1 extends C47465a {

    /* renamed from: d */
    public int f199083d;

    /* renamed from: e */
    public long f199084e;

    /* renamed from: f */
    public int f199085f;

    /* renamed from: g */
    public long f199086g;

    /* renamed from: h */
    public int f199087h;

    /* renamed from: i */
    public int f199088i;

    /* renamed from: j */
    public LinkedList<C69197c1> f199089j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C69195b1)) {
            return false;
        }
        C69195b1 b1Var = (C69195b1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f199083d), Integer.valueOf(b1Var.f199083d)) && C46238a.m51546a(Long.valueOf(this.f199084e), Long.valueOf(b1Var.f199084e)) && C46238a.m51546a(Integer.valueOf(this.f199085f), Integer.valueOf(b1Var.f199085f)) && C46238a.m51546a(Long.valueOf(this.f199086g), Long.valueOf(b1Var.f199086g)) && C46238a.m51546a(Integer.valueOf(this.f199087h), Integer.valueOf(b1Var.f199087h)) && C46238a.m51546a(Integer.valueOf(this.f199088i), Integer.valueOf(b1Var.f199088i)) && C46238a.m51546a(this.f199089j, b1Var.f199089j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f199083d);
            aVar.mo74321h(2, this.f199084e);
            aVar.mo74318e(3, this.f199085f);
            aVar.mo74321h(4, this.f199086g);
            aVar.mo74318e(5, this.f199087h);
            aVar.mo74318e(6, this.f199088i);
            aVar.mo74320g(7, 8, this.f199089j);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f199083d) + 0 + C52418a.m58681h(2, this.f199084e) + C52418a.m58678e(3, this.f199085f) + C52418a.m58681h(4, this.f199086g) + C52418a.m58678e(5, this.f199087h) + C52418a.m58678e(6, this.f199088i) + C52418a.m58680g(7, 8, this.f199089j);
        } else {
            if (i == 2) {
                this.f199089j.clear();
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
                C69195b1 b1Var = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        b1Var.f199083d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        b1Var.f199084e = aVar3.mo141631i(intValue);
                        return 0;
                    case 3:
                        b1Var.f199085f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        b1Var.f199086g = aVar3.mo141631i(intValue);
                        return 0;
                    case 5:
                        b1Var.f199087h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        b1Var.f199088i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            byte[] bArr = j.get(i2);
                            C69197c1 c1Var = new C69197c1();
                            if (bArr != null && bArr.length > 0) {
                                c1Var.parseFrom(bArr);
                            }
                            b1Var.f199089j.add(c1Var);
                        }
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
