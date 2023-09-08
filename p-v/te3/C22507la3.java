package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.la3 */
public class C22507la3 extends C47465a {

    /* renamed from: d */
    public String f64159d;

    /* renamed from: e */
    public String f64160e;

    /* renamed from: f */
    public int f64161f = 0;

    /* renamed from: g */
    public long f64162g = 0;

    /* renamed from: h */
    public long f64163h = 0;

    /* renamed from: i */
    public long f64164i = 0;

    /* renamed from: j */
    public String f64165j;

    /* renamed from: n */
    public String f64166n;

    /* renamed from: o */
    public int f64167o = 0;

    /* renamed from: p */
    public LinkedList<Long> f64168p = new LinkedList<>();

    /* renamed from: q */
    public String f64169q;

    /* renamed from: r */
    public String f64170r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22507la3)) {
            return false;
        }
        C22507la3 la32 = (C22507la3) aVar;
        return C46238a.m51546a(this.f64159d, la32.f64159d) && C46238a.m51546a(this.f64160e, la32.f64160e) && C46238a.m51546a(Integer.valueOf(this.f64161f), Integer.valueOf(la32.f64161f)) && C46238a.m51546a(Long.valueOf(this.f64162g), Long.valueOf(la32.f64162g)) && C46238a.m51546a(Long.valueOf(this.f64163h), Long.valueOf(la32.f64163h)) && C46238a.m51546a(Long.valueOf(this.f64164i), Long.valueOf(la32.f64164i)) && C46238a.m51546a(this.f64165j, la32.f64165j) && C46238a.m51546a(this.f64166n, la32.f64166n) && C46238a.m51546a(Integer.valueOf(this.f64167o), Integer.valueOf(la32.f64167o)) && C46238a.m51546a(this.f64168p, la32.f64168p) && C46238a.m51546a(this.f64169q, la32.f64169q) && C46238a.m51546a(this.f64170r, la32.f64170r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64159d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64160e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f64161f);
            aVar.mo74321h(4, this.f64162g);
            aVar.mo74321h(5, this.f64163h);
            aVar.mo74321h(6, this.f64164i);
            String str3 = this.f64165j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f64166n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            aVar.mo74318e(9, this.f64167o);
            aVar.mo74320g(10, 3, this.f64168p);
            String str5 = this.f64169q;
            if (str5 != null) {
                aVar.mo74323j(11, str5);
            }
            String str6 = this.f64170r;
            if (str6 != null) {
                aVar.mo74323j(12, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f64159d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f64160e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            int e = i2 + C52418a.m58678e(3, this.f64161f) + C52418a.m58681h(4, this.f64162g) + C52418a.m58681h(5, this.f64163h) + C52418a.m58681h(6, this.f64164i);
            String str9 = this.f64165j;
            if (str9 != null) {
                e += C52418a.m58683j(7, str9);
            }
            String str10 = this.f64166n;
            if (str10 != null) {
                e += C52418a.m58683j(8, str10);
            }
            int e2 = e + C52418a.m58678e(9, this.f64167o) + C52418a.m58680g(10, 3, this.f64168p);
            String str11 = this.f64169q;
            if (str11 != null) {
                e2 += C52418a.m58683j(11, str11);
            }
            String str12 = this.f64170r;
            return str12 != null ? e2 + C52418a.m58683j(12, str12) : e2;
        } else if (i == 2) {
            this.f64168p.clear();
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
            C22507la3 la32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    la32.f64159d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    la32.f64160e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    la32.f64161f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    la32.f64162g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    la32.f64163h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    la32.f64164i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    la32.f64165j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    la32.f64166n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    la32.f64167o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    la32.f64168p.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    return 0;
                case 11:
                    la32.f64169q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    la32.f64170r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
