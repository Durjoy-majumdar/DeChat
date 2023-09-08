package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qf1 */
public class C50953qf1 extends C47465a {

    /* renamed from: d */
    public C52104ye1 f140283d;

    /* renamed from: e */
    public C51100rf1 f140284e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50953qf1)) {
            return false;
        }
        C50953qf1 qf12 = (C50953qf1) aVar;
        return C46238a.m51546a(this.f140283d, qf12.f140283d) && C46238a.m51546a(this.f140284e, qf12.f140284e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52104ye1 ye12 = this.f140283d;
            if (ye12 != null) {
                aVar.mo74322i(1, ye12.computeSize());
                this.f140283d.writeFields(aVar);
            }
            C51100rf1 rf12 = this.f140284e;
            if (rf12 != null) {
                aVar.mo74322i(2, rf12.computeSize());
                this.f140284e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C52104ye1 ye13 = this.f140283d;
            if (ye13 != null) {
                i2 = 0 + C52418a.m58682i(1, ye13.computeSize());
            }
            C51100rf1 rf13 = this.f140284e;
            return rf13 != null ? i2 + C52418a.m58682i(2, rf13.computeSize()) : i2;
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
            C50953qf1 qf12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52104ye1 ye14 = new C52104ye1();
                    if (bArr != null && bArr.length > 0) {
                        ye14.parseFrom(bArr);
                    }
                    qf12.f140283d = ye14;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51100rf1 rf14 = new C51100rf1();
                    if (bArr2 != null && bArr2.length > 0) {
                        rf14.parseFrom(bArr2);
                    }
                    qf12.f140284e = rf14;
                }
                return 0;
            }
        }
    }
}
