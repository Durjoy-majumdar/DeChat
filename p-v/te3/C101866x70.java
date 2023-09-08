package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x70 */
public class C101866x70 extends C47465a {

    /* renamed from: d */
    public String f299852d;

    /* renamed from: e */
    public String f299853e;

    /* renamed from: f */
    public String f299854f;

    /* renamed from: g */
    public int f299855g;

    /* renamed from: h */
    public String f299856h;

    /* renamed from: i */
    public int f299857i;

    /* renamed from: j */
    public String f299858j;

    /* renamed from: n */
    public String f299859n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101866x70)) {
            return false;
        }
        C101866x70 x702 = (C101866x70) aVar;
        return C46238a.m51546a(this.f299852d, x702.f299852d) && C46238a.m51546a(this.f299853e, x702.f299853e) && C46238a.m51546a(this.f299854f, x702.f299854f) && C46238a.m51546a(Integer.valueOf(this.f299855g), Integer.valueOf(x702.f299855g)) && C46238a.m51546a(this.f299856h, x702.f299856h) && C46238a.m51546a(Integer.valueOf(this.f299857i), Integer.valueOf(x702.f299857i)) && C46238a.m51546a(this.f299858j, x702.f299858j) && C46238a.m51546a(this.f299859n, x702.f299859n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299852d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299853e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f299854f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f299855g);
            String str4 = this.f299856h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f299857i);
            String str5 = this.f299858j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f299859n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f299852d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f299853e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f299854f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            int e = i2 + C52418a.m58678e(4, this.f299855g);
            String str10 = this.f299856h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            int e2 = e + C52418a.m58678e(6, this.f299857i);
            String str11 = this.f299858j;
            if (str11 != null) {
                e2 += C52418a.m58683j(7, str11);
            }
            String str12 = this.f299859n;
            return str12 != null ? e2 + C52418a.m58683j(8, str12) : e2;
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
            C101866x70 x702 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    x702.f299852d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    x702.f299853e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    x702.f299854f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    x702.f299855g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    x702.f299856h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    x702.f299857i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    x702.f299858j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    x702.f299859n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
