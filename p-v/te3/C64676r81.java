package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r81 */
public class C64676r81 extends C47465a {

    /* renamed from: d */
    public int f185144d;

    /* renamed from: e */
    public String f185145e;

    /* renamed from: f */
    public C64426ho2 f185146f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64676r81)) {
            return false;
        }
        C64676r81 r812 = (C64676r81) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185144d), Integer.valueOf(r812.f185144d)) && C46238a.m51546a(this.f185145e, r812.f185145e) && C46238a.m51546a(this.f185146f, r812.f185146f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185144d);
            String str = this.f185145e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C64426ho2 ho22 = this.f185146f;
            if (ho22 != null) {
                aVar.mo74322i(3, ho22.computeSize());
                this.f185146f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f185144d) + 0;
            String str2 = this.f185145e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            C64426ho2 ho23 = this.f185146f;
            return ho23 != null ? e + C52418a.m58682i(3, ho23.computeSize()) : e;
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
            C64676r81 r812 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                r812.f185144d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                r812.f185145e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64426ho2 ho24 = new C64426ho2();
                    if (bArr != null && bArr.length > 0) {
                        ho24.parseFrom(bArr);
                    }
                    r812.f185146f = ho24;
                }
                return 0;
            }
        }
    }
}
