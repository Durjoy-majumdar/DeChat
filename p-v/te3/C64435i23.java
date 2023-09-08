package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i23 */
public class C64435i23 extends C47465a {

    /* renamed from: d */
    public int f183594d;

    /* renamed from: e */
    public C64511l23 f183595e;

    /* renamed from: f */
    public C49933j23 f183596f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64435i23)) {
            return false;
        }
        C64435i23 i232 = (C64435i23) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183594d), Integer.valueOf(i232.f183594d)) && C46238a.m51546a(this.f183595e, i232.f183595e) && C46238a.m51546a(this.f183596f, i232.f183596f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183594d);
            C64511l23 l232 = this.f183595e;
            if (l232 != null) {
                aVar.mo74322i(2, l232.computeSize());
                this.f183595e.writeFields(aVar);
            }
            C49933j23 j232 = this.f183596f;
            if (j232 != null) {
                aVar.mo74322i(101, j232.computeSize());
                this.f183596f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183594d) + 0;
            C64511l23 l233 = this.f183595e;
            if (l233 != null) {
                e += C52418a.m58682i(2, l233.computeSize());
            }
            C49933j23 j233 = this.f183596f;
            return j233 != null ? e + C52418a.m58682i(101, j233.computeSize()) : e;
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
            C64435i23 i232 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i232.f183594d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64511l23 l234 = new C64511l23();
                    if (bArr != null && bArr.length > 0) {
                        l234.parseFrom(bArr);
                    }
                    i232.f183595e = l234;
                }
                return 0;
            } else if (intValue != 101) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49933j23 j234 = new C49933j23();
                    if (bArr2 != null && bArr2.length > 0) {
                        j234.parseFrom(bArr2);
                    }
                    i232.f183596f = j234;
                }
                return 0;
            }
        }
    }
}
