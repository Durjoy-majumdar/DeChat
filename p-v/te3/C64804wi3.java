package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wi3 */
public class C64804wi3 extends C47465a {

    /* renamed from: d */
    public int f186123d;

    /* renamed from: e */
    public long f186124e;

    /* renamed from: f */
    public LinkedList<C64367fj3> f186125f = new LinkedList<>();

    /* renamed from: g */
    public int f186126g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64804wi3)) {
            return false;
        }
        C64804wi3 wi32 = (C64804wi3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186123d), Integer.valueOf(wi32.f186123d)) && C46238a.m51546a(Long.valueOf(this.f186124e), Long.valueOf(wi32.f186124e)) && C46238a.m51546a(this.f186125f, wi32.f186125f) && C46238a.m51546a(Integer.valueOf(this.f186126g), Integer.valueOf(wi32.f186126g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186123d);
            aVar.mo74321h(2, this.f186124e);
            aVar.mo74320g(3, 8, this.f186125f);
            aVar.mo74318e(4, this.f186126g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f186123d) + 0 + C52418a.m58681h(2, this.f186124e) + C52418a.m58680g(3, 8, this.f186125f) + C52418a.m58678e(4, this.f186126g);
        } else {
            if (i == 2) {
                this.f186125f.clear();
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
                C64804wi3 wi32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    wi32.f186123d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    wi32.f186124e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 3) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64367fj3 fj32 = new C64367fj3();
                        if (bArr != null && bArr.length > 0) {
                            fj32.parseFrom(bArr);
                        }
                        wi32.f186125f.add(fj32);
                    }
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    wi32.f186126g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
