package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xk3 */
public class C51987xk3 extends C49335eu3 {

    /* renamed from: d */
    public int f144720d;

    /* renamed from: e */
    public String f144721e;

    /* renamed from: f */
    public String f144722f;

    /* renamed from: g */
    public String f144723g;

    /* renamed from: h */
    public C52045y0 f144724h;

    /* renamed from: i */
    public gg4 f144725i;

    /* renamed from: j */
    public C51102rf3 f144726j;

    /* renamed from: n */
    public String f144727n;

    /* renamed from: o */
    public String f144728o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51987xk3)) {
            return false;
        }
        C51987xk3 xk32 = (C51987xk3) aVar;
        return C46238a.m51546a(this.BaseResponse, xk32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f144720d), Integer.valueOf(xk32.f144720d)) && C46238a.m51546a(this.f144721e, xk32.f144721e) && C46238a.m51546a(this.f144722f, xk32.f144722f) && C46238a.m51546a(this.f144723g, xk32.f144723g) && C46238a.m51546a(this.f144724h, xk32.f144724h) && C46238a.m51546a(this.f144725i, xk32.f144725i) && C46238a.m51546a(this.f144726j, xk32.f144726j) && C46238a.m51546a(this.f144727n, xk32.f144727n) && C46238a.m51546a(this.f144728o, xk32.f144728o);
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
                aVar.mo74318e(2, this.f144720d);
                String str = this.f144721e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f144722f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f144723g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                C52045y0 y0Var = this.f144724h;
                if (y0Var != null) {
                    aVar.mo74322i(6, y0Var.computeSize());
                    this.f144724h.writeFields(aVar);
                }
                gg4 gg4 = this.f144725i;
                if (gg4 != null) {
                    aVar.mo74322i(7, gg4.computeSize());
                    this.f144725i.writeFields(aVar);
                }
                C51102rf3 rf32 = this.f144726j;
                if (rf32 != null) {
                    aVar.mo74322i(8, rf32.computeSize());
                    this.f144726j.writeFields(aVar);
                }
                String str4 = this.f144727n;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                String str5 = this.f144728o;
                if (str5 != null) {
                    aVar.mo74323j(100, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f144720d);
            String str6 = this.f144721e;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f144722f;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f144723g;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            C52045y0 y0Var2 = this.f144724h;
            if (y0Var2 != null) {
                e += C52418a.m58682i(6, y0Var2.computeSize());
            }
            gg4 gg42 = this.f144725i;
            if (gg42 != null) {
                e += C52418a.m58682i(7, gg42.computeSize());
            }
            C51102rf3 rf33 = this.f144726j;
            if (rf33 != null) {
                e += C52418a.m58682i(8, rf33.computeSize());
            }
            String str9 = this.f144727n;
            if (str9 != null) {
                e += C52418a.m58683j(9, str9);
            }
            String str10 = this.f144728o;
            return str10 != null ? e + C52418a.m58683j(100, str10) : e;
        } else if (i == 2) {
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
            C51987xk3 xk32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 100) {
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
                            xk32.BaseResponse = jaVar3;
                        }
                        return 0;
                    case 2:
                        xk32.f144720d = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        xk32.f144721e = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        xk32.f144722f = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        xk32.f144723g = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C52045y0 y0Var3 = new C52045y0();
                            if (bArr2 != null && bArr2.length > 0) {
                                y0Var3.parseFrom(bArr2);
                            }
                            xk32.f144724h = y0Var3;
                        }
                        return 0;
                    case 7:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            byte[] bArr3 = j3.get(i5);
                            gg4 gg43 = new gg4();
                            if (bArr3 != null && bArr3.length > 0) {
                                gg43.parseFrom(bArr3);
                            }
                            xk32.f144725i = gg43;
                        }
                        return 0;
                    case 8:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i6 = 0; i6 < size4; i6++) {
                            byte[] bArr4 = j4.get(i6);
                            C51102rf3 rf34 = new C51102rf3();
                            if (bArr4 != null && bArr4.length > 0) {
                                rf34.parseFrom(bArr4);
                            }
                            xk32.f144726j = rf34;
                        }
                        return 0;
                    case 9:
                        xk32.f144727n = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                xk32.f144728o = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
