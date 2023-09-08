package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dq2 */
public class C64323dq2 extends C47465a {

    /* renamed from: A */
    public nr4 f182803A;

    /* renamed from: d */
    public int f182804d;

    /* renamed from: e */
    public int f182805e;

    /* renamed from: f */
    public int f182806f;

    /* renamed from: g */
    public int f182807g;

    /* renamed from: h */
    public int f182808h;

    /* renamed from: i */
    public int f182809i;

    /* renamed from: j */
    public int f182810j;

    /* renamed from: n */
    public int f182811n;

    /* renamed from: o */
    public int f182812o;

    /* renamed from: p */
    public int f182813p;

    /* renamed from: q */
    public int f182814q;

    /* renamed from: r */
    public int f182815r;

    /* renamed from: s */
    public int f182816s;

    /* renamed from: t */
    public int f182817t;

    /* renamed from: u */
    public int f182818u;

    /* renamed from: v */
    public int f182819v;

    /* renamed from: w */
    public nr4 f182820w;

    /* renamed from: x */
    public nr4 f182821x;

    /* renamed from: y */
    public nr4 f182822y;

    /* renamed from: z */
    public int f182823z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64323dq2)) {
            return false;
        }
        C64323dq2 dq22 = (C64323dq2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182804d), Integer.valueOf(dq22.f182804d)) && C46238a.m51546a(Integer.valueOf(this.f182805e), Integer.valueOf(dq22.f182805e)) && C46238a.m51546a(Integer.valueOf(this.f182806f), Integer.valueOf(dq22.f182806f)) && C46238a.m51546a(Integer.valueOf(this.f182807g), Integer.valueOf(dq22.f182807g)) && C46238a.m51546a(Integer.valueOf(this.f182808h), Integer.valueOf(dq22.f182808h)) && C46238a.m51546a(Integer.valueOf(this.f182809i), Integer.valueOf(dq22.f182809i)) && C46238a.m51546a(Integer.valueOf(this.f182810j), Integer.valueOf(dq22.f182810j)) && C46238a.m51546a(Integer.valueOf(this.f182811n), Integer.valueOf(dq22.f182811n)) && C46238a.m51546a(Integer.valueOf(this.f182812o), Integer.valueOf(dq22.f182812o)) && C46238a.m51546a(Integer.valueOf(this.f182813p), Integer.valueOf(dq22.f182813p)) && C46238a.m51546a(Integer.valueOf(this.f182814q), Integer.valueOf(dq22.f182814q)) && C46238a.m51546a(Integer.valueOf(this.f182815r), Integer.valueOf(dq22.f182815r)) && C46238a.m51546a(Integer.valueOf(this.f182816s), Integer.valueOf(dq22.f182816s)) && C46238a.m51546a(Integer.valueOf(this.f182817t), Integer.valueOf(dq22.f182817t)) && C46238a.m51546a(Integer.valueOf(this.f182818u), Integer.valueOf(dq22.f182818u)) && C46238a.m51546a(Integer.valueOf(this.f182819v), Integer.valueOf(dq22.f182819v)) && C46238a.m51546a(this.f182820w, dq22.f182820w) && C46238a.m51546a(this.f182821x, dq22.f182821x) && C46238a.m51546a(this.f182822y, dq22.f182822y) && C46238a.m51546a(Integer.valueOf(this.f182823z), Integer.valueOf(dq22.f182823z)) && C46238a.m51546a(this.f182803A, dq22.f182803A);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182804d);
            aVar.mo74318e(2, this.f182805e);
            aVar.mo74318e(3, this.f182806f);
            aVar.mo74318e(4, this.f182807g);
            aVar.mo74318e(5, this.f182808h);
            aVar.mo74318e(6, this.f182809i);
            aVar.mo74318e(7, this.f182810j);
            aVar.mo74318e(8, this.f182811n);
            aVar.mo74318e(9, this.f182812o);
            aVar.mo74318e(10, this.f182813p);
            aVar.mo74318e(11, this.f182814q);
            aVar.mo74318e(12, this.f182815r);
            aVar.mo74318e(13, this.f182816s);
            aVar.mo74318e(14, this.f182817t);
            aVar.mo74318e(15, this.f182818u);
            aVar.mo74318e(16, this.f182819v);
            nr4 nr4 = this.f182820w;
            if (nr4 != null) {
                aVar.mo74322i(23, nr4.computeSize());
                this.f182820w.writeFields(aVar);
            }
            nr4 nr42 = this.f182821x;
            if (nr42 != null) {
                aVar.mo74322i(24, nr42.computeSize());
                this.f182821x.writeFields(aVar);
            }
            nr4 nr43 = this.f182822y;
            if (nr43 != null) {
                aVar.mo74322i(25, nr43.computeSize());
                this.f182822y.writeFields(aVar);
            }
            aVar.mo74318e(26, this.f182823z);
            nr4 nr44 = this.f182803A;
            if (nr44 != null) {
                aVar.mo74322i(27, nr44.computeSize());
                this.f182803A.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f182804d) + 0 + C52418a.m58678e(2, this.f182805e) + C52418a.m58678e(3, this.f182806f) + C52418a.m58678e(4, this.f182807g) + C52418a.m58678e(5, this.f182808h) + C52418a.m58678e(6, this.f182809i) + C52418a.m58678e(7, this.f182810j) + C52418a.m58678e(8, this.f182811n) + C52418a.m58678e(9, this.f182812o) + C52418a.m58678e(10, this.f182813p) + C52418a.m58678e(11, this.f182814q) + C52418a.m58678e(12, this.f182815r) + C52418a.m58678e(13, this.f182816s) + C52418a.m58678e(14, this.f182817t) + C52418a.m58678e(15, this.f182818u) + C52418a.m58678e(16, this.f182819v);
            nr4 nr45 = this.f182820w;
            if (nr45 != null) {
                e += C52418a.m58682i(23, nr45.computeSize());
            }
            nr4 nr46 = this.f182821x;
            if (nr46 != null) {
                e += C52418a.m58682i(24, nr46.computeSize());
            }
            nr4 nr47 = this.f182822y;
            if (nr47 != null) {
                e += C52418a.m58682i(25, nr47.computeSize());
            }
            int e2 = e + C52418a.m58678e(26, this.f182823z);
            nr4 nr48 = this.f182803A;
            return nr48 != null ? e2 + C52418a.m58682i(27, nr48.computeSize()) : e2;
        } else if (i2 == 2) {
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
            C64323dq2 dq22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dq22.f182804d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    dq22.f182805e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    dq22.f182806f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    dq22.f182807g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    dq22.f182808h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    dq22.f182809i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    dq22.f182810j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    dq22.f182811n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    dq22.f182812o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    dq22.f182813p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    dq22.f182814q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    dq22.f182815r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    dq22.f182816s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    dq22.f182817t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    dq22.f182818u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    dq22.f182819v = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    switch (intValue) {
                        case 23:
                            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                            int size = j.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                byte[] bArr = j.get(i3);
                                nr4 nr49 = new nr4();
                                if (bArr != null && bArr.length > 0) {
                                    nr49.parseFrom(bArr);
                                }
                                dq22.f182820w = nr49;
                            }
                            return 0;
                        case 24:
                            LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                            int size2 = j2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                byte[] bArr2 = j2.get(i4);
                                nr4 nr410 = new nr4();
                                if (bArr2 != null && bArr2.length > 0) {
                                    nr410.parseFrom(bArr2);
                                }
                                dq22.f182821x = nr410;
                            }
                            return 0;
                        case 25:
                            LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                            int size3 = j3.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                byte[] bArr3 = j3.get(i5);
                                nr4 nr411 = new nr4();
                                if (bArr3 != null && bArr3.length > 0) {
                                    nr411.parseFrom(bArr3);
                                }
                                dq22.f182822y = nr411;
                            }
                            return 0;
                        case 26:
                            dq22.f182823z = aVar3.mo141629g(intValue);
                            return 0;
                        case 27:
                            LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                            int size4 = j4.size();
                            for (int i6 = 0; i6 < size4; i6++) {
                                byte[] bArr4 = j4.get(i6);
                                nr4 nr412 = new nr4();
                                if (bArr4 != null && bArr4.length > 0) {
                                    nr412.parseFrom(bArr4);
                                }
                                dq22.f182803A = nr412;
                            }
                            return 0;
                        default:
                            return -1;
                    }
            }
        }
    }
}
