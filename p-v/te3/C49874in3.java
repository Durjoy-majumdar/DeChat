package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.in3 */
public class C49874in3 extends C101820nt3 {

    /* renamed from: d */
    public String f135522d;

    /* renamed from: e */
    public String f135523e;

    /* renamed from: f */
    public String f135524f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49874in3)) {
            return false;
        }
        C49874in3 in32 = (C49874in3) aVar;
        return C46238a.m51546a(this.BaseRequest, in32.BaseRequest) && C46238a.m51546a(this.f135522d, in32.f135522d) && C46238a.m51546a(this.f135523e, in32.f135523e) && C46238a.m51546a(this.f135524f, in32.f135524f);
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
            String str = this.f135522d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f135523e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f135524f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f135522d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f135523e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f135524f;
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
            C49874in3 in32 = objArr[1];
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
                    in32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                in32.f135522d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                in32.f135523e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                in32.f135524f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
