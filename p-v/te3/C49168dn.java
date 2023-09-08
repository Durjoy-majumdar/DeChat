package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dn */
public class C49168dn extends C47465a {

    /* renamed from: d */
    public String f132423d;

    /* renamed from: e */
    public String f132424e;

    /* renamed from: f */
    public int f132425f;

    /* renamed from: g */
    public int f132426g;

    /* renamed from: h */
    public String f132427h;

    /* renamed from: i */
    public String f132428i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49168dn)) {
            return false;
        }
        C49168dn dnVar = (C49168dn) aVar;
        return C46238a.m51546a(this.f132423d, dnVar.f132423d) && C46238a.m51546a(this.f132424e, dnVar.f132424e) && C46238a.m51546a(Integer.valueOf(this.f132425f), Integer.valueOf(dnVar.f132425f)) && C46238a.m51546a(Integer.valueOf(this.f132426g), Integer.valueOf(dnVar.f132426g)) && C46238a.m51546a(this.f132427h, dnVar.f132427h) && C46238a.m51546a(this.f132428i, dnVar.f132428i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132423d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f132424e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f132425f);
            aVar.mo74318e(4, this.f132426g);
            String str3 = this.f132427h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f132428i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f132423d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f132424e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f132425f) + C52418a.m58678e(4, this.f132426g);
            String str7 = this.f132427h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f132428i;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
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
            C49168dn dnVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dnVar.f132423d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    dnVar.f132424e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dnVar.f132425f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    dnVar.f132426g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    dnVar.f132427h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dnVar.f132428i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
