package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k52 */
public class C64484k52 extends C47465a {

    /* renamed from: d */
    public int f183893d;

    /* renamed from: e */
    public C64644q0 f183894e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64484k52)) {
            return false;
        }
        C64484k52 k522 = (C64484k52) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183893d), Integer.valueOf(k522.f183893d)) && C46238a.m51546a(this.f183894e, k522.f183894e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183893d);
            C64644q0 q0Var = this.f183894e;
            if (q0Var != null) {
                aVar.mo74322i(2, q0Var.computeSize());
                this.f183894e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183893d) + 0;
            C64644q0 q0Var2 = this.f183894e;
            return q0Var2 != null ? e + C52418a.m58682i(2, q0Var2.computeSize()) : e;
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
            C64484k52 k522 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                k522.f183893d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64644q0 q0Var3 = new C64644q0();
                    if (bArr != null && bArr.length > 0) {
                        q0Var3.parseFrom(bArr);
                    }
                    k522.f183894e = q0Var3;
                }
                return 0;
            }
        }
    }
}
