package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ar3 */
public class C48754ar3 extends C47465a {

    /* renamed from: d */
    public String f130743d;

    /* renamed from: e */
    public C77935gl2 f130744e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48754ar3)) {
            return false;
        }
        C48754ar3 ar32 = (C48754ar3) aVar;
        return C46238a.m51546a(this.f130743d, ar32.f130743d) && C46238a.m51546a(this.f130744e, ar32.f130744e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130743d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C77935gl2 gl22 = this.f130744e;
            if (gl22 != null) {
                aVar.mo74322i(2, gl22.computeSize());
                this.f130744e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f130743d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C77935gl2 gl23 = this.f130744e;
            return gl23 != null ? i2 + C52418a.m58682i(2, gl23.computeSize()) : i2;
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
            C48754ar3 ar32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ar32.f130743d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C77935gl2 gl24 = new C77935gl2();
                    if (bArr != null && bArr.length > 0) {
                        gl24.parseFrom(bArr);
                    }
                    ar32.f130744e = gl24;
                }
                return 0;
            }
        }
    }
}
