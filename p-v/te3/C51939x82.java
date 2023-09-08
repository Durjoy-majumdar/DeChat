package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x82 */
public class C51939x82 extends C101820nt3 {

    /* renamed from: d */
    public String f144520d;

    /* renamed from: e */
    public String f144521e;

    /* renamed from: f */
    public String f144522f;

    /* renamed from: g */
    public String f144523g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51939x82)) {
            return false;
        }
        C51939x82 x822 = (C51939x82) aVar;
        return C46238a.m51546a(this.BaseRequest, x822.BaseRequest) && C46238a.m51546a(this.f144520d, x822.f144520d) && C46238a.m51546a(this.f144521e, x822.f144521e) && C46238a.m51546a(this.f144522f, x822.f144522f) && C46238a.m51546a(this.f144523g, x822.f144523g);
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
            String str = this.f144520d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144521e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f144522f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f144523g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f144520d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f144521e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f144522f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f144523g;
            return str8 != null ? i2 + C52418a.m58683j(5, str8) : i2;
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
            C51939x82 x822 = objArr[1];
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
                    x822.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                x822.f144520d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                x822.f144521e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                x822.f144522f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                x822.f144523g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
