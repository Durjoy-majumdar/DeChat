package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.b3 */
public class C47551b3 extends C47465a {

    /* renamed from: d */
    public C47567d5 f127595d;

    /* renamed from: e */
    public C47702x3 f127596e;

    /* renamed from: f */
    public C47604j0 f127597f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47551b3)) {
            return false;
        }
        C47551b3 b3Var = (C47551b3) aVar;
        return C46238a.m51546a(this.f127595d, b3Var.f127595d) && C46238a.m51546a(this.f127596e, b3Var.f127596e) && C46238a.m51546a(this.f127597f, b3Var.f127597f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47567d5 d5Var = this.f127595d;
            if (d5Var != null) {
                aVar.mo74322i(1, d5Var.computeSize());
                this.f127595d.writeFields(aVar);
            }
            C47702x3 x3Var = this.f127596e;
            if (x3Var != null) {
                aVar.mo74322i(2, x3Var.computeSize());
                this.f127596e.writeFields(aVar);
            }
            C47604j0 j0Var = this.f127597f;
            if (j0Var != null) {
                aVar.mo74322i(3, j0Var.computeSize());
                this.f127597f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C47567d5 d5Var2 = this.f127595d;
            if (d5Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, d5Var2.computeSize());
            }
            C47702x3 x3Var2 = this.f127596e;
            if (x3Var2 != null) {
                i2 += C52418a.m58682i(2, x3Var2.computeSize());
            }
            C47604j0 j0Var2 = this.f127597f;
            return j0Var2 != null ? i2 + C52418a.m58682i(3, j0Var2.computeSize()) : i2;
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
            C47551b3 b3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47567d5 d5Var3 = new C47567d5();
                    if (bArr != null && bArr.length > 0) {
                        d5Var3.parseFrom(bArr);
                    }
                    b3Var.f127595d = d5Var3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47702x3 x3Var3 = new C47702x3();
                    if (bArr2 != null && bArr2.length > 0) {
                        x3Var3.parseFrom(bArr2);
                    }
                    b3Var.f127596e = x3Var3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C47604j0 j0Var3 = new C47604j0();
                    if (bArr3 != null && bArr3.length > 0) {
                        j0Var3.parseFrom(bArr3);
                    }
                    b3Var.f127597f = j0Var3;
                }
                return 0;
            }
        }
    }
}
