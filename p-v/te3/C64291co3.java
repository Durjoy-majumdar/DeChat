package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.co3 */
public class C64291co3 extends C47465a {

    /* renamed from: d */
    public int f182539d;

    /* renamed from: e */
    public int f182540e;

    /* renamed from: f */
    public String f182541f;

    /* renamed from: g */
    public int f182542g;

    /* renamed from: h */
    public int f182543h;

    /* renamed from: i */
    public int f182544i;

    /* renamed from: j */
    public String f182545j;

    /* renamed from: n */
    public String f182546n;

    /* renamed from: o */
    public int f182547o;

    /* renamed from: p */
    public int f182548p;

    /* renamed from: q */
    public String f182549q;

    /* renamed from: r */
    public long f182550r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64291co3)) {
            return false;
        }
        C64291co3 co32 = (C64291co3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182539d), Integer.valueOf(co32.f182539d)) && C46238a.m51546a(Integer.valueOf(this.f182540e), Integer.valueOf(co32.f182540e)) && C46238a.m51546a(this.f182541f, co32.f182541f) && C46238a.m51546a(Integer.valueOf(this.f182542g), Integer.valueOf(co32.f182542g)) && C46238a.m51546a(Integer.valueOf(this.f182543h), Integer.valueOf(co32.f182543h)) && C46238a.m51546a(Integer.valueOf(this.f182544i), Integer.valueOf(co32.f182544i)) && C46238a.m51546a(this.f182545j, co32.f182545j) && C46238a.m51546a(this.f182546n, co32.f182546n) && C46238a.m51546a(Integer.valueOf(this.f182547o), Integer.valueOf(co32.f182547o)) && C46238a.m51546a(Integer.valueOf(this.f182548p), Integer.valueOf(co32.f182548p)) && C46238a.m51546a(this.f182549q, co32.f182549q) && C46238a.m51546a(Long.valueOf(this.f182550r), Long.valueOf(co32.f182550r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182539d);
            aVar.mo74318e(2, this.f182540e);
            String str = this.f182541f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f182542g);
            aVar.mo74318e(5, this.f182543h);
            aVar.mo74318e(6, this.f182544i);
            String str2 = this.f182545j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            String str3 = this.f182546n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            aVar.mo74318e(9, this.f182547o);
            aVar.mo74318e(10, this.f182548p);
            String str4 = this.f182549q;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            aVar.mo74321h(12, this.f182550r);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182539d) + 0 + C52418a.m58678e(2, this.f182540e);
            String str5 = this.f182541f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f182542g) + C52418a.m58678e(5, this.f182543h) + C52418a.m58678e(6, this.f182544i);
            String str6 = this.f182545j;
            if (str6 != null) {
                e2 += C52418a.m58683j(7, str6);
            }
            String str7 = this.f182546n;
            if (str7 != null) {
                e2 += C52418a.m58683j(8, str7);
            }
            int e3 = e2 + C52418a.m58678e(9, this.f182547o) + C52418a.m58678e(10, this.f182548p);
            String str8 = this.f182549q;
            if (str8 != null) {
                e3 += C52418a.m58683j(11, str8);
            }
            return e3 + C52418a.m58681h(12, this.f182550r);
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
            C64291co3 co32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    co32.f182539d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    co32.f182540e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    co32.f182541f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    co32.f182542g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    co32.f182543h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    co32.f182544i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    co32.f182545j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    co32.f182546n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    co32.f182547o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    co32.f182548p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    co32.f182549q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    co32.f182550r = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
