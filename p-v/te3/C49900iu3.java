package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iu3 */
public class C49900iu3 extends C47465a {

    /* renamed from: d */
    public String f135679d;

    /* renamed from: e */
    public String f135680e;

    /* renamed from: f */
    public int f135681f;

    /* renamed from: g */
    public int f135682g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49900iu3)) {
            return false;
        }
        C49900iu3 iu32 = (C49900iu3) aVar;
        return C46238a.m51546a(this.f135679d, iu32.f135679d) && C46238a.m51546a(this.f135680e, iu32.f135680e) && C46238a.m51546a(Integer.valueOf(this.f135681f), Integer.valueOf(iu32.f135681f)) && C46238a.m51546a(Integer.valueOf(this.f135682g), Integer.valueOf(iu32.f135682g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135679d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135680e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f135681f);
            aVar.mo74318e(4, this.f135682g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f135679d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f135680e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f135681f) + C52418a.m58678e(4, this.f135682g);
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
            C49900iu3 iu32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                iu32.f135679d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                iu32.f135680e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                iu32.f135681f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                iu32.f135682g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
