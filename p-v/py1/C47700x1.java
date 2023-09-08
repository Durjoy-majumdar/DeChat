package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.x1 */
public class C47700x1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C47693w0> f128134d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f128135e;

    /* renamed from: f */
    public boolean f128136f;

    /* renamed from: g */
    public String f128137g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47700x1)) {
            return false;
        }
        C47700x1 x1Var = (C47700x1) aVar;
        return C46238a.m51546a(this.BaseResponse, x1Var.BaseResponse) && C46238a.m51546a(this.f128134d, x1Var.f128134d) && C46238a.m51546a(this.f128135e, x1Var.f128135e) && C46238a.m51546a(Boolean.valueOf(this.f128136f), Boolean.valueOf(x1Var.f128136f)) && C46238a.m51546a(this.f128137g, x1Var.f128137g);
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
                aVar.mo74320g(2, 8, this.f128134d);
                C89349b bVar = this.f128135e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                aVar.mo74314a(4, this.f128136f);
                String str = this.f128137g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f128134d);
            C89349b bVar2 = this.f128135e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            int a = g + C52418a.m58674a(4, this.f128136f);
            String str2 = this.f128137g;
            return str2 != null ? a + C52418a.m58683j(5, str2) : a;
        } else if (i == 2) {
            this.f128134d.clear();
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
            C47700x1 x1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    x1Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47693w0 w0Var = new C47693w0();
                    if (bArr2 != null && bArr2.length > 0) {
                        w0Var.parseFrom(bArr2);
                    }
                    x1Var.f128134d.add(w0Var);
                }
                return 0;
            } else if (intValue == 3) {
                x1Var.f128135e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                x1Var.f128136f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                x1Var.f128137g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
