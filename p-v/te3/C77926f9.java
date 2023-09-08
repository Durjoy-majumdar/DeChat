package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f9 */
public class C77926f9 extends C47465a {

    /* renamed from: d */
    public int f227333d;

    /* renamed from: e */
    public String f227334e;

    /* renamed from: f */
    public C51163rv3 f227335f;

    /* renamed from: g */
    public C51163rv3 f227336g;

    /* renamed from: h */
    public C51163rv3 f227337h;

    /* renamed from: i */
    public int f227338i;

    /* renamed from: j */
    public int f227339j;

    /* renamed from: n */
    public String f227340n;

    /* renamed from: o */
    public int f227341o;

    /* renamed from: p */
    public int f227342p;

    /* renamed from: q */
    public LinkedList<C51163rv3> f227343q = new LinkedList<>();

    /* renamed from: r */
    public LinkedList<C77996sv3> f227344r = new LinkedList<>();

    /* renamed from: s */
    public C51018qv3 f227345s;

    /* renamed from: t */
    public int f227346t;

    /* renamed from: u */
    public int f227347u;

    /* renamed from: v */
    public long f227348v;

    /* renamed from: w */
    public int f227349w;

    /* renamed from: x */
    public long f227350x;

    /* renamed from: y */
    public int f227351y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77926f9)) {
            return false;
        }
        C77926f9 f9Var = (C77926f9) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f227333d), Integer.valueOf(f9Var.f227333d)) && C46238a.m51546a(this.f227334e, f9Var.f227334e) && C46238a.m51546a(this.f227335f, f9Var.f227335f) && C46238a.m51546a(this.f227336g, f9Var.f227336g) && C46238a.m51546a(this.f227337h, f9Var.f227337h) && C46238a.m51546a(Integer.valueOf(this.f227338i), Integer.valueOf(f9Var.f227338i)) && C46238a.m51546a(Integer.valueOf(this.f227339j), Integer.valueOf(f9Var.f227339j)) && C46238a.m51546a(this.f227340n, f9Var.f227340n) && C46238a.m51546a(Integer.valueOf(this.f227341o), Integer.valueOf(f9Var.f227341o)) && C46238a.m51546a(Integer.valueOf(this.f227342p), Integer.valueOf(f9Var.f227342p)) && C46238a.m51546a(this.f227343q, f9Var.f227343q) && C46238a.m51546a(this.f227344r, f9Var.f227344r) && C46238a.m51546a(this.f227345s, f9Var.f227345s) && C46238a.m51546a(Integer.valueOf(this.f227346t), Integer.valueOf(f9Var.f227346t)) && C46238a.m51546a(Integer.valueOf(this.f227347u), Integer.valueOf(f9Var.f227347u)) && C46238a.m51546a(Long.valueOf(this.f227348v), Long.valueOf(f9Var.f227348v)) && C46238a.m51546a(Integer.valueOf(this.f227349w), Integer.valueOf(f9Var.f227349w)) && C46238a.m51546a(Long.valueOf(this.f227350x), Long.valueOf(f9Var.f227350x)) && C46238a.m51546a(Integer.valueOf(this.f227351y), Integer.valueOf(f9Var.f227351y));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f227335f == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f227336g == null) {
                throw new C52419b("Not all required fields were included: ToUserName");
            } else if (this.f227337h != null) {
                aVar.mo74318e(1, this.f227333d);
                String str = this.f227334e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C51163rv3 rv32 = this.f227335f;
                if (rv32 != null) {
                    aVar.mo74322i(3, rv32.computeSize());
                    this.f227335f.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f227336g;
                if (rv33 != null) {
                    aVar.mo74322i(4, rv33.computeSize());
                    this.f227336g.writeFields(aVar);
                }
                C51163rv3 rv34 = this.f227337h;
                if (rv34 != null) {
                    aVar.mo74322i(5, rv34.computeSize());
                    this.f227337h.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f227338i);
                aVar.mo74318e(7, this.f227339j);
                String str2 = this.f227340n;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                aVar.mo74318e(9, this.f227341o);
                aVar.mo74318e(10, this.f227342p);
                aVar.mo74320g(11, 8, this.f227343q);
                aVar.mo74320g(12, 8, this.f227344r);
                C51018qv3 qv32 = this.f227345s;
                if (qv32 != null) {
                    aVar.mo74322i(13, qv32.computeSize());
                    this.f227345s.writeFields(aVar);
                }
                aVar.mo74318e(14, this.f227346t);
                aVar.mo74318e(15, this.f227347u);
                aVar.mo74321h(16, this.f227348v);
                aVar.mo74318e(17, this.f227349w);
                aVar.mo74321h(18, this.f227350x);
                aVar.mo74318e(19, this.f227351y);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Content");
            }
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f227333d) + 0;
            String str3 = this.f227334e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            C51163rv3 rv35 = this.f227335f;
            if (rv35 != null) {
                e += C52418a.m58682i(3, rv35.computeSize());
            }
            C51163rv3 rv36 = this.f227336g;
            if (rv36 != null) {
                e += C52418a.m58682i(4, rv36.computeSize());
            }
            C51163rv3 rv37 = this.f227337h;
            if (rv37 != null) {
                e += C52418a.m58682i(5, rv37.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.f227338i) + C52418a.m58678e(7, this.f227339j);
            String str4 = this.f227340n;
            if (str4 != null) {
                e2 += C52418a.m58683j(8, str4);
            }
            int e3 = e2 + C52418a.m58678e(9, this.f227341o) + C52418a.m58678e(10, this.f227342p) + C52418a.m58680g(11, 8, this.f227343q) + C52418a.m58680g(12, 8, this.f227344r);
            C51018qv3 qv33 = this.f227345s;
            if (qv33 != null) {
                e3 += C52418a.m58682i(13, qv33.computeSize());
            }
            return e3 + C52418a.m58678e(14, this.f227346t) + C52418a.m58678e(15, this.f227347u) + C52418a.m58681h(16, this.f227348v) + C52418a.m58678e(17, this.f227349w) + C52418a.m58681h(18, this.f227350x) + C52418a.m58678e(19, this.f227351y);
        } else if (i2 == 2) {
            this.f227343q.clear();
            this.f227344r.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f227335f == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f227336g == null) {
                throw new C52419b("Not all required fields were included: ToUserName");
            } else if (this.f227337h != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Content");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77926f9 f9Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    f9Var.f227333d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    f9Var.f227334e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51163rv3 rv38 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv38.mo73356d(bArr);
                        }
                        f9Var.f227335f = rv38;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv39 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv39.mo73356d(bArr2);
                        }
                        f9Var.f227336g = rv39;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv310 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv310.mo73356d(bArr3);
                        }
                        f9Var.f227337h = rv310;
                    }
                    return 0;
                case 6:
                    f9Var.f227338i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    f9Var.f227339j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    f9Var.f227340n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    f9Var.f227341o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    f9Var.f227342p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51163rv3 rv311 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv311.mo73356d(bArr4);
                        }
                        f9Var.f227343q.add(rv311);
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C77996sv3 sv32 = new C77996sv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            sv32.mo108012b(bArr5);
                        }
                        f9Var.f227344r.add(sv32);
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            qv34.mo73348f(bArr6);
                        }
                        f9Var.f227345s = qv34;
                    }
                    return 0;
                case 14:
                    f9Var.f227346t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    f9Var.f227347u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    f9Var.f227348v = aVar3.mo141631i(intValue);
                    return 0;
                case 17:
                    f9Var.f227349w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    f9Var.f227350x = aVar3.mo141631i(intValue);
                    return 0;
                case 19:
                    f9Var.f227351y = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
