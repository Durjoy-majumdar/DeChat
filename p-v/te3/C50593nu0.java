package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nu0 */
public class C50593nu0 extends C47465a {

    /* renamed from: d */
    public C49765hx0 f138776d;

    /* renamed from: e */
    public C89349b f138777e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50593nu0)) {
            return false;
        }
        C50593nu0 nu02 = (C50593nu0) aVar;
        return C46238a.m51546a(this.f138776d, nu02.f138776d) && C46238a.m51546a(this.f138777e, nu02.f138777e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49765hx0 hx02 = this.f138776d;
            if (hx02 != null) {
                aVar.mo74322i(1, hx02.computeSize());
                this.f138776d.writeFields(aVar);
            }
            C89349b bVar = this.f138777e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            return 0;
        } else if (i == 1) {
            C49765hx0 hx03 = this.f138776d;
            if (hx03 != null) {
                i2 = 0 + C52418a.m58682i(1, hx03.computeSize());
            }
            C89349b bVar2 = this.f138777e;
            return bVar2 != null ? i2 + C52418a.m58675b(2, bVar2) : i2;
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
            C50593nu0 nu02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49765hx0 hx04 = new C49765hx0();
                    if (bArr != null && bArr.length > 0) {
                        hx04.parseFrom(bArr);
                    }
                    nu02.f138776d = hx04;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                nu02.f138777e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
