package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qp */
public class C118460qp extends C49335eu3 {

    /* renamed from: d */
    public String f354278d;

    /* renamed from: e */
    public String f354279e;

    /* renamed from: f */
    public String f354280f;

    /* renamed from: g */
    public C118447nw2 f354281g;

    /* renamed from: h */
    public String f354282h;

    /* renamed from: i */
    public boolean f354283i;

    /* renamed from: j */
    public LinkedList<C118447nw2> f354284j = new LinkedList<>();

    /* renamed from: n */
    public C118477wj3 f354285n;

    /* renamed from: o */
    public C118477wj3 f354286o;

    /* renamed from: p */
    public int f354287p;

    /* renamed from: q */
    public int f354288q;

    /* renamed from: r */
    public C64275c7 f354289r;

    /* renamed from: s */
    public C89349b f354290s;

    /* renamed from: t */
    public int f354291t;

    /* renamed from: u */
    public boolean f354292u;

    /* renamed from: v */
    public C118480xn3 f354293v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118460qp)) {
            return false;
        }
        C118460qp qpVar = (C118460qp) aVar;
        return C46238a.m51546a(this.BaseResponse, qpVar.BaseResponse) && C46238a.m51546a(this.f354278d, qpVar.f354278d) && C46238a.m51546a(this.f354279e, qpVar.f354279e) && C46238a.m51546a(this.f354280f, qpVar.f354280f) && C46238a.m51546a(this.f354281g, qpVar.f354281g) && C46238a.m51546a(this.f354282h, qpVar.f354282h) && C46238a.m51546a(Boolean.valueOf(this.f354283i), Boolean.valueOf(qpVar.f354283i)) && C46238a.m51546a(this.f354284j, qpVar.f354284j) && C46238a.m51546a(this.f354285n, qpVar.f354285n) && C46238a.m51546a(this.f354286o, qpVar.f354286o) && C46238a.m51546a(Integer.valueOf(this.f354287p), Integer.valueOf(qpVar.f354287p)) && C46238a.m51546a(Integer.valueOf(this.f354288q), Integer.valueOf(qpVar.f354288q)) && C46238a.m51546a(this.f354289r, qpVar.f354289r) && C46238a.m51546a(this.f354290s, qpVar.f354290s) && C46238a.m51546a(Integer.valueOf(this.f354291t), Integer.valueOf(qpVar.f354291t)) && C46238a.m51546a(Boolean.valueOf(this.f354292u), Boolean.valueOf(qpVar.f354292u)) && C46238a.m51546a(this.f354293v, qpVar.f354293v);
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
                String str = this.f354278d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f354279e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f354280f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                C118447nw2 nw22 = this.f354281g;
                if (nw22 != null) {
                    aVar.mo74322i(5, nw22.computeSize());
                    this.f354281g.writeFields(aVar);
                }
                String str4 = this.f354282h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                aVar.mo74314a(7, this.f354283i);
                aVar.mo74320g(8, 8, this.f354284j);
                C118477wj3 wj32 = this.f354285n;
                if (wj32 != null) {
                    aVar.mo74322i(9, wj32.computeSize());
                    this.f354285n.writeFields(aVar);
                }
                C118477wj3 wj33 = this.f354286o;
                if (wj33 != null) {
                    aVar.mo74322i(10, wj33.computeSize());
                    this.f354286o.writeFields(aVar);
                }
                aVar.mo74318e(11, this.f354287p);
                aVar.mo74318e(12, this.f354288q);
                C64275c7 c7Var = this.f354289r;
                if (c7Var != null) {
                    aVar.mo74322i(13, c7Var.computeSize());
                    this.f354289r.writeFields(aVar);
                }
                C89349b bVar = this.f354290s;
                if (bVar != null) {
                    aVar.mo74315b(14, bVar);
                }
                aVar.mo74318e(15, this.f354291t);
                aVar.mo74314a(16, this.f354292u);
                C118480xn3 xn32 = this.f354293v;
                if (xn32 != null) {
                    aVar.mo74322i(17, xn32.computeSize());
                    this.f354293v.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            String str5 = this.f354278d;
            if (str5 != null) {
                i3 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f354279e;
            if (str6 != null) {
                i3 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f354280f;
            if (str7 != null) {
                i3 += C52418a.m58683j(4, str7);
            }
            C118447nw2 nw23 = this.f354281g;
            if (nw23 != null) {
                i3 += C52418a.m58682i(5, nw23.computeSize());
            }
            String str8 = this.f354282h;
            if (str8 != null) {
                i3 += C52418a.m58683j(6, str8);
            }
            int a = i3 + C52418a.m58674a(7, this.f354283i) + C52418a.m58680g(8, 8, this.f354284j);
            C118477wj3 wj34 = this.f354285n;
            if (wj34 != null) {
                a += C52418a.m58682i(9, wj34.computeSize());
            }
            C118477wj3 wj35 = this.f354286o;
            if (wj35 != null) {
                a += C52418a.m58682i(10, wj35.computeSize());
            }
            int e = a + C52418a.m58678e(11, this.f354287p) + C52418a.m58678e(12, this.f354288q);
            C64275c7 c7Var2 = this.f354289r;
            if (c7Var2 != null) {
                e += C52418a.m58682i(13, c7Var2.computeSize());
            }
            C89349b bVar2 = this.f354290s;
            if (bVar2 != null) {
                e += C52418a.m58675b(14, bVar2);
            }
            int e2 = e + C52418a.m58678e(15, this.f354291t) + C52418a.m58674a(16, this.f354292u);
            C118480xn3 xn33 = this.f354293v;
            return xn33 != null ? e2 + C52418a.m58682i(17, xn33.computeSize()) : e2;
        } else if (i2 == 2) {
            this.f354284j.clear();
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
            C118460qp qpVar = objArr[1];
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
                        qpVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    qpVar.f354278d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qpVar.f354279e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qpVar.f354280f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C118447nw2 nw24 = new C118447nw2();
                        if (bArr2 != null && bArr2.length > 0) {
                            nw24.parseFrom(bArr2);
                        }
                        qpVar.f354281g = nw24;
                    }
                    return 0;
                case 6:
                    qpVar.f354282h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qpVar.f354283i = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C118447nw2 nw25 = new C118447nw2();
                        if (bArr3 != null && bArr3.length > 0) {
                            nw25.parseFrom(bArr3);
                        }
                        qpVar.f354284j.add(nw25);
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C118477wj3 wj36 = new C118477wj3();
                        if (bArr4 != null && bArr4.length > 0) {
                            wj36.parseFrom(bArr4);
                        }
                        qpVar.f354285n = wj36;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C118477wj3 wj37 = new C118477wj3();
                        if (bArr5 != null && bArr5.length > 0) {
                            wj37.parseFrom(bArr5);
                        }
                        qpVar.f354286o = wj37;
                    }
                    return 0;
                case 11:
                    qpVar.f354287p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    qpVar.f354288q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C64275c7 c7Var3 = new C64275c7();
                        if (bArr6 != null && bArr6.length > 0) {
                            c7Var3.parseFrom(bArr6);
                        }
                        qpVar.f354289r = c7Var3;
                    }
                    return 0;
                case 14:
                    qpVar.f354290s = aVar3.mo141626d(intValue);
                    return 0;
                case 15:
                    qpVar.f354291t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    qpVar.f354292u = aVar3.mo141625c(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C118480xn3 xn34 = new C118480xn3();
                        if (bArr7 != null && bArr7.length > 0) {
                            xn34.parseFrom(bArr7);
                        }
                        qpVar.f354293v = xn34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
