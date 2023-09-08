package tw1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: tw1.c */
public class C52369c extends C47465a {

    /* renamed from: d */
    public long f146357d;

    /* renamed from: e */
    public boolean f146358e;

    /* renamed from: f */
    public String f146359f;

    /* renamed from: g */
    public long f146360g;

    /* renamed from: h */
    public String f146361h;

    /* renamed from: i */
    public String f146362i;

    /* renamed from: j */
    public String f146363j;

    /* renamed from: n */
    public String f146364n;

    /* renamed from: o */
    public String f146365o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52369c)) {
            return false;
        }
        C52369c cVar = (C52369c) aVar;
        return C46238a.m51546a(Long.valueOf(this.f146357d), Long.valueOf(cVar.f146357d)) && C46238a.m51546a(Boolean.valueOf(this.f146358e), Boolean.valueOf(cVar.f146358e)) && C46238a.m51546a(this.f146359f, cVar.f146359f) && C46238a.m51546a(Long.valueOf(this.f146360g), Long.valueOf(cVar.f146360g)) && C46238a.m51546a(this.f146361h, cVar.f146361h) && C46238a.m51546a(this.f146362i, cVar.f146362i) && C46238a.m51546a(this.f146363j, cVar.f146363j) && C46238a.m51546a(this.f146364n, cVar.f146364n) && C46238a.m51546a(this.f146365o, cVar.f146365o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f146357d);
            aVar.mo74314a(2, this.f146358e);
            String str = this.f146359f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f146360g);
            String str2 = this.f146361h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f146362i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f146363j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f146364n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f146365o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f146357d) + 0 + C52418a.m58674a(2, this.f146358e);
            String str7 = this.f146359f;
            if (str7 != null) {
                h += C52418a.m58683j(3, str7);
            }
            int h2 = h + C52418a.m58681h(4, this.f146360g);
            String str8 = this.f146361h;
            if (str8 != null) {
                h2 += C52418a.m58683j(5, str8);
            }
            String str9 = this.f146362i;
            if (str9 != null) {
                h2 += C52418a.m58683j(6, str9);
            }
            String str10 = this.f146363j;
            if (str10 != null) {
                h2 += C52418a.m58683j(7, str10);
            }
            String str11 = this.f146364n;
            if (str11 != null) {
                h2 += C52418a.m58683j(8, str11);
            }
            String str12 = this.f146365o;
            return str12 != null ? h2 + C52418a.m58683j(9, str12) : h2;
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
            C52369c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cVar.f146357d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    cVar.f146358e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    cVar.f146359f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    cVar.f146360g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    cVar.f146361h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cVar.f146362i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    cVar.f146363j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    cVar.f146364n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    cVar.f146365o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
