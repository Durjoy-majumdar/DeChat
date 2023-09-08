package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.to2 */
public class C51424to2 extends C47465a {

    /* renamed from: d */
    public String f142308d;

    /* renamed from: e */
    public int f142309e;

    /* renamed from: f */
    public int f142310f;

    /* renamed from: g */
    public int f142311g;

    /* renamed from: h */
    public int f142312h;

    /* renamed from: i */
    public String f142313i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51424to2)) {
            return false;
        }
        C51424to2 to22 = (C51424to2) aVar;
        return C46238a.m51546a(this.f142308d, to22.f142308d) && C46238a.m51546a(Integer.valueOf(this.f142309e), Integer.valueOf(to22.f142309e)) && C46238a.m51546a(Integer.valueOf(this.f142310f), Integer.valueOf(to22.f142310f)) && C46238a.m51546a(Integer.valueOf(this.f142311g), Integer.valueOf(to22.f142311g)) && C46238a.m51546a(Integer.valueOf(this.f142312h), Integer.valueOf(to22.f142312h)) && C46238a.m51546a(this.f142313i, to22.f142313i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142308d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f142309e);
            aVar.mo74318e(3, this.f142310f);
            aVar.mo74318e(4, this.f142311g);
            aVar.mo74318e(5, this.f142312h);
            String str2 = this.f142313i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f142308d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f142309e) + C52418a.m58678e(3, this.f142310f) + C52418a.m58678e(4, this.f142311g) + C52418a.m58678e(5, this.f142312h);
            String str4 = this.f142313i;
            return str4 != null ? e + C52418a.m58683j(6, str4) : e;
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
            C51424to2 to22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    to22.f142308d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    to22.f142309e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    to22.f142310f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    to22.f142311g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    to22.f142312h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    to22.f142313i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
