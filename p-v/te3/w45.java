package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class w45 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<k55> f143857d = new LinkedList<>();

    /* renamed from: e */
    public q45 f143858e;

    /* renamed from: f */
    public String f143859f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof w45)) {
            return false;
        }
        w45 w45 = (w45) aVar;
        return C46238a.m51546a(this.BaseResponse, w45.BaseResponse) && C46238a.m51546a(this.f143857d, w45.f143857d) && C46238a.m51546a(this.f143858e, w45.f143858e) && C46238a.m51546a(this.f143859f, w45.f143859f);
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
            aVar.mo74320g(2, 8, this.f143857d);
            q45 q45 = this.f143858e;
            if (q45 != null) {
                aVar.mo74322i(3, q45.computeSize());
                this.f143858e.writeFields(aVar);
            }
            String str = this.f143859f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f143857d);
            q45 q452 = this.f143858e;
            if (q452 != null) {
                g += C52418a.m58682i(3, q452.computeSize());
            }
            String str2 = this.f143859f;
            return str2 != null ? g + C52418a.m58683j(4, str2) : g;
        } else if (i == 2) {
            this.f143857d.clear();
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
            w45 w45 = objArr[1];
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
                    w45.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    k55 k55 = new k55();
                    if (bArr2 != null && bArr2.length > 0) {
                        k55.parseFrom(bArr2);
                    }
                    w45.f143857d.add(k55);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    q45 q453 = new q45();
                    if (bArr3 != null && bArr3.length > 0) {
                        q453.parseFrom(bArr3);
                    }
                    w45.f143858e = q453;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                w45.f143859f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
