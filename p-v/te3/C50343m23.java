package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m23 */
public class C50343m23 extends C47465a {

    /* renamed from: d */
    public C64482k23 f137774d;

    /* renamed from: e */
    public C64488kb1 f137775e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50343m23)) {
            return false;
        }
        C50343m23 m232 = (C50343m23) aVar;
        return C46238a.m51546a(this.f137774d, m232.f137774d) && C46238a.m51546a(this.f137775e, m232.f137775e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64482k23 k232 = this.f137774d;
            if (k232 != null) {
                aVar.mo74322i(1, k232.computeSize());
                this.f137774d.writeFields(aVar);
            }
            C64488kb1 kb12 = this.f137775e;
            if (kb12 != null) {
                aVar.mo74322i(2, kb12.computeSize());
                this.f137775e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C64482k23 k233 = this.f137774d;
            if (k233 != null) {
                i2 = 0 + C52418a.m58682i(1, k233.computeSize());
            }
            C64488kb1 kb13 = this.f137775e;
            return kb13 != null ? i2 + C52418a.m58682i(2, kb13.computeSize()) : i2;
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
            C50343m23 m232 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64482k23 k234 = new C64482k23();
                    if (bArr != null && bArr.length > 0) {
                        k234.parseFrom(bArr);
                    }
                    m232.f137774d = k234;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64488kb1 kb14 = new C64488kb1();
                    if (bArr2 != null && bArr2.length > 0) {
                        kb14.parseFrom(bArr2);
                    }
                    m232.f137775e = kb14;
                }
                return 0;
            }
        }
    }
}
