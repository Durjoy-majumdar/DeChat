package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nc0 */
public class C64578nc0 extends C47465a {

    /* renamed from: d */
    public C64483k33 f184459d;

    /* renamed from: e */
    public int f184460e;

    /* renamed from: f */
    public int f184461f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64578nc0)) {
            return false;
        }
        C64578nc0 nc02 = (C64578nc0) aVar;
        return C46238a.m51546a(this.f184459d, nc02.f184459d) && C46238a.m51546a(Integer.valueOf(this.f184460e), Integer.valueOf(nc02.f184460e)) && C46238a.m51546a(Integer.valueOf(this.f184461f), Integer.valueOf(nc02.f184461f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64483k33 k332 = this.f184459d;
            if (k332 != null) {
                aVar.mo74322i(1, k332.computeSize());
                this.f184459d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f184460e);
            aVar.mo74318e(3, this.f184461f);
            return 0;
        } else if (i == 1) {
            C64483k33 k333 = this.f184459d;
            if (k333 != null) {
                i2 = 0 + C52418a.m58682i(1, k333.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f184460e) + C52418a.m58678e(3, this.f184461f);
        } else if (i == 2) {
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
            C64578nc0 nc02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64483k33 k334 = new C64483k33();
                    if (bArr != null && bArr.length > 0) {
                        k334.parseFrom(bArr);
                    }
                    nc02.f184459d = k334;
                }
                return 0;
            } else if (intValue == 2) {
                nc02.f184460e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                nc02.f184461f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
