package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kk1 */
public class C50141kk1 extends C47465a {

    /* renamed from: d */
    public String f136846d;

    /* renamed from: e */
    public String f136847e;

    /* renamed from: f */
    public String f136848f;

    /* renamed from: g */
    public int f136849g;

    /* renamed from: h */
    public int f136850h;

    /* renamed from: i */
    public String f136851i;

    /* renamed from: j */
    public String f136852j;

    /* renamed from: n */
    public String f136853n;

    /* renamed from: o */
    public int f136854o;

    /* renamed from: p */
    public C52002xp0 f136855p;

    /* renamed from: q */
    public C52280zl1 f136856q;

    /* renamed from: r */
    public C50294lp0 f136857r;

    /* renamed from: s */
    public int f136858s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50141kk1)) {
            return false;
        }
        C50141kk1 kk12 = (C50141kk1) aVar;
        return C46238a.m51546a(this.f136846d, kk12.f136846d) && C46238a.m51546a(this.f136847e, kk12.f136847e) && C46238a.m51546a(this.f136848f, kk12.f136848f) && C46238a.m51546a(Integer.valueOf(this.f136849g), Integer.valueOf(kk12.f136849g)) && C46238a.m51546a(Integer.valueOf(this.f136850h), Integer.valueOf(kk12.f136850h)) && C46238a.m51546a(this.f136851i, kk12.f136851i) && C46238a.m51546a(this.f136852j, kk12.f136852j) && C46238a.m51546a(this.f136853n, kk12.f136853n) && C46238a.m51546a(Integer.valueOf(this.f136854o), Integer.valueOf(kk12.f136854o)) && C46238a.m51546a(this.f136855p, kk12.f136855p) && C46238a.m51546a(this.f136856q, kk12.f136856q) && C46238a.m51546a(this.f136857r, kk12.f136857r) && C46238a.m51546a(Integer.valueOf(this.f136858s), Integer.valueOf(kk12.f136858s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136846d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f136847e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f136848f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f136849g);
            aVar.mo74318e(5, this.f136850h);
            String str4 = this.f136851i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f136852j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f136853n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            aVar.mo74318e(9, this.f136854o);
            C52002xp0 xp02 = this.f136855p;
            if (xp02 != null) {
                aVar.mo74322i(10, xp02.computeSize());
                this.f136855p.writeFields(aVar);
            }
            C52280zl1 zl12 = this.f136856q;
            if (zl12 != null) {
                aVar.mo74322i(11, zl12.computeSize());
                this.f136856q.writeFields(aVar);
            }
            C50294lp0 lp02 = this.f136857r;
            if (lp02 != null) {
                aVar.mo74322i(12, lp02.computeSize());
                this.f136857r.writeFields(aVar);
            }
            aVar.mo74318e(13, this.f136858s);
            return 0;
        } else if (i2 == 1) {
            String str7 = this.f136846d;
            int j = str7 != null ? 0 + C52418a.m58683j(1, str7) : 0;
            String str8 = this.f136847e;
            if (str8 != null) {
                j += C52418a.m58683j(2, str8);
            }
            String str9 = this.f136848f;
            if (str9 != null) {
                j += C52418a.m58683j(3, str9);
            }
            int e = j + C52418a.m58678e(4, this.f136849g) + C52418a.m58678e(5, this.f136850h);
            String str10 = this.f136851i;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            String str11 = this.f136852j;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            String str12 = this.f136853n;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            int e2 = e + C52418a.m58678e(9, this.f136854o);
            C52002xp0 xp03 = this.f136855p;
            if (xp03 != null) {
                e2 += C52418a.m58682i(10, xp03.computeSize());
            }
            C52280zl1 zl13 = this.f136856q;
            if (zl13 != null) {
                e2 += C52418a.m58682i(11, zl13.computeSize());
            }
            C50294lp0 lp03 = this.f136857r;
            if (lp03 != null) {
                e2 += C52418a.m58682i(12, lp03.computeSize());
            }
            return e2 + C52418a.m58678e(13, this.f136858s);
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
            C50141kk1 kk12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kk12.f136846d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    kk12.f136847e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    kk12.f136848f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    kk12.f136849g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    kk12.f136850h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    kk12.f136851i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    kk12.f136852j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    kk12.f136853n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    kk12.f136854o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C52002xp0 xp04 = new C52002xp0();
                        if (bArr != null && bArr.length > 0) {
                            xp04.parseFrom(bArr);
                        }
                        kk12.f136855p = xp04;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size2 = j3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j3.get(i4);
                        C52280zl1 zl14 = new C52280zl1();
                        if (bArr2 != null && bArr2.length > 0) {
                            zl14.parseFrom(bArr2);
                        }
                        kk12.f136856q = zl14;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size3 = j4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j4.get(i5);
                        C50294lp0 lp04 = new C50294lp0();
                        if (bArr3 != null && bArr3.length > 0) {
                            lp04.parseFrom(bArr3);
                        }
                        kk12.f136857r = lp04;
                    }
                    return 0;
                case 13:
                    kk12.f136858s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
