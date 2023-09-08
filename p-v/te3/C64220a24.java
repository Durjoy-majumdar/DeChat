package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a24 */
public class C64220a24 extends C47465a {

    /* renamed from: d */
    public boolean f182010d = true;

    /* renamed from: e */
    public LinkedList<C64250b24> f182011e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64220a24)) {
            return false;
        }
        C64220a24 a242 = (C64220a24) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f182010d), Boolean.valueOf(a242.f182010d)) && C46238a.m51546a(this.f182011e, a242.f182011e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f182010d);
            aVar.mo74320g(2, 8, this.f182011e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f182010d) + 0 + C52418a.m58680g(2, 8, this.f182011e);
        } else {
            if (i == 2) {
                this.f182011e.clear();
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
                C64220a24 a242 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    a242.f182010d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64250b24 b242 = new C64250b24();
                        if (bArr != null && bArr.length > 0) {
                            b242.parseFrom(bArr);
                        }
                        a242.f182011e.add(b242);
                    }
                    return 0;
                }
            }
        }
    }
}
