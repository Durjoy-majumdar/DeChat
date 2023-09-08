package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ls2 */
public class C50305ls2 extends C101820nt3 {

    /* renamed from: d */
    public String f137629d;

    /* renamed from: e */
    public String f137630e;

    /* renamed from: f */
    public String f137631f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50305ls2)) {
            return false;
        }
        C50305ls2 ls22 = (C50305ls2) aVar;
        return C46238a.m51546a(this.BaseRequest, ls22.BaseRequest) && C46238a.m51546a(this.f137629d, ls22.f137629d) && C46238a.m51546a(this.f137630e, ls22.f137630e) && C46238a.m51546a(this.f137631f, ls22.f137631f);
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
            String str = this.f137629d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f137630e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f137631f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f137629d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f137630e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f137631f;
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
            C50305ls2 ls22 = objArr[1];
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
                    ls22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ls22.f137629d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ls22.f137630e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ls22.f137631f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
