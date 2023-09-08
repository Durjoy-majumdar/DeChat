package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.df1 */
public class C49138df1 extends C47465a {

    /* renamed from: d */
    public int f132282d;

    /* renamed from: e */
    public int f132283e;

    /* renamed from: f */
    public String f132284f;

    /* renamed from: g */
    public String f132285g;

    /* renamed from: h */
    public String f132286h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49138df1)) {
            return false;
        }
        C49138df1 df12 = (C49138df1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132282d), Integer.valueOf(df12.f132282d)) && C46238a.m51546a(Integer.valueOf(this.f132283e), Integer.valueOf(df12.f132283e)) && C46238a.m51546a(this.f132284f, df12.f132284f) && C46238a.m51546a(this.f132285g, df12.f132285g) && C46238a.m51546a(this.f132286h, df12.f132286h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132282d);
            aVar.mo74318e(2, this.f132283e);
            String str = this.f132284f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f132285g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f132286h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132282d) + 0 + C52418a.m58678e(2, this.f132283e);
            String str4 = this.f132284f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f132285g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f132286h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C49138df1 df12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                df12.f132282d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                df12.f132283e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                df12.f132284f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                df12.f132285g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                df12.f132286h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
