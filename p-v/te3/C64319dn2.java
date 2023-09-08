package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dn2 */
public class C64319dn2 extends C49335eu3 {

    /* renamed from: d */
    public int f182779d;

    /* renamed from: e */
    public LinkedList<C78019ym2> f182780e = new LinkedList<>();

    /* renamed from: f */
    public int f182781f;

    /* renamed from: g */
    public int f182782g;

    /* renamed from: h */
    public int f182783h;

    /* renamed from: i */
    public int f182784i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64319dn2)) {
            return false;
        }
        C64319dn2 dn22 = (C64319dn2) aVar;
        return C46238a.m51546a(this.BaseResponse, dn22.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f182779d), Integer.valueOf(dn22.f182779d)) && C46238a.m51546a(this.f182780e, dn22.f182780e) && C46238a.m51546a(Integer.valueOf(this.f182781f), Integer.valueOf(dn22.f182781f)) && C46238a.m51546a(Integer.valueOf(this.f182782g), Integer.valueOf(dn22.f182782g)) && C46238a.m51546a(Integer.valueOf(this.f182783h), Integer.valueOf(dn22.f182783h)) && C46238a.m51546a(Integer.valueOf(this.f182784i), Integer.valueOf(dn22.f182784i));
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
                aVar.mo74318e(2, this.f182779d);
                aVar.mo74320g(3, 8, this.f182780e);
                aVar.mo74318e(4, this.f182781f);
                aVar.mo74318e(5, this.f182782g);
                aVar.mo74318e(6, this.f182783h);
                aVar.mo74318e(7, this.f182784i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f182779d) + C52418a.m58680g(3, 8, this.f182780e) + C52418a.m58678e(4, this.f182781f) + C52418a.m58678e(5, this.f182782g) + C52418a.m58678e(6, this.f182783h) + C52418a.m58678e(7, this.f182784i);
        } else if (i == 2) {
            this.f182780e.clear();
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
            C64319dn2 dn22 = objArr[1];
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
                        dn22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    dn22.f182779d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C78019ym2 ym22 = new C78019ym2();
                        if (bArr2 != null && bArr2.length > 0) {
                            ym22.parseFrom(bArr2);
                        }
                        dn22.f182780e.add(ym22);
                    }
                    return 0;
                case 4:
                    dn22.f182781f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    dn22.f182782g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    dn22.f182783h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    dn22.f182784i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
