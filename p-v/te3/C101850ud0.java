package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ud0 */
public class C101850ud0 extends C47465a {

    /* renamed from: d */
    public String f299618d;

    /* renamed from: e */
    public boolean f299619e = false;

    /* renamed from: f */
    public String f299620f;

    /* renamed from: g */
    public boolean f299621g = false;

    /* renamed from: h */
    public String f299622h;

    /* renamed from: i */
    public boolean f299623i = false;

    /* renamed from: j */
    public String f299624j;

    /* renamed from: n */
    public boolean f299625n = false;

    /* renamed from: b */
    public final String mo141311b() {
        return this.f299620f;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101850ud0)) {
            return false;
        }
        C101850ud0 ud02 = (C101850ud0) aVar;
        return C46238a.m51546a(this.f299618d, ud02.f299618d) && C46238a.m51546a(this.f299620f, ud02.f299620f) && C46238a.m51546a(this.f299622h, ud02.f299622h) && C46238a.m51546a(this.f299624j, ud02.f299624j);
    }

    /* renamed from: d */
    public final String mo141312d() {
        return this.f299624j;
    }

    /* renamed from: f */
    public final String mo141313f() {
        return this.f299622h;
    }

    /* renamed from: j */
    public final String mo141314j() {
        return this.f299618d;
    }

    /* renamed from: k */
    public final C101850ud0 mo141315k(String str) {
        this.f299620f = str;
        this.f299621g = true;
        return this;
    }

    /* renamed from: l */
    public final C101850ud0 mo141316l(String str) {
        this.f299624j = str;
        this.f299625n = true;
        return this;
    }

    /* renamed from: m */
    public final C101850ud0 mo141317m(String str) {
        this.f299622h = str;
        this.f299623i = true;
        return this;
    }

    /* renamed from: n */
    public final C101850ud0 mo141318n(String str) {
        this.f299618d = str;
        this.f299619e = true;
        return this;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299618d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299620f;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f299622h;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f299624j;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f299618d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f299620f;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f299622h;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f299624j;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
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
            C101850ud0 ud02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ud02.f299618d = aVar3.mo141633k(intValue);
                ud02.f299619e = true;
                return 0;
            } else if (intValue == 2) {
                ud02.f299620f = aVar3.mo141633k(intValue);
                ud02.f299621g = true;
                return 0;
            } else if (intValue == 3) {
                ud02.f299622h = aVar3.mo141633k(intValue);
                ud02.f299623i = true;
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ud02.f299624j = aVar3.mo141633k(intValue);
                ud02.f299625n = true;
                return 0;
            }
        }
    }
}
