package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rn3 */
public class C51132rn3 extends C47465a {

    /* renamed from: d */
    public String f141051d;

    /* renamed from: e */
    public int f141052e;

    /* renamed from: f */
    public String f141053f;

    /* renamed from: g */
    public int f141054g;

    /* renamed from: h */
    public int f141055h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51132rn3)) {
            return false;
        }
        C51132rn3 rn32 = (C51132rn3) aVar;
        return C46238a.m51546a(this.f141051d, rn32.f141051d) && C46238a.m51546a(Integer.valueOf(this.f141052e), Integer.valueOf(rn32.f141052e)) && C46238a.m51546a(this.f141053f, rn32.f141053f) && C46238a.m51546a(Integer.valueOf(this.f141054g), Integer.valueOf(rn32.f141054g)) && C46238a.m51546a(Integer.valueOf(this.f141055h), Integer.valueOf(rn32.f141055h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141051d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f141052e);
            String str2 = this.f141053f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f141054g);
            aVar.mo74318e(5, this.f141055h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f141051d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f141052e);
            String str4 = this.f141053f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.f141054g) + C52418a.m58678e(5, this.f141055h);
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
            C51132rn3 rn32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rn32.f141051d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                rn32.f141052e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                rn32.f141053f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                rn32.f141054g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                rn32.f141055h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
