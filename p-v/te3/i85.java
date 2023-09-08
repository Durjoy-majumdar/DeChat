package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class i85 extends C47465a {

    /* renamed from: d */
    public int f135172d;

    /* renamed from: e */
    public int f135173e;

    /* renamed from: f */
    public LinkedList<C50981qm2> f135174f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof i85)) {
            return false;
        }
        i85 i85 = (i85) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135172d), Integer.valueOf(i85.f135172d)) && C46238a.m51546a(Integer.valueOf(this.f135173e), Integer.valueOf(i85.f135173e)) && C46238a.m51546a(this.f135174f, i85.f135174f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135172d);
            aVar.mo74318e(2, this.f135173e);
            aVar.mo74320g(3, 8, this.f135174f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f135172d) + 0 + C52418a.m58678e(2, this.f135173e) + C52418a.m58680g(3, 8, this.f135174f);
        } else {
            if (i == 2) {
                this.f135174f.clear();
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
                i85 i85 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    i85.f135172d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    i85.f135173e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50981qm2 qm22 = new C50981qm2();
                        if (bArr != null && bArr.length > 0) {
                            qm22.parseFrom(bArr);
                        }
                        i85.f135174f.add(qm22);
                    }
                    return 0;
                }
            }
        }
    }
}
