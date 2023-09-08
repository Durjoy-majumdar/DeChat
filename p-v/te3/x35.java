package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class x35 extends C47465a {

    /* renamed from: d */
    public int f144434d;

    /* renamed from: e */
    public LinkedList<String> f144435e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<w35> f144436f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x35)) {
            return false;
        }
        x35 x35 = (x35) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144434d), Integer.valueOf(x35.f144434d)) && C46238a.m51546a(this.f144435e, x35.f144435e) && C46238a.m51546a(this.f144436f, x35.f144436f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144434d);
            aVar.mo74320g(2, 1, this.f144435e);
            aVar.mo74320g(3, 8, this.f144436f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f144434d) + 0 + C52418a.m58680g(2, 1, this.f144435e) + C52418a.m58680g(3, 8, this.f144436f);
        } else {
            if (i == 2) {
                this.f144435e.clear();
                this.f144436f.clear();
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
                x35 x35 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    x35.f144434d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    x35.f144435e.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        w35 w35 = new w35();
                        if (bArr != null && bArr.length > 0) {
                            w35.parseFrom(bArr);
                        }
                        x35.f144436f.add(w35);
                    }
                    return 0;
                }
            }
        }
    }
}
