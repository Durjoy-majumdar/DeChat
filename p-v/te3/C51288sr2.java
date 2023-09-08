package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sr2 */
public class C51288sr2 extends C47465a {

    /* renamed from: d */
    public String f141700d;

    /* renamed from: e */
    public int f141701e;

    /* renamed from: f */
    public String f141702f;

    /* renamed from: g */
    public String f141703g;

    /* renamed from: h */
    public String f141704h;

    /* renamed from: i */
    public int f141705i;

    /* renamed from: j */
    public String f141706j;

    /* renamed from: n */
    public int f141707n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51288sr2)) {
            return false;
        }
        C51288sr2 sr22 = (C51288sr2) aVar;
        return C46238a.m51546a(this.f141700d, sr22.f141700d) && C46238a.m51546a(Integer.valueOf(this.f141701e), Integer.valueOf(sr22.f141701e)) && C46238a.m51546a(this.f141702f, sr22.f141702f) && C46238a.m51546a(this.f141703g, sr22.f141703g) && C46238a.m51546a(this.f141704h, sr22.f141704h) && C46238a.m51546a(Integer.valueOf(this.f141705i), Integer.valueOf(sr22.f141705i)) && C46238a.m51546a(this.f141706j, sr22.f141706j) && C46238a.m51546a(Integer.valueOf(this.f141707n), Integer.valueOf(sr22.f141707n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141700d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f141701e);
            String str2 = this.f141702f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f141703g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f141704h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f141705i);
            String str5 = this.f141706j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f141707n);
            return 0;
        } else if (i == 1) {
            String str6 = this.f141700d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int e = i2 + C52418a.m58678e(2, this.f141701e);
            String str7 = this.f141702f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f141703g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f141704h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            int e2 = e + C52418a.m58678e(6, this.f141705i);
            String str10 = this.f141706j;
            if (str10 != null) {
                e2 += C52418a.m58683j(7, str10);
            }
            return e2 + C52418a.m58678e(8, this.f141707n);
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
            C51288sr2 sr22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    sr22.f141700d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    sr22.f141701e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    sr22.f141702f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    sr22.f141703g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sr22.f141704h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sr22.f141705i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    sr22.f141706j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    sr22.f141707n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
