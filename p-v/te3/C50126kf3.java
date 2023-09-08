package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kf3 */
public class C50126kf3 extends C101820nt3 {

    /* renamed from: d */
    public int f136766d;

    /* renamed from: e */
    public int f136767e;

    /* renamed from: f */
    public String f136768f;

    /* renamed from: g */
    public String f136769g;

    /* renamed from: h */
    public String f136770h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50126kf3)) {
            return false;
        }
        C50126kf3 kf32 = (C50126kf3) aVar;
        return C46238a.m51546a(this.BaseRequest, kf32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f136766d), Integer.valueOf(kf32.f136766d)) && C46238a.m51546a(Integer.valueOf(this.f136767e), Integer.valueOf(kf32.f136767e)) && C46238a.m51546a(this.f136768f, kf32.f136768f) && C46238a.m51546a(this.f136769g, kf32.f136769g) && C46238a.m51546a(this.f136770h, kf32.f136770h);
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
            aVar.mo74318e(2, this.f136766d);
            aVar.mo74318e(3, this.f136767e);
            String str = this.f136768f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f136769g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f136770h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136766d) + C52418a.m58678e(3, this.f136767e);
            String str4 = this.f136768f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            String str5 = this.f136769g;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f136770h;
            return str6 != null ? e + C52418a.m58683j(6, str6) : e;
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
            C50126kf3 kf32 = objArr[1];
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
                        kf32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    kf32.f136766d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    kf32.f136767e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    kf32.f136768f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    kf32.f136769g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    kf32.f136770h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
