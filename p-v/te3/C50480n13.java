package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n13 */
public class C50480n13 extends C47465a {

    /* renamed from: d */
    public C64488kb1 f138329d;

    /* renamed from: e */
    public LinkedList<C48845be1> f138330e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50480n13)) {
            return false;
        }
        C50480n13 n132 = (C50480n13) aVar;
        return C46238a.m51546a(this.f138329d, n132.f138329d) && C46238a.m51546a(this.f138330e, n132.f138330e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64488kb1 kb12 = this.f138329d;
            if (kb12 != null) {
                aVar.mo74322i(1, kb12.computeSize());
                this.f138329d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f138330e);
            return 0;
        } else if (i == 1) {
            C64488kb1 kb13 = this.f138329d;
            if (kb13 != null) {
                i2 = 0 + C52418a.m58682i(1, kb13.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f138330e);
        } else if (i == 2) {
            this.f138330e.clear();
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
            C50480n13 n132 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64488kb1 kb14 = new C64488kb1();
                    if (bArr != null && bArr.length > 0) {
                        kb14.parseFrom(bArr);
                    }
                    n132.f138329d = kb14;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48845be1 be12 = new C48845be1();
                    if (bArr2 != null && bArr2.length > 0) {
                        be12.parseFrom(bArr2);
                    }
                    n132.f138330e.add(be12);
                }
                return 0;
            }
        }
    }
}
