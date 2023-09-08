package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.md2 */
public class C50385md2 extends C49335eu3 {

    /* renamed from: d */
    public q45 f137956d;

    /* renamed from: e */
    public LinkedList<e55> f137957e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<e55> f137958f = new LinkedList<>();

    /* renamed from: g */
    public int f137959g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50385md2)) {
            return false;
        }
        C50385md2 md22 = (C50385md2) aVar;
        return C46238a.m51546a(this.BaseResponse, md22.BaseResponse) && C46238a.m51546a(this.f137956d, md22.f137956d) && C46238a.m51546a(this.f137957e, md22.f137957e) && C46238a.m51546a(this.f137958f, md22.f137958f) && C46238a.m51546a(Integer.valueOf(this.f137959g), Integer.valueOf(md22.f137959g));
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
                q45 q45 = this.f137956d;
                if (q45 != null) {
                    aVar.mo74322i(2, q45.computeSize());
                    this.f137956d.writeFields(aVar);
                }
                aVar.mo74320g(3, 8, this.f137957e);
                aVar.mo74320g(4, 8, this.f137958f);
                aVar.mo74318e(5, this.f137959g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            q45 q452 = this.f137956d;
            if (q452 != null) {
                i2 += C52418a.m58682i(2, q452.computeSize());
            }
            return i2 + C52418a.m58680g(3, 8, this.f137957e) + C52418a.m58680g(4, 8, this.f137958f) + C52418a.m58678e(5, this.f137959g);
        } else if (i == 2) {
            this.f137957e.clear();
            this.f137958f.clear();
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
            C50385md2 md22 = objArr[1];
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
                    md22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    q45 q453 = new q45();
                    if (bArr2 != null && bArr2.length > 0) {
                        q453.parseFrom(bArr2);
                    }
                    md22.f137956d = q453;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    e55 e55 = new e55();
                    if (bArr3 != null && bArr3.length > 0) {
                        e55.parseFrom(bArr3);
                    }
                    md22.f137957e.add(e55);
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    e55 e552 = new e55();
                    if (bArr4 != null && bArr4.length > 0) {
                        e552.parseFrom(bArr4);
                    }
                    md22.f137958f.add(e552);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                md22.f137959g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
