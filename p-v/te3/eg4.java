package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class eg4 extends C47465a {

    /* renamed from: d */
    public boolean f182950d;

    /* renamed from: e */
    public C64623p81 f182951e;

    /* renamed from: f */
    public int f182952f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof eg4)) {
            return false;
        }
        eg4 eg4 = (eg4) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f182950d), Boolean.valueOf(eg4.f182950d)) && C46238a.m51546a(this.f182951e, eg4.f182951e) && C46238a.m51546a(Integer.valueOf(this.f182952f), Integer.valueOf(eg4.f182952f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f182950d);
            C64623p81 p812 = this.f182951e;
            if (p812 != null) {
                aVar.mo74322i(2, p812.computeSize());
                this.f182951e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f182952f);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f182950d) + 0;
            C64623p81 p813 = this.f182951e;
            if (p813 != null) {
                a += C52418a.m58682i(2, p813.computeSize());
            }
            return a + C52418a.m58678e(3, this.f182952f);
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
            eg4 eg4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                eg4.f182950d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64623p81 p814 = new C64623p81();
                    if (bArr != null && bArr.length > 0) {
                        p814.parseFrom(bArr);
                    }
                    eg4.f182951e = p814;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                eg4.f182952f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
