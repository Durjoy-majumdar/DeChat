package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class fy4 extends C47465a {

    /* renamed from: d */
    public int f133746d;

    /* renamed from: e */
    public gy4 f133747e;

    /* renamed from: f */
    public hy4 f133748f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof fy4)) {
            return false;
        }
        fy4 fy4 = (fy4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133746d), Integer.valueOf(fy4.f133746d)) && C46238a.m51546a(this.f133747e, fy4.f133747e) && C46238a.m51546a(this.f133748f, fy4.f133748f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133746d);
            gy4 gy4 = this.f133747e;
            if (gy4 != null) {
                aVar.mo74322i(2, gy4.computeSize());
                this.f133747e.writeFields(aVar);
            }
            hy4 hy4 = this.f133748f;
            if (hy4 != null) {
                aVar.mo74322i(3, hy4.computeSize());
                this.f133748f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f133746d) + 0;
            gy4 gy42 = this.f133747e;
            if (gy42 != null) {
                e += C52418a.m58682i(2, gy42.computeSize());
            }
            hy4 hy42 = this.f133748f;
            return hy42 != null ? e + C52418a.m58682i(3, hy42.computeSize()) : e;
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
            fy4 fy4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fy4.f133746d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    gy4 gy43 = new gy4();
                    if (bArr != null && bArr.length > 0) {
                        gy43.parseFrom(bArr);
                    }
                    fy4.f133747e = gy43;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    hy4 hy43 = new hy4();
                    if (bArr2 != null && bArr2.length > 0) {
                        hy43.parseFrom(bArr2);
                    }
                    fy4.f133748f = hy43;
                }
                return 0;
            }
        }
    }
}
