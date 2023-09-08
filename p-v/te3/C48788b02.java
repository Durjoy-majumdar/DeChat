package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b02 */
public class C48788b02 extends C101820nt3 {

    /* renamed from: d */
    public int f130869d;

    /* renamed from: e */
    public String f130870e;

    /* renamed from: f */
    public C89349b f130871f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48788b02)) {
            return false;
        }
        C48788b02 b022 = (C48788b02) aVar;
        return C46238a.m51546a(this.BaseRequest, b022.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f130869d), Integer.valueOf(b022.f130869d)) && C46238a.m51546a(this.f130870e, b022.f130870e) && C46238a.m51546a(this.f130871f, b022.f130871f);
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
            aVar.mo74318e(2, this.f130869d);
            String str = this.f130870e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f130871f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f130869d);
            String str2 = this.f130870e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f130871f;
            return bVar2 != null ? e + C52418a.m58675b(4, bVar2) : e;
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
            C48788b02 b022 = objArr[1];
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
                    b022.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                b022.f130869d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                b022.f130870e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                b022.f130871f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
