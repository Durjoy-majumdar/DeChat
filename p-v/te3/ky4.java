package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ky4 extends C47465a {

    /* renamed from: d */
    public String f227783d;

    /* renamed from: e */
    public LinkedList<jy4> f227784e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ky4)) {
            return false;
        }
        ky4 ky4 = (ky4) aVar;
        return C46238a.m51546a(this.f227783d, ky4.f227783d) && C46238a.m51546a(this.f227784e, ky4.f227784e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227783d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f227784e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f227783d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f227784e);
        } else if (i == 2) {
            this.f227784e.clear();
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
            ky4 ky4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ky4.f227783d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    jy4 jy4 = new jy4();
                    if (bArr != null && bArr.length > 0) {
                        jy4.parseFrom(bArr);
                    }
                    ky4.f227784e.add(jy4);
                }
                return 0;
            }
        }
    }
}
