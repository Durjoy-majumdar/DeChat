package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class us4 extends C47465a {

    /* renamed from: d */
    public et4 f143111d;

    /* renamed from: e */
    public C89349b f143112e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof us4)) {
            return false;
        }
        us4 us4 = (us4) aVar;
        return C46238a.m51546a(this.f143111d, us4.f143111d) && C46238a.m51546a(this.f143112e, us4.f143112e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            et4 et4 = this.f143111d;
            if (et4 != null) {
                aVar.mo74322i(1, et4.computeSize());
                this.f143111d.writeFields(aVar);
            }
            C89349b bVar = this.f143112e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            return 0;
        } else if (i == 1) {
            et4 et42 = this.f143111d;
            if (et42 != null) {
                i2 = 0 + C52418a.m58682i(1, et42.computeSize());
            }
            C89349b bVar2 = this.f143112e;
            return bVar2 != null ? i2 + C52418a.m58675b(2, bVar2) : i2;
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
            us4 us4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    et4 et43 = new et4();
                    if (bArr != null && bArr.length > 0) {
                        et43.parseFrom(bArr);
                    }
                    us4.f143111d = et43;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                us4.f143112e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
