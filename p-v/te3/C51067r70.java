package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r70 */
public class C51067r70 extends C49335eu3 {

    /* renamed from: d */
    public boolean f140738d;

    /* renamed from: e */
    public String f140739e;

    /* renamed from: f */
    public String f140740f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51067r70)) {
            return false;
        }
        C51067r70 r702 = (C51067r70) aVar;
        return C46238a.m51546a(this.BaseResponse, r702.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f140738d), Boolean.valueOf(r702.f140738d)) && C46238a.m51546a(this.f140739e, r702.f140739e) && C46238a.m51546a(this.f140740f, r702.f140740f);
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
                aVar.mo74314a(2, this.f140738d);
                String str = this.f140739e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f140740f;
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
            int a = i2 + C52418a.m58674a(2, this.f140738d);
            String str3 = this.f140739e;
            if (str3 != null) {
                a += C52418a.m58683j(3, str3);
            }
            String str4 = this.f140740f;
            return str4 != null ? a + C52418a.m58683j(4, str4) : a;
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
            C51067r70 r702 = objArr[1];
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
                    r702.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                r702.f140738d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                r702.f140739e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                r702.f140740f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
