package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qe3 */
public class C50951qe3 extends C47465a {

    /* renamed from: d */
    public C49982je3 f140264d;

    /* renamed from: e */
    public C51386te3 f140265e;

    /* renamed from: f */
    public C52106ye3 f140266f;

    /* renamed from: g */
    public LinkedList<C51535ue3> f140267g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C50818pe3> f140268h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<C50531ne3> f140269i = new LinkedList<>();

    /* renamed from: j */
    public C48850bf3 f140270j;

    /* renamed from: n */
    public C50121ke3 f140271n;

    /* renamed from: o */
    public C48705af3 f140272o;

    /* renamed from: p */
    public C49419ff3 f140273p;

    /* renamed from: q */
    public C49836ie3 f140274q;

    /* renamed from: r */
    public LinkedList<C49140df3> f140275r = new LinkedList<>();

    /* renamed from: s */
    public C51535ue3 f140276s;

    /* renamed from: t */
    public LinkedList<C52253ze3> f140277t = new LinkedList<>();

    /* renamed from: u */
    public C51963xe3 f140278u;

    /* renamed from: v */
    public LinkedList<C49279ef3> f140279v = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50951qe3)) {
            return false;
        }
        C50951qe3 qe32 = (C50951qe3) aVar;
        return C46238a.m51546a(this.f140264d, qe32.f140264d) && C46238a.m51546a(this.f140265e, qe32.f140265e) && C46238a.m51546a(this.f140266f, qe32.f140266f) && C46238a.m51546a(this.f140267g, qe32.f140267g) && C46238a.m51546a(this.f140268h, qe32.f140268h) && C46238a.m51546a(this.f140269i, qe32.f140269i) && C46238a.m51546a(this.f140270j, qe32.f140270j) && C46238a.m51546a(this.f140271n, qe32.f140271n) && C46238a.m51546a(this.f140272o, qe32.f140272o) && C46238a.m51546a(this.f140273p, qe32.f140273p) && C46238a.m51546a(this.f140274q, qe32.f140274q) && C46238a.m51546a(this.f140275r, qe32.f140275r) && C46238a.m51546a(this.f140276s, qe32.f140276s) && C46238a.m51546a(this.f140277t, qe32.f140277t) && C46238a.m51546a(this.f140278u, qe32.f140278u) && C46238a.m51546a(this.f140279v, qe32.f140279v);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49982je3 je32 = this.f140264d;
            if (je32 != null) {
                aVar.mo74322i(1, je32.computeSize());
                this.f140264d.writeFields(aVar);
            }
            C51386te3 te32 = this.f140265e;
            if (te32 != null) {
                aVar.mo74322i(2, te32.computeSize());
                this.f140265e.writeFields(aVar);
            }
            C52106ye3 ye32 = this.f140266f;
            if (ye32 != null) {
                aVar.mo74322i(3, ye32.computeSize());
                this.f140266f.writeFields(aVar);
            }
            aVar.mo74320g(4, 8, this.f140267g);
            aVar.mo74320g(5, 8, this.f140268h);
            aVar.mo74320g(6, 8, this.f140269i);
            C48850bf3 bf32 = this.f140270j;
            if (bf32 != null) {
                aVar.mo74322i(7, bf32.computeSize());
                this.f140270j.writeFields(aVar);
            }
            C50121ke3 ke32 = this.f140271n;
            if (ke32 != null) {
                aVar.mo74322i(8, ke32.computeSize());
                this.f140271n.writeFields(aVar);
            }
            C48705af3 af32 = this.f140272o;
            if (af32 != null) {
                aVar.mo74322i(9, af32.computeSize());
                this.f140272o.writeFields(aVar);
            }
            C49419ff3 ff32 = this.f140273p;
            if (ff32 != null) {
                aVar.mo74322i(10, ff32.computeSize());
                this.f140273p.writeFields(aVar);
            }
            C49836ie3 ie32 = this.f140274q;
            if (ie32 != null) {
                aVar.mo74322i(11, ie32.computeSize());
                this.f140274q.writeFields(aVar);
            }
            aVar.mo74320g(12, 8, this.f140275r);
            C51535ue3 ue32 = this.f140276s;
            if (ue32 != null) {
                aVar.mo74322i(13, ue32.computeSize());
                this.f140276s.writeFields(aVar);
            }
            aVar.mo74320g(14, 8, this.f140277t);
            C51963xe3 xe32 = this.f140278u;
            if (xe32 != null) {
                aVar.mo74322i(15, xe32.computeSize());
                this.f140278u.writeFields(aVar);
            }
            aVar.mo74320g(16, 8, this.f140279v);
            return 0;
        } else if (i2 == 1) {
            C49982je3 je33 = this.f140264d;
            if (je33 != null) {
                i3 = C52418a.m58682i(1, je33.computeSize()) + 0;
            }
            C51386te3 te33 = this.f140265e;
            if (te33 != null) {
                i3 += C52418a.m58682i(2, te33.computeSize());
            }
            C52106ye3 ye33 = this.f140266f;
            if (ye33 != null) {
                i3 += C52418a.m58682i(3, ye33.computeSize());
            }
            int g = i3 + C52418a.m58680g(4, 8, this.f140267g) + C52418a.m58680g(5, 8, this.f140268h) + C52418a.m58680g(6, 8, this.f140269i);
            C48850bf3 bf33 = this.f140270j;
            if (bf33 != null) {
                g += C52418a.m58682i(7, bf33.computeSize());
            }
            C50121ke3 ke33 = this.f140271n;
            if (ke33 != null) {
                g += C52418a.m58682i(8, ke33.computeSize());
            }
            C48705af3 af33 = this.f140272o;
            if (af33 != null) {
                g += C52418a.m58682i(9, af33.computeSize());
            }
            C49419ff3 ff33 = this.f140273p;
            if (ff33 != null) {
                g += C52418a.m58682i(10, ff33.computeSize());
            }
            C49836ie3 ie33 = this.f140274q;
            if (ie33 != null) {
                g += C52418a.m58682i(11, ie33.computeSize());
            }
            int g2 = g + C52418a.m58680g(12, 8, this.f140275r);
            C51535ue3 ue33 = this.f140276s;
            if (ue33 != null) {
                g2 += C52418a.m58682i(13, ue33.computeSize());
            }
            int g3 = g2 + C52418a.m58680g(14, 8, this.f140277t);
            C51963xe3 xe33 = this.f140278u;
            if (xe33 != null) {
                g3 += C52418a.m58682i(15, xe33.computeSize());
            }
            return g3 + C52418a.m58680g(16, 8, this.f140279v);
        } else if (i2 == 2) {
            this.f140267g.clear();
            this.f140268h.clear();
            this.f140269i.clear();
            this.f140275r.clear();
            this.f140277t.clear();
            this.f140279v.clear();
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
            C50951qe3 qe32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49982je3 je34 = new C49982je3();
                        if (bArr != null && bArr.length > 0) {
                            je34.parseFrom(bArr);
                        }
                        qe32.f140264d = je34;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51386te3 te34 = new C51386te3();
                        if (bArr2 != null && bArr2.length > 0) {
                            te34.parseFrom(bArr2);
                        }
                        qe32.f140265e = te34;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C52106ye3 ye34 = new C52106ye3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ye34.parseFrom(bArr3);
                        }
                        qe32.f140266f = ye34;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51535ue3 ue34 = new C51535ue3();
                        if (bArr4 != null && bArr4.length > 0) {
                            ue34.parseFrom(bArr4);
                        }
                        qe32.f140267g.add(ue34);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C50818pe3 pe32 = new C50818pe3();
                        if (bArr5 != null && bArr5.length > 0) {
                            pe32.parseFrom(bArr5);
                        }
                        qe32.f140268h.add(pe32);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C50531ne3 ne32 = new C50531ne3();
                        if (bArr6 != null && bArr6.length > 0) {
                            ne32.parseFrom(bArr6);
                        }
                        qe32.f140269i.add(ne32);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C48850bf3 bf34 = new C48850bf3();
                        if (bArr7 != null && bArr7.length > 0) {
                            bf34.parseFrom(bArr7);
                        }
                        qe32.f140270j = bf34;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C50121ke3 ke34 = new C50121ke3();
                        if (bArr8 != null && bArr8.length > 0) {
                            ke34.parseFrom(bArr8);
                        }
                        qe32.f140271n = ke34;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C48705af3 af34 = new C48705af3();
                        if (bArr9 != null && bArr9.length > 0) {
                            af34.parseFrom(bArr9);
                        }
                        qe32.f140272o = af34;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C49419ff3 ff34 = new C49419ff3();
                        if (bArr10 != null && bArr10.length > 0) {
                            ff34.parseFrom(bArr10);
                        }
                        qe32.f140273p = ff34;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C49836ie3 ie34 = new C49836ie3();
                        if (bArr11 != null && bArr11.length > 0) {
                            ie34.parseFrom(bArr11);
                        }
                        qe32.f140274q = ie34;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        C49140df3 df32 = new C49140df3();
                        if (bArr12 != null && bArr12.length > 0) {
                            df32.parseFrom(bArr12);
                        }
                        qe32.f140275r.add(df32);
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        C51535ue3 ue35 = new C51535ue3();
                        if (bArr13 != null && bArr13.length > 0) {
                            ue35.parseFrom(bArr13);
                        }
                        qe32.f140276s = ue35;
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i27 = 0; i27 < size14; i27++) {
                        byte[] bArr14 = j19.get(i27);
                        C52253ze3 ze32 = new C52253ze3();
                        if (bArr14 != null && bArr14.length > 0) {
                            ze32.parseFrom(bArr14);
                        }
                        qe32.f140277t.add(ze32);
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j25 = aVar3.mo141632j(intValue);
                    int size15 = j25.size();
                    for (int i28 = 0; i28 < size15; i28++) {
                        byte[] bArr15 = j25.get(i28);
                        C51963xe3 xe34 = new C51963xe3();
                        if (bArr15 != null && bArr15.length > 0) {
                            xe34.parseFrom(bArr15);
                        }
                        qe32.f140278u = xe34;
                    }
                    return 0;
                case 16:
                    LinkedList<byte[]> j26 = aVar3.mo141632j(intValue);
                    int size16 = j26.size();
                    for (int i29 = 0; i29 < size16; i29++) {
                        byte[] bArr16 = j26.get(i29);
                        C49279ef3 ef32 = new C49279ef3();
                        if (bArr16 != null && bArr16.length > 0) {
                            ef32.parseFrom(bArr16);
                        }
                        qe32.f140279v.add(ef32);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
