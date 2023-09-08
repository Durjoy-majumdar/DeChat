package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h7 */
public class C49667h7 extends C49335eu3 {

    /* renamed from: d */
    public int f134471d;

    /* renamed from: e */
    public String f134472e;

    /* renamed from: f */
    public C51360t9 f134473f;

    /* renamed from: g */
    public String f134474g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49667h7)) {
            return false;
        }
        C49667h7 h7Var = (C49667h7) aVar;
        return C46238a.m51546a(this.BaseResponse, h7Var.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f134471d), Integer.valueOf(h7Var.f134471d)) && C46238a.m51546a(this.f134472e, h7Var.f134472e) && C46238a.m51546a(this.f134473f, h7Var.f134473f) && C46238a.m51546a(this.f134474g, h7Var.f134474g);
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
                aVar.mo74318e(2, this.f134471d);
                String str = this.f134472e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C51360t9 t9Var = this.f134473f;
                if (t9Var != null) {
                    aVar.mo74322i(4, t9Var.computeSize());
                    this.f134473f.writeFields(aVar);
                }
                String str2 = this.f134474g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134471d);
            String str3 = this.f134472e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            C51360t9 t9Var2 = this.f134473f;
            if (t9Var2 != null) {
                e += C52418a.m58682i(4, t9Var2.computeSize());
            }
            String str4 = this.f134474g;
            return str4 != null ? e + C52418a.m58683j(5, str4) : e;
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
            C49667h7 h7Var = objArr[1];
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
                    h7Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                h7Var.f134471d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                h7Var.f134472e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51360t9 t9Var3 = new C51360t9();
                    if (bArr2 != null && bArr2.length > 0) {
                        t9Var3.parseFrom(bArr2);
                    }
                    h7Var.f134473f = t9Var3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                h7Var.f134474g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
