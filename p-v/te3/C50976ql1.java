package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ql1 */
public class C50976ql1 extends C47465a {

    /* renamed from: d */
    public int f140379d;

    /* renamed from: e */
    public C52133yl1 f140380e;

    /* renamed from: f */
    public C50159kp0 f140381f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50976ql1)) {
            return false;
        }
        C50976ql1 ql12 = (C50976ql1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140379d), Integer.valueOf(ql12.f140379d)) && C46238a.m51546a(this.f140380e, ql12.f140380e) && C46238a.m51546a(this.f140381f, ql12.f140381f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140379d);
            C52133yl1 yl12 = this.f140380e;
            if (yl12 != null) {
                aVar.mo74322i(2, yl12.computeSize());
                this.f140380e.writeFields(aVar);
            }
            C50159kp0 kp02 = this.f140381f;
            if (kp02 != null) {
                aVar.mo74322i(3, kp02.computeSize());
                this.f140381f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140379d) + 0;
            C52133yl1 yl13 = this.f140380e;
            if (yl13 != null) {
                e += C52418a.m58682i(2, yl13.computeSize());
            }
            C50159kp0 kp03 = this.f140381f;
            return kp03 != null ? e + C52418a.m58682i(3, kp03.computeSize()) : e;
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
            C50976ql1 ql12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ql12.f140379d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52133yl1 yl14 = new C52133yl1();
                    if (bArr != null && bArr.length > 0) {
                        yl14.parseFrom(bArr);
                    }
                    ql12.f140380e = yl14;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50159kp0 kp04 = new C50159kp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kp04.parseFrom(bArr2);
                    }
                    ql12.f140381f = kp04;
                }
                return 0;
            }
        }
    }
}
