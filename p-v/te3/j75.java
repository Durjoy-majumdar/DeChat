package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class j75 extends C47465a {

    /* renamed from: d */
    public e75 f135915d;

    /* renamed from: e */
    public String f135916e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof j75)) {
            return false;
        }
        j75 j75 = (j75) aVar;
        return C46238a.m51546a(this.f135915d, j75.f135915d) && C46238a.m51546a(this.f135916e, j75.f135916e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            e75 e75 = this.f135915d;
            if (e75 != null) {
                aVar.mo74322i(1, e75.computeSize());
                this.f135915d.writeFields(aVar);
            }
            String str = this.f135916e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            e75 e752 = this.f135915d;
            if (e752 != null) {
                i2 = 0 + C52418a.m58682i(1, e752.computeSize());
            }
            String str2 = this.f135916e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            j75 j75 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    e75 e753 = new e75();
                    if (bArr != null && bArr.length > 0) {
                        e753.parseFrom(bArr);
                    }
                    j75.f135915d = e753;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                j75.f135916e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
