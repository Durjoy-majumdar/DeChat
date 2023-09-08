package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.q0 */
public class C47653q0 extends C47465a {

    /* renamed from: d */
    public C47691v4 f127939d;

    /* renamed from: e */
    public LinkedList<C47553b5> f127940e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47653q0)) {
            return false;
        }
        C47653q0 q0Var = (C47653q0) aVar;
        return C46238a.m51546a(this.f127939d, q0Var.f127939d) && C46238a.m51546a(this.f127940e, q0Var.f127940e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47691v4 v4Var = this.f127939d;
            if (v4Var != null) {
                if (v4Var != null) {
                    aVar.mo74322i(1, v4Var.computeSize());
                    this.f127939d.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f127940e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Tab");
        } else if (i == 1) {
            C47691v4 v4Var2 = this.f127939d;
            if (v4Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, v4Var2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f127940e);
        } else if (i == 2) {
            this.f127940e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127939d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Tab");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47653q0 q0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47691v4 v4Var3 = new C47691v4();
                    if (bArr != null && bArr.length > 0) {
                        v4Var3.parseFrom(bArr);
                    }
                    q0Var.f127939d = v4Var3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47553b5 b5Var = new C47553b5();
                    if (bArr2 != null && bArr2.length > 0) {
                        b5Var.parseFrom(bArr2);
                    }
                    q0Var.f127940e.add(b5Var);
                }
                return 0;
            }
        }
    }
}
