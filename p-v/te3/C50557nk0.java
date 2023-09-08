package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nk0 */
public class C50557nk0 extends C47465a {

    /* renamed from: d */
    public String f138635d;

    /* renamed from: e */
    public String f138636e;

    /* renamed from: f */
    public String f138637f;

    /* renamed from: g */
    public String f138638g;

    /* renamed from: h */
    public int f138639h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50557nk0)) {
            return false;
        }
        C50557nk0 nk02 = (C50557nk0) aVar;
        return C46238a.m51546a(this.f138635d, nk02.f138635d) && C46238a.m51546a(this.f138636e, nk02.f138636e) && C46238a.m51546a(this.f138637f, nk02.f138637f) && C46238a.m51546a(this.f138638g, nk02.f138638g) && C46238a.m51546a(Integer.valueOf(this.f138639h), Integer.valueOf(nk02.f138639h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138635d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138636e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f138637f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f138638g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f138639h);
            return 0;
        } else if (i == 1) {
            String str5 = this.f138635d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f138636e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f138637f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f138638g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58678e(5, this.f138639h);
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
            C50557nk0 nk02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nk02.f138635d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                nk02.f138636e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                nk02.f138637f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                nk02.f138638g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                nk02.f138639h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
