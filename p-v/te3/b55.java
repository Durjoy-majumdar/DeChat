package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class b55 extends C47465a {

    /* renamed from: d */
    public LinkedList<C48847be3> f130960d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C49865il2> f130961e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof b55)) {
            return false;
        }
        b55 b55 = (b55) aVar;
        return C46238a.m51546a(this.f130960d, b55.f130960d) && C46238a.m51546a(this.f130961e, b55.f130961e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f130960d);
            aVar.mo74320g(2, 8, this.f130961e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f130960d) + 0 + C52418a.m58680g(2, 8, this.f130961e);
        } else {
            if (i == 2) {
                this.f130960d.clear();
                this.f130961e.clear();
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
                b55 b55 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C48847be3 be32 = new C48847be3();
                        if (bArr != null && bArr.length > 0) {
                            be32.parseFrom(bArr);
                        }
                        b55.f130960d.add(be32);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C49865il2 il22 = new C49865il2();
                        if (bArr2 != null && bArr2.length > 0) {
                            il22.parseFrom(bArr2);
                        }
                        b55.f130961e.add(il22);
                    }
                    return 0;
                }
            }
        }
    }
}
