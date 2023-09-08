package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vy1 */
public class C51755vy1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C101800k70> f143767d = new LinkedList<>();

    /* renamed from: e */
    public C51018qv3 f143768e;

    /* renamed from: f */
    public LinkedList<C50791p70> f143769f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51755vy1)) {
            return false;
        }
        C51755vy1 vy12 = (C51755vy1) aVar;
        return C46238a.m51546a(this.BaseResponse, vy12.BaseResponse) && C46238a.m51546a(this.f143767d, vy12.f143767d) && C46238a.m51546a(this.f143768e, vy12.f143768e) && C46238a.m51546a(this.f143769f, vy12.f143769f);
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
                aVar.mo74320g(2, 8, this.f143767d);
                C51018qv3 qv32 = this.f143768e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f143768e.writeFields(aVar);
                }
                aVar.mo74320g(4, 8, this.f143769f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f143767d);
            C51018qv3 qv33 = this.f143768e;
            if (qv33 != null) {
                g += C52418a.m58682i(3, qv33.computeSize());
            }
            return g + C52418a.m58680g(4, 8, this.f143769f);
        } else if (i == 2) {
            this.f143767d.clear();
            this.f143769f.clear();
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
            C51755vy1 vy12 = objArr[1];
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
                    vy12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C101800k70 k702 = new C101800k70();
                    if (bArr2 != null && bArr2.length > 0) {
                        k702.parseFrom(bArr2);
                    }
                    vy12.f143767d.add(k702);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        qv34.mo73348f(bArr3);
                    }
                    vy12.f143768e = qv34;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C50791p70 p702 = new C50791p70();
                    if (bArr4 != null && bArr4.length > 0) {
                        p702.parseFrom(bArr4);
                    }
                    vy12.f143769f.add(p702);
                }
                return 0;
            }
        }
    }
}
