package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ft4 extends C47465a {

    /* renamed from: d */
    public et4 f133679d;

    /* renamed from: e */
    public int f133680e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ft4)) {
            return false;
        }
        ft4 ft4 = (ft4) aVar;
        return C46238a.m51546a(this.f133679d, ft4.f133679d) && C46238a.m51546a(Integer.valueOf(this.f133680e), Integer.valueOf(ft4.f133680e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            et4 et4 = this.f133679d;
            if (et4 != null) {
                aVar.mo74322i(1, et4.computeSize());
                this.f133679d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f133680e);
            return 0;
        } else if (i == 1) {
            et4 et42 = this.f133679d;
            if (et42 != null) {
                i2 = 0 + C52418a.m58682i(1, et42.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f133680e);
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
            ft4 ft4 = objArr[1];
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
                    ft4.f133679d = et43;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                ft4.f133680e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
