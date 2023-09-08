package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pv1 */
public class C50881pv1 extends C49335eu3 {

    /* renamed from: d */
    public int f139998d;

    /* renamed from: e */
    public String f139999e;

    /* renamed from: f */
    public LinkedList<C51360t9> f140000f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C51360t9> f140001g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50881pv1)) {
            return false;
        }
        C50881pv1 pv12 = (C50881pv1) aVar;
        return C46238a.m51546a(this.BaseResponse, pv12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139998d), Integer.valueOf(pv12.f139998d)) && C46238a.m51546a(this.f139999e, pv12.f139999e) && C46238a.m51546a(this.f140000f, pv12.f140000f) && C46238a.m51546a(this.f140001g, pv12.f140001g);
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
                aVar.mo74318e(2, this.f139998d);
                String str = this.f139999e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 8, this.f140000f);
                aVar.mo74320g(5, 8, this.f140001g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139998d);
            String str2 = this.f139999e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58680g(4, 8, this.f140000f) + C52418a.m58680g(5, 8, this.f140001g);
        } else if (i == 2) {
            this.f140000f.clear();
            this.f140001g.clear();
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
            C50881pv1 pv12 = objArr[1];
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
                    pv12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                pv12.f139998d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                pv12.f139999e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51360t9 t9Var = new C51360t9();
                    if (bArr2 != null && bArr2.length > 0) {
                        t9Var.parseFrom(bArr2);
                    }
                    pv12.f140000f.add(t9Var);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51360t9 t9Var2 = new C51360t9();
                    if (bArr3 != null && bArr3.length > 0) {
                        t9Var2.parseFrom(bArr3);
                    }
                    pv12.f140001g.add(t9Var2);
                }
                return 0;
            }
        }
    }
}
