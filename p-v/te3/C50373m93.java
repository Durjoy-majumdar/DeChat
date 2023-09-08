package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m93 */
public class C50373m93 extends C47465a {

    /* renamed from: d */
    public int f137920d;

    /* renamed from: e */
    public C49521g61 f137921e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50373m93)) {
            return false;
        }
        C50373m93 m932 = (C50373m93) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137920d), Integer.valueOf(m932.f137920d)) && C46238a.m51546a(this.f137921e, m932.f137921e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137920d);
            C49521g61 g612 = this.f137921e;
            if (g612 != null) {
                aVar.mo74322i(2, g612.computeSize());
                this.f137921e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f137920d) + 0;
            C49521g61 g613 = this.f137921e;
            return g613 != null ? e + C52418a.m58682i(2, g613.computeSize()) : e;
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
            C50373m93 m932 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m932.f137920d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49521g61 g614 = new C49521g61();
                    if (bArr != null && bArr.length > 0) {
                        g614.parseFrom(bArr);
                    }
                    m932.f137921e = g614;
                }
                return 0;
            }
        }
    }
}
