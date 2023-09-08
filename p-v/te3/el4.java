package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class el4 extends C47465a {

    /* renamed from: d */
    public String f132998d;

    /* renamed from: e */
    public int f132999e;

    /* renamed from: f */
    public String f133000f;

    /* renamed from: g */
    public String f133001g;

    /* renamed from: h */
    public int f133002h;

    /* renamed from: i */
    public int f133003i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof el4)) {
            return false;
        }
        el4 el4 = (el4) aVar;
        return C46238a.m51546a(this.f132998d, el4.f132998d) && C46238a.m51546a(Integer.valueOf(this.f132999e), Integer.valueOf(el4.f132999e)) && C46238a.m51546a(this.f133000f, el4.f133000f) && C46238a.m51546a(this.f133001g, el4.f133001g) && C46238a.m51546a(Integer.valueOf(this.f133002h), Integer.valueOf(el4.f133002h)) && C46238a.m51546a(Integer.valueOf(this.f133003i), Integer.valueOf(el4.f133003i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132998d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f132999e);
            String str2 = this.f133000f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f133001g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f133002h);
            aVar.mo74318e(6, this.f133003i);
            return 0;
        } else if (i == 1) {
            String str4 = this.f132998d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f132999e);
            String str5 = this.f133000f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f133001g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            return e + C52418a.m58678e(5, this.f133002h) + C52418a.m58678e(6, this.f133003i);
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
            el4 el4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    el4.f132998d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    el4.f132999e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    el4.f133000f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    el4.f133001g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    el4.f133002h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    el4.f133003i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
