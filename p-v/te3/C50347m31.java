package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m31 */
public class C50347m31 extends C47465a {

    /* renamed from: d */
    public String f137800d;

    /* renamed from: e */
    public int f137801e;

    /* renamed from: f */
    public C49765hx0 f137802f;

    /* renamed from: g */
    public C49765hx0 f137803g;

    /* renamed from: h */
    public int f137804h;

    /* renamed from: i */
    public C51795w71 f137805i;

    /* renamed from: j */
    public LinkedList<C50209l31> f137806j = new LinkedList<>();

    /* renamed from: n */
    public C50629o31 f137807n;

    /* renamed from: o */
    public C49906iw0 f137808o;

    /* renamed from: p */
    public boolean f137809p;

    /* renamed from: q */
    public C50268li2 f137810q;

    /* renamed from: r */
    public C52031xw2 f137811r;

    /* renamed from: s */
    public C50489n31 f137812s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50347m31)) {
            return false;
        }
        C50347m31 m312 = (C50347m31) aVar;
        return C46238a.m51546a(this.f137800d, m312.f137800d) && C46238a.m51546a(Integer.valueOf(this.f137801e), Integer.valueOf(m312.f137801e)) && C46238a.m51546a(this.f137802f, m312.f137802f) && C46238a.m51546a(this.f137803g, m312.f137803g) && C46238a.m51546a(Integer.valueOf(this.f137804h), Integer.valueOf(m312.f137804h)) && C46238a.m51546a(this.f137805i, m312.f137805i) && C46238a.m51546a(this.f137806j, m312.f137806j) && C46238a.m51546a(this.f137807n, m312.f137807n) && C46238a.m51546a(this.f137808o, m312.f137808o) && C46238a.m51546a(Boolean.valueOf(this.f137809p), Boolean.valueOf(m312.f137809p)) && C46238a.m51546a(this.f137810q, m312.f137810q) && C46238a.m51546a(this.f137811r, m312.f137811r) && C46238a.m51546a(this.f137812s, m312.f137812s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137800d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f137801e);
            C49765hx0 hx02 = this.f137802f;
            if (hx02 != null) {
                aVar.mo74322i(3, hx02.computeSize());
                this.f137802f.writeFields(aVar);
            }
            C49765hx0 hx03 = this.f137803g;
            if (hx03 != null) {
                aVar.mo74322i(4, hx03.computeSize());
                this.f137803g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f137804h);
            C51795w71 w712 = this.f137805i;
            if (w712 != null) {
                aVar.mo74322i(6, w712.computeSize());
                this.f137805i.writeFields(aVar);
            }
            aVar.mo74320g(7, 8, this.f137806j);
            C50629o31 o312 = this.f137807n;
            if (o312 != null) {
                aVar.mo74322i(8, o312.computeSize());
                this.f137807n.writeFields(aVar);
            }
            C49906iw0 iw02 = this.f137808o;
            if (iw02 != null) {
                aVar.mo74322i(9, iw02.computeSize());
                this.f137808o.writeFields(aVar);
            }
            aVar.mo74314a(10, this.f137809p);
            C50268li2 li22 = this.f137810q;
            if (li22 != null) {
                aVar.mo74322i(11, li22.computeSize());
                this.f137810q.writeFields(aVar);
            }
            C52031xw2 xw22 = this.f137811r;
            if (xw22 != null) {
                aVar.mo74322i(12, xw22.computeSize());
                this.f137811r.writeFields(aVar);
            }
            C50489n31 n312 = this.f137812s;
            if (n312 == null) {
                return 0;
            }
            aVar.mo74322i(13, n312.computeSize());
            this.f137812s.writeFields(aVar);
            return 0;
        } else if (i2 == 1) {
            String str2 = this.f137800d;
            int j = (str2 != null ? 0 + C52418a.m58683j(1, str2) : 0) + C52418a.m58678e(2, this.f137801e);
            C49765hx0 hx04 = this.f137802f;
            if (hx04 != null) {
                j += C52418a.m58682i(3, hx04.computeSize());
            }
            C49765hx0 hx05 = this.f137803g;
            if (hx05 != null) {
                j += C52418a.m58682i(4, hx05.computeSize());
            }
            int e = j + C52418a.m58678e(5, this.f137804h);
            C51795w71 w713 = this.f137805i;
            if (w713 != null) {
                e += C52418a.m58682i(6, w713.computeSize());
            }
            int g = e + C52418a.m58680g(7, 8, this.f137806j);
            C50629o31 o313 = this.f137807n;
            if (o313 != null) {
                g += C52418a.m58682i(8, o313.computeSize());
            }
            C49906iw0 iw03 = this.f137808o;
            if (iw03 != null) {
                g += C52418a.m58682i(9, iw03.computeSize());
            }
            int a = g + C52418a.m58674a(10, this.f137809p);
            C50268li2 li23 = this.f137810q;
            if (li23 != null) {
                a += C52418a.m58682i(11, li23.computeSize());
            }
            C52031xw2 xw23 = this.f137811r;
            if (xw23 != null) {
                a += C52418a.m58682i(12, xw23.computeSize());
            }
            C50489n31 n313 = this.f137812s;
            return n313 != null ? a + C52418a.m58682i(13, n313.computeSize()) : a;
        } else if (i2 == 2) {
            this.f137806j.clear();
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
            C50347m31 m312 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    m312.f137800d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    m312.f137801e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C49765hx0 hx06 = new C49765hx0();
                        if (bArr != null && bArr.length > 0) {
                            hx06.parseFrom(bArr);
                        }
                        m312.f137802f = hx06;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size2 = j3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j3.get(i4);
                        C49765hx0 hx07 = new C49765hx0();
                        if (bArr2 != null && bArr2.length > 0) {
                            hx07.parseFrom(bArr2);
                        }
                        m312.f137803g = hx07;
                    }
                    return 0;
                case 5:
                    m312.f137804h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size3 = j4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j4.get(i5);
                        C51795w71 w714 = new C51795w71();
                        if (bArr3 != null && bArr3.length > 0) {
                            w714.parseFrom(bArr3);
                        }
                        m312.f137805i = w714;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size4 = j5.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j5.get(i6);
                        C50209l31 l312 = new C50209l31();
                        if (bArr4 != null && bArr4.length > 0) {
                            l312.parseFrom(bArr4);
                        }
                        m312.f137806j.add(l312);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size5 = j6.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j6.get(i7);
                        C50629o31 o314 = new C50629o31();
                        if (bArr5 != null && bArr5.length > 0) {
                            o314.parseFrom(bArr5);
                        }
                        m312.f137807n = o314;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size6 = j7.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j7.get(i8);
                        C49906iw0 iw04 = new C49906iw0();
                        if (bArr6 != null && bArr6.length > 0) {
                            iw04.parseFrom(bArr6);
                        }
                        m312.f137808o = iw04;
                    }
                    return 0;
                case 10:
                    m312.f137809p = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size7 = j8.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j8.get(i9);
                        C50268li2 li24 = new C50268li2();
                        if (bArr7 != null && bArr7.length > 0) {
                            li24.parseFrom(bArr7);
                        }
                        m312.f137810q = li24;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size8 = j9.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j9.get(i15);
                        C52031xw2 xw24 = new C52031xw2();
                        if (bArr8 != null && bArr8.length > 0) {
                            xw24.parseFrom(bArr8);
                        }
                        m312.f137811r = xw24;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size9 = j15.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j15.get(i16);
                        C50489n31 n314 = new C50489n31();
                        if (bArr9 != null && bArr9.length > 0) {
                            n314.parseFrom(bArr9);
                        }
                        m312.f137812s = n314;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
