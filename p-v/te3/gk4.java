package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class gk4 extends C47465a {

    /* renamed from: d */
    public int f134109d;

    /* renamed from: e */
    public int f134110e;

    /* renamed from: f */
    public String f134111f;

    /* renamed from: g */
    public C89349b f134112g;

    /* renamed from: h */
    public int f134113h;

    /* renamed from: i */
    public int f134114i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof gk4)) {
            return false;
        }
        gk4 gk4 = (gk4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134109d), Integer.valueOf(gk4.f134109d)) && C46238a.m51546a(Integer.valueOf(this.f134110e), Integer.valueOf(gk4.f134110e)) && C46238a.m51546a(this.f134111f, gk4.f134111f) && C46238a.m51546a(this.f134112g, gk4.f134112g) && C46238a.m51546a(Integer.valueOf(this.f134113h), Integer.valueOf(gk4.f134113h)) && C46238a.m51546a(Integer.valueOf(this.f134114i), Integer.valueOf(gk4.f134114i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f134109d);
            aVar.mo74318e(2, this.f134110e);
            String str = this.f134111f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f134112g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f134113h);
            aVar.mo74318e(6, this.f134114i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f134109d) + 0 + C52418a.m58678e(2, this.f134110e);
            String str2 = this.f134111f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f134112g;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            return e + C52418a.m58678e(5, this.f134113h) + C52418a.m58678e(6, this.f134114i);
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
            gk4 gk4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gk4.f134109d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    gk4.f134110e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    gk4.f134111f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gk4.f134112g = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    gk4.f134113h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gk4.f134114i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
