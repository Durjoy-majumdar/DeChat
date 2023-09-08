package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nm1 */
public class C64584nm1 extends C47465a {

    /* renamed from: d */
    public boolean f184495d;

    /* renamed from: e */
    public C64782vp3 f184496e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64584nm1)) {
            return false;
        }
        C64584nm1 nm12 = (C64584nm1) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f184495d), Boolean.valueOf(nm12.f184495d)) && C46238a.m51546a(this.f184496e, nm12.f184496e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f184495d);
            C64782vp3 vp32 = this.f184496e;
            if (vp32 != null) {
                aVar.mo74322i(4, vp32.computeSize());
                this.f184496e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f184495d) + 0;
            C64782vp3 vp33 = this.f184496e;
            return vp33 != null ? a + C52418a.m58682i(4, vp33.computeSize()) : a;
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
            C64584nm1 nm12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nm12.f184495d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64782vp3 vp34 = new C64782vp3();
                    if (bArr != null && bArr.length > 0) {
                        vp34.parseFrom(bArr);
                    }
                    nm12.f184496e = vp34;
                }
                return 0;
            }
        }
    }
}
