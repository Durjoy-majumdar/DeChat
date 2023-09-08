package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dx0 */
public class C49199dx0 extends C49335eu3 {

    /* renamed from: d */
    public String f132556d;

    /* renamed from: e */
    public long f132557e;

    /* renamed from: f */
    public String f132558f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49199dx0)) {
            return false;
        }
        C49199dx0 dx02 = (C49199dx0) aVar;
        return C46238a.m51546a(this.BaseResponse, dx02.BaseResponse) && C46238a.m51546a(this.f132556d, dx02.f132556d) && C46238a.m51546a(Long.valueOf(this.f132557e), Long.valueOf(dx02.f132557e)) && C46238a.m51546a(this.f132558f, dx02.f132558f);
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
            String str = this.f132556d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f132557e);
            String str2 = this.f132558f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f132556d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int h = i2 + C52418a.m58681h(3, this.f132557e);
            String str4 = this.f132558f;
            return str4 != null ? h + C52418a.m58683j(4, str4) : h;
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
            C49199dx0 dx02 = objArr[1];
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
                    dx02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                dx02.f132556d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                dx02.f132557e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                dx02.f132558f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
