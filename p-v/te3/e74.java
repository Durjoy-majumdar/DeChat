package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class e74 extends C47465a {

    /* renamed from: A */
    public String f298178A;

    /* renamed from: d */
    public String f298179d;

    /* renamed from: e */
    public int f298180e = -1;

    /* renamed from: f */
    public int f298181f = -1;

    /* renamed from: g */
    public int f298182g = -1;

    /* renamed from: h */
    public int f298183h = 0;

    /* renamed from: i */
    public int f298184i = -1;

    /* renamed from: j */
    public int f298185j = -1;

    /* renamed from: n */
    public int f298186n = 0;

    /* renamed from: o */
    public int f298187o = 0;

    /* renamed from: p */
    public boolean f298188p = false;

    /* renamed from: q */
    public long f298189q = -1;

    /* renamed from: r */
    public long f298190r = -1;

    /* renamed from: s */
    public LinkedList<C49691he0> f298191s = new LinkedList<>();

    /* renamed from: t */
    public long f298192t = 0;

    /* renamed from: u */
    public double f298193u = 0.0d;

    /* renamed from: v */
    public double f298194v = 0.0d;

    /* renamed from: w */
    public int f298195w;

    /* renamed from: x */
    public int f298196x;

    /* renamed from: y */
    public String f298197y;

    /* renamed from: z */
    public boolean f298198z = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e74)) {
            return false;
        }
        e74 e74 = (e74) aVar;
        return C46238a.m51546a(this.f298179d, e74.f298179d) && C46238a.m51546a(Integer.valueOf(this.f298180e), Integer.valueOf(e74.f298180e)) && C46238a.m51546a(Integer.valueOf(this.f298181f), Integer.valueOf(e74.f298181f)) && C46238a.m51546a(Integer.valueOf(this.f298182g), Integer.valueOf(e74.f298182g)) && C46238a.m51546a(Integer.valueOf(this.f298183h), Integer.valueOf(e74.f298183h)) && C46238a.m51546a(Integer.valueOf(this.f298184i), Integer.valueOf(e74.f298184i)) && C46238a.m51546a(Integer.valueOf(this.f298185j), Integer.valueOf(e74.f298185j)) && C46238a.m51546a(Integer.valueOf(this.f298186n), Integer.valueOf(e74.f298186n)) && C46238a.m51546a(Integer.valueOf(this.f298187o), Integer.valueOf(e74.f298187o)) && C46238a.m51546a(Boolean.valueOf(this.f298188p), Boolean.valueOf(e74.f298188p)) && C46238a.m51546a(Long.valueOf(this.f298189q), Long.valueOf(e74.f298189q)) && C46238a.m51546a(Long.valueOf(this.f298190r), Long.valueOf(e74.f298190r)) && C46238a.m51546a(this.f298191s, e74.f298191s) && C46238a.m51546a(Long.valueOf(this.f298192t), Long.valueOf(e74.f298192t)) && C46238a.m51546a(Double.valueOf(this.f298193u), Double.valueOf(e74.f298193u)) && C46238a.m51546a(Double.valueOf(this.f298194v), Double.valueOf(e74.f298194v)) && C46238a.m51546a(Integer.valueOf(this.f298195w), Integer.valueOf(e74.f298195w)) && C46238a.m51546a(Integer.valueOf(this.f298196x), Integer.valueOf(e74.f298196x)) && C46238a.m51546a(this.f298197y, e74.f298197y) && C46238a.m51546a(Boolean.valueOf(this.f298198z), Boolean.valueOf(e74.f298198z)) && C46238a.m51546a(this.f298178A, e74.f298178A);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298179d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f298180e);
            aVar.mo74318e(3, this.f298181f);
            aVar.mo74318e(4, this.f298182g);
            aVar.mo74318e(5, this.f298183h);
            aVar.mo74318e(6, this.f298184i);
            aVar.mo74318e(7, this.f298185j);
            aVar.mo74318e(8, this.f298186n);
            aVar.mo74318e(9, this.f298187o);
            aVar.mo74314a(10, this.f298188p);
            aVar.mo74321h(11, this.f298189q);
            aVar.mo74321h(12, this.f298190r);
            aVar.mo74320g(13, 8, this.f298191s);
            aVar.mo74321h(14, this.f298192t);
            aVar.mo74316c(15, this.f298193u);
            aVar.mo74316c(16, this.f298194v);
            aVar.mo74318e(17, this.f298195w);
            aVar.mo74318e(18, this.f298196x);
            String str2 = this.f298197y;
            if (str2 != null) {
                aVar.mo74323j(19, str2);
            }
            aVar.mo74314a(20, this.f298198z);
            String str3 = this.f298178A;
            if (str3 != null) {
                aVar.mo74323j(21, str3);
            }
            return 0;
        } else if (i2 == 1) {
            String str4 = this.f298179d;
            if (str4 != null) {
                i3 = C52418a.m58683j(1, str4) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f298180e) + C52418a.m58678e(3, this.f298181f) + C52418a.m58678e(4, this.f298182g) + C52418a.m58678e(5, this.f298183h) + C52418a.m58678e(6, this.f298184i) + C52418a.m58678e(7, this.f298185j) + C52418a.m58678e(8, this.f298186n) + C52418a.m58678e(9, this.f298187o) + C52418a.m58674a(10, this.f298188p) + C52418a.m58681h(11, this.f298189q) + C52418a.m58681h(12, this.f298190r) + C52418a.m58680g(13, 8, this.f298191s) + C52418a.m58681h(14, this.f298192t) + C52418a.m58676c(15, this.f298193u) + C52418a.m58676c(16, this.f298194v) + C52418a.m58678e(17, this.f298195w) + C52418a.m58678e(18, this.f298196x);
            String str5 = this.f298197y;
            if (str5 != null) {
                e += C52418a.m58683j(19, str5);
            }
            int a = e + C52418a.m58674a(20, this.f298198z);
            String str6 = this.f298178A;
            return str6 != null ? a + C52418a.m58683j(21, str6) : a;
        } else if (i2 == 2) {
            this.f298191s.clear();
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
            e74 e74 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e74.f298179d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    e74.f298180e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    e74.f298181f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    e74.f298182g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    e74.f298183h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    e74.f298184i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    e74.f298185j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    e74.f298186n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    e74.f298187o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    e74.f298188p = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    e74.f298189q = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    e74.f298190r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49691he0 he02 = new C49691he0();
                        if (bArr != null && bArr.length > 0) {
                            he02.parseFrom(bArr);
                        }
                        e74.f298191s.add(he02);
                    }
                    return 0;
                case 14:
                    e74.f298192t = aVar3.mo141631i(intValue);
                    return 0;
                case 15:
                    e74.f298193u = aVar3.mo141627e(intValue);
                    return 0;
                case 16:
                    e74.f298194v = aVar3.mo141627e(intValue);
                    return 0;
                case 17:
                    e74.f298195w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    e74.f298196x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    e74.f298197y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    e74.f298198z = aVar3.mo141625c(intValue);
                    return 0;
                case 21:
                    e74.f298178A = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
