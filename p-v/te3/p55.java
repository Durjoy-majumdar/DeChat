package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class p55 extends C47465a {

    /* renamed from: d */
    public String f184753d;

    /* renamed from: e */
    public C89349b f184754e;

    /* renamed from: f */
    public String f184755f;

    /* renamed from: g */
    public String f184756g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof p55)) {
            return false;
        }
        p55 p55 = (p55) aVar;
        return C46238a.m51546a(this.f184753d, p55.f184753d) && C46238a.m51546a(this.f184754e, p55.f184754e) && C46238a.m51546a(this.f184755f, p55.f184755f) && C46238a.m51546a(this.f184756g, p55.f184756g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184753d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C89349b bVar = this.f184754e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            String str2 = this.f184755f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f184756g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f184753d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            C89349b bVar2 = this.f184754e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            String str5 = this.f184755f;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f184756g;
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
            p55 p55 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p55.f184753d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                p55.f184754e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                p55.f184755f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                p55.f184756g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
