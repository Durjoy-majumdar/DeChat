package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.av2 */
public class C64246av2 extends C47465a {

    /* renamed from: d */
    public String f182166d;

    /* renamed from: e */
    public String f182167e;

    /* renamed from: f */
    public String f182168f;

    /* renamed from: g */
    public String f182169g;

    /* renamed from: h */
    public LinkedList<String> f182170h = new LinkedList<>();

    /* renamed from: i */
    public float f182171i;

    /* renamed from: j */
    public String f182172j;

    /* renamed from: n */
    public int f182173n;

    /* renamed from: o */
    public String f182174o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64246av2)) {
            return false;
        }
        C64246av2 av22 = (C64246av2) aVar;
        return C46238a.m51546a(this.f182166d, av22.f182166d) && C46238a.m51546a(this.f182167e, av22.f182167e) && C46238a.m51546a(this.f182168f, av22.f182168f) && C46238a.m51546a(this.f182169g, av22.f182169g) && C46238a.m51546a(this.f182170h, av22.f182170h) && C46238a.m51546a(Float.valueOf(this.f182171i), Float.valueOf(av22.f182171i)) && C46238a.m51546a(this.f182172j, av22.f182172j) && C46238a.m51546a(Integer.valueOf(this.f182173n), Integer.valueOf(av22.f182173n)) && C46238a.m51546a(this.f182174o, av22.f182174o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182166d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182167e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f182168f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f182169g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74320g(5, 1, this.f182170h);
            aVar.mo74317d(6, this.f182171i);
            String str5 = this.f182172j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f182173n);
            String str6 = this.f182174o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f182166d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f182167e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f182168f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f182169g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            int g = i2 + C52418a.m58680g(5, 1, this.f182170h) + C52418a.m58677d(6, this.f182171i);
            String str11 = this.f182172j;
            if (str11 != null) {
                g += C52418a.m58683j(7, str11);
            }
            int e = g + C52418a.m58678e(8, this.f182173n);
            String str12 = this.f182174o;
            return str12 != null ? e + C52418a.m58683j(9, str12) : e;
        } else if (i == 2) {
            this.f182170h.clear();
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
            C64246av2 av22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    av22.f182166d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    av22.f182167e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    av22.f182168f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    av22.f182169g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    av22.f182170h.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    av22.f182171i = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    av22.f182172j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    av22.f182173n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    av22.f182174o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
