package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.d0 */
public class C65678d0 extends C47465a {

    /* renamed from: d */
    public int f188979d;

    /* renamed from: e */
    public C65679e0 f188980e;

    /* renamed from: f */
    public C65680f f188981f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C65678d0)) {
            return false;
        }
        C65678d0 d0Var = (C65678d0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f188979d), Integer.valueOf(d0Var.f188979d)) && C46238a.m51546a(this.f188980e, d0Var.f188980e) && C46238a.m51546a(this.f188981f, d0Var.f188981f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f188979d);
            C65679e0 e0Var = this.f188980e;
            if (e0Var != null) {
                aVar.mo74322i(2, e0Var.computeSize());
                this.f188980e.writeFields(aVar);
            }
            C65680f fVar = this.f188981f;
            if (fVar != null) {
                aVar.mo74322i(3, fVar.computeSize());
                this.f188981f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f188979d) + 0;
            C65679e0 e0Var2 = this.f188980e;
            if (e0Var2 != null) {
                e += C52418a.m58682i(2, e0Var2.computeSize());
            }
            C65680f fVar2 = this.f188981f;
            return fVar2 != null ? e + C52418a.m58682i(3, fVar2.computeSize()) : e;
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
            C65678d0 d0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d0Var.f188979d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C65679e0 e0Var3 = new C65679e0();
                    if (bArr != null && bArr.length > 0) {
                        e0Var3.parseFrom(bArr);
                    }
                    d0Var.f188980e = e0Var3;
                }
                return 0;
            } else if (intValue != 3) {
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
                    d0Var.f188981f = fVar3;
                }
                return 0;
            }
        }
    }
}
