package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fo3 */
public class C64369fo3 extends C47465a {

    /* renamed from: d */
    public int f183153d;

    /* renamed from: e */
    public C64416ha3 f183154e;

    /* renamed from: f */
    public C64544m5 f183155f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64369fo3)) {
            return false;
        }
        C64369fo3 fo32 = (C64369fo3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183153d), Integer.valueOf(fo32.f183153d)) && C46238a.m51546a(this.f183154e, fo32.f183154e) && C46238a.m51546a(this.f183155f, fo32.f183155f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183153d);
            C64416ha3 ha32 = this.f183154e;
            if (ha32 != null) {
                aVar.mo74322i(2, ha32.computeSize());
                this.f183154e.writeFields(aVar);
            }
            C64544m5 m5Var = this.f183155f;
            if (m5Var != null) {
                aVar.mo74322i(3, m5Var.computeSize());
                this.f183155f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183153d) + 0;
            C64416ha3 ha33 = this.f183154e;
            if (ha33 != null) {
                e += C52418a.m58682i(2, ha33.computeSize());
            }
            C64544m5 m5Var2 = this.f183155f;
            return m5Var2 != null ? e + C52418a.m58682i(3, m5Var2.computeSize()) : e;
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
            C64369fo3 fo32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fo32.f183153d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64416ha3 ha34 = new C64416ha3();
                    if (bArr != null && bArr.length > 0) {
                        ha34.parseFrom(bArr);
                    }
                    fo32.f183154e = ha34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C64544m5 m5Var3 = new C64544m5();
                    if (bArr2 != null && bArr2.length > 0) {
                        m5Var3.parseFrom(bArr2);
                    }
                    fo32.f183155f = m5Var3;
                }
                return 0;
            }
        }
    }
}
