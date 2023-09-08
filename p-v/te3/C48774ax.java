package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ax */
public class C48774ax extends C47465a {

    /* renamed from: d */
    public int f130811d;

    /* renamed from: e */
    public LinkedList<C52315zw> f130812e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48774ax)) {
            return false;
        }
        C48774ax axVar = (C48774ax) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130811d), Integer.valueOf(axVar.f130811d)) && C46238a.m51546a(this.f130812e, axVar.f130812e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130811d);
            aVar.mo74320g(2, 8, this.f130812e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f130811d) + 0 + C52418a.m58680g(2, 8, this.f130812e);
        } else {
            if (i == 2) {
                this.f130812e.clear();
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
                C48774ax axVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    axVar.f130811d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52315zw zwVar = new C52315zw();
                        if (bArr != null && bArr.length > 0) {
                            zwVar.parseFrom(bArr);
                        }
                        axVar.f130812e.add(zwVar);
                    }
                    return 0;
                }
            }
        }
    }
}
