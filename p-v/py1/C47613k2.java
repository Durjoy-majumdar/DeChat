package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.k2 */
public class C47613k2 extends C101820nt3 {

    /* renamed from: d */
    public int f127829d;

    /* renamed from: e */
    public int f127830e;

    /* renamed from: f */
    public String f127831f;

    /* renamed from: g */
    public int f127832g;

    /* renamed from: h */
    public int f127833h;

    /* renamed from: i */
    public String f127834i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47613k2)) {
            return false;
        }
        C47613k2 k2Var = (C47613k2) aVar;
        return C46238a.m51546a(this.BaseRequest, k2Var.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f127829d), Integer.valueOf(k2Var.f127829d)) && C46238a.m51546a(Integer.valueOf(this.f127830e), Integer.valueOf(k2Var.f127830e)) && C46238a.m51546a(this.f127831f, k2Var.f127831f) && C46238a.m51546a(Integer.valueOf(this.f127832g), Integer.valueOf(k2Var.f127832g)) && C46238a.m51546a(Integer.valueOf(this.f127833h), Integer.valueOf(k2Var.f127833h)) && C46238a.m51546a(this.f127834i, k2Var.f127834i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f127831f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f127829d);
                aVar.mo74318e(3, this.f127830e);
                String str = this.f127831f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74318e(5, this.f127832g);
                aVar.mo74318e(6, this.f127833h);
                String str2 = this.f127834i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Lang");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f127829d) + C52418a.m58678e(3, this.f127830e);
            String str3 = this.f127831f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int e2 = e + C52418a.m58678e(5, this.f127832g) + C52418a.m58678e(6, this.f127833h);
            String str4 = this.f127834i;
            return str4 != null ? e2 + C52418a.m58683j(7, str4) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127831f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Lang");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47613k2 k2Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        k2Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    k2Var.f127829d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    k2Var.f127830e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    k2Var.f127831f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    k2Var.f127832g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    k2Var.f127833h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    k2Var.f127834i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
