package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yz0 */
public class C52188yz0 extends C49335eu3 {

    /* renamed from: d */
    public C89349b f145585d;

    /* renamed from: e */
    public int f145586e;

    /* renamed from: f */
    public int f145587f;

    /* renamed from: g */
    public LinkedList<C50465my0> f145588g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52188yz0)) {
            return false;
        }
        C52188yz0 yz02 = (C52188yz0) aVar;
        return C46238a.m51546a(this.BaseResponse, yz02.BaseResponse) && C46238a.m51546a(this.f145585d, yz02.f145585d) && C46238a.m51546a(Integer.valueOf(this.f145586e), Integer.valueOf(yz02.f145586e)) && C46238a.m51546a(Integer.valueOf(this.f145587f), Integer.valueOf(yz02.f145587f)) && C46238a.m51546a(this.f145588g, yz02.f145588g);
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
            C89349b bVar = this.f145585d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f145586e);
            aVar.mo74318e(4, this.f145587f);
            aVar.mo74320g(5, 8, this.f145588g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C89349b bVar2 = this.f145585d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58678e(3, this.f145586e) + C52418a.m58678e(4, this.f145587f) + C52418a.m58680g(5, 8, this.f145588g);
        } else if (i == 2) {
            this.f145588g.clear();
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
            C52188yz0 yz02 = objArr[1];
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
                    yz02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                yz02.f145585d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                yz02.f145586e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                yz02.f145587f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50465my0 my02 = new C50465my0();
                    if (bArr2 != null && bArr2.length > 0) {
                        my02.parseFrom(bArr2);
                    }
                    yz02.f145588g.add(my02);
                }
                return 0;
            }
        }
    }
}
