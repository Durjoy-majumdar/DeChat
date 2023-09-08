package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.og2 */
public class C50678og2 extends C49335eu3 {

    /* renamed from: d */
    public int f139154d;

    /* renamed from: e */
    public String f139155e;

    /* renamed from: f */
    public LinkedList<C50826pg2> f139156f = new LinkedList<>();

    /* renamed from: g */
    public C50248ld3 f139157g;

    /* renamed from: h */
    public C51879wu3 f139158h;

    /* renamed from: i */
    public boolean f139159i;

    /* renamed from: j */
    public C51510u9 f139160j;

    /* renamed from: n */
    public C77933g43 f139161n;

    /* renamed from: o */
    public boolean f139162o;

    /* renamed from: p */
    public C50399mg2 f139163p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50678og2)) {
            return false;
        }
        C50678og2 og22 = (C50678og2) aVar;
        return C46238a.m51546a(this.BaseResponse, og22.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139154d), Integer.valueOf(og22.f139154d)) && C46238a.m51546a(this.f139155e, og22.f139155e) && C46238a.m51546a(this.f139156f, og22.f139156f) && C46238a.m51546a(this.f139157g, og22.f139157g) && C46238a.m51546a(this.f139158h, og22.f139158h) && C46238a.m51546a(Boolean.valueOf(this.f139159i), Boolean.valueOf(og22.f139159i)) && C46238a.m51546a(this.f139160j, og22.f139160j) && C46238a.m51546a(this.f139161n, og22.f139161n) && C46238a.m51546a(Boolean.valueOf(this.f139162o), Boolean.valueOf(og22.f139162o)) && C46238a.m51546a(this.f139163p, og22.f139163p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f139154d);
                String str = this.f139155e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 8, this.f139156f);
                C50248ld3 ld32 = this.f139157g;
                if (ld32 != null) {
                    aVar.mo74322i(5, ld32.computeSize());
                    this.f139157g.writeFields(aVar);
                }
                C51879wu3 wu32 = this.f139158h;
                if (wu32 != null) {
                    aVar.mo74322i(6, wu32.computeSize());
                    this.f139158h.writeFields(aVar);
                }
                aVar.mo74314a(7, this.f139159i);
                C51510u9 u9Var = this.f139160j;
                if (u9Var != null) {
                    aVar.mo74322i(8, u9Var.computeSize());
                    this.f139160j.writeFields(aVar);
                }
                C77933g43 g432 = this.f139161n;
                if (g432 != null) {
                    aVar.mo74322i(9, g432.computeSize());
                    this.f139161n.writeFields(aVar);
                }
                aVar.mo74314a(10, this.f139162o);
                C50399mg2 mg22 = this.f139163p;
                if (mg22 != null) {
                    aVar.mo74322i(11, mg22.computeSize());
                    this.f139163p.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139154d);
            String str2 = this.f139155e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int g = e + C52418a.m58680g(4, 8, this.f139156f);
            C50248ld3 ld33 = this.f139157g;
            if (ld33 != null) {
                g += C52418a.m58682i(5, ld33.computeSize());
            }
            C51879wu3 wu33 = this.f139158h;
            if (wu33 != null) {
                g += C52418a.m58682i(6, wu33.computeSize());
            }
            int a = g + C52418a.m58674a(7, this.f139159i);
            C51510u9 u9Var2 = this.f139160j;
            if (u9Var2 != null) {
                a += C52418a.m58682i(8, u9Var2.computeSize());
            }
            C77933g43 g433 = this.f139161n;
            if (g433 != null) {
                a += C52418a.m58682i(9, g433.computeSize());
            }
            int a2 = a + C52418a.m58674a(10, this.f139162o);
            C50399mg2 mg23 = this.f139163p;
            return mg23 != null ? a2 + C52418a.m58682i(11, mg23.computeSize()) : a2;
        } else if (i == 2) {
            this.f139156f.clear();
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
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50678og2 og22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        og22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    og22.f139154d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    og22.f139155e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50826pg2 pg22 = new C50826pg2();
                        if (bArr2 != null && bArr2.length > 0) {
                            pg22.parseFrom(bArr2);
                        }
                        og22.f139156f.add(pg22);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50248ld3 ld34 = new C50248ld3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ld34.parseFrom(bArr3);
                        }
                        og22.f139157g = ld34;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51879wu3 wu34 = new C51879wu3();
                        if (bArr4 != null && bArr4.length > 0) {
                            wu34.parseFrom(bArr4);
                        }
                        og22.f139158h = wu34;
                    }
                    return 0;
                case 7:
                    og22.f139159i = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51510u9 u9Var3 = new C51510u9();
                        if (bArr5 != null && bArr5.length > 0) {
                            u9Var3.parseFrom(bArr5);
                        }
                        og22.f139160j = u9Var3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C77933g43 g434 = new C77933g43();
                        if (bArr6 != null && bArr6.length > 0) {
                            g434.parseFrom(bArr6);
                        }
                        og22.f139161n = g434;
                    }
                    return 0;
                case 10:
                    og22.f139162o = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C50399mg2 mg24 = new C50399mg2();
                        if (bArr7 != null && bArr7.length > 0) {
                            mg24.parseFrom(bArr7);
                        }
                        og22.f139163p = mg24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
