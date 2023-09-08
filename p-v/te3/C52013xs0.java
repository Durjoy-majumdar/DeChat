package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xs0 */
public class C52013xs0 extends C47465a {

    /* renamed from: d */
    public C49765hx0 f144902d;

    /* renamed from: e */
    public int f144903e;

    /* renamed from: f */
    public String f144904f;

    /* renamed from: g */
    public long f144905g;

    /* renamed from: h */
    public C89349b f144906h;

    /* renamed from: i */
    public C50732ou0 f144907i;

    /* renamed from: j */
    public LinkedList<C49765hx0> f144908j = new LinkedList<>();

    /* renamed from: n */
    public String f144909n;

    /* renamed from: o */
    public C50317lw0 f144910o;

    /* renamed from: p */
    public int f144911p;

    /* renamed from: q */
    public int f144912q;

    /* renamed from: r */
    public long f144913r;

    /* renamed from: s */
    public C49765hx0 f144914s;

    /* renamed from: t */
    public String f144915t;

    /* renamed from: u */
    public int f144916u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52013xs0)) {
            return false;
        }
        C52013xs0 xs02 = (C52013xs0) aVar;
        return C46238a.m51546a(this.f144902d, xs02.f144902d) && C46238a.m51546a(Integer.valueOf(this.f144903e), Integer.valueOf(xs02.f144903e)) && C46238a.m51546a(this.f144904f, xs02.f144904f) && C46238a.m51546a(Long.valueOf(this.f144905g), Long.valueOf(xs02.f144905g)) && C46238a.m51546a(this.f144906h, xs02.f144906h) && C46238a.m51546a(this.f144907i, xs02.f144907i) && C46238a.m51546a(this.f144908j, xs02.f144908j) && C46238a.m51546a(this.f144909n, xs02.f144909n) && C46238a.m51546a(this.f144910o, xs02.f144910o) && C46238a.m51546a(Integer.valueOf(this.f144911p), Integer.valueOf(xs02.f144911p)) && C46238a.m51546a(Integer.valueOf(this.f144912q), Integer.valueOf(xs02.f144912q)) && C46238a.m51546a(Long.valueOf(this.f144913r), Long.valueOf(xs02.f144913r)) && C46238a.m51546a(this.f144914s, xs02.f144914s) && C46238a.m51546a(this.f144915t, xs02.f144915t) && C46238a.m51546a(Integer.valueOf(this.f144916u), Integer.valueOf(xs02.f144916u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49765hx0 hx02 = this.f144902d;
            if (hx02 != null) {
                aVar.mo74322i(1, hx02.computeSize());
                this.f144902d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f144903e);
            String str = this.f144904f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f144905g);
            C89349b bVar = this.f144906h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            C50732ou0 ou02 = this.f144907i;
            if (ou02 != null) {
                aVar.mo74322i(6, ou02.computeSize());
                this.f144907i.writeFields(aVar);
            }
            aVar.mo74320g(7, 8, this.f144908j);
            String str2 = this.f144909n;
            if (str2 != null) {
                aVar.mo74323j(51, str2);
            }
            C50317lw0 lw02 = this.f144910o;
            if (lw02 != null) {
                aVar.mo74322i(52, lw02.computeSize());
                this.f144910o.writeFields(aVar);
            }
            aVar.mo74318e(53, this.f144911p);
            aVar.mo74318e(54, this.f144912q);
            aVar.mo74321h(101, this.f144913r);
            C49765hx0 hx03 = this.f144914s;
            if (hx03 != null) {
                aVar.mo74322i(102, hx03.computeSize());
                this.f144914s.writeFields(aVar);
            }
            String str3 = this.f144915t;
            if (str3 != null) {
                aVar.mo74323j(103, str3);
            }
            aVar.mo74318e(1000, this.f144916u);
            return 0;
        } else if (i2 == 1) {
            C49765hx0 hx04 = this.f144902d;
            if (hx04 != null) {
                i3 = C52418a.m58682i(1, hx04.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f144903e);
            String str4 = this.f144904f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            int h = e + C52418a.m58681h(4, this.f144905g);
            C89349b bVar2 = this.f144906h;
            if (bVar2 != null) {
                h += C52418a.m58675b(5, bVar2);
            }
            C50732ou0 ou03 = this.f144907i;
            if (ou03 != null) {
                h += C52418a.m58682i(6, ou03.computeSize());
            }
            int g = h + C52418a.m58680g(7, 8, this.f144908j);
            String str5 = this.f144909n;
            if (str5 != null) {
                g += C52418a.m58683j(51, str5);
            }
            C50317lw0 lw03 = this.f144910o;
            if (lw03 != null) {
                g += C52418a.m58682i(52, lw03.computeSize());
            }
            int e2 = g + C52418a.m58678e(53, this.f144911p) + C52418a.m58678e(54, this.f144912q) + C52418a.m58681h(101, this.f144913r);
            C49765hx0 hx05 = this.f144914s;
            if (hx05 != null) {
                e2 += C52418a.m58682i(102, hx05.computeSize());
            }
            String str6 = this.f144915t;
            if (str6 != null) {
                e2 += C52418a.m58683j(103, str6);
            }
            return e2 + C52418a.m58678e(1000, this.f144916u);
        } else if (i2 == 2) {
            this.f144908j.clear();
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
            C52013xs0 xs02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1000) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            byte[] bArr = j.get(i4);
                            C49765hx0 hx06 = new C49765hx0();
                            if (bArr != null && bArr.length > 0) {
                                hx06.parseFrom(bArr);
                            }
                            xs02.f144902d = hx06;
                        }
                        return 0;
                    case 2:
                        xs02.f144903e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        xs02.f144904f = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        xs02.f144905g = aVar3.mo141631i(intValue);
                        return 0;
                    case 5:
                        xs02.f144906h = aVar3.mo141626d(intValue);
                        return 0;
                    case 6:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C50732ou0 ou04 = new C50732ou0();
                            if (bArr2 != null && bArr2.length > 0) {
                                ou04.parseFrom(bArr2);
                            }
                            xs02.f144907i = ou04;
                        }
                        return 0;
                    case 7:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            byte[] bArr3 = j3.get(i6);
                            C49765hx0 hx07 = new C49765hx0();
                            if (bArr3 != null && bArr3.length > 0) {
                                hx07.parseFrom(bArr3);
                            }
                            xs02.f144908j.add(hx07);
                        }
                        return 0;
                    default:
                        switch (intValue) {
                            case 51:
                                xs02.f144909n = aVar3.mo141633k(intValue);
                                return 0;
                            case 52:
                                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                                int size4 = j4.size();
                                for (int i7 = 0; i7 < size4; i7++) {
                                    byte[] bArr4 = j4.get(i7);
                                    C50317lw0 lw04 = new C50317lw0();
                                    if (bArr4 != null && bArr4.length > 0) {
                                        lw04.parseFrom(bArr4);
                                    }
                                    xs02.f144910o = lw04;
                                }
                                return 0;
                            case 53:
                                xs02.f144911p = aVar3.mo141629g(intValue);
                                return 0;
                            case 54:
                                xs02.f144912q = aVar3.mo141629g(intValue);
                                return 0;
                            default:
                                switch (intValue) {
                                    case 101:
                                        xs02.f144913r = aVar3.mo141631i(intValue);
                                        return 0;
                                    case 102:
                                        LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                                        int size5 = j5.size();
                                        for (int i8 = 0; i8 < size5; i8++) {
                                            byte[] bArr5 = j5.get(i8);
                                            C49765hx0 hx08 = new C49765hx0();
                                            if (bArr5 != null && bArr5.length > 0) {
                                                hx08.parseFrom(bArr5);
                                            }
                                            xs02.f144914s = hx08;
                                        }
                                        return 0;
                                    case 103:
                                        xs02.f144915t = aVar3.mo141633k(intValue);
                                        return 0;
                                    default:
                                        return -1;
                                }
                        }
                }
            } else {
                xs02.f144916u = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
