package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ff2 */
public class C49418ff2 extends C47465a {

    /* renamed from: d */
    public C51975xh2 f133476d;

    /* renamed from: e */
    public zf4 f133477e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49418ff2)) {
            return false;
        }
        C49418ff2 ff22 = (C49418ff2) aVar;
        return C46238a.m51546a(this.f133476d, ff22.f133476d) && C46238a.m51546a(this.f133477e, ff22.f133477e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51975xh2 xh22 = this.f133476d;
            if (xh22 != null) {
                aVar.mo74322i(1, xh22.computeSize());
                this.f133476d.writeFields(aVar);
            }
            zf4 zf4 = this.f133477e;
            if (zf4 != null) {
                aVar.mo74322i(2, zf4.computeSize());
                this.f133477e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C51975xh2 xh23 = this.f133476d;
            if (xh23 != null) {
                i2 = 0 + C52418a.m58682i(1, xh23.computeSize());
            }
            zf4 zf42 = this.f133477e;
            return zf42 != null ? i2 + C52418a.m58682i(2, zf42.computeSize()) : i2;
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
            C49418ff2 ff22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51975xh2 xh24 = new C51975xh2();
                    if (bArr != null && bArr.length > 0) {
                        xh24.parseFrom(bArr);
                    }
                    ff22.f133476d = xh24;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    zf4 zf43 = new zf4();
                    if (bArr2 != null && bArr2.length > 0) {
                        zf43.parseFrom(bArr2);
                    }
                    ff22.f133477e = zf43;
                }
                return 0;
            }
        }
    }
}
