package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i11 */
public class C64434i11 extends C49335eu3 {

    /* renamed from: A */
    public int f183571A;

    /* renamed from: B */
    public C89349b f183572B;

    /* renamed from: C */
    public int f183573C;

    /* renamed from: d */
    public LinkedList<C51358t81> f183574d = new LinkedList<>();

    /* renamed from: e */
    public C50019jp1 f183575e;

    /* renamed from: f */
    public C89349b f183576f;

    /* renamed from: g */
    public C50019jp1 f183577g;

    /* renamed from: h */
    public C48833bb1 f183578h;

    /* renamed from: i */
    public long f183579i;

    /* renamed from: j */
    public C50019jp1 f183580j;

    /* renamed from: n */
    public String f183581n;

    /* renamed from: o */
    public int f183582o;

    /* renamed from: p */
    public int f183583p;

    /* renamed from: q */
    public C50926q81 f183584q;

    /* renamed from: r */
    public C64399gj1 f183585r;

    /* renamed from: s */
    public long f183586s;

    /* renamed from: t */
    public boolean f183587t;

    /* renamed from: u */
    public String f183588u;

    /* renamed from: v */
    public t44 f183589v;

    /* renamed from: w */
    public String f183590w;

    /* renamed from: x */
    public C64805wk1 f183591x;

    /* renamed from: y */
    public C52128yk0 f183592y;

    /* renamed from: z */
    public C89349b f183593z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64434i11)) {
            return false;
        }
        C64434i11 i112 = (C64434i11) aVar;
        return C46238a.m51546a(this.BaseResponse, i112.BaseResponse) && C46238a.m51546a(this.f183574d, i112.f183574d) && C46238a.m51546a(this.f183575e, i112.f183575e) && C46238a.m51546a(this.f183576f, i112.f183576f) && C46238a.m51546a(this.f183577g, i112.f183577g) && C46238a.m51546a(this.f183578h, i112.f183578h) && C46238a.m51546a(Long.valueOf(this.f183579i), Long.valueOf(i112.f183579i)) && C46238a.m51546a(this.f183580j, i112.f183580j) && C46238a.m51546a(this.f183581n, i112.f183581n) && C46238a.m51546a(Integer.valueOf(this.f183582o), Integer.valueOf(i112.f183582o)) && C46238a.m51546a(Integer.valueOf(this.f183583p), Integer.valueOf(i112.f183583p)) && C46238a.m51546a(this.f183584q, i112.f183584q) && C46238a.m51546a(this.f183585r, i112.f183585r) && C46238a.m51546a(Long.valueOf(this.f183586s), Long.valueOf(i112.f183586s)) && C46238a.m51546a(Boolean.valueOf(this.f183587t), Boolean.valueOf(i112.f183587t)) && C46238a.m51546a(this.f183588u, i112.f183588u) && C46238a.m51546a(this.f183589v, i112.f183589v) && C46238a.m51546a(this.f183590w, i112.f183590w) && C46238a.m51546a(this.f183591x, i112.f183591x) && C46238a.m51546a(this.f183592y, i112.f183592y) && C46238a.m51546a(this.f183593z, i112.f183593z) && C46238a.m51546a(Integer.valueOf(this.f183571A), Integer.valueOf(i112.f183571A)) && C46238a.m51546a(this.f183572B, i112.f183572B) && C46238a.m51546a(Integer.valueOf(this.f183573C), Integer.valueOf(i112.f183573C));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f183574d);
            C50019jp1 jp12 = this.f183575e;
            if (jp12 != null) {
                aVar.mo74322i(3, jp12.computeSize());
                this.f183575e.writeFields(aVar);
            }
            C89349b bVar = this.f183576f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            C50019jp1 jp13 = this.f183577g;
            if (jp13 != null) {
                aVar.mo74322i(5, jp13.computeSize());
                this.f183577g.writeFields(aVar);
            }
            C48833bb1 bb12 = this.f183578h;
            if (bb12 != null) {
                aVar.mo74322i(6, bb12.computeSize());
                this.f183578h.writeFields(aVar);
            }
            aVar.mo74321h(7, this.f183579i);
            C50019jp1 jp14 = this.f183580j;
            if (jp14 != null) {
                aVar.mo74322i(8, jp14.computeSize());
                this.f183580j.writeFields(aVar);
            }
            String str = this.f183581n;
            if (str != null) {
                aVar.mo74323j(9, str);
            }
            aVar.mo74318e(10, this.f183582o);
            aVar.mo74318e(11, this.f183583p);
            C50926q81 q812 = this.f183584q;
            if (q812 != null) {
                aVar.mo74322i(12, q812.computeSize());
                this.f183584q.writeFields(aVar);
            }
            C64399gj1 gj12 = this.f183585r;
            if (gj12 != null) {
                aVar.mo74322i(13, gj12.computeSize());
                this.f183585r.writeFields(aVar);
            }
            aVar.mo74321h(14, this.f183586s);
            aVar.mo74314a(15, this.f183587t);
            String str2 = this.f183588u;
            if (str2 != null) {
                aVar.mo74323j(16, str2);
            }
            t44 t44 = this.f183589v;
            if (t44 != null) {
                aVar.mo74322i(17, t44.computeSize());
                this.f183589v.writeFields(aVar);
            }
            String str3 = this.f183590w;
            if (str3 != null) {
                aVar.mo74323j(18, str3);
            }
            C64805wk1 wk12 = this.f183591x;
            if (wk12 != null) {
                aVar.mo74322i(19, wk12.computeSize());
                this.f183591x.writeFields(aVar);
            }
            C52128yk0 yk02 = this.f183592y;
            if (yk02 != null) {
                aVar.mo74322i(20, yk02.computeSize());
                this.f183592y.writeFields(aVar);
            }
            C89349b bVar2 = this.f183593z;
            if (bVar2 != null) {
                aVar.mo74315b(100, bVar2);
            }
            aVar.mo74318e(101, this.f183571A);
            C89349b bVar3 = this.f183572B;
            if (bVar3 != null) {
                aVar.mo74315b(102, bVar3);
            }
            aVar.mo74318e(103, this.f183573C);
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f183574d);
            C50019jp1 jp15 = this.f183575e;
            if (jp15 != null) {
                g += C52418a.m58682i(3, jp15.computeSize());
            }
            C89349b bVar4 = this.f183576f;
            if (bVar4 != null) {
                g += C52418a.m58675b(4, bVar4);
            }
            C50019jp1 jp16 = this.f183577g;
            if (jp16 != null) {
                g += C52418a.m58682i(5, jp16.computeSize());
            }
            C48833bb1 bb13 = this.f183578h;
            if (bb13 != null) {
                g += C52418a.m58682i(6, bb13.computeSize());
            }
            int h = g + C52418a.m58681h(7, this.f183579i);
            C50019jp1 jp17 = this.f183580j;
            if (jp17 != null) {
                h += C52418a.m58682i(8, jp17.computeSize());
            }
            String str4 = this.f183581n;
            if (str4 != null) {
                h += C52418a.m58683j(9, str4);
            }
            int e = h + C52418a.m58678e(10, this.f183582o) + C52418a.m58678e(11, this.f183583p);
            C50926q81 q813 = this.f183584q;
            if (q813 != null) {
                e += C52418a.m58682i(12, q813.computeSize());
            }
            C64399gj1 gj13 = this.f183585r;
            if (gj13 != null) {
                e += C52418a.m58682i(13, gj13.computeSize());
            }
            int h2 = e + C52418a.m58681h(14, this.f183586s) + C52418a.m58674a(15, this.f183587t);
            String str5 = this.f183588u;
            if (str5 != null) {
                h2 += C52418a.m58683j(16, str5);
            }
            t44 t442 = this.f183589v;
            if (t442 != null) {
                h2 += C52418a.m58682i(17, t442.computeSize());
            }
            String str6 = this.f183590w;
            if (str6 != null) {
                h2 += C52418a.m58683j(18, str6);
            }
            C64805wk1 wk13 = this.f183591x;
            if (wk13 != null) {
                h2 += C52418a.m58682i(19, wk13.computeSize());
            }
            C52128yk0 yk03 = this.f183592y;
            if (yk03 != null) {
                h2 += C52418a.m58682i(20, yk03.computeSize());
            }
            C89349b bVar5 = this.f183593z;
            if (bVar5 != null) {
                h2 += C52418a.m58675b(100, bVar5);
            }
            int e2 = h2 + C52418a.m58678e(101, this.f183571A);
            C89349b bVar6 = this.f183572B;
            if (bVar6 != null) {
                e2 += C52418a.m58675b(102, bVar6);
            }
            return e2 + C52418a.m58678e(103, this.f183573C);
        } else if (i2 == 2) {
            this.f183574d.clear();
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
            C64434i11 i112 = objArr[1];
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
                        i112.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51358t81 t812 = new C51358t81();
                        if (bArr2 != null && bArr2.length > 0) {
                            t812.parseFrom(bArr2);
                        }
                        i112.f183574d.add(t812);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C50019jp1 jp18 = new C50019jp1();
                        if (bArr3 != null && bArr3.length > 0) {
                            jp18.parseFrom(bArr3);
                        }
                        i112.f183575e = jp18;
                    }
                    return 0;
                case 4:
                    i112.f183576f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C50019jp1 jp19 = new C50019jp1();
                        if (bArr4 != null && bArr4.length > 0) {
                            jp19.parseFrom(bArr4);
                        }
                        i112.f183577g = jp19;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C48833bb1 bb14 = new C48833bb1();
                        if (bArr5 != null && bArr5.length > 0) {
                            bb14.parseFrom(bArr5);
                        }
                        i112.f183578h = bb14;
                    }
                    return 0;
                case 7:
                    i112.f183579i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C50019jp1 jp110 = new C50019jp1();
                        if (bArr6 != null && bArr6.length > 0) {
                            jp110.parseFrom(bArr6);
                        }
                        i112.f183580j = jp110;
                    }
                    return 0;
                case 9:
                    i112.f183581n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    i112.f183582o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    i112.f183583p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C50926q81 q814 = new C50926q81();
                        if (bArr7 != null && bArr7.length > 0) {
                            q814.parseFrom(bArr7);
                        }
                        i112.f183584q = q814;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C64399gj1 gj14 = new C64399gj1();
                        if (bArr8 != null && bArr8.length > 0) {
                            gj14.parseFrom(bArr8);
                        }
                        i112.f183585r = gj14;
                    }
                    return 0;
                case 14:
                    i112.f183586s = aVar3.mo141631i(intValue);
                    return 0;
                case 15:
                    i112.f183587t = aVar3.mo141625c(intValue);
                    return 0;
                case 16:
                    i112.f183588u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        t44 t443 = new t44();
                        if (bArr9 != null && bArr9.length > 0) {
                            t443.parseFrom(bArr9);
                        }
                        i112.f183589v = t443;
                    }
                    return 0;
                case 18:
                    i112.f183590w = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C64805wk1 wk14 = new C64805wk1();
                        if (bArr10 != null && bArr10.length > 0) {
                            wk14.parseFrom(bArr10);
                        }
                        i112.f183591x = wk14;
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C52128yk0 yk04 = new C52128yk0();
                        if (bArr11 != null && bArr11.length > 0) {
                            yk04.parseFrom(bArr11);
                        }
                        i112.f183592y = yk04;
                    }
                    return 0;
                default:
                    switch (intValue) {
                        case 100:
                            i112.f183593z = aVar3.mo141626d(intValue);
                            return 0;
                        case 101:
                            i112.f183571A = aVar3.mo141629g(intValue);
                            return 0;
                        case 102:
                            i112.f183572B = aVar3.mo141626d(intValue);
                            return 0;
                        case 103:
                            i112.f183573C = aVar3.mo141629g(intValue);
                            return 0;
                        default:
                            return -1;
                    }
            }
        }
    }
}
