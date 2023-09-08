package w52;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: w52.h */
public class C53080h extends C47465a {

    /* renamed from: d */
    public int f148146d;

    /* renamed from: e */
    public LinkedList<C53079g> f148147e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53080h)) {
            return false;
        }
        C53080h hVar = (C53080h) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f148146d), Integer.valueOf(hVar.f148146d)) && C46238a.m51546a(this.f148147e, hVar.f148147e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f148146d);
            aVar.mo74320g(2, 8, this.f148147e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f148146d) + 0 + C52418a.m58680g(2, 8, this.f148147e);
        } else {
            if (i == 2) {
                this.f148147e.clear();
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
                C53080h hVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    hVar.f148146d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C53079g gVar = new C53079g();
                        if (bArr != null && bArr.length > 0) {
                            gVar.parseFrom(bArr);
                        }
                        hVar.f148147e.add(gVar);
                    }
                    return 0;
                }
            }
        }
    }
}
