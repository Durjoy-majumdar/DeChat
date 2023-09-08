package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pr2 */
public class C50865pr2 extends C101820nt3 {

    /* renamed from: d */
    public int f139916d;

    /* renamed from: e */
    public int f139917e;

    /* renamed from: f */
    public int f139918f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50865pr2)) {
            return false;
        }
        C50865pr2 pr22 = (C50865pr2) aVar;
        return C46238a.m51546a(this.BaseRequest, pr22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f139916d), Integer.valueOf(pr22.f139916d)) && C46238a.m51546a(Integer.valueOf(this.f139917e), Integer.valueOf(pr22.f139917e)) && C46238a.m51546a(Integer.valueOf(this.f139918f), Integer.valueOf(pr22.f139918f));
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
            aVar.mo74318e(2, this.f139916d);
            aVar.mo74318e(3, this.f139917e);
            aVar.mo74318e(4, this.f139918f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f139916d) + C52418a.m58678e(3, this.f139917e) + C52418a.m58678e(4, this.f139918f);
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
            C50865pr2 pr22 = objArr[1];
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
                    pr22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                pr22.f139916d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                pr22.f139917e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                pr22.f139918f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
