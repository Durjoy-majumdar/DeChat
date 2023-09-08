package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.r5 */
public class C47665r5 extends C47465a {

    /* renamed from: d */
    public C47672s5 f127981d;

    /* renamed from: e */
    public C47681u0 f127982e;

    /* renamed from: f */
    public String f127983f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47665r5)) {
            return false;
        }
        C47665r5 r5Var = (C47665r5) aVar;
        return C46238a.m51546a(this.f127981d, r5Var.f127981d) && C46238a.m51546a(this.f127982e, r5Var.f127982e) && C46238a.m51546a(this.f127983f, r5Var.f127983f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47672s5 s5Var = this.f127981d;
            if (s5Var != null) {
                aVar.mo74322i(1, s5Var.computeSize());
                this.f127981d.writeFields(aVar);
            }
            C47681u0 u0Var = this.f127982e;
            if (u0Var != null) {
                aVar.mo74322i(2, u0Var.computeSize());
                this.f127982e.writeFields(aVar);
            }
            String str = this.f127983f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C47672s5 s5Var2 = this.f127981d;
            if (s5Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, s5Var2.computeSize());
            }
            C47681u0 u0Var2 = this.f127982e;
            if (u0Var2 != null) {
                i2 += C52418a.m58682i(2, u0Var2.computeSize());
            }
            String str2 = this.f127983f;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            C47665r5 r5Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47672s5 s5Var3 = new C47672s5();
                    if (bArr != null && bArr.length > 0) {
                        s5Var3.parseFrom(bArr);
                    }
                    r5Var.f127981d = s5Var3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47681u0 u0Var3 = new C47681u0();
                    if (bArr2 != null && bArr2.length > 0) {
                        u0Var3.parseFrom(bArr2);
                    }
                    r5Var.f127982e = u0Var3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                r5Var.f127983f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
