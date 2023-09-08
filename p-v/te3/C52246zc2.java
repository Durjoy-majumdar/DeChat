package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zc2 */
public class C52246zc2 extends C101820nt3 {

    /* renamed from: d */
    public int f145805d;

    /* renamed from: e */
    public String f145806e;

    /* renamed from: f */
    public int f145807f;

    /* renamed from: g */
    public String f145808g;

    /* renamed from: h */
    public int f145809h;

    /* renamed from: i */
    public int f145810i;

    /* renamed from: j */
    public String f145811j;

    /* renamed from: n */
    public boolean f145812n = false;

    /* renamed from: o */
    public C48686aa3 f145813o;

    /* renamed from: p */
    public String f145814p;

    /* renamed from: q */
    public LinkedList<C49636h03> f145815q = new LinkedList<>();

    /* renamed from: r */
    public int f145816r;

    /* renamed from: s */
    public String f145817s;

    /* renamed from: t */
    public String f145818t;

    /* renamed from: u */
    public boolean f145819u;

    /* renamed from: v */
    public boolean f145820v;

    /* renamed from: w */
    public int f145821w;

    /* renamed from: x */
    public C90422jy f145822x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52246zc2)) {
            return false;
        }
        C52246zc2 zc22 = (C52246zc2) aVar;
        return C46238a.m51546a(this.BaseRequest, zc22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f145805d), Integer.valueOf(zc22.f145805d)) && C46238a.m51546a(this.f145806e, zc22.f145806e) && C46238a.m51546a(Integer.valueOf(this.f145807f), Integer.valueOf(zc22.f145807f)) && C46238a.m51546a(this.f145808g, zc22.f145808g) && C46238a.m51546a(Integer.valueOf(this.f145809h), Integer.valueOf(zc22.f145809h)) && C46238a.m51546a(Integer.valueOf(this.f145810i), Integer.valueOf(zc22.f145810i)) && C46238a.m51546a(this.f145811j, zc22.f145811j) && C46238a.m51546a(Boolean.valueOf(this.f145812n), Boolean.valueOf(zc22.f145812n)) && C46238a.m51546a(this.f145813o, zc22.f145813o) && C46238a.m51546a(this.f145814p, zc22.f145814p) && C46238a.m51546a(this.f145815q, zc22.f145815q) && C46238a.m51546a(Integer.valueOf(this.f145816r), Integer.valueOf(zc22.f145816r)) && C46238a.m51546a(this.f145817s, zc22.f145817s) && C46238a.m51546a(this.f145818t, zc22.f145818t) && C46238a.m51546a(Boolean.valueOf(this.f145819u), Boolean.valueOf(zc22.f145819u)) && C46238a.m51546a(Boolean.valueOf(this.f145820v), Boolean.valueOf(zc22.f145820v)) && C46238a.m51546a(Integer.valueOf(this.f145821w), Integer.valueOf(zc22.f145821w)) && C46238a.m51546a(this.f145822x, zc22.f145822x);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f145805d);
            String str = this.f145806e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f145807f);
            String str2 = this.f145808g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f145809h);
            aVar.mo74318e(7, this.f145810i);
            String str3 = this.f145811j;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            aVar.mo74314a(9, this.f145812n);
            C48686aa3 aa32 = this.f145813o;
            if (aa32 != null) {
                aVar.mo74322i(10, aa32.computeSize());
                this.f145813o.writeFields(aVar);
            }
            String str4 = this.f145814p;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            aVar.mo74320g(12, 8, this.f145815q);
            aVar.mo74318e(13, this.f145816r);
            String str5 = this.f145817s;
            if (str5 != null) {
                aVar.mo74323j(14, str5);
            }
            String str6 = this.f145818t;
            if (str6 != null) {
                aVar.mo74323j(15, str6);
            }
            aVar.mo74314a(16, this.f145819u);
            aVar.mo74314a(17, this.f145820v);
            aVar.mo74318e(18, this.f145821w);
            C90422jy jyVar = this.f145822x;
            if (jyVar != null) {
                aVar.mo74322i(19, jyVar.computeSize());
                this.f145822x.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f145805d);
            String str7 = this.f145806e;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            int e2 = e + C52418a.m58678e(4, this.f145807f);
            String str8 = this.f145808g;
            if (str8 != null) {
                e2 += C52418a.m58683j(5, str8);
            }
            int e3 = e2 + C52418a.m58678e(6, this.f145809h) + C52418a.m58678e(7, this.f145810i);
            String str9 = this.f145811j;
            if (str9 != null) {
                e3 += C52418a.m58683j(8, str9);
            }
            int a = e3 + C52418a.m58674a(9, this.f145812n);
            C48686aa3 aa33 = this.f145813o;
            if (aa33 != null) {
                a += C52418a.m58682i(10, aa33.computeSize());
            }
            String str10 = this.f145814p;
            if (str10 != null) {
                a += C52418a.m58683j(11, str10);
            }
            int g = a + C52418a.m58680g(12, 8, this.f145815q) + C52418a.m58678e(13, this.f145816r);
            String str11 = this.f145817s;
            if (str11 != null) {
                g += C52418a.m58683j(14, str11);
            }
            String str12 = this.f145818t;
            if (str12 != null) {
                g += C52418a.m58683j(15, str12);
            }
            int a2 = g + C52418a.m58674a(16, this.f145819u) + C52418a.m58674a(17, this.f145820v) + C52418a.m58678e(18, this.f145821w);
            C90422jy jyVar2 = this.f145822x;
            return jyVar2 != null ? a2 + C52418a.m58682i(19, jyVar2.computeSize()) : a2;
        } else if (i2 == 2) {
            this.f145815q.clear();
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
            C52246zc2 zc22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        zc22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    zc22.f145805d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    zc22.f145806e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zc22.f145807f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    zc22.f145808g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zc22.f145809h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    zc22.f145810i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    zc22.f145811j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    zc22.f145812n = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C48686aa3 aa34 = new C48686aa3();
                        if (bArr2 != null && bArr2.length > 0) {
                            aa34.parseFrom(bArr2);
                        }
                        zc22.f145813o = aa34;
                    }
                    return 0;
                case 11:
                    zc22.f145814p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49636h03 h032 = new C49636h03();
                        if (bArr3 != null && bArr3.length > 0) {
                            h032.parseFrom(bArr3);
                        }
                        zc22.f145815q.add(h032);
                    }
                    return 0;
                case 13:
                    zc22.f145816r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    zc22.f145817s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    zc22.f145818t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    zc22.f145819u = aVar3.mo141625c(intValue);
                    return 0;
                case 17:
                    zc22.f145820v = aVar3.mo141625c(intValue);
                    return 0;
                case 18:
                    zc22.f145821w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C90422jy jyVar3 = new C90422jy();
                        if (bArr4 != null && bArr4.length > 0) {
                            jyVar3.parseFrom(bArr4);
                        }
                        zc22.f145822x = jyVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
