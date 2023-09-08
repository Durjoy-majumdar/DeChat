package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class cb4 extends C47465a {

    /* renamed from: d */
    public int f298022d;

    /* renamed from: e */
    public String f298023e;

    /* renamed from: f */
    public String f298024f;

    /* renamed from: g */
    public int f298025g;

    /* renamed from: h */
    public String f298026h;

    /* renamed from: i */
    public int f298027i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof cb4)) {
            return false;
        }
        cb4 cb4 = (cb4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298022d), Integer.valueOf(cb4.f298022d)) && C46238a.m51546a(this.f298023e, cb4.f298023e) && C46238a.m51546a(this.f298024f, cb4.f298024f) && C46238a.m51546a(Integer.valueOf(this.f298025g), Integer.valueOf(cb4.f298025g)) && C46238a.m51546a(this.f298026h, cb4.f298026h) && C46238a.m51546a(Integer.valueOf(this.f298027i), Integer.valueOf(cb4.f298027i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298022d);
            String str = this.f298023e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f298024f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f298025g);
            String str3 = this.f298026h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f298027i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f298022d) + 0;
            String str4 = this.f298023e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f298024f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f298025g);
            String str6 = this.f298026h;
            if (str6 != null) {
                e2 += C52418a.m58683j(5, str6);
            }
            return e2 + C52418a.m58678e(6, this.f298027i);
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
            cb4 cb4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cb4.f298022d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    cb4.f298023e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cb4.f298024f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    cb4.f298025g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    cb4.f298026h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cb4.f298027i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
