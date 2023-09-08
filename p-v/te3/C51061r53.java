package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r53 */
public class C51061r53 extends C47465a {

    /* renamed from: d */
    public String f140711d;

    /* renamed from: e */
    public String f140712e;

    /* renamed from: f */
    public int f140713f;

    /* renamed from: g */
    public String f140714g;

    /* renamed from: h */
    public String f140715h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51061r53)) {
            return false;
        }
        C51061r53 r532 = (C51061r53) aVar;
        return C46238a.m51546a(this.f140711d, r532.f140711d) && C46238a.m51546a(this.f140712e, r532.f140712e) && C46238a.m51546a(Integer.valueOf(this.f140713f), Integer.valueOf(r532.f140713f)) && C46238a.m51546a(this.f140714g, r532.f140714g) && C46238a.m51546a(this.f140715h, r532.f140715h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140711d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140712e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f140713f);
            String str3 = this.f140714g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f140715h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f140711d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f140712e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f140713f);
            String str7 = this.f140714g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f140715h;
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
            C51061r53 r532 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                r532.f140711d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                r532.f140712e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                r532.f140713f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                r532.f140714g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                r532.f140715h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
