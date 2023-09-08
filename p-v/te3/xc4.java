package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class xc4 extends C101820nt3 {

    /* renamed from: d */
    public String f144591d;

    /* renamed from: e */
    public LinkedList<Integer> f144592e = new LinkedList<>();

    /* renamed from: f */
    public String f144593f;

    /* renamed from: g */
    public String f144594g;

    /* renamed from: h */
    public String f144595h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xc4)) {
            return false;
        }
        xc4 xc4 = (xc4) aVar;
        return C46238a.m51546a(this.BaseRequest, xc4.BaseRequest) && C46238a.m51546a(this.f144591d, xc4.f144591d) && C46238a.m51546a(this.f144592e, xc4.f144592e) && C46238a.m51546a(this.f144593f, xc4.f144593f) && C46238a.m51546a(this.f144594g, xc4.f144594g) && C46238a.m51546a(this.f144595h, xc4.f144595h);
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
            String str = this.f144591d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 2, this.f144592e);
            String str2 = this.f144593f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f144594g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f144595h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f144591d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int g = i2 + C52418a.m58680g(3, 2, this.f144592e);
            String str6 = this.f144593f;
            if (str6 != null) {
                g += C52418a.m58683j(4, str6);
            }
            String str7 = this.f144594g;
            if (str7 != null) {
                g += C52418a.m58683j(5, str7);
            }
            String str8 = this.f144595h;
            return str8 != null ? g + C52418a.m58683j(6, str8) : g;
        } else if (i == 2) {
            this.f144592e.clear();
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
            xc4 xc4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        xc4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    xc4.f144591d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xc4.f144592e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 4:
                    xc4.f144593f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xc4.f144594g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    xc4.f144595h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
