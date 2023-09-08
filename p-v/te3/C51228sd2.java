package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sd2 */
public class C51228sd2 extends C47465a {

    /* renamed from: d */
    public C50767p11 f141447d;

    /* renamed from: e */
    public int f141448e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51228sd2)) {
            return false;
        }
        C51228sd2 sd22 = (C51228sd2) aVar;
        return C46238a.m51546a(this.f141447d, sd22.f141447d) && C46238a.m51546a(Integer.valueOf(this.f141448e), Integer.valueOf(sd22.f141448e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50767p11 p112 = this.f141447d;
            if (p112 != null) {
                aVar.mo74322i(1, p112.computeSize());
                this.f141447d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f141448e);
            return 0;
        } else if (i == 1) {
            C50767p11 p113 = this.f141447d;
            if (p113 != null) {
                i2 = 0 + C52418a.m58682i(1, p113.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f141448e);
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
            C51228sd2 sd22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50767p11 p114 = new C50767p11();
                    if (bArr != null && bArr.length > 0) {
                        p114.parseFrom(bArr);
                    }
                    sd22.f141447d = p114;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                sd22.f141448e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
