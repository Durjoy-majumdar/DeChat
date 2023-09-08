package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nf3 */
public class C50536nf3 extends C47465a {

    /* renamed from: d */
    public boolean f138583d;

    /* renamed from: e */
    public C51643v40 f138584e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50536nf3)) {
            return false;
        }
        C50536nf3 nf32 = (C50536nf3) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f138583d), Boolean.valueOf(nf32.f138583d)) && C46238a.m51546a(this.f138584e, nf32.f138584e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f138583d);
            C51643v40 v402 = this.f138584e;
            if (v402 != null) {
                aVar.mo74322i(2, v402.computeSize());
                this.f138584e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f138583d) + 0;
            C51643v40 v403 = this.f138584e;
            return v403 != null ? a + C52418a.m58682i(2, v403.computeSize()) : a;
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
            C50536nf3 nf32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nf32.f138583d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51643v40 v404 = new C51643v40();
                    if (bArr != null && bArr.length > 0) {
                        v404.parseFrom(bArr);
                    }
                    nf32.f138584e = v404;
                }
                return 0;
            }
        }
    }
}
