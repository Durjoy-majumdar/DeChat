package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s8 */
public class C51208s8 extends C49335eu3 {

    /* renamed from: d */
    public C51018qv3 f141367d;

    /* renamed from: e */
    public C51018qv3 f141368e;

    /* renamed from: f */
    public C51971xg2 f141369f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51208s8)) {
            return false;
        }
        C51208s8 s8Var = (C51208s8) aVar;
        return C46238a.m51546a(this.BaseResponse, s8Var.BaseResponse) && C46238a.m51546a(this.f141367d, s8Var.f141367d) && C46238a.m51546a(this.f141368e, s8Var.f141368e) && C46238a.m51546a(this.f141369f, s8Var.f141369f);
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
                C51018qv3 qv32 = this.f141367d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f141367d.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f141368e;
                if (qv33 != null) {
                    aVar.mo74322i(3, qv33.computeSize());
                    this.f141368e.writeFields(aVar);
                }
                C51971xg2 xg22 = this.f141369f;
                if (xg22 != null) {
                    aVar.mo74322i(4, xg22.computeSize());
                    this.f141369f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51018qv3 qv34 = this.f141367d;
            if (qv34 != null) {
                i2 += C52418a.m58682i(2, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f141368e;
            if (qv35 != null) {
                i2 += C52418a.m58682i(3, qv35.computeSize());
            }
            C51971xg2 xg23 = this.f141369f;
            return xg23 != null ? i2 + C52418a.m58682i(4, xg23.computeSize()) : i2;
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
            C51208s8 s8Var = objArr[1];
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
                    s8Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv36 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv36.mo73348f(bArr2);
                    }
                    s8Var.f141367d = qv36;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51018qv3 qv37 = new C51018qv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        qv37.mo73348f(bArr3);
                    }
                    s8Var.f141368e = qv37;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C51971xg2 xg24 = new C51971xg2();
                    if (bArr4 != null && bArr4.length > 0) {
                        xg24.parseFrom(bArr4);
                    }
                    s8Var.f141369f = xg24;
                }
                return 0;
            }
        }
    }
}
