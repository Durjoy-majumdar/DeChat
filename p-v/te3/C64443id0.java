package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.id0 */
public class C64443id0 extends C47465a {

    /* renamed from: d */
    public String f183676d;

    /* renamed from: e */
    public String f183677e;

    /* renamed from: f */
    public int f183678f;

    /* renamed from: g */
    public String f183679g;

    /* renamed from: h */
    public String f183680h;

    /* renamed from: i */
    public int f183681i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64443id0)) {
            return false;
        }
        C64443id0 id02 = (C64443id0) aVar;
        return C46238a.m51546a(this.f183676d, id02.f183676d) && C46238a.m51546a(this.f183677e, id02.f183677e) && C46238a.m51546a(Integer.valueOf(this.f183678f), Integer.valueOf(id02.f183678f)) && C46238a.m51546a(this.f183679g, id02.f183679g) && C46238a.m51546a(this.f183680h, id02.f183680h) && C46238a.m51546a(Integer.valueOf(this.f183681i), Integer.valueOf(id02.f183681i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183676d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183677e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f183678f);
            String str3 = this.f183679g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f183680h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f183681i);
            return 0;
        } else if (i == 1) {
            String str5 = this.f183676d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f183677e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f183678f);
            String str7 = this.f183679g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f183680h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            return e + C52418a.m58678e(6, this.f183681i);
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
            C64443id0 id02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    id02.f183676d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    id02.f183677e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    id02.f183678f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    id02.f183679g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    id02.f183680h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    id02.f183681i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
