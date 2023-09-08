package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hg3 */
public class C49703hg3 extends C49335eu3 {

    /* renamed from: d */
    public int f134617d;

    /* renamed from: e */
    public String f134618e;

    /* renamed from: f */
    public C48719ai2 f134619f;

    /* renamed from: g */
    public C50269li3 f134620g;

    /* renamed from: h */
    public String f134621h;

    /* renamed from: i */
    public LinkedList<C77909bp> f134622i = new LinkedList<>();

    /* renamed from: j */
    public boolean f134623j = true;

    /* renamed from: n */
    public int f134624n;

    /* renamed from: o */
    public String f134625o;

    /* renamed from: p */
    public int f134626p;

    /* renamed from: q */
    public long f134627q;

    /* renamed from: r */
    public String f134628r;

    /* renamed from: s */
    public String f134629s;

    /* renamed from: t */
    public String f134630t;

    /* renamed from: u */
    public String f134631u;

    /* renamed from: v */
    public String f134632v;

    /* renamed from: w */
    public LinkedList<C48891bp3> f134633w = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49703hg3)) {
            return false;
        }
        C49703hg3 hg32 = (C49703hg3) aVar;
        return C46238a.m51546a(this.BaseResponse, hg32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f134617d), Integer.valueOf(hg32.f134617d)) && C46238a.m51546a(this.f134618e, hg32.f134618e) && C46238a.m51546a(this.f134619f, hg32.f134619f) && C46238a.m51546a(this.f134620g, hg32.f134620g) && C46238a.m51546a(this.f134621h, hg32.f134621h) && C46238a.m51546a(this.f134622i, hg32.f134622i) && C46238a.m51546a(Boolean.valueOf(this.f134623j), Boolean.valueOf(hg32.f134623j)) && C46238a.m51546a(Integer.valueOf(this.f134624n), Integer.valueOf(hg32.f134624n)) && C46238a.m51546a(this.f134625o, hg32.f134625o) && C46238a.m51546a(Integer.valueOf(this.f134626p), Integer.valueOf(hg32.f134626p)) && C46238a.m51546a(Long.valueOf(this.f134627q), Long.valueOf(hg32.f134627q)) && C46238a.m51546a(this.f134628r, hg32.f134628r) && C46238a.m51546a(this.f134629s, hg32.f134629s) && C46238a.m51546a(this.f134630t, hg32.f134630t) && C46238a.m51546a(this.f134631u, hg32.f134631u) && C46238a.m51546a(this.f134632v, hg32.f134632v) && C46238a.m51546a(this.f134633w, hg32.f134633w);
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
                aVar.mo74318e(2, this.f134617d);
                String str = this.f134618e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C48719ai2 ai22 = this.f134619f;
                if (ai22 != null) {
                    aVar.mo74322i(4, ai22.computeSize());
                    this.f134619f.writeFields(aVar);
                }
                C50269li3 li32 = this.f134620g;
                if (li32 != null) {
                    aVar.mo74322i(5, li32.computeSize());
                    this.f134620g.writeFields(aVar);
                }
                String str2 = this.f134621h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                aVar.mo74320g(7, 8, this.f134622i);
                aVar.mo74314a(8, this.f134623j);
                aVar.mo74318e(9, this.f134624n);
                String str3 = this.f134625o;
                if (str3 != null) {
                    aVar.mo74323j(10, str3);
                }
                aVar.mo74318e(11, this.f134626p);
                aVar.mo74321h(12, this.f134627q);
                String str4 = this.f134628r;
                if (str4 != null) {
                    aVar.mo74323j(13, str4);
                }
                String str5 = this.f134629s;
                if (str5 != null) {
                    aVar.mo74323j(14, str5);
                }
                String str6 = this.f134630t;
                if (str6 != null) {
                    aVar.mo74323j(15, str6);
                }
                String str7 = this.f134631u;
                if (str7 != null) {
                    aVar.mo74323j(16, str7);
                }
                String str8 = this.f134632v;
                if (str8 != null) {
                    aVar.mo74323j(17, str8);
                }
                aVar.mo74320g(18, 8, this.f134633w);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f134617d);
            String str9 = this.f134618e;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            C48719ai2 ai23 = this.f134619f;
            if (ai23 != null) {
                e += C52418a.m58682i(4, ai23.computeSize());
            }
            C50269li3 li33 = this.f134620g;
            if (li33 != null) {
                e += C52418a.m58682i(5, li33.computeSize());
            }
            String str10 = this.f134621h;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            int g = e + C52418a.m58680g(7, 8, this.f134622i) + C52418a.m58674a(8, this.f134623j) + C52418a.m58678e(9, this.f134624n);
            String str11 = this.f134625o;
            if (str11 != null) {
                g += C52418a.m58683j(10, str11);
            }
            int e2 = g + C52418a.m58678e(11, this.f134626p) + C52418a.m58681h(12, this.f134627q);
            String str12 = this.f134628r;
            if (str12 != null) {
                e2 += C52418a.m58683j(13, str12);
            }
            String str13 = this.f134629s;
            if (str13 != null) {
                e2 += C52418a.m58683j(14, str13);
            }
            String str14 = this.f134630t;
            if (str14 != null) {
                e2 += C52418a.m58683j(15, str14);
            }
            String str15 = this.f134631u;
            if (str15 != null) {
                e2 += C52418a.m58683j(16, str15);
            }
            String str16 = this.f134632v;
            if (str16 != null) {
                e2 += C52418a.m58683j(17, str16);
            }
            return e2 + C52418a.m58680g(18, 8, this.f134633w);
        } else if (i2 == 2) {
            this.f134622i.clear();
            this.f134633w.clear();
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
            C49703hg3 hg32 = objArr[1];
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
                        hg32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    hg32.f134617d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    hg32.f134618e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C48719ai2 ai24 = new C48719ai2();
                        if (bArr2 != null && bArr2.length > 0) {
                            ai24.parseFrom(bArr2);
                        }
                        hg32.f134619f = ai24;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C50269li3 li34 = new C50269li3();
                        if (bArr3 != null && bArr3.length > 0) {
                            li34.parseFrom(bArr3);
                        }
                        hg32.f134620g = li34;
                    }
                    return 0;
                case 6:
                    hg32.f134621h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C77909bp bpVar = new C77909bp();
                        if (bArr4 != null && bArr4.length > 0) {
                            bpVar.parseFrom(bArr4);
                        }
                        hg32.f134622i.add(bpVar);
                    }
                    return 0;
                case 8:
                    hg32.f134623j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    hg32.f134624n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    hg32.f134625o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    hg32.f134626p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    hg32.f134627q = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    hg32.f134628r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    hg32.f134629s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    hg32.f134630t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    hg32.f134631u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    hg32.f134632v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C48891bp3 bp32 = new C48891bp3();
                        if (bArr5 != null && bArr5.length > 0) {
                            bp32.parseFrom(bArr5);
                        }
                        hg32.f134633w.add(bp32);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
