package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zp0 */
public class C52291zp0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C50767p11> f146165d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C48769aw> f146166e = new LinkedList<>();

    /* renamed from: f */
    public long f146167f;

    /* renamed from: g */
    public LinkedList<C50852pn2> f146168g = new LinkedList<>();

    /* renamed from: h */
    public long f146169h;

    /* renamed from: i */
    public long f146170i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52291zp0)) {
            return false;
        }
        C52291zp0 zp02 = (C52291zp0) aVar;
        return C46238a.m51546a(this.BaseResponse, zp02.BaseResponse) && C46238a.m51546a(this.f146165d, zp02.f146165d) && C46238a.m51546a(this.f146166e, zp02.f146166e) && C46238a.m51546a(Long.valueOf(this.f146167f), Long.valueOf(zp02.f146167f)) && C46238a.m51546a(this.f146168g, zp02.f146168g) && C46238a.m51546a(Long.valueOf(this.f146169h), Long.valueOf(zp02.f146169h)) && C46238a.m51546a(Long.valueOf(this.f146170i), Long.valueOf(zp02.f146170i));
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
            aVar.mo74320g(2, 8, this.f146165d);
            aVar.mo74320g(3, 8, this.f146166e);
            aVar.mo74321h(4, this.f146167f);
            aVar.mo74320g(5, 8, this.f146168g);
            aVar.mo74321h(6, this.f146169h);
            aVar.mo74321h(7, this.f146170i);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f146165d) + C52418a.m58680g(3, 8, this.f146166e) + C52418a.m58681h(4, this.f146167f) + C52418a.m58680g(5, 8, this.f146168g) + C52418a.m58681h(6, this.f146169h) + C52418a.m58681h(7, this.f146170i);
        } else if (i == 2) {
            this.f146165d.clear();
            this.f146166e.clear();
            this.f146168g.clear();
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
            C52291zp0 zp02 = objArr[1];
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
                        zp02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50767p11 p112 = new C50767p11();
                        if (bArr2 != null && bArr2.length > 0) {
                            p112.parseFrom(bArr2);
                        }
                        zp02.f146165d.add(p112);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48769aw awVar = new C48769aw();
                        if (bArr3 != null && bArr3.length > 0) {
                            awVar.parseFrom(bArr3);
                        }
                        zp02.f146166e.add(awVar);
                    }
                    return 0;
                case 4:
                    zp02.f146167f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50852pn2 pn22 = new C50852pn2();
                        if (bArr4 != null && bArr4.length > 0) {
                            pn22.parseFrom(bArr4);
                        }
                        zp02.f146168g.add(pn22);
                    }
                    return 0;
                case 6:
                    zp02.f146169h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    zp02.f146170i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
