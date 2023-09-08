package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class yt4 extends C49335eu3 {

    /* renamed from: A */
    public int f332338A;

    /* renamed from: B */
    public int f332339B;

    /* renamed from: C */
    public int f332340C;

    /* renamed from: D */
    public int f332341D;

    /* renamed from: E */
    public int f332342E;

    /* renamed from: F */
    public int f332343F;

    /* renamed from: G */
    public C51018qv3 f332344G;

    /* renamed from: H */
    public long f332345H;

    /* renamed from: I */
    public C51018qv3 f332346I;

    /* renamed from: d */
    public int f332347d;

    /* renamed from: e */
    public LinkedList<vt4> f332348e = new LinkedList<>();

    /* renamed from: f */
    public int f332349f;

    /* renamed from: g */
    public long f332350g;

    /* renamed from: h */
    public int f332351h;

    /* renamed from: i */
    public jv4 f332352i;

    /* renamed from: j */
    public int f332353j;

    /* renamed from: n */
    public LinkedList<lv4> f332354n = new LinkedList<>();

    /* renamed from: o */
    public int f332355o;

    /* renamed from: p */
    public int f332356p;

    /* renamed from: q */
    public int f332357q;

    /* renamed from: r */
    public int f332358r;

    /* renamed from: s */
    public int f332359s;

    /* renamed from: t */
    public int f332360t;

    /* renamed from: u */
    public int f332361u;

    /* renamed from: v */
    public int f332362v;

    /* renamed from: w */
    public int f332363w;

    /* renamed from: x */
    public int f332364x;

    /* renamed from: y */
    public int f332365y;

    /* renamed from: z */
    public int f332366z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof yt4)) {
            return false;
        }
        yt4 yt4 = (yt4) aVar;
        return C46238a.m51546a(this.BaseResponse, yt4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f332347d), Integer.valueOf(yt4.f332347d)) && C46238a.m51546a(this.f332348e, yt4.f332348e) && C46238a.m51546a(Integer.valueOf(this.f332349f), Integer.valueOf(yt4.f332349f)) && C46238a.m51546a(Long.valueOf(this.f332350g), Long.valueOf(yt4.f332350g)) && C46238a.m51546a(Integer.valueOf(this.f332351h), Integer.valueOf(yt4.f332351h)) && C46238a.m51546a(this.f332352i, yt4.f332352i) && C46238a.m51546a(Integer.valueOf(this.f332353j), Integer.valueOf(yt4.f332353j)) && C46238a.m51546a(this.f332354n, yt4.f332354n) && C46238a.m51546a(Integer.valueOf(this.f332355o), Integer.valueOf(yt4.f332355o)) && C46238a.m51546a(Integer.valueOf(this.f332356p), Integer.valueOf(yt4.f332356p)) && C46238a.m51546a(Integer.valueOf(this.f332357q), Integer.valueOf(yt4.f332357q)) && C46238a.m51546a(Integer.valueOf(this.f332358r), Integer.valueOf(yt4.f332358r)) && C46238a.m51546a(Integer.valueOf(this.f332359s), Integer.valueOf(yt4.f332359s)) && C46238a.m51546a(Integer.valueOf(this.f332360t), Integer.valueOf(yt4.f332360t)) && C46238a.m51546a(Integer.valueOf(this.f332361u), Integer.valueOf(yt4.f332361u)) && C46238a.m51546a(Integer.valueOf(this.f332362v), Integer.valueOf(yt4.f332362v)) && C46238a.m51546a(Integer.valueOf(this.f332363w), Integer.valueOf(yt4.f332363w)) && C46238a.m51546a(Integer.valueOf(this.f332364x), Integer.valueOf(yt4.f332364x)) && C46238a.m51546a(Integer.valueOf(this.f332365y), Integer.valueOf(yt4.f332365y)) && C46238a.m51546a(Integer.valueOf(this.f332366z), Integer.valueOf(yt4.f332366z)) && C46238a.m51546a(Integer.valueOf(this.f332338A), Integer.valueOf(yt4.f332338A)) && C46238a.m51546a(Integer.valueOf(this.f332339B), Integer.valueOf(yt4.f332339B)) && C46238a.m51546a(Integer.valueOf(this.f332340C), Integer.valueOf(yt4.f332340C)) && C46238a.m51546a(Integer.valueOf(this.f332341D), Integer.valueOf(yt4.f332341D)) && C46238a.m51546a(Integer.valueOf(this.f332342E), Integer.valueOf(yt4.f332342E)) && C46238a.m51546a(Integer.valueOf(this.f332343F), Integer.valueOf(yt4.f332343F)) && C46238a.m51546a(this.f332344G, yt4.f332344G) && C46238a.m51546a(Long.valueOf(this.f332345H), Long.valueOf(yt4.f332345H)) && C46238a.m51546a(this.f332346I, yt4.f332346I);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f332352i != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f332347d);
                aVar.mo74320g(3, 8, this.f332348e);
                aVar.mo74318e(4, this.f332349f);
                aVar.mo74321h(5, this.f332350g);
                aVar.mo74318e(6, this.f332351h);
                jv4 jv4 = this.f332352i;
                if (jv4 != null) {
                    aVar.mo74322i(7, jv4.computeSize());
                    this.f332352i.writeFields(aVar);
                }
                aVar.mo74318e(8, this.f332353j);
                aVar.mo74320g(9, 8, this.f332354n);
                aVar.mo74318e(10, this.f332355o);
                aVar.mo74318e(11, this.f332356p);
                aVar.mo74318e(12, this.f332357q);
                aVar.mo74318e(13, this.f332358r);
                aVar.mo74318e(14, this.f332359s);
                aVar.mo74318e(15, this.f332360t);
                aVar.mo74318e(16, this.f332361u);
                aVar.mo74318e(17, this.f332362v);
                aVar.mo74318e(18, this.f332363w);
                aVar.mo74318e(19, this.f332364x);
                aVar.mo74318e(20, this.f332365y);
                aVar.mo74318e(21, this.f332366z);
                aVar.mo74318e(22, this.f332338A);
                aVar.mo74318e(23, this.f332339B);
                aVar.mo74318e(24, this.f332340C);
                aVar.mo74318e(25, this.f332341D);
                aVar.mo74318e(26, this.f332342E);
                aVar.mo74318e(27, this.f332343F);
                C51018qv3 qv32 = this.f332344G;
                if (qv32 != null) {
                    aVar.mo74322i(28, qv32.computeSize());
                    this.f332344G.writeFields(aVar);
                }
                aVar.mo74321h(29, this.f332345H);
                C51018qv3 qv33 = this.f332346I;
                if (qv33 != null) {
                    aVar.mo74322i(30, qv33.computeSize());
                    this.f332346I.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RelayData");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f332347d) + C52418a.m58680g(3, 8, this.f332348e) + C52418a.m58678e(4, this.f332349f) + C52418a.m58681h(5, this.f332350g) + C52418a.m58678e(6, this.f332351h);
            jv4 jv42 = this.f332352i;
            if (jv42 != null) {
                e += C52418a.m58682i(7, jv42.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f332353j) + C52418a.m58680g(9, 8, this.f332354n) + C52418a.m58678e(10, this.f332355o) + C52418a.m58678e(11, this.f332356p) + C52418a.m58678e(12, this.f332357q) + C52418a.m58678e(13, this.f332358r) + C52418a.m58678e(14, this.f332359s) + C52418a.m58678e(15, this.f332360t) + C52418a.m58678e(16, this.f332361u) + C52418a.m58678e(17, this.f332362v) + C52418a.m58678e(18, this.f332363w) + C52418a.m58678e(19, this.f332364x) + C52418a.m58678e(20, this.f332365y) + C52418a.m58678e(21, this.f332366z) + C52418a.m58678e(22, this.f332338A) + C52418a.m58678e(23, this.f332339B) + C52418a.m58678e(24, this.f332340C) + C52418a.m58678e(25, this.f332341D) + C52418a.m58678e(26, this.f332342E) + C52418a.m58678e(27, this.f332343F);
            C51018qv3 qv34 = this.f332344G;
            if (qv34 != null) {
                e2 += C52418a.m58682i(28, qv34.computeSize());
            }
            int h = e2 + C52418a.m58681h(29, this.f332345H);
            C51018qv3 qv35 = this.f332346I;
            return qv35 != null ? h + C52418a.m58682i(30, qv35.computeSize()) : h;
        } else if (i2 == 2) {
            this.f332348e.clear();
            this.f332354n.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f332352i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RelayData");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            yt4 yt4 = objArr[1];
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
                        yt4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    yt4.f332347d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        vt4 vt4 = new vt4();
                        if (bArr2 != null && bArr2.length > 0) {
                            vt4.parseFrom(bArr2);
                        }
                        yt4.f332348e.add(vt4);
                    }
                    return 0;
                case 4:
                    yt4.f332349f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    yt4.f332350g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    yt4.f332351h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        jv4 jv43 = new jv4();
                        if (bArr3 != null && bArr3.length > 0) {
                            jv43.parseFrom(bArr3);
                        }
                        yt4.f332352i = jv43;
                    }
                    return 0;
                case 8:
                    yt4.f332353j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        lv4 lv4 = new lv4();
                        if (bArr4 != null && bArr4.length > 0) {
                            lv4.parseFrom(bArr4);
                        }
                        yt4.f332354n.add(lv4);
                    }
                    return 0;
                case 10:
                    yt4.f332355o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    yt4.f332356p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    yt4.f332357q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    yt4.f332358r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    yt4.f332359s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    yt4.f332360t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    yt4.f332361u = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    yt4.f332362v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    yt4.f332363w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    yt4.f332364x = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    yt4.f332365y = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    yt4.f332366z = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    yt4.f332338A = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    yt4.f332339B = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    yt4.f332340C = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    yt4.f332341D = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    yt4.f332342E = aVar3.mo141629g(intValue);
                    return 0;
                case 27:
                    yt4.f332343F = aVar3.mo141629g(intValue);
                    return 0;
                case 28:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv36.mo73348f(bArr5);
                        }
                        yt4.f332344G = qv36;
                    }
                    return 0;
                case 29:
                    yt4.f332345H = aVar3.mo141631i(intValue);
                    return 0;
                case 30:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            qv37.mo73348f(bArr6);
                        }
                        yt4.f332346I = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
