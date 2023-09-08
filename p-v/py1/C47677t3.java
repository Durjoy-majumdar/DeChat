package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.t3 */
public class C47677t3 extends C47465a {

    /* renamed from: d */
    public int f128026d;

    /* renamed from: e */
    public int f128027e;

    /* renamed from: f */
    public int f128028f;

    /* renamed from: g */
    public C47597i0 f128029g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47677t3)) {
            return false;
        }
        C47677t3 t3Var = (C47677t3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f128026d), Integer.valueOf(t3Var.f128026d)) && C46238a.m51546a(Integer.valueOf(this.f128027e), Integer.valueOf(t3Var.f128027e)) && C46238a.m51546a(Integer.valueOf(this.f128028f), Integer.valueOf(t3Var.f128028f)) && C46238a.m51546a(this.f128029g, t3Var.f128029g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f128026d);
            aVar.mo74318e(2, this.f128027e);
            aVar.mo74318e(3, this.f128028f);
            C47597i0 i0Var = this.f128029g;
            if (i0Var != null) {
                aVar.mo74322i(4, i0Var.computeSize());
                this.f128029g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f128026d) + 0 + C52418a.m58678e(2, this.f128027e) + C52418a.m58678e(3, this.f128028f);
            C47597i0 i0Var2 = this.f128029g;
            return i0Var2 != null ? e + C52418a.m58682i(4, i0Var2.computeSize()) : e;
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
            C47677t3 t3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                t3Var.f128026d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                t3Var.f128027e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                t3Var.f128028f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C47597i0 i0Var3 = new C47597i0();
                    if (bArr != null && bArr.length > 0) {
                        i0Var3.parseFrom(bArr);
                    }
                    t3Var.f128029g = i0Var3;
                }
                return 0;
            }
        }
    }
}
