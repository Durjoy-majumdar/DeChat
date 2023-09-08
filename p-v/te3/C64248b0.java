package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b0 */
public class C64248b0 extends C49335eu3 {

    /* renamed from: d */
    public int f182197d = 268513600;

    /* renamed from: e */
    public String f182198e = "请求不成功，请稍候再试";

    /* renamed from: f */
    public LinkedList<C64566n> f182199f = new LinkedList<>();

    /* renamed from: g */
    public String f182200g;

    /* renamed from: h */
    public String f182201h;

    /* renamed from: i */
    public int f182202i;

    /* renamed from: j */
    public int f182203j;

    /* renamed from: n */
    public String f182204n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64248b0)) {
            return false;
        }
        C64248b0 b0Var = (C64248b0) aVar;
        return C46238a.m51546a(this.BaseResponse, b0Var.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f182197d), Integer.valueOf(b0Var.f182197d)) && C46238a.m51546a(this.f182198e, b0Var.f182198e) && C46238a.m51546a(this.f182199f, b0Var.f182199f) && C46238a.m51546a(this.f182200g, b0Var.f182200g) && C46238a.m51546a(this.f182201h, b0Var.f182201h) && C46238a.m51546a(Integer.valueOf(this.f182202i), Integer.valueOf(b0Var.f182202i)) && C46238a.m51546a(Integer.valueOf(this.f182203j), Integer.valueOf(b0Var.f182203j)) && C46238a.m51546a(this.f182204n, b0Var.f182204n);
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
                aVar.mo74318e(2, this.f182197d);
                String str = this.f182198e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 8, this.f182199f);
                String str2 = this.f182200g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f182201h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                aVar.mo74318e(7, this.f182202i);
                aVar.mo74318e(8, this.f182203j);
                String str4 = this.f182204n;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f182197d);
            String str5 = this.f182198e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int g = e + C52418a.m58680g(4, 8, this.f182199f);
            String str6 = this.f182200g;
            if (str6 != null) {
                g += C52418a.m58683j(5, str6);
            }
            String str7 = this.f182201h;
            if (str7 != null) {
                g += C52418a.m58683j(6, str7);
            }
            int e2 = g + C52418a.m58678e(7, this.f182202i) + C52418a.m58678e(8, this.f182203j);
            String str8 = this.f182204n;
            return str8 != null ? e2 + C52418a.m58683j(9, str8) : e2;
        } else if (i == 2) {
            this.f182199f.clear();
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
            C64248b0 b0Var = objArr[1];
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
                        b0Var.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    b0Var.f182197d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    b0Var.f182198e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64566n nVar = new C64566n();
                        if (bArr2 != null && bArr2.length > 0) {
                            nVar.parseFrom(bArr2);
                        }
                        b0Var.f182199f.add(nVar);
                    }
                    return 0;
                case 5:
                    b0Var.f182200g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    b0Var.f182201h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    b0Var.f182202i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    b0Var.f182203j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    b0Var.f182204n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
