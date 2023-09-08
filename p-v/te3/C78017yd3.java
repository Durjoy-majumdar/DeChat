package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yd3 */
public class C78017yd3 extends C47465a {

    /* renamed from: d */
    public int f228571d;

    /* renamed from: e */
    public long f228572e;

    /* renamed from: f */
    public String f228573f;

    /* renamed from: g */
    public String f228574g;

    /* renamed from: h */
    public String f228575h;

    /* renamed from: i */
    public String f228576i;

    /* renamed from: j */
    public pi4 f228577j;

    /* renamed from: n */
    public C64458j03 f228578n;

    /* renamed from: o */
    public C64842xx2 f228579o;

    /* renamed from: p */
    public int f228580p;

    /* renamed from: q */
    public int f228581q;

    /* renamed from: r */
    public String f228582r;

    /* renamed from: s */
    public String f228583s;

    /* renamed from: t */
    public String f228584t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78017yd3)) {
            return false;
        }
        C78017yd3 yd32 = (C78017yd3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f228571d), Integer.valueOf(yd32.f228571d)) && C46238a.m51546a(Long.valueOf(this.f228572e), Long.valueOf(yd32.f228572e)) && C46238a.m51546a(this.f228573f, yd32.f228573f) && C46238a.m51546a(this.f228574g, yd32.f228574g) && C46238a.m51546a(this.f228575h, yd32.f228575h) && C46238a.m51546a(this.f228576i, yd32.f228576i) && C46238a.m51546a(this.f228577j, yd32.f228577j) && C46238a.m51546a(this.f228578n, yd32.f228578n) && C46238a.m51546a(this.f228579o, yd32.f228579o) && C46238a.m51546a(Integer.valueOf(this.f228580p), Integer.valueOf(yd32.f228580p)) && C46238a.m51546a(Integer.valueOf(this.f228581q), Integer.valueOf(yd32.f228581q)) && C46238a.m51546a(this.f228582r, yd32.f228582r) && C46238a.m51546a(this.f228583s, yd32.f228583s) && C46238a.m51546a(this.f228584t, yd32.f228584t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f228571d);
            aVar.mo74321h(2, this.f228572e);
            String str = this.f228573f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f228574g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f228575h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f228576i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            pi4 pi4 = this.f228577j;
            if (pi4 != null) {
                aVar.mo74322i(7, pi4.computeSize());
                this.f228577j.writeFields(aVar);
            }
            C64458j03 j032 = this.f228578n;
            if (j032 != null) {
                aVar.mo74322i(8, j032.computeSize());
                this.f228578n.writeFields(aVar);
            }
            C64842xx2 xx22 = this.f228579o;
            if (xx22 != null) {
                aVar.mo74322i(9, xx22.computeSize());
                this.f228579o.writeFields(aVar);
            }
            aVar.mo74318e(10, this.f228580p);
            aVar.mo74318e(11, this.f228581q);
            String str5 = this.f228582r;
            if (str5 != null) {
                aVar.mo74323j(12, str5);
            }
            String str6 = this.f228583s;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            String str7 = this.f228584t;
            if (str7 != null) {
                aVar.mo74323j(14, str7);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f228571d) + 0 + C52418a.m58681h(2, this.f228572e);
            String str8 = this.f228573f;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f228574g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f228575h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f228576i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            pi4 pi42 = this.f228577j;
            if (pi42 != null) {
                e += C52418a.m58682i(7, pi42.computeSize());
            }
            C64458j03 j033 = this.f228578n;
            if (j033 != null) {
                e += C52418a.m58682i(8, j033.computeSize());
            }
            C64842xx2 xx23 = this.f228579o;
            if (xx23 != null) {
                e += C52418a.m58682i(9, xx23.computeSize());
            }
            int e2 = e + C52418a.m58678e(10, this.f228580p) + C52418a.m58678e(11, this.f228581q);
            String str12 = this.f228582r;
            if (str12 != null) {
                e2 += C52418a.m58683j(12, str12);
            }
            String str13 = this.f228583s;
            if (str13 != null) {
                e2 += C52418a.m58683j(13, str13);
            }
            String str14 = this.f228584t;
            return str14 != null ? e2 + C52418a.m58683j(14, str14) : e2;
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
            C78017yd3 yd32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yd32.f228571d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    yd32.f228572e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    yd32.f228573f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    yd32.f228574g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    yd32.f228575h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    yd32.f228576i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        pi4 pi43 = new pi4();
                        if (bArr != null && bArr.length > 0) {
                            pi43.parseFrom(bArr);
                        }
                        yd32.f228577j = pi43;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64458j03 j034 = new C64458j03();
                        if (bArr2 != null && bArr2.length > 0) {
                            j034.parseFrom(bArr2);
                        }
                        yd32.f228578n = j034;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64842xx2 xx24 = new C64842xx2();
                        if (bArr3 != null && bArr3.length > 0) {
                            xx24.parseFrom(bArr3);
                        }
                        yd32.f228579o = xx24;
                    }
                    return 0;
                case 10:
                    yd32.f228580p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    yd32.f228581q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    yd32.f228582r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    yd32.f228583s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    yd32.f228584t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
