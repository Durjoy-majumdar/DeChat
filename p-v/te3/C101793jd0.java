package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jd0 */
public class C101793jd0 extends C47465a {

    /* renamed from: d */
    public String f298511d;

    /* renamed from: e */
    public boolean f298512e = false;

    /* renamed from: f */
    public String f298513f;

    /* renamed from: g */
    public boolean f298514g = false;

    /* renamed from: h */
    public String f298515h;

    /* renamed from: i */
    public boolean f298516i = false;

    /* renamed from: j */
    public String f298517j;

    /* renamed from: n */
    public boolean f298518n = false;

    /* renamed from: o */
    public int f298519o;

    /* renamed from: p */
    public boolean f298520p = false;

    /* renamed from: b */
    public final String mo141199b() {
        return this.f298513f;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101793jd0)) {
            return false;
        }
        C101793jd0 jd02 = (C101793jd0) aVar;
        return C46238a.m51546a(this.f298511d, jd02.f298511d) && C46238a.m51546a(this.f298513f, jd02.f298513f) && C46238a.m51546a(this.f298515h, jd02.f298515h) && C46238a.m51546a(this.f298517j, jd02.f298517j) && C46238a.m51546a(Integer.valueOf(this.f298519o), Integer.valueOf(jd02.f298519o));
    }

    /* renamed from: d */
    public final String mo141200d() {
        return this.f298517j;
    }

    /* renamed from: f */
    public final String mo141201f() {
        return this.f298515h;
    }

    /* renamed from: j */
    public final String mo141202j() {
        return this.f298511d;
    }

    /* renamed from: k */
    public final int mo141203k() {
        return this.f298519o;
    }

    /* renamed from: l */
    public final C101793jd0 mo141204l(String str) {
        this.f298513f = str;
        this.f298514g = true;
        return this;
    }

    /* renamed from: m */
    public final C101793jd0 mo141205m(String str) {
        this.f298517j = str;
        this.f298518n = true;
        return this;
    }

    /* renamed from: n */
    public final C101793jd0 mo141206n(String str) {
        this.f298515h = str;
        this.f298516i = true;
        return this;
    }

    /* renamed from: o */
    public final C101793jd0 mo141207o(String str) {
        this.f298511d = str;
        this.f298512e = true;
        return this;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298511d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f298513f;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f298515h;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f298517j;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            if (this.f298520p) {
                aVar.mo74318e(5, this.f298519o);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f298511d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f298513f;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f298515h;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f298517j;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return this.f298520p ? i2 + C52418a.m58678e(5, this.f298519o) : i2;
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
            C101793jd0 jd02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jd02.f298511d = aVar3.mo141633k(intValue);
                jd02.f298512e = true;
                return 0;
            } else if (intValue == 2) {
                jd02.f298513f = aVar3.mo141633k(intValue);
                jd02.f298514g = true;
                return 0;
            } else if (intValue == 3) {
                jd02.f298515h = aVar3.mo141633k(intValue);
                jd02.f298516i = true;
                return 0;
            } else if (intValue == 4) {
                jd02.f298517j = aVar3.mo141633k(intValue);
                jd02.f298518n = true;
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                jd02.f298519o = aVar3.mo141629g(intValue);
                jd02.f298520p = true;
                return 0;
            }
        }
    }

    /* renamed from: p */
    public final C101793jd0 mo141208p(int i) {
        this.f298519o = i;
        this.f298520p = true;
        return this;
    }
}
