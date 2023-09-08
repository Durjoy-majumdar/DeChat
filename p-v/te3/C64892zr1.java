package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zr1 */
public class C64892zr1 extends C47465a {

    /* renamed from: d */
    public int f186839d;

    /* renamed from: e */
    public String f186840e;

    /* renamed from: f */
    public int f186841f;

    /* renamed from: g */
    public int f186842g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64892zr1)) {
            return false;
        }
        C64892zr1 zr12 = (C64892zr1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186839d), Integer.valueOf(zr12.f186839d)) && C46238a.m51546a(this.f186840e, zr12.f186840e) && C46238a.m51546a(Integer.valueOf(this.f186841f), Integer.valueOf(zr12.f186841f)) && C46238a.m51546a(Integer.valueOf(this.f186842g), Integer.valueOf(zr12.f186842g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186839d);
            String str = this.f186840e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f186841f);
            aVar.mo74318e(4, this.f186842g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186839d) + 0;
            String str2 = this.f186840e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58678e(3, this.f186841f) + C52418a.m58678e(4, this.f186842g);
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
            C64892zr1 zr12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zr12.f186839d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                zr12.f186840e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                zr12.f186841f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                zr12.f186842g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
