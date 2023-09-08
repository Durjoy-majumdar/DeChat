package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mn */
public class C22514mn extends C47465a {

    /* renamed from: d */
    public String f64246d;

    /* renamed from: e */
    public String f64247e;

    /* renamed from: f */
    public String f64248f;

    /* renamed from: g */
    public String f64249g;

    /* renamed from: h */
    public LinkedList<C50151kn> f64250h = new LinkedList<>();

    /* renamed from: i */
    public int f64251i;

    /* renamed from: j */
    public String f64252j;

    /* renamed from: n */
    public C51997xn f64253n;

    /* renamed from: o */
    public String f64254o;

    /* renamed from: p */
    public LinkedList<C22502jn> f64255p = new LinkedList<>();

    /* renamed from: q */
    public String f64256q;

    /* renamed from: r */
    public String f64257r;

    /* renamed from: s */
    public C51997xn f64258s;

    /* renamed from: t */
    public C50151kn f64259t;

    /* renamed from: u */
    public int f64260u;

    /* renamed from: v */
    public int f64261v;

    /* renamed from: w */
    public int f64262w;

    /* renamed from: x */
    public long f64263x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22514mn)) {
            return false;
        }
        C22514mn mnVar = (C22514mn) aVar;
        return C46238a.m51546a(this.f64246d, mnVar.f64246d) && C46238a.m51546a(this.f64247e, mnVar.f64247e) && C46238a.m51546a(this.f64248f, mnVar.f64248f) && C46238a.m51546a(this.f64249g, mnVar.f64249g) && C46238a.m51546a(this.f64250h, mnVar.f64250h) && C46238a.m51546a(Integer.valueOf(this.f64251i), Integer.valueOf(mnVar.f64251i)) && C46238a.m51546a(this.f64252j, mnVar.f64252j) && C46238a.m51546a(this.f64253n, mnVar.f64253n) && C46238a.m51546a(this.f64254o, mnVar.f64254o) && C46238a.m51546a(this.f64255p, mnVar.f64255p) && C46238a.m51546a(this.f64256q, mnVar.f64256q) && C46238a.m51546a(this.f64257r, mnVar.f64257r) && C46238a.m51546a(this.f64258s, mnVar.f64258s) && C46238a.m51546a(this.f64259t, mnVar.f64259t) && C46238a.m51546a(Integer.valueOf(this.f64260u), Integer.valueOf(mnVar.f64260u)) && C46238a.m51546a(Integer.valueOf(this.f64261v), Integer.valueOf(mnVar.f64261v)) && C46238a.m51546a(Integer.valueOf(this.f64262w), Integer.valueOf(mnVar.f64262w)) && C46238a.m51546a(Long.valueOf(this.f64263x), Long.valueOf(mnVar.f64263x));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64246d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64247e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64248f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f64249g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74320g(5, 8, this.f64250h);
            aVar.mo74318e(6, this.f64251i);
            String str5 = this.f64252j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            C51997xn xnVar = this.f64253n;
            if (xnVar != null) {
                aVar.mo74322i(8, xnVar.computeSize());
                this.f64253n.writeFields(aVar);
            }
            String str6 = this.f64254o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            aVar.mo74320g(10, 8, this.f64255p);
            String str7 = this.f64256q;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            String str8 = this.f64257r;
            if (str8 != null) {
                aVar.mo74323j(12, str8);
            }
            C51997xn xnVar2 = this.f64258s;
            if (xnVar2 != null) {
                aVar.mo74322i(13, xnVar2.computeSize());
                this.f64258s.writeFields(aVar);
            }
            C50151kn knVar = this.f64259t;
            if (knVar != null) {
                aVar.mo74322i(14, knVar.computeSize());
                this.f64259t.writeFields(aVar);
            }
            aVar.mo74318e(15, this.f64260u);
            aVar.mo74318e(16, this.f64261v);
            aVar.mo74318e(17, this.f64262w);
            aVar.mo74321h(18, this.f64263x);
            return 0;
        } else if (i2 == 1) {
            String str9 = this.f64246d;
            if (str9 != null) {
                i3 = C52418a.m58683j(1, str9) + 0;
            }
            String str10 = this.f64247e;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f64248f;
            if (str11 != null) {
                i3 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f64249g;
            if (str12 != null) {
                i3 += C52418a.m58683j(4, str12);
            }
            int g = i3 + C52418a.m58680g(5, 8, this.f64250h) + C52418a.m58678e(6, this.f64251i);
            String str13 = this.f64252j;
            if (str13 != null) {
                g += C52418a.m58683j(7, str13);
            }
            C51997xn xnVar3 = this.f64253n;
            if (xnVar3 != null) {
                g += C52418a.m58682i(8, xnVar3.computeSize());
            }
            String str14 = this.f64254o;
            if (str14 != null) {
                g += C52418a.m58683j(9, str14);
            }
            int g2 = g + C52418a.m58680g(10, 8, this.f64255p);
            String str15 = this.f64256q;
            if (str15 != null) {
                g2 += C52418a.m58683j(11, str15);
            }
            String str16 = this.f64257r;
            if (str16 != null) {
                g2 += C52418a.m58683j(12, str16);
            }
            C51997xn xnVar4 = this.f64258s;
            if (xnVar4 != null) {
                g2 += C52418a.m58682i(13, xnVar4.computeSize());
            }
            C50151kn knVar2 = this.f64259t;
            if (knVar2 != null) {
                g2 += C52418a.m58682i(14, knVar2.computeSize());
            }
            return g2 + C52418a.m58678e(15, this.f64260u) + C52418a.m58678e(16, this.f64261v) + C52418a.m58678e(17, this.f64262w) + C52418a.m58681h(18, this.f64263x);
        } else if (i2 == 2) {
            this.f64250h.clear();
            this.f64255p.clear();
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
            C22514mn mnVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mnVar.f64246d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    mnVar.f64247e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mnVar.f64248f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mnVar.f64249g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C50151kn knVar3 = new C50151kn();
                        if (bArr != null && bArr.length > 0) {
                            knVar3.parseFrom(bArr);
                        }
                        mnVar.f64250h.add(knVar3);
                    }
                    return 0;
                case 6:
                    mnVar.f64251i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    mnVar.f64252j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51997xn xnVar5 = new C51997xn();
                        if (bArr2 != null && bArr2.length > 0) {
                            xnVar5.parseFrom(bArr2);
                        }
                        mnVar.f64253n = xnVar5;
                    }
                    return 0;
                case 9:
                    mnVar.f64254o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C22502jn jnVar = new C22502jn();
                        if (bArr3 != null && bArr3.length > 0) {
                            jnVar.parseFrom(bArr3);
                        }
                        mnVar.f64255p.add(jnVar);
                    }
                    return 0;
                case 11:
                    mnVar.f64256q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    mnVar.f64257r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51997xn xnVar6 = new C51997xn();
                        if (bArr4 != null && bArr4.length > 0) {
                            xnVar6.parseFrom(bArr4);
                        }
                        mnVar.f64258s = xnVar6;
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C50151kn knVar4 = new C50151kn();
                        if (bArr5 != null && bArr5.length > 0) {
                            knVar4.parseFrom(bArr5);
                        }
                        mnVar.f64259t = knVar4;
                    }
                    return 0;
                case 15:
                    mnVar.f64260u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    mnVar.f64261v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    mnVar.f64262w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    mnVar.f64263x = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
