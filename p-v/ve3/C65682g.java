package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.g */
public class C65682g extends C47465a {

    /* renamed from: d */
    public C65680f f188994d;

    /* renamed from: e */
    public C52832h f188995e;

    /* renamed from: f */
    public String f188996f;

    /* renamed from: g */
    public String f188997g;

    /* renamed from: h */
    public String f188998h;

    /* renamed from: i */
    public C52841m0 f188999i;

    /* renamed from: j */
    public int f189000j;

    /* renamed from: n */
    public String f189001n;

    /* renamed from: o */
    public long f189002o;

    /* renamed from: p */
    public String f189003p;

    /* renamed from: q */
    public int f189004q;

    /* renamed from: r */
    public String f189005r;

    /* renamed from: s */
    public long f189006s;

    /* renamed from: t */
    public String f189007t;

    /* renamed from: u */
    public int f189008u;

    /* renamed from: v */
    public C52844o0 f189009v;

    /* renamed from: w */
    public C65683h0 f189010w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C65682g)) {
            return false;
        }
        C65682g gVar = (C65682g) aVar;
        return C46238a.m51546a(this.f188994d, gVar.f188994d) && C46238a.m51546a(this.f188995e, gVar.f188995e) && C46238a.m51546a(this.f188996f, gVar.f188996f) && C46238a.m51546a(this.f188997g, gVar.f188997g) && C46238a.m51546a(this.f188998h, gVar.f188998h) && C46238a.m51546a(this.f188999i, gVar.f188999i) && C46238a.m51546a(Integer.valueOf(this.f189000j), Integer.valueOf(gVar.f189000j)) && C46238a.m51546a(this.f189001n, gVar.f189001n) && C46238a.m51546a(Long.valueOf(this.f189002o), Long.valueOf(gVar.f189002o)) && C46238a.m51546a(this.f189003p, gVar.f189003p) && C46238a.m51546a(Integer.valueOf(this.f189004q), Integer.valueOf(gVar.f189004q)) && C46238a.m51546a(this.f189005r, gVar.f189005r) && C46238a.m51546a(Long.valueOf(this.f189006s), Long.valueOf(gVar.f189006s)) && C46238a.m51546a(this.f189007t, gVar.f189007t) && C46238a.m51546a(Integer.valueOf(this.f189008u), Integer.valueOf(gVar.f189008u)) && C46238a.m51546a(this.f189009v, gVar.f189009v) && C46238a.m51546a(this.f189010w, gVar.f189010w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C65680f fVar = this.f188994d;
            if (fVar != null) {
                aVar.mo74322i(1, fVar.computeSize());
                this.f188994d.writeFields(aVar);
            }
            C52832h hVar = this.f188995e;
            if (hVar != null) {
                aVar.mo74322i(2, hVar.computeSize());
                this.f188995e.writeFields(aVar);
            }
            String str = this.f188996f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f188997g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f188998h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            C52841m0 m0Var = this.f188999i;
            if (m0Var != null) {
                aVar.mo74322i(6, m0Var.computeSize());
                this.f188999i.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f189000j);
            String str4 = this.f189001n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            aVar.mo74321h(9, this.f189002o);
            String str5 = this.f189003p;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            aVar.mo74318e(11, this.f189004q);
            String str6 = this.f189005r;
            if (str6 != null) {
                aVar.mo74323j(12, str6);
            }
            aVar.mo74321h(13, this.f189006s);
            String str7 = this.f189007t;
            if (str7 != null) {
                aVar.mo74323j(14, str7);
            }
            aVar.mo74318e(15, this.f189008u);
            C52844o0 o0Var = this.f189009v;
            if (o0Var != null) {
                aVar.mo74322i(16, o0Var.computeSize());
                this.f189009v.writeFields(aVar);
            }
            C65683h0 h0Var = this.f189010w;
            if (h0Var != null) {
                aVar.mo74322i(17, h0Var.computeSize());
                this.f189010w.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C65680f fVar2 = this.f188994d;
            if (fVar2 != null) {
                i3 = C52418a.m58682i(1, fVar2.computeSize()) + 0;
            }
            C52832h hVar2 = this.f188995e;
            if (hVar2 != null) {
                i3 += C52418a.m58682i(2, hVar2.computeSize());
            }
            String str8 = this.f188996f;
            if (str8 != null) {
                i3 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f188997g;
            if (str9 != null) {
                i3 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f188998h;
            if (str10 != null) {
                i3 += C52418a.m58683j(5, str10);
            }
            C52841m0 m0Var2 = this.f188999i;
            if (m0Var2 != null) {
                i3 += C52418a.m58682i(6, m0Var2.computeSize());
            }
            int e = i3 + C52418a.m58678e(7, this.f189000j);
            String str11 = this.f189001n;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            int h = e + C52418a.m58681h(9, this.f189002o);
            String str12 = this.f189003p;
            if (str12 != null) {
                h += C52418a.m58683j(10, str12);
            }
            int e2 = h + C52418a.m58678e(11, this.f189004q);
            String str13 = this.f189005r;
            if (str13 != null) {
                e2 += C52418a.m58683j(12, str13);
            }
            int h2 = e2 + C52418a.m58681h(13, this.f189006s);
            String str14 = this.f189007t;
            if (str14 != null) {
                h2 += C52418a.m58683j(14, str14);
            }
            int e3 = h2 + C52418a.m58678e(15, this.f189008u);
            C52844o0 o0Var2 = this.f189009v;
            if (o0Var2 != null) {
                e3 += C52418a.m58682i(16, o0Var2.computeSize());
            }
            C65683h0 h0Var2 = this.f189010w;
            return h0Var2 != null ? e3 + C52418a.m58682i(17, h0Var2.computeSize()) : e3;
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
            C65682g gVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C65680f fVar3 = new C65680f();
                        if (bArr != null && bArr.length > 0) {
                            fVar3.parseFrom(bArr);
                        }
                        gVar.f188994d = fVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C52832h hVar3 = new C52832h();
                        if (bArr2 != null && bArr2.length > 0) {
                            hVar3.parseFrom(bArr2);
                        }
                        gVar.f188995e = hVar3;
                    }
                    return 0;
                case 3:
                    gVar.f188996f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gVar.f188997g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gVar.f188998h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C52841m0 m0Var3 = new C52841m0();
                        if (bArr3 != null && bArr3.length > 0) {
                            m0Var3.parseFrom(bArr3);
                        }
                        gVar.f188999i = m0Var3;
                    }
                    return 0;
                case 7:
                    gVar.f189000j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    gVar.f189001n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    gVar.f189002o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    gVar.f189003p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    gVar.f189004q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    gVar.f189005r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    gVar.f189006s = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    gVar.f189007t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    gVar.f189008u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C52844o0 o0Var3 = new C52844o0();
                        if (bArr4 != null && bArr4.length > 0) {
                            o0Var3.parseFrom(bArr4);
                        }
                        gVar.f189009v = o0Var3;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C65683h0 h0Var3 = new C65683h0();
                        if (bArr5 != null && bArr5.length > 0) {
                            h0Var3.parseFrom(bArr5);
                        }
                        gVar.f189010w = h0Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
