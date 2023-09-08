package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yf0 */
public class C52108yf0 extends C47465a {

    /* renamed from: d */
    public String f145256d;

    /* renamed from: e */
    public C52255zf0 f145257e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52108yf0)) {
            return false;
        }
        C52108yf0 yf02 = (C52108yf0) aVar;
        return C46238a.m51546a(this.f145256d, yf02.f145256d) && C46238a.m51546a(this.f145257e, yf02.f145257e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145256d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C52255zf0 zf02 = this.f145257e;
            if (zf02 != null) {
                aVar.mo74322i(2, zf02.computeSize());
                this.f145257e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f145256d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C52255zf0 zf03 = this.f145257e;
            return zf03 != null ? i2 + C52418a.m58682i(2, zf03.computeSize()) : i2;
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
            C52108yf0 yf02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yf02.f145256d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52255zf0 zf04 = new C52255zf0();
                    if (bArr != null && bArr.length > 0) {
                        zf04.parseFrom(bArr);
                    }
                    yf02.f145257e = zf04;
                }
                return 0;
            }
        }
    }
}
