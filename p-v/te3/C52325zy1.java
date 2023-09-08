package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zy1 */
public class C52325zy1 extends C49335eu3 {

    /* renamed from: d */
    public C49978jd3 f146279d;

    /* renamed from: e */
    public LinkedList<C101824o80> f146280e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C101800k70> f146281f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52325zy1)) {
            return false;
        }
        C52325zy1 zy12 = (C52325zy1) aVar;
        return C46238a.m51546a(this.BaseResponse, zy12.BaseResponse) && C46238a.m51546a(this.f146279d, zy12.f146279d) && C46238a.m51546a(this.f146280e, zy12.f146280e) && C46238a.m51546a(this.f146281f, zy12.f146281f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f146279d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C49978jd3 jd32 = this.f146279d;
                if (jd32 != null) {
                    aVar.mo74322i(2, jd32.computeSize());
                    this.f146279d.writeFields(aVar);
                }
                aVar.mo74320g(3, 8, this.f146280e);
                aVar.mo74320g(4, 8, this.f146281f);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Designer");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49978jd3 jd33 = this.f146279d;
            if (jd33 != null) {
                i2 += C52418a.m58682i(2, jd33.computeSize());
            }
            return i2 + C52418a.m58680g(3, 8, this.f146280e) + C52418a.m58680g(4, 8, this.f146281f);
        } else if (i == 2) {
            this.f146280e.clear();
            this.f146281f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f146279d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Designer");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52325zy1 zy12 = objArr[1];
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
                    zy12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49978jd3 jd34 = new C49978jd3();
                    if (bArr2 != null && bArr2.length > 0) {
                        jd34.parseFrom(bArr2);
                    }
                    zy12.f146279d = jd34;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C101824o80 o802 = new C101824o80();
                    if (bArr3 != null && bArr3.length > 0) {
                        o802.parseFrom(bArr3);
                    }
                    zy12.f146280e.add(o802);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C101800k70 k702 = new C101800k70();
                    if (bArr4 != null && bArr4.length > 0) {
                        k702.parseFrom(bArr4);
                    }
                    zy12.f146281f.add(k702);
                }
                return 0;
            }
        }
    }
}
