package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sf3 */
public class C64710sf3 extends C47465a {

    /* renamed from: d */
    public int f185419d;

    /* renamed from: e */
    public int f185420e;

    /* renamed from: f */
    public LinkedList<ld4> f185421f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64710sf3)) {
            return false;
        }
        C64710sf3 sf32 = (C64710sf3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185419d), Integer.valueOf(sf32.f185419d)) && C46238a.m51546a(Integer.valueOf(this.f185420e), Integer.valueOf(sf32.f185420e)) && C46238a.m51546a(this.f185421f, sf32.f185421f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185419d);
            aVar.mo74318e(2, this.f185420e);
            aVar.mo74320g(3, 8, this.f185421f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f185419d) + 0 + C52418a.m58678e(2, this.f185420e) + C52418a.m58680g(3, 8, this.f185421f);
        } else {
            if (i == 2) {
                this.f185421f.clear();
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
                C64710sf3 sf32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    sf32.f185419d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    sf32.f185420e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        ld4 ld4 = new ld4();
                        if (bArr != null && bArr.length > 0) {
                            ld4.parseFrom(bArr);
                        }
                        sf32.f185421f.add(ld4);
                    }
                    return 0;
                }
            }
        }
    }
}
