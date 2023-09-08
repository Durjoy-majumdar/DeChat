package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sp */
public class C118466sp extends C49335eu3 {

    /* renamed from: d */
    public int f354373d;

    /* renamed from: e */
    public C64320dn3 f354374e;

    /* renamed from: f */
    public String f354375f;

    /* renamed from: g */
    public int f354376g;

    /* renamed from: h */
    public String f354377h;

    /* renamed from: i */
    public LinkedList<C118447nw2> f354378i = new LinkedList<>();

    /* renamed from: j */
    public C118447nw2 f354379j;

    /* renamed from: n */
    public String f354380n;

    /* renamed from: o */
    public boolean f354381o;

    /* renamed from: p */
    public String f354382p;

    /* renamed from: q */
    public String f354383q;

    /* renamed from: r */
    public C118477wj3 f354384r;

    /* renamed from: s */
    public C118477wj3 f354385s;

    /* renamed from: t */
    public int f354386t;

    /* renamed from: u */
    public C89349b f354387u;

    /* renamed from: v */
    public int f354388v;

    /* renamed from: w */
    public C64774vi f354389w;

    /* renamed from: x */
    public boolean f354390x;

    /* renamed from: y */
    public C118480xn3 f354391y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118466sp)) {
            return false;
        }
        C118466sp spVar = (C118466sp) aVar;
        return C46238a.m51546a(this.BaseResponse, spVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f354373d), Integer.valueOf(spVar.f354373d)) && C46238a.m51546a(this.f354374e, spVar.f354374e) && C46238a.m51546a(this.f354375f, spVar.f354375f) && C46238a.m51546a(Integer.valueOf(this.f354376g), Integer.valueOf(spVar.f354376g)) && C46238a.m51546a(this.f354377h, spVar.f354377h) && C46238a.m51546a(this.f354378i, spVar.f354378i) && C46238a.m51546a(this.f354379j, spVar.f354379j) && C46238a.m51546a(this.f354380n, spVar.f354380n) && C46238a.m51546a(Boolean.valueOf(this.f354381o), Boolean.valueOf(spVar.f354381o)) && C46238a.m51546a(this.f354382p, spVar.f354382p) && C46238a.m51546a(this.f354383q, spVar.f354383q) && C46238a.m51546a(this.f354384r, spVar.f354384r) && C46238a.m51546a(this.f354385s, spVar.f354385s) && C46238a.m51546a(Integer.valueOf(this.f354386t), Integer.valueOf(spVar.f354386t)) && C46238a.m51546a(this.f354387u, spVar.f354387u) && C46238a.m51546a(Integer.valueOf(this.f354388v), Integer.valueOf(spVar.f354388v)) && C46238a.m51546a(this.f354389w, spVar.f354389w) && C46238a.m51546a(Boolean.valueOf(this.f354390x), Boolean.valueOf(spVar.f354390x)) && C46238a.m51546a(this.f354391y, spVar.f354391y);
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
                aVar.mo74318e(2, this.f354373d);
                C64320dn3 dn32 = this.f354374e;
                if (dn32 != null) {
                    aVar.mo74322i(3, dn32.computeSize());
                    this.f354374e.writeFields(aVar);
                }
                String str = this.f354375f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74318e(5, this.f354376g);
                String str2 = this.f354377h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                aVar.mo74320g(7, 8, this.f354378i);
                C118447nw2 nw22 = this.f354379j;
                if (nw22 != null) {
                    aVar.mo74322i(8, nw22.computeSize());
                    this.f354379j.writeFields(aVar);
                }
                String str3 = this.f354380n;
                if (str3 != null) {
                    aVar.mo74323j(9, str3);
                }
                aVar.mo74314a(10, this.f354381o);
                String str4 = this.f354382p;
                if (str4 != null) {
                    aVar.mo74323j(11, str4);
                }
                String str5 = this.f354383q;
                if (str5 != null) {
                    aVar.mo74323j(12, str5);
                }
                C118477wj3 wj32 = this.f354384r;
                if (wj32 != null) {
                    aVar.mo74322i(13, wj32.computeSize());
                    this.f354384r.writeFields(aVar);
                }
                C118477wj3 wj33 = this.f354385s;
                if (wj33 != null) {
                    aVar.mo74322i(14, wj33.computeSize());
                    this.f354385s.writeFields(aVar);
                }
                aVar.mo74318e(15, this.f354386t);
                C89349b bVar = this.f354387u;
                if (bVar != null) {
                    aVar.mo74315b(16, bVar);
                }
                aVar.mo74318e(17, this.f354388v);
                C64774vi viVar = this.f354389w;
                if (viVar != null) {
                    aVar.mo74322i(18, viVar.computeSize());
                    this.f354389w.writeFields(aVar);
                }
                aVar.mo74314a(19, this.f354390x);
                C118480xn3 xn32 = this.f354391y;
                if (xn32 != null) {
                    aVar.mo74322i(20, xn32.computeSize());
                    this.f354391y.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f354373d);
            C64320dn3 dn33 = this.f354374e;
            if (dn33 != null) {
                e += C52418a.m58682i(3, dn33.computeSize());
            }
            String str6 = this.f354375f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            int e2 = e + C52418a.m58678e(5, this.f354376g);
            String str7 = this.f354377h;
            if (str7 != null) {
                e2 += C52418a.m58683j(6, str7);
            }
            int g = e2 + C52418a.m58680g(7, 8, this.f354378i);
            C118447nw2 nw23 = this.f354379j;
            if (nw23 != null) {
                g += C52418a.m58682i(8, nw23.computeSize());
            }
            String str8 = this.f354380n;
            if (str8 != null) {
                g += C52418a.m58683j(9, str8);
            }
            int a = g + C52418a.m58674a(10, this.f354381o);
            String str9 = this.f354382p;
            if (str9 != null) {
                a += C52418a.m58683j(11, str9);
            }
            String str10 = this.f354383q;
            if (str10 != null) {
                a += C52418a.m58683j(12, str10);
            }
            C118477wj3 wj34 = this.f354384r;
            if (wj34 != null) {
                a += C52418a.m58682i(13, wj34.computeSize());
            }
            C118477wj3 wj35 = this.f354385s;
            if (wj35 != null) {
                a += C52418a.m58682i(14, wj35.computeSize());
            }
            int e3 = a + C52418a.m58678e(15, this.f354386t);
            C89349b bVar2 = this.f354387u;
            if (bVar2 != null) {
                e3 += C52418a.m58675b(16, bVar2);
            }
            int e4 = e3 + C52418a.m58678e(17, this.f354388v);
            C64774vi viVar2 = this.f354389w;
            if (viVar2 != null) {
                e4 += C52418a.m58682i(18, viVar2.computeSize());
            }
            int a2 = e4 + C52418a.m58674a(19, this.f354390x);
            C118480xn3 xn33 = this.f354391y;
            return xn33 != null ? a2 + C52418a.m58682i(20, xn33.computeSize()) : a2;
        } else if (i2 == 2) {
            this.f354378i.clear();
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
            C118466sp spVar = objArr[1];
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
                        spVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    spVar.f354373d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64320dn3 dn34 = new C64320dn3();
                        if (bArr2 != null && bArr2.length > 0) {
                            dn34.parseFrom(bArr2);
                        }
                        spVar.f354374e = dn34;
                    }
                    return 0;
                case 4:
                    spVar.f354375f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    spVar.f354376g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    spVar.f354377h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C118447nw2 nw24 = new C118447nw2();
                        if (bArr3 != null && bArr3.length > 0) {
                            nw24.parseFrom(bArr3);
                        }
                        spVar.f354378i.add(nw24);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C118447nw2 nw25 = new C118447nw2();
                        if (bArr4 != null && bArr4.length > 0) {
                            nw25.parseFrom(bArr4);
                        }
                        spVar.f354379j = nw25;
                    }
                    return 0;
                case 9:
                    spVar.f354380n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    spVar.f354381o = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    spVar.f354382p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    spVar.f354383q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C118477wj3 wj36 = new C118477wj3();
                        if (bArr5 != null && bArr5.length > 0) {
                            wj36.parseFrom(bArr5);
                        }
                        spVar.f354384r = wj36;
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C118477wj3 wj37 = new C118477wj3();
                        if (bArr6 != null && bArr6.length > 0) {
                            wj37.parseFrom(bArr6);
                        }
                        spVar.f354385s = wj37;
                    }
                    return 0;
                case 15:
                    spVar.f354386t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    spVar.f354387u = aVar3.mo141626d(intValue);
                    return 0;
                case 17:
                    spVar.f354388v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C64774vi viVar3 = new C64774vi();
                        if (bArr7 != null && bArr7.length > 0) {
                            viVar3.parseFrom(bArr7);
                        }
                        spVar.f354389w = viVar3;
                    }
                    return 0;
                case 19:
                    spVar.f354390x = aVar3.mo141625c(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C118480xn3 xn34 = new C118480xn3();
                        if (bArr8 != null && bArr8.length > 0) {
                            xn34.parseFrom(bArr8);
                        }
                        spVar.f354391y = xn34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
