package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cu3 */
public class C64297cu3 extends C47465a {

    /* renamed from: d */
    public int f182568d;

    /* renamed from: e */
    public LinkedList<C64245au3> f182569e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64297cu3)) {
            return false;
        }
        C64297cu3 cu32 = (C64297cu3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182568d), Integer.valueOf(cu32.f182568d)) && C46238a.m51546a(this.f182569e, cu32.f182569e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182568d);
            aVar.mo74320g(2, 8, this.f182569e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f182568d) + 0 + C52418a.m58680g(2, 8, this.f182569e);
        } else {
            if (i == 2) {
                this.f182569e.clear();
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
                C64297cu3 cu32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    cu32.f182568d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64245au3 au32 = new C64245au3();
                        if (bArr != null && bArr.length > 0) {
                            au32.parseFrom(bArr);
                        }
                        cu32.f182569e.add(au32);
                    }
                    return 0;
                }
            }
        }
    }
}
