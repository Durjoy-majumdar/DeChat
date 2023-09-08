package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ma3 */
public class C64549ma3 extends C47465a {

    /* renamed from: d */
    public String f184256d;

    /* renamed from: e */
    public C22507la3 f184257e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64549ma3)) {
            return false;
        }
        C64549ma3 ma32 = (C64549ma3) aVar;
        return C46238a.m51546a(this.f184256d, ma32.f184256d) && C46238a.m51546a(this.f184257e, ma32.f184257e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184256d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C22507la3 la32 = this.f184257e;
            if (la32 != null) {
                aVar.mo74322i(2, la32.computeSize());
                this.f184257e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f184256d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C22507la3 la33 = this.f184257e;
            return la33 != null ? i2 + C52418a.m58682i(2, la33.computeSize()) : i2;
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
            C64549ma3 ma32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ma32.f184256d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C22507la3 la34 = new C22507la3();
                    if (bArr != null && bArr.length > 0) {
                        la34.parseFrom(bArr);
                    }
                    ma32.f184257e = la34;
                }
                return 0;
            }
        }
    }
}
