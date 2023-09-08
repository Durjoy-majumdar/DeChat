package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y72 */
public class C52079y72 extends C47465a {

    /* renamed from: d */
    public int f145154d;

    /* renamed from: e */
    public C51935x72 f145155e;

    /* renamed from: f */
    public int f145156f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52079y72)) {
            return false;
        }
        C52079y72 y722 = (C52079y72) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145154d), Integer.valueOf(y722.f145154d)) && C46238a.m51546a(this.f145155e, y722.f145155e) && C46238a.m51546a(Integer.valueOf(this.f145156f), Integer.valueOf(y722.f145156f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145154d);
            C51935x72 x722 = this.f145155e;
            if (x722 != null) {
                aVar.mo74322i(2, x722.computeSize());
                this.f145155e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f145156f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145154d) + 0;
            C51935x72 x723 = this.f145155e;
            if (x723 != null) {
                e += C52418a.m58682i(2, x723.computeSize());
            }
            return e + C52418a.m58678e(3, this.f145156f);
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
            C52079y72 y722 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                y722.f145154d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51935x72 x724 = new C51935x72();
                    if (bArr != null && bArr.length > 0) {
                        x724.parseFrom(bArr);
                    }
                    y722.f145155e = x724;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                y722.f145156f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
