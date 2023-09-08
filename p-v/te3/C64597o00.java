package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o00 */
public class C64597o00 extends C47465a {

    /* renamed from: d */
    public String f184599d;

    /* renamed from: e */
    public LinkedList<C22502jn> f184600e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64597o00)) {
            return false;
        }
        C64597o00 o002 = (C64597o00) aVar;
        return C46238a.m51546a(this.f184599d, o002.f184599d) && C46238a.m51546a(this.f184600e, o002.f184600e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184599d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f184600e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f184599d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f184600e);
        } else if (i == 2) {
            this.f184600e.clear();
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
            C64597o00 o002 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                o002.f184599d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C22502jn jnVar = new C22502jn();
                    if (bArr != null && bArr.length > 0) {
                        jnVar.parseFrom(bArr);
                    }
                    o002.f184600e.add(jnVar);
                }
                return 0;
            }
        }
    }
}
