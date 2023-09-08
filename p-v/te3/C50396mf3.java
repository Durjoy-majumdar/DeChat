package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mf3 */
public class C50396mf3 extends C47465a {

    /* renamed from: d */
    public String f138006d;

    /* renamed from: e */
    public String f138007e;

    /* renamed from: f */
    public String f138008f;

    /* renamed from: g */
    public String f138009g;

    /* renamed from: h */
    public int f138010h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50396mf3)) {
            return false;
        }
        C50396mf3 mf32 = (C50396mf3) aVar;
        return C46238a.m51546a(this.f138006d, mf32.f138006d) && C46238a.m51546a(this.f138007e, mf32.f138007e) && C46238a.m51546a(this.f138008f, mf32.f138008f) && C46238a.m51546a(this.f138009g, mf32.f138009g) && C46238a.m51546a(Integer.valueOf(this.f138010h), Integer.valueOf(mf32.f138010h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138006d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138007e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f138008f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f138009g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f138010h);
            return 0;
        } else if (i == 1) {
            String str5 = this.f138006d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f138007e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f138008f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f138009g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58678e(5, this.f138010h);
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
            C50396mf3 mf32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mf32.f138006d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                mf32.f138007e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                mf32.f138008f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                mf32.f138009g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                mf32.f138010h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
