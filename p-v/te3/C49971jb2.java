package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jb2 */
public class C49971jb2 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<n85> f135979d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<o85> f135980e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<String> f135981f = new LinkedList<>();

    /* renamed from: g */
    public String f135982g;

    /* renamed from: h */
    public String f135983h;

    /* renamed from: i */
    public String f135984i;

    /* renamed from: j */
    public String f135985j;

    /* renamed from: n */
    public String f135986n;

    /* renamed from: o */
    public boolean f135987o;

    /* renamed from: p */
    public String f135988p;

    /* renamed from: q */
    public LinkedList<C51723vp1> f135989q = new LinkedList<>();

    /* renamed from: r */
    public boolean f135990r;

    /* renamed from: s */
    public String f135991s;

    /* renamed from: t */
    public boolean f135992t;

    /* renamed from: u */
    public int f135993u;

    /* renamed from: v */
    public String f135994v;

    /* renamed from: w */
    public n85 f135995w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49971jb2)) {
            return false;
        }
        C49971jb2 jb22 = (C49971jb2) aVar;
        return C46238a.m51546a(this.BaseResponse, jb22.BaseResponse) && C46238a.m51546a(this.f135979d, jb22.f135979d) && C46238a.m51546a(this.f135980e, jb22.f135980e) && C46238a.m51546a(this.f135981f, jb22.f135981f) && C46238a.m51546a(this.f135982g, jb22.f135982g) && C46238a.m51546a(this.f135983h, jb22.f135983h) && C46238a.m51546a(this.f135984i, jb22.f135984i) && C46238a.m51546a(this.f135985j, jb22.f135985j) && C46238a.m51546a(this.f135986n, jb22.f135986n) && C46238a.m51546a(Boolean.valueOf(this.f135987o), Boolean.valueOf(jb22.f135987o)) && C46238a.m51546a(this.f135988p, jb22.f135988p) && C46238a.m51546a(this.f135989q, jb22.f135989q) && C46238a.m51546a(Boolean.valueOf(this.f135990r), Boolean.valueOf(jb22.f135990r)) && C46238a.m51546a(this.f135991s, jb22.f135991s) && C46238a.m51546a(Boolean.valueOf(this.f135992t), Boolean.valueOf(jb22.f135992t)) && C46238a.m51546a(Integer.valueOf(this.f135993u), Integer.valueOf(jb22.f135993u)) && C46238a.m51546a(this.f135994v, jb22.f135994v) && C46238a.m51546a(this.f135995w, jb22.f135995w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f135982g == null) {
                throw new C52419b("Not all required fields were included: championcoverurl");
            } else if (this.f135983h == null) {
                throw new C52419b("Not all required fields were included: championmotto");
            } else if (this.f135984i != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f135979d);
                aVar.mo74320g(3, 8, this.f135980e);
                aVar.mo74320g(4, 1, this.f135981f);
                String str = this.f135982g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                String str2 = this.f135983h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                String str3 = this.f135984i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f135985j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f135986n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                aVar.mo74314a(10, this.f135987o);
                String str6 = this.f135988p;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                aVar.mo74320g(12, 8, this.f135989q);
                aVar.mo74314a(13, this.f135990r);
                String str7 = this.f135991s;
                if (str7 != null) {
                    aVar.mo74323j(14, str7);
                }
                aVar.mo74314a(15, this.f135992t);
                aVar.mo74318e(16, this.f135993u);
                String str8 = this.f135994v;
                if (str8 != null) {
                    aVar.mo74323j(17, str8);
                }
                n85 n85 = this.f135995w;
                if (n85 != null) {
                    aVar.mo74322i(18, n85.computeSize());
                    this.f135995w.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: rankid");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f135979d) + C52418a.m58680g(3, 8, this.f135980e) + C52418a.m58680g(4, 1, this.f135981f);
            String str9 = this.f135982g;
            if (str9 != null) {
                g += C52418a.m58683j(5, str9);
            }
            String str10 = this.f135983h;
            if (str10 != null) {
                g += C52418a.m58683j(6, str10);
            }
            String str11 = this.f135984i;
            if (str11 != null) {
                g += C52418a.m58683j(7, str11);
            }
            String str12 = this.f135985j;
            if (str12 != null) {
                g += C52418a.m58683j(8, str12);
            }
            String str13 = this.f135986n;
            if (str13 != null) {
                g += C52418a.m58683j(9, str13);
            }
            int a = g + C52418a.m58674a(10, this.f135987o);
            String str14 = this.f135988p;
            if (str14 != null) {
                a += C52418a.m58683j(11, str14);
            }
            int g2 = a + C52418a.m58680g(12, 8, this.f135989q) + C52418a.m58674a(13, this.f135990r);
            String str15 = this.f135991s;
            if (str15 != null) {
                g2 += C52418a.m58683j(14, str15);
            }
            int a2 = g2 + C52418a.m58674a(15, this.f135992t) + C52418a.m58678e(16, this.f135993u);
            String str16 = this.f135994v;
            if (str16 != null) {
                a2 += C52418a.m58683j(17, str16);
            }
            n85 n852 = this.f135995w;
            return n852 != null ? a2 + C52418a.m58682i(18, n852.computeSize()) : a2;
        } else if (i2 == 2) {
            this.f135979d.clear();
            this.f135980e.clear();
            this.f135981f.clear();
            this.f135989q.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f135982g == null) {
                throw new C52419b("Not all required fields were included: championcoverurl");
            } else if (this.f135983h == null) {
                throw new C52419b("Not all required fields were included: championmotto");
            } else if (this.f135984i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: rankid");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49971jb2 jb22 = objArr[1];
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
                        jb22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        n85 n853 = new n85();
                        if (bArr2 != null && bArr2.length > 0) {
                            n853.parseFrom(bArr2);
                        }
                        jb22.f135979d.add(n853);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        o85 o85 = new o85();
                        if (bArr3 != null && bArr3.length > 0) {
                            o85.parseFrom(bArr3);
                        }
                        jb22.f135980e.add(o85);
                    }
                    return 0;
                case 4:
                    jb22.f135981f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    jb22.f135982g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jb22.f135983h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    jb22.f135984i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    jb22.f135985j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    jb22.f135986n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    jb22.f135987o = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    jb22.f135988p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51723vp1 vp12 = new C51723vp1();
                        if (bArr4 != null && bArr4.length > 0) {
                            vp12.parseFrom(bArr4);
                        }
                        jb22.f135989q.add(vp12);
                    }
                    return 0;
                case 13:
                    jb22.f135990r = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    jb22.f135991s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    jb22.f135992t = aVar3.mo141625c(intValue);
                    return 0;
                case 16:
                    jb22.f135993u = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    jb22.f135994v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        n85 n854 = new n85();
                        if (bArr5 != null && bArr5.length > 0) {
                            n854.parseFrom(bArr5);
                        }
                        jb22.f135995w = n854;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
