package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.o1 */
public class C47640o1 extends C47465a {

    /* renamed from: d */
    public C47558c3 f127900d;

    /* renamed from: e */
    public LinkedList<C47632n0> f127901e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47640o1)) {
            return false;
        }
        C47640o1 o1Var = (C47640o1) aVar;
        return C46238a.m51546a(this.f127900d, o1Var.f127900d) && C46238a.m51546a(this.f127901e, o1Var.f127901e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47558c3 c3Var = this.f127900d;
            if (c3Var != null) {
                aVar.mo74322i(1, c3Var.computeSize());
                this.f127900d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f127901e);
            return 0;
        } else if (i == 1) {
            C47558c3 c3Var2 = this.f127900d;
            if (c3Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, c3Var2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f127901e);
        } else if (i == 2) {
            this.f127901e.clear();
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
            C47640o1 o1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47558c3 c3Var3 = new C47558c3();
                    if (bArr != null && bArr.length > 0) {
                        c3Var3.parseFrom(bArr);
                    }
                    o1Var.f127900d = c3Var3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47632n0 n0Var = new C47632n0();
                    if (bArr2 != null && bArr2.length > 0) {
                        n0Var.parseFrom(bArr2);
                    }
                    o1Var.f127901e.add(n0Var);
                }
                return 0;
            }
        }
    }
}
