package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gy */
public class C64406gy extends C47465a {

    /* renamed from: d */
    public int f183366d;

    /* renamed from: e */
    public int f183367e;

    /* renamed from: f */
    public int f183368f;

    /* renamed from: g */
    public int f183369g;

    /* renamed from: h */
    public int f183370h;

    /* renamed from: i */
    public int f183371i;

    /* renamed from: j */
    public int f183372j;

    /* renamed from: n */
    public boolean f183373n;

    /* renamed from: o */
    public boolean f183374o;

    /* renamed from: p */
    public String f183375p;

    /* renamed from: q */
    public String f183376q;

    /* renamed from: r */
    public int f183377r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64406gy)) {
            return false;
        }
        C64406gy gyVar = (C64406gy) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183366d), Integer.valueOf(gyVar.f183366d)) && C46238a.m51546a(Integer.valueOf(this.f183367e), Integer.valueOf(gyVar.f183367e)) && C46238a.m51546a(Integer.valueOf(this.f183368f), Integer.valueOf(gyVar.f183368f)) && C46238a.m51546a(Integer.valueOf(this.f183369g), Integer.valueOf(gyVar.f183369g)) && C46238a.m51546a(Integer.valueOf(this.f183370h), Integer.valueOf(gyVar.f183370h)) && C46238a.m51546a(Integer.valueOf(this.f183371i), Integer.valueOf(gyVar.f183371i)) && C46238a.m51546a(Integer.valueOf(this.f183372j), Integer.valueOf(gyVar.f183372j)) && C46238a.m51546a(Boolean.valueOf(this.f183373n), Boolean.valueOf(gyVar.f183373n)) && C46238a.m51546a(Boolean.valueOf(this.f183374o), Boolean.valueOf(gyVar.f183374o)) && C46238a.m51546a(this.f183375p, gyVar.f183375p) && C46238a.m51546a(this.f183376q, gyVar.f183376q) && C46238a.m51546a(Integer.valueOf(this.f183377r), Integer.valueOf(gyVar.f183377r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183366d);
            aVar.mo74318e(2, this.f183367e);
            aVar.mo74318e(3, this.f183368f);
            aVar.mo74318e(4, this.f183369g);
            aVar.mo74318e(5, this.f183370h);
            aVar.mo74318e(6, this.f183371i);
            aVar.mo74318e(7, this.f183372j);
            aVar.mo74314a(8, this.f183373n);
            aVar.mo74314a(9, this.f183374o);
            String str = this.f183375p;
            if (str != null) {
                aVar.mo74323j(10, str);
            }
            String str2 = this.f183376q;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            aVar.mo74318e(12, this.f183377r);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183366d) + 0 + C52418a.m58678e(2, this.f183367e) + C52418a.m58678e(3, this.f183368f) + C52418a.m58678e(4, this.f183369g) + C52418a.m58678e(5, this.f183370h) + C52418a.m58678e(6, this.f183371i) + C52418a.m58678e(7, this.f183372j) + C52418a.m58674a(8, this.f183373n) + C52418a.m58674a(9, this.f183374o);
            String str3 = this.f183375p;
            if (str3 != null) {
                e += C52418a.m58683j(10, str3);
            }
            String str4 = this.f183376q;
            if (str4 != null) {
                e += C52418a.m58683j(11, str4);
            }
            return e + C52418a.m58678e(12, this.f183377r);
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
            C64406gy gyVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gyVar.f183366d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    gyVar.f183367e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    gyVar.f183368f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    gyVar.f183369g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    gyVar.f183370h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gyVar.f183371i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    gyVar.f183372j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    gyVar.f183373n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    gyVar.f183374o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    gyVar.f183375p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    gyVar.f183376q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    gyVar.f183377r = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
