package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x23 */
public class C101864x23 extends C47465a {

    /* renamed from: d */
    public String f299812d;

    /* renamed from: e */
    public int f299813e;

    /* renamed from: f */
    public String f299814f;

    /* renamed from: g */
    public int f299815g;

    /* renamed from: h */
    public String f299816h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101864x23)) {
            return false;
        }
        C101864x23 x232 = (C101864x23) aVar;
        return C46238a.m51546a(this.f299812d, x232.f299812d) && C46238a.m51546a(Integer.valueOf(this.f299813e), Integer.valueOf(x232.f299813e)) && C46238a.m51546a(this.f299814f, x232.f299814f) && C46238a.m51546a(Integer.valueOf(this.f299815g), Integer.valueOf(x232.f299815g)) && C46238a.m51546a(this.f299816h, x232.f299816h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299812d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f299813e);
            String str2 = this.f299814f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f299815g);
            String str3 = this.f299816h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f299812d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f299813e);
            String str5 = this.f299814f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f299815g);
            String str6 = this.f299816h;
            return str6 != null ? e2 + C52418a.m58683j(5, str6) : e2;
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
            C101864x23 x232 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                x232.f299812d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                x232.f299813e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                x232.f299814f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                x232.f299815g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                x232.f299816h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
