package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ld4 extends C47465a {

    /* renamed from: d */
    public String f184081d;

    /* renamed from: e */
    public int f184082e;

    /* renamed from: f */
    public int f184083f;

    /* renamed from: g */
    public int f184084g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ld4)) {
            return false;
        }
        ld4 ld4 = (ld4) aVar;
        return C46238a.m51546a(this.f184081d, ld4.f184081d) && C46238a.m51546a(Integer.valueOf(this.f184082e), Integer.valueOf(ld4.f184082e)) && C46238a.m51546a(Integer.valueOf(this.f184083f), Integer.valueOf(ld4.f184083f)) && C46238a.m51546a(Integer.valueOf(this.f184084g), Integer.valueOf(ld4.f184084g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184081d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f184082e);
            aVar.mo74318e(3, this.f184083f);
            aVar.mo74318e(4, this.f184084g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f184081d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f184082e) + C52418a.m58678e(3, this.f184083f) + C52418a.m58678e(4, this.f184084g);
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
            ld4 ld4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ld4.f184081d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ld4.f184082e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ld4.f184083f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ld4.f184084g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
