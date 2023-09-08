package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ru */
public class C64690ru extends C47465a {

    /* renamed from: d */
    public LinkedList<C64297cu3> f185293d = new LinkedList<>();

    /* renamed from: e */
    public int f185294e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64690ru)) {
            return false;
        }
        C64690ru ruVar = (C64690ru) aVar;
        return C46238a.m51546a(this.f185293d, ruVar.f185293d) && C46238a.m51546a(Integer.valueOf(this.f185294e), Integer.valueOf(ruVar.f185294e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f185293d);
            aVar.mo74318e(2, this.f185294e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f185293d) + 0 + C52418a.m58678e(2, this.f185294e);
        } else {
            if (i == 2) {
                this.f185293d.clear();
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
                C64690ru ruVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64297cu3 cu32 = new C64297cu3();
                        if (bArr != null && bArr.length > 0) {
                            cu32.parseFrom(bArr);
                        }
                        ruVar.f185293d.add(cu32);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    ruVar.f185294e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
