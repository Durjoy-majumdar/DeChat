package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mv3 */
public class C50456mv3 extends C47465a {

    /* renamed from: d */
    public int f138230d;

    /* renamed from: e */
    public String f138231e;

    /* renamed from: f */
    public sg4 f138232f;

    /* renamed from: g */
    public C51342t40 f138233g;

    /* renamed from: h */
    public int f138234h;

    /* renamed from: i */
    public boolean f138235i;

    /* renamed from: j */
    public LinkedList<C51492u40> f138236j = new LinkedList<>();

    /* renamed from: n */
    public C50620o10 f138237n;

    /* renamed from: o */
    public C50765p1 f138238o;

    /* renamed from: p */
    public C50040ju3 f138239p;

    /* renamed from: q */
    public C49553gf2 f138240q;

    /* renamed from: r */
    public C50059k00 f138241r;

    /* renamed from: s */
    public C50156ko1 f138242s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50456mv3)) {
            return false;
        }
        C50456mv3 mv32 = (C50456mv3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138230d), Integer.valueOf(mv32.f138230d)) && C46238a.m51546a(this.f138231e, mv32.f138231e) && C46238a.m51546a(this.f138232f, mv32.f138232f) && C46238a.m51546a(this.f138233g, mv32.f138233g) && C46238a.m51546a(Integer.valueOf(this.f138234h), Integer.valueOf(mv32.f138234h)) && C46238a.m51546a(Boolean.valueOf(this.f138235i), Boolean.valueOf(mv32.f138235i)) && C46238a.m51546a(this.f138236j, mv32.f138236j) && C46238a.m51546a(this.f138237n, mv32.f138237n) && C46238a.m51546a(this.f138238o, mv32.f138238o) && C46238a.m51546a(this.f138239p, mv32.f138239p) && C46238a.m51546a(this.f138240q, mv32.f138240q) && C46238a.m51546a(this.f138241r, mv32.f138241r) && C46238a.m51546a(this.f138242s, mv32.f138242s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138230d);
            String str = this.f138231e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            sg4 sg4 = this.f138232f;
            if (sg4 != null) {
                aVar.mo74322i(3, sg4.computeSize());
                this.f138232f.writeFields(aVar);
            }
            C51342t40 t402 = this.f138233g;
            if (t402 != null) {
                aVar.mo74322i(4, t402.computeSize());
                this.f138233g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f138234h);
            aVar.mo74314a(6, this.f138235i);
            aVar.mo74320g(7, 8, this.f138236j);
            C50620o10 o102 = this.f138237n;
            if (o102 != null) {
                aVar.mo74322i(8, o102.computeSize());
                this.f138237n.writeFields(aVar);
            }
            C50765p1 p1Var = this.f138238o;
            if (p1Var != null) {
                aVar.mo74322i(9, p1Var.computeSize());
                this.f138238o.writeFields(aVar);
            }
            C50040ju3 ju32 = this.f138239p;
            if (ju32 != null) {
                aVar.mo74322i(10, ju32.computeSize());
                this.f138239p.writeFields(aVar);
            }
            C49553gf2 gf22 = this.f138240q;
            if (gf22 != null) {
                aVar.mo74322i(11, gf22.computeSize());
                this.f138240q.writeFields(aVar);
            }
            C50059k00 k002 = this.f138241r;
            if (k002 != null) {
                aVar.mo74322i(12, k002.computeSize());
                this.f138241r.writeFields(aVar);
            }
            C50156ko1 ko12 = this.f138242s;
            if (ko12 == null) {
                return 0;
            }
            aVar.mo74322i(13, ko12.computeSize());
            this.f138242s.writeFields(aVar);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f138230d) + 0;
            String str2 = this.f138231e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            sg4 sg42 = this.f138232f;
            if (sg42 != null) {
                e += C52418a.m58682i(3, sg42.computeSize());
            }
            C51342t40 t403 = this.f138233g;
            if (t403 != null) {
                e += C52418a.m58682i(4, t403.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f138234h) + C52418a.m58674a(6, this.f138235i) + C52418a.m58680g(7, 8, this.f138236j);
            C50620o10 o103 = this.f138237n;
            if (o103 != null) {
                e2 += C52418a.m58682i(8, o103.computeSize());
            }
            C50765p1 p1Var2 = this.f138238o;
            if (p1Var2 != null) {
                e2 += C52418a.m58682i(9, p1Var2.computeSize());
            }
            C50040ju3 ju33 = this.f138239p;
            if (ju33 != null) {
                e2 += C52418a.m58682i(10, ju33.computeSize());
            }
            C49553gf2 gf23 = this.f138240q;
            if (gf23 != null) {
                e2 += C52418a.m58682i(11, gf23.computeSize());
            }
            C50059k00 k003 = this.f138241r;
            if (k003 != null) {
                e2 += C52418a.m58682i(12, k003.computeSize());
            }
            C50156ko1 ko13 = this.f138242s;
            return ko13 != null ? e2 + C52418a.m58682i(13, ko13.computeSize()) : e2;
        } else if (i2 == 2) {
            this.f138236j.clear();
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
            C50456mv3 mv32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mv32.f138230d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    mv32.f138231e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        sg4 sg43 = new sg4();
                        if (bArr != null && bArr.length > 0) {
                            sg43.parseFrom(bArr);
                        }
                        mv32.f138232f = sg43;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51342t40 t404 = new C51342t40();
                        if (bArr2 != null && bArr2.length > 0) {
                            t404.parseFrom(bArr2);
                        }
                        mv32.f138233g = t404;
                    }
                    return 0;
                case 5:
                    mv32.f138234h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    mv32.f138235i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51492u40 u402 = new C51492u40();
                        if (bArr3 != null && bArr3.length > 0) {
                            u402.parseFrom(bArr3);
                        }
                        mv32.f138236j.add(u402);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50620o10 o104 = new C50620o10();
                        if (bArr4 != null && bArr4.length > 0) {
                            o104.parseFrom(bArr4);
                        }
                        mv32.f138237n = o104;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C50765p1 p1Var3 = new C50765p1();
                        if (bArr5 != null && bArr5.length > 0) {
                            p1Var3.parseFrom(bArr5);
                        }
                        mv32.f138238o = p1Var3;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C50040ju3 ju34 = new C50040ju3();
                        if (bArr6 != null && bArr6.length > 0) {
                            ju34.parseFrom(bArr6);
                        }
                        mv32.f138239p = ju34;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C49553gf2 gf24 = new C49553gf2();
                        if (bArr7 != null && bArr7.length > 0) {
                            gf24.parseFrom(bArr7);
                        }
                        mv32.f138240q = gf24;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C50059k00 k004 = new C50059k00();
                        if (bArr8 != null && bArr8.length > 0) {
                            k004.parseFrom(bArr8);
                        }
                        mv32.f138241r = k004;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        C50156ko1 ko14 = new C50156ko1();
                        if (bArr9 != null && bArr9.length > 0) {
                            ko14.parseFrom(bArr9);
                        }
                        mv32.f138242s = ko14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
