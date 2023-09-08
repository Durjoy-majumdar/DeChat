package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hw2 */
public class C49762hw2 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f134913d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C49762hw2) && C46238a.m51546a(this.f134913d, ((C49762hw2) aVar).f134913d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f134913d;
            if (rv32 != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f134913d.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: MemberName");
        } else if (i == 1) {
            C51163rv3 rv33 = this.f134913d;
            if (rv33 != null) {
                return 0 + C52418a.m58682i(1, rv33.computeSize());
            }
            return 0;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134913d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: MemberName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49762hw2 hw22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C51163rv3 rv34 = new C51163rv3();
                if (bArr != null && bArr.length > 0) {
                    rv34.mo73356d(bArr);
                }
                hw22.f134913d = rv34;
            }
            return 0;
        }
    }
}
