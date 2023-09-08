package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kf1 */
public class C50124kf1 extends C47465a {

    /* renamed from: d */
    public C51108rh0 f136745d;

    /* renamed from: e */
    public C50256lf1 f136746e;

    /* renamed from: f */
    public int f136747f;

    /* renamed from: g */
    public C51695vh1 f136748g;

    /* renamed from: h */
    public C51384te1 f136749h;

    /* renamed from: i */
    public String f136750i;

    /* renamed from: j */
    public String f136751j;

    /* renamed from: n */
    public C49720hl0 f136752n;

    /* renamed from: o */
    public boolean f136753o;

    /* renamed from: p */
    public String f136754p;

    /* renamed from: q */
    public long f136755q;

    /* renamed from: r */
    public C51550ui0 f136756r;

    /* renamed from: s */
    public C50953qf1 f136757s;

    /* renamed from: t */
    public int f136758t;

    /* renamed from: u */
    public C49083d21 f136759u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50124kf1)) {
            return false;
        }
        C50124kf1 kf12 = (C50124kf1) aVar;
        return C46238a.m51546a(this.f136745d, kf12.f136745d) && C46238a.m51546a(this.f136746e, kf12.f136746e) && C46238a.m51546a(Integer.valueOf(this.f136747f), Integer.valueOf(kf12.f136747f)) && C46238a.m51546a(this.f136748g, kf12.f136748g) && C46238a.m51546a(this.f136749h, kf12.f136749h) && C46238a.m51546a(this.f136750i, kf12.f136750i) && C46238a.m51546a(this.f136751j, kf12.f136751j) && C46238a.m51546a(this.f136752n, kf12.f136752n) && C46238a.m51546a(Boolean.valueOf(this.f136753o), Boolean.valueOf(kf12.f136753o)) && C46238a.m51546a(this.f136754p, kf12.f136754p) && C46238a.m51546a(Long.valueOf(this.f136755q), Long.valueOf(kf12.f136755q)) && C46238a.m51546a(this.f136756r, kf12.f136756r) && C46238a.m51546a(this.f136757s, kf12.f136757s) && C46238a.m51546a(Integer.valueOf(this.f136758t), Integer.valueOf(kf12.f136758t)) && C46238a.m51546a(this.f136759u, kf12.f136759u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C51108rh0 rh02 = this.f136745d;
            if (rh02 != null) {
                aVar.mo74322i(1, rh02.computeSize());
                this.f136745d.writeFields(aVar);
            }
            C50256lf1 lf12 = this.f136746e;
            if (lf12 != null) {
                aVar.mo74322i(2, lf12.computeSize());
                this.f136746e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f136747f);
            C51695vh1 vh12 = this.f136748g;
            if (vh12 != null) {
                aVar.mo74322i(5, vh12.computeSize());
                this.f136748g.writeFields(aVar);
            }
            C51384te1 te12 = this.f136749h;
            if (te12 != null) {
                aVar.mo74322i(6, te12.computeSize());
                this.f136749h.writeFields(aVar);
            }
            String str = this.f136750i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            String str2 = this.f136751j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            C49720hl0 hl02 = this.f136752n;
            if (hl02 != null) {
                aVar.mo74322i(9, hl02.computeSize());
                this.f136752n.writeFields(aVar);
            }
            aVar.mo74314a(10, this.f136753o);
            String str3 = this.f136754p;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            aVar.mo74321h(12, this.f136755q);
            C51550ui0 ui02 = this.f136756r;
            if (ui02 != null) {
                aVar.mo74322i(13, ui02.computeSize());
                this.f136756r.writeFields(aVar);
            }
            C50953qf1 qf12 = this.f136757s;
            if (qf12 != null) {
                aVar.mo74322i(14, qf12.computeSize());
                this.f136757s.writeFields(aVar);
            }
            aVar.mo74318e(15, this.f136758t);
            C49083d21 d212 = this.f136759u;
            if (d212 != null) {
                aVar.mo74322i(16, d212.computeSize());
                this.f136759u.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C51108rh0 rh03 = this.f136745d;
            if (rh03 != null) {
                i3 = C52418a.m58682i(1, rh03.computeSize()) + 0;
            }
            C50256lf1 lf13 = this.f136746e;
            if (lf13 != null) {
                i3 += C52418a.m58682i(2, lf13.computeSize());
            }
            int e = i3 + C52418a.m58678e(3, this.f136747f);
            C51695vh1 vh13 = this.f136748g;
            if (vh13 != null) {
                e += C52418a.m58682i(5, vh13.computeSize());
            }
            C51384te1 te13 = this.f136749h;
            if (te13 != null) {
                e += C52418a.m58682i(6, te13.computeSize());
            }
            String str4 = this.f136750i;
            if (str4 != null) {
                e += C52418a.m58683j(7, str4);
            }
            String str5 = this.f136751j;
            if (str5 != null) {
                e += C52418a.m58683j(8, str5);
            }
            C49720hl0 hl03 = this.f136752n;
            if (hl03 != null) {
                e += C52418a.m58682i(9, hl03.computeSize());
            }
            int a = e + C52418a.m58674a(10, this.f136753o);
            String str6 = this.f136754p;
            if (str6 != null) {
                a += C52418a.m58683j(11, str6);
            }
            int h = a + C52418a.m58681h(12, this.f136755q);
            C51550ui0 ui03 = this.f136756r;
            if (ui03 != null) {
                h += C52418a.m58682i(13, ui03.computeSize());
            }
            C50953qf1 qf13 = this.f136757s;
            if (qf13 != null) {
                h += C52418a.m58682i(14, qf13.computeSize());
            }
            int e2 = h + C52418a.m58678e(15, this.f136758t);
            C49083d21 d213 = this.f136759u;
            return d213 != null ? e2 + C52418a.m58682i(16, d213.computeSize()) : e2;
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
            C50124kf1 kf12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51108rh0 rh04 = new C51108rh0();
                        if (bArr != null && bArr.length > 0) {
                            rh04.parseFrom(bArr);
                        }
                        kf12.f136745d = rh04;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C50256lf1 lf14 = new C50256lf1();
                        if (bArr2 != null && bArr2.length > 0) {
                            lf14.parseFrom(bArr2);
                        }
                        kf12.f136746e = lf14;
                    }
                    return 0;
                case 3:
                    kf12.f136747f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51695vh1 vh14 = new C51695vh1();
                        if (bArr3 != null && bArr3.length > 0) {
                            vh14.parseFrom(bArr3);
                        }
                        kf12.f136748g = vh14;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51384te1 te14 = new C51384te1();
                        if (bArr4 != null && bArr4.length > 0) {
                            te14.parseFrom(bArr4);
                        }
                        kf12.f136749h = te14;
                    }
                    return 0;
                case 7:
                    kf12.f136750i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    kf12.f136751j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49720hl0 hl04 = new C49720hl0();
                        if (bArr5 != null && bArr5.length > 0) {
                            hl04.parseFrom(bArr5);
                        }
                        kf12.f136752n = hl04;
                    }
                    return 0;
                case 10:
                    kf12.f136753o = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    kf12.f136754p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    kf12.f136755q = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51550ui0 ui04 = new C51550ui0();
                        if (bArr6 != null && bArr6.length > 0) {
                            ui04.parseFrom(bArr6);
                        }
                        kf12.f136756r = ui04;
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C50953qf1 qf14 = new C50953qf1();
                        if (bArr7 != null && bArr7.length > 0) {
                            qf14.parseFrom(bArr7);
                        }
                        kf12.f136757s = qf14;
                    }
                    return 0;
                case 15:
                    kf12.f136758t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C49083d21 d214 = new C49083d21();
                        if (bArr8 != null && bArr8.length > 0) {
                            d214.parseFrom(bArr8);
                        }
                        kf12.f136759u = d214;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
