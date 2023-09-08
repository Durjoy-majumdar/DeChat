package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pj3 */
public class C50840pj3 extends C101820nt3 {

    /* renamed from: d */
    public int f139793d;

    /* renamed from: e */
    public int f139794e;

    /* renamed from: f */
    public String f139795f;

    /* renamed from: g */
    public String f139796g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50840pj3)) {
            return false;
        }
        C50840pj3 pj32 = (C50840pj3) aVar;
        return C46238a.m51546a(this.BaseRequest, pj32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f139793d), Integer.valueOf(pj32.f139793d)) && C46238a.m51546a(Integer.valueOf(this.f139794e), Integer.valueOf(pj32.f139794e)) && C46238a.m51546a(this.f139795f, pj32.f139795f) && C46238a.m51546a(this.f139796g, pj32.f139796g);
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
            aVar.mo74318e(2, this.f139793d);
            aVar.mo74318e(3, this.f139794e);
            String str = this.f139795f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f139796g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139793d) + C52418a.m58678e(3, this.f139794e);
            String str3 = this.f139795f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            String str4 = this.f139796g;
            return str4 != null ? e + C52418a.m58683j(5, str4) : e;
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
            C50840pj3 pj32 = objArr[1];
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
                    pj32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                pj32.f139793d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                pj32.f139794e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                pj32.f139795f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                pj32.f139796g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
