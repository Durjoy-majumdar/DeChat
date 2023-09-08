package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class x65 extends C47465a {

    /* renamed from: d */
    public int f144495d;

    /* renamed from: e */
    public C89349b f144496e;

    /* renamed from: f */
    public String f144497f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x65)) {
            return false;
        }
        x65 x65 = (x65) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144495d), Integer.valueOf(x65.f144495d)) && C46238a.m51546a(this.f144496e, x65.f144496e) && C46238a.m51546a(this.f144497f, x65.f144497f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144495d);
            C89349b bVar = this.f144496e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            String str = this.f144497f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f144495d) + 0;
            C89349b bVar2 = this.f144496e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            String str2 = this.f144497f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            x65 x65 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                x65.f144495d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                x65.f144496e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                x65.f144497f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
