package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ou4 extends C49335eu3 {

    /* renamed from: d */
    public long f139372d;

    /* renamed from: e */
    public long f139373e;

    /* renamed from: f */
    public int f139374f;

    /* renamed from: g */
    public int f139375g;

    /* renamed from: h */
    public int f139376h;

    /* renamed from: i */
    public int f139377i;

    /* renamed from: j */
    public C89349b f139378j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ou4)) {
            return false;
        }
        ou4 ou4 = (ou4) aVar;
        return C46238a.m51546a(this.BaseResponse, ou4.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f139372d), Long.valueOf(ou4.f139372d)) && C46238a.m51546a(Long.valueOf(this.f139373e), Long.valueOf(ou4.f139373e)) && C46238a.m51546a(Integer.valueOf(this.f139374f), Integer.valueOf(ou4.f139374f)) && C46238a.m51546a(Integer.valueOf(this.f139375g), Integer.valueOf(ou4.f139375g)) && C46238a.m51546a(Integer.valueOf(this.f139376h), Integer.valueOf(ou4.f139376h)) && C46238a.m51546a(Integer.valueOf(this.f139377i), Integer.valueOf(ou4.f139377i)) && C46238a.m51546a(this.f139378j, ou4.f139378j);
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
                aVar.mo74321h(2, this.f139372d);
                aVar.mo74321h(3, this.f139373e);
                aVar.mo74318e(4, this.f139374f);
                aVar.mo74318e(5, this.f139375g);
                aVar.mo74318e(6, this.f139376h);
                aVar.mo74318e(7, this.f139377i);
                C89349b bVar = this.f139378j;
                if (bVar != null) {
                    aVar.mo74315b(8, bVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f139372d) + C52418a.m58681h(3, this.f139373e) + C52418a.m58678e(4, this.f139374f) + C52418a.m58678e(5, this.f139375g) + C52418a.m58678e(6, this.f139376h) + C52418a.m58678e(7, this.f139377i);
            C89349b bVar2 = this.f139378j;
            return bVar2 != null ? h + C52418a.m58675b(8, bVar2) : h;
        } else if (i == 2) {
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
            ou4 ou4 = objArr[1];
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
                        ou4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ou4.f139372d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    ou4.f139373e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    ou4.f139374f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ou4.f139375g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ou4.f139376h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ou4.f139377i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ou4.f139378j = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
