package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class kj4 extends C49335eu3 {

    /* renamed from: d */
    public int f136821d;

    /* renamed from: e */
    public String f136822e;

    /* renamed from: f */
    public String f136823f;

    /* renamed from: g */
    public String f136824g;

    /* renamed from: h */
    public int f136825h;

    /* renamed from: i */
    public LinkedList<C77935gl2> f136826i = new LinkedList<>();

    /* renamed from: j */
    public C77935gl2 f136827j;

    /* renamed from: n */
    public String f136828n;

    /* renamed from: o */
    public C77933g43 f136829o;

    /* renamed from: p */
    public boolean f136830p;

    /* renamed from: q */
    public C52036xy f136831q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof kj4)) {
            return false;
        }
        kj4 kj4 = (kj4) aVar;
        return C46238a.m51546a(this.BaseResponse, kj4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f136821d), Integer.valueOf(kj4.f136821d)) && C46238a.m51546a(this.f136822e, kj4.f136822e) && C46238a.m51546a(this.f136823f, kj4.f136823f) && C46238a.m51546a(this.f136824g, kj4.f136824g) && C46238a.m51546a(Integer.valueOf(this.f136825h), Integer.valueOf(kj4.f136825h)) && C46238a.m51546a(this.f136826i, kj4.f136826i) && C46238a.m51546a(this.f136827j, kj4.f136827j) && C46238a.m51546a(this.f136828n, kj4.f136828n) && C46238a.m51546a(this.f136829o, kj4.f136829o) && C46238a.m51546a(Boolean.valueOf(this.f136830p), Boolean.valueOf(kj4.f136830p)) && C46238a.m51546a(this.f136831q, kj4.f136831q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f136821d);
            String str = this.f136822e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f136823f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f136824g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f136825h);
            aVar.mo74320g(7, 8, this.f136826i);
            C77935gl2 gl22 = this.f136827j;
            if (gl22 != null) {
                aVar.mo74322i(8, gl22.computeSize());
                this.f136827j.writeFields(aVar);
            }
            String str4 = this.f136828n;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            C77933g43 g432 = this.f136829o;
            if (g432 != null) {
                aVar.mo74322i(10, g432.computeSize());
                this.f136829o.writeFields(aVar);
            }
            aVar.mo74314a(11, this.f136830p);
            C52036xy xyVar = this.f136831q;
            if (xyVar != null) {
                aVar.mo74322i(12, xyVar.computeSize());
                this.f136831q.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136821d);
            String str5 = this.f136822e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f136823f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f136824g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int e2 = e + C52418a.m58678e(6, this.f136825h) + C52418a.m58680g(7, 8, this.f136826i);
            C77935gl2 gl23 = this.f136827j;
            if (gl23 != null) {
                e2 += C52418a.m58682i(8, gl23.computeSize());
            }
            String str8 = this.f136828n;
            if (str8 != null) {
                e2 += C52418a.m58683j(9, str8);
            }
            C77933g43 g433 = this.f136829o;
            if (g433 != null) {
                e2 += C52418a.m58682i(10, g433.computeSize());
            }
            int a = e2 + C52418a.m58674a(11, this.f136830p);
            C52036xy xyVar2 = this.f136831q;
            return xyVar2 != null ? a + C52418a.m58682i(12, xyVar2.computeSize()) : a;
        } else if (i == 2) {
            this.f136826i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            kj4 kj4 = objArr[1];
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
                        kj4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    kj4.f136821d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    kj4.f136822e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    kj4.f136823f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    kj4.f136824g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    kj4.f136825h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77935gl2 gl24 = new C77935gl2();
                        if (bArr2 != null && bArr2.length > 0) {
                            gl24.parseFrom(bArr2);
                        }
                        kj4.f136826i.add(gl24);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C77935gl2 gl25 = new C77935gl2();
                        if (bArr3 != null && bArr3.length > 0) {
                            gl25.parseFrom(bArr3);
                        }
                        kj4.f136827j = gl25;
                    }
                    return 0;
                case 9:
                    kj4.f136828n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C77933g43 g434 = new C77933g43();
                        if (bArr4 != null && bArr4.length > 0) {
                            g434.parseFrom(bArr4);
                        }
                        kj4.f136829o = g434;
                    }
                    return 0;
                case 11:
                    kj4.f136830p = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C52036xy xyVar3 = new C52036xy();
                        if (bArr5 != null && bArr5.length > 0) {
                            xyVar3.parseFrom(bArr5);
                        }
                        kj4.f136831q = xyVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
