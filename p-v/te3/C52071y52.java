package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y52 */
public class C52071y52 extends C101820nt3 {

    /* renamed from: d */
    public int f145124d;

    /* renamed from: e */
    public int f145125e;

    /* renamed from: f */
    public int f145126f;

    /* renamed from: g */
    public int f145127g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52071y52)) {
            return false;
        }
        C52071y52 y522 = (C52071y52) aVar;
        return C46238a.m51546a(this.BaseRequest, y522.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f145124d), Integer.valueOf(y522.f145124d)) && C46238a.m51546a(Integer.valueOf(this.f145125e), Integer.valueOf(y522.f145125e)) && C46238a.m51546a(Integer.valueOf(this.f145126f), Integer.valueOf(y522.f145126f)) && C46238a.m51546a(Integer.valueOf(this.f145127g), Integer.valueOf(y522.f145127g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f145124d);
            aVar.mo74318e(3, this.f145125e);
            aVar.mo74318e(4, this.f145126f);
            aVar.mo74318e(5, this.f145127g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f145124d) + C52418a.m58678e(3, this.f145125e) + C52418a.m58678e(4, this.f145126f) + C52418a.m58678e(5, this.f145127g);
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
            C52071y52 y522 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    y522.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                y522.f145124d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                y522.f145125e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                y522.f145126f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                y522.f145127g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
