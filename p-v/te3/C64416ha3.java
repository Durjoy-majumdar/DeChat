package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ha3 */
public class C64416ha3 extends C47465a {

    /* renamed from: d */
    public String f183446d;

    /* renamed from: e */
    public String f183447e;

    /* renamed from: f */
    public String f183448f;

    /* renamed from: g */
    public String f183449g;

    /* renamed from: h */
    public String f183450h;

    /* renamed from: i */
    public String f183451i;

    /* renamed from: j */
    public int f183452j;

    /* renamed from: n */
    public int f183453n;

    /* renamed from: o */
    public int f183454o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64416ha3)) {
            return false;
        }
        C64416ha3 ha32 = (C64416ha3) aVar;
        return C46238a.m51546a(this.f183446d, ha32.f183446d) && C46238a.m51546a(this.f183447e, ha32.f183447e) && C46238a.m51546a(this.f183448f, ha32.f183448f) && C46238a.m51546a(this.f183449g, ha32.f183449g) && C46238a.m51546a(this.f183450h, ha32.f183450h) && C46238a.m51546a(this.f183451i, ha32.f183451i) && C46238a.m51546a(Integer.valueOf(this.f183452j), Integer.valueOf(ha32.f183452j)) && C46238a.m51546a(Integer.valueOf(this.f183453n), Integer.valueOf(ha32.f183453n)) && C46238a.m51546a(Integer.valueOf(this.f183454o), Integer.valueOf(ha32.f183454o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183446d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183447e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f183448f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f183449g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f183450h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f183451i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            aVar.mo74318e(7, this.f183452j);
            aVar.mo74318e(8, this.f183453n);
            aVar.mo74318e(9, this.f183454o);
            return 0;
        } else if (i == 1) {
            String str7 = this.f183446d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f183447e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f183448f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f183449g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f183450h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f183451i;
            if (str12 != null) {
                i2 += C52418a.m58683j(6, str12);
            }
            return i2 + C52418a.m58678e(7, this.f183452j) + C52418a.m58678e(8, this.f183453n) + C52418a.m58678e(9, this.f183454o);
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
            C64416ha3 ha32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ha32.f183446d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ha32.f183447e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ha32.f183448f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ha32.f183449g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ha32.f183450h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ha32.f183451i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ha32.f183452j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ha32.f183453n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ha32.f183454o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
