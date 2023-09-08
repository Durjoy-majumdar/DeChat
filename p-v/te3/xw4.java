package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class xw4 extends C47465a {

    /* renamed from: d */
    public String f145007d;

    /* renamed from: e */
    public LinkedList<tw4> f145008e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xw4)) {
            return false;
        }
        xw4 xw4 = (xw4) aVar;
        return C46238a.m51546a(this.f145007d, xw4.f145007d) && C46238a.m51546a(this.f145008e, xw4.f145008e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145007d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f145008e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f145007d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f145008e);
        } else if (i == 2) {
            this.f145008e.clear();
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
            xw4 xw4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xw4.f145007d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    tw4 tw4 = new tw4();
                    if (bArr != null && bArr.length > 0) {
                        tw4.parseFrom(bArr);
                    }
                    xw4.f145008e.add(tw4);
                }
                return 0;
            }
        }
    }
}
