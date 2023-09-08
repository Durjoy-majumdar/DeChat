package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zy2 */
public class C52326zy2 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f146282d;

    /* renamed from: e */
    public int f146283e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52326zy2)) {
            return false;
        }
        C52326zy2 zy22 = (C52326zy2) aVar;
        return C46238a.m51546a(this.f146282d, zy22.f146282d) && C46238a.m51546a(Integer.valueOf(this.f146283e), Integer.valueOf(zy22.f146283e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f146282d;
            if (rv32 != null) {
                aVar.mo74322i(1, rv32.computeSize());
                this.f146282d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f146283e);
            return 0;
        } else if (i == 1) {
            C51163rv3 rv33 = this.f146282d;
            if (rv33 != null) {
                i2 = 0 + C52418a.m58682i(1, rv33.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f146283e);
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
            C52326zy2 zy22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51163rv3 rv34 = new C51163rv3();
                    if (bArr != null && bArr.length > 0) {
                        rv34.mo73356d(bArr);
                    }
                    zy22.f146282d = rv34;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                zy22.f146283e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
