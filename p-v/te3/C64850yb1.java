package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yb1 */
public class C64850yb1 extends C47465a {

    /* renamed from: d */
    public String f186466d;

    /* renamed from: e */
    public int f186467e;

    /* renamed from: f */
    public int f186468f;

    /* renamed from: g */
    public String f186469g;

    /* renamed from: h */
    public int f186470h;

    /* renamed from: i */
    public float f186471i;

    /* renamed from: j */
    public int f186472j;

    /* renamed from: n */
    public int f186473n;

    /* renamed from: o */
    public int f186474o;

    /* renamed from: p */
    public int f186475p;

    /* renamed from: q */
    public int f186476q;

    /* renamed from: r */
    public int f186477r;

    /* renamed from: s */
    public int f186478s;

    /* renamed from: t */
    public int f186479t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64850yb1)) {
            return false;
        }
        C64850yb1 yb12 = (C64850yb1) aVar;
        return C46238a.m51546a(this.f186466d, yb12.f186466d) && C46238a.m51546a(Integer.valueOf(this.f186467e), Integer.valueOf(yb12.f186467e)) && C46238a.m51546a(Integer.valueOf(this.f186468f), Integer.valueOf(yb12.f186468f)) && C46238a.m51546a(this.f186469g, yb12.f186469g) && C46238a.m51546a(Integer.valueOf(this.f186470h), Integer.valueOf(yb12.f186470h)) && C46238a.m51546a(Float.valueOf(this.f186471i), Float.valueOf(yb12.f186471i)) && C46238a.m51546a(Integer.valueOf(this.f186472j), Integer.valueOf(yb12.f186472j)) && C46238a.m51546a(Integer.valueOf(this.f186473n), Integer.valueOf(yb12.f186473n)) && C46238a.m51546a(Integer.valueOf(this.f186474o), Integer.valueOf(yb12.f186474o)) && C46238a.m51546a(Integer.valueOf(this.f186475p), Integer.valueOf(yb12.f186475p)) && C46238a.m51546a(Integer.valueOf(this.f186476q), Integer.valueOf(yb12.f186476q)) && C46238a.m51546a(Integer.valueOf(this.f186477r), Integer.valueOf(yb12.f186477r)) && C46238a.m51546a(Integer.valueOf(this.f186478s), Integer.valueOf(yb12.f186478s)) && C46238a.m51546a(Integer.valueOf(this.f186479t), Integer.valueOf(yb12.f186479t));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186466d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f186467e);
            aVar.mo74318e(3, this.f186468f);
            String str2 = this.f186469g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f186470h);
            aVar.mo74317d(6, this.f186471i);
            aVar.mo74318e(7, this.f186472j);
            aVar.mo74318e(8, this.f186473n);
            aVar.mo74318e(9, this.f186474o);
            aVar.mo74318e(10, this.f186475p);
            aVar.mo74318e(11, this.f186476q);
            aVar.mo74318e(12, this.f186477r);
            aVar.mo74318e(13, this.f186478s);
            aVar.mo74318e(14, this.f186479t);
            return 0;
        } else if (i2 == 1) {
            String str3 = this.f186466d;
            if (str3 != null) {
                i3 = C52418a.m58683j(1, str3) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f186467e) + C52418a.m58678e(3, this.f186468f);
            String str4 = this.f186469g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58678e(5, this.f186470h) + C52418a.m58677d(6, this.f186471i) + C52418a.m58678e(7, this.f186472j) + C52418a.m58678e(8, this.f186473n) + C52418a.m58678e(9, this.f186474o) + C52418a.m58678e(10, this.f186475p) + C52418a.m58678e(11, this.f186476q) + C52418a.m58678e(12, this.f186477r) + C52418a.m58678e(13, this.f186478s) + C52418a.m58678e(14, this.f186479t);
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
            C64850yb1 yb12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yb12.f186466d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    yb12.f186467e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    yb12.f186468f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    yb12.f186469g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    yb12.f186470h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    yb12.f186471i = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    yb12.f186472j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    yb12.f186473n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    yb12.f186474o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    yb12.f186475p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    yb12.f186476q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    yb12.f186477r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    yb12.f186478s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    yb12.f186479t = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
