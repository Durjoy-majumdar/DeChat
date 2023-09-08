package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sm2 */
public class C51268sm2 extends C101820nt3 {

    /* renamed from: d */
    public String f141607d;

    /* renamed from: e */
    public String f141608e;

    /* renamed from: f */
    public String f141609f;

    /* renamed from: g */
    public String f141610g;

    /* renamed from: h */
    public int f141611h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51268sm2)) {
            return false;
        }
        C51268sm2 sm22 = (C51268sm2) aVar;
        return C46238a.m51546a(this.BaseRequest, sm22.BaseRequest) && C46238a.m51546a(this.f141607d, sm22.f141607d) && C46238a.m51546a(this.f141608e, sm22.f141608e) && C46238a.m51546a(this.f141609f, sm22.f141609f) && C46238a.m51546a(this.f141610g, sm22.f141610g) && C46238a.m51546a(Integer.valueOf(this.f141611h), Integer.valueOf(sm22.f141611h));
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
            String str = this.f141607d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f141608e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f141609f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f141610g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f141611h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f141607d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f141608e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f141609f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f141610g;
            if (str8 != null) {
                i2 += C52418a.m58683j(5, str8);
            }
            return i2 + C52418a.m58678e(6, this.f141611h);
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
            C51268sm2 sm22 = objArr[1];
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
                        sm22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    sm22.f141607d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    sm22.f141608e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    sm22.f141609f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sm22.f141610g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sm22.f141611h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
