package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oh1 */
public class C50682oh1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f139180d;

    /* renamed from: e */
    public String f139181e;

    /* renamed from: f */
    public int f139182f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50682oh1)) {
            return false;
        }
        C50682oh1 oh12 = (C50682oh1) aVar;
        return C46238a.m51546a(this.BaseRequest, oh12.BaseRequest) && C46238a.m51546a(this.f139180d, oh12.f139180d) && C46238a.m51546a(this.f139181e, oh12.f139181e) && C46238a.m51546a(Integer.valueOf(this.f139182f), Integer.valueOf(oh12.f139182f));
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
            C49842ig0 ig02 = this.f139180d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f139180d.writeFields(aVar);
            }
            String str = this.f139181e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f139182f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f139180d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f139181e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            return i2 + C52418a.m58678e(4, this.f139182f);
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
            C50682oh1 oh12 = objArr[1];
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
                    oh12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    oh12.f139180d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                oh12.f139181e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                oh12.f139182f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
