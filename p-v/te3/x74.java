package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class x74 extends C49335eu3 {

    /* renamed from: d */
    public int f144508d;

    /* renamed from: e */
    public LinkedList<Integer> f144509e = new LinkedList<>();

    /* renamed from: f */
    public int f144510f;

    /* renamed from: g */
    public int f144511g;

    /* renamed from: h */
    public LinkedList<q94> f144512h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x74)) {
            return false;
        }
        x74 x74 = (x74) aVar;
        return C46238a.m51546a(this.BaseResponse, x74.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f144508d), Integer.valueOf(x74.f144508d)) && C46238a.m51546a(this.f144509e, x74.f144509e) && C46238a.m51546a(Integer.valueOf(this.f144510f), Integer.valueOf(x74.f144510f)) && C46238a.m51546a(Integer.valueOf(this.f144511g), Integer.valueOf(x74.f144511g)) && C46238a.m51546a(this.f144512h, x74.f144512h);
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
                aVar.mo74318e(2, this.f144508d);
                aVar.mo74324k(3, 2, this.f144509e);
                aVar.mo74318e(4, this.f144510f);
                aVar.mo74318e(5, this.f144511g);
                aVar.mo74320g(6, 8, this.f144512h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f144508d) + C52418a.m58684k(3, 2, this.f144509e) + C52418a.m58678e(4, this.f144510f) + C52418a.m58678e(5, this.f144511g) + C52418a.m58680g(6, 8, this.f144512h);
        } else if (i == 2) {
            this.f144509e.clear();
            this.f144512h.clear();
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
            x74 x74 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        x74.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    x74.f144508d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    byte[] bArr2 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr2, 0, bArr2.length);
                    LinkedList<Integer> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                    }
                    x74.f144509e = linkedList;
                    return 0;
                case 4:
                    x74.f144510f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    x74.f144511g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr3 = j2.get(i4);
                        q94 q94 = new q94();
                        if (bArr3 != null && bArr3.length > 0) {
                            q94.parseFrom(bArr3);
                        }
                        x74.f144512h.add(q94);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
