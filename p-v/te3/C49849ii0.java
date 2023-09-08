package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ii0 */
public class C49849ii0 extends C47465a {

    /* renamed from: d */
    public String f135353d;

    /* renamed from: e */
    public String f135354e;

    /* renamed from: f */
    public String f135355f;

    /* renamed from: g */
    public int f135356g;

    /* renamed from: h */
    public int f135357h;

    /* renamed from: i */
    public int f135358i;

    /* renamed from: j */
    public int f135359j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49849ii0)) {
            return false;
        }
        C49849ii0 ii02 = (C49849ii0) aVar;
        return C46238a.m51546a(this.f135353d, ii02.f135353d) && C46238a.m51546a(this.f135354e, ii02.f135354e) && C46238a.m51546a(this.f135355f, ii02.f135355f) && C46238a.m51546a(Integer.valueOf(this.f135356g), Integer.valueOf(ii02.f135356g)) && C46238a.m51546a(Integer.valueOf(this.f135357h), Integer.valueOf(ii02.f135357h)) && C46238a.m51546a(Integer.valueOf(this.f135358i), Integer.valueOf(ii02.f135358i)) && C46238a.m51546a(Integer.valueOf(this.f135359j), Integer.valueOf(ii02.f135359j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135353d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135354e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f135355f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f135356g);
            aVar.mo74318e(5, this.f135357h);
            aVar.mo74318e(6, this.f135358i);
            aVar.mo74318e(7, this.f135359j);
            return 0;
        } else if (i == 1) {
            String str4 = this.f135353d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f135354e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f135355f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f135356g) + C52418a.m58678e(5, this.f135357h) + C52418a.m58678e(6, this.f135358i) + C52418a.m58678e(7, this.f135359j);
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
            C49849ii0 ii02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ii02.f135353d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ii02.f135354e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ii02.f135355f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ii02.f135356g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ii02.f135357h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ii02.f135358i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ii02.f135359j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
