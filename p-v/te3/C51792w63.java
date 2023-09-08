package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w63 */
public class C51792w63 extends C47465a {

    /* renamed from: d */
    public LinkedList<C52224z63> f143893d = new LinkedList<>();

    /* renamed from: e */
    public int f143894e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51792w63)) {
            return false;
        }
        C51792w63 w632 = (C51792w63) aVar;
        return C46238a.m51546a(this.f143893d, w632.f143893d) && C46238a.m51546a(Integer.valueOf(this.f143894e), Integer.valueOf(w632.f143894e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f143893d);
            aVar.mo74318e(2, this.f143894e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f143893d) + 0 + C52418a.m58678e(2, this.f143894e);
        } else {
            if (i == 2) {
                this.f143893d.clear();
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
                C51792w63 w632 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52224z63 z632 = new C52224z63();
                        if (bArr != null && bArr.length > 0) {
                            z632.parseFrom(bArr);
                        }
                        w632.f143893d.add(z632);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    w632.f143894e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
