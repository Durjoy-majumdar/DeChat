package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.em2 */
public class C49305em2 extends C47465a {

    /* renamed from: d */
    public String f133009d;

    /* renamed from: e */
    public String f133010e;

    /* renamed from: f */
    public String f133011f;

    /* renamed from: g */
    public String f133012g;

    /* renamed from: h */
    public int f133013h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49305em2)) {
            return false;
        }
        C49305em2 em22 = (C49305em2) aVar;
        return C46238a.m51546a(this.f133009d, em22.f133009d) && C46238a.m51546a(this.f133010e, em22.f133010e) && C46238a.m51546a(this.f133011f, em22.f133011f) && C46238a.m51546a(this.f133012g, em22.f133012g) && C46238a.m51546a(Integer.valueOf(this.f133013h), Integer.valueOf(em22.f133013h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133009d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f133010e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f133011f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f133012g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f133013h);
            return 0;
        } else if (i == 1) {
            String str5 = this.f133009d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f133010e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f133011f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f133012g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58678e(5, this.f133013h);
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
            C49305em2 em22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                em22.f133009d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                em22.f133010e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                em22.f133011f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                em22.f133012g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                em22.f133013h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
