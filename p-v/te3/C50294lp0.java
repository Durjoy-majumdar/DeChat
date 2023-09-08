package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lp0 */
public class C50294lp0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f137560d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f137561e;

    /* renamed from: f */
    public int f137562f;

    /* renamed from: g */
    public C89349b f137563g;

    /* renamed from: h */
    public C51974xh1 f137564h;

    /* renamed from: i */
    public String f137565i;

    /* renamed from: j */
    public LinkedList<C64629pl1> f137566j = new LinkedList<>();

    /* renamed from: n */
    public LinkedList<C49165dm1> f137567n = new LinkedList<>();

    /* renamed from: o */
    public C50497n51 f137568o;

    /* renamed from: p */
    public C51412tl1 f137569p;

    /* renamed from: q */
    public C49556gg0 f137570q;

    /* renamed from: r */
    public String f137571r;

    /* renamed from: s */
    public C51563ul1 f137572s;

    /* renamed from: t */
    public C52079y72 f137573t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50294lp0)) {
            return false;
        }
        C50294lp0 lp02 = (C50294lp0) aVar;
        return C46238a.m51546a(this.BaseResponse, lp02.BaseResponse) && C46238a.m51546a(this.f137560d, lp02.f137560d) && C46238a.m51546a(this.f137561e, lp02.f137561e) && C46238a.m51546a(Integer.valueOf(this.f137562f), Integer.valueOf(lp02.f137562f)) && C46238a.m51546a(this.f137563g, lp02.f137563g) && C46238a.m51546a(this.f137564h, lp02.f137564h) && C46238a.m51546a(this.f137565i, lp02.f137565i) && C46238a.m51546a(this.f137566j, lp02.f137566j) && C46238a.m51546a(this.f137567n, lp02.f137567n) && C46238a.m51546a(this.f137568o, lp02.f137568o) && C46238a.m51546a(this.f137569p, lp02.f137569p) && C46238a.m51546a(this.f137570q, lp02.f137570q) && C46238a.m51546a(this.f137571r, lp02.f137571r) && C46238a.m51546a(this.f137572s, lp02.f137572s) && C46238a.m51546a(this.f137573t, lp02.f137573t);
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
            aVar.mo74320g(2, 8, this.f137560d);
            C89349b bVar = this.f137561e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f137562f);
            C89349b bVar2 = this.f137563g;
            if (bVar2 != null) {
                aVar.mo74315b(5, bVar2);
            }
            C51974xh1 xh12 = this.f137564h;
            if (xh12 != null) {
                aVar.mo74322i(6, xh12.computeSize());
                this.f137564h.writeFields(aVar);
            }
            String str = this.f137565i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74320g(8, 8, this.f137566j);
            aVar.mo74320g(9, 8, this.f137567n);
            C50497n51 n512 = this.f137568o;
            if (n512 != null) {
                aVar.mo74322i(10, n512.computeSize());
                this.f137568o.writeFields(aVar);
            }
            C51412tl1 tl12 = this.f137569p;
            if (tl12 != null) {
                aVar.mo74322i(11, tl12.computeSize());
                this.f137569p.writeFields(aVar);
            }
            C49556gg0 gg02 = this.f137570q;
            if (gg02 != null) {
                aVar.mo74322i(12, gg02.computeSize());
                this.f137570q.writeFields(aVar);
            }
            String str2 = this.f137571r;
            if (str2 != null) {
                aVar.mo74323j(13, str2);
            }
            C51563ul1 ul12 = this.f137572s;
            if (ul12 != null) {
                aVar.mo74322i(14, ul12.computeSize());
                this.f137572s.writeFields(aVar);
            }
            C52079y72 y722 = this.f137573t;
            if (y722 != null) {
                aVar.mo74322i(15, y722.computeSize());
                this.f137573t.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f137560d);
            C89349b bVar3 = this.f137561e;
            if (bVar3 != null) {
                g += C52418a.m58675b(3, bVar3);
            }
            int e = g + C52418a.m58678e(4, this.f137562f);
            C89349b bVar4 = this.f137563g;
            if (bVar4 != null) {
                e += C52418a.m58675b(5, bVar4);
            }
            C51974xh1 xh13 = this.f137564h;
            if (xh13 != null) {
                e += C52418a.m58682i(6, xh13.computeSize());
            }
            String str3 = this.f137565i;
            if (str3 != null) {
                e += C52418a.m58683j(7, str3);
            }
            int g2 = e + C52418a.m58680g(8, 8, this.f137566j) + C52418a.m58680g(9, 8, this.f137567n);
            C50497n51 n513 = this.f137568o;
            if (n513 != null) {
                g2 += C52418a.m58682i(10, n513.computeSize());
            }
            C51412tl1 tl13 = this.f137569p;
            if (tl13 != null) {
                g2 += C52418a.m58682i(11, tl13.computeSize());
            }
            C49556gg0 gg03 = this.f137570q;
            if (gg03 != null) {
                g2 += C52418a.m58682i(12, gg03.computeSize());
            }
            String str4 = this.f137571r;
            if (str4 != null) {
                g2 += C52418a.m58683j(13, str4);
            }
            C51563ul1 ul13 = this.f137572s;
            if (ul13 != null) {
                g2 += C52418a.m58682i(14, ul13.computeSize());
            }
            C52079y72 y723 = this.f137573t;
            return y723 != null ? g2 + C52418a.m58682i(15, y723.computeSize()) : g2;
        } else if (i2 == 2) {
            this.f137560d.clear();
            this.f137566j.clear();
            this.f137567n.clear();
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
            C50294lp0 lp02 = objArr[1];
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
                        lp02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        FinderObject finderObject = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject.parseFrom(bArr2);
                        }
                        lp02.f137560d.add(finderObject);
                    }
                    return 0;
                case 3:
                    lp02.f137561e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    lp02.f137562f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    lp02.f137563g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51974xh1 xh14 = new C51974xh1();
                        if (bArr3 != null && bArr3.length > 0) {
                            xh14.parseFrom(bArr3);
                        }
                        lp02.f137564h = xh14;
                    }
                    return 0;
                case 7:
                    lp02.f137565i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64629pl1 pl12 = new C64629pl1();
                        if (bArr4 != null && bArr4.length > 0) {
                            pl12.parseFrom(bArr4);
                        }
                        lp02.f137566j.add(pl12);
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49165dm1 dm12 = new C49165dm1();
                        if (bArr5 != null && bArr5.length > 0) {
                            dm12.parseFrom(bArr5);
                        }
                        lp02.f137567n.add(dm12);
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C50497n51 n514 = new C50497n51();
                        if (bArr6 != null && bArr6.length > 0) {
                            n514.parseFrom(bArr6);
                        }
                        lp02.f137568o = n514;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51412tl1 tl14 = new C51412tl1();
                        if (bArr7 != null && bArr7.length > 0) {
                            tl14.parseFrom(bArr7);
                        }
                        lp02.f137569p = tl14;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C49556gg0 gg04 = new C49556gg0();
                        if (bArr8 != null && bArr8.length > 0) {
                            gg04.parseFrom(bArr8);
                        }
                        lp02.f137570q = gg04;
                    }
                    return 0;
                case 13:
                    lp02.f137571r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C51563ul1 ul14 = new C51563ul1();
                        if (bArr9 != null && bArr9.length > 0) {
                            ul14.parseFrom(bArr9);
                        }
                        lp02.f137572s = ul14;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C52079y72 y724 = new C52079y72();
                        if (bArr10 != null && bArr10.length > 0) {
                            y724.parseFrom(bArr10);
                        }
                        lp02.f137573t = y724;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
