package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yi0 */
public class C52120yi0 extends C49335eu3 {

    /* renamed from: d */
    public String f145306d;

    /* renamed from: e */
    public int f145307e;

    /* renamed from: f */
    public C49430fj0 f145308f;

    /* renamed from: g */
    public boolean f145309g;

    /* renamed from: h */
    public C48814b61 f145310h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52120yi0)) {
            return false;
        }
        C52120yi0 yi02 = (C52120yi0) aVar;
        return C46238a.m51546a(this.BaseResponse, yi02.BaseResponse) && C46238a.m51546a(this.f145306d, yi02.f145306d) && C46238a.m51546a(Integer.valueOf(this.f145307e), Integer.valueOf(yi02.f145307e)) && C46238a.m51546a(this.f145308f, yi02.f145308f) && C46238a.m51546a(Boolean.valueOf(this.f145309g), Boolean.valueOf(yi02.f145309g)) && C46238a.m51546a(this.f145310h, yi02.f145310h);
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
            String str = this.f145306d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f145307e);
            C49430fj0 fj02 = this.f145308f;
            if (fj02 != null) {
                aVar.mo74322i(4, fj02.computeSize());
                this.f145308f.writeFields(aVar);
            }
            aVar.mo74314a(5, this.f145309g);
            C48814b61 b612 = this.f145310h;
            if (b612 != null) {
                aVar.mo74322i(6, b612.computeSize());
                this.f145310h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f145306d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int e = i2 + C52418a.m58678e(3, this.f145307e);
            C49430fj0 fj03 = this.f145308f;
            if (fj03 != null) {
                e += C52418a.m58682i(4, fj03.computeSize());
            }
            int a = e + C52418a.m58674a(5, this.f145309g);
            C48814b61 b613 = this.f145310h;
            return b613 != null ? a + C52418a.m58682i(6, b613.computeSize()) : a;
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
            C52120yi0 yi02 = objArr[1];
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
                        yi02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    yi02.f145306d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yi02.f145307e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49430fj0 fj04 = new C49430fj0();
                        if (bArr2 != null && bArr2.length > 0) {
                            fj04.parseFrom(bArr2);
                        }
                        yi02.f145308f = fj04;
                    }
                    return 0;
                case 5:
                    yi02.f145309g = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48814b61 b614 = new C48814b61();
                        if (bArr3 != null && bArr3.length > 0) {
                            b614.parseFrom(bArr3);
                        }
                        yi02.f145310h = b614;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
