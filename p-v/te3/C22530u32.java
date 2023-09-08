package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u32 */
public class C22530u32 extends C49335eu3 {

    /* renamed from: d */
    public int f64622d;

    /* renamed from: e */
    public String f64623e;

    /* renamed from: f */
    public int f64624f;

    /* renamed from: g */
    public int f64625g;

    /* renamed from: h */
    public LinkedList<C22502jn> f64626h = new LinkedList<>();

    /* renamed from: i */
    public C118435go f64627i;

    /* renamed from: j */
    public int f64628j;

    /* renamed from: n */
    public int f64629n;

    /* renamed from: o */
    public C51997xn f64630o;

    /* renamed from: p */
    public String f64631p;

    /* renamed from: q */
    public C51997xn f64632q;

    /* renamed from: r */
    public String f64633r;

    /* renamed from: s */
    public String f64634s;

    /* renamed from: t */
    public LinkedList<C22517nn> f64635t = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22530u32)) {
            return false;
        }
        C22530u32 u322 = (C22530u32) aVar;
        return C46238a.m51546a(this.BaseResponse, u322.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f64622d), Integer.valueOf(u322.f64622d)) && C46238a.m51546a(this.f64623e, u322.f64623e) && C46238a.m51546a(Integer.valueOf(this.f64624f), Integer.valueOf(u322.f64624f)) && C46238a.m51546a(Integer.valueOf(this.f64625g), Integer.valueOf(u322.f64625g)) && C46238a.m51546a(this.f64626h, u322.f64626h) && C46238a.m51546a(this.f64627i, u322.f64627i) && C46238a.m51546a(Integer.valueOf(this.f64628j), Integer.valueOf(u322.f64628j)) && C46238a.m51546a(Integer.valueOf(this.f64629n), Integer.valueOf(u322.f64629n)) && C46238a.m51546a(this.f64630o, u322.f64630o) && C46238a.m51546a(this.f64631p, u322.f64631p) && C46238a.m51546a(this.f64632q, u322.f64632q) && C46238a.m51546a(this.f64633r, u322.f64633r) && C46238a.m51546a(this.f64634s, u322.f64634s) && C46238a.m51546a(this.f64635t, u322.f64635t);
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
                aVar.mo74318e(2, this.f64622d);
                String str = this.f64623e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f64624f);
                aVar.mo74318e(5, this.f64625g);
                aVar.mo74320g(6, 8, this.f64626h);
                C118435go goVar = this.f64627i;
                if (goVar != null) {
                    aVar.mo74322i(7, goVar.computeSize());
                    this.f64627i.writeFields(aVar);
                }
                aVar.mo74318e(8, this.f64628j);
                aVar.mo74318e(9, this.f64629n);
                C51997xn xnVar = this.f64630o;
                if (xnVar != null) {
                    aVar.mo74322i(10, xnVar.computeSize());
                    this.f64630o.writeFields(aVar);
                }
                String str2 = this.f64631p;
                if (str2 != null) {
                    aVar.mo74323j(11, str2);
                }
                C51997xn xnVar2 = this.f64632q;
                if (xnVar2 != null) {
                    aVar.mo74322i(12, xnVar2.computeSize());
                    this.f64632q.writeFields(aVar);
                }
                String str3 = this.f64633r;
                if (str3 != null) {
                    aVar.mo74323j(13, str3);
                }
                String str4 = this.f64634s;
                if (str4 != null) {
                    aVar.mo74323j(14, str4);
                }
                aVar.mo74320g(15, 8, this.f64635t);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f64622d);
            String str5 = this.f64623e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f64624f) + C52418a.m58678e(5, this.f64625g) + C52418a.m58680g(6, 8, this.f64626h);
            C118435go goVar2 = this.f64627i;
            if (goVar2 != null) {
                e2 += C52418a.m58682i(7, goVar2.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(8, this.f64628j) + C52418a.m58678e(9, this.f64629n);
            C51997xn xnVar3 = this.f64630o;
            if (xnVar3 != null) {
                e3 += C52418a.m58682i(10, xnVar3.computeSize());
            }
            String str6 = this.f64631p;
            if (str6 != null) {
                e3 += C52418a.m58683j(11, str6);
            }
            C51997xn xnVar4 = this.f64632q;
            if (xnVar4 != null) {
                e3 += C52418a.m58682i(12, xnVar4.computeSize());
            }
            String str7 = this.f64633r;
            if (str7 != null) {
                e3 += C52418a.m58683j(13, str7);
            }
            String str8 = this.f64634s;
            if (str8 != null) {
                e3 += C52418a.m58683j(14, str8);
            }
            return e3 + C52418a.m58680g(15, 8, this.f64635t);
        } else if (i2 == 2) {
            this.f64626h.clear();
            this.f64635t.clear();
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
            C22530u32 u322 = objArr[1];
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
                        u322.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    u322.f64622d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    u322.f64623e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    u322.f64624f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    u322.f64625g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C22502jn jnVar = new C22502jn();
                        if (bArr2 != null && bArr2.length > 0) {
                            jnVar.parseFrom(bArr2);
                        }
                        u322.f64626h.add(jnVar);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C118435go goVar3 = new C118435go();
                        if (bArr3 != null && bArr3.length > 0) {
                            goVar3.parseFrom(bArr3);
                        }
                        u322.f64627i = goVar3;
                    }
                    return 0;
                case 8:
                    u322.f64628j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    u322.f64629n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51997xn xnVar5 = new C51997xn();
                        if (bArr4 != null && bArr4.length > 0) {
                            xnVar5.parseFrom(bArr4);
                        }
                        u322.f64630o = xnVar5;
                    }
                    return 0;
                case 11:
                    u322.f64631p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51997xn xnVar6 = new C51997xn();
                        if (bArr5 != null && bArr5.length > 0) {
                            xnVar6.parseFrom(bArr5);
                        }
                        u322.f64632q = xnVar6;
                    }
                    return 0;
                case 13:
                    u322.f64633r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    u322.f64634s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C22517nn nnVar = new C22517nn();
                        if (bArr6 != null && bArr6.length > 0) {
                            nnVar.parseFrom(bArr6);
                        }
                        u322.f64635t.add(nnVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
