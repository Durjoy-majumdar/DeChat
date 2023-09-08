package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class d45 extends C47465a {

    /* renamed from: d */
    public String f132111d;

    /* renamed from: e */
    public String f132112e;

    /* renamed from: f */
    public String f132113f;

    /* renamed from: g */
    public int f132114g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof d45)) {
            return false;
        }
        d45 d45 = (d45) aVar;
        return C46238a.m51546a(this.f132111d, d45.f132111d) && C46238a.m51546a(this.f132112e, d45.f132112e) && C46238a.m51546a(this.f132113f, d45.f132113f) && C46238a.m51546a(Integer.valueOf(this.f132114g), Integer.valueOf(d45.f132114g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132111d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f132112e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f132113f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f132114g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f132111d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f132112e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f132113f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f132114g);
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
            d45 d45 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d45.f132111d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                d45.f132112e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                d45.f132113f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                d45.f132114g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
