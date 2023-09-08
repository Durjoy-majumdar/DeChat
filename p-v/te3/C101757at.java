package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.at */
public class C101757at extends C47465a {

    /* renamed from: d */
    public String f297883d;

    /* renamed from: e */
    public String f297884e;

    /* renamed from: f */
    public String f297885f;

    /* renamed from: g */
    public int f297886g;

    /* renamed from: h */
    public int f297887h;

    /* renamed from: i */
    public String f297888i;

    /* renamed from: j */
    public int f297889j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101757at)) {
            return false;
        }
        C101757at atVar = (C101757at) aVar;
        return C46238a.m51546a(this.f297883d, atVar.f297883d) && C46238a.m51546a(this.f297884e, atVar.f297884e) && C46238a.m51546a(this.f297885f, atVar.f297885f) && C46238a.m51546a(Integer.valueOf(this.f297886g), Integer.valueOf(atVar.f297886g)) && C46238a.m51546a(Integer.valueOf(this.f297887h), Integer.valueOf(atVar.f297887h)) && C46238a.m51546a(this.f297888i, atVar.f297888i) && C46238a.m51546a(Integer.valueOf(this.f297889j), Integer.valueOf(atVar.f297889j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f297883d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f297884e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f297885f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f297886g);
            aVar.mo74318e(5, this.f297887h);
            String str4 = this.f297888i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f297889j);
            return 0;
        } else if (i == 1) {
            String str5 = this.f297883d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f297884e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f297885f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int e = i2 + C52418a.m58678e(4, this.f297886g) + C52418a.m58678e(5, this.f297887h);
            String str8 = this.f297888i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            return e + C52418a.m58678e(7, this.f297889j);
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
            C101757at atVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    atVar.f297883d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    atVar.f297884e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    atVar.f297885f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    atVar.f297886g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    atVar.f297887h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    atVar.f297888i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    atVar.f297889j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
