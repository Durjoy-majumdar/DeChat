package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uq */
public class C51582uq extends C49335eu3 {

    /* renamed from: d */
    public String f143026d;

    /* renamed from: e */
    public String f143027e;

    /* renamed from: f */
    public int f143028f;

    /* renamed from: g */
    public C49139df2 f143029g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51582uq)) {
            return false;
        }
        C51582uq uqVar = (C51582uq) aVar;
        return C46238a.m51546a(this.BaseResponse, uqVar.BaseResponse) && C46238a.m51546a(this.f143026d, uqVar.f143026d) && C46238a.m51546a(this.f143027e, uqVar.f143027e) && C46238a.m51546a(Integer.valueOf(this.f143028f), Integer.valueOf(uqVar.f143028f)) && C46238a.m51546a(this.f143029g, uqVar.f143029g);
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
                String str = this.f143026d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f143027e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f143028f);
                C49139df2 df22 = this.f143029g;
                if (df22 != null) {
                    aVar.mo74322i(5, df22.computeSize());
                    this.f143029g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f143026d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f143027e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int e = i2 + C52418a.m58678e(4, this.f143028f);
            C49139df2 df23 = this.f143029g;
            return df23 != null ? e + C52418a.m58682i(5, df23.computeSize()) : e;
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
            C51582uq uqVar = objArr[1];
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
                    uqVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                uqVar.f143026d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                uqVar.f143027e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                uqVar.f143028f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49139df2 df24 = new C49139df2();
                    if (bArr2 != null && bArr2.length > 0) {
                        df24.parseFrom(bArr2);
                    }
                    uqVar.f143029g = df24;
                }
                return 0;
            }
        }
    }
}
