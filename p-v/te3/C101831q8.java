package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q8 */
public class C101831q8 extends C47465a {

    /* renamed from: d */
    public long f299197d;

    /* renamed from: e */
    public String f299198e;

    /* renamed from: f */
    public String f299199f;

    /* renamed from: g */
    public int f299200g;

    /* renamed from: h */
    public long f299201h;

    /* renamed from: i */
    public int f299202i;

    /* renamed from: j */
    public int f299203j;

    /* renamed from: n */
    public long f299204n;

    /* renamed from: o */
    public long f299205o;

    /* renamed from: p */
    public int f299206p;

    /* renamed from: q */
    public long f299207q;

    /* renamed from: r */
    public double f299208r;

    /* renamed from: s */
    public int f299209s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101831q8)) {
            return false;
        }
        C101831q8 q8Var = (C101831q8) aVar;
        return C46238a.m51546a(Long.valueOf(this.f299197d), Long.valueOf(q8Var.f299197d)) && C46238a.m51546a(this.f299198e, q8Var.f299198e) && C46238a.m51546a(this.f299199f, q8Var.f299199f) && C46238a.m51546a(Integer.valueOf(this.f299200g), Integer.valueOf(q8Var.f299200g)) && C46238a.m51546a(Long.valueOf(this.f299201h), Long.valueOf(q8Var.f299201h)) && C46238a.m51546a(Integer.valueOf(this.f299202i), Integer.valueOf(q8Var.f299202i)) && C46238a.m51546a(Integer.valueOf(this.f299203j), Integer.valueOf(q8Var.f299203j)) && C46238a.m51546a(Long.valueOf(this.f299204n), Long.valueOf(q8Var.f299204n)) && C46238a.m51546a(Long.valueOf(this.f299205o), Long.valueOf(q8Var.f299205o)) && C46238a.m51546a(Integer.valueOf(this.f299206p), Integer.valueOf(q8Var.f299206p)) && C46238a.m51546a(Long.valueOf(this.f299207q), Long.valueOf(q8Var.f299207q)) && C46238a.m51546a(Double.valueOf(this.f299208r), Double.valueOf(q8Var.f299208r)) && C46238a.m51546a(Integer.valueOf(this.f299209s), Integer.valueOf(q8Var.f299209s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f299197d);
            String str = this.f299198e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f299199f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f299200g);
            aVar.mo74321h(5, this.f299201h);
            aVar.mo74318e(6, this.f299202i);
            aVar.mo74318e(7, this.f299203j);
            aVar.mo74321h(8, this.f299204n);
            aVar.mo74321h(9, this.f299205o);
            aVar.mo74318e(10, this.f299206p);
            aVar.mo74321h(11, this.f299207q);
            aVar.mo74316c(12, this.f299208r);
            aVar.mo74318e(13, this.f299209s);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f299197d) + 0;
            String str3 = this.f299198e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            String str4 = this.f299199f;
            if (str4 != null) {
                h += C52418a.m58683j(3, str4);
            }
            return h + C52418a.m58678e(4, this.f299200g) + C52418a.m58681h(5, this.f299201h) + C52418a.m58678e(6, this.f299202i) + C52418a.m58678e(7, this.f299203j) + C52418a.m58681h(8, this.f299204n) + C52418a.m58681h(9, this.f299205o) + C52418a.m58678e(10, this.f299206p) + C52418a.m58681h(11, this.f299207q) + C52418a.m58676c(12, this.f299208r) + C52418a.m58678e(13, this.f299209s);
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
            C101831q8 q8Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    q8Var.f299197d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    q8Var.f299198e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    q8Var.f299199f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    q8Var.f299200g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    q8Var.f299201h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    q8Var.f299202i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    q8Var.f299203j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    q8Var.f299204n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    q8Var.f299205o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    q8Var.f299206p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    q8Var.f299207q = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    q8Var.f299208r = aVar3.mo141627e(intValue);
                    return 0;
                case 13:
                    q8Var.f299209s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
