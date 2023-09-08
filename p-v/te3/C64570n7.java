package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n7 */
public class C64570n7 extends C47465a {

    /* renamed from: d */
    public C101804kv2 f184437d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C64570n7) && C46238a.m51546a(this.f184437d, ((C64570n7) aVar).f184437d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C101804kv2 kv22 = this.f184437d;
            if (kv22 != null) {
                if (kv22 != null) {
                    aVar.mo74322i(1, kv22.computeSize());
                    this.f184437d.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: MediaObj");
        } else if (i == 1) {
            C101804kv2 kv23 = this.f184437d;
            if (kv23 != null) {
                return 0 + C52418a.m58682i(1, kv23.computeSize());
            }
            return 0;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184437d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: MediaObj");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64570n7 n7Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C101804kv2 kv24 = new C101804kv2();
                if (bArr != null && bArr.length > 0) {
                    kv24.parseFrom(bArr);
                }
                n7Var.f184437d = kv24;
            }
            return 0;
        }
    }
}
