package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zy */
public class C64899zy extends C47465a {

    /* renamed from: d */
    public LinkedList<hi4> f186899d = new LinkedList<>();

    /* renamed from: e */
    public long f186900e;

    /* renamed from: f */
    public long f186901f;

    /* renamed from: g */
    public boolean f186902g;

    /* renamed from: h */
    public String f186903h;

    /* renamed from: i */
    public C101758az f186904i;

    /* renamed from: j */
    public boolean f186905j;

    /* renamed from: n */
    public C64869yy f186906n;

    /* renamed from: o */
    public LinkedList<C64536lu2> f186907o = new LinkedList<>();

    /* renamed from: p */
    public rr4 f186908p;

    /* renamed from: q */
    public boolean f186909q;

    /* renamed from: r */
    public LinkedList<C64270bz> f186910r = new LinkedList<>();

    /* renamed from: s */
    public String f186911s;

    /* renamed from: t */
    public boolean f186912t;

    /* renamed from: u */
    public LinkedList<lb4> f186913u = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64899zy)) {
            return false;
        }
        C64899zy zyVar = (C64899zy) aVar;
        return C46238a.m51546a(this.f186899d, zyVar.f186899d) && C46238a.m51546a(Long.valueOf(this.f186900e), Long.valueOf(zyVar.f186900e)) && C46238a.m51546a(Long.valueOf(this.f186901f), Long.valueOf(zyVar.f186901f)) && C46238a.m51546a(Boolean.valueOf(this.f186902g), Boolean.valueOf(zyVar.f186902g)) && C46238a.m51546a(this.f186903h, zyVar.f186903h) && C46238a.m51546a(this.f186904i, zyVar.f186904i) && C46238a.m51546a(Boolean.valueOf(this.f186905j), Boolean.valueOf(zyVar.f186905j)) && C46238a.m51546a(this.f186906n, zyVar.f186906n) && C46238a.m51546a(this.f186907o, zyVar.f186907o) && C46238a.m51546a(this.f186908p, zyVar.f186908p) && C46238a.m51546a(Boolean.valueOf(this.f186909q), Boolean.valueOf(zyVar.f186909q)) && C46238a.m51546a(this.f186910r, zyVar.f186910r) && C46238a.m51546a(this.f186911s, zyVar.f186911s) && C46238a.m51546a(Boolean.valueOf(this.f186912t), Boolean.valueOf(zyVar.f186912t)) && C46238a.m51546a(this.f186913u, zyVar.f186913u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f186899d);
            aVar.mo74321h(2, this.f186900e);
            aVar.mo74321h(3, this.f186901f);
            aVar.mo74314a(4, this.f186902g);
            String str = this.f186903h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            C101758az azVar = this.f186904i;
            if (azVar != null) {
                aVar.mo74322i(6, azVar.computeSize());
                this.f186904i.writeFields(aVar);
            }
            aVar.mo74314a(7, this.f186905j);
            C64869yy yyVar = this.f186906n;
            if (yyVar != null) {
                aVar.mo74322i(8, yyVar.computeSize());
                this.f186906n.writeFields(aVar);
            }
            aVar.mo74320g(9, 8, this.f186907o);
            rr4 rr4 = this.f186908p;
            if (rr4 != null) {
                aVar.mo74322i(10, rr4.computeSize());
                this.f186908p.writeFields(aVar);
            }
            aVar.mo74314a(11, this.f186909q);
            aVar.mo74320g(12, 8, this.f186910r);
            String str2 = this.f186911s;
            if (str2 != null) {
                aVar.mo74323j(13, str2);
            }
            aVar.mo74314a(14, this.f186912t);
            aVar.mo74320g(15, 8, this.f186913u);
            return 0;
        } else if (i2 == 1) {
            int g = C52418a.m58680g(1, 8, this.f186899d) + 0 + C52418a.m58681h(2, this.f186900e) + C52418a.m58681h(3, this.f186901f) + C52418a.m58674a(4, this.f186902g);
            String str3 = this.f186903h;
            if (str3 != null) {
                g += C52418a.m58683j(5, str3);
            }
            C101758az azVar2 = this.f186904i;
            if (azVar2 != null) {
                g += C52418a.m58682i(6, azVar2.computeSize());
            }
            int a = g + C52418a.m58674a(7, this.f186905j);
            C64869yy yyVar2 = this.f186906n;
            if (yyVar2 != null) {
                a += C52418a.m58682i(8, yyVar2.computeSize());
            }
            int g2 = a + C52418a.m58680g(9, 8, this.f186907o);
            rr4 rr42 = this.f186908p;
            if (rr42 != null) {
                g2 += C52418a.m58682i(10, rr42.computeSize());
            }
            int a2 = g2 + C52418a.m58674a(11, this.f186909q) + C52418a.m58680g(12, 8, this.f186910r);
            String str4 = this.f186911s;
            if (str4 != null) {
                a2 += C52418a.m58683j(13, str4);
            }
            return a2 + C52418a.m58674a(14, this.f186912t) + C52418a.m58680g(15, 8, this.f186913u);
        } else if (i2 == 2) {
            this.f186899d.clear();
            this.f186907o.clear();
            this.f186910r.clear();
            this.f186913u.clear();
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
            C64899zy zyVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        hi4 hi4 = new hi4();
                        if (bArr != null && bArr.length > 0) {
                            hi4.parseFrom(bArr);
                        }
                        zyVar.f186899d.add(hi4);
                    }
                    return 0;
                case 2:
                    zyVar.f186900e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    zyVar.f186901f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    zyVar.f186902g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    zyVar.f186903h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C101758az azVar3 = new C101758az();
                        if (bArr2 != null && bArr2.length > 0) {
                            azVar3.parseFrom(bArr2);
                        }
                        zyVar.f186904i = azVar3;
                    }
                    return 0;
                case 7:
                    zyVar.f186905j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64869yy yyVar3 = new C64869yy();
                        if (bArr3 != null && bArr3.length > 0) {
                            yyVar3.parseFrom(bArr3);
                        }
                        zyVar.f186906n = yyVar3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C64536lu2 lu22 = new C64536lu2();
                        if (bArr4 != null && bArr4.length > 0) {
                            lu22.parseFrom(bArr4);
                        }
                        zyVar.f186907o.add(lu22);
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        rr4 rr43 = new rr4();
                        if (bArr5 != null && bArr5.length > 0) {
                            rr43.parseFrom(bArr5);
                        }
                        zyVar.f186908p = rr43;
                    }
                    return 0;
                case 11:
                    zyVar.f186909q = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C64270bz bzVar = new C64270bz();
                        if (bArr6 != null && bArr6.length > 0) {
                            bzVar.parseFrom(bArr6);
                        }
                        zyVar.f186910r.add(bzVar);
                    }
                    return 0;
                case 13:
                    zyVar.f186911s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    zyVar.f186912t = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        lb4 lb4 = new lb4();
                        if (bArr7 != null && bArr7.length > 0) {
                            lb4.parseFrom(bArr7);
                        }
                        zyVar.f186913u.add(lb4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
