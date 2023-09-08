package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l13 */
public class C50203l13 extends C47465a {

    /* renamed from: d */
    public String f137128d;

    /* renamed from: e */
    public C64488kb1 f137129e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50203l13)) {
            return false;
        }
        C50203l13 l132 = (C50203l13) aVar;
        return C46238a.m51546a(this.f137128d, l132.f137128d) && C46238a.m51546a(this.f137129e, l132.f137129e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137128d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C64488kb1 kb12 = this.f137129e;
            if (kb12 != null) {
                aVar.mo74322i(2, kb12.computeSize());
                this.f137129e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f137128d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C64488kb1 kb13 = this.f137129e;
            return kb13 != null ? i2 + C52418a.m58682i(2, kb13.computeSize()) : i2;
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
            C50203l13 l132 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                l132.f137128d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64488kb1 kb14 = new C64488kb1();
                    if (bArr != null && bArr.length > 0) {
                        kb14.parseFrom(bArr);
                    }
                    l132.f137129e = kb14;
                }
                return 0;
            }
        }
    }
}
