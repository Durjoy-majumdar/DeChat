package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class t84 extends C101820nt3 {

    /* renamed from: A */
    public int f299488A;

    /* renamed from: B */
    public int f299489B;

    /* renamed from: C */
    public LinkedList<C51163rv3> f299490C = new LinkedList<>();

    /* renamed from: D */
    public int f299491D;

    /* renamed from: d */
    public String f299492d;

    /* renamed from: e */
    public long f299493e;

    /* renamed from: f */
    public long f299494f;

    /* renamed from: g */
    public int f299495g;

    /* renamed from: h */
    public long f299496h;

    /* renamed from: i */
    public C51018qv3 f299497i;

    /* renamed from: j */
    public int f299498j;

    /* renamed from: n */
    public int f299499n;

    /* renamed from: o */
    public LinkedList<Long> f299500o = new LinkedList<>();

    /* renamed from: p */
    public int f299501p;

    /* renamed from: q */
    public int f299502q;

    /* renamed from: r */
    public long f299503r;

    /* renamed from: s */
    public long f299504s;

    /* renamed from: t */
    public long f299505t;

    /* renamed from: u */
    public int f299506u;

    /* renamed from: v */
    public long f299507v;

    /* renamed from: w */
    public C51018qv3 f299508w;

    /* renamed from: x */
    public int f299509x;

    /* renamed from: y */
    public LinkedList<Long> f299510y = new LinkedList<>();

    /* renamed from: z */
    public long f299511z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof t84)) {
            return false;
        }
        t84 t84 = (t84) aVar;
        return C46238a.m51546a(this.BaseRequest, t84.BaseRequest) && C46238a.m51546a(this.f299492d, t84.f299492d) && C46238a.m51546a(Long.valueOf(this.f299493e), Long.valueOf(t84.f299493e)) && C46238a.m51546a(Long.valueOf(this.f299494f), Long.valueOf(t84.f299494f)) && C46238a.m51546a(Integer.valueOf(this.f299495g), Integer.valueOf(t84.f299495g)) && C46238a.m51546a(Long.valueOf(this.f299496h), Long.valueOf(t84.f299496h)) && C46238a.m51546a(this.f299497i, t84.f299497i) && C46238a.m51546a(Integer.valueOf(this.f299498j), Integer.valueOf(t84.f299498j)) && C46238a.m51546a(Integer.valueOf(this.f299499n), Integer.valueOf(t84.f299499n)) && C46238a.m51546a(this.f299500o, t84.f299500o) && C46238a.m51546a(Integer.valueOf(this.f299501p), Integer.valueOf(t84.f299501p)) && C46238a.m51546a(Integer.valueOf(this.f299502q), Integer.valueOf(t84.f299502q)) && C46238a.m51546a(Long.valueOf(this.f299503r), Long.valueOf(t84.f299503r)) && C46238a.m51546a(Long.valueOf(this.f299504s), Long.valueOf(t84.f299504s)) && C46238a.m51546a(Long.valueOf(this.f299505t), Long.valueOf(t84.f299505t)) && C46238a.m51546a(Integer.valueOf(this.f299506u), Integer.valueOf(t84.f299506u)) && C46238a.m51546a(Long.valueOf(this.f299507v), Long.valueOf(t84.f299507v)) && C46238a.m51546a(this.f299508w, t84.f299508w) && C46238a.m51546a(Integer.valueOf(this.f299509x), Integer.valueOf(t84.f299509x)) && C46238a.m51546a(this.f299510y, t84.f299510y) && C46238a.m51546a(Long.valueOf(this.f299511z), Long.valueOf(t84.f299511z)) && C46238a.m51546a(Integer.valueOf(this.f299488A), Integer.valueOf(t84.f299488A)) && C46238a.m51546a(Integer.valueOf(this.f299489B), Integer.valueOf(t84.f299489B)) && C46238a.m51546a(this.f299490C, t84.f299490C) && C46238a.m51546a(Integer.valueOf(this.f299491D), Integer.valueOf(t84.f299491D));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f299492d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f299493e);
            aVar.mo74321h(4, this.f299494f);
            aVar.mo74318e(5, this.f299495g);
            aVar.mo74321h(6, this.f299496h);
            C51018qv3 qv32 = this.f299497i;
            if (qv32 != null) {
                aVar.mo74322i(7, qv32.computeSize());
                this.f299497i.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f299498j);
            aVar.mo74318e(11, this.f299499n);
            aVar.mo74324k(12, 3, this.f299500o);
            aVar.mo74318e(13, this.f299501p);
            aVar.mo74318e(14, this.f299502q);
            aVar.mo74321h(15, this.f299503r);
            aVar.mo74321h(16, this.f299504s);
            aVar.mo74321h(17, this.f299505t);
            aVar.mo74318e(18, this.f299506u);
            aVar.mo74321h(19, this.f299507v);
            C51018qv3 qv33 = this.f299508w;
            if (qv33 != null) {
                aVar.mo74322i(20, qv33.computeSize());
                this.f299508w.writeFields(aVar);
            }
            aVar.mo74318e(21, this.f299509x);
            aVar.mo74324k(22, 3, this.f299510y);
            aVar.mo74321h(23, this.f299511z);
            aVar.mo74318e(24, this.f299488A);
            aVar.mo74318e(25, this.f299489B);
            aVar.mo74320g(26, 8, this.f299490C);
            aVar.mo74318e(27, this.f299491D);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0;
            String str2 = this.f299492d;
            if (str2 != null) {
                i3 += C52418a.m58683j(2, str2);
            }
            int h = i3 + C52418a.m58681h(3, this.f299493e) + C52418a.m58681h(4, this.f299494f) + C52418a.m58678e(5, this.f299495g) + C52418a.m58681h(6, this.f299496h);
            C51018qv3 qv34 = this.f299497i;
            if (qv34 != null) {
                h += C52418a.m58682i(7, qv34.computeSize());
            }
            int e = h + C52418a.m58678e(8, this.f299498j) + C52418a.m58678e(11, this.f299499n) + C52418a.m58684k(12, 3, this.f299500o) + C52418a.m58678e(13, this.f299501p) + C52418a.m58678e(14, this.f299502q) + C52418a.m58681h(15, this.f299503r) + C52418a.m58681h(16, this.f299504s) + C52418a.m58681h(17, this.f299505t) + C52418a.m58678e(18, this.f299506u) + C52418a.m58681h(19, this.f299507v);
            C51018qv3 qv35 = this.f299508w;
            if (qv35 != null) {
                e += C52418a.m58682i(20, qv35.computeSize());
            }
            return e + C52418a.m58678e(21, this.f299509x) + C52418a.m58684k(22, 3, this.f299510y) + C52418a.m58681h(23, this.f299511z) + C52418a.m58678e(24, this.f299488A) + C52418a.m58678e(25, this.f299489B) + C52418a.m58680g(26, 8, this.f299490C) + C52418a.m58678e(27, this.f299491D);
        } else if (i2 == 2) {
            this.f299500o.clear();
            this.f299510y.clear();
            this.f299490C.clear();
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
            t84 t84 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        t84.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    t84.f299492d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    t84.f299493e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    t84.f299494f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    t84.f299495g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    t84.f299496h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        t84.f299497i = qv36;
                    }
                    return 0;
                case 8:
                    t84.f299498j = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    t84.f299499n = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    byte[] bArr3 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr3, 0, bArr3.length);
                    LinkedList<Long> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Long.valueOf(aVar4.mo142154g()));
                    }
                    t84.f299500o = linkedList;
                    return 0;
                case 13:
                    t84.f299501p = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    t84.f299502q = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    t84.f299503r = aVar3.mo141631i(intValue);
                    return 0;
                case 16:
                    t84.f299504s = aVar3.mo141631i(intValue);
                    return 0;
                case 17:
                    t84.f299505t = aVar3.mo141631i(intValue);
                    return 0;
                case 18:
                    t84.f299506u = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    t84.f299507v = aVar3.mo141631i(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr4 = j3.get(i6);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv37.mo73348f(bArr4);
                        }
                        t84.f299508w = qv37;
                    }
                    return 0;
                case 21:
                    t84.f299509x = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    byte[] bArr5 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar5 = new C102536a(bArr5, 0, bArr5.length);
                    LinkedList<Long> linkedList2 = new LinkedList<>();
                    while (aVar5.f301908c < aVar5.f301907b) {
                        linkedList2.add(Long.valueOf(aVar5.mo142154g()));
                    }
                    t84.f299510y = linkedList2;
                    return 0;
                case 23:
                    t84.f299511z = aVar3.mo141631i(intValue);
                    return 0;
                case 24:
                    t84.f299488A = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    t84.f299489B = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr6 = j4.get(i7);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            rv32.mo73356d(bArr6);
                        }
                        t84.f299490C.add(rv32);
                    }
                    return 0;
                case 27:
                    t84.f299491D = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
