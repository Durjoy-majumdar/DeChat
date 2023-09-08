package re3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.k */
public class C48021k extends C47465a {

    /* renamed from: d */
    public int f128805d;

    /* renamed from: e */
    public LinkedList<C48022l> f128806e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48021k)) {
            return false;
        }
        C48021k kVar = (C48021k) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f128805d), Integer.valueOf(kVar.f128805d)) && C46238a.m51546a(this.f128806e, kVar.f128806e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f128805d);
            aVar.mo74320g(2, 8, this.f128806e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f128805d) + 0 + C52418a.m58680g(2, 8, this.f128806e);
        } else {
            if (i == 2) {
                this.f128806e.clear();
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
                C48021k kVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    kVar.f128805d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C48022l lVar = new C48022l();
                        if (bArr != null && bArr.length > 0) {
                            lVar.parseFrom(bArr);
                        }
                        kVar.f128806e.add(lVar);
                    }
                    return 0;
                }
            }
        }
    }
}
