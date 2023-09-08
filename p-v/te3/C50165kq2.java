package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kq2 */
public class C50165kq2 extends C47465a {

    /* renamed from: d */
    public int f136987d;

    /* renamed from: e */
    public LinkedList<C49889is> f136988e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50165kq2)) {
            return false;
        }
        C50165kq2 kq22 = (C50165kq2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136987d), Integer.valueOf(kq22.f136987d)) && C46238a.m51546a(this.f136988e, kq22.f136988e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136987d);
            aVar.mo74320g(2, 8, this.f136988e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f136987d) + 0 + C52418a.m58680g(2, 8, this.f136988e);
        } else {
            if (i == 2) {
                this.f136988e.clear();
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
                C50165kq2 kq22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    kq22.f136987d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49889is isVar = new C49889is();
                        if (bArr != null && bArr.length > 0) {
                            isVar.parseFrom(bArr);
                        }
                        kq22.f136988e.add(isVar);
                    }
                    return 0;
                }
            }
        }
    }
}
