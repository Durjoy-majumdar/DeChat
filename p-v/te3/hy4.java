package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class hy4 extends C47465a {

    /* renamed from: d */
    public String f134977d;

    /* renamed from: e */
    public C89349b f134978e;

    /* renamed from: f */
    public String f134979f;

    /* renamed from: g */
    public String f134980g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof hy4)) {
            return false;
        }
        hy4 hy4 = (hy4) aVar;
        return C46238a.m51546a(this.f134977d, hy4.f134977d) && C46238a.m51546a(this.f134978e, hy4.f134978e) && C46238a.m51546a(this.f134979f, hy4.f134979f) && C46238a.m51546a(this.f134980g, hy4.f134980g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134977d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C89349b bVar = this.f134978e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            String str2 = this.f134979f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f134980g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f134977d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            C89349b bVar2 = this.f134978e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            String str5 = this.f134979f;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f134980g;
            return str6 != null ? i2 + C52418a.m58683j(4, str6) : i2;
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
            hy4 hy4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hy4.f134977d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                hy4.f134978e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                hy4.f134979f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                hy4.f134980g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
