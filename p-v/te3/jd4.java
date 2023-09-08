package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class jd4 extends C49335eu3 {

    /* renamed from: A */
    public int f63976A;

    /* renamed from: B */
    public String f63977B;

    /* renamed from: d */
    public LinkedList<hd4> f63978d = new LinkedList<>();

    /* renamed from: e */
    public md4 f63979e;

    /* renamed from: f */
    public String f63980f;

    /* renamed from: g */
    public String f63981g;

    /* renamed from: h */
    public int f63982h;

    /* renamed from: i */
    public int f63983i;

    /* renamed from: j */
    public int f63984j;

    /* renamed from: n */
    public int f63985n;

    /* renamed from: o */
    public boolean f63986o;

    /* renamed from: p */
    public String f63987p;

    /* renamed from: q */
    public int f63988q;

    /* renamed from: r */
    public int f63989r;

    /* renamed from: s */
    public C89349b f63990s;

    /* renamed from: t */
    public int f63991t;

    /* renamed from: u */
    public String f63992u;

    /* renamed from: v */
    public boolean f63993v;

    /* renamed from: w */
    public String f63994w;

    /* renamed from: x */
    public String f63995x;

    /* renamed from: y */
    public int f63996y;

    /* renamed from: z */
    public kd4 f63997z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof jd4)) {
            return false;
        }
        jd4 jd4 = (jd4) aVar;
        return C46238a.m51546a(this.BaseResponse, jd4.BaseResponse) && C46238a.m51546a(this.f63978d, jd4.f63978d) && C46238a.m51546a(this.f63979e, jd4.f63979e) && C46238a.m51546a(this.f63980f, jd4.f63980f) && C46238a.m51546a(this.f63981g, jd4.f63981g) && C46238a.m51546a(Integer.valueOf(this.f63982h), Integer.valueOf(jd4.f63982h)) && C46238a.m51546a(Integer.valueOf(this.f63983i), Integer.valueOf(jd4.f63983i)) && C46238a.m51546a(Integer.valueOf(this.f63984j), Integer.valueOf(jd4.f63984j)) && C46238a.m51546a(Integer.valueOf(this.f63985n), Integer.valueOf(jd4.f63985n)) && C46238a.m51546a(Boolean.valueOf(this.f63986o), Boolean.valueOf(jd4.f63986o)) && C46238a.m51546a(this.f63987p, jd4.f63987p) && C46238a.m51546a(Integer.valueOf(this.f63988q), Integer.valueOf(jd4.f63988q)) && C46238a.m51546a(Integer.valueOf(this.f63989r), Integer.valueOf(jd4.f63989r)) && C46238a.m51546a(this.f63990s, jd4.f63990s) && C46238a.m51546a(Integer.valueOf(this.f63991t), Integer.valueOf(jd4.f63991t)) && C46238a.m51546a(this.f63992u, jd4.f63992u) && C46238a.m51546a(Boolean.valueOf(this.f63993v), Boolean.valueOf(jd4.f63993v)) && C46238a.m51546a(this.f63994w, jd4.f63994w) && C46238a.m51546a(this.f63995x, jd4.f63995x) && C46238a.m51546a(Integer.valueOf(this.f63996y), Integer.valueOf(jd4.f63996y)) && C46238a.m51546a(this.f63997z, jd4.f63997z) && C46238a.m51546a(Integer.valueOf(this.f63976A), Integer.valueOf(jd4.f63976A)) && C46238a.m51546a(this.f63977B, jd4.f63977B);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f63978d);
                md4 md4 = this.f63979e;
                if (md4 != null) {
                    aVar.mo74322i(3, md4.computeSize());
                    this.f63979e.writeFields(aVar);
                }
                String str = this.f63980f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f63981g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74318e(6, this.f63982h);
                aVar.mo74318e(9, this.f63983i);
                aVar.mo74318e(10, this.f63984j);
                aVar.mo74318e(11, this.f63985n);
                aVar.mo74314a(12, this.f63986o);
                String str3 = this.f63987p;
                if (str3 != null) {
                    aVar.mo74323j(13, str3);
                }
                aVar.mo74318e(14, this.f63988q);
                aVar.mo74318e(15, this.f63989r);
                C89349b bVar = this.f63990s;
                if (bVar != null) {
                    aVar.mo74315b(16, bVar);
                }
                aVar.mo74318e(17, this.f63991t);
                String str4 = this.f63992u;
                if (str4 != null) {
                    aVar.mo74323j(18, str4);
                }
                aVar.mo74314a(19, this.f63993v);
                String str5 = this.f63994w;
                if (str5 != null) {
                    aVar.mo74323j(20, str5);
                }
                String str6 = this.f63995x;
                if (str6 != null) {
                    aVar.mo74323j(21, str6);
                }
                aVar.mo74318e(22, this.f63996y);
                kd4 kd4 = this.f63997z;
                if (kd4 != null) {
                    aVar.mo74322i(23, kd4.computeSize());
                    this.f63997z.writeFields(aVar);
                }
                aVar.mo74318e(24, this.f63976A);
                String str7 = this.f63977B;
                if (str7 != null) {
                    aVar.mo74323j(25, str7);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f63978d);
            md4 md42 = this.f63979e;
            if (md42 != null) {
                g += C52418a.m58682i(3, md42.computeSize());
            }
            String str8 = this.f63980f;
            if (str8 != null) {
                g += C52418a.m58683j(4, str8);
            }
            String str9 = this.f63981g;
            if (str9 != null) {
                g += C52418a.m58683j(5, str9);
            }
            int e = g + C52418a.m58678e(6, this.f63982h) + C52418a.m58678e(9, this.f63983i) + C52418a.m58678e(10, this.f63984j) + C52418a.m58678e(11, this.f63985n) + C52418a.m58674a(12, this.f63986o);
            String str10 = this.f63987p;
            if (str10 != null) {
                e += C52418a.m58683j(13, str10);
            }
            int e2 = e + C52418a.m58678e(14, this.f63988q) + C52418a.m58678e(15, this.f63989r);
            C89349b bVar2 = this.f63990s;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(16, bVar2);
            }
            int e3 = e2 + C52418a.m58678e(17, this.f63991t);
            String str11 = this.f63992u;
            if (str11 != null) {
                e3 += C52418a.m58683j(18, str11);
            }
            int a = e3 + C52418a.m58674a(19, this.f63993v);
            String str12 = this.f63994w;
            if (str12 != null) {
                a += C52418a.m58683j(20, str12);
            }
            String str13 = this.f63995x;
            if (str13 != null) {
                a += C52418a.m58683j(21, str13);
            }
            int e4 = a + C52418a.m58678e(22, this.f63996y);
            kd4 kd42 = this.f63997z;
            if (kd42 != null) {
                e4 += C52418a.m58682i(23, kd42.computeSize());
            }
            int e5 = e4 + C52418a.m58678e(24, this.f63976A);
            String str14 = this.f63977B;
            return str14 != null ? e5 + C52418a.m58683j(25, str14) : e5;
        } else if (i2 == 2) {
            this.f63978d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            jd4 jd4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        jd4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        hd4 hd4 = new hd4();
                        if (bArr2 != null && bArr2.length > 0) {
                            hd4.parseFrom(bArr2);
                        }
                        jd4.f63978d.add(hd4);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        md4 md43 = new md4();
                        if (bArr3 != null && bArr3.length > 0) {
                            md43.parseFrom(bArr3);
                        }
                        jd4.f63979e = md43;
                    }
                    return 0;
                case 4:
                    jd4.f63980f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    jd4.f63981g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jd4.f63982h = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    jd4.f63983i = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    jd4.f63984j = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    jd4.f63985n = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    jd4.f63986o = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    jd4.f63987p = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    jd4.f63988q = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    jd4.f63989r = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    jd4.f63990s = aVar3.mo141626d(intValue);
                    return 0;
                case 17:
                    jd4.f63991t = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    jd4.f63992u = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    jd4.f63993v = aVar3.mo141625c(intValue);
                    return 0;
                case 20:
                    jd4.f63994w = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    jd4.f63995x = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    jd4.f63996y = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        kd4 kd43 = new kd4();
                        if (bArr4 != null && bArr4.length > 0) {
                            kd43.parseFrom(bArr4);
                        }
                        jd4.f63997z = kd43;
                    }
                    return 0;
                case 24:
                    jd4.f63976A = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    jd4.f63977B = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
