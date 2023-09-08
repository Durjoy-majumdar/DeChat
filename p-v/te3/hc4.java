package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class hc4 extends C47465a {

    /* renamed from: d */
    public long f298334d;

    /* renamed from: e */
    public String f298335e;

    /* renamed from: f */
    public String f298336f;

    /* renamed from: g */
    public int f298337g;

    /* renamed from: h */
    public int f298338h;

    /* renamed from: i */
    public C51018qv3 f298339i;

    /* renamed from: j */
    public int f298340j;

    /* renamed from: n */
    public LinkedList<ob4> f298341n = new LinkedList<>();

    /* renamed from: o */
    public int f298342o;

    /* renamed from: p */
    public LinkedList<ob4> f298343p = new LinkedList<>();

    /* renamed from: q */
    public int f298344q;

    /* renamed from: r */
    public int f298345r;

    /* renamed from: s */
    public int f298346s;

    /* renamed from: t */
    public int f298347t;

    /* renamed from: u */
    public int f298348u;

    /* renamed from: v */
    public LinkedList<C51163rv3> f298349v = new LinkedList<>();

    /* renamed from: w */
    public int f298350w;

    /* renamed from: x */
    public LinkedList<C51163rv3> f298351x = new LinkedList<>();

    /* renamed from: y */
    public int f298352y;

    /* renamed from: z */
    public LinkedList<ob4> f298353z = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof hc4)) {
            return false;
        }
        hc4 hc4 = (hc4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f298334d), Long.valueOf(hc4.f298334d)) && C46238a.m51546a(this.f298335e, hc4.f298335e) && C46238a.m51546a(this.f298336f, hc4.f298336f) && C46238a.m51546a(Integer.valueOf(this.f298337g), Integer.valueOf(hc4.f298337g)) && C46238a.m51546a(Integer.valueOf(this.f298338h), Integer.valueOf(hc4.f298338h)) && C46238a.m51546a(this.f298339i, hc4.f298339i) && C46238a.m51546a(Integer.valueOf(this.f298340j), Integer.valueOf(hc4.f298340j)) && C46238a.m51546a(this.f298341n, hc4.f298341n) && C46238a.m51546a(Integer.valueOf(this.f298342o), Integer.valueOf(hc4.f298342o)) && C46238a.m51546a(this.f298343p, hc4.f298343p) && C46238a.m51546a(Integer.valueOf(this.f298344q), Integer.valueOf(hc4.f298344q)) && C46238a.m51546a(Integer.valueOf(this.f298345r), Integer.valueOf(hc4.f298345r)) && C46238a.m51546a(Integer.valueOf(this.f298346s), Integer.valueOf(hc4.f298346s)) && C46238a.m51546a(Integer.valueOf(this.f298347t), Integer.valueOf(hc4.f298347t)) && C46238a.m51546a(Integer.valueOf(this.f298348u), Integer.valueOf(hc4.f298348u)) && C46238a.m51546a(this.f298349v, hc4.f298349v) && C46238a.m51546a(Integer.valueOf(this.f298350w), Integer.valueOf(hc4.f298350w)) && C46238a.m51546a(this.f298351x, hc4.f298351x) && C46238a.m51546a(Integer.valueOf(this.f298352y), Integer.valueOf(hc4.f298352y)) && C46238a.m51546a(this.f298353z, hc4.f298353z);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f298339i != null) {
                aVar.mo74321h(1, this.f298334d);
                String str = this.f298335e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f298336f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f298337g);
                aVar.mo74318e(5, this.f298338h);
                C51018qv3 qv32 = this.f298339i;
                if (qv32 != null) {
                    aVar.mo74322i(6, qv32.computeSize());
                    this.f298339i.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f298340j);
                aVar.mo74320g(8, 8, this.f298341n);
                aVar.mo74318e(9, this.f298342o);
                aVar.mo74320g(10, 8, this.f298343p);
                aVar.mo74318e(11, this.f298344q);
                aVar.mo74318e(12, this.f298345r);
                aVar.mo74318e(13, this.f298346s);
                aVar.mo74318e(14, this.f298347t);
                aVar.mo74318e(15, this.f298348u);
                aVar.mo74320g(16, 8, this.f298349v);
                aVar.mo74318e(17, this.f298350w);
                aVar.mo74320g(18, 8, this.f298351x);
                aVar.mo74318e(19, this.f298352y);
                aVar.mo74320g(20, 8, this.f298353z);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ObjDesc");
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f298334d) + 0;
            String str3 = this.f298335e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            String str4 = this.f298336f;
            if (str4 != null) {
                h += C52418a.m58683j(3, str4);
            }
            int e = h + C52418a.m58678e(4, this.f298337g) + C52418a.m58678e(5, this.f298338h);
            C51018qv3 qv33 = this.f298339i;
            if (qv33 != null) {
                e += C52418a.m58682i(6, qv33.computeSize());
            }
            return e + C52418a.m58678e(7, this.f298340j) + C52418a.m58680g(8, 8, this.f298341n) + C52418a.m58678e(9, this.f298342o) + C52418a.m58680g(10, 8, this.f298343p) + C52418a.m58678e(11, this.f298344q) + C52418a.m58678e(12, this.f298345r) + C52418a.m58678e(13, this.f298346s) + C52418a.m58678e(14, this.f298347t) + C52418a.m58678e(15, this.f298348u) + C52418a.m58680g(16, 8, this.f298349v) + C52418a.m58678e(17, this.f298350w) + C52418a.m58680g(18, 8, this.f298351x) + C52418a.m58678e(19, this.f298352y) + C52418a.m58680g(20, 8, this.f298353z);
        } else if (i2 == 2) {
            this.f298341n.clear();
            this.f298343p.clear();
            this.f298349v.clear();
            this.f298351x.clear();
            this.f298353z.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298339i != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ObjDesc");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            hc4 hc4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hc4.f298334d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    hc4.f298335e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hc4.f298336f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hc4.f298337g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    hc4.f298338h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        hc4.f298339i = qv34;
                    }
                    return 0;
                case 7:
                    hc4.f298340j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        ob4 ob4 = new ob4();
                        if (bArr2 != null && bArr2.length > 0) {
                            ob4.parseFrom(bArr2);
                        }
                        hc4.f298341n.add(ob4);
                    }
                    return 0;
                case 9:
                    hc4.f298342o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        ob4 ob42 = new ob4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ob42.parseFrom(bArr3);
                        }
                        hc4.f298343p.add(ob42);
                    }
                    return 0;
                case 11:
                    hc4.f298344q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    hc4.f298345r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    hc4.f298346s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    hc4.f298347t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    hc4.f298348u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv32.mo73356d(bArr4);
                        }
                        hc4.f298349v.add(rv32);
                    }
                    return 0;
                case 17:
                    hc4.f298350w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51163rv3 rv33 = new C51163rv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            rv33.mo73356d(bArr5);
                        }
                        hc4.f298351x.add(rv33);
                    }
                    return 0;
                case 19:
                    hc4.f298352y = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        ob4 ob43 = new ob4();
                        if (bArr6 != null && bArr6.length > 0) {
                            ob43.parseFrom(bArr6);
                        }
                        hc4.f298353z.add(ob43);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
