package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ws2 */
public class C64815ws2 extends C47465a {

    /* renamed from: d */
    public String f186203d;

    /* renamed from: e */
    public String f186204e;

    /* renamed from: f */
    public int f186205f;

    /* renamed from: g */
    public int f186206g;

    /* renamed from: h */
    public int f186207h;

    /* renamed from: i */
    public int f186208i;

    /* renamed from: j */
    public int f186209j;

    /* renamed from: n */
    public String f186210n;

    /* renamed from: o */
    public int f186211o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64815ws2)) {
            return false;
        }
        C64815ws2 ws22 = (C64815ws2) aVar;
        return C46238a.m51546a(this.f186203d, ws22.f186203d) && C46238a.m51546a(this.f186204e, ws22.f186204e) && C46238a.m51546a(Integer.valueOf(this.f186205f), Integer.valueOf(ws22.f186205f)) && C46238a.m51546a(Integer.valueOf(this.f186206g), Integer.valueOf(ws22.f186206g)) && C46238a.m51546a(Integer.valueOf(this.f186207h), Integer.valueOf(ws22.f186207h)) && C46238a.m51546a(Integer.valueOf(this.f186208i), Integer.valueOf(ws22.f186208i)) && C46238a.m51546a(Integer.valueOf(this.f186209j), Integer.valueOf(ws22.f186209j)) && C46238a.m51546a(this.f186210n, ws22.f186210n) && C46238a.m51546a(Integer.valueOf(this.f186211o), Integer.valueOf(ws22.f186211o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186203d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186204e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f186205f);
            aVar.mo74318e(4, this.f186206g);
            aVar.mo74318e(5, this.f186207h);
            aVar.mo74318e(6, this.f186208i);
            aVar.mo74318e(7, this.f186209j);
            String str3 = this.f186210n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            aVar.mo74318e(9, this.f186211o);
            return 0;
        } else if (i == 1) {
            String str4 = this.f186203d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f186204e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f186205f) + C52418a.m58678e(4, this.f186206g) + C52418a.m58678e(5, this.f186207h) + C52418a.m58678e(6, this.f186208i) + C52418a.m58678e(7, this.f186209j);
            String str6 = this.f186210n;
            if (str6 != null) {
                e += C52418a.m58683j(8, str6);
            }
            return e + C52418a.m58678e(9, this.f186211o);
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
            C64815ws2 ws22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ws22.f186203d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ws22.f186204e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ws22.f186205f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ws22.f186206g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ws22.f186207h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ws22.f186208i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ws22.f186209j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ws22.f186210n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ws22.f186211o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
