package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iz0 */
public class C49919iz0 extends C49335eu3 {

    /* renamed from: d */
    public long f135766d;

    /* renamed from: e */
    public long f135767e;

    /* renamed from: f */
    public String f135768f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49919iz0)) {
            return false;
        }
        C49919iz0 iz02 = (C49919iz0) aVar;
        return C46238a.m51546a(this.BaseResponse, iz02.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f135766d), Long.valueOf(iz02.f135766d)) && C46238a.m51546a(Long.valueOf(this.f135767e), Long.valueOf(iz02.f135767e)) && C46238a.m51546a(this.f135768f, iz02.f135768f);
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
            aVar.mo74321h(2, this.f135766d);
            aVar.mo74321h(3, this.f135767e);
            String str = this.f135768f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f135766d) + C52418a.m58681h(3, this.f135767e);
            String str2 = this.f135768f;
            return str2 != null ? h + C52418a.m58683j(4, str2) : h;
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
            C49919iz0 iz02 = objArr[1];
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
                    iz02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                iz02.f135766d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                iz02.f135767e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                iz02.f135768f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
