package ag2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.s0 */
public class C39597s0 extends C47465a {

    /* renamed from: d */
    public int f106290d;

    /* renamed from: e */
    public String f106291e;

    /* renamed from: f */
    public String f106292f;

    /* renamed from: g */
    public C39596r0 f106293g;

    /* renamed from: h */
    public LinkedList<C39596r0> f106294h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<C39596r0> f106295i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<C39596r0> f106296j = new LinkedList<>();

    /* renamed from: n */
    public String f106297n;

    /* renamed from: o */
    public String f106298o;

    /* renamed from: p */
    public String f106299p;

    /* renamed from: q */
    public String f106300q;

    /* renamed from: r */
    public LinkedList<C39595q0> f106301r = new LinkedList<>();

    /* renamed from: s */
    public LinkedList<C39595q0> f106302s = new LinkedList<>();

    /* renamed from: t */
    public C39568b1 f106303t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39597s0)) {
            return false;
        }
        C39597s0 s0Var = (C39597s0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f106290d), Integer.valueOf(s0Var.f106290d)) && C46238a.m51546a(this.f106291e, s0Var.f106291e) && C46238a.m51546a(this.f106292f, s0Var.f106292f) && C46238a.m51546a(this.f106293g, s0Var.f106293g) && C46238a.m51546a(this.f106294h, s0Var.f106294h) && C46238a.m51546a(this.f106295i, s0Var.f106295i) && C46238a.m51546a(this.f106296j, s0Var.f106296j) && C46238a.m51546a(this.f106297n, s0Var.f106297n) && C46238a.m51546a(this.f106298o, s0Var.f106298o) && C46238a.m51546a(this.f106299p, s0Var.f106299p) && C46238a.m51546a(this.f106300q, s0Var.f106300q) && C46238a.m51546a(this.f106301r, s0Var.f106301r) && C46238a.m51546a(this.f106302s, s0Var.f106302s) && C46238a.m51546a(this.f106303t, s0Var.f106303t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f106290d);
            String str = this.f106291e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f106292f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C39596r0 r0Var = this.f106293g;
            if (r0Var != null) {
                aVar.mo74322i(4, r0Var.computeSize());
                this.f106293g.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f106294h);
            aVar.mo74320g(6, 8, this.f106295i);
            aVar.mo74320g(7, 8, this.f106296j);
            String str3 = this.f106297n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            String str4 = this.f106298o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            String str5 = this.f106299p;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            String str6 = this.f106300q;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            aVar.mo74320g(12, 8, this.f106301r);
            aVar.mo74320g(13, 8, this.f106302s);
            C39568b1 b1Var = this.f106303t;
            if (b1Var != null) {
                aVar.mo74322i(14, b1Var.computeSize());
                this.f106303t.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f106290d) + 0;
            String str7 = this.f106291e;
            if (str7 != null) {
                e += C52418a.m58683j(2, str7);
            }
            String str8 = this.f106292f;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            C39596r0 r0Var2 = this.f106293g;
            if (r0Var2 != null) {
                e += C52418a.m58682i(4, r0Var2.computeSize());
            }
            int g = e + C52418a.m58680g(5, 8, this.f106294h) + C52418a.m58680g(6, 8, this.f106295i) + C52418a.m58680g(7, 8, this.f106296j);
            String str9 = this.f106297n;
            if (str9 != null) {
                g += C52418a.m58683j(8, str9);
            }
            String str10 = this.f106298o;
            if (str10 != null) {
                g += C52418a.m58683j(9, str10);
            }
            String str11 = this.f106299p;
            if (str11 != null) {
                g += C52418a.m58683j(10, str11);
            }
            String str12 = this.f106300q;
            if (str12 != null) {
                g += C52418a.m58683j(11, str12);
            }
            int g2 = g + C52418a.m58680g(12, 8, this.f106301r) + C52418a.m58680g(13, 8, this.f106302s);
            C39568b1 b1Var2 = this.f106303t;
            return b1Var2 != null ? g2 + C52418a.m58682i(14, b1Var2.computeSize()) : g2;
        } else if (i2 == 2) {
            this.f106294h.clear();
            this.f106295i.clear();
            this.f106296j.clear();
            this.f106301r.clear();
            this.f106302s.clear();
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
            C39597s0 s0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    s0Var.f106290d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    s0Var.f106291e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    s0Var.f106292f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C39596r0 r0Var3 = new C39596r0();
                        if (bArr != null && bArr.length > 0) {
                            r0Var3.parseFrom(bArr);
                        }
                        s0Var.f106293g = r0Var3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C39596r0 r0Var4 = new C39596r0();
                        if (bArr2 != null && bArr2.length > 0) {
                            r0Var4.parseFrom(bArr2);
                        }
                        s0Var.f106294h.add(r0Var4);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C39596r0 r0Var5 = new C39596r0();
                        if (bArr3 != null && bArr3.length > 0) {
                            r0Var5.parseFrom(bArr3);
                        }
                        s0Var.f106295i.add(r0Var5);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C39596r0 r0Var6 = new C39596r0();
                        if (bArr4 != null && bArr4.length > 0) {
                            r0Var6.parseFrom(bArr4);
                        }
                        s0Var.f106296j.add(r0Var6);
                    }
                    return 0;
                case 8:
                    s0Var.f106297n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    s0Var.f106298o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    s0Var.f106299p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    s0Var.f106300q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C39595q0 q0Var = new C39595q0();
                        if (bArr5 != null && bArr5.length > 0) {
                            q0Var.parseFrom(bArr5);
                        }
                        s0Var.f106301r.add(q0Var);
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C39595q0 q0Var2 = new C39595q0();
                        if (bArr6 != null && bArr6.length > 0) {
                            q0Var2.parseFrom(bArr6);
                        }
                        s0Var.f106302s.add(q0Var2);
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C39568b1 b1Var3 = new C39568b1();
                        if (bArr7 != null && bArr7.length > 0) {
                            b1Var3.parseFrom(bArr7);
                        }
                        s0Var.f106303t = b1Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
