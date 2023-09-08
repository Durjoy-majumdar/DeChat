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

/* renamed from: py1.u4 */
public class C47685u4 extends C49335eu3 {

    /* renamed from: d */
    public boolean f128061d;

    /* renamed from: e */
    public String f128062e;

    /* renamed from: f */
    public String f128063f;

    /* renamed from: g */
    public C47673t f128064g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47685u4)) {
            return false;
        }
        C47685u4 u4Var = (C47685u4) aVar;
        return C46238a.m51546a(this.BaseResponse, u4Var.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f128061d), Boolean.valueOf(u4Var.f128061d)) && C46238a.m51546a(this.f128062e, u4Var.f128062e) && C46238a.m51546a(this.f128063f, u4Var.f128063f) && C46238a.m51546a(this.f128064g, u4Var.f128064g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f128062e == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f128063f != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74314a(2, this.f128061d);
                String str = this.f128062e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f128063f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                C47673t tVar = this.f128064g;
                if (tVar != null) {
                    aVar.mo74322i(5, tVar.computeSize());
                    this.f128064g.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Message");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int a = i2 + C52418a.m58674a(2, this.f128061d);
            String str3 = this.f128062e;
            if (str3 != null) {
                a += C52418a.m58683j(3, str3);
            }
            String str4 = this.f128063f;
            if (str4 != null) {
                a += C52418a.m58683j(4, str4);
            }
            C47673t tVar2 = this.f128064g;
            return tVar2 != null ? a + C52418a.m58682i(5, tVar2.computeSize()) : a;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f128062e == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f128063f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Message");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47685u4 u4Var = objArr[1];
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
                    u4Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                u4Var.f128061d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                u4Var.f128062e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                u4Var.f128063f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47673t tVar3 = new C47673t();
                    if (bArr2 != null && bArr2.length > 0) {
                        tVar3.parseFrom(bArr2);
                    }
                    u4Var.f128064g = tVar3;
                }
                return 0;
            }
        }
    }
}
