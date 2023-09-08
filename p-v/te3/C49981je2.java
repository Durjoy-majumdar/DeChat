package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.je2 */
public class C49981je2 extends C49335eu3 {

    /* renamed from: d */
    public String f136047d;

    /* renamed from: e */
    public int f136048e;

    /* renamed from: f */
    public String f136049f;

    /* renamed from: g */
    public C49899iu2 f136050g;

    /* renamed from: h */
    public int f136051h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49981je2)) {
            return false;
        }
        C49981je2 je22 = (C49981je2) aVar;
        return C46238a.m51546a(this.BaseResponse, je22.BaseResponse) && C46238a.m51546a(this.f136047d, je22.f136047d) && C46238a.m51546a(Integer.valueOf(this.f136048e), Integer.valueOf(je22.f136048e)) && C46238a.m51546a(this.f136049f, je22.f136049f) && C46238a.m51546a(this.f136050g, je22.f136050g) && C46238a.m51546a(Integer.valueOf(this.f136051h), Integer.valueOf(je22.f136051h));
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
            String str = this.f136047d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f136048e);
            String str2 = this.f136049f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C49899iu2 iu22 = this.f136050g;
            if (iu22 != null) {
                aVar.mo74322i(5, iu22.computeSize());
                this.f136050g.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f136051h);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f136047d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f136048e);
            String str4 = this.f136049f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            C49899iu2 iu23 = this.f136050g;
            if (iu23 != null) {
                e += C52418a.m58682i(5, iu23.computeSize());
            }
            return e + C52418a.m58678e(6, this.f136051h);
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
            C49981je2 je22 = objArr[1];
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
                        je22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    je22.f136047d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    je22.f136048e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    je22.f136049f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49899iu2 iu24 = new C49899iu2();
                        if (bArr2 != null && bArr2.length > 0) {
                            iu24.parseFrom(bArr2);
                        }
                        je22.f136050g = iu24;
                    }
                    return 0;
                case 6:
                    je22.f136051h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
