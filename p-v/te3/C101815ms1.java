package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ms1 */
public class C101815ms1 extends C47465a {

    /* renamed from: d */
    public String f298867d;

    /* renamed from: e */
    public String f298868e;

    /* renamed from: f */
    public int f298869f;

    /* renamed from: g */
    public int f298870g;

    /* renamed from: h */
    public String f298871h;

    /* renamed from: i */
    public int f298872i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101815ms1)) {
            return false;
        }
        C101815ms1 ms12 = (C101815ms1) aVar;
        return C46238a.m51546a(this.f298867d, ms12.f298867d) && C46238a.m51546a(this.f298868e, ms12.f298868e) && C46238a.m51546a(Integer.valueOf(this.f298869f), Integer.valueOf(ms12.f298869f)) && C46238a.m51546a(Integer.valueOf(this.f298870g), Integer.valueOf(ms12.f298870g)) && C46238a.m51546a(this.f298871h, ms12.f298871h) && C46238a.m51546a(Integer.valueOf(this.f298872i), Integer.valueOf(ms12.f298872i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298867d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f298868e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f298869f);
            aVar.mo74318e(4, this.f298870g);
            String str3 = this.f298871h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f298872i);
            return 0;
        } else if (i == 1) {
            String str4 = this.f298867d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f298868e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f298869f) + C52418a.m58678e(4, this.f298870g);
            String str6 = this.f298871h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            return e + C52418a.m58678e(6, this.f298872i);
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
            C101815ms1 ms12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ms12.f298867d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ms12.f298868e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ms12.f298869f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ms12.f298870g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ms12.f298871h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ms12.f298872i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
