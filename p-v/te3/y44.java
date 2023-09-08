package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class y44 extends C49335eu3 {

    /* renamed from: d */
    public C64360f8 f354562d;

    /* renamed from: e */
    public int f354563e;

    /* renamed from: f */
    public C49244e8 f354564f;

    /* renamed from: g */
    public String f354565g;

    /* renamed from: h */
    public String f354566h;

    /* renamed from: i */
    public String f354567i;

    /* renamed from: j */
    public String f354568j;

    /* renamed from: n */
    public LinkedList<C49527g8> f354569n = new LinkedList<>();

    /* renamed from: o */
    public String f354570o;

    /* renamed from: p */
    public String f354571p;

    /* renamed from: q */
    public C64415h8 f354572q;

    /* renamed from: r */
    public LinkedList<C64415h8> f354573r = new LinkedList<>();

    /* renamed from: s */
    public String f354574s;

    /* renamed from: t */
    public wq4 f354575t;

    /* renamed from: u */
    public boolean f354576u;

    /* renamed from: v */
    public String f354577v;

    /* renamed from: w */
    public C49108d8 f354578w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof y44)) {
            return false;
        }
        y44 y44 = (y44) aVar;
        return C46238a.m51546a(this.BaseResponse, y44.BaseResponse) && C46238a.m51546a(this.f354562d, y44.f354562d) && C46238a.m51546a(Integer.valueOf(this.f354563e), Integer.valueOf(y44.f354563e)) && C46238a.m51546a(this.f354564f, y44.f354564f) && C46238a.m51546a(this.f354565g, y44.f354565g) && C46238a.m51546a(this.f354566h, y44.f354566h) && C46238a.m51546a(this.f354567i, y44.f354567i) && C46238a.m51546a(this.f354568j, y44.f354568j) && C46238a.m51546a(this.f354569n, y44.f354569n) && C46238a.m51546a(this.f354570o, y44.f354570o) && C46238a.m51546a(this.f354571p, y44.f354571p) && C46238a.m51546a(this.f354572q, y44.f354572q) && C46238a.m51546a(this.f354573r, y44.f354573r) && C46238a.m51546a(this.f354574s, y44.f354574s) && C46238a.m51546a(this.f354575t, y44.f354575t) && C46238a.m51546a(Boolean.valueOf(this.f354576u), Boolean.valueOf(y44.f354576u)) && C46238a.m51546a(this.f354577v, y44.f354577v) && C46238a.m51546a(this.f354578w, y44.f354578w);
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
                C64360f8 f8Var = this.f354562d;
                if (f8Var != null) {
                    aVar.mo74322i(2, f8Var.computeSize());
                    this.f354562d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f354563e);
                C49244e8 e8Var = this.f354564f;
                if (e8Var != null) {
                    aVar.mo74322i(4, e8Var.computeSize());
                    this.f354564f.writeFields(aVar);
                }
                String str = this.f354565g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                String str2 = this.f354566h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                String str3 = this.f354567i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f354568j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                aVar.mo74320g(9, 8, this.f354569n);
                String str5 = this.f354570o;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                String str6 = this.f354571p;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                C64415h8 h8Var = this.f354572q;
                if (h8Var != null) {
                    aVar.mo74322i(12, h8Var.computeSize());
                    this.f354572q.writeFields(aVar);
                }
                aVar.mo74320g(13, 8, this.f354573r);
                String str7 = this.f354574s;
                if (str7 != null) {
                    aVar.mo74323j(14, str7);
                }
                wq4 wq4 = this.f354575t;
                if (wq4 != null) {
                    aVar.mo74322i(15, wq4.computeSize());
                    this.f354575t.writeFields(aVar);
                }
                aVar.mo74314a(16, this.f354576u);
                String str8 = this.f354577v;
                if (str8 != null) {
                    aVar.mo74323j(17, str8);
                }
                C49108d8 d8Var = this.f354578w;
                if (d8Var != null) {
                    aVar.mo74322i(19, d8Var.computeSize());
                    this.f354578w.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            C64360f8 f8Var2 = this.f354562d;
            if (f8Var2 != null) {
                i3 += C52418a.m58682i(2, f8Var2.computeSize());
            }
            int e = i3 + C52418a.m58678e(3, this.f354563e);
            C49244e8 e8Var2 = this.f354564f;
            if (e8Var2 != null) {
                e += C52418a.m58682i(4, e8Var2.computeSize());
            }
            String str9 = this.f354565g;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f354566h;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            String str11 = this.f354567i;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            String str12 = this.f354568j;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            int g = e + C52418a.m58680g(9, 8, this.f354569n);
            String str13 = this.f354570o;
            if (str13 != null) {
                g += C52418a.m58683j(10, str13);
            }
            String str14 = this.f354571p;
            if (str14 != null) {
                g += C52418a.m58683j(11, str14);
            }
            C64415h8 h8Var2 = this.f354572q;
            if (h8Var2 != null) {
                g += C52418a.m58682i(12, h8Var2.computeSize());
            }
            int g2 = g + C52418a.m58680g(13, 8, this.f354573r);
            String str15 = this.f354574s;
            if (str15 != null) {
                g2 += C52418a.m58683j(14, str15);
            }
            wq4 wq42 = this.f354575t;
            if (wq42 != null) {
                g2 += C52418a.m58682i(15, wq42.computeSize());
            }
            int a = g2 + C52418a.m58674a(16, this.f354576u);
            String str16 = this.f354577v;
            if (str16 != null) {
                a += C52418a.m58683j(17, str16);
            }
            C49108d8 d8Var2 = this.f354578w;
            return d8Var2 != null ? a + C52418a.m58682i(19, d8Var2.computeSize()) : a;
        } else if (i2 == 2) {
            this.f354569n.clear();
            this.f354573r.clear();
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
            y44 y44 = objArr[1];
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
                        y44.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64360f8 f8Var3 = new C64360f8();
                        if (bArr2 != null && bArr2.length > 0) {
                            f8Var3.parseFrom(bArr2);
                        }
                        y44.f354562d = f8Var3;
                    }
                    return 0;
                case 3:
                    y44.f354563e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49244e8 e8Var3 = new C49244e8();
                        if (bArr3 != null && bArr3.length > 0) {
                            e8Var3.parseFrom(bArr3);
                        }
                        y44.f354564f = e8Var3;
                    }
                    return 0;
                case 5:
                    y44.f354565g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    y44.f354566h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    y44.f354567i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    y44.f354568j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C49527g8 g8Var = new C49527g8();
                        if (bArr4 != null && bArr4.length > 0) {
                            g8Var.parseFrom(bArr4);
                        }
                        y44.f354569n.add(g8Var);
                    }
                    return 0;
                case 10:
                    y44.f354570o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    y44.f354571p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C64415h8 h8Var3 = new C64415h8();
                        if (bArr5 != null && bArr5.length > 0) {
                            h8Var3.parseFrom(bArr5);
                        }
                        y44.f354572q = h8Var3;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C64415h8 h8Var4 = new C64415h8();
                        if (bArr6 != null && bArr6.length > 0) {
                            h8Var4.parseFrom(bArr6);
                        }
                        y44.f354573r.add(h8Var4);
                    }
                    return 0;
                case 14:
                    y44.f354574s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        wq4 wq43 = new wq4();
                        if (bArr7 != null && bArr7.length > 0) {
                            wq43.parseFrom(bArr7);
                        }
                        y44.f354575t = wq43;
                    }
                    return 0;
                case 16:
                    y44.f354576u = aVar3.mo141625c(intValue);
                    return 0;
                case 17:
                    y44.f354577v = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C49108d8 d8Var3 = new C49108d8();
                        if (bArr8 != null && bArr8.length > 0) {
                            d8Var3.parseFrom(bArr8);
                        }
                        y44.f354578w = d8Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
