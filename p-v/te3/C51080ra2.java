package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ra2 */
public class C51080ra2 extends C47465a {

    /* renamed from: d */
    public String f140789d;

    /* renamed from: e */
    public int f140790e;

    /* renamed from: f */
    public int f140791f;

    /* renamed from: g */
    public String f140792g;

    /* renamed from: h */
    public String f140793h;

    /* renamed from: i */
    public String f140794i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51080ra2)) {
            return false;
        }
        C51080ra2 ra22 = (C51080ra2) aVar;
        return C46238a.m51546a(this.f140789d, ra22.f140789d) && C46238a.m51546a(Integer.valueOf(this.f140790e), Integer.valueOf(ra22.f140790e)) && C46238a.m51546a(Integer.valueOf(this.f140791f), Integer.valueOf(ra22.f140791f)) && C46238a.m51546a(this.f140792g, ra22.f140792g) && C46238a.m51546a(this.f140793h, ra22.f140793h) && C46238a.m51546a(this.f140794i, ra22.f140794i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140789d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f140790e);
            aVar.mo74318e(3, this.f140791f);
            String str2 = this.f140792g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f140793h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f140794i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f140789d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f140790e) + C52418a.m58678e(3, this.f140791f);
            String str6 = this.f140792g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f140793h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f140794i;
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
            C51080ra2 ra22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ra22.f140789d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ra22.f140790e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ra22.f140791f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ra22.f140792g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ra22.f140793h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ra22.f140794i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
