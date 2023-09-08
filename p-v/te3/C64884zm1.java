package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zm1 */
public class C64884zm1 extends C101820nt3 {

    /* renamed from: A */
    public C89349b f186708A;

    /* renamed from: d */
    public int f186709d;

    /* renamed from: e */
    public C51018qv3 f186710e;

    /* renamed from: f */
    public LinkedList<FinderContact> f186711f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<FinderContact> f186712g = new LinkedList<>();

    /* renamed from: h */
    public String f186713h;

    /* renamed from: i */
    public C49842ig0 f186714i;

    /* renamed from: j */
    public int f186715j;

    /* renamed from: n */
    public LinkedList<C51978xi1> f186716n = new LinkedList<>();

    /* renamed from: o */
    public String f186717o;

    /* renamed from: p */
    public LinkedList<C51978xi1> f186718p = new LinkedList<>();

    /* renamed from: q */
    public String f186719q;

    /* renamed from: r */
    public int f186720r;

    /* renamed from: s */
    public String f186721s;

    /* renamed from: t */
    public int f186722t;

    /* renamed from: u */
    public long f186723u;

    /* renamed from: v */
    public C64559mm1 f186724v;

    /* renamed from: w */
    public C64584nm1 f186725w;

    /* renamed from: x */
    public LinkedList<String> f186726x = new LinkedList<>();

    /* renamed from: y */
    public C51400ti0 f186727y;

    /* renamed from: z */
    public C64440i90 f186728z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64884zm1)) {
            return false;
        }
        C64884zm1 zm12 = (C64884zm1) aVar;
        return C46238a.m51546a(this.BaseRequest, zm12.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f186709d), Integer.valueOf(zm12.f186709d)) && C46238a.m51546a(this.f186710e, zm12.f186710e) && C46238a.m51546a(this.f186711f, zm12.f186711f) && C46238a.m51546a(this.f186712g, zm12.f186712g) && C46238a.m51546a(this.f186713h, zm12.f186713h) && C46238a.m51546a(this.f186714i, zm12.f186714i) && C46238a.m51546a(Integer.valueOf(this.f186715j), Integer.valueOf(zm12.f186715j)) && C46238a.m51546a(this.f186716n, zm12.f186716n) && C46238a.m51546a(this.f186717o, zm12.f186717o) && C46238a.m51546a(this.f186718p, zm12.f186718p) && C46238a.m51546a(this.f186719q, zm12.f186719q) && C46238a.m51546a(Integer.valueOf(this.f186720r), Integer.valueOf(zm12.f186720r)) && C46238a.m51546a(this.f186721s, zm12.f186721s) && C46238a.m51546a(Integer.valueOf(this.f186722t), Integer.valueOf(zm12.f186722t)) && C46238a.m51546a(Long.valueOf(this.f186723u), Long.valueOf(zm12.f186723u)) && C46238a.m51546a(this.f186724v, zm12.f186724v) && C46238a.m51546a(this.f186725w, zm12.f186725w) && C46238a.m51546a(this.f186726x, zm12.f186726x) && C46238a.m51546a(this.f186727y, zm12.f186727y) && C46238a.m51546a(this.f186728z, zm12.f186728z) && C46238a.m51546a(this.f186708A, zm12.f186708A);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f186709d);
            C51018qv3 qv32 = this.f186710e;
            if (qv32 != null) {
                aVar.mo74322i(3, qv32.computeSize());
                this.f186710e.writeFields(aVar);
            }
            aVar.mo74320g(4, 8, this.f186711f);
            aVar.mo74320g(5, 8, this.f186712g);
            String str = this.f186713h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            C49842ig0 ig02 = this.f186714i;
            if (ig02 != null) {
                aVar.mo74322i(7, ig02.computeSize());
                this.f186714i.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f186715j);
            aVar.mo74320g(9, 8, this.f186716n);
            String str2 = this.f186717o;
            if (str2 != null) {
                aVar.mo74323j(10, str2);
            }
            aVar.mo74320g(11, 8, this.f186718p);
            String str3 = this.f186719q;
            if (str3 != null) {
                aVar.mo74323j(12, str3);
            }
            aVar.mo74318e(13, this.f186720r);
            String str4 = this.f186721s;
            if (str4 != null) {
                aVar.mo74323j(14, str4);
            }
            aVar.mo74318e(15, this.f186722t);
            aVar.mo74321h(16, this.f186723u);
            C64559mm1 mm12 = this.f186724v;
            if (mm12 != null) {
                aVar.mo74322i(17, mm12.computeSize());
                this.f186724v.writeFields(aVar);
            }
            C64584nm1 nm12 = this.f186725w;
            if (nm12 != null) {
                aVar.mo74322i(18, nm12.computeSize());
                this.f186725w.writeFields(aVar);
            }
            aVar.mo74320g(19, 1, this.f186726x);
            C51400ti0 ti02 = this.f186727y;
            if (ti02 != null) {
                aVar.mo74322i(20, ti02.computeSize());
                this.f186727y.writeFields(aVar);
            }
            C64440i90 i902 = this.f186728z;
            if (i902 != null) {
                aVar.mo74322i(21, i902.computeSize());
                this.f186728z.writeFields(aVar);
            }
            C89349b bVar = this.f186708A;
            if (bVar != null) {
                aVar.mo74315b(22, bVar);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f186709d);
            C51018qv3 qv33 = this.f186710e;
            if (qv33 != null) {
                e += C52418a.m58682i(3, qv33.computeSize());
            }
            int g = e + C52418a.m58680g(4, 8, this.f186711f) + C52418a.m58680g(5, 8, this.f186712g);
            String str5 = this.f186713h;
            if (str5 != null) {
                g += C52418a.m58683j(6, str5);
            }
            C49842ig0 ig03 = this.f186714i;
            if (ig03 != null) {
                g += C52418a.m58682i(7, ig03.computeSize());
            }
            int e2 = g + C52418a.m58678e(8, this.f186715j) + C52418a.m58680g(9, 8, this.f186716n);
            String str6 = this.f186717o;
            if (str6 != null) {
                e2 += C52418a.m58683j(10, str6);
            }
            int g2 = e2 + C52418a.m58680g(11, 8, this.f186718p);
            String str7 = this.f186719q;
            if (str7 != null) {
                g2 += C52418a.m58683j(12, str7);
            }
            int e3 = g2 + C52418a.m58678e(13, this.f186720r);
            String str8 = this.f186721s;
            if (str8 != null) {
                e3 += C52418a.m58683j(14, str8);
            }
            int e4 = e3 + C52418a.m58678e(15, this.f186722t) + C52418a.m58681h(16, this.f186723u);
            C64559mm1 mm13 = this.f186724v;
            if (mm13 != null) {
                e4 += C52418a.m58682i(17, mm13.computeSize());
            }
            C64584nm1 nm13 = this.f186725w;
            if (nm13 != null) {
                e4 += C52418a.m58682i(18, nm13.computeSize());
            }
            int g3 = e4 + C52418a.m58680g(19, 1, this.f186726x);
            C51400ti0 ti03 = this.f186727y;
            if (ti03 != null) {
                g3 += C52418a.m58682i(20, ti03.computeSize());
            }
            C64440i90 i903 = this.f186728z;
            if (i903 != null) {
                g3 += C52418a.m58682i(21, i903.computeSize());
            }
            C89349b bVar2 = this.f186708A;
            return bVar2 != null ? g3 + C52418a.m58675b(22, bVar2) : g3;
        } else if (i2 == 2) {
            this.f186711f.clear();
            this.f186712g.clear();
            this.f186716n.clear();
            this.f186718p.clear();
            this.f186726x.clear();
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
            C64884zm1 zm12 = objArr[1];
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
                        zm12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    zm12.f186709d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        zm12.f186710e = qv34;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        FinderContact finderContact = new FinderContact();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderContact.parseFrom(bArr3);
                        }
                        zm12.f186711f.add(finderContact);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        FinderContact finderContact2 = new FinderContact();
                        if (bArr4 != null && bArr4.length > 0) {
                            finderContact2.parseFrom(bArr4);
                        }
                        zm12.f186712g.add(finderContact2);
                    }
                    return 0;
                case 6:
                    zm12.f186713h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr5 != null && bArr5.length > 0) {
                            ig04.parseFrom(bArr5);
                        }
                        zm12.f186714i = ig04;
                    }
                    return 0;
                case 8:
                    zm12.f186715j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51978xi1 xi12 = new C51978xi1();
                        if (bArr6 != null && bArr6.length > 0) {
                            xi12.parseFrom(bArr6);
                        }
                        zm12.f186716n.add(xi12);
                    }
                    return 0;
                case 10:
                    zm12.f186717o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51978xi1 xi13 = new C51978xi1();
                        if (bArr7 != null && bArr7.length > 0) {
                            xi13.parseFrom(bArr7);
                        }
                        zm12.f186718p.add(xi13);
                    }
                    return 0;
                case 12:
                    zm12.f186719q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    zm12.f186720r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    zm12.f186721s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    zm12.f186722t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    zm12.f186723u = aVar3.mo141631i(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C64559mm1 mm14 = new C64559mm1();
                        if (bArr8 != null && bArr8.length > 0) {
                            mm14.parseFrom(bArr8);
                        }
                        zm12.f186724v = mm14;
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C64584nm1 nm14 = new C64584nm1();
                        if (bArr9 != null && bArr9.length > 0) {
                            nm14.parseFrom(bArr9);
                        }
                        zm12.f186725w = nm14;
                    }
                    return 0;
                case 19:
                    zm12.f186726x.add(aVar3.mo141633k(intValue));
                    return 0;
                case 20:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C51400ti0 ti04 = new C51400ti0();
                        if (bArr10 != null && bArr10.length > 0) {
                            ti04.parseFrom(bArr10);
                        }
                        zm12.f186727y = ti04;
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C64440i90 i904 = new C64440i90();
                        if (bArr11 != null && bArr11.length > 0) {
                            i904.parseFrom(bArr11);
                        }
                        zm12.f186728z = i904;
                    }
                    return 0;
                case 22:
                    zm12.f186708A = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
