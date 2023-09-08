package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ps1 */
public class C50868ps1 extends C47465a {

    /* renamed from: d */
    public int f139935d;

    /* renamed from: e */
    public int f139936e;

    /* renamed from: f */
    public LinkedList<C49218e20> f139937f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50868ps1)) {
            return false;
        }
        C50868ps1 ps12 = (C50868ps1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139935d), Integer.valueOf(ps12.f139935d)) && C46238a.m51546a(Integer.valueOf(this.f139936e), Integer.valueOf(ps12.f139936e)) && C46238a.m51546a(this.f139937f, ps12.f139937f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139935d);
            aVar.mo74318e(2, this.f139936e);
            aVar.mo74320g(3, 8, this.f139937f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f139935d) + 0 + C52418a.m58678e(2, this.f139936e) + C52418a.m58680g(3, 8, this.f139937f);
        } else {
            if (i == 2) {
                this.f139937f.clear();
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
                C50868ps1 ps12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ps12.f139935d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    ps12.f139936e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49218e20 e202 = new C49218e20();
                        if (bArr != null && bArr.length > 0) {
                            e202.parseFrom(bArr);
                        }
                        ps12.f139937f.add(e202);
                    }
                    return 0;
                }
            }
        }
    }
}
