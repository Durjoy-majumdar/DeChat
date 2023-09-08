package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class l64 extends C47465a {

    /* renamed from: d */
    public long f137232d;

    /* renamed from: e */
    public C51163rv3 f137233e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof l64)) {
            return false;
        }
        l64 l64 = (l64) aVar;
        return C46238a.m51546a(Long.valueOf(this.f137232d), Long.valueOf(l64.f137232d)) && C46238a.m51546a(this.f137233e, l64.f137233e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f137232d);
            C51163rv3 rv32 = this.f137233e;
            if (rv32 != null) {
                aVar.mo74322i(2, rv32.computeSize());
                this.f137233e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f137232d) + 0;
            C51163rv3 rv33 = this.f137233e;
            return rv33 != null ? h + C52418a.m58682i(2, rv33.computeSize()) : h;
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
            l64 l64 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                l64.f137232d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51163rv3 rv34 = new C51163rv3();
                    if (bArr != null && bArr.length > 0) {
                        rv34.mo73356d(bArr);
                    }
                    l64.f137233e = rv34;
                }
                return 0;
            }
        }
    }
}
