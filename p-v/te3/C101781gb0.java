package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gb0 */
public class C101781gb0 extends C47465a {

    /* renamed from: d */
    public long f298291d;

    /* renamed from: e */
    public LinkedList<Integer> f298292e = new LinkedList<>();

    /* renamed from: f */
    public int f298293f;

    /* renamed from: g */
    public boolean f298294g;

    /* renamed from: h */
    public boolean f298295h;

    /* renamed from: i */
    public boolean f298296i;

    /* renamed from: j */
    public boolean f298297j;

    /* renamed from: n */
    public String f298298n;

    /* renamed from: o */
    public String f298299o;

    /* renamed from: p */
    public String f298300p;

    /* renamed from: q */
    public boolean f298301q;

    /* renamed from: r */
    public int f298302r;

    /* renamed from: s */
    public int f298303s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101781gb0)) {
            return false;
        }
        C101781gb0 gb02 = (C101781gb0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f298291d), Long.valueOf(gb02.f298291d)) && C46238a.m51546a(this.f298292e, gb02.f298292e) && C46238a.m51546a(Integer.valueOf(this.f298293f), Integer.valueOf(gb02.f298293f)) && C46238a.m51546a(Boolean.valueOf(this.f298294g), Boolean.valueOf(gb02.f298294g)) && C46238a.m51546a(Boolean.valueOf(this.f298295h), Boolean.valueOf(gb02.f298295h)) && C46238a.m51546a(Boolean.valueOf(this.f298296i), Boolean.valueOf(gb02.f298296i)) && C46238a.m51546a(Boolean.valueOf(this.f298297j), Boolean.valueOf(gb02.f298297j)) && C46238a.m51546a(this.f298298n, gb02.f298298n) && C46238a.m51546a(this.f298299o, gb02.f298299o) && C46238a.m51546a(this.f298300p, gb02.f298300p) && C46238a.m51546a(Boolean.valueOf(this.f298301q), Boolean.valueOf(gb02.f298301q)) && C46238a.m51546a(Integer.valueOf(this.f298302r), Integer.valueOf(gb02.f298302r)) && C46238a.m51546a(Integer.valueOf(this.f298303s), Integer.valueOf(gb02.f298303s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f298291d);
            aVar.mo74320g(2, 2, this.f298292e);
            aVar.mo74318e(3, this.f298293f);
            aVar.mo74314a(4, this.f298294g);
            aVar.mo74314a(5, this.f298295h);
            aVar.mo74314a(6, this.f298296i);
            aVar.mo74314a(7, this.f298297j);
            String str = this.f298298n;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            String str2 = this.f298299o;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            String str3 = this.f298300p;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            aVar.mo74314a(11, this.f298301q);
            aVar.mo74318e(12, this.f298302r);
            aVar.mo74318e(13, this.f298303s);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f298291d) + 0 + C52418a.m58680g(2, 2, this.f298292e) + C52418a.m58678e(3, this.f298293f) + C52418a.m58674a(4, this.f298294g) + C52418a.m58674a(5, this.f298295h) + C52418a.m58674a(6, this.f298296i) + C52418a.m58674a(7, this.f298297j);
            String str4 = this.f298298n;
            if (str4 != null) {
                h += C52418a.m58683j(8, str4);
            }
            String str5 = this.f298299o;
            if (str5 != null) {
                h += C52418a.m58683j(9, str5);
            }
            String str6 = this.f298300p;
            if (str6 != null) {
                h += C52418a.m58683j(10, str6);
            }
            return h + C52418a.m58674a(11, this.f298301q) + C52418a.m58678e(12, this.f298302r) + C52418a.m58678e(13, this.f298303s);
        } else if (i2 == 2) {
            this.f298292e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101781gb0 gb02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gb02.f298291d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    gb02.f298292e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 3:
                    gb02.f298293f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    gb02.f298294g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    gb02.f298295h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    gb02.f298296i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    gb02.f298297j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    gb02.f298298n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    gb02.f298299o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    gb02.f298300p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    gb02.f298301q = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    gb02.f298302r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    gb02.f298303s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
