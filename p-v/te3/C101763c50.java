package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c50 */
public class C101763c50 extends C47465a {

    /* renamed from: d */
    public int f297999d;

    /* renamed from: e */
    public LinkedList<C110956b50> f298000e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101763c50)) {
            return false;
        }
        C101763c50 c502 = (C101763c50) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f297999d), Integer.valueOf(c502.f297999d)) && C46238a.m51546a(this.f298000e, c502.f298000e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f297999d);
            aVar.mo74320g(2, 8, this.f298000e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f297999d) + 0 + C52418a.m58680g(2, 8, this.f298000e);
        } else {
            if (i == 2) {
                this.f298000e.clear();
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
                C101763c50 c502 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    c502.f297999d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C110956b50 b502 = new C110956b50();
                        if (bArr != null && bArr.length > 0) {
                            b502.parseFrom(bArr);
                        }
                        c502.f298000e.add(b502);
                    }
                    return 0;
                }
            }
        }
    }
}
