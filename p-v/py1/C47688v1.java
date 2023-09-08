package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.v1 */
public class C47688v1 extends C49335eu3 {

    /* renamed from: d */
    public C47589h f128071d;

    /* renamed from: e */
    public String f128072e;

    /* renamed from: f */
    public LinkedList<C47611k0> f128073f = new LinkedList<>();

    /* renamed from: g */
    public C47607j3 f128074g;

    /* renamed from: h */
    public C47695w2 f128075h;

    /* renamed from: i */
    public C47676t2 f128076i;

    /* renamed from: j */
    public C47587g4 f128077j;

    /* renamed from: n */
    public LinkedList<C47618l0> f128078n = new LinkedList<>();

    /* renamed from: o */
    public C47643o4 f128079o;

    /* renamed from: p */
    public C47689v2 f128080p;

    /* renamed from: q */
    public C47662r2 f128081q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47688v1)) {
            return false;
        }
        C47688v1 v1Var = (C47688v1) aVar;
        return C46238a.m51546a(this.BaseResponse, v1Var.BaseResponse) && C46238a.m51546a(this.f128071d, v1Var.f128071d) && C46238a.m51546a(this.f128072e, v1Var.f128072e) && C46238a.m51546a(this.f128073f, v1Var.f128073f) && C46238a.m51546a(this.f128074g, v1Var.f128074g) && C46238a.m51546a(this.f128075h, v1Var.f128075h) && C46238a.m51546a(this.f128076i, v1Var.f128076i) && C46238a.m51546a(this.f128077j, v1Var.f128077j) && C46238a.m51546a(this.f128078n, v1Var.f128078n) && C46238a.m51546a(this.f128079o, v1Var.f128079o) && C46238a.m51546a(this.f128080p, v1Var.f128080p) && C46238a.m51546a(this.f128081q, v1Var.f128081q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f128071d == null) {
                throw new C52419b("Not all required fields were included: AppItem");
            } else if (this.f128072e != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C47589h hVar = this.f128071d;
                if (hVar != null) {
                    aVar.mo74322i(2, hVar.computeSize());
                    this.f128071d.writeFields(aVar);
                }
                String str = this.f128072e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 8, this.f128073f);
                C47607j3 j3Var = this.f128074g;
                if (j3Var != null) {
                    aVar.mo74322i(5, j3Var.computeSize());
                    this.f128074g.writeFields(aVar);
                }
                C47695w2 w2Var = this.f128075h;
                if (w2Var != null) {
                    aVar.mo74322i(7, w2Var.computeSize());
                    this.f128075h.writeFields(aVar);
                }
                C47676t2 t2Var = this.f128076i;
                if (t2Var != null) {
                    aVar.mo74322i(8, t2Var.computeSize());
                    this.f128076i.writeFields(aVar);
                }
                C47587g4 g4Var = this.f128077j;
                if (g4Var != null) {
                    aVar.mo74322i(9, g4Var.computeSize());
                    this.f128077j.writeFields(aVar);
                }
                aVar.mo74320g(10, 8, this.f128078n);
                C47643o4 o4Var = this.f128079o;
                if (o4Var != null) {
                    aVar.mo74322i(11, o4Var.computeSize());
                    this.f128079o.writeFields(aVar);
                }
                C47689v2 v2Var = this.f128080p;
                if (v2Var != null) {
                    aVar.mo74322i(12, v2Var.computeSize());
                    this.f128080p.writeFields(aVar);
                }
                C47662r2 r2Var = this.f128081q;
                if (r2Var != null) {
                    aVar.mo74322i(13, r2Var.computeSize());
                    this.f128081q.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: BackGroundURL");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            C47589h hVar2 = this.f128071d;
            if (hVar2 != null) {
                i3 += C52418a.m58682i(2, hVar2.computeSize());
            }
            String str2 = this.f128072e;
            if (str2 != null) {
                i3 += C52418a.m58683j(3, str2);
            }
            int g = i3 + C52418a.m58680g(4, 8, this.f128073f);
            C47607j3 j3Var2 = this.f128074g;
            if (j3Var2 != null) {
                g += C52418a.m58682i(5, j3Var2.computeSize());
            }
            C47695w2 w2Var2 = this.f128075h;
            if (w2Var2 != null) {
                g += C52418a.m58682i(7, w2Var2.computeSize());
            }
            C47676t2 t2Var2 = this.f128076i;
            if (t2Var2 != null) {
                g += C52418a.m58682i(8, t2Var2.computeSize());
            }
            C47587g4 g4Var2 = this.f128077j;
            if (g4Var2 != null) {
                g += C52418a.m58682i(9, g4Var2.computeSize());
            }
            int g2 = g + C52418a.m58680g(10, 8, this.f128078n);
            C47643o4 o4Var2 = this.f128079o;
            if (o4Var2 != null) {
                g2 += C52418a.m58682i(11, o4Var2.computeSize());
            }
            C47689v2 v2Var2 = this.f128080p;
            if (v2Var2 != null) {
                g2 += C52418a.m58682i(12, v2Var2.computeSize());
            }
            C47662r2 r2Var2 = this.f128081q;
            return r2Var2 != null ? g2 + C52418a.m58682i(13, r2Var2.computeSize()) : g2;
        } else if (i2 == 2) {
            this.f128073f.clear();
            this.f128078n.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f128071d == null) {
                throw new C52419b("Not all required fields were included: AppItem");
            } else if (this.f128072e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: BackGroundURL");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47688v1 v1Var = objArr[1];
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
                        v1Var.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C47589h hVar3 = new C47589h();
                        if (bArr2 != null && bArr2.length > 0) {
                            hVar3.parseFrom(bArr2);
                        }
                        v1Var.f128071d = hVar3;
                    }
                    return 0;
                case 3:
                    v1Var.f128072e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C47611k0 k0Var = new C47611k0();
                        if (bArr3 != null && bArr3.length > 0) {
                            k0Var.parseFrom(bArr3);
                        }
                        v1Var.f128073f.add(k0Var);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C47607j3 j3Var3 = new C47607j3();
                        if (bArr4 != null && bArr4.length > 0) {
                            j3Var3.parseFrom(bArr4);
                        }
                        v1Var.f128074g = j3Var3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C47695w2 w2Var3 = new C47695w2();
                        if (bArr5 != null && bArr5.length > 0) {
                            w2Var3.parseFrom(bArr5);
                        }
                        v1Var.f128075h = w2Var3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C47676t2 t2Var3 = new C47676t2();
                        if (bArr6 != null && bArr6.length > 0) {
                            t2Var3.parseFrom(bArr6);
                        }
                        v1Var.f128076i = t2Var3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C47587g4 g4Var3 = new C47587g4();
                        if (bArr7 != null && bArr7.length > 0) {
                            g4Var3.parseFrom(bArr7);
                        }
                        v1Var.f128077j = g4Var3;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C47618l0 l0Var = new C47618l0();
                        if (bArr8 != null && bArr8.length > 0) {
                            l0Var.parseFrom(bArr8);
                        }
                        v1Var.f128078n.add(l0Var);
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C47643o4 o4Var3 = new C47643o4();
                        if (bArr9 != null && bArr9.length > 0) {
                            o4Var3.parseFrom(bArr9);
                        }
                        v1Var.f128079o = o4Var3;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C47689v2 v2Var3 = new C47689v2();
                        if (bArr10 != null && bArr10.length > 0) {
                            v2Var3.parseFrom(bArr10);
                        }
                        v1Var.f128080p = v2Var3;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C47662r2 r2Var3 = new C47662r2();
                        if (bArr11 != null && bArr11.length > 0) {
                            r2Var3.parseFrom(bArr11);
                        }
                        v1Var.f128081q = r2Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
