package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z83 */
public class C52232z83 extends C47465a {

    /* renamed from: d */
    public C51024qx f145765d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C52232z83) && C46238a.m51546a(this.f145765d, ((C52232z83) aVar).f145765d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51024qx qxVar = this.f145765d;
            if (qxVar != null) {
                if (qxVar != null) {
                    aVar.mo74322i(1, qxVar.computeSize());
                    this.f145765d.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Oplog");
        } else if (i == 1) {
            C51024qx qxVar2 = this.f145765d;
            if (qxVar2 != null) {
                return 0 + C52418a.m58682i(1, qxVar2.computeSize());
            }
            return 0;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f145765d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Oplog");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52232z83 z832 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C51024qx qxVar3 = new C51024qx();
                if (bArr != null && bArr.length > 0) {
                    qxVar3.parseFrom(bArr);
                }
                z832.f145765d = qxVar3;
            }
            return 0;
        }
    }
}
