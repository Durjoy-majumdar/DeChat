package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e53 */
public class C49238e53 extends C47465a {

    /* renamed from: d */
    public String f132704d;

    /* renamed from: e */
    public C51539uf3 f132705e;

    /* renamed from: f */
    public double f132706f;

    /* renamed from: g */
    public LinkedList<Double> f132707g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49238e53)) {
            return false;
        }
        C49238e53 e532 = (C49238e53) aVar;
        return C46238a.m51546a(this.f132704d, e532.f132704d) && C46238a.m51546a(this.f132705e, e532.f132705e) && C46238a.m51546a(Double.valueOf(this.f132706f), Double.valueOf(e532.f132706f)) && C46238a.m51546a(this.f132707g, e532.f132707g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132704d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C51539uf3 uf32 = this.f132705e;
            if (uf32 != null) {
                aVar.mo74322i(2, uf32.computeSize());
                this.f132705e.writeFields(aVar);
            }
            aVar.mo74316c(3, this.f132706f);
            aVar.mo74320g(4, 4, this.f132707g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f132704d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C51539uf3 uf33 = this.f132705e;
            if (uf33 != null) {
                i2 += C52418a.m58682i(2, uf33.computeSize());
            }
            return i2 + C52418a.m58676c(3, this.f132706f) + C52418a.m58680g(4, 4, this.f132707g);
        } else if (i == 2) {
            this.f132707g.clear();
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
            C49238e53 e532 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e532.f132704d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51539uf3 uf34 = new C51539uf3();
                    if (bArr != null && bArr.length > 0) {
                        uf34.parseFrom(bArr);
                    }
                    e532.f132705e = uf34;
                }
                return 0;
            } else if (intValue == 3) {
                e532.f132706f = aVar3.mo141627e(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                e532.f132707g.add(Double.valueOf(aVar3.mo141627e(intValue)));
                return 0;
            }
        }
    }
}
