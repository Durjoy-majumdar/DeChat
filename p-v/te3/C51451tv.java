package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tv */
public class C51451tv extends C49335eu3 {

    /* renamed from: d */
    public String f142433d;

    /* renamed from: e */
    public String f142434e;

    /* renamed from: f */
    public int f142435f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51451tv)) {
            return false;
        }
        C51451tv tvVar = (C51451tv) aVar;
        return C46238a.m51546a(this.BaseResponse, tvVar.BaseResponse) && C46238a.m51546a(this.f142433d, tvVar.f142433d) && C46238a.m51546a(this.f142434e, tvVar.f142434e) && C46238a.m51546a(Integer.valueOf(this.f142435f), Integer.valueOf(tvVar.f142435f));
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
                String str = this.f142433d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f142434e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f142435f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f142433d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f142434e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58678e(4, this.f142435f);
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
            C51451tv tvVar = objArr[1];
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
                    tvVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                tvVar.f142433d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                tvVar.f142434e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                tvVar.f142435f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
