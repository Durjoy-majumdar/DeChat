package u41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.f */
public class C52426f extends C47465a {

    /* renamed from: d */
    public LinkedList<C52429i> f146515d = new LinkedList<>();

    /* renamed from: e */
    public long f146516e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52426f)) {
            return false;
        }
        C52426f fVar = (C52426f) aVar;
        return C46238a.m51546a(this.f146515d, fVar.f146515d) && C46238a.m51546a(Long.valueOf(this.f146516e), Long.valueOf(fVar.f146516e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f146515d);
            aVar.mo74321h(2, this.f146516e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f146515d) + 0 + C52418a.m58681h(2, this.f146516e);
        } else {
            if (i == 2) {
                this.f146515d.clear();
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
                C52426f fVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52429i iVar = new C52429i();
                        if (bArr != null && bArr.length > 0) {
                            iVar.parseFrom(bArr);
                        }
                        fVar.f146515d.add(iVar);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    fVar.f146516e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
