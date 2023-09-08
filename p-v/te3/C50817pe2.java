package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pe2 */
public class C50817pe2 extends C101820nt3 {

    /* renamed from: d */
    public String f139724d;

    /* renamed from: e */
    public String f139725e;

    /* renamed from: f */
    public String f139726f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50817pe2)) {
            return false;
        }
        C50817pe2 pe22 = (C50817pe2) aVar;
        return C46238a.m51546a(this.BaseRequest, pe22.BaseRequest) && C46238a.m51546a(this.f139724d, pe22.f139724d) && C46238a.m51546a(this.f139725e, pe22.f139725e) && C46238a.m51546a(this.f139726f, pe22.f139726f);
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
            String str = this.f139724d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f139725e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f139726f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f139724d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f139725e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f139726f;
            return str6 != null ? i2 + C52418a.m58683j(4, str6) : i2;
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
            C50817pe2 pe22 = objArr[1];
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
                    pe22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                pe22.f139724d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                pe22.f139725e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                pe22.f139726f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
