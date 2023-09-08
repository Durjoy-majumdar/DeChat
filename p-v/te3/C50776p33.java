package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p33 */
public class C50776p33 extends C47465a {

    /* renamed from: d */
    public int f139548d;

    /* renamed from: e */
    public String f139549e;

    /* renamed from: f */
    public String f139550f;

    /* renamed from: g */
    public String f139551g;

    /* renamed from: h */
    public String f139552h;

    /* renamed from: i */
    public int f139553i;

    /* renamed from: j */
    public int f139554j;

    /* renamed from: n */
    public String f139555n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50776p33)) {
            return false;
        }
        C50776p33 p332 = (C50776p33) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139548d), Integer.valueOf(p332.f139548d)) && C46238a.m51546a(this.f139549e, p332.f139549e) && C46238a.m51546a(this.f139550f, p332.f139550f) && C46238a.m51546a(this.f139551g, p332.f139551g) && C46238a.m51546a(this.f139552h, p332.f139552h) && C46238a.m51546a(Integer.valueOf(this.f139553i), Integer.valueOf(p332.f139553i)) && C46238a.m51546a(Integer.valueOf(this.f139554j), Integer.valueOf(p332.f139554j)) && C46238a.m51546a(this.f139555n, p332.f139555n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139548d);
            String str = this.f139549e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f139550f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f139551g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f139552h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f139553i);
            aVar.mo74318e(7, this.f139554j);
            String str5 = this.f139555n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139548d) + 0;
            String str6 = this.f139549e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f139550f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f139551g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f139552h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            int e2 = e + C52418a.m58678e(6, this.f139553i) + C52418a.m58678e(7, this.f139554j);
            String str10 = this.f139555n;
            return str10 != null ? e2 + C52418a.m58683j(8, str10) : e2;
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
            C50776p33 p332 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    p332.f139548d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    p332.f139549e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    p332.f139550f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    p332.f139551g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    p332.f139552h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    p332.f139553i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    p332.f139554j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    p332.f139555n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
