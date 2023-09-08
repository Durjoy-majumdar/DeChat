package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class rc4 extends C47465a {

    /* renamed from: d */
    public int f185149d;

    /* renamed from: e */
    public int f185150e;

    /* renamed from: f */
    public LinkedList<C64765v33> f185151f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof rc4)) {
            return false;
        }
        rc4 rc4 = (rc4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185149d), Integer.valueOf(rc4.f185149d)) && C46238a.m51546a(Integer.valueOf(this.f185150e), Integer.valueOf(rc4.f185150e)) && C46238a.m51546a(this.f185151f, rc4.f185151f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185149d);
            aVar.mo74318e(2, this.f185150e);
            aVar.mo74320g(3, 8, this.f185151f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f185149d) + 0 + C52418a.m58678e(2, this.f185150e) + C52418a.m58680g(3, 8, this.f185151f);
        } else {
            if (i == 2) {
                this.f185151f.clear();
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
                rc4 rc4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    rc4.f185149d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    rc4.f185150e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64765v33 v332 = new C64765v33();
                        if (bArr != null && bArr.length > 0) {
                            v332.parseFrom(bArr);
                        }
                        rc4.f185151f.add(v332);
                    }
                    return 0;
                }
            }
        }
    }
}
