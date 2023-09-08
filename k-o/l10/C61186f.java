package l10;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: l10.f */
public class C61186f extends C47465a {

    /* renamed from: d */
    public C61187k f174182d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C61186f) && C46238a.m51546a(this.f174182d, ((C61186f) aVar).f174182d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C61187k kVar = this.f174182d;
            if (kVar != null) {
                aVar.mo74322i(1, kVar.computeSize());
                this.f174182d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C61187k kVar2 = this.f174182d;
            if (kVar2 != null) {
                return 0 + C52418a.m58682i(1, kVar2.computeSize());
            }
            return 0;
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
            C61186f fVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C61187k kVar3 = new C61187k();
                if (bArr != null && bArr.length > 0) {
                    kVar3.parseFrom(bArr);
                }
                fVar.f174182d = kVar3;
            }
            return 0;
        }
    }
}
