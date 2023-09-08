package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hj3 */
public class C90414hj3 extends C47465a {

    /* renamed from: d */
    public boolean f259550d;

    /* renamed from: e */
    public String f259551e;

    /* renamed from: f */
    public String f259552f;

    /* renamed from: g */
    public int f259553g;

    /* renamed from: h */
    public int f259554h;

    /* renamed from: i */
    public String f259555i;

    /* renamed from: j */
    public boolean f259556j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90414hj3)) {
            return false;
        }
        C90414hj3 hj32 = (C90414hj3) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f259550d), Boolean.valueOf(hj32.f259550d)) && C46238a.m51546a(this.f259551e, hj32.f259551e) && C46238a.m51546a(this.f259552f, hj32.f259552f) && C46238a.m51546a(Integer.valueOf(this.f259553g), Integer.valueOf(hj32.f259553g)) && C46238a.m51546a(Integer.valueOf(this.f259554h), Integer.valueOf(hj32.f259554h)) && C46238a.m51546a(this.f259555i, hj32.f259555i) && C46238a.m51546a(Boolean.valueOf(this.f259556j), Boolean.valueOf(hj32.f259556j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f259550d);
            String str = this.f259551e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f259552f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f259553g);
            aVar.mo74318e(5, this.f259554h);
            String str3 = this.f259555i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74314a(7, this.f259556j);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f259550d) + 0;
            String str4 = this.f259551e;
            if (str4 != null) {
                a += C52418a.m58683j(2, str4);
            }
            String str5 = this.f259552f;
            if (str5 != null) {
                a += C52418a.m58683j(3, str5);
            }
            int e = a + C52418a.m58678e(4, this.f259553g) + C52418a.m58678e(5, this.f259554h);
            String str6 = this.f259555i;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            return e + C52418a.m58674a(7, this.f259556j);
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
            C90414hj3 hj32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hj32.f259550d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    hj32.f259551e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hj32.f259552f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hj32.f259553g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    hj32.f259554h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    hj32.f259555i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hj32.f259556j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
