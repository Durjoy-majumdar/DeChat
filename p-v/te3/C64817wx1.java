package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wx1 */
public class C64817wx1 extends C47465a implements r54 {

    /* renamed from: d */
    public int f186216d;

    /* renamed from: e */
    public int f186217e;

    /* renamed from: f */
    public int f186218f;

    /* renamed from: g */
    public int f186219g;

    /* renamed from: h */
    public LinkedList<rc4> f186220h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<rc4> f186221i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<rc4> f186222j = new LinkedList<>();

    /* renamed from: n */
    public int f186223n;

    /* renamed from: o */
    public int f186224o;

    /* renamed from: p */
    public int f186225p;

    /* renamed from: q */
    public int f186226q;

    /* renamed from: r */
    public int f186227r;

    /* renamed from: s */
    public int f186228s;

    /* renamed from: t */
    public LinkedList<rc4> f186229t = new LinkedList<>();

    /* renamed from: u */
    public LinkedList<rc4> f186230u = new LinkedList<>();

    /* renamed from: v */
    public LinkedList<rc4> f186231v = new LinkedList<>();

    /* renamed from: w */
    public C48709ag2 f186232w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64817wx1)) {
            return false;
        }
        C64817wx1 wx12 = (C64817wx1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186216d), Integer.valueOf(wx12.f186216d)) && C46238a.m51546a(Integer.valueOf(this.f186217e), Integer.valueOf(wx12.f186217e)) && C46238a.m51546a(Integer.valueOf(this.f186218f), Integer.valueOf(wx12.f186218f)) && C46238a.m51546a(Integer.valueOf(this.f186219g), Integer.valueOf(wx12.f186219g)) && C46238a.m51546a(this.f186220h, wx12.f186220h) && C46238a.m51546a(this.f186221i, wx12.f186221i) && C46238a.m51546a(this.f186222j, wx12.f186222j) && C46238a.m51546a(Integer.valueOf(this.f186223n), Integer.valueOf(wx12.f186223n)) && C46238a.m51546a(Integer.valueOf(this.f186224o), Integer.valueOf(wx12.f186224o)) && C46238a.m51546a(Integer.valueOf(this.f186225p), Integer.valueOf(wx12.f186225p)) && C46238a.m51546a(Integer.valueOf(this.f186226q), Integer.valueOf(wx12.f186226q)) && C46238a.m51546a(Integer.valueOf(this.f186227r), Integer.valueOf(wx12.f186227r)) && C46238a.m51546a(Integer.valueOf(this.f186228s), Integer.valueOf(wx12.f186228s)) && C46238a.m51546a(this.f186229t, wx12.f186229t) && C46238a.m51546a(this.f186230u, wx12.f186230u) && C46238a.m51546a(this.f186231v, wx12.f186231v) && C46238a.m51546a(this.f186232w, wx12.f186232w);
    }

    public final int getRet() {
        return this.f186216d;
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186216d);
            aVar.mo74318e(2, this.f186217e);
            aVar.mo74318e(3, this.f186218f);
            aVar.mo74318e(4, this.f186219g);
            aVar.mo74320g(5, 8, this.f186220h);
            aVar.mo74320g(6, 8, this.f186221i);
            aVar.mo74320g(7, 8, this.f186222j);
            aVar.mo74318e(8, this.f186223n);
            aVar.mo74318e(9, this.f186224o);
            aVar.mo74318e(10, this.f186225p);
            aVar.mo74318e(11, this.f186226q);
            aVar.mo74318e(12, this.f186227r);
            aVar.mo74318e(13, this.f186228s);
            aVar.mo74320g(14, 8, this.f186229t);
            aVar.mo74320g(15, 8, this.f186230u);
            aVar.mo74320g(16, 8, this.f186231v);
            C48709ag2 ag22 = this.f186232w;
            if (ag22 != null) {
                aVar.mo74322i(17, ag22.computeSize());
                this.f186232w.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f186216d) + 0 + C52418a.m58678e(2, this.f186217e) + C52418a.m58678e(3, this.f186218f) + C52418a.m58678e(4, this.f186219g) + C52418a.m58680g(5, 8, this.f186220h) + C52418a.m58680g(6, 8, this.f186221i) + C52418a.m58680g(7, 8, this.f186222j) + C52418a.m58678e(8, this.f186223n) + C52418a.m58678e(9, this.f186224o) + C52418a.m58678e(10, this.f186225p) + C52418a.m58678e(11, this.f186226q) + C52418a.m58678e(12, this.f186227r) + C52418a.m58678e(13, this.f186228s) + C52418a.m58680g(14, 8, this.f186229t) + C52418a.m58680g(15, 8, this.f186230u) + C52418a.m58680g(16, 8, this.f186231v);
            C48709ag2 ag23 = this.f186232w;
            return ag23 != null ? e + C52418a.m58682i(17, ag23.computeSize()) : e;
        } else if (i2 == 2) {
            this.f186220h.clear();
            this.f186221i.clear();
            this.f186222j.clear();
            this.f186229t.clear();
            this.f186230u.clear();
            this.f186231v.clear();
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
            C64817wx1 wx12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    wx12.f186216d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    wx12.f186217e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    wx12.f186218f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    wx12.f186219g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        rc4 rc4 = new rc4();
                        if (bArr != null && bArr.length > 0) {
                            rc4.parseFrom(bArr);
                        }
                        wx12.f186220h.add(rc4);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        rc4 rc42 = new rc4();
                        if (bArr2 != null && bArr2.length > 0) {
                            rc42.parseFrom(bArr2);
                        }
                        wx12.f186221i.add(rc42);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        rc4 rc43 = new rc4();
                        if (bArr3 != null && bArr3.length > 0) {
                            rc43.parseFrom(bArr3);
                        }
                        wx12.f186222j.add(rc43);
                    }
                    return 0;
                case 8:
                    wx12.f186223n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    wx12.f186224o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    wx12.f186225p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    wx12.f186226q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    wx12.f186227r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    wx12.f186228s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        rc4 rc44 = new rc4();
                        if (bArr4 != null && bArr4.length > 0) {
                            rc44.parseFrom(bArr4);
                        }
                        wx12.f186229t.add(rc44);
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        rc4 rc45 = new rc4();
                        if (bArr5 != null && bArr5.length > 0) {
                            rc45.parseFrom(bArr5);
                        }
                        wx12.f186230u.add(rc45);
                    }
                    return 0;
                case 16:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        rc4 rc46 = new rc4();
                        if (bArr6 != null && bArr6.length > 0) {
                            rc46.parseFrom(bArr6);
                        }
                        wx12.f186231v.add(rc46);
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C48709ag2 ag24 = new C48709ag2();
                        if (bArr7 != null && bArr7.length > 0) {
                            ag24.parseFrom(bArr7);
                        }
                        wx12.f186232w = ag24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
