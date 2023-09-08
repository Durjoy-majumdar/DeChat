package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b33 */
public class C48804b33 extends C47465a {

    /* renamed from: d */
    public C51975xh2 f130925d;

    /* renamed from: e */
    public zf4 f130926e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48804b33)) {
            return false;
        }
        C48804b33 b332 = (C48804b33) aVar;
        return C46238a.m51546a(this.f130925d, b332.f130925d) && C46238a.m51546a(this.f130926e, b332.f130926e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51975xh2 xh22 = this.f130925d;
            if (xh22 != null) {
                aVar.mo74322i(1, xh22.computeSize());
                this.f130925d.writeFields(aVar);
            }
            zf4 zf4 = this.f130926e;
            if (zf4 != null) {
                aVar.mo74322i(2, zf4.computeSize());
                this.f130926e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C51975xh2 xh23 = this.f130925d;
            if (xh23 != null) {
                i2 = 0 + C52418a.m58682i(1, xh23.computeSize());
            }
            zf4 zf42 = this.f130926e;
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
            C48804b33 b332 = objArr[1];
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
                    b332.f130925d = xh24;
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
                    b332.f130926e = zf43;
                }
                return 0;
            }
        }
    }
}
