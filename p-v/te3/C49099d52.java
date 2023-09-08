package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d52 */
public class C49099d52 extends C47465a implements r54 {

    /* renamed from: d */
    public int f132132d;

    /* renamed from: e */
    public C48676a73 f132133e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49099d52)) {
            return false;
        }
        C49099d52 d522 = (C49099d52) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132132d), Integer.valueOf(d522.f132132d)) && C46238a.m51546a(this.f132133e, d522.f132133e);
    }

    public final int getRet() {
        return this.f132132d;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132132d);
            C48676a73 a732 = this.f132133e;
            if (a732 != null) {
                aVar.mo74322i(2, a732.computeSize());
                this.f132133e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132132d) + 0;
            C48676a73 a733 = this.f132133e;
            return a733 != null ? e + C52418a.m58682i(2, a733.computeSize()) : e;
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
            C49099d52 d522 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d522.f132132d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C48676a73 a734 = new C48676a73();
                    if (bArr != null && bArr.length > 0) {
                        a734.parseFrom(bArr);
                    }
                    d522.f132133e = a734;
                }
                return 0;
            }
        }
    }
}
