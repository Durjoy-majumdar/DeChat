package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class dv4 extends C47465a {

    /* renamed from: d */
    public long f132547d;

    /* renamed from: e */
    public LinkedList<gv4> f132548e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof dv4)) {
            return false;
        }
        dv4 dv4 = (dv4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f132547d), Long.valueOf(dv4.f132547d)) && C46238a.m51546a(this.f132548e, dv4.f132548e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f132547d);
            aVar.mo74320g(2, 8, this.f132548e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f132547d) + 0 + C52418a.m58680g(2, 8, this.f132548e);
        } else {
            if (i == 2) {
                this.f132548e.clear();
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
                dv4 dv4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    dv4.f132547d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        gv4 gv4 = new gv4();
                        if (bArr != null && bArr.length > 0) {
                            gv4.parseFrom(bArr);
                        }
                        dv4.f132548e.add(gv4);
                    }
                    return 0;
                }
            }
        }
    }
}
