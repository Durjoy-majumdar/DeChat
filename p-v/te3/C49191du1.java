package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.du1 */
public class C49191du1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C89349b> f132532d = new LinkedList<>();

    /* renamed from: e */
    public int f132533e;

    /* renamed from: f */
    public int f132534f;

    /* renamed from: g */
    public LinkedList<Integer> f132535g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49191du1)) {
            return false;
        }
        C49191du1 du12 = (C49191du1) aVar;
        return C46238a.m51546a(this.BaseResponse, du12.BaseResponse) && C46238a.m51546a(this.f132532d, du12.f132532d) && C46238a.m51546a(Integer.valueOf(this.f132533e), Integer.valueOf(du12.f132533e)) && C46238a.m51546a(Integer.valueOf(this.f132534f), Integer.valueOf(du12.f132534f)) && C46238a.m51546a(this.f132535g, du12.f132535g);
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
                aVar.mo74320g(2, 6, this.f132532d);
                aVar.mo74318e(3, this.f132533e);
                aVar.mo74318e(4, this.f132534f);
                aVar.mo74320g(5, 2, this.f132535g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 6, this.f132532d) + C52418a.m58678e(3, this.f132533e) + C52418a.m58678e(4, this.f132534f) + C52418a.m58680g(5, 2, this.f132535g);
        } else if (i == 2) {
            this.f132532d.clear();
            this.f132535g.clear();
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
            C49191du1 du12 = objArr[1];
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
                    du12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                du12.f132532d.add(aVar3.mo141626d(intValue));
                return 0;
            } else if (intValue == 3) {
                du12.f132533e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                du12.f132534f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                du12.f132535g.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            }
        }
    }
}
