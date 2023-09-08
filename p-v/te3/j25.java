package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class j25 extends C47465a {

    /* renamed from: d */
    public int f135831d;

    /* renamed from: e */
    public String f135832e;

    /* renamed from: f */
    public String f135833f;

    /* renamed from: g */
    public int f135834g;

    /* renamed from: h */
    public String f135835h;

    /* renamed from: i */
    public int f135836i;

    /* renamed from: j */
    public int f135837j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof j25)) {
            return false;
        }
        j25 j25 = (j25) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135831d), Integer.valueOf(j25.f135831d)) && C46238a.m51546a(this.f135832e, j25.f135832e) && C46238a.m51546a(this.f135833f, j25.f135833f) && C46238a.m51546a(Integer.valueOf(this.f135834g), Integer.valueOf(j25.f135834g)) && C46238a.m51546a(this.f135835h, j25.f135835h) && C46238a.m51546a(Integer.valueOf(this.f135836i), Integer.valueOf(j25.f135836i)) && C46238a.m51546a(Integer.valueOf(this.f135837j), Integer.valueOf(j25.f135837j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135831d);
            String str = this.f135832e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f135833f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f135834g);
            String str3 = this.f135835h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f135836i);
            aVar.mo74318e(7, this.f135837j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f135831d) + 0;
            String str4 = this.f135832e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f135833f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f135834g);
            String str6 = this.f135835h;
            if (str6 != null) {
                e2 += C52418a.m58683j(5, str6);
            }
            return e2 + C52418a.m58678e(6, this.f135836i) + C52418a.m58678e(7, this.f135837j);
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
            j25 j25 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    j25.f135831d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    j25.f135832e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    j25.f135833f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    j25.f135834g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    j25.f135835h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    j25.f135836i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    j25.f135837j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
