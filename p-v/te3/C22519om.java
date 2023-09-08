package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.om */
public class C22519om extends C47465a {

    /* renamed from: d */
    public String f64357d;

    /* renamed from: e */
    public int f64358e;

    /* renamed from: f */
    public String f64359f;

    /* renamed from: g */
    public String f64360g;

    /* renamed from: h */
    public String f64361h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22519om)) {
            return false;
        }
        C22519om omVar = (C22519om) aVar;
        return C46238a.m51546a(this.f64357d, omVar.f64357d) && C46238a.m51546a(Integer.valueOf(this.f64358e), Integer.valueOf(omVar.f64358e)) && C46238a.m51546a(this.f64359f, omVar.f64359f) && C46238a.m51546a(this.f64360g, omVar.f64360g) && C46238a.m51546a(this.f64361h, omVar.f64361h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64357d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f64358e);
            String str2 = this.f64359f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f64360g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f64361h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f64357d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f64358e);
            String str6 = this.f64359f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f64360g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f64361h;
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
            C22519om omVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                omVar.f64357d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                omVar.f64358e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                omVar.f64359f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                omVar.f64360g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                omVar.f64361h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
