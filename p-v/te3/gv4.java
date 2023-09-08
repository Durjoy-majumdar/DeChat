package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class gv4 extends C47465a {

    /* renamed from: d */
    public String f134302d;

    /* renamed from: e */
    public int f134303e;

    /* renamed from: f */
    public int f134304f;

    /* renamed from: g */
    public int f134305g;

    /* renamed from: h */
    public int f134306h;

    /* renamed from: i */
    public int f134307i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof gv4)) {
            return false;
        }
        gv4 gv4 = (gv4) aVar;
        return C46238a.m51546a(this.f134302d, gv4.f134302d) && C46238a.m51546a(Integer.valueOf(this.f134303e), Integer.valueOf(gv4.f134303e)) && C46238a.m51546a(Integer.valueOf(this.f134304f), Integer.valueOf(gv4.f134304f)) && C46238a.m51546a(Integer.valueOf(this.f134305g), Integer.valueOf(gv4.f134305g)) && C46238a.m51546a(Integer.valueOf(this.f134306h), Integer.valueOf(gv4.f134306h)) && C46238a.m51546a(Integer.valueOf(this.f134307i), Integer.valueOf(gv4.f134307i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134302d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f134303e);
            aVar.mo74318e(3, this.f134304f);
            aVar.mo74318e(4, this.f134305g);
            aVar.mo74318e(5, this.f134306h);
            aVar.mo74318e(6, this.f134307i);
            return 0;
        } else if (i == 1) {
            String str2 = this.f134302d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f134303e) + C52418a.m58678e(3, this.f134304f) + C52418a.m58678e(4, this.f134305g) + C52418a.m58678e(5, this.f134306h) + C52418a.m58678e(6, this.f134307i);
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
            gv4 gv4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gv4.f134302d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    gv4.f134303e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    gv4.f134304f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    gv4.f134305g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    gv4.f134306h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gv4.f134307i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
