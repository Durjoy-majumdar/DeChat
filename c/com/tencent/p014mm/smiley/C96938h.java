package com.tencent.p014mm.smiley;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.smiley.h */
public class C96938h extends C47465a {

    /* renamed from: d */
    public int f283978d;

    /* renamed from: e */
    public int f283979e;

    /* renamed from: f */
    public int f283980f;

    /* renamed from: g */
    public int f283981g = -1;

    /* renamed from: h */
    public int f283982h;

    /* renamed from: i */
    public int f283983i;

    /* renamed from: j */
    public int f283984j;

    /* renamed from: n */
    public String f283985n;

    /* renamed from: o */
    public int f283986o;

    /* renamed from: p */
    public C96930d0 f283987p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C96938h)) {
            return false;
        }
        C96938h hVar = (C96938h) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f283978d), Integer.valueOf(hVar.f283978d)) && C46238a.m51546a(Integer.valueOf(this.f283979e), Integer.valueOf(hVar.f283979e)) && C46238a.m51546a(Integer.valueOf(this.f283980f), Integer.valueOf(hVar.f283980f)) && C46238a.m51546a(Integer.valueOf(this.f283981g), Integer.valueOf(hVar.f283981g)) && C46238a.m51546a(Integer.valueOf(this.f283982h), Integer.valueOf(hVar.f283982h)) && C46238a.m51546a(Integer.valueOf(this.f283983i), Integer.valueOf(hVar.f283983i)) && C46238a.m51546a(Integer.valueOf(this.f283984j), Integer.valueOf(hVar.f283984j)) && C46238a.m51546a(this.f283985n, hVar.f283985n) && C46238a.m51546a(Integer.valueOf(this.f283986o), Integer.valueOf(hVar.f283986o)) && C46238a.m51546a(this.f283987p, hVar.f283987p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f283978d);
            aVar.mo74318e(2, this.f283979e);
            aVar.mo74318e(3, this.f283980f);
            aVar.mo74318e(41, this.f283981g);
            aVar.mo74318e(5, this.f283982h);
            aVar.mo74318e(6, this.f283983i);
            aVar.mo74318e(7, this.f283984j);
            String str = this.f283985n;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            aVar.mo74318e(9, this.f283986o);
            C96930d0 d0Var = this.f283987p;
            if (d0Var != null) {
                aVar.mo74322i(10, d0Var.computeSize());
                this.f283987p.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f283978d) + 0 + C52418a.m58678e(2, this.f283979e) + C52418a.m58678e(3, this.f283980f) + C52418a.m58678e(41, this.f283981g) + C52418a.m58678e(5, this.f283982h) + C52418a.m58678e(6, this.f283983i) + C52418a.m58678e(7, this.f283984j);
            String str2 = this.f283985n;
            if (str2 != null) {
                e += C52418a.m58683j(8, str2);
            }
            int e2 = e + C52418a.m58678e(9, this.f283986o);
            C96930d0 d0Var2 = this.f283987p;
            return d0Var2 != null ? e2 + C52418a.m58682i(10, d0Var2.computeSize()) : e2;
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
            C96938h hVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hVar.f283978d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                hVar.f283979e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                hVar.f283980f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 41) {
                switch (intValue) {
                    case 5:
                        hVar.f283982h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        hVar.f283983i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        hVar.f283984j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        hVar.f283985n = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        hVar.f283986o = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            byte[] bArr = j.get(i2);
                            C96930d0 d0Var3 = new C96930d0();
                            if (bArr != null && bArr.length > 0) {
                                d0Var3.parseFrom(bArr);
                            }
                            hVar.f283987p = d0Var3;
                        }
                        return 0;
                    default:
                        return -1;
                }
            } else {
                hVar.f283981g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
