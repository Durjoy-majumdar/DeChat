package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ue1 */
public class C51533ue1 extends C47465a {

    /* renamed from: d */
    public long f142797d;

    /* renamed from: e */
    public C64273c21 f142798e;

    /* renamed from: f */
    public LinkedList<String> f142799f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<String> f142800g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<FinderJumpInfo> f142801h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<FinderJumpInfo> f142802i = new LinkedList<>();

    /* renamed from: j */
    public C50217l51 f142803j;

    /* renamed from: n */
    public C48704af1 f142804n;

    /* renamed from: o */
    public C49564gi1 f142805o;

    /* renamed from: p */
    public LinkedList<FinderJumpInfo> f142806p = new LinkedList<>();

    /* renamed from: q */
    public C49376f40 f142807q;

    /* renamed from: r */
    public LinkedList<FinderJumpInfo> f142808r = new LinkedList<>();

    /* renamed from: s */
    public C51096re1 f142809s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51533ue1)) {
            return false;
        }
        C51533ue1 ue12 = (C51533ue1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f142797d), Long.valueOf(ue12.f142797d)) && C46238a.m51546a(this.f142798e, ue12.f142798e) && C46238a.m51546a(this.f142799f, ue12.f142799f) && C46238a.m51546a(this.f142800g, ue12.f142800g) && C46238a.m51546a(this.f142801h, ue12.f142801h) && C46238a.m51546a(this.f142802i, ue12.f142802i) && C46238a.m51546a(this.f142803j, ue12.f142803j) && C46238a.m51546a(this.f142804n, ue12.f142804n) && C46238a.m51546a(this.f142805o, ue12.f142805o) && C46238a.m51546a(this.f142806p, ue12.f142806p) && C46238a.m51546a(this.f142807q, ue12.f142807q) && C46238a.m51546a(this.f142808r, ue12.f142808r) && C46238a.m51546a(this.f142809s, ue12.f142809s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f142797d);
            C64273c21 c212 = this.f142798e;
            if (c212 != null) {
                aVar.mo74322i(2, c212.computeSize());
                this.f142798e.writeFields(aVar);
            }
            aVar.mo74320g(3, 1, this.f142799f);
            aVar.mo74320g(4, 1, this.f142800g);
            aVar.mo74320g(5, 8, this.f142801h);
            aVar.mo74320g(6, 8, this.f142802i);
            C50217l51 l512 = this.f142803j;
            if (l512 != null) {
                aVar.mo74322i(7, l512.computeSize());
                this.f142803j.writeFields(aVar);
            }
            C48704af1 af12 = this.f142804n;
            if (af12 != null) {
                aVar.mo74322i(8, af12.computeSize());
                this.f142804n.writeFields(aVar);
            }
            C49564gi1 gi12 = this.f142805o;
            if (gi12 != null) {
                aVar.mo74322i(9, gi12.computeSize());
                this.f142805o.writeFields(aVar);
            }
            aVar.mo74320g(10, 8, this.f142806p);
            C49376f40 f402 = this.f142807q;
            if (f402 != null) {
                aVar.mo74322i(11, f402.computeSize());
                this.f142807q.writeFields(aVar);
            }
            aVar.mo74320g(12, 8, this.f142808r);
            C51096re1 re12 = this.f142809s;
            if (re12 != null) {
                aVar.mo74322i(13, re12.computeSize());
                this.f142809s.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f142797d) + 0;
            C64273c21 c213 = this.f142798e;
            if (c213 != null) {
                h += C52418a.m58682i(2, c213.computeSize());
            }
            int g = h + C52418a.m58680g(3, 1, this.f142799f) + C52418a.m58680g(4, 1, this.f142800g) + C52418a.m58680g(5, 8, this.f142801h) + C52418a.m58680g(6, 8, this.f142802i);
            C50217l51 l513 = this.f142803j;
            if (l513 != null) {
                g += C52418a.m58682i(7, l513.computeSize());
            }
            C48704af1 af13 = this.f142804n;
            if (af13 != null) {
                g += C52418a.m58682i(8, af13.computeSize());
            }
            C49564gi1 gi13 = this.f142805o;
            if (gi13 != null) {
                g += C52418a.m58682i(9, gi13.computeSize());
            }
            int g2 = g + C52418a.m58680g(10, 8, this.f142806p);
            C49376f40 f403 = this.f142807q;
            if (f403 != null) {
                g2 += C52418a.m58682i(11, f403.computeSize());
            }
            int g3 = g2 + C52418a.m58680g(12, 8, this.f142808r);
            C51096re1 re13 = this.f142809s;
            return re13 != null ? g3 + C52418a.m58682i(13, re13.computeSize()) : g3;
        } else if (i2 == 2) {
            this.f142799f.clear();
            this.f142800g.clear();
            this.f142801h.clear();
            this.f142802i.clear();
            this.f142806p.clear();
            this.f142808r.clear();
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
            C51533ue1 ue12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ue12.f142797d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64273c21 c214 = new C64273c21();
                        if (bArr != null && bArr.length > 0) {
                            c214.parseFrom(bArr);
                        }
                        ue12.f142798e = c214;
                    }
                    return 0;
                case 3:
                    ue12.f142799f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    ue12.f142800g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderJumpInfo.parseFrom(bArr2);
                        }
                        ue12.f142801h.add(finderJumpInfo);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        FinderJumpInfo finderJumpInfo2 = new FinderJumpInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderJumpInfo2.parseFrom(bArr3);
                        }
                        ue12.f142802i.add(finderJumpInfo2);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50217l51 l514 = new C50217l51();
                        if (bArr4 != null && bArr4.length > 0) {
                            l514.parseFrom(bArr4);
                        }
                        ue12.f142803j = l514;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C48704af1 af14 = new C48704af1();
                        if (bArr5 != null && bArr5.length > 0) {
                            af14.parseFrom(bArr5);
                        }
                        ue12.f142804n = af14;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C49564gi1 gi14 = new C49564gi1();
                        if (bArr6 != null && bArr6.length > 0) {
                            gi14.parseFrom(bArr6);
                        }
                        ue12.f142805o = gi14;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                        if (bArr7 != null && bArr7.length > 0) {
                            finderJumpInfo3.parseFrom(bArr7);
                        }
                        ue12.f142806p.add(finderJumpInfo3);
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C49376f40 f404 = new C49376f40();
                        if (bArr8 != null && bArr8.length > 0) {
                            f404.parseFrom(bArr8);
                        }
                        ue12.f142807q = f404;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        FinderJumpInfo finderJumpInfo4 = new FinderJumpInfo();
                        if (bArr9 != null && bArr9.length > 0) {
                            finderJumpInfo4.parseFrom(bArr9);
                        }
                        ue12.f142808r.add(finderJumpInfo4);
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i17 = 0; i17 < size10; i17++) {
                        byte[] bArr10 = j15.get(i17);
                        C51096re1 re14 = new C51096re1();
                        if (bArr10 != null && bArr10.length > 0) {
                            re14.parseFrom(bArr10);
                        }
                        ue12.f142809s = re14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
