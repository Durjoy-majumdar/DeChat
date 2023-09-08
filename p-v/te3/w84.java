package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class w84 extends C47465a {

    /* renamed from: d */
    public String f143923d;

    /* renamed from: e */
    public String f143924e;

    /* renamed from: f */
    public String f143925f;

    /* renamed from: g */
    public String f143926g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof w84)) {
            return false;
        }
        w84 w84 = (w84) aVar;
        return C46238a.m51546a(this.f143923d, w84.f143923d) && C46238a.m51546a(this.f143924e, w84.f143924e) && C46238a.m51546a(this.f143925f, w84.f143925f) && C46238a.m51546a(this.f143926g, w84.f143926g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143923d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143924e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f143925f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f143926g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f143923d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f143924e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f143925f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f143926g;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
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
            w84 w84 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                w84.f143923d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                w84.f143924e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                w84.f143925f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                w84.f143926g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
