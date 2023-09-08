package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class i35 extends C47465a {

    /* renamed from: d */
    public String f135091d;

    /* renamed from: e */
    public String f135092e;

    /* renamed from: f */
    public String f135093f;

    /* renamed from: g */
    public String f135094g;

    /* renamed from: h */
    public String f135095h;

    /* renamed from: i */
    public String f135096i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof i35)) {
            return false;
        }
        i35 i35 = (i35) aVar;
        return C46238a.m51546a(this.f135091d, i35.f135091d) && C46238a.m51546a(this.f135092e, i35.f135092e) && C46238a.m51546a(this.f135093f, i35.f135093f) && C46238a.m51546a(this.f135094g, i35.f135094g) && C46238a.m51546a(this.f135095h, i35.f135095h) && C46238a.m51546a(this.f135096i, i35.f135096i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135091d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135092e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f135093f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f135094g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f135095h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f135096i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f135091d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f135092e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f135093f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f135094g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f135095h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f135096i;
            return str12 != null ? i2 + C52418a.m58683j(6, str12) : i2;
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
            i35 i35 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    i35.f135091d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    i35.f135092e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    i35.f135093f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    i35.f135094g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    i35.f135095h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    i35.f135096i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
