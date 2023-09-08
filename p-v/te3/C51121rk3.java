package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rk3 */
public class C51121rk3 extends C49335eu3 {

    /* renamed from: d */
    public int f140976d;

    /* renamed from: e */
    public String f140977e;

    /* renamed from: f */
    public C50957qg2 f140978f;

    /* renamed from: g */
    public LinkedList<C51222sb3> f140979g = new LinkedList<>();

    /* renamed from: h */
    public long f140980h;

    /* renamed from: i */
    public long f140981i;

    /* renamed from: j */
    public C51879wu3 f140982j;

    /* renamed from: n */
    public C52131yl f140983n;

    /* renamed from: o */
    public eh4 f140984o;

    /* renamed from: p */
    public C50062k03 f140985p;

    /* renamed from: q */
    public C77933g43 f140986q;

    /* renamed from: r */
    public String f140987r;

    /* renamed from: s */
    public String f140988s;

    /* renamed from: t */
    public String f140989t;

    /* renamed from: u */
    public C51469tz2 f140990u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51121rk3)) {
            return false;
        }
        C51121rk3 rk32 = (C51121rk3) aVar;
        return C46238a.m51546a(this.BaseResponse, rk32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f140976d), Integer.valueOf(rk32.f140976d)) && C46238a.m51546a(this.f140977e, rk32.f140977e) && C46238a.m51546a(this.f140978f, rk32.f140978f) && C46238a.m51546a(this.f140979g, rk32.f140979g) && C46238a.m51546a(Long.valueOf(this.f140980h), Long.valueOf(rk32.f140980h)) && C46238a.m51546a(Long.valueOf(this.f140981i), Long.valueOf(rk32.f140981i)) && C46238a.m51546a(this.f140982j, rk32.f140982j) && C46238a.m51546a(this.f140983n, rk32.f140983n) && C46238a.m51546a(this.f140984o, rk32.f140984o) && C46238a.m51546a(this.f140985p, rk32.f140985p) && C46238a.m51546a(this.f140986q, rk32.f140986q) && C46238a.m51546a(this.f140987r, rk32.f140987r) && C46238a.m51546a(this.f140988s, rk32.f140988s) && C46238a.m51546a(this.f140989t, rk32.f140989t) && C46238a.m51546a(this.f140990u, rk32.f140990u);
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
                aVar.mo74318e(2, this.f140976d);
                String str = this.f140977e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C50957qg2 qg22 = this.f140978f;
                if (qg22 != null) {
                    aVar.mo74322i(4, qg22.computeSize());
                    this.f140978f.writeFields(aVar);
                }
                aVar.mo74320g(5, 8, this.f140979g);
                aVar.mo74321h(6, this.f140980h);
                aVar.mo74321h(7, this.f140981i);
                C51879wu3 wu32 = this.f140982j;
                if (wu32 != null) {
                    aVar.mo74322i(8, wu32.computeSize());
                    this.f140982j.writeFields(aVar);
                }
                C52131yl ylVar = this.f140983n;
                if (ylVar != null) {
                    aVar.mo74322i(9, ylVar.computeSize());
                    this.f140983n.writeFields(aVar);
                }
                eh4 eh4 = this.f140984o;
                if (eh4 != null) {
                    aVar.mo74322i(10, eh4.computeSize());
                    this.f140984o.writeFields(aVar);
                }
                C50062k03 k032 = this.f140985p;
                if (k032 != null) {
                    aVar.mo74322i(11, k032.computeSize());
                    this.f140985p.writeFields(aVar);
                }
                C77933g43 g432 = this.f140986q;
                if (g432 != null) {
                    aVar.mo74322i(12, g432.computeSize());
                    this.f140986q.writeFields(aVar);
                }
                String str2 = this.f140987r;
                if (str2 != null) {
                    aVar.mo74323j(13, str2);
                }
                String str3 = this.f140988s;
                if (str3 != null) {
                    aVar.mo74323j(14, str3);
                }
                String str4 = this.f140989t;
                if (str4 != null) {
                    aVar.mo74323j(15, str4);
                }
                C51469tz2 tz22 = this.f140990u;
                if (tz22 != null) {
                    aVar.mo74322i(16, tz22.computeSize());
                    this.f140990u.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f140976d);
            String str5 = this.f140977e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            C50957qg2 qg23 = this.f140978f;
            if (qg23 != null) {
                e += C52418a.m58682i(4, qg23.computeSize());
            }
            int g = e + C52418a.m58680g(5, 8, this.f140979g) + C52418a.m58681h(6, this.f140980h) + C52418a.m58681h(7, this.f140981i);
            C51879wu3 wu33 = this.f140982j;
            if (wu33 != null) {
                g += C52418a.m58682i(8, wu33.computeSize());
            }
            C52131yl ylVar2 = this.f140983n;
            if (ylVar2 != null) {
                g += C52418a.m58682i(9, ylVar2.computeSize());
            }
            eh4 eh42 = this.f140984o;
            if (eh42 != null) {
                g += C52418a.m58682i(10, eh42.computeSize());
            }
            C50062k03 k033 = this.f140985p;
            if (k033 != null) {
                g += C52418a.m58682i(11, k033.computeSize());
            }
            C77933g43 g433 = this.f140986q;
            if (g433 != null) {
                g += C52418a.m58682i(12, g433.computeSize());
            }
            String str6 = this.f140987r;
            if (str6 != null) {
                g += C52418a.m58683j(13, str6);
            }
            String str7 = this.f140988s;
            if (str7 != null) {
                g += C52418a.m58683j(14, str7);
            }
            String str8 = this.f140989t;
            if (str8 != null) {
                g += C52418a.m58683j(15, str8);
            }
            C51469tz2 tz23 = this.f140990u;
            return tz23 != null ? g + C52418a.m58682i(16, tz23.computeSize()) : g;
        } else if (i2 == 2) {
            this.f140979g.clear();
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
            C51121rk3 rk32 = objArr[1];
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
                        rk32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    rk32.f140976d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    rk32.f140977e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C50957qg2 qg24 = new C50957qg2();
                        if (bArr2 != null && bArr2.length > 0) {
                            qg24.parseFrom(bArr2);
                        }
                        rk32.f140978f = qg24;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51222sb3 sb32 = new C51222sb3();
                        if (bArr3 != null && bArr3.length > 0) {
                            sb32.parseFrom(bArr3);
                        }
                        rk32.f140979g.add(sb32);
                    }
                    return 0;
                case 6:
                    rk32.f140980h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    rk32.f140981i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51879wu3 wu34 = new C51879wu3();
                        if (bArr4 != null && bArr4.length > 0) {
                            wu34.parseFrom(bArr4);
                        }
                        rk32.f140982j = wu34;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C52131yl ylVar3 = new C52131yl();
                        if (bArr5 != null && bArr5.length > 0) {
                            ylVar3.parseFrom(bArr5);
                        }
                        rk32.f140983n = ylVar3;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        eh4 eh43 = new eh4();
                        if (bArr6 != null && bArr6.length > 0) {
                            eh43.parseFrom(bArr6);
                        }
                        rk32.f140984o = eh43;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C50062k03 k034 = new C50062k03();
                        if (bArr7 != null && bArr7.length > 0) {
                            k034.parseFrom(bArr7);
                        }
                        rk32.f140985p = k034;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C77933g43 g434 = new C77933g43();
                        if (bArr8 != null && bArr8.length > 0) {
                            g434.parseFrom(bArr8);
                        }
                        rk32.f140986q = g434;
                    }
                    return 0;
                case 13:
                    rk32.f140987r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    rk32.f140988s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    rk32.f140989t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C51469tz2 tz24 = new C51469tz2();
                        if (bArr9 != null && bArr9.length > 0) {
                            tz24.parseFrom(bArr9);
                        }
                        rk32.f140990u = tz24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
