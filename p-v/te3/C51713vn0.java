package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vn0 */
public class C51713vn0 extends C49335eu3 {

    /* renamed from: d */
    public C64273c21 f143572d;

    /* renamed from: e */
    public int f143573e;

    /* renamed from: f */
    public int f143574f;

    /* renamed from: g */
    public String f143575g;

    /* renamed from: h */
    public int f143576h;

    /* renamed from: i */
    public C50859pp2 f143577i;

    /* renamed from: j */
    public LinkedList<FinderJumpInfo> f143578j = new LinkedList<>();

    /* renamed from: n */
    public C51433tr0 f143579n;

    /* renamed from: o */
    public C51576uo2 f143580o;

    /* renamed from: p */
    public String f143581p;

    /* renamed from: q */
    public long f143582q;

    /* renamed from: r */
    public FinderJumpInfo f143583r;

    /* renamed from: s */
    public LinkedList<Integer> f143584s = new LinkedList<>();

    /* renamed from: t */
    public int f143585t;

    /* renamed from: u */
    public LinkedList<C48654a21> f143586u = new LinkedList<>();

    /* renamed from: v */
    public FinderJumpInfo f143587v;

    /* renamed from: w */
    public C50714op2 f143588w;

    /* renamed from: x */
    public long f143589x;

    /* renamed from: y */
    public String f143590y;

    /* renamed from: z */
    public String f143591z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51713vn0)) {
            return false;
        }
        C51713vn0 vn02 = (C51713vn0) aVar;
        return C46238a.m51546a(this.BaseResponse, vn02.BaseResponse) && C46238a.m51546a(this.f143572d, vn02.f143572d) && C46238a.m51546a(Integer.valueOf(this.f143573e), Integer.valueOf(vn02.f143573e)) && C46238a.m51546a(Integer.valueOf(this.f143574f), Integer.valueOf(vn02.f143574f)) && C46238a.m51546a(this.f143575g, vn02.f143575g) && C46238a.m51546a(Integer.valueOf(this.f143576h), Integer.valueOf(vn02.f143576h)) && C46238a.m51546a(this.f143577i, vn02.f143577i) && C46238a.m51546a(this.f143578j, vn02.f143578j) && C46238a.m51546a(this.f143579n, vn02.f143579n) && C46238a.m51546a(this.f143580o, vn02.f143580o) && C46238a.m51546a(this.f143581p, vn02.f143581p) && C46238a.m51546a(Long.valueOf(this.f143582q), Long.valueOf(vn02.f143582q)) && C46238a.m51546a(this.f143583r, vn02.f143583r) && C46238a.m51546a(this.f143584s, vn02.f143584s) && C46238a.m51546a(Integer.valueOf(this.f143585t), Integer.valueOf(vn02.f143585t)) && C46238a.m51546a(this.f143586u, vn02.f143586u) && C46238a.m51546a(this.f143587v, vn02.f143587v) && C46238a.m51546a(this.f143588w, vn02.f143588w) && C46238a.m51546a(Long.valueOf(this.f143589x), Long.valueOf(vn02.f143589x)) && C46238a.m51546a(this.f143590y, vn02.f143590y) && C46238a.m51546a(this.f143591z, vn02.f143591z);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            C64273c21 c212 = this.f143572d;
            if (c212 != null) {
                aVar.mo74322i(2, c212.computeSize());
                this.f143572d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f143573e);
            aVar.mo74318e(4, this.f143574f);
            String str = this.f143575g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f143576h);
            C50859pp2 pp22 = this.f143577i;
            if (pp22 != null) {
                aVar.mo74322i(7, pp22.computeSize());
                this.f143577i.writeFields(aVar);
            }
            aVar.mo74320g(8, 8, this.f143578j);
            C51433tr0 tr02 = this.f143579n;
            if (tr02 != null) {
                aVar.mo74322i(9, tr02.computeSize());
                this.f143579n.writeFields(aVar);
            }
            C51576uo2 uo22 = this.f143580o;
            if (uo22 != null) {
                aVar.mo74322i(10, uo22.computeSize());
                this.f143580o.writeFields(aVar);
            }
            String str2 = this.f143581p;
            if (str2 != null) {
                aVar.mo74323j(11, str2);
            }
            aVar.mo74321h(12, this.f143582q);
            FinderJumpInfo finderJumpInfo = this.f143583r;
            if (finderJumpInfo != null) {
                aVar.mo74322i(13, finderJumpInfo.computeSize());
                this.f143583r.writeFields(aVar);
            }
            aVar.mo74320g(14, 2, this.f143584s);
            aVar.mo74318e(15, this.f143585t);
            aVar.mo74320g(17, 8, this.f143586u);
            FinderJumpInfo finderJumpInfo2 = this.f143587v;
            if (finderJumpInfo2 != null) {
                aVar.mo74322i(18, finderJumpInfo2.computeSize());
                this.f143587v.writeFields(aVar);
            }
            C50714op2 op22 = this.f143588w;
            if (op22 != null) {
                aVar.mo74322i(19, op22.computeSize());
                this.f143588w.writeFields(aVar);
            }
            aVar.mo74321h(20, this.f143589x);
            String str3 = this.f143590y;
            if (str3 != null) {
                aVar.mo74323j(21, str3);
            }
            String str4 = this.f143591z;
            if (str4 != null) {
                aVar.mo74323j(22, str4);
            }
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            C64273c21 c213 = this.f143572d;
            if (c213 != null) {
                i3 += C52418a.m58682i(2, c213.computeSize());
            }
            int e = i3 + C52418a.m58678e(3, this.f143573e) + C52418a.m58678e(4, this.f143574f);
            String str5 = this.f143575g;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            int e2 = e + C52418a.m58678e(6, this.f143576h);
            C50859pp2 pp23 = this.f143577i;
            if (pp23 != null) {
                e2 += C52418a.m58682i(7, pp23.computeSize());
            }
            int g = e2 + C52418a.m58680g(8, 8, this.f143578j);
            C51433tr0 tr03 = this.f143579n;
            if (tr03 != null) {
                g += C52418a.m58682i(9, tr03.computeSize());
            }
            C51576uo2 uo23 = this.f143580o;
            if (uo23 != null) {
                g += C52418a.m58682i(10, uo23.computeSize());
            }
            String str6 = this.f143581p;
            if (str6 != null) {
                g += C52418a.m58683j(11, str6);
            }
            int h = g + C52418a.m58681h(12, this.f143582q);
            FinderJumpInfo finderJumpInfo3 = this.f143583r;
            if (finderJumpInfo3 != null) {
                h += C52418a.m58682i(13, finderJumpInfo3.computeSize());
            }
            int g2 = h + C52418a.m58680g(14, 2, this.f143584s) + C52418a.m58678e(15, this.f143585t) + C52418a.m58680g(17, 8, this.f143586u);
            FinderJumpInfo finderJumpInfo4 = this.f143587v;
            if (finderJumpInfo4 != null) {
                g2 += C52418a.m58682i(18, finderJumpInfo4.computeSize());
            }
            C50714op2 op23 = this.f143588w;
            if (op23 != null) {
                g2 += C52418a.m58682i(19, op23.computeSize());
            }
            int h2 = g2 + C52418a.m58681h(20, this.f143589x);
            String str7 = this.f143590y;
            if (str7 != null) {
                h2 += C52418a.m58683j(21, str7);
            }
            String str8 = this.f143591z;
            return str8 != null ? h2 + C52418a.m58683j(22, str8) : h2;
        } else if (i2 == 2) {
            this.f143578j.clear();
            this.f143584s.clear();
            this.f143586u.clear();
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
            C51713vn0 vn02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        vn02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64273c21 c214 = new C64273c21();
                        if (bArr2 != null && bArr2.length > 0) {
                            c214.parseFrom(bArr2);
                        }
                        vn02.f143572d = c214;
                    }
                    return 0;
                case 3:
                    vn02.f143573e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    vn02.f143574f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    vn02.f143575g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    vn02.f143576h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C50859pp2 pp24 = new C50859pp2();
                        if (bArr3 != null && bArr3.length > 0) {
                            pp24.parseFrom(bArr3);
                        }
                        vn02.f143577i = pp24;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        FinderJumpInfo finderJumpInfo5 = new FinderJumpInfo();
                        if (bArr4 != null && bArr4.length > 0) {
                            finderJumpInfo5.parseFrom(bArr4);
                        }
                        vn02.f143578j.add(finderJumpInfo5);
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51433tr0 tr04 = new C51433tr0();
                        if (bArr5 != null && bArr5.length > 0) {
                            tr04.parseFrom(bArr5);
                        }
                        vn02.f143579n = tr04;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51576uo2 uo24 = new C51576uo2();
                        if (bArr6 != null && bArr6.length > 0) {
                            uo24.parseFrom(bArr6);
                        }
                        vn02.f143580o = uo24;
                    }
                    return 0;
                case 11:
                    vn02.f143581p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    vn02.f143582q = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        FinderJumpInfo finderJumpInfo6 = new FinderJumpInfo();
                        if (bArr7 != null && bArr7.length > 0) {
                            finderJumpInfo6.parseFrom(bArr7);
                        }
                        vn02.f143583r = finderJumpInfo6;
                    }
                    return 0;
                case 14:
                    vn02.f143584s.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 15:
                    vn02.f143585t = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C48654a21 a212 = new C48654a21();
                        if (bArr8 != null && bArr8.length > 0) {
                            a212.parseFrom(bArr8);
                        }
                        vn02.f143586u.add(a212);
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        FinderJumpInfo finderJumpInfo7 = new FinderJumpInfo();
                        if (bArr9 != null && bArr9.length > 0) {
                            finderJumpInfo7.parseFrom(bArr9);
                        }
                        vn02.f143587v = finderJumpInfo7;
                    }
                    return 0;
                case 19:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C50714op2 op24 = new C50714op2();
                        if (bArr10 != null && bArr10.length > 0) {
                            op24.parseFrom(bArr10);
                        }
                        vn02.f143588w = op24;
                    }
                    return 0;
                case 20:
                    vn02.f143589x = aVar3.mo141631i(intValue);
                    return 0;
                case 21:
                    vn02.f143590y = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    vn02.f143591z = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
