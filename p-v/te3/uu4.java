package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class uu4 extends C47465a {

    /* renamed from: d */
    public int f143149d;

    /* renamed from: e */
    public LinkedList<tu4> f143150e = new LinkedList<>();

    /* renamed from: f */
    public int f143151f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof uu4)) {
            return false;
        }
        uu4 uu4 = (uu4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143149d), Integer.valueOf(uu4.f143149d)) && C46238a.m51546a(this.f143150e, uu4.f143150e) && C46238a.m51546a(Integer.valueOf(this.f143151f), Integer.valueOf(uu4.f143151f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143149d);
            aVar.mo74320g(2, 8, this.f143150e);
            aVar.mo74318e(3, this.f143151f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f143149d) + 0 + C52418a.m58680g(2, 8, this.f143150e) + C52418a.m58678e(3, this.f143151f);
        } else {
            if (i == 2) {
                this.f143150e.clear();
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
                uu4 uu4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    uu4.f143149d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        tu4 tu4 = new tu4();
                        if (bArr != null && bArr.length > 0) {
                            tu4.parseFrom(bArr);
                        }
                        uu4.f143150e.add(tu4);
                    }
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    uu4.f143151f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
