package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qu1 */
public class C51014qu1 extends C49335eu3 {

    /* renamed from: d */
    public int f140555d;

    /* renamed from: e */
    public String f140556e;

    /* renamed from: f */
    public C77987qh2 f140557f;

    /* renamed from: g */
    public C77991rh2 f140558g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51014qu1)) {
            return false;
        }
        C51014qu1 qu12 = (C51014qu1) aVar;
        return C46238a.m51546a(this.BaseResponse, qu12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f140555d), Integer.valueOf(qu12.f140555d)) && C46238a.m51546a(this.f140556e, qu12.f140556e) && C46238a.m51546a(this.f140557f, qu12.f140557f) && C46238a.m51546a(this.f140558g, qu12.f140558g);
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
                aVar.mo74318e(2, this.f140555d);
                String str = this.f140556e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C77987qh2 qh22 = this.f140557f;
                if (qh22 != null) {
                    aVar.mo74322i(4, qh22.computeSize());
                    this.f140557f.writeFields(aVar);
                }
                C77991rh2 rh22 = this.f140558g;
                if (rh22 != null) {
                    aVar.mo74322i(5, rh22.computeSize());
                    this.f140558g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140555d);
            String str2 = this.f140556e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C77987qh2 qh23 = this.f140557f;
            if (qh23 != null) {
                e += C52418a.m58682i(4, qh23.computeSize());
            }
            C77991rh2 rh23 = this.f140558g;
            return rh23 != null ? e + C52418a.m58682i(5, rh23.computeSize()) : e;
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
            C51014qu1 qu12 = objArr[1];
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
                    qu12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                qu12.f140555d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                qu12.f140556e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77987qh2 qh24 = new C77987qh2();
                    if (bArr2 != null && bArr2.length > 0) {
                        qh24.parseFrom(bArr2);
                    }
                    qu12.f140557f = qh24;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C77991rh2 rh24 = new C77991rh2();
                    if (bArr3 != null && bArr3.length > 0) {
                        rh24.parseFrom(bArr3);
                    }
                    qu12.f140558g = rh24;
                }
                return 0;
            }
        }
    }
}
