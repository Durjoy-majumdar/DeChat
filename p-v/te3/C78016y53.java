package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y53 */
public class C78016y53 extends C49335eu3 {

    /* renamed from: A */
    public LinkedList<C51892wy> f228548A = new LinkedList<>();

    /* renamed from: B */
    public C52159yr2 f228549B;

    /* renamed from: C */
    public String f228550C;

    /* renamed from: d */
    public int f228551d;

    /* renamed from: e */
    public String f228552e;

    /* renamed from: f */
    public int f228553f;

    /* renamed from: g */
    public int f228554g;

    /* renamed from: h */
    public int f228555h;

    /* renamed from: i */
    public LinkedList<C64514l50> f228556i = new LinkedList<>();

    /* renamed from: j */
    public C78015xr2 f228557j;

    /* renamed from: n */
    public LinkedList<C64862yp3> f228558n = new LinkedList<>();

    /* renamed from: o */
    public LinkedList<C64705s9> f228559o = new LinkedList<>();

    /* renamed from: p */
    public boolean f228560p;

    /* renamed from: q */
    public C77986qf3 f228561q;

    /* renamed from: r */
    public String f228562r;

    /* renamed from: s */
    public C64578nc0 f228563s;

    /* renamed from: t */
    public int f228564t;

    /* renamed from: u */
    public String f228565u;

    /* renamed from: v */
    public C77977pf3 f228566v;

    /* renamed from: w */
    public C77977pf3 f228567w;

    /* renamed from: x */
    public String f228568x;

    /* renamed from: y */
    public C51892wy f228569y;

    /* renamed from: z */
    public C77977pf3 f228570z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78016y53)) {
            return false;
        }
        C78016y53 y532 = (C78016y53) aVar;
        return C46238a.m51546a(this.BaseResponse, y532.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228551d), Integer.valueOf(y532.f228551d)) && C46238a.m51546a(this.f228552e, y532.f228552e) && C46238a.m51546a(Integer.valueOf(this.f228553f), Integer.valueOf(y532.f228553f)) && C46238a.m51546a(Integer.valueOf(this.f228554g), Integer.valueOf(y532.f228554g)) && C46238a.m51546a(Integer.valueOf(this.f228555h), Integer.valueOf(y532.f228555h)) && C46238a.m51546a(this.f228556i, y532.f228556i) && C46238a.m51546a(this.f228557j, y532.f228557j) && C46238a.m51546a(this.f228558n, y532.f228558n) && C46238a.m51546a(this.f228559o, y532.f228559o) && C46238a.m51546a(Boolean.valueOf(this.f228560p), Boolean.valueOf(y532.f228560p)) && C46238a.m51546a(this.f228561q, y532.f228561q) && C46238a.m51546a(this.f228562r, y532.f228562r) && C46238a.m51546a(this.f228563s, y532.f228563s) && C46238a.m51546a(Integer.valueOf(this.f228564t), Integer.valueOf(y532.f228564t)) && C46238a.m51546a(this.f228565u, y532.f228565u) && C46238a.m51546a(this.f228566v, y532.f228566v) && C46238a.m51546a(this.f228567w, y532.f228567w) && C46238a.m51546a(this.f228568x, y532.f228568x) && C46238a.m51546a(this.f228569y, y532.f228569y) && C46238a.m51546a(this.f228570z, y532.f228570z) && C46238a.m51546a(this.f228548A, y532.f228548A) && C46238a.m51546a(this.f228549B, y532.f228549B) && C46238a.m51546a(this.f228550C, y532.f228550C);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f228551d);
                String str = this.f228552e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f228553f);
                aVar.mo74318e(5, this.f228554g);
                aVar.mo74318e(6, this.f228555h);
                aVar.mo74320g(8, 8, this.f228556i);
                C78015xr2 xr22 = this.f228557j;
                if (xr22 != null) {
                    aVar.mo74322i(9, xr22.computeSize());
                    this.f228557j.writeFields(aVar);
                }
                aVar.mo74320g(10, 8, this.f228558n);
                aVar.mo74320g(11, 8, this.f228559o);
                aVar.mo74314a(12, this.f228560p);
                C77986qf3 qf32 = this.f228561q;
                if (qf32 != null) {
                    aVar.mo74322i(13, qf32.computeSize());
                    this.f228561q.writeFields(aVar);
                }
                String str2 = this.f228562r;
                if (str2 != null) {
                    aVar.mo74323j(14, str2);
                }
                C64578nc0 nc02 = this.f228563s;
                if (nc02 != null) {
                    aVar.mo74322i(15, nc02.computeSize());
                    this.f228563s.writeFields(aVar);
                }
                aVar.mo74318e(16, this.f228564t);
                String str3 = this.f228565u;
                if (str3 != null) {
                    aVar.mo74323j(17, str3);
                }
                C77977pf3 pf32 = this.f228566v;
                if (pf32 != null) {
                    aVar.mo74322i(18, pf32.computeSize());
                    this.f228566v.writeFields(aVar);
                }
                C77977pf3 pf33 = this.f228567w;
                if (pf33 != null) {
                    aVar.mo74322i(19, pf33.computeSize());
                    this.f228567w.writeFields(aVar);
                }
                String str4 = this.f228568x;
                if (str4 != null) {
                    aVar.mo74323j(20, str4);
                }
                C51892wy wyVar = this.f228569y;
                if (wyVar != null) {
                    aVar.mo74322i(21, wyVar.computeSize());
                    this.f228569y.writeFields(aVar);
                }
                C77977pf3 pf34 = this.f228570z;
                if (pf34 != null) {
                    aVar.mo74322i(22, pf34.computeSize());
                    this.f228570z.writeFields(aVar);
                }
                aVar.mo74320g(23, 8, this.f228548A);
                C52159yr2 yr22 = this.f228549B;
                if (yr22 != null) {
                    aVar.mo74322i(99, yr22.computeSize());
                    this.f228549B.writeFields(aVar);
                }
                String str5 = this.f228550C;
                if (str5 != null) {
                    aVar.mo74323j(100, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f228551d);
            String str6 = this.f228552e;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            int e2 = e + C52418a.m58678e(4, this.f228553f) + C52418a.m58678e(5, this.f228554g) + C52418a.m58678e(6, this.f228555h) + C52418a.m58680g(8, 8, this.f228556i);
            C78015xr2 xr23 = this.f228557j;
            if (xr23 != null) {
                e2 += C52418a.m58682i(9, xr23.computeSize());
            }
            int g = e2 + C52418a.m58680g(10, 8, this.f228558n) + C52418a.m58680g(11, 8, this.f228559o) + C52418a.m58674a(12, this.f228560p);
            C77986qf3 qf33 = this.f228561q;
            if (qf33 != null) {
                g += C52418a.m58682i(13, qf33.computeSize());
            }
            String str7 = this.f228562r;
            if (str7 != null) {
                g += C52418a.m58683j(14, str7);
            }
            C64578nc0 nc03 = this.f228563s;
            if (nc03 != null) {
                g += C52418a.m58682i(15, nc03.computeSize());
            }
            int e3 = g + C52418a.m58678e(16, this.f228564t);
            String str8 = this.f228565u;
            if (str8 != null) {
                e3 += C52418a.m58683j(17, str8);
            }
            C77977pf3 pf35 = this.f228566v;
            if (pf35 != null) {
                e3 += C52418a.m58682i(18, pf35.computeSize());
            }
            C77977pf3 pf36 = this.f228567w;
            if (pf36 != null) {
                e3 += C52418a.m58682i(19, pf36.computeSize());
            }
            String str9 = this.f228568x;
            if (str9 != null) {
                e3 += C52418a.m58683j(20, str9);
            }
            C51892wy wyVar2 = this.f228569y;
            if (wyVar2 != null) {
                e3 += C52418a.m58682i(21, wyVar2.computeSize());
            }
            C77977pf3 pf37 = this.f228570z;
            if (pf37 != null) {
                e3 += C52418a.m58682i(22, pf37.computeSize());
            }
            int g2 = e3 + C52418a.m58680g(23, 8, this.f228548A);
            C52159yr2 yr23 = this.f228549B;
            if (yr23 != null) {
                g2 += C52418a.m58682i(99, yr23.computeSize());
            }
            String str10 = this.f228550C;
            return str10 != null ? g2 + C52418a.m58683j(100, str10) : g2;
        } else if (i2 == 2) {
            this.f228556i.clear();
            this.f228558n.clear();
            this.f228559o.clear();
            this.f228548A.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C78016y53 y532 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 99) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i4 = 0; i4 < size; i4++) {
                    byte[] bArr = j.get(i4);
                    C52159yr2 yr24 = new C52159yr2();
                    if (bArr != null && bArr.length > 0) {
                        yr24.parseFrom(bArr);
                    }
                    y532.f228549B = yr24;
                }
                return 0;
            } else if (intValue != 100) {
                switch (intValue) {
                    case 1:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C49966ja jaVar3 = new C49966ja();
                            if (bArr2 != null && bArr2.length > 0) {
                                jaVar3.parseFrom(bArr2);
                            }
                            y532.BaseResponse = jaVar3;
                        }
                        return 0;
                    case 2:
                        y532.f228551d = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        y532.f228552e = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        y532.f228553f = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        y532.f228554g = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        y532.f228555h = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        switch (intValue) {
                            case 8:
                                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                                int size3 = j3.size();
                                for (int i6 = 0; i6 < size3; i6++) {
                                    byte[] bArr3 = j3.get(i6);
                                    C64514l50 l502 = new C64514l50();
                                    if (bArr3 != null && bArr3.length > 0) {
                                        l502.parseFrom(bArr3);
                                    }
                                    y532.f228556i.add(l502);
                                }
                                return 0;
                            case 9:
                                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                                int size4 = j4.size();
                                for (int i7 = 0; i7 < size4; i7++) {
                                    byte[] bArr4 = j4.get(i7);
                                    C78015xr2 xr24 = new C78015xr2();
                                    if (bArr4 != null && bArr4.length > 0) {
                                        xr24.parseFrom(bArr4);
                                    }
                                    y532.f228557j = xr24;
                                }
                                return 0;
                            case 10:
                                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                                int size5 = j5.size();
                                for (int i8 = 0; i8 < size5; i8++) {
                                    byte[] bArr5 = j5.get(i8);
                                    C64862yp3 yp32 = new C64862yp3();
                                    if (bArr5 != null && bArr5.length > 0) {
                                        yp32.parseFrom(bArr5);
                                    }
                                    y532.f228558n.add(yp32);
                                }
                                return 0;
                            case 11:
                                LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                                int size6 = j6.size();
                                for (int i9 = 0; i9 < size6; i9++) {
                                    byte[] bArr6 = j6.get(i9);
                                    C64705s9 s9Var = new C64705s9();
                                    if (bArr6 != null && bArr6.length > 0) {
                                        s9Var.parseFrom(bArr6);
                                    }
                                    y532.f228559o.add(s9Var);
                                }
                                return 0;
                            case 12:
                                y532.f228560p = aVar3.mo141625c(intValue);
                                return 0;
                            case 13:
                                LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                                int size7 = j7.size();
                                for (int i15 = 0; i15 < size7; i15++) {
                                    byte[] bArr7 = j7.get(i15);
                                    C77986qf3 qf34 = new C77986qf3();
                                    if (bArr7 != null && bArr7.length > 0) {
                                        qf34.parseFrom(bArr7);
                                    }
                                    y532.f228561q = qf34;
                                }
                                return 0;
                            case 14:
                                y532.f228562r = aVar3.mo141633k(intValue);
                                return 0;
                            case 15:
                                LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                                int size8 = j8.size();
                                for (int i16 = 0; i16 < size8; i16++) {
                                    byte[] bArr8 = j8.get(i16);
                                    C64578nc0 nc04 = new C64578nc0();
                                    if (bArr8 != null && bArr8.length > 0) {
                                        nc04.parseFrom(bArr8);
                                    }
                                    y532.f228563s = nc04;
                                }
                                return 0;
                            case 16:
                                y532.f228564t = aVar3.mo141629g(intValue);
                                return 0;
                            case 17:
                                y532.f228565u = aVar3.mo141633k(intValue);
                                return 0;
                            case 18:
                                LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                                int size9 = j9.size();
                                for (int i17 = 0; i17 < size9; i17++) {
                                    byte[] bArr9 = j9.get(i17);
                                    C77977pf3 pf38 = new C77977pf3();
                                    if (bArr9 != null && bArr9.length > 0) {
                                        pf38.parseFrom(bArr9);
                                    }
                                    y532.f228566v = pf38;
                                }
                                return 0;
                            case 19:
                                LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                                int size10 = j15.size();
                                for (int i18 = 0; i18 < size10; i18++) {
                                    byte[] bArr10 = j15.get(i18);
                                    C77977pf3 pf39 = new C77977pf3();
                                    if (bArr10 != null && bArr10.length > 0) {
                                        pf39.parseFrom(bArr10);
                                    }
                                    y532.f228567w = pf39;
                                }
                                return 0;
                            case 20:
                                y532.f228568x = aVar3.mo141633k(intValue);
                                return 0;
                            case 21:
                                LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                                int size11 = j16.size();
                                for (int i19 = 0; i19 < size11; i19++) {
                                    byte[] bArr11 = j16.get(i19);
                                    C51892wy wyVar3 = new C51892wy();
                                    if (bArr11 != null && bArr11.length > 0) {
                                        wyVar3.parseFrom(bArr11);
                                    }
                                    y532.f228569y = wyVar3;
                                }
                                return 0;
                            case 22:
                                LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                                int size12 = j17.size();
                                for (int i25 = 0; i25 < size12; i25++) {
                                    byte[] bArr12 = j17.get(i25);
                                    C77977pf3 pf310 = new C77977pf3();
                                    if (bArr12 != null && bArr12.length > 0) {
                                        pf310.parseFrom(bArr12);
                                    }
                                    y532.f228570z = pf310;
                                }
                                return 0;
                            case 23:
                                LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                                int size13 = j18.size();
                                for (int i26 = 0; i26 < size13; i26++) {
                                    byte[] bArr13 = j18.get(i26);
                                    C51892wy wyVar4 = new C51892wy();
                                    if (bArr13 != null && bArr13.length > 0) {
                                        wyVar4.parseFrom(bArr13);
                                    }
                                    y532.f228548A.add(wyVar4);
                                }
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                y532.f228550C = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
