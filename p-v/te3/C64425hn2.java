package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hn2 */
public class C64425hn2 extends C47465a {

    /* renamed from: d */
    public int f183518d = 0;

    /* renamed from: e */
    public C64483k33 f183519e;

    /* renamed from: f */
    public C64474jn2 f183520f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64425hn2)) {
            return false;
        }
        C64425hn2 hn22 = (C64425hn2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183518d), Integer.valueOf(hn22.f183518d)) && C46238a.m51546a(this.f183519e, hn22.f183519e) && C46238a.m51546a(this.f183520f, hn22.f183520f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183518d);
            C64483k33 k332 = this.f183519e;
            if (k332 != null) {
                aVar.mo74322i(2, k332.computeSize());
                this.f183519e.writeFields(aVar);
            }
            C64474jn2 jn22 = this.f183520f;
            if (jn22 != null) {
                aVar.mo74322i(3, jn22.computeSize());
                this.f183520f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183518d) + 0;
            C64483k33 k333 = this.f183519e;
            if (k333 != null) {
                e += C52418a.m58682i(2, k333.computeSize());
            }
            C64474jn2 jn23 = this.f183520f;
            return jn23 != null ? e + C52418a.m58682i(3, jn23.computeSize()) : e;
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
            C64425hn2 hn22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hn22.f183518d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64483k33 k334 = new C64483k33();
                    if (bArr != null && bArr.length > 0) {
                        k334.parseFrom(bArr);
                    }
                    hn22.f183519e = k334;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C64474jn2 jn24 = new C64474jn2();
                    if (bArr2 != null && bArr2.length > 0) {
                        jn24.parseFrom(bArr2);
                    }
                    hn22.f183520f = jn24;
                }
                return 0;
            }
        }
    }
}
