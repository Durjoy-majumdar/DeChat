package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v63 */
public class C51654v63 extends C47465a {

    /* renamed from: d */
    public String f143349d;

    /* renamed from: e */
    public String f143350e;

    /* renamed from: f */
    public String f143351f;

    /* renamed from: g */
    public int f143352g;

    /* renamed from: h */
    public String f143353h;

    /* renamed from: i */
    public String f143354i;

    /* renamed from: j */
    public String f143355j;

    /* renamed from: n */
    public String f143356n;

    /* renamed from: o */
    public String f143357o;

    /* renamed from: p */
    public int f143358p;

    /* renamed from: q */
    public int f143359q;

    /* renamed from: r */
    public int f143360r;

    /* renamed from: s */
    public long f143361s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51654v63)) {
            return false;
        }
        C51654v63 v632 = (C51654v63) aVar;
        return C46238a.m51546a(this.f143349d, v632.f143349d) && C46238a.m51546a(this.f143350e, v632.f143350e) && C46238a.m51546a(this.f143351f, v632.f143351f) && C46238a.m51546a(Integer.valueOf(this.f143352g), Integer.valueOf(v632.f143352g)) && C46238a.m51546a(this.f143353h, v632.f143353h) && C46238a.m51546a(this.f143354i, v632.f143354i) && C46238a.m51546a(this.f143355j, v632.f143355j) && C46238a.m51546a(this.f143356n, v632.f143356n) && C46238a.m51546a(this.f143357o, v632.f143357o) && C46238a.m51546a(Integer.valueOf(this.f143358p), Integer.valueOf(v632.f143358p)) && C46238a.m51546a(Integer.valueOf(this.f143359q), Integer.valueOf(v632.f143359q)) && C46238a.m51546a(Integer.valueOf(this.f143360r), Integer.valueOf(v632.f143360r)) && C46238a.m51546a(Long.valueOf(this.f143361s), Long.valueOf(v632.f143361s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143349d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143350e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f143351f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f143352g);
            String str4 = this.f143353h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f143354i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f143355j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f143356n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f143357o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            aVar.mo74318e(10, this.f143358p);
            aVar.mo74318e(11, this.f143359q);
            aVar.mo74318e(12, this.f143360r);
            aVar.mo74321h(13, this.f143361s);
            return 0;
        } else if (i2 == 1) {
            String str9 = this.f143349d;
            int j = str9 != null ? 0 + C52418a.m58683j(1, str9) : 0;
            String str10 = this.f143350e;
            if (str10 != null) {
                j += C52418a.m58683j(2, str10);
            }
            String str11 = this.f143351f;
            if (str11 != null) {
                j += C52418a.m58683j(3, str11);
            }
            int e = j + C52418a.m58678e(4, this.f143352g);
            String str12 = this.f143353h;
            if (str12 != null) {
                e += C52418a.m58683j(5, str12);
            }
            String str13 = this.f143354i;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            String str14 = this.f143355j;
            if (str14 != null) {
                e += C52418a.m58683j(7, str14);
            }
            String str15 = this.f143356n;
            if (str15 != null) {
                e += C52418a.m58683j(8, str15);
            }
            String str16 = this.f143357o;
            if (str16 != null) {
                e += C52418a.m58683j(9, str16);
            }
            return e + C52418a.m58678e(10, this.f143358p) + C52418a.m58678e(11, this.f143359q) + C52418a.m58678e(12, this.f143360r) + C52418a.m58681h(13, this.f143361s);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51654v63 v632 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    v632.f143349d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    v632.f143350e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    v632.f143351f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    v632.f143352g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    v632.f143353h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    v632.f143354i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    v632.f143355j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    v632.f143356n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    v632.f143357o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    v632.f143358p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    v632.f143359q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    v632.f143360r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    v632.f143361s = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
