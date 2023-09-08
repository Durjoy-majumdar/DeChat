package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class j85 extends C47465a {

    /* renamed from: d */
    public int f135929d;

    /* renamed from: e */
    public LinkedList<i85> f135930e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof j85)) {
            return false;
        }
        j85 j85 = (j85) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135929d), Integer.valueOf(j85.f135929d)) && C46238a.m51546a(this.f135930e, j85.f135930e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135929d);
            aVar.mo74320g(2, 8, this.f135930e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f135929d) + 0 + C52418a.m58680g(2, 8, this.f135930e);
        } else {
            if (i == 2) {
                this.f135930e.clear();
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
                j85 j85 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    j85.f135929d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        i85 i85 = new i85();
                        if (bArr != null && bArr.length > 0) {
                            i85.parseFrom(bArr);
                        }
                        j85.f135930e.add(i85);
                    }
                    return 0;
                }
            }
        }
    }
}
