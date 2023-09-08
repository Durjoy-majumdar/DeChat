package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ay2 */
public class C77904ay2 extends C47465a {

    /* renamed from: d */
    public String f226969d;

    /* renamed from: e */
    public int f226970e;

    /* renamed from: f */
    public int f226971f;

    /* renamed from: g */
    public String f226972g;

    /* renamed from: h */
    public String f226973h;

    /* renamed from: i */
    public String f226974i;

    /* renamed from: j */
    public int f226975j;

    /* renamed from: n */
    public int f226976n;

    /* renamed from: o */
    public String f226977o;

    /* renamed from: p */
    public String f226978p;

    /* renamed from: q */
    public String f226979q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77904ay2)) {
            return false;
        }
        C77904ay2 ay22 = (C77904ay2) aVar;
        return C46238a.m51546a(this.f226969d, ay22.f226969d) && C46238a.m51546a(Integer.valueOf(this.f226970e), Integer.valueOf(ay22.f226970e)) && C46238a.m51546a(Integer.valueOf(this.f226971f), Integer.valueOf(ay22.f226971f)) && C46238a.m51546a(this.f226972g, ay22.f226972g) && C46238a.m51546a(this.f226973h, ay22.f226973h) && C46238a.m51546a(this.f226974i, ay22.f226974i) && C46238a.m51546a(Integer.valueOf(this.f226975j), Integer.valueOf(ay22.f226975j)) && C46238a.m51546a(Integer.valueOf(this.f226976n), Integer.valueOf(ay22.f226976n)) && C46238a.m51546a(this.f226977o, ay22.f226977o) && C46238a.m51546a(this.f226978p, ay22.f226978p) && C46238a.m51546a(this.f226979q, ay22.f226979q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f226969d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f226970e);
            aVar.mo74318e(3, this.f226971f);
            String str2 = this.f226972g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f226973h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f226974i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f226975j);
            aVar.mo74318e(8, this.f226976n);
            String str5 = this.f226977o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f226978p;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            String str7 = this.f226979q;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f226969d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            int e = i2 + C52418a.m58678e(2, this.f226970e) + C52418a.m58678e(3, this.f226971f);
            String str9 = this.f226972g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f226973h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f226974i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            int e2 = e + C52418a.m58678e(7, this.f226975j) + C52418a.m58678e(8, this.f226976n);
            String str12 = this.f226977o;
            if (str12 != null) {
                e2 += C52418a.m58683j(9, str12);
            }
            String str13 = this.f226978p;
            if (str13 != null) {
                e2 += C52418a.m58683j(10, str13);
            }
            String str14 = this.f226979q;
            return str14 != null ? e2 + C52418a.m58683j(11, str14) : e2;
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
            C77904ay2 ay22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ay22.f226969d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ay22.f226970e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ay22.f226971f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ay22.f226972g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ay22.f226973h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ay22.f226974i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ay22.f226975j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ay22.f226976n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ay22.f226977o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ay22.f226978p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    ay22.f226979q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
