package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ch2 */
public class C101764ch2 extends C47465a {

    /* renamed from: d */
    public int f298028d;

    /* renamed from: e */
    public String f298029e;

    /* renamed from: f */
    public String f298030f;

    /* renamed from: g */
    public String f298031g;

    /* renamed from: h */
    public String f298032h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101764ch2)) {
            return false;
        }
        C101764ch2 ch22 = (C101764ch2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298028d), Integer.valueOf(ch22.f298028d)) && C46238a.m51546a(this.f298029e, ch22.f298029e) && C46238a.m51546a(this.f298030f, ch22.f298030f) && C46238a.m51546a(this.f298031g, ch22.f298031g) && C46238a.m51546a(this.f298032h, ch22.f298032h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298028d);
            String str = this.f298029e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f298030f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f298031g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f298032h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f298028d) + 0;
            String str5 = this.f298029e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            String str6 = this.f298030f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f298031g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f298032h;
            return str8 != null ? e + C52418a.m58683j(5, str8) : e;
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
            C101764ch2 ch22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ch22.f298028d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ch22.f298029e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ch22.f298030f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                ch22.f298031g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ch22.f298032h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
