package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fa3 */
public class C118430fa3 extends C47465a {

    /* renamed from: d */
    public String f353990d = "";

    /* renamed from: e */
    public boolean f353991e = false;

    /* renamed from: f */
    public long f353992f = 0;

    /* renamed from: g */
    public long f353993g = 0;

    /* renamed from: h */
    public long f353994h = 0;

    /* renamed from: i */
    public int f353995i = -1;

    /* renamed from: j */
    public String f353996j = "";

    /* renamed from: n */
    public int f353997n = 0;

    /* renamed from: o */
    public String f353998o;

    /* renamed from: p */
    public boolean f353999p;

    /* renamed from: q */
    public String f354000q = "";

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118430fa3)) {
            return false;
        }
        C118430fa3 fa32 = (C118430fa3) aVar;
        return C46238a.m51546a(this.f353990d, fa32.f353990d) && C46238a.m51546a(Boolean.valueOf(this.f353991e), Boolean.valueOf(fa32.f353991e)) && C46238a.m51546a(Long.valueOf(this.f353992f), Long.valueOf(fa32.f353992f)) && C46238a.m51546a(Long.valueOf(this.f353993g), Long.valueOf(fa32.f353993g)) && C46238a.m51546a(Long.valueOf(this.f353994h), Long.valueOf(fa32.f353994h)) && C46238a.m51546a(Integer.valueOf(this.f353995i), Integer.valueOf(fa32.f353995i)) && C46238a.m51546a(this.f353996j, fa32.f353996j) && C46238a.m51546a(Integer.valueOf(this.f353997n), Integer.valueOf(fa32.f353997n)) && C46238a.m51546a(this.f353998o, fa32.f353998o) && C46238a.m51546a(Boolean.valueOf(this.f353999p), Boolean.valueOf(fa32.f353999p)) && C46238a.m51546a(this.f354000q, fa32.f354000q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f353990d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74314a(2, this.f353991e);
            aVar.mo74321h(3, this.f353992f);
            aVar.mo74321h(4, this.f353993g);
            aVar.mo74321h(5, this.f353994h);
            aVar.mo74318e(6, this.f353995i);
            String str2 = this.f353996j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f353997n);
            String str3 = this.f353998o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74314a(10, this.f353999p);
            String str4 = this.f354000q;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f353990d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int a = i2 + C52418a.m58674a(2, this.f353991e) + C52418a.m58681h(3, this.f353992f) + C52418a.m58681h(4, this.f353993g) + C52418a.m58681h(5, this.f353994h) + C52418a.m58678e(6, this.f353995i);
            String str6 = this.f353996j;
            if (str6 != null) {
                a += C52418a.m58683j(7, str6);
            }
            int e = a + C52418a.m58678e(8, this.f353997n);
            String str7 = this.f353998o;
            if (str7 != null) {
                e += C52418a.m58683j(9, str7);
            }
            int a2 = e + C52418a.m58674a(10, this.f353999p);
            String str8 = this.f354000q;
            return str8 != null ? a2 + C52418a.m58683j(11, str8) : a2;
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
            C118430fa3 fa32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fa32.f353990d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    fa32.f353991e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    fa32.f353992f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    fa32.f353993g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    fa32.f353994h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    fa32.f353995i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    fa32.f353996j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    fa32.f353997n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    fa32.f353998o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    fa32.f353999p = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    fa32.f354000q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
