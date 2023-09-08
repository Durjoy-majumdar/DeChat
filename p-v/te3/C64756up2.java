package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.up2 */
public class C64756up2 extends C47465a {

    /* renamed from: d */
    public String f185782d;

    /* renamed from: e */
    public C64274c60 f185783e;

    /* renamed from: f */
    public int f185784f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64756up2)) {
            return false;
        }
        C64756up2 up22 = (C64756up2) aVar;
        return C46238a.m51546a(this.f185782d, up22.f185782d) && C46238a.m51546a(this.f185783e, up22.f185783e) && C46238a.m51546a(Integer.valueOf(this.f185784f), Integer.valueOf(up22.f185784f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185782d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C64274c60 c602 = this.f185783e;
            if (c602 != null) {
                aVar.mo74322i(2, c602.computeSize());
                this.f185783e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f185784f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f185782d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C64274c60 c603 = this.f185783e;
            if (c603 != null) {
                i2 += C52418a.m58682i(2, c603.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f185784f);
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
            C64756up2 up22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                up22.f185782d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64274c60 c604 = new C64274c60();
                    if (bArr != null && bArr.length > 0) {
                        c604.parseFrom(bArr);
                    }
                    up22.f185783e = c604;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                up22.f185784f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
