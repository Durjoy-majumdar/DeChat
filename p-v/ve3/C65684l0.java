package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.l0 */
public class C65684l0 extends C47465a {

    /* renamed from: d */
    public int f189015d;

    /* renamed from: e */
    public int f189016e;

    /* renamed from: f */
    public int f189017f;

    /* renamed from: g */
    public C65679e0 f189018g;

    /* renamed from: h */
    public C65680f f189019h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C65684l0)) {
            return false;
        }
        C65684l0 l0Var = (C65684l0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f189015d), Integer.valueOf(l0Var.f189015d)) && C46238a.m51546a(Integer.valueOf(this.f189016e), Integer.valueOf(l0Var.f189016e)) && C46238a.m51546a(Integer.valueOf(this.f189017f), Integer.valueOf(l0Var.f189017f)) && C46238a.m51546a(this.f189018g, l0Var.f189018g) && C46238a.m51546a(this.f189019h, l0Var.f189019h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f189015d);
            aVar.mo74318e(2, this.f189016e);
            aVar.mo74318e(3, this.f189017f);
            C65679e0 e0Var = this.f189018g;
            if (e0Var != null) {
                aVar.mo74322i(4, e0Var.computeSize());
                this.f189018g.writeFields(aVar);
            }
            C65680f fVar = this.f189019h;
            if (fVar != null) {
                aVar.mo74322i(5, fVar.computeSize());
                this.f189019h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f189015d) + 0 + C52418a.m58678e(2, this.f189016e) + C52418a.m58678e(3, this.f189017f);
            C65679e0 e0Var2 = this.f189018g;
            if (e0Var2 != null) {
                e += C52418a.m58682i(4, e0Var2.computeSize());
            }
            C65680f fVar2 = this.f189019h;
            return fVar2 != null ? e + C52418a.m58682i(5, fVar2.computeSize()) : e;
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
            C65684l0 l0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                l0Var.f189015d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                l0Var.f189016e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                l0Var.f189017f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C65679e0 e0Var3 = new C65679e0();
                    if (bArr != null && bArr.length > 0) {
                        e0Var3.parseFrom(bArr);
                    }
                    l0Var.f189018g = e0Var3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C65680f fVar3 = new C65680f();
                    if (bArr2 != null && bArr2.length > 0) {
                        fVar3.parseFrom(bArr2);
                    }
                    l0Var.f189019h = fVar3;
                }
                return 0;
            }
        }
    }
}
