package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.to */
public class C64733to extends C47465a {

    /* renamed from: d */
    public int f185621d;

    /* renamed from: e */
    public String f185622e;

    /* renamed from: f */
    public int f185623f;

    /* renamed from: g */
    public String f185624g;

    /* renamed from: h */
    public int f185625h;

    /* renamed from: i */
    public int f185626i;

    /* renamed from: j */
    public int f185627j;

    /* renamed from: n */
    public String f185628n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64733to)) {
            return false;
        }
        C64733to toVar = (C64733to) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185621d), Integer.valueOf(toVar.f185621d)) && C46238a.m51546a(this.f185622e, toVar.f185622e) && C46238a.m51546a(Integer.valueOf(this.f185623f), Integer.valueOf(toVar.f185623f)) && C46238a.m51546a(this.f185624g, toVar.f185624g) && C46238a.m51546a(Integer.valueOf(this.f185625h), Integer.valueOf(toVar.f185625h)) && C46238a.m51546a(Integer.valueOf(this.f185626i), Integer.valueOf(toVar.f185626i)) && C46238a.m51546a(Integer.valueOf(this.f185627j), Integer.valueOf(toVar.f185627j)) && C46238a.m51546a(this.f185628n, toVar.f185628n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185621d);
            String str = this.f185622e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f185623f);
            String str2 = this.f185624g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f185625h);
            aVar.mo74318e(6, this.f185626i);
            aVar.mo74318e(7, this.f185627j);
            String str3 = this.f185628n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f185621d) + 0;
            String str4 = this.f185622e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            int e2 = e + C52418a.m58678e(3, this.f185623f);
            String str5 = this.f185624g;
            if (str5 != null) {
                e2 += C52418a.m58683j(4, str5);
            }
            int e3 = e2 + C52418a.m58678e(5, this.f185625h) + C52418a.m58678e(6, this.f185626i) + C52418a.m58678e(7, this.f185627j);
            String str6 = this.f185628n;
            return str6 != null ? e3 + C52418a.m58683j(8, str6) : e3;
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
            C64733to toVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    toVar.f185621d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    toVar.f185622e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    toVar.f185623f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    toVar.f185624g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    toVar.f185625h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    toVar.f185626i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    toVar.f185627j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    toVar.f185628n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
