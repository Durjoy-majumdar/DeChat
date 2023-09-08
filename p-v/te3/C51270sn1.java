package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sn1 */
public class C51270sn1 extends C47465a {

    /* renamed from: A */
    public C51130rn1 f141614A;

    /* renamed from: B */
    public C51529ud1 f141615B;

    /* renamed from: C */
    public C49591gp1 f141616C;

    /* renamed from: d */
    public String f141617d;

    /* renamed from: e */
    public long f141618e;

    /* renamed from: f */
    public int f141619f;

    /* renamed from: g */
    public String f141620g;

    /* renamed from: h */
    public int f141621h;

    /* renamed from: i */
    public int f141622i;

    /* renamed from: j */
    public String f141623j;

    /* renamed from: n */
    public int f141624n;

    /* renamed from: o */
    public int f141625o;

    /* renamed from: p */
    public int f141626p;

    /* renamed from: q */
    public C64726td1 f141627q;

    /* renamed from: r */
    public int f141628r;

    /* renamed from: s */
    public C50985qn1 f141629s;

    /* renamed from: t */
    public int f141630t;

    /* renamed from: u */
    public C50013jn1 f141631u;

    /* renamed from: v */
    public int f141632v;

    /* renamed from: w */
    public C52271zj0 f141633w;

    /* renamed from: x */
    public int f141634x;

    /* renamed from: y */
    public String f141635y;

    /* renamed from: z */
    public C51959xd1 f141636z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51270sn1)) {
            return false;
        }
        C51270sn1 sn12 = (C51270sn1) aVar;
        return C46238a.m51546a(this.f141617d, sn12.f141617d) && C46238a.m51546a(Long.valueOf(this.f141618e), Long.valueOf(sn12.f141618e)) && C46238a.m51546a(Integer.valueOf(this.f141619f), Integer.valueOf(sn12.f141619f)) && C46238a.m51546a(this.f141620g, sn12.f141620g) && C46238a.m51546a(Integer.valueOf(this.f141621h), Integer.valueOf(sn12.f141621h)) && C46238a.m51546a(Integer.valueOf(this.f141622i), Integer.valueOf(sn12.f141622i)) && C46238a.m51546a(this.f141623j, sn12.f141623j) && C46238a.m51546a(Integer.valueOf(this.f141624n), Integer.valueOf(sn12.f141624n)) && C46238a.m51546a(Integer.valueOf(this.f141625o), Integer.valueOf(sn12.f141625o)) && C46238a.m51546a(Integer.valueOf(this.f141626p), Integer.valueOf(sn12.f141626p)) && C46238a.m51546a(this.f141627q, sn12.f141627q) && C46238a.m51546a(Integer.valueOf(this.f141628r), Integer.valueOf(sn12.f141628r)) && C46238a.m51546a(this.f141629s, sn12.f141629s) && C46238a.m51546a(Integer.valueOf(this.f141630t), Integer.valueOf(sn12.f141630t)) && C46238a.m51546a(this.f141631u, sn12.f141631u) && C46238a.m51546a(Integer.valueOf(this.f141632v), Integer.valueOf(sn12.f141632v)) && C46238a.m51546a(this.f141633w, sn12.f141633w) && C46238a.m51546a(Integer.valueOf(this.f141634x), Integer.valueOf(sn12.f141634x)) && C46238a.m51546a(this.f141635y, sn12.f141635y) && C46238a.m51546a(this.f141636z, sn12.f141636z) && C46238a.m51546a(this.f141614A, sn12.f141614A) && C46238a.m51546a(this.f141615B, sn12.f141615B) && C46238a.m51546a(this.f141616C, sn12.f141616C);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141617d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f141618e);
            aVar.mo74318e(3, this.f141619f);
            String str2 = this.f141620g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f141621h);
            aVar.mo74318e(6, this.f141622i);
            String str3 = this.f141623j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f141624n);
            aVar.mo74318e(9, this.f141625o);
            aVar.mo74318e(10, this.f141626p);
            C64726td1 td12 = this.f141627q;
            if (td12 != null) {
                aVar.mo74322i(11, td12.computeSize());
                this.f141627q.writeFields(aVar);
            }
            aVar.mo74318e(12, this.f141628r);
            C50985qn1 qn12 = this.f141629s;
            if (qn12 != null) {
                aVar.mo74322i(13, qn12.computeSize());
                this.f141629s.writeFields(aVar);
            }
            aVar.mo74318e(14, this.f141630t);
            C50013jn1 jn12 = this.f141631u;
            if (jn12 != null) {
                aVar.mo74322i(15, jn12.computeSize());
                this.f141631u.writeFields(aVar);
            }
            aVar.mo74318e(16, this.f141632v);
            C52271zj0 zj02 = this.f141633w;
            if (zj02 != null) {
                aVar.mo74322i(17, zj02.computeSize());
                this.f141633w.writeFields(aVar);
            }
            aVar.mo74318e(18, this.f141634x);
            String str4 = this.f141635y;
            if (str4 != null) {
                aVar.mo74323j(19, str4);
            }
            C51959xd1 xd12 = this.f141636z;
            if (xd12 != null) {
                aVar.mo74322i(20, xd12.computeSize());
                this.f141636z.writeFields(aVar);
            }
            C51130rn1 rn12 = this.f141614A;
            if (rn12 != null) {
                aVar.mo74322i(21, rn12.computeSize());
                this.f141614A.writeFields(aVar);
            }
            C51529ud1 ud12 = this.f141615B;
            if (ud12 != null) {
                aVar.mo74322i(22, ud12.computeSize());
                this.f141615B.writeFields(aVar);
            }
            C49591gp1 gp12 = this.f141616C;
            if (gp12 != null) {
                aVar.mo74322i(23, gp12.computeSize());
                this.f141616C.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            String str5 = this.f141617d;
            if (str5 != null) {
                i3 = C52418a.m58683j(1, str5) + 0;
            }
            int h = i3 + C52418a.m58681h(2, this.f141618e) + C52418a.m58678e(3, this.f141619f);
            String str6 = this.f141620g;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            int e = h + C52418a.m58678e(5, this.f141621h) + C52418a.m58678e(6, this.f141622i);
            String str7 = this.f141623j;
            if (str7 != null) {
                e += C52418a.m58683j(7, str7);
            }
            int e2 = e + C52418a.m58678e(8, this.f141624n) + C52418a.m58678e(9, this.f141625o) + C52418a.m58678e(10, this.f141626p);
            C64726td1 td13 = this.f141627q;
            if (td13 != null) {
                e2 += C52418a.m58682i(11, td13.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(12, this.f141628r);
            C50985qn1 qn13 = this.f141629s;
            if (qn13 != null) {
                e3 += C52418a.m58682i(13, qn13.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(14, this.f141630t);
            C50013jn1 jn13 = this.f141631u;
            if (jn13 != null) {
                e4 += C52418a.m58682i(15, jn13.computeSize());
            }
            int e5 = e4 + C52418a.m58678e(16, this.f141632v);
            C52271zj0 zj03 = this.f141633w;
            if (zj03 != null) {
                e5 += C52418a.m58682i(17, zj03.computeSize());
            }
            int e6 = e5 + C52418a.m58678e(18, this.f141634x);
            String str8 = this.f141635y;
            if (str8 != null) {
                e6 += C52418a.m58683j(19, str8);
            }
            C51959xd1 xd13 = this.f141636z;
            if (xd13 != null) {
                e6 += C52418a.m58682i(20, xd13.computeSize());
            }
            C51130rn1 rn13 = this.f141614A;
            if (rn13 != null) {
                e6 += C52418a.m58682i(21, rn13.computeSize());
            }
            C51529ud1 ud13 = this.f141615B;
            if (ud13 != null) {
                e6 += C52418a.m58682i(22, ud13.computeSize());
            }
            C49591gp1 gp13 = this.f141616C;
            return gp13 != null ? e6 + C52418a.m58682i(23, gp13.computeSize()) : e6;
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
            C51270sn1 sn12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    sn12.f141617d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    sn12.f141618e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    sn12.f141619f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    sn12.f141620g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sn12.f141621h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    sn12.f141622i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    sn12.f141623j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    sn12.f141624n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    sn12.f141625o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    sn12.f141626p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C64726td1 td14 = new C64726td1();
                        if (bArr != null && bArr.length > 0) {
                            td14.parseFrom(bArr);
                        }
                        sn12.f141627q = td14;
                    }
                    return 0;
                case 12:
                    sn12.f141628r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C50985qn1 qn14 = new C50985qn1();
                        if (bArr2 != null && bArr2.length > 0) {
                            qn14.parseFrom(bArr2);
                        }
                        sn12.f141629s = qn14;
                    }
                    return 0;
                case 14:
                    sn12.f141630t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C50013jn1 jn14 = new C50013jn1();
                        if (bArr3 != null && bArr3.length > 0) {
                            jn14.parseFrom(bArr3);
                        }
                        sn12.f141631u = jn14;
                    }
                    return 0;
                case 16:
                    sn12.f141632v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C52271zj0 zj04 = new C52271zj0();
                        if (bArr4 != null && bArr4.length > 0) {
                            zj04.parseFrom(bArr4);
                        }
                        sn12.f141633w = zj04;
                    }
                    return 0;
                case 18:
                    sn12.f141634x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    sn12.f141635y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51959xd1 xd14 = new C51959xd1();
                        if (bArr5 != null && bArr5.length > 0) {
                            xd14.parseFrom(bArr5);
                        }
                        sn12.f141636z = xd14;
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51130rn1 rn14 = new C51130rn1();
                        if (bArr6 != null && bArr6.length > 0) {
                            rn14.parseFrom(bArr6);
                        }
                        sn12.f141614A = rn14;
                    }
                    return 0;
                case 22:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51529ud1 ud14 = new C51529ud1();
                        if (bArr7 != null && bArr7.length > 0) {
                            ud14.parseFrom(bArr7);
                        }
                        sn12.f141615B = ud14;
                    }
                    return 0;
                case 23:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C49591gp1 gp14 = new C49591gp1();
                        if (bArr8 != null && bArr8.length > 0) {
                            gp14.parseFrom(bArr8);
                        }
                        sn12.f141616C = gp14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
