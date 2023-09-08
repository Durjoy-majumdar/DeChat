package com.tencent.p014mm.smiley;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.smiley.d */
public class C96929d extends C47465a {

    /* renamed from: d */
    public LinkedList<C44648o> f283948d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C96938h> f283949e = new LinkedList<>();

    /* renamed from: f */
    public C96930d0 f283950f;

    /* renamed from: g */
    public C96971s0 f283951g;

    /* renamed from: h */
    public C96928c0 f283952h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C96929d)) {
            return false;
        }
        C96929d dVar = (C96929d) aVar;
        return C46238a.m51546a(this.f283948d, dVar.f283948d) && C46238a.m51546a(this.f283949e, dVar.f283949e) && C46238a.m51546a(this.f283950f, dVar.f283950f) && C46238a.m51546a(this.f283951g, dVar.f283951g) && C46238a.m51546a(this.f283952h, dVar.f283952h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(3, 8, this.f283948d);
            aVar.mo74320g(4, 8, this.f283949e);
            C96930d0 d0Var = this.f283950f;
            if (d0Var != null) {
                aVar.mo74322i(5, d0Var.computeSize());
                this.f283950f.writeFields(aVar);
            }
            C96971s0 s0Var = this.f283951g;
            if (s0Var != null) {
                aVar.mo74322i(6, s0Var.computeSize());
                this.f283951g.writeFields(aVar);
            }
            C96928c0 c0Var = this.f283952h;
            if (c0Var != null) {
                aVar.mo74322i(7, c0Var.computeSize());
                this.f283952h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(3, 8, this.f283948d) + 0 + C52418a.m58680g(4, 8, this.f283949e);
            C96930d0 d0Var2 = this.f283950f;
            if (d0Var2 != null) {
                g += C52418a.m58682i(5, d0Var2.computeSize());
            }
            C96971s0 s0Var2 = this.f283951g;
            if (s0Var2 != null) {
                g += C52418a.m58682i(6, s0Var2.computeSize());
            }
            C96928c0 c0Var2 = this.f283952h;
            return c0Var2 != null ? g + C52418a.m58682i(7, c0Var2.computeSize()) : g;
        } else if (i == 2) {
            this.f283948d.clear();
            this.f283949e.clear();
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
            C96929d dVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C44648o oVar = new C44648o();
                    if (bArr != null && bArr.length > 0) {
                        oVar.parseFrom(bArr);
                    }
                    dVar.f283948d.add(oVar);
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C96938h hVar = new C96938h();
                    if (bArr2 != null && bArr2.length > 0) {
                        hVar.parseFrom(bArr2);
                    }
                    dVar.f283949e.add(hVar);
                }
                return 0;
            } else if (intValue == 5) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C96930d0 d0Var3 = new C96930d0();
                    if (bArr3 != null && bArr3.length > 0) {
                        d0Var3.parseFrom(bArr3);
                    }
                    dVar.f283950f = d0Var3;
                }
                return 0;
            } else if (intValue == 6) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    byte[] bArr4 = j4.get(i5);
                    C96971s0 s0Var3 = new C96971s0();
                    if (bArr4 != null && bArr4.length > 0) {
                        s0Var3.parseFrom(bArr4);
                    }
                    dVar.f283951g = s0Var3;
                }
                return 0;
            } else if (intValue != 7) {
                return -1;
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    byte[] bArr5 = j5.get(i6);
                    C96928c0 c0Var3 = new C96928c0();
                    if (bArr5 != null && bArr5.length > 0) {
                        c0Var3.parseFrom(bArr5);
                    }
                    dVar.f283952h = c0Var3;
                }
                return 0;
            }
        }
    }
}
