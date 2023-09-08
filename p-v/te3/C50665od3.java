package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.od3 */
public class C50665od3 extends C47465a {

    /* renamed from: d */
    public int f139098d;

    /* renamed from: e */
    public LinkedList<C50527nd3> f139099e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50665od3)) {
            return false;
        }
        C50665od3 od32 = (C50665od3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139098d), Integer.valueOf(od32.f139098d)) && C46238a.m51546a(this.f139099e, od32.f139099e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139098d);
            aVar.mo74320g(2, 8, this.f139099e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f139098d) + 0 + C52418a.m58680g(2, 8, this.f139099e);
        } else {
            if (i == 2) {
                this.f139099e.clear();
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
                C50665od3 od32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    od32.f139098d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50527nd3 nd32 = new C50527nd3();
                        if (bArr != null && bArr.length > 0) {
                            nd32.parseFrom(bArr);
                        }
                        od32.f139099e.add(nd32);
                    }
                    return 0;
                }
            }
        }
    }
}
