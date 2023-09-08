package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j80 */
public class C101792j80 extends C47465a {

    /* renamed from: d */
    public int f298502d;

    /* renamed from: e */
    public String f298503e;

    /* renamed from: f */
    public String f298504f;

    /* renamed from: g */
    public String f298505g;

    /* renamed from: h */
    public int f298506h;

    /* renamed from: i */
    public int f298507i;

    /* renamed from: j */
    public String f298508j;

    /* renamed from: n */
    public int f298509n;

    /* renamed from: o */
    public long f298510o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101792j80)) {
            return false;
        }
        C101792j80 j802 = (C101792j80) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298502d), Integer.valueOf(j802.f298502d)) && C46238a.m51546a(this.f298503e, j802.f298503e) && C46238a.m51546a(this.f298504f, j802.f298504f) && C46238a.m51546a(this.f298505g, j802.f298505g) && C46238a.m51546a(Integer.valueOf(this.f298506h), Integer.valueOf(j802.f298506h)) && C46238a.m51546a(Integer.valueOf(this.f298507i), Integer.valueOf(j802.f298507i)) && C46238a.m51546a(this.f298508j, j802.f298508j) && C46238a.m51546a(Integer.valueOf(this.f298509n), Integer.valueOf(j802.f298509n)) && C46238a.m51546a(Long.valueOf(this.f298510o), Long.valueOf(j802.f298510o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298502d);
            String str = this.f298503e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f298504f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f298505g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f298506h);
            aVar.mo74318e(6, this.f298507i);
            String str4 = this.f298508j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74318e(8, this.f298509n);
            aVar.mo74321h(9, this.f298510o);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f298502d) + 0;
            String str5 = this.f298503e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            String str6 = this.f298504f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f298505g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            int e2 = e + C52418a.m58678e(5, this.f298506h) + C52418a.m58678e(6, this.f298507i);
            String str8 = this.f298508j;
            if (str8 != null) {
                e2 += C52418a.m58683j(7, str8);
            }
            return e2 + C52418a.m58678e(8, this.f298509n) + C52418a.m58681h(9, this.f298510o);
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
            C101792j80 j802 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    j802.f298502d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    j802.f298503e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    j802.f298504f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    j802.f298505g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    j802.f298506h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    j802.f298507i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    j802.f298508j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    j802.f298509n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    j802.f298510o = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
