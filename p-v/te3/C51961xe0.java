package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xe0 */
public class C51961xe0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C51686ve0> f144621d = new LinkedList<>();

    /* renamed from: e */
    public int f144622e;

    /* renamed from: f */
    public C89349b f144623f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51961xe0)) {
            return false;
        }
        C51961xe0 xe02 = (C51961xe0) aVar;
        return C46238a.m51546a(this.BaseResponse, xe02.BaseResponse) && C46238a.m51546a(this.f144621d, xe02.f144621d) && C46238a.m51546a(Integer.valueOf(this.f144622e), Integer.valueOf(xe02.f144622e)) && C46238a.m51546a(this.f144623f, xe02.f144623f);
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
            aVar.mo74320g(2, 8, this.f144621d);
            aVar.mo74318e(3, this.f144622e);
            C89349b bVar = this.f144623f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f144621d) + C52418a.m58678e(3, this.f144622e);
            C89349b bVar2 = this.f144623f;
            return bVar2 != null ? g + C52418a.m58675b(4, bVar2) : g;
        } else if (i == 2) {
            this.f144621d.clear();
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
            C51961xe0 xe02 = objArr[1];
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
                    xe02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51686ve0 ve02 = new C51686ve0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ve02.parseFrom(bArr2);
                    }
                    xe02.f144621d.add(ve02);
                }
                return 0;
            } else if (intValue == 3) {
                xe02.f144622e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                xe02.f144623f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
