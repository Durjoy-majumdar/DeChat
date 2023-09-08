package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ps */
public class C50866ps extends C49335eu3 {

    /* renamed from: d */
    public String f139931d;

    /* renamed from: e */
    public C51223sc f139932e;

    /* renamed from: f */
    public C49234e5 f139933f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50866ps)) {
            return false;
        }
        C50866ps psVar = (C50866ps) aVar;
        return C46238a.m51546a(this.BaseResponse, psVar.BaseResponse) && C46238a.m51546a(this.f139931d, psVar.f139931d) && C46238a.m51546a(this.f139932e, psVar.f139932e) && C46238a.m51546a(this.f139933f, psVar.f139933f);
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
                String str = this.f139931d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C51223sc scVar = this.f139932e;
                if (scVar != null) {
                    aVar.mo74322i(3, scVar.computeSize());
                    this.f139932e.writeFields(aVar);
                }
                C49234e5 e5Var = this.f139933f;
                if (e5Var != null) {
                    aVar.mo74322i(4, e5Var.computeSize());
                    this.f139933f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f139931d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C51223sc scVar2 = this.f139932e;
            if (scVar2 != null) {
                i2 += C52418a.m58682i(3, scVar2.computeSize());
            }
            C49234e5 e5Var2 = this.f139933f;
            return e5Var2 != null ? i2 + C52418a.m58682i(4, e5Var2.computeSize()) : i2;
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
            C50866ps psVar = objArr[1];
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
                    psVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                psVar.f139931d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51223sc scVar3 = new C51223sc();
                    if (bArr2 != null && bArr2.length > 0) {
                        scVar3.parseFrom(bArr2);
                    }
                    psVar.f139932e = scVar3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49234e5 e5Var3 = new C49234e5();
                    if (bArr3 != null && bArr3.length > 0) {
                        e5Var3.parseFrom(bArr3);
                    }
                    psVar.f139933f = e5Var3;
                }
                return 0;
            }
        }
    }
}
