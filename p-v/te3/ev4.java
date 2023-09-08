package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ev4 extends C47465a {

    /* renamed from: d */
    public int f298208d;

    /* renamed from: e */
    public int f298209e;

    /* renamed from: f */
    public int f298210f;

    /* renamed from: g */
    public int f298211g;

    /* renamed from: h */
    public int f298212h;

    /* renamed from: i */
    public int f298213i;

    /* renamed from: j */
    public int f298214j;

    /* renamed from: n */
    public int f298215n;

    /* renamed from: o */
    public int f298216o;

    /* renamed from: p */
    public int f298217p;

    /* renamed from: q */
    public LinkedList<Integer> f298218q = new LinkedList<>();

    /* renamed from: r */
    public int f298219r;

    /* renamed from: s */
    public LinkedList<Integer> f298220s = new LinkedList<>();

    /* renamed from: t */
    public int f298221t;

    /* renamed from: u */
    public LinkedList<Integer> f298222u = new LinkedList<>();

    /* renamed from: v */
    public String f298223v;

    /* renamed from: w */
    public String f298224w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ev4)) {
            return false;
        }
        ev4 ev4 = (ev4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298208d), Integer.valueOf(ev4.f298208d)) && C46238a.m51546a(Integer.valueOf(this.f298209e), Integer.valueOf(ev4.f298209e)) && C46238a.m51546a(Integer.valueOf(this.f298210f), Integer.valueOf(ev4.f298210f)) && C46238a.m51546a(Integer.valueOf(this.f298211g), Integer.valueOf(ev4.f298211g)) && C46238a.m51546a(Integer.valueOf(this.f298212h), Integer.valueOf(ev4.f298212h)) && C46238a.m51546a(Integer.valueOf(this.f298213i), Integer.valueOf(ev4.f298213i)) && C46238a.m51546a(Integer.valueOf(this.f298214j), Integer.valueOf(ev4.f298214j)) && C46238a.m51546a(Integer.valueOf(this.f298215n), Integer.valueOf(ev4.f298215n)) && C46238a.m51546a(Integer.valueOf(this.f298216o), Integer.valueOf(ev4.f298216o)) && C46238a.m51546a(Integer.valueOf(this.f298217p), Integer.valueOf(ev4.f298217p)) && C46238a.m51546a(this.f298218q, ev4.f298218q) && C46238a.m51546a(Integer.valueOf(this.f298219r), Integer.valueOf(ev4.f298219r)) && C46238a.m51546a(this.f298220s, ev4.f298220s) && C46238a.m51546a(Integer.valueOf(this.f298221t), Integer.valueOf(ev4.f298221t)) && C46238a.m51546a(this.f298222u, ev4.f298222u) && C46238a.m51546a(this.f298223v, ev4.f298223v) && C46238a.m51546a(this.f298224w, ev4.f298224w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298208d);
            aVar.mo74318e(2, this.f298209e);
            aVar.mo74318e(3, this.f298210f);
            aVar.mo74318e(4, this.f298211g);
            aVar.mo74318e(5, this.f298212h);
            aVar.mo74318e(6, this.f298213i);
            aVar.mo74318e(7, this.f298214j);
            aVar.mo74318e(8, this.f298215n);
            aVar.mo74318e(9, this.f298216o);
            aVar.mo74318e(10, this.f298217p);
            aVar.mo74320g(11, 2, this.f298218q);
            aVar.mo74318e(12, this.f298219r);
            aVar.mo74320g(13, 2, this.f298220s);
            aVar.mo74318e(14, this.f298221t);
            aVar.mo74320g(15, 2, this.f298222u);
            String str = this.f298223v;
            if (str != null) {
                aVar.mo74323j(16, str);
            }
            String str2 = this.f298224w;
            if (str2 != null) {
                aVar.mo74323j(17, str2);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f298208d) + 0 + C52418a.m58678e(2, this.f298209e) + C52418a.m58678e(3, this.f298210f) + C52418a.m58678e(4, this.f298211g) + C52418a.m58678e(5, this.f298212h) + C52418a.m58678e(6, this.f298213i) + C52418a.m58678e(7, this.f298214j) + C52418a.m58678e(8, this.f298215n) + C52418a.m58678e(9, this.f298216o) + C52418a.m58678e(10, this.f298217p) + C52418a.m58680g(11, 2, this.f298218q) + C52418a.m58678e(12, this.f298219r) + C52418a.m58680g(13, 2, this.f298220s) + C52418a.m58678e(14, this.f298221t) + C52418a.m58680g(15, 2, this.f298222u);
            String str3 = this.f298223v;
            if (str3 != null) {
                e += C52418a.m58683j(16, str3);
            }
            String str4 = this.f298224w;
            return str4 != null ? e + C52418a.m58683j(17, str4) : e;
        } else if (i2 == 2) {
            this.f298218q.clear();
            this.f298220s.clear();
            this.f298222u.clear();
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
            ev4 ev4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ev4.f298208d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ev4.f298209e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ev4.f298210f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ev4.f298211g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ev4.f298212h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ev4.f298213i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ev4.f298214j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ev4.f298215n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ev4.f298216o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ev4.f298217p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    ev4.f298218q.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 12:
                    ev4.f298219r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    ev4.f298220s.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 14:
                    ev4.f298221t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    ev4.f298222u.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 16:
                    ev4.f298223v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    ev4.f298224w = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
