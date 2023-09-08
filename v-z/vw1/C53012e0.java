package vw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.e0 */
public class C53012e0 extends C47465a {

    /* renamed from: A */
    public boolean f147936A = false;

    /* renamed from: B */
    public boolean f147937B;

    /* renamed from: C */
    public C53016g0 f147938C;

    /* renamed from: d */
    public String f147939d;

    /* renamed from: e */
    public long f147940e;

    /* renamed from: f */
    public C53022k f147941f;

    /* renamed from: g */
    public C53014f0 f147942g;

    /* renamed from: h */
    public LinkedList<C53008c0> f147943h = new LinkedList<>();

    /* renamed from: i */
    public C53021j f147944i;

    /* renamed from: j */
    public boolean f147945j;

    /* renamed from: n */
    public C53010d0 f147946n;

    /* renamed from: o */
    public LinkedList<C53010d0> f147947o = new LinkedList<>();

    /* renamed from: p */
    public int f147948p;

    /* renamed from: q */
    public String f147949q;

    /* renamed from: r */
    public int f147950r;

    /* renamed from: s */
    public String f147951s;

    /* renamed from: t */
    public C53031v f147952t;

    /* renamed from: u */
    public LinkedList<String> f147953u = new LinkedList<>();

    /* renamed from: v */
    public boolean f147954v;

    /* renamed from: w */
    public int f147955w;

    /* renamed from: x */
    public C53011e f147956x;

    /* renamed from: y */
    public C53029t f147957y;

    /* renamed from: z */
    public boolean f147958z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53012e0)) {
            return false;
        }
        C53012e0 e0Var = (C53012e0) aVar;
        return C46238a.m51546a(this.f147939d, e0Var.f147939d) && C46238a.m51546a(Long.valueOf(this.f147940e), Long.valueOf(e0Var.f147940e)) && C46238a.m51546a(this.f147941f, e0Var.f147941f) && C46238a.m51546a(this.f147942g, e0Var.f147942g) && C46238a.m51546a(this.f147943h, e0Var.f147943h) && C46238a.m51546a(this.f147944i, e0Var.f147944i) && C46238a.m51546a(Boolean.valueOf(this.f147945j), Boolean.valueOf(e0Var.f147945j)) && C46238a.m51546a(this.f147946n, e0Var.f147946n) && C46238a.m51546a(this.f147947o, e0Var.f147947o) && C46238a.m51546a(Integer.valueOf(this.f147948p), Integer.valueOf(e0Var.f147948p)) && C46238a.m51546a(this.f147949q, e0Var.f147949q) && C46238a.m51546a(Integer.valueOf(this.f147950r), Integer.valueOf(e0Var.f147950r)) && C46238a.m51546a(this.f147951s, e0Var.f147951s) && C46238a.m51546a(this.f147952t, e0Var.f147952t) && C46238a.m51546a(this.f147953u, e0Var.f147953u) && C46238a.m51546a(Boolean.valueOf(this.f147954v), Boolean.valueOf(e0Var.f147954v)) && C46238a.m51546a(Integer.valueOf(this.f147955w), Integer.valueOf(e0Var.f147955w)) && C46238a.m51546a(this.f147956x, e0Var.f147956x) && C46238a.m51546a(this.f147957y, e0Var.f147957y) && C46238a.m51546a(Boolean.valueOf(this.f147958z), Boolean.valueOf(e0Var.f147958z)) && C46238a.m51546a(Boolean.valueOf(this.f147936A), Boolean.valueOf(e0Var.f147936A)) && C46238a.m51546a(Boolean.valueOf(this.f147937B), Boolean.valueOf(e0Var.f147937B)) && C46238a.m51546a(this.f147938C, e0Var.f147938C);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147939d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f147940e);
            C53022k kVar = this.f147941f;
            if (kVar != null) {
                aVar.mo74322i(3, kVar.computeSize());
                this.f147941f.writeFields(aVar);
            }
            C53014f0 f0Var = this.f147942g;
            if (f0Var != null) {
                aVar.mo74322i(4, f0Var.computeSize());
                this.f147942g.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f147943h);
            C53021j jVar = this.f147944i;
            if (jVar != null) {
                aVar.mo74322i(6, jVar.computeSize());
                this.f147944i.writeFields(aVar);
            }
            aVar.mo74314a(7, this.f147945j);
            C53010d0 d0Var = this.f147946n;
            if (d0Var != null) {
                aVar.mo74322i(8, d0Var.computeSize());
                this.f147946n.writeFields(aVar);
            }
            aVar.mo74320g(9, 8, this.f147947o);
            aVar.mo74318e(10, this.f147948p);
            String str2 = this.f147949q;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            aVar.mo74318e(12, this.f147950r);
            String str3 = this.f147951s;
            if (str3 != null) {
                aVar.mo74323j(13, str3);
            }
            C53031v vVar = this.f147952t;
            if (vVar != null) {
                aVar.mo74322i(14, vVar.computeSize());
                this.f147952t.writeFields(aVar);
            }
            aVar.mo74320g(15, 1, this.f147953u);
            aVar.mo74314a(16, this.f147954v);
            aVar.mo74318e(17, this.f147955w);
            C53011e eVar = this.f147956x;
            if (eVar != null) {
                aVar.mo74322i(18, eVar.computeSize());
                this.f147956x.writeFields(aVar);
            }
            C53029t tVar = this.f147957y;
            if (tVar != null) {
                aVar.mo74322i(19, tVar.computeSize());
                this.f147957y.writeFields(aVar);
            }
            aVar.mo74314a(20, this.f147958z);
            aVar.mo74314a(21, this.f147936A);
            aVar.mo74314a(22, this.f147937B);
            C53016g0 g0Var = this.f147938C;
            if (g0Var != null) {
                aVar.mo74322i(23, g0Var.computeSize());
                this.f147938C.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            String str4 = this.f147939d;
            if (str4 != null) {
                i3 = C52418a.m58683j(1, str4) + 0;
            }
            int h = i3 + C52418a.m58681h(2, this.f147940e);
            C53022k kVar2 = this.f147941f;
            if (kVar2 != null) {
                h += C52418a.m58682i(3, kVar2.computeSize());
            }
            C53014f0 f0Var2 = this.f147942g;
            if (f0Var2 != null) {
                h += C52418a.m58682i(4, f0Var2.computeSize());
            }
            int g = h + C52418a.m58680g(5, 8, this.f147943h);
            C53021j jVar2 = this.f147944i;
            if (jVar2 != null) {
                g += C52418a.m58682i(6, jVar2.computeSize());
            }
            int a = g + C52418a.m58674a(7, this.f147945j);
            C53010d0 d0Var2 = this.f147946n;
            if (d0Var2 != null) {
                a += C52418a.m58682i(8, d0Var2.computeSize());
            }
            int g2 = a + C52418a.m58680g(9, 8, this.f147947o) + C52418a.m58678e(10, this.f147948p);
            String str5 = this.f147949q;
            if (str5 != null) {
                g2 += C52418a.m58683j(11, str5);
            }
            int e = g2 + C52418a.m58678e(12, this.f147950r);
            String str6 = this.f147951s;
            if (str6 != null) {
                e += C52418a.m58683j(13, str6);
            }
            C53031v vVar2 = this.f147952t;
            if (vVar2 != null) {
                e += C52418a.m58682i(14, vVar2.computeSize());
            }
            int g3 = e + C52418a.m58680g(15, 1, this.f147953u) + C52418a.m58674a(16, this.f147954v) + C52418a.m58678e(17, this.f147955w);
            C53011e eVar2 = this.f147956x;
            if (eVar2 != null) {
                g3 += C52418a.m58682i(18, eVar2.computeSize());
            }
            C53029t tVar2 = this.f147957y;
            if (tVar2 != null) {
                g3 += C52418a.m58682i(19, tVar2.computeSize());
            }
            int a2 = g3 + C52418a.m58674a(20, this.f147958z) + C52418a.m58674a(21, this.f147936A) + C52418a.m58674a(22, this.f147937B);
            C53016g0 g0Var2 = this.f147938C;
            return g0Var2 != null ? a2 + C52418a.m58682i(23, g0Var2.computeSize()) : a2;
        } else if (i2 == 2) {
            this.f147943h.clear();
            this.f147947o.clear();
            this.f147953u.clear();
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
            C53012e0 e0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e0Var.f147939d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    e0Var.f147940e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C53022k kVar3 = new C53022k();
                        if (bArr != null && bArr.length > 0) {
                            kVar3.parseFrom(bArr);
                        }
                        e0Var.f147941f = kVar3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C53014f0 f0Var3 = new C53014f0();
                        if (bArr2 != null && bArr2.length > 0) {
                            f0Var3.parseFrom(bArr2);
                        }
                        e0Var.f147942g = f0Var3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C53008c0 c0Var = new C53008c0();
                        if (bArr3 != null && bArr3.length > 0) {
                            c0Var.parseFrom(bArr3);
                        }
                        e0Var.f147943h.add(c0Var);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C53021j jVar3 = new C53021j();
                        if (bArr4 != null && bArr4.length > 0) {
                            jVar3.parseFrom(bArr4);
                        }
                        e0Var.f147944i = jVar3;
                    }
                    return 0;
                case 7:
                    e0Var.f147945j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C53010d0 d0Var3 = new C53010d0();
                        if (bArr5 != null && bArr5.length > 0) {
                            d0Var3.parseFrom(bArr5);
                        }
                        e0Var.f147946n = d0Var3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C53010d0 d0Var4 = new C53010d0();
                        if (bArr6 != null && bArr6.length > 0) {
                            d0Var4.parseFrom(bArr6);
                        }
                        e0Var.f147947o.add(d0Var4);
                    }
                    return 0;
                case 10:
                    e0Var.f147948p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    e0Var.f147949q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    e0Var.f147950r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    e0Var.f147951s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C53031v vVar3 = new C53031v();
                        if (bArr7 != null && bArr7.length > 0) {
                            vVar3.parseFrom(bArr7);
                        }
                        e0Var.f147952t = vVar3;
                    }
                    return 0;
                case 15:
                    e0Var.f147953u.add(aVar3.mo141633k(intValue));
                    return 0;
                case 16:
                    e0Var.f147954v = aVar3.mo141625c(intValue);
                    return 0;
                case 17:
                    e0Var.f147955w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C53011e eVar3 = new C53011e();
                        if (bArr8 != null && bArr8.length > 0) {
                            eVar3.parseFrom(bArr8);
                        }
                        e0Var.f147956x = eVar3;
                    }
                    return 0;
                case 19:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C53029t tVar3 = new C53029t();
                        if (bArr9 != null && bArr9.length > 0) {
                            tVar3.parseFrom(bArr9);
                        }
                        e0Var.f147957y = tVar3;
                    }
                    return 0;
                case 20:
                    e0Var.f147958z = aVar3.mo141625c(intValue);
                    return 0;
                case 21:
                    e0Var.f147936A = aVar3.mo141625c(intValue);
                    return 0;
                case 22:
                    e0Var.f147937B = aVar3.mo141625c(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C53016g0 g0Var3 = new C53016g0();
                        if (bArr10 != null && bArr10.length > 0) {
                            g0Var3.parseFrom(bArr10);
                        }
                        e0Var.f147938C = g0Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
