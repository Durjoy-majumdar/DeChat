package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cv3 */
public class C49054cv3 extends C47465a {

    /* renamed from: d */
    public int f131988d;

    /* renamed from: e */
    public LinkedList<C27676kv3> f131989e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49054cv3)) {
            return false;
        }
        C49054cv3 cv32 = (C49054cv3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131988d), Integer.valueOf(cv32.f131988d)) && C46238a.m51546a(this.f131989e, cv32.f131989e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131988d);
            aVar.mo74320g(2, 8, this.f131989e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f131988d) + 0 + C52418a.m58680g(2, 8, this.f131989e);
        } else {
            if (i == 2) {
                this.f131989e.clear();
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
                C49054cv3 cv32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    cv32.f131988d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C27676kv3 kv32 = new C27676kv3();
                        if (bArr != null && bArr.length > 0) {
                            kv32.parseFrom(bArr);
                        }
                        cv32.f131989e.add(kv32);
                    }
                    return 0;
                }
            }
        }
    }
}
