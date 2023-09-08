package te3;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class j94 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<SnsObject> f135951d = new LinkedList<>();

    /* renamed from: e */
    public long f135952e;

    /* renamed from: f */
    public long f135953f;

    /* renamed from: g */
    public int f135954g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof j94)) {
            return false;
        }
        j94 j94 = (j94) aVar;
        return C46238a.m51546a(this.BaseResponse, j94.BaseResponse) && C46238a.m51546a(this.f135951d, j94.f135951d) && C46238a.m51546a(Long.valueOf(this.f135952e), Long.valueOf(j94.f135952e)) && C46238a.m51546a(Long.valueOf(this.f135953f), Long.valueOf(j94.f135953f)) && C46238a.m51546a(Integer.valueOf(this.f135954g), Integer.valueOf(j94.f135954g));
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
            aVar.mo74320g(2, 8, this.f135951d);
            aVar.mo74321h(3, this.f135952e);
            aVar.mo74321h(4, this.f135953f);
            aVar.mo74318e(5, this.f135954g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f135951d) + C52418a.m58681h(3, this.f135952e) + C52418a.m58681h(4, this.f135953f) + C52418a.m58678e(5, this.f135954g);
        } else if (i == 2) {
            this.f135951d.clear();
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
            j94 j94 = objArr[1];
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
                    j94.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    SnsObject snsObject = new SnsObject();
                    if (bArr2 != null && bArr2.length > 0) {
                        snsObject.parseFrom(bArr2);
                    }
                    j94.f135951d.add(snsObject);
                }
                return 0;
            } else if (intValue == 3) {
                j94.f135952e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                j94.f135953f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                j94.f135954g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
