package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xj1 */
public class C51982xj1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C48727ak1> f144699d = new LinkedList<>();

    /* renamed from: e */
    public String f144700e;

    /* renamed from: f */
    public C89349b f144701f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51982xj1)) {
            return false;
        }
        C51982xj1 xj12 = (C51982xj1) aVar;
        return C46238a.m51546a(this.BaseResponse, xj12.BaseResponse) && C46238a.m51546a(this.f144699d, xj12.f144699d) && C46238a.m51546a(this.f144700e, xj12.f144700e) && C46238a.m51546a(this.f144701f, xj12.f144701f);
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
            aVar.mo74320g(2, 8, this.f144699d);
            String str = this.f144700e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f144701f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f144699d);
            String str2 = this.f144700e;
            if (str2 != null) {
                g += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f144701f;
            return bVar2 != null ? g + C52418a.m58675b(4, bVar2) : g;
        } else if (i == 2) {
            this.f144699d.clear();
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
            C51982xj1 xj12 = objArr[1];
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
                    xj12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48727ak1 ak12 = new C48727ak1();
                    if (bArr2 != null && bArr2.length > 0) {
                        ak12.parseFrom(bArr2);
                    }
                    xj12.f144699d.add(ak12);
                }
                return 0;
            } else if (intValue == 3) {
                xj12.f144700e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                xj12.f144701f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
