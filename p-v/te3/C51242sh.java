package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sh */
public class C51242sh extends C49335eu3 {

    /* renamed from: d */
    public int f141506d;

    /* renamed from: e */
    public String f141507e;

    /* renamed from: f */
    public LinkedList<C50832pi> f141508f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51242sh)) {
            return false;
        }
        C51242sh shVar = (C51242sh) aVar;
        return C46238a.m51546a(this.BaseResponse, shVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141506d), Integer.valueOf(shVar.f141506d)) && C46238a.m51546a(this.f141507e, shVar.f141507e) && C46238a.m51546a(this.f141508f, shVar.f141508f);
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
                aVar.mo74318e(2, this.f141506d);
                String str = this.f141507e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 8, this.f141508f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141506d);
            String str2 = this.f141507e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58680g(4, 8, this.f141508f);
        } else if (i == 2) {
            this.f141508f.clear();
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
            C51242sh shVar = objArr[1];
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
                    shVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                shVar.f141506d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                shVar.f141507e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50832pi piVar = new C50832pi();
                    if (bArr2 != null && bArr2.length > 0) {
                        piVar.parseFrom(bArr2);
                    }
                    shVar.f141508f.add(piVar);
                }
                return 0;
            }
        }
    }
}
