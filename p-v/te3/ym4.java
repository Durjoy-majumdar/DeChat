package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ym4 extends C47465a {

    /* renamed from: d */
    public String f145403d;

    /* renamed from: e */
    public int f145404e;

    /* renamed from: f */
    public int f145405f;

    /* renamed from: g */
    public C89349b f145406g;

    /* renamed from: h */
    public boolean f145407h;

    /* renamed from: i */
    public LinkedList<String> f145408i = new LinkedList<>();

    /* renamed from: j */
    public String f145409j;

    /* renamed from: n */
    public String f145410n;

    /* renamed from: o */
    public String f145411o;

    /* renamed from: p */
    public String f145412p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ym4)) {
            return false;
        }
        ym4 ym4 = (ym4) aVar;
        return C46238a.m51546a(this.f145403d, ym4.f145403d) && C46238a.m51546a(Integer.valueOf(this.f145404e), Integer.valueOf(ym4.f145404e)) && C46238a.m51546a(Integer.valueOf(this.f145405f), Integer.valueOf(ym4.f145405f)) && C46238a.m51546a(this.f145406g, ym4.f145406g) && C46238a.m51546a(Boolean.valueOf(this.f145407h), Boolean.valueOf(ym4.f145407h)) && C46238a.m51546a(this.f145408i, ym4.f145408i) && C46238a.m51546a(this.f145409j, ym4.f145409j) && C46238a.m51546a(this.f145410n, ym4.f145410n) && C46238a.m51546a(this.f145411o, ym4.f145411o) && C46238a.m51546a(this.f145412p, ym4.f145412p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f145406g != null) {
                String str = this.f145403d;
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f145404e);
                aVar.mo74318e(3, this.f145405f);
                C89349b bVar = this.f145406g;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
                }
                aVar.mo74314a(5, this.f145407h);
                aVar.mo74320g(6, 1, this.f145408i);
                String str2 = this.f145409j;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                String str3 = this.f145410n;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                String str4 = this.f145411o;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                String str5 = this.f145412p;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: EmojiBuffer");
        } else if (i == 1) {
            String str6 = this.f145403d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int e = i2 + C52418a.m58678e(2, this.f145404e) + C52418a.m58678e(3, this.f145405f);
            C89349b bVar2 = this.f145406g;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            int a = e + C52418a.m58674a(5, this.f145407h) + C52418a.m58680g(6, 1, this.f145408i);
            String str7 = this.f145409j;
            if (str7 != null) {
                a += C52418a.m58683j(7, str7);
            }
            String str8 = this.f145410n;
            if (str8 != null) {
                a += C52418a.m58683j(8, str8);
            }
            String str9 = this.f145411o;
            if (str9 != null) {
                a += C52418a.m58683j(9, str9);
            }
            String str10 = this.f145412p;
            return str10 != null ? a + C52418a.m58683j(10, str10) : a;
        } else if (i == 2) {
            this.f145408i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f145406g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: EmojiBuffer");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ym4 ym4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ym4.f145403d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ym4.f145404e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ym4.f145405f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ym4.f145406g = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    ym4.f145407h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    ym4.f145408i.add(aVar3.mo141633k(intValue));
                    return 0;
                case 7:
                    ym4.f145409j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ym4.f145410n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ym4.f145411o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ym4.f145412p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
