package ww1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ww1.e */
public class C53215e extends C49335eu3 {

    /* renamed from: d */
    public int f148448d;

    /* renamed from: e */
    public String f148449e;

    /* renamed from: f */
    public String f148450f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53215e)) {
            return false;
        }
        C53215e eVar = (C53215e) aVar;
        return C46238a.m51546a(this.BaseResponse, eVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f148448d), Integer.valueOf(eVar.f148448d)) && C46238a.m51546a(this.f148449e, eVar.f148449e) && C46238a.m51546a(this.f148450f, eVar.f148450f);
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
                aVar.mo74318e(2, this.f148448d);
                String str = this.f148449e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f148450f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f148448d);
            String str3 = this.f148449e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f148450f;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            C53215e eVar = objArr[1];
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
                    eVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                eVar.f148448d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                eVar.f148449e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                eVar.f148450f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
