package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class uf4 extends C49335eu3 {

    /* renamed from: d */
    public C51018qv3 f185731d;

    /* renamed from: e */
    public int f185732e;

    /* renamed from: f */
    public String f185733f;

    /* renamed from: g */
    public int f185734g;

    /* renamed from: h */
    public int f185735h;

    /* renamed from: i */
    public String f185736i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof uf4)) {
            return false;
        }
        uf4 uf4 = (uf4) aVar;
        return C46238a.m51546a(this.BaseResponse, uf4.BaseResponse) && C46238a.m51546a(this.f185731d, uf4.f185731d) && C46238a.m51546a(Integer.valueOf(this.f185732e), Integer.valueOf(uf4.f185732e)) && C46238a.m51546a(this.f185733f, uf4.f185733f) && C46238a.m51546a(Integer.valueOf(this.f185734g), Integer.valueOf(uf4.f185734g)) && C46238a.m51546a(Integer.valueOf(this.f185735h), Integer.valueOf(uf4.f185735h)) && C46238a.m51546a(this.f185736i, uf4.f185736i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f185731d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f185731d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f185731d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f185732e);
                String str = this.f185733f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74318e(5, this.f185734g);
                aVar.mo74318e(6, this.f185735h);
                String str2 = this.f185736i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RetText");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f185731d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f185732e);
            String str3 = this.f185733f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int e2 = e + C52418a.m58678e(5, this.f185734g) + C52418a.m58678e(6, this.f185735h);
            String str4 = this.f185736i;
            return str4 != null ? e2 + C52418a.m58683j(7, str4) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f185731d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RetText");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            uf4 uf4 = objArr[1];
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
                        uf4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        uf4.f185731d = qv34;
                    }
                    return 0;
                case 3:
                    uf4.f185732e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    uf4.f185733f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    uf4.f185734g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    uf4.f185735h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    uf4.f185736i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
