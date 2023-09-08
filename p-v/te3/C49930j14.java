package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j14 */
public class C49930j14 extends C47465a {

    /* renamed from: d */
    public String f135818d;

    /* renamed from: e */
    public boolean f135819e;

    /* renamed from: f */
    public String f135820f;

    /* renamed from: g */
    public String f135821g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49930j14)) {
            return false;
        }
        C49930j14 j142 = (C49930j14) aVar;
        return C46238a.m51546a(this.f135818d, j142.f135818d) && C46238a.m51546a(Boolean.valueOf(this.f135819e), Boolean.valueOf(j142.f135819e)) && C46238a.m51546a(this.f135820f, j142.f135820f) && C46238a.m51546a(this.f135821g, j142.f135821g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135818d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74314a(2, this.f135819e);
            String str2 = this.f135820f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f135821g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f135818d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int a = i2 + C52418a.m58674a(2, this.f135819e);
            String str5 = this.f135820f;
            if (str5 != null) {
                a += C52418a.m58683j(3, str5);
            }
            String str6 = this.f135821g;
            return str6 != null ? a + C52418a.m58683j(4, str6) : a;
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
            C49930j14 j142 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j142.f135818d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                j142.f135819e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                j142.f135820f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                j142.f135821g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
