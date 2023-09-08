package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fc1 */
public class C49407fc1 extends C47465a {

    /* renamed from: d */
    public int f133418d;

    /* renamed from: e */
    public int f133419e;

    /* renamed from: f */
    public int f133420f;

    /* renamed from: g */
    public int f133421g;

    /* renamed from: h */
    public int f133422h;

    /* renamed from: i */
    public int f133423i;

    /* renamed from: j */
    public int f133424j;

    /* renamed from: n */
    public int f133425n;

    /* renamed from: o */
    public int f133426o;

    /* renamed from: p */
    public int f133427p;

    /* renamed from: q */
    public String f133428q;

    /* renamed from: r */
    public long f133429r;

    /* renamed from: s */
    public String f133430s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49407fc1)) {
            return false;
        }
        C49407fc1 fc12 = (C49407fc1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133418d), Integer.valueOf(fc12.f133418d)) && C46238a.m51546a(Integer.valueOf(this.f133419e), Integer.valueOf(fc12.f133419e)) && C46238a.m51546a(Integer.valueOf(this.f133420f), Integer.valueOf(fc12.f133420f)) && C46238a.m51546a(Integer.valueOf(this.f133421g), Integer.valueOf(fc12.f133421g)) && C46238a.m51546a(Integer.valueOf(this.f133422h), Integer.valueOf(fc12.f133422h)) && C46238a.m51546a(Integer.valueOf(this.f133423i), Integer.valueOf(fc12.f133423i)) && C46238a.m51546a(Integer.valueOf(this.f133424j), Integer.valueOf(fc12.f133424j)) && C46238a.m51546a(Integer.valueOf(this.f133425n), Integer.valueOf(fc12.f133425n)) && C46238a.m51546a(Integer.valueOf(this.f133426o), Integer.valueOf(fc12.f133426o)) && C46238a.m51546a(Integer.valueOf(this.f133427p), Integer.valueOf(fc12.f133427p)) && C46238a.m51546a(this.f133428q, fc12.f133428q) && C46238a.m51546a(Long.valueOf(this.f133429r), Long.valueOf(fc12.f133429r)) && C46238a.m51546a(this.f133430s, fc12.f133430s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133418d);
            aVar.mo74318e(2, this.f133419e);
            aVar.mo74318e(3, this.f133420f);
            aVar.mo74318e(4, this.f133421g);
            aVar.mo74318e(5, this.f133422h);
            aVar.mo74318e(7, this.f133423i);
            aVar.mo74318e(8, this.f133424j);
            aVar.mo74318e(9, this.f133425n);
            aVar.mo74318e(10, this.f133426o);
            aVar.mo74318e(11, this.f133427p);
            String str = this.f133428q;
            if (str != null) {
                aVar.mo74323j(12, str);
            }
            aVar.mo74321h(13, this.f133429r);
            String str2 = this.f133430s;
            if (str2 == null) {
                return 0;
            }
            aVar.mo74323j(20, str2);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f133418d) + 0 + C52418a.m58678e(2, this.f133419e) + C52418a.m58678e(3, this.f133420f) + C52418a.m58678e(4, this.f133421g) + C52418a.m58678e(5, this.f133422h) + C52418a.m58678e(7, this.f133423i) + C52418a.m58678e(8, this.f133424j) + C52418a.m58678e(9, this.f133425n) + C52418a.m58678e(10, this.f133426o) + C52418a.m58678e(11, this.f133427p);
            String str3 = this.f133428q;
            if (str3 != null) {
                e += C52418a.m58683j(12, str3);
            }
            int h = e + C52418a.m58681h(13, this.f133429r);
            String str4 = this.f133430s;
            return str4 != null ? h + C52418a.m58683j(20, str4) : h;
        } else if (i2 == 2) {
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
            C49407fc1 fc12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fc12.f133418d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                fc12.f133419e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                fc12.f133420f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                fc12.f133421g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                fc12.f133422h = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 20) {
                switch (intValue) {
                    case 7:
                        fc12.f133423i = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        fc12.f133424j = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        fc12.f133425n = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        fc12.f133426o = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        fc12.f133427p = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        fc12.f133428q = aVar3.mo141633k(intValue);
                        return 0;
                    case 13:
                        fc12.f133429r = aVar3.mo141631i(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                fc12.f133430s = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
