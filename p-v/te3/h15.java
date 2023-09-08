package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class h15 extends C47465a {

    /* renamed from: d */
    public boolean f134408d;

    /* renamed from: e */
    public LinkedList<a15> f134409e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof h15)) {
            return false;
        }
        h15 h15 = (h15) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f134408d), Boolean.valueOf(h15.f134408d)) && C46238a.m51546a(this.f134409e, h15.f134409e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f134408d);
            aVar.mo74320g(2, 8, this.f134409e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f134408d) + 0 + C52418a.m58680g(2, 8, this.f134409e);
        } else {
            if (i == 2) {
                this.f134409e.clear();
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
                h15 h15 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    h15.f134408d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        a15 a15 = new a15();
                        if (bArr != null && bArr.length > 0) {
                            a15.parseFrom(bArr);
                        }
                        h15.f134409e.add(a15);
                    }
                    return 0;
                }
            }
        }
    }
}
