package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class cv4 extends C49335eu3 {

    /* renamed from: A */
    public int f331913A;

    /* renamed from: B */
    public int f331914B;

    /* renamed from: C */
    public int f331915C;

    /* renamed from: D */
    public int f331916D;

    /* renamed from: E */
    public int f331917E;

    /* renamed from: F */
    public int f331918F;

    /* renamed from: G */
    public int f331919G;

    /* renamed from: H */
    public int f331920H;

    /* renamed from: I */
    public int f331921I;

    /* renamed from: J */
    public C51018qv3 f331922J;

    /* renamed from: K */
    public long f331923K;

    /* renamed from: L */
    public C51018qv3 f331924L;

    /* renamed from: d */
    public int f331925d;

    /* renamed from: e */
    public int f331926e;

    /* renamed from: f */
    public LinkedList<vt4> f331927f = new LinkedList<>();

    /* renamed from: g */
    public long f331928g;

    /* renamed from: h */
    public int f331929h;

    /* renamed from: i */
    public jv4 f331930i;

    /* renamed from: j */
    public int f331931j;

    /* renamed from: n */
    public LinkedList<lv4> f331932n = new LinkedList<>();

    /* renamed from: o */
    public int f331933o;

    /* renamed from: p */
    public int f331934p;

    /* renamed from: q */
    public int f331935q;

    /* renamed from: r */
    public int f331936r;

    /* renamed from: s */
    public int f331937s;

    /* renamed from: t */
    public int f331938t;

    /* renamed from: u */
    public int f331939u;

    /* renamed from: v */
    public int f331940v;

    /* renamed from: w */
    public int f331941w;

    /* renamed from: x */
    public int f331942x;

    /* renamed from: y */
    public int f331943y;

    /* renamed from: z */
    public int f331944z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof cv4)) {
            return false;
        }
        cv4 cv4 = (cv4) aVar;
        return C46238a.m51546a(this.BaseResponse, cv4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f331925d), Integer.valueOf(cv4.f331925d)) && C46238a.m51546a(Integer.valueOf(this.f331926e), Integer.valueOf(cv4.f331926e)) && C46238a.m51546a(this.f331927f, cv4.f331927f) && C46238a.m51546a(Long.valueOf(this.f331928g), Long.valueOf(cv4.f331928g)) && C46238a.m51546a(Integer.valueOf(this.f331929h), Integer.valueOf(cv4.f331929h)) && C46238a.m51546a(this.f331930i, cv4.f331930i) && C46238a.m51546a(Integer.valueOf(this.f331931j), Integer.valueOf(cv4.f331931j)) && C46238a.m51546a(this.f331932n, cv4.f331932n) && C46238a.m51546a(Integer.valueOf(this.f331933o), Integer.valueOf(cv4.f331933o)) && C46238a.m51546a(Integer.valueOf(this.f331934p), Integer.valueOf(cv4.f331934p)) && C46238a.m51546a(Integer.valueOf(this.f331935q), Integer.valueOf(cv4.f331935q)) && C46238a.m51546a(Integer.valueOf(this.f331936r), Integer.valueOf(cv4.f331936r)) && C46238a.m51546a(Integer.valueOf(this.f331937s), Integer.valueOf(cv4.f331937s)) && C46238a.m51546a(Integer.valueOf(this.f331938t), Integer.valueOf(cv4.f331938t)) && C46238a.m51546a(Integer.valueOf(this.f331939u), Integer.valueOf(cv4.f331939u)) && C46238a.m51546a(Integer.valueOf(this.f331940v), Integer.valueOf(cv4.f331940v)) && C46238a.m51546a(Integer.valueOf(this.f331941w), Integer.valueOf(cv4.f331941w)) && C46238a.m51546a(Integer.valueOf(this.f331942x), Integer.valueOf(cv4.f331942x)) && C46238a.m51546a(Integer.valueOf(this.f331943y), Integer.valueOf(cv4.f331943y)) && C46238a.m51546a(Integer.valueOf(this.f331944z), Integer.valueOf(cv4.f331944z)) && C46238a.m51546a(Integer.valueOf(this.f331913A), Integer.valueOf(cv4.f331913A)) && C46238a.m51546a(Integer.valueOf(this.f331914B), Integer.valueOf(cv4.f331914B)) && C46238a.m51546a(Integer.valueOf(this.f331915C), Integer.valueOf(cv4.f331915C)) && C46238a.m51546a(Integer.valueOf(this.f331916D), Integer.valueOf(cv4.f331916D)) && C46238a.m51546a(Integer.valueOf(this.f331917E), Integer.valueOf(cv4.f331917E)) && C46238a.m51546a(Integer.valueOf(this.f331918F), Integer.valueOf(cv4.f331918F)) && C46238a.m51546a(Integer.valueOf(this.f331919G), Integer.valueOf(cv4.f331919G)) && C46238a.m51546a(Integer.valueOf(this.f331920H), Integer.valueOf(cv4.f331920H)) && C46238a.m51546a(Integer.valueOf(this.f331921I), Integer.valueOf(cv4.f331921I)) && C46238a.m51546a(this.f331922J, cv4.f331922J) && C46238a.m51546a(Long.valueOf(this.f331923K), Long.valueOf(cv4.f331923K)) && C46238a.m51546a(this.f331924L, cv4.f331924L);
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
                aVar.mo74318e(2, this.f331925d);
                aVar.mo74318e(3, this.f331926e);
                aVar.mo74320g(4, 8, this.f331927f);
                aVar.mo74321h(5, this.f331928g);
                aVar.mo74318e(6, this.f331929h);
                jv4 jv4 = this.f331930i;
                if (jv4 != null) {
                    aVar.mo74322i(7, jv4.computeSize());
                    this.f331930i.writeFields(aVar);
                }
                aVar.mo74318e(8, this.f331931j);
                aVar.mo74320g(9, 8, this.f331932n);
                aVar.mo74318e(10, this.f331933o);
                aVar.mo74318e(11, this.f331934p);
                aVar.mo74318e(12, this.f331935q);
                aVar.mo74318e(13, this.f331936r);
                aVar.mo74318e(14, this.f331937s);
                aVar.mo74318e(15, this.f331938t);
                aVar.mo74318e(16, this.f331939u);
                aVar.mo74318e(17, this.f331940v);
                aVar.mo74318e(18, this.f331941w);
                aVar.mo74318e(19, this.f331942x);
                aVar.mo74318e(20, this.f331943y);
                aVar.mo74318e(21, this.f331944z);
                aVar.mo74318e(22, this.f331913A);
                aVar.mo74318e(23, this.f331914B);
                aVar.mo74318e(24, this.f331915C);
                aVar.mo74318e(25, this.f331916D);
                aVar.mo74318e(26, this.f331917E);
                aVar.mo74318e(27, this.f331918F);
                aVar.mo74318e(28, this.f331919G);
                aVar.mo74318e(29, this.f331920H);
                aVar.mo74318e(30, this.f331921I);
                C51018qv3 qv32 = this.f331922J;
                if (qv32 != null) {
                    aVar.mo74322i(31, qv32.computeSize());
                    this.f331922J.writeFields(aVar);
                }
                aVar.mo74321h(32, this.f331923K);
                C51018qv3 qv33 = this.f331924L;
                if (qv33 != null) {
                    aVar.mo74322i(33, qv33.computeSize());
                    this.f331924L.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f331925d) + C52418a.m58678e(3, this.f331926e) + C52418a.m58680g(4, 8, this.f331927f) + C52418a.m58681h(5, this.f331928g) + C52418a.m58678e(6, this.f331929h);
            jv4 jv42 = this.f331930i;
            if (jv42 != null) {
                e += C52418a.m58682i(7, jv42.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f331931j) + C52418a.m58680g(9, 8, this.f331932n) + C52418a.m58678e(10, this.f331933o) + C52418a.m58678e(11, this.f331934p) + C52418a.m58678e(12, this.f331935q) + C52418a.m58678e(13, this.f331936r) + C52418a.m58678e(14, this.f331937s) + C52418a.m58678e(15, this.f331938t) + C52418a.m58678e(16, this.f331939u) + C52418a.m58678e(17, this.f331940v) + C52418a.m58678e(18, this.f331941w) + C52418a.m58678e(19, this.f331942x) + C52418a.m58678e(20, this.f331943y) + C52418a.m58678e(21, this.f331944z) + C52418a.m58678e(22, this.f331913A) + C52418a.m58678e(23, this.f331914B) + C52418a.m58678e(24, this.f331915C) + C52418a.m58678e(25, this.f331916D) + C52418a.m58678e(26, this.f331917E) + C52418a.m58678e(27, this.f331918F) + C52418a.m58678e(28, this.f331919G) + C52418a.m58678e(29, this.f331920H) + C52418a.m58678e(30, this.f331921I);
            C51018qv3 qv34 = this.f331922J;
            if (qv34 != null) {
                e2 += C52418a.m58682i(31, qv34.computeSize());
            }
            int h = e2 + C52418a.m58681h(32, this.f331923K);
            C51018qv3 qv35 = this.f331924L;
            return qv35 != null ? h + C52418a.m58682i(33, qv35.computeSize()) : h;
        } else if (i2 == 2) {
            this.f331927f.clear();
            this.f331932n.clear();
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
            cv4 cv4 = objArr[1];
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
                        cv4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    cv4.f331925d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    cv4.f331926e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        vt4 vt4 = new vt4();
                        if (bArr2 != null && bArr2.length > 0) {
                            vt4.parseFrom(bArr2);
                        }
                        cv4.f331927f.add(vt4);
                    }
                    return 0;
                case 5:
                    cv4.f331928g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    cv4.f331929h = aVar3.mo141629g(intValue);
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
                        cv4.f331930i = jv43;
                    }
                    return 0;
                case 8:
                    cv4.f331931j = aVar3.mo141629g(intValue);
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
                        cv4.f331932n.add(lv4);
                    }
                    return 0;
                case 10:
                    cv4.f331933o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    cv4.f331934p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    cv4.f331935q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    cv4.f331936r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    cv4.f331937s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    cv4.f331938t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    cv4.f331939u = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    cv4.f331940v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    cv4.f331941w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    cv4.f331942x = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    cv4.f331943y = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    cv4.f331944z = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    cv4.f331913A = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    cv4.f331914B = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    cv4.f331915C = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    cv4.f331916D = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    cv4.f331917E = aVar3.mo141629g(intValue);
                    return 0;
                case 27:
                    cv4.f331918F = aVar3.mo141629g(intValue);
                    return 0;
                case 28:
                    cv4.f331919G = aVar3.mo141629g(intValue);
                    return 0;
                case 29:
                    cv4.f331920H = aVar3.mo141629g(intValue);
                    return 0;
                case 30:
                    cv4.f331921I = aVar3.mo141629g(intValue);
                    return 0;
                case 31:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv36.mo73348f(bArr5);
                        }
                        cv4.f331922J = qv36;
                    }
                    return 0;
                case 32:
                    cv4.f331923K = aVar3.mo141631i(intValue);
                    return 0;
                case 33:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            qv37.mo73348f(bArr6);
                        }
                        cv4.f331924L = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
