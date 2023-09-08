package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wm2 */
public class C90446wm2 extends C49335eu3 {

    /* renamed from: d */
    public C90436rm2 f259922d;

    /* renamed from: e */
    public C48761au f259923e;

    /* renamed from: f */
    public b55 f259924f;

    /* renamed from: g */
    public C90414hj3 f259925g;

    /* renamed from: h */
    public C64567n1 f259926h;

    /* renamed from: i */
    public C51662v83 f259927i;

    /* renamed from: j */
    public String f259928j;

    /* renamed from: n */
    public String f259929n;

    /* renamed from: o */
    public String f259930o;

    /* renamed from: p */
    public y65 f259931p;

    /* renamed from: q */
    public int f259932q;

    /* renamed from: r */
    public String f259933r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90446wm2)) {
            return false;
        }
        C90446wm2 wm22 = (C90446wm2) aVar;
        return C46238a.m51546a(this.BaseResponse, wm22.BaseResponse) && C46238a.m51546a(this.f259922d, wm22.f259922d) && C46238a.m51546a(this.f259923e, wm22.f259923e) && C46238a.m51546a(this.f259924f, wm22.f259924f) && C46238a.m51546a(this.f259925g, wm22.f259925g) && C46238a.m51546a(this.f259926h, wm22.f259926h) && C46238a.m51546a(this.f259927i, wm22.f259927i) && C46238a.m51546a(this.f259928j, wm22.f259928j) && C46238a.m51546a(this.f259929n, wm22.f259929n) && C46238a.m51546a(this.f259930o, wm22.f259930o) && C46238a.m51546a(this.f259931p, wm22.f259931p) && C46238a.m51546a(Integer.valueOf(this.f259932q), Integer.valueOf(wm22.f259932q)) && C46238a.m51546a(this.f259933r, wm22.f259933r);
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
                C90436rm2 rm22 = this.f259922d;
                if (rm22 != null) {
                    aVar.mo74322i(2, rm22.computeSize());
                    this.f259922d.writeFields(aVar);
                }
                C48761au auVar = this.f259923e;
                if (auVar != null) {
                    aVar.mo74322i(3, auVar.computeSize());
                    this.f259923e.writeFields(aVar);
                }
                b55 b55 = this.f259924f;
                if (b55 != null) {
                    aVar.mo74322i(4, b55.computeSize());
                    this.f259924f.writeFields(aVar);
                }
                C90414hj3 hj32 = this.f259925g;
                if (hj32 != null) {
                    aVar.mo74322i(5, hj32.computeSize());
                    this.f259925g.writeFields(aVar);
                }
                C64567n1 n1Var = this.f259926h;
                if (n1Var != null) {
                    aVar.mo74322i(6, n1Var.computeSize());
                    this.f259926h.writeFields(aVar);
                }
                C51662v83 v832 = this.f259927i;
                if (v832 != null) {
                    aVar.mo74322i(7, v832.computeSize());
                    this.f259927i.writeFields(aVar);
                }
                String str = this.f259928j;
                if (str != null) {
                    aVar.mo74323j(8, str);
                }
                String str2 = this.f259929n;
                if (str2 != null) {
                    aVar.mo74323j(9, str2);
                }
                String str3 = this.f259930o;
                if (str3 != null) {
                    aVar.mo74323j(10, str3);
                }
                y65 y65 = this.f259931p;
                if (y65 != null) {
                    aVar.mo74322i(11, y65.computeSize());
                    this.f259931p.writeFields(aVar);
                }
                aVar.mo74318e(12, this.f259932q);
                String str4 = this.f259933r;
                if (str4 != null) {
                    aVar.mo74323j(13, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            C90436rm2 rm23 = this.f259922d;
            if (rm23 != null) {
                i3 += C52418a.m58682i(2, rm23.computeSize());
            }
            C48761au auVar2 = this.f259923e;
            if (auVar2 != null) {
                i3 += C52418a.m58682i(3, auVar2.computeSize());
            }
            b55 b552 = this.f259924f;
            if (b552 != null) {
                i3 += C52418a.m58682i(4, b552.computeSize());
            }
            C90414hj3 hj33 = this.f259925g;
            if (hj33 != null) {
                i3 += C52418a.m58682i(5, hj33.computeSize());
            }
            C64567n1 n1Var2 = this.f259926h;
            if (n1Var2 != null) {
                i3 += C52418a.m58682i(6, n1Var2.computeSize());
            }
            C51662v83 v833 = this.f259927i;
            if (v833 != null) {
                i3 += C52418a.m58682i(7, v833.computeSize());
            }
            String str5 = this.f259928j;
            if (str5 != null) {
                i3 += C52418a.m58683j(8, str5);
            }
            String str6 = this.f259929n;
            if (str6 != null) {
                i3 += C52418a.m58683j(9, str6);
            }
            String str7 = this.f259930o;
            if (str7 != null) {
                i3 += C52418a.m58683j(10, str7);
            }
            y65 y652 = this.f259931p;
            if (y652 != null) {
                i3 += C52418a.m58682i(11, y652.computeSize());
            }
            int e = i3 + C52418a.m58678e(12, this.f259932q);
            String str8 = this.f259933r;
            return str8 != null ? e + C52418a.m58683j(13, str8) : e;
        } else if (i2 == 2) {
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
            C90446wm2 wm22 = objArr[1];
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
                        wm22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C90436rm2 rm24 = new C90436rm2();
                        if (bArr2 != null && bArr2.length > 0) {
                            rm24.parseFrom(bArr2);
                        }
                        wm22.f259922d = rm24;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C48761au auVar3 = new C48761au();
                        if (bArr3 != null && bArr3.length > 0) {
                            auVar3.parseFrom(bArr3);
                        }
                        wm22.f259923e = auVar3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        b55 b553 = new b55();
                        if (bArr4 != null && bArr4.length > 0) {
                            b553.parseFrom(bArr4);
                        }
                        wm22.f259924f = b553;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C90414hj3 hj34 = new C90414hj3();
                        if (bArr5 != null && bArr5.length > 0) {
                            hj34.parseFrom(bArr5);
                        }
                        wm22.f259925g = hj34;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C64567n1 n1Var3 = new C64567n1();
                        if (bArr6 != null && bArr6.length > 0) {
                            n1Var3.parseFrom(bArr6);
                        }
                        wm22.f259926h = n1Var3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51662v83 v834 = new C51662v83();
                        if (bArr7 != null && bArr7.length > 0) {
                            v834.parseFrom(bArr7);
                        }
                        wm22.f259927i = v834;
                    }
                    return 0;
                case 8:
                    wm22.f259928j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    wm22.f259929n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    wm22.f259930o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        y65 y653 = new y65();
                        if (bArr8 != null && bArr8.length > 0) {
                            y653.parseFrom(bArr8);
                        }
                        wm22.f259931p = y653;
                    }
                    return 0;
                case 12:
                    wm22.f259932q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    wm22.f259933r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
