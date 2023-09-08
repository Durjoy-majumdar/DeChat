package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vz1 */
public class C51759vz1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C50094k80> f143782d = new LinkedList<>();

    /* renamed from: e */
    public int f143783e;

    /* renamed from: f */
    public LinkedList<C49528g80> f143784f = new LinkedList<>();

    /* renamed from: g */
    public C50228l80 f143785g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51759vz1)) {
            return false;
        }
        C51759vz1 vz12 = (C51759vz1) aVar;
        return C46238a.m51546a(this.BaseResponse, vz12.BaseResponse) && C46238a.m51546a(this.f143782d, vz12.f143782d) && C46238a.m51546a(Integer.valueOf(this.f143783e), Integer.valueOf(vz12.f143783e)) && C46238a.m51546a(this.f143784f, vz12.f143784f) && C46238a.m51546a(this.f143785g, vz12.f143785g);
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
                aVar.mo74320g(2, 8, this.f143782d);
                aVar.mo74318e(3, this.f143783e);
                aVar.mo74320g(4, 8, this.f143784f);
                C50228l80 l802 = this.f143785g;
                if (l802 != null) {
                    aVar.mo74322i(5, l802.computeSize());
                    this.f143785g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f143782d) + C52418a.m58678e(3, this.f143783e) + C52418a.m58680g(4, 8, this.f143784f);
            C50228l80 l803 = this.f143785g;
            return l803 != null ? g + C52418a.m58682i(5, l803.computeSize()) : g;
        } else if (i == 2) {
            this.f143782d.clear();
            this.f143784f.clear();
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
            C51759vz1 vz12 = objArr[1];
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
                    vz12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50094k80 k802 = new C50094k80();
                    if (bArr2 != null && bArr2.length > 0) {
                        k802.parseFrom(bArr2);
                    }
                    vz12.f143782d.add(k802);
                }
                return 0;
            } else if (intValue == 3) {
                vz12.f143783e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49528g80 g802 = new C49528g80();
                    if (bArr3 != null && bArr3.length > 0) {
                        g802.parseFrom(bArr3);
                    }
                    vz12.f143784f.add(g802);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C50228l80 l804 = new C50228l80();
                    if (bArr4 != null && bArr4.length > 0) {
                        l804.parseFrom(bArr4);
                    }
                    vz12.f143785g = l804;
                }
                return 0;
            }
        }
    }
}
