package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r62 */
public class C64675r62 extends C47465a {

    /* renamed from: d */
    public String f185139d;

    /* renamed from: e */
    public int f185140e;

    /* renamed from: f */
    public int f185141f;

    /* renamed from: g */
    public String f185142g;

    /* renamed from: h */
    public int f185143h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64675r62)) {
            return false;
        }
        C64675r62 r622 = (C64675r62) aVar;
        return C46238a.m51546a(this.f185139d, r622.f185139d) && C46238a.m51546a(Integer.valueOf(this.f185140e), Integer.valueOf(r622.f185140e)) && C46238a.m51546a(Integer.valueOf(this.f185141f), Integer.valueOf(r622.f185141f)) && C46238a.m51546a(this.f185142g, r622.f185142g) && C46238a.m51546a(Integer.valueOf(this.f185143h), Integer.valueOf(r622.f185143h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185139d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f185140e);
            aVar.mo74318e(3, this.f185141f);
            String str2 = this.f185142g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f185143h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f185139d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f185140e) + C52418a.m58678e(3, this.f185141f);
            String str4 = this.f185142g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58678e(5, this.f185143h);
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
            C64675r62 r622 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                r622.f185139d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                r622.f185140e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                r622.f185141f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                r622.f185142g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                r622.f185143h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
