package com.tencent.p014mm.storage;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.storage.l2 */
public class C72981l2 extends C47465a {

    /* renamed from: d */
    public int f212796d;

    /* renamed from: e */
    public LinkedList<Integer> f212797e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<Integer> f212798f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<Integer> f212799g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<Long> f212800h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<Long> f212801i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<Long> f212802j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C72981l2)) {
            return false;
        }
        C72981l2 l2Var = (C72981l2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f212796d), Integer.valueOf(l2Var.f212796d)) && C46238a.m51546a(this.f212797e, l2Var.f212797e) && C46238a.m51546a(this.f212798f, l2Var.f212798f) && C46238a.m51546a(this.f212799g, l2Var.f212799g) && C46238a.m51546a(this.f212800h, l2Var.f212800h) && C46238a.m51546a(this.f212801i, l2Var.f212801i) && C46238a.m51546a(this.f212802j, l2Var.f212802j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f212796d);
            aVar.mo74320g(2, 2, this.f212797e);
            aVar.mo74320g(3, 2, this.f212798f);
            aVar.mo74320g(4, 2, this.f212799g);
            aVar.mo74320g(5, 3, this.f212800h);
            aVar.mo74320g(6, 3, this.f212801i);
            aVar.mo74320g(7, 3, this.f212802j);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f212796d) + 0 + C52418a.m58680g(2, 2, this.f212797e) + C52418a.m58680g(3, 2, this.f212798f) + C52418a.m58680g(4, 2, this.f212799g) + C52418a.m58680g(5, 3, this.f212800h) + C52418a.m58680g(6, 3, this.f212801i) + C52418a.m58680g(7, 3, this.f212802j);
        } else {
            if (i == 2) {
                this.f212797e.clear();
                this.f212798f.clear();
                this.f212799g.clear();
                this.f212800h.clear();
                this.f212801i.clear();
                this.f212802j.clear();
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
                C72981l2 l2Var = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        l2Var.f212796d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        l2Var.f212797e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                        return 0;
                    case 3:
                        l2Var.f212798f.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                        return 0;
                    case 4:
                        l2Var.f212799g.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                        return 0;
                    case 5:
                        l2Var.f212800h.add(Long.valueOf(aVar3.mo141631i(intValue)));
                        return 0;
                    case 6:
                        l2Var.f212801i.add(Long.valueOf(aVar3.mo141631i(intValue)));
                        return 0;
                    case 7:
                        l2Var.f212802j.add(Long.valueOf(aVar3.mo141631i(intValue)));
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
