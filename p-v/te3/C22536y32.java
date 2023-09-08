package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y32 */
public class C22536y32 extends C49335eu3 {

    /* renamed from: d */
    public int f64803d;

    /* renamed from: e */
    public String f64804e;

    /* renamed from: f */
    public int f64805f;

    /* renamed from: g */
    public int f64806g;

    /* renamed from: h */
    public C50983qn f64807h;

    /* renamed from: i */
    public C51569un f64808i;

    /* renamed from: j */
    public C22517nn f64809j;

    /* renamed from: n */
    public String f64810n;

    /* renamed from: o */
    public int f64811o;

    /* renamed from: p */
    public int f64812p;

    /* renamed from: q */
    public C118435go f64813q;

    /* renamed from: r */
    public C64732tn f64814r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22536y32)) {
            return false;
        }
        C22536y32 y322 = (C22536y32) aVar;
        return C46238a.m51546a(this.BaseResponse, y322.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f64803d), Integer.valueOf(y322.f64803d)) && C46238a.m51546a(this.f64804e, y322.f64804e) && C46238a.m51546a(Integer.valueOf(this.f64805f), Integer.valueOf(y322.f64805f)) && C46238a.m51546a(Integer.valueOf(this.f64806g), Integer.valueOf(y322.f64806g)) && C46238a.m51546a(this.f64807h, y322.f64807h) && C46238a.m51546a(this.f64808i, y322.f64808i) && C46238a.m51546a(this.f64809j, y322.f64809j) && C46238a.m51546a(this.f64810n, y322.f64810n) && C46238a.m51546a(Integer.valueOf(this.f64811o), Integer.valueOf(y322.f64811o)) && C46238a.m51546a(Integer.valueOf(this.f64812p), Integer.valueOf(y322.f64812p)) && C46238a.m51546a(this.f64813q, y322.f64813q) && C46238a.m51546a(this.f64814r, y322.f64814r);
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
                aVar.mo74318e(2, this.f64803d);
                String str = this.f64804e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f64805f);
                aVar.mo74318e(5, this.f64806g);
                C50983qn qnVar = this.f64807h;
                if (qnVar != null) {
                    aVar.mo74322i(6, qnVar.computeSize());
                    this.f64807h.writeFields(aVar);
                }
                C51569un unVar = this.f64808i;
                if (unVar != null) {
                    aVar.mo74322i(7, unVar.computeSize());
                    this.f64808i.writeFields(aVar);
                }
                C22517nn nnVar = this.f64809j;
                if (nnVar != null) {
                    aVar.mo74322i(8, nnVar.computeSize());
                    this.f64809j.writeFields(aVar);
                }
                String str2 = this.f64810n;
                if (str2 != null) {
                    aVar.mo74323j(10, str2);
                }
                aVar.mo74318e(11, this.f64811o);
                aVar.mo74318e(12, this.f64812p);
                C118435go goVar = this.f64813q;
                if (goVar != null) {
                    aVar.mo74322i(13, goVar.computeSize());
                    this.f64813q.writeFields(aVar);
                }
                C64732tn tnVar = this.f64814r;
                if (tnVar != null) {
                    aVar.mo74322i(14, tnVar.computeSize());
                    this.f64814r.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f64803d);
            String str3 = this.f64804e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int e2 = e + C52418a.m58678e(4, this.f64805f) + C52418a.m58678e(5, this.f64806g);
            C50983qn qnVar2 = this.f64807h;
            if (qnVar2 != null) {
                e2 += C52418a.m58682i(6, qnVar2.computeSize());
            }
            C51569un unVar2 = this.f64808i;
            if (unVar2 != null) {
                e2 += C52418a.m58682i(7, unVar2.computeSize());
            }
            C22517nn nnVar2 = this.f64809j;
            if (nnVar2 != null) {
                e2 += C52418a.m58682i(8, nnVar2.computeSize());
            }
            String str4 = this.f64810n;
            if (str4 != null) {
                e2 += C52418a.m58683j(10, str4);
            }
            int e3 = e2 + C52418a.m58678e(11, this.f64811o) + C52418a.m58678e(12, this.f64812p);
            C118435go goVar2 = this.f64813q;
            if (goVar2 != null) {
                e3 += C52418a.m58682i(13, goVar2.computeSize());
            }
            C64732tn tnVar2 = this.f64814r;
            return tnVar2 != null ? e3 + C52418a.m58682i(14, tnVar2.computeSize()) : e3;
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
            C22536y32 y322 = objArr[1];
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
                        y322.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    y322.f64803d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    y322.f64804e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    y322.f64805f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    y322.f64806g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C50983qn qnVar3 = new C50983qn();
                        if (bArr2 != null && bArr2.length > 0) {
                            qnVar3.parseFrom(bArr2);
                        }
                        y322.f64807h = qnVar3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51569un unVar3 = new C51569un();
                        if (bArr3 != null && bArr3.length > 0) {
                            unVar3.parseFrom(bArr3);
                        }
                        y322.f64808i = unVar3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C22517nn nnVar3 = new C22517nn();
                        if (bArr4 != null && bArr4.length > 0) {
                            nnVar3.parseFrom(bArr4);
                        }
                        y322.f64809j = nnVar3;
                    }
                    return 0;
                case 10:
                    y322.f64810n = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    y322.f64811o = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    y322.f64812p = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C118435go goVar3 = new C118435go();
                        if (bArr5 != null && bArr5.length > 0) {
                            goVar3.parseFrom(bArr5);
                        }
                        y322.f64813q = goVar3;
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C64732tn tnVar3 = new C64732tn();
                        if (bArr6 != null && bArr6.length > 0) {
                            tnVar3.parseFrom(bArr6);
                        }
                        y322.f64814r = tnVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
