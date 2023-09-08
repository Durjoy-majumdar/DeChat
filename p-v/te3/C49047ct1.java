package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ct1 */
public class C49047ct1 extends C47465a {

    /* renamed from: d */
    public C49098d51 f131939d;

    /* renamed from: e */
    public LinkedList<C51745vv0> f131940e = new LinkedList<>();

    /* renamed from: f */
    public int f131941f;

    /* renamed from: g */
    public int f131942g;

    /* renamed from: h */
    public int f131943h;

    /* renamed from: i */
    public int f131944i;

    /* renamed from: j */
    public C52312zv0 f131945j;

    /* renamed from: n */
    public C50360m61 f131946n;

    /* renamed from: o */
    public int f131947o;

    /* renamed from: p */
    public long f131948p;

    /* renamed from: q */
    public C50266li0 f131949q;

    /* renamed from: r */
    public C50326ly0 f131950r;

    /* renamed from: s */
    public u94 f131951s;

    /* renamed from: t */
    public boolean f131952t;

    /* renamed from: u */
    public C64789vy0 f131953u;

    /* renamed from: v */
    public int f131954v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49047ct1)) {
            return false;
        }
        C49047ct1 ct12 = (C49047ct1) aVar;
        return C46238a.m51546a(this.f131939d, ct12.f131939d) && C46238a.m51546a(this.f131940e, ct12.f131940e) && C46238a.m51546a(Integer.valueOf(this.f131941f), Integer.valueOf(ct12.f131941f)) && C46238a.m51546a(Integer.valueOf(this.f131942g), Integer.valueOf(ct12.f131942g)) && C46238a.m51546a(Integer.valueOf(this.f131943h), Integer.valueOf(ct12.f131943h)) && C46238a.m51546a(Integer.valueOf(this.f131944i), Integer.valueOf(ct12.f131944i)) && C46238a.m51546a(this.f131945j, ct12.f131945j) && C46238a.m51546a(this.f131946n, ct12.f131946n) && C46238a.m51546a(Integer.valueOf(this.f131947o), Integer.valueOf(ct12.f131947o)) && C46238a.m51546a(Long.valueOf(this.f131948p), Long.valueOf(ct12.f131948p)) && C46238a.m51546a(this.f131949q, ct12.f131949q) && C46238a.m51546a(this.f131950r, ct12.f131950r) && C46238a.m51546a(this.f131951s, ct12.f131951s) && C46238a.m51546a(Boolean.valueOf(this.f131952t), Boolean.valueOf(ct12.f131952t)) && C46238a.m51546a(this.f131953u, ct12.f131953u) && C46238a.m51546a(Integer.valueOf(this.f131954v), Integer.valueOf(ct12.f131954v));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49098d51 d512 = this.f131939d;
            if (d512 != null) {
                aVar.mo74322i(1, d512.computeSize());
                this.f131939d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f131940e);
            aVar.mo74318e(3, this.f131941f);
            aVar.mo74318e(4, this.f131942g);
            aVar.mo74318e(5, this.f131943h);
            aVar.mo74318e(6, this.f131944i);
            C52312zv0 zv02 = this.f131945j;
            if (zv02 != null) {
                aVar.mo74322i(7, zv02.computeSize());
                this.f131945j.writeFields(aVar);
            }
            C50360m61 m612 = this.f131946n;
            if (m612 != null) {
                aVar.mo74322i(8, m612.computeSize());
                this.f131946n.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f131947o);
            aVar.mo74321h(10, this.f131948p);
            C50266li0 li02 = this.f131949q;
            if (li02 != null) {
                aVar.mo74322i(11, li02.computeSize());
                this.f131949q.writeFields(aVar);
            }
            C50326ly0 ly02 = this.f131950r;
            if (ly02 != null) {
                aVar.mo74322i(12, ly02.computeSize());
                this.f131950r.writeFields(aVar);
            }
            u94 u94 = this.f131951s;
            if (u94 != null) {
                aVar.mo74322i(13, u94.computeSize());
                this.f131951s.writeFields(aVar);
            }
            aVar.mo74314a(14, this.f131952t);
            C64789vy0 vy02 = this.f131953u;
            if (vy02 != null) {
                aVar.mo74322i(15, vy02.computeSize());
                this.f131953u.writeFields(aVar);
            }
            aVar.mo74318e(16, this.f131954v);
            return 0;
        } else if (i2 == 1) {
            C49098d51 d513 = this.f131939d;
            if (d513 != null) {
                i3 = C52418a.m58682i(1, d513.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f131940e) + C52418a.m58678e(3, this.f131941f) + C52418a.m58678e(4, this.f131942g) + C52418a.m58678e(5, this.f131943h) + C52418a.m58678e(6, this.f131944i);
            C52312zv0 zv03 = this.f131945j;
            if (zv03 != null) {
                g += C52418a.m58682i(7, zv03.computeSize());
            }
            C50360m61 m613 = this.f131946n;
            if (m613 != null) {
                g += C52418a.m58682i(8, m613.computeSize());
            }
            int e = g + C52418a.m58678e(9, this.f131947o) + C52418a.m58681h(10, this.f131948p);
            C50266li0 li03 = this.f131949q;
            if (li03 != null) {
                e += C52418a.m58682i(11, li03.computeSize());
            }
            C50326ly0 ly03 = this.f131950r;
            if (ly03 != null) {
                e += C52418a.m58682i(12, ly03.computeSize());
            }
            u94 u942 = this.f131951s;
            if (u942 != null) {
                e += C52418a.m58682i(13, u942.computeSize());
            }
            int a = e + C52418a.m58674a(14, this.f131952t);
            C64789vy0 vy03 = this.f131953u;
            if (vy03 != null) {
                a += C52418a.m58682i(15, vy03.computeSize());
            }
            return a + C52418a.m58678e(16, this.f131954v);
        } else if (i2 == 2) {
            this.f131940e.clear();
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
            C49047ct1 ct12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49098d51 d514 = new C49098d51();
                        if (bArr != null && bArr.length > 0) {
                            d514.parseFrom(bArr);
                        }
                        ct12.f131939d = d514;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51745vv0 vv02 = new C51745vv0();
                        if (bArr2 != null && bArr2.length > 0) {
                            vv02.parseFrom(bArr2);
                        }
                        ct12.f131940e.add(vv02);
                    }
                    return 0;
                case 3:
                    ct12.f131941f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ct12.f131942g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ct12.f131943h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ct12.f131944i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C52312zv0 zv04 = new C52312zv0();
                        if (bArr3 != null && bArr3.length > 0) {
                            zv04.parseFrom(bArr3);
                        }
                        ct12.f131945j = zv04;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C50360m61 m614 = new C50360m61();
                        if (bArr4 != null && bArr4.length > 0) {
                            m614.parseFrom(bArr4);
                        }
                        ct12.f131946n = m614;
                    }
                    return 0;
                case 9:
                    ct12.f131947o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ct12.f131948p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C50266li0 li04 = new C50266li0();
                        if (bArr5 != null && bArr5.length > 0) {
                            li04.parseFrom(bArr5);
                        }
                        ct12.f131949q = li04;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C50326ly0 ly04 = new C50326ly0();
                        if (bArr6 != null && bArr6.length > 0) {
                            ly04.parseFrom(bArr6);
                        }
                        ct12.f131950r = ly04;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        u94 u943 = new u94();
                        if (bArr7 != null && bArr7.length > 0) {
                            u943.parseFrom(bArr7);
                        }
                        ct12.f131951s = u943;
                    }
                    return 0;
                case 14:
                    ct12.f131952t = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C64789vy0 vy04 = new C64789vy0();
                        if (bArr8 != null && bArr8.length > 0) {
                            vy04.parseFrom(bArr8);
                        }
                        ct12.f131953u = vy04;
                    }
                    return 0;
                case 16:
                    ct12.f131954v = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
