package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pn3 */
public class C50853pn3 extends C101820nt3 {

    /* renamed from: d */
    public String f139841d;

    /* renamed from: e */
    public String f139842e;

    /* renamed from: f */
    public int f139843f;

    /* renamed from: g */
    public String f139844g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50853pn3)) {
            return false;
        }
        C50853pn3 pn32 = (C50853pn3) aVar;
        return C46238a.m51546a(this.BaseRequest, pn32.BaseRequest) && C46238a.m51546a(this.f139841d, pn32.f139841d) && C46238a.m51546a(this.f139842e, pn32.f139842e) && C46238a.m51546a(Integer.valueOf(this.f139843f), Integer.valueOf(pn32.f139843f)) && C46238a.m51546a(this.f139844g, pn32.f139844g);
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
            String str = this.f139841d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f139842e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f139843f);
            String str3 = this.f139844g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f139841d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f139842e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f139843f);
            String str6 = this.f139844g;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C50853pn3 pn32 = objArr[1];
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
                    pn32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                pn32.f139841d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                pn32.f139842e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                pn32.f139843f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                pn32.f139844g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
