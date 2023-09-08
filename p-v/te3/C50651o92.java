package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o92 */
public class C50651o92 extends C49335eu3 {

    /* renamed from: d */
    public int f139046d;

    /* renamed from: e */
    public LinkedList<C50565nm3> f139047e = new LinkedList<>();

    /* renamed from: f */
    public int f139048f;

    /* renamed from: g */
    public int f139049g;

    /* renamed from: h */
    public LinkedList<C51907x1> f139050h = new LinkedList<>();

    /* renamed from: i */
    public int f139051i;

    /* renamed from: j */
    public LinkedList<C51380td2> f139052j = new LinkedList<>();

    /* renamed from: n */
    public C51093rd2 f139053n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50651o92)) {
            return false;
        }
        C50651o92 o922 = (C50651o92) aVar;
        return C46238a.m51546a(this.BaseResponse, o922.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139046d), Integer.valueOf(o922.f139046d)) && C46238a.m51546a(this.f139047e, o922.f139047e) && C46238a.m51546a(Integer.valueOf(this.f139048f), Integer.valueOf(o922.f139048f)) && C46238a.m51546a(Integer.valueOf(this.f139049g), Integer.valueOf(o922.f139049g)) && C46238a.m51546a(this.f139050h, o922.f139050h) && C46238a.m51546a(Integer.valueOf(this.f139051i), Integer.valueOf(o922.f139051i)) && C46238a.m51546a(this.f139052j, o922.f139052j) && C46238a.m51546a(this.f139053n, o922.f139053n);
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
                aVar.mo74318e(2, this.f139046d);
                aVar.mo74320g(3, 8, this.f139047e);
                aVar.mo74318e(4, this.f139048f);
                aVar.mo74318e(5, this.f139049g);
                aVar.mo74320g(6, 8, this.f139050h);
                aVar.mo74318e(7, this.f139051i);
                aVar.mo74320g(8, 8, this.f139052j);
                C51093rd2 rd22 = this.f139053n;
                if (rd22 != null) {
                    aVar.mo74322i(9, rd22.computeSize());
                    this.f139053n.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139046d) + C52418a.m58680g(3, 8, this.f139047e) + C52418a.m58678e(4, this.f139048f) + C52418a.m58678e(5, this.f139049g) + C52418a.m58680g(6, 8, this.f139050h) + C52418a.m58678e(7, this.f139051i) + C52418a.m58680g(8, 8, this.f139052j);
            C51093rd2 rd23 = this.f139053n;
            return rd23 != null ? e + C52418a.m58682i(9, rd23.computeSize()) : e;
        } else if (i == 2) {
            this.f139047e.clear();
            this.f139050h.clear();
            this.f139052j.clear();
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
            C50651o92 o922 = objArr[1];
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
                        o922.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    o922.f139046d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50565nm3 nm32 = new C50565nm3();
                        if (bArr2 != null && bArr2.length > 0) {
                            nm32.parseFrom(bArr2);
                        }
                        o922.f139047e.add(nm32);
                    }
                    return 0;
                case 4:
                    o922.f139048f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    o922.f139049g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51907x1 x1Var = new C51907x1();
                        if (bArr3 != null && bArr3.length > 0) {
                            x1Var.parseFrom(bArr3);
                        }
                        o922.f139050h.add(x1Var);
                    }
                    return 0;
                case 7:
                    o922.f139051i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51380td2 td22 = new C51380td2();
                        if (bArr4 != null && bArr4.length > 0) {
                            td22.parseFrom(bArr4);
                        }
                        o922.f139052j.add(td22);
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51093rd2 rd24 = new C51093rd2();
                        if (bArr5 != null && bArr5.length > 0) {
                            rd24.parseFrom(bArr5);
                        }
                        o922.f139053n = rd24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
