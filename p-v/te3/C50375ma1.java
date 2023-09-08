package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ma1 */
public class C50375ma1 extends C49335eu3 {

    /* renamed from: d */
    public boolean f137923d;

    /* renamed from: e */
    public String f137924e;

    /* renamed from: f */
    public C89349b f137925f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50375ma1)) {
            return false;
        }
        C50375ma1 ma12 = (C50375ma1) aVar;
        return C46238a.m51546a(this.BaseResponse, ma12.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f137923d), Boolean.valueOf(ma12.f137923d)) && C46238a.m51546a(this.f137924e, ma12.f137924e) && C46238a.m51546a(this.f137925f, ma12.f137925f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f137923d);
            String str = this.f137924e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f137925f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int a = i2 + C52418a.m58674a(2, this.f137923d);
            String str2 = this.f137924e;
            if (str2 != null) {
                a += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f137925f;
            return bVar2 != null ? a + C52418a.m58675b(4, bVar2) : a;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50375ma1 ma12 = objArr[1];
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
                    ma12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ma12.f137923d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                ma12.f137924e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ma12.f137925f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
