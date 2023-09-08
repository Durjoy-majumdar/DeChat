package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kz3 */
public class C64506kz3 extends C47465a {

    /* renamed from: d */
    public C64470jh3 f184006d;

    /* renamed from: e */
    public String f184007e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64506kz3)) {
            return false;
        }
        C64506kz3 kz32 = (C64506kz3) aVar;
        return C46238a.m51546a(this.f184006d, kz32.f184006d) && C46238a.m51546a(this.f184007e, kz32.f184007e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64470jh3 jh32 = this.f184006d;
            if (jh32 != null) {
                aVar.mo74322i(1, jh32.computeSize());
                this.f184006d.writeFields(aVar);
            }
            String str = this.f184007e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            C64470jh3 jh33 = this.f184006d;
            if (jh33 != null) {
                i2 = 0 + C52418a.m58682i(1, jh33.computeSize());
            }
            String str2 = this.f184007e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            C64506kz3 kz32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64470jh3 jh34 = new C64470jh3();
                    if (bArr != null && bArr.length > 0) {
                        jh34.parseFrom(bArr);
                    }
                    kz32.f184006d = jh34;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                kz32.f184007e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
