package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y60 */
public class C52073y60 extends C49335eu3 {

    /* renamed from: d */
    public long f145137d;

    /* renamed from: e */
    public LinkedList<C51651v60> f145138e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52073y60)) {
            return false;
        }
        C52073y60 y602 = (C52073y60) aVar;
        return C46238a.m51546a(this.BaseResponse, y602.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f145137d), Long.valueOf(y602.f145137d)) && C46238a.m51546a(this.f145138e, y602.f145138e);
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
                aVar.mo74321h(2, this.f145137d);
                aVar.mo74320g(3, 8, this.f145138e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f145137d) + C52418a.m58680g(3, 8, this.f145138e);
        } else if (i == 2) {
            this.f145138e.clear();
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
            C52073y60 y602 = objArr[1];
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
                    y602.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                y602.f145137d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51651v60 v602 = new C51651v60();
                    if (bArr2 != null && bArr2.length > 0) {
                        v602.parseFrom(bArr2);
                    }
                    y602.f145138e.add(v602);
                }
                return 0;
            }
        }
    }
}
