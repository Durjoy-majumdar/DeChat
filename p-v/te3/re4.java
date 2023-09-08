package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class re4 extends C47465a {

    /* renamed from: d */
    public me4 f64515d;

    /* renamed from: e */
    public long f64516e;

    /* renamed from: f */
    public int f64517f;

    /* renamed from: g */
    public int f64518g;

    /* renamed from: h */
    public long f64519h;

    /* renamed from: i */
    public LinkedList<String> f64520i = new LinkedList<>();

    /* renamed from: j */
    public int f64521j;

    /* renamed from: n */
    public String f64522n;

    /* renamed from: o */
    public C22499hb0 f64523o;

    /* renamed from: p */
    public int f64524p;

    /* renamed from: q */
    public C22503jo3 f64525q;

    /* renamed from: r */
    public String f64526r;

    /* renamed from: s */
    public String f64527s;

    /* renamed from: t */
    public int f64528t;

    /* renamed from: u */
    public C64846y23 f64529u;

    /* renamed from: v */
    public int f64530v;

    /* renamed from: w */
    public C64422hh f64531w;

    /* renamed from: x */
    public C64818wx2 f64532x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof re4)) {
            return false;
        }
        re4 re4 = (re4) aVar;
        return C46238a.m51546a(this.f64515d, re4.f64515d) && C46238a.m51546a(Long.valueOf(this.f64516e), Long.valueOf(re4.f64516e)) && C46238a.m51546a(Integer.valueOf(this.f64517f), Integer.valueOf(re4.f64517f)) && C46238a.m51546a(Integer.valueOf(this.f64518g), Integer.valueOf(re4.f64518g)) && C46238a.m51546a(Long.valueOf(this.f64519h), Long.valueOf(re4.f64519h)) && C46238a.m51546a(this.f64520i, re4.f64520i) && C46238a.m51546a(Integer.valueOf(this.f64521j), Integer.valueOf(re4.f64521j)) && C46238a.m51546a(this.f64522n, re4.f64522n) && C46238a.m51546a(this.f64523o, re4.f64523o) && C46238a.m51546a(Integer.valueOf(this.f64524p), Integer.valueOf(re4.f64524p)) && C46238a.m51546a(this.f64525q, re4.f64525q) && C46238a.m51546a(this.f64526r, re4.f64526r) && C46238a.m51546a(this.f64527s, re4.f64527s) && C46238a.m51546a(Integer.valueOf(this.f64528t), Integer.valueOf(re4.f64528t)) && C46238a.m51546a(this.f64529u, re4.f64529u) && C46238a.m51546a(Integer.valueOf(this.f64530v), Integer.valueOf(re4.f64530v)) && C46238a.m51546a(this.f64531w, re4.f64531w) && C46238a.m51546a(this.f64532x, re4.f64532x);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            me4 me4 = this.f64515d;
            if (me4 != null) {
                aVar.mo74322i(1, me4.computeSize());
                this.f64515d.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f64516e);
            aVar.mo74318e(3, this.f64517f);
            aVar.mo74318e(4, this.f64518g);
            aVar.mo74321h(5, this.f64519h);
            aVar.mo74320g(6, 1, this.f64520i);
            aVar.mo74318e(7, this.f64521j);
            String str = this.f64522n;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            C22499hb0 hb02 = this.f64523o;
            if (hb02 != null) {
                aVar.mo74322i(9, hb02.computeSize());
                this.f64523o.writeFields(aVar);
            }
            aVar.mo74318e(10, this.f64524p);
            C22503jo3 jo32 = this.f64525q;
            if (jo32 != null) {
                aVar.mo74322i(11, jo32.computeSize());
                this.f64525q.writeFields(aVar);
            }
            String str2 = this.f64526r;
            if (str2 != null) {
                aVar.mo74323j(12, str2);
            }
            String str3 = this.f64527s;
            if (str3 != null) {
                aVar.mo74323j(13, str3);
            }
            aVar.mo74318e(14, this.f64528t);
            C64846y23 y232 = this.f64529u;
            if (y232 != null) {
                aVar.mo74322i(15, y232.computeSize());
                this.f64529u.writeFields(aVar);
            }
            aVar.mo74318e(16, this.f64530v);
            C64422hh hhVar = this.f64531w;
            if (hhVar != null) {
                aVar.mo74322i(17, hhVar.computeSize());
                this.f64531w.writeFields(aVar);
            }
            C64818wx2 wx22 = this.f64532x;
            if (wx22 != null) {
                aVar.mo74322i(18, wx22.computeSize());
                this.f64532x.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            me4 me42 = this.f64515d;
            if (me42 != null) {
                i3 = C52418a.m58682i(1, me42.computeSize()) + 0;
            }
            int h = i3 + C52418a.m58681h(2, this.f64516e) + C52418a.m58678e(3, this.f64517f) + C52418a.m58678e(4, this.f64518g) + C52418a.m58681h(5, this.f64519h) + C52418a.m58680g(6, 1, this.f64520i) + C52418a.m58678e(7, this.f64521j);
            String str4 = this.f64522n;
            if (str4 != null) {
                h += C52418a.m58683j(8, str4);
            }
            C22499hb0 hb03 = this.f64523o;
            if (hb03 != null) {
                h += C52418a.m58682i(9, hb03.computeSize());
            }
            int e = h + C52418a.m58678e(10, this.f64524p);
            C22503jo3 jo33 = this.f64525q;
            if (jo33 != null) {
                e += C52418a.m58682i(11, jo33.computeSize());
            }
            String str5 = this.f64526r;
            if (str5 != null) {
                e += C52418a.m58683j(12, str5);
            }
            String str6 = this.f64527s;
            if (str6 != null) {
                e += C52418a.m58683j(13, str6);
            }
            int e2 = e + C52418a.m58678e(14, this.f64528t);
            C64846y23 y233 = this.f64529u;
            if (y233 != null) {
                e2 += C52418a.m58682i(15, y233.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(16, this.f64530v);
            C64422hh hhVar2 = this.f64531w;
            if (hhVar2 != null) {
                e3 += C52418a.m58682i(17, hhVar2.computeSize());
            }
            C64818wx2 wx23 = this.f64532x;
            return wx23 != null ? e3 + C52418a.m58682i(18, wx23.computeSize()) : e3;
        } else if (i2 == 2) {
            this.f64520i.clear();
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
            re4 re4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        me4 me43 = new me4();
                        if (bArr != null && bArr.length > 0) {
                            me43.parseFrom(bArr);
                        }
                        re4.f64515d = me43;
                    }
                    return 0;
                case 2:
                    re4.f64516e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    re4.f64517f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    re4.f64518g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    re4.f64519h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    re4.f64520i.add(aVar3.mo141633k(intValue));
                    return 0;
                case 7:
                    re4.f64521j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    re4.f64522n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C22499hb0 hb04 = new C22499hb0();
                        if (bArr2 != null && bArr2.length > 0) {
                            hb04.parseFrom(bArr2);
                        }
                        re4.f64523o = hb04;
                    }
                    return 0;
                case 10:
                    re4.f64524p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C22503jo3 jo34 = new C22503jo3();
                        if (bArr3 != null && bArr3.length > 0) {
                            jo34.parseFrom(bArr3);
                        }
                        re4.f64525q = jo34;
                    }
                    return 0;
                case 12:
                    re4.f64526r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    re4.f64527s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    re4.f64528t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64846y23 y234 = new C64846y23();
                        if (bArr4 != null && bArr4.length > 0) {
                            y234.parseFrom(bArr4);
                        }
                        re4.f64529u = y234;
                    }
                    return 0;
                case 16:
                    re4.f64530v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C64422hh hhVar3 = new C64422hh();
                        if (bArr5 != null && bArr5.length > 0) {
                            hhVar3.parseFrom(bArr5);
                        }
                        re4.f64531w = hhVar3;
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C64818wx2 wx24 = new C64818wx2();
                        if (bArr6 != null && bArr6.length > 0) {
                            wx24.parseFrom(bArr6);
                        }
                        re4.f64532x = wx24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
