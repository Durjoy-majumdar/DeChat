package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zp */
public class C52290zp extends C47465a {

    /* renamed from: d */
    public String f146160d;

    /* renamed from: e */
    public String f146161e;

    /* renamed from: f */
    public int f146162f;

    /* renamed from: g */
    public int f146163g;

    /* renamed from: h */
    public String f146164h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52290zp)) {
            return false;
        }
        C52290zp zpVar = (C52290zp) aVar;
        return C46238a.m51546a(this.f146160d, zpVar.f146160d) && C46238a.m51546a(this.f146161e, zpVar.f146161e) && C46238a.m51546a(Integer.valueOf(this.f146162f), Integer.valueOf(zpVar.f146162f)) && C46238a.m51546a(Integer.valueOf(this.f146163g), Integer.valueOf(zpVar.f146163g)) && C46238a.m51546a(this.f146164h, zpVar.f146164h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f146160d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f146161e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f146162f);
            aVar.mo74318e(4, this.f146163g);
            String str3 = this.f146164h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f146160d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f146161e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f146162f) + C52418a.m58678e(4, this.f146163g);
            String str6 = this.f146164h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C52290zp zpVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zpVar.f146160d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                zpVar.f146161e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                zpVar.f146162f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                zpVar.f146163g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                zpVar.f146164h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
