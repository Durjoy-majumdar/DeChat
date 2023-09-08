package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wr1 */
public class C51868wr1 extends C47465a {

    /* renamed from: d */
    public int f144237d;

    /* renamed from: e */
    public C50868ps1 f144238e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51868wr1)) {
            return false;
        }
        C51868wr1 wr12 = (C51868wr1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144237d), Integer.valueOf(wr12.f144237d)) && C46238a.m51546a(this.f144238e, wr12.f144238e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144237d);
            C50868ps1 ps12 = this.f144238e;
            if (ps12 != null) {
                aVar.mo74322i(2, ps12.computeSize());
                this.f144238e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f144237d) + 0;
            C50868ps1 ps13 = this.f144238e;
            return ps13 != null ? e + C52418a.m58682i(2, ps13.computeSize()) : e;
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
            C51868wr1 wr12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wr12.f144237d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50868ps1 ps14 = new C50868ps1();
                    if (bArr != null && bArr.length > 0) {
                        ps14.parseFrom(bArr);
                    }
                    wr12.f144238e = ps14;
                }
                return 0;
            }
        }
    }
}
