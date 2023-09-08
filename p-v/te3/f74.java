package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class f74 extends C47465a {

    /* renamed from: d */
    public String f133336d;

    /* renamed from: e */
    public String f133337e;

    /* renamed from: f */
    public String f133338f;

    /* renamed from: g */
    public String f133339g;

    /* renamed from: h */
    public String f133340h;

    /* renamed from: i */
    public String f133341i;

    /* renamed from: j */
    public int f133342j;

    /* renamed from: n */
    public String f133343n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof f74)) {
            return false;
        }
        f74 f74 = (f74) aVar;
        return C46238a.m51546a(this.f133336d, f74.f133336d) && C46238a.m51546a(this.f133337e, f74.f133337e) && C46238a.m51546a(this.f133338f, f74.f133338f) && C46238a.m51546a(this.f133339g, f74.f133339g) && C46238a.m51546a(this.f133340h, f74.f133340h) && C46238a.m51546a(this.f133341i, f74.f133341i) && C46238a.m51546a(Integer.valueOf(this.f133342j), Integer.valueOf(f74.f133342j)) && C46238a.m51546a(this.f133343n, f74.f133343n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133336d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f133337e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f133338f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f133339g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f133340h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f133341i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            aVar.mo74318e(7, this.f133342j);
            String str7 = this.f133343n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f133336d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f133337e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f133338f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f133339g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f133340h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f133341i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            int e = i2 + C52418a.m58678e(7, this.f133342j);
            String str14 = this.f133343n;
            return str14 != null ? e + C52418a.m58683j(8, str14) : e;
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
            f74 f74 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    f74.f133336d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    f74.f133337e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    f74.f133338f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    f74.f133339g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    f74.f133340h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    f74.f133341i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    f74.f133342j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    f74.f133343n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
