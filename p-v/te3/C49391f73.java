package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f73 */
public class C49391f73 extends C47465a {

    /* renamed from: d */
    public String f133330d;

    /* renamed from: e */
    public String f133331e = "WGS84";

    /* renamed from: f */
    public double f133332f;

    /* renamed from: g */
    public double f133333g;

    /* renamed from: h */
    public double f133334h;

    /* renamed from: i */
    public int f133335i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49391f73)) {
            return false;
        }
        C49391f73 f732 = (C49391f73) aVar;
        return C46238a.m51546a(this.f133330d, f732.f133330d) && C46238a.m51546a(this.f133331e, f732.f133331e) && C46238a.m51546a(Double.valueOf(this.f133332f), Double.valueOf(f732.f133332f)) && C46238a.m51546a(Double.valueOf(this.f133333g), Double.valueOf(f732.f133333g)) && C46238a.m51546a(Double.valueOf(this.f133334h), Double.valueOf(f732.f133334h)) && C46238a.m51546a(Integer.valueOf(this.f133335i), Integer.valueOf(f732.f133335i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133330d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f133331e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74316c(3, this.f133332f);
            aVar.mo74316c(4, this.f133333g);
            aVar.mo74316c(5, this.f133334h);
            aVar.mo74318e(6, this.f133335i);
            return 0;
        } else if (i == 1) {
            String str3 = this.f133330d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f133331e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58676c(3, this.f133332f) + C52418a.m58676c(4, this.f133333g) + C52418a.m58676c(5, this.f133334h) + C52418a.m58678e(6, this.f133335i);
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
            C49391f73 f732 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    f732.f133330d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    f732.f133331e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    f732.f133332f = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    f732.f133333g = aVar3.mo141627e(intValue);
                    return 0;
                case 5:
                    f732.f133334h = aVar3.mo141627e(intValue);
                    return 0;
                case 6:
                    f732.f133335i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
