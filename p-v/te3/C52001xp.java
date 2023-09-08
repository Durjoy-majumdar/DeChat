package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xp */
public class C52001xp extends C101820nt3 {

    /* renamed from: d */
    public String f144779d;

    /* renamed from: e */
    public String f144780e;

    /* renamed from: f */
    public String f144781f;

    /* renamed from: g */
    public boolean f144782g;

    /* renamed from: h */
    public String f144783h;

    /* renamed from: i */
    public int f144784i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52001xp)) {
            return false;
        }
        C52001xp xpVar = (C52001xp) aVar;
        return C46238a.m51546a(this.BaseRequest, xpVar.BaseRequest) && C46238a.m51546a(this.f144779d, xpVar.f144779d) && C46238a.m51546a(this.f144780e, xpVar.f144780e) && C46238a.m51546a(this.f144781f, xpVar.f144781f) && C46238a.m51546a(Boolean.valueOf(this.f144782g), Boolean.valueOf(xpVar.f144782g)) && C46238a.m51546a(this.f144783h, xpVar.f144783h) && C46238a.m51546a(Integer.valueOf(this.f144784i), Integer.valueOf(xpVar.f144784i));
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
            String str = this.f144779d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144780e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f144781f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74314a(5, this.f144782g);
            String str4 = this.f144783h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f144784i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f144779d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f144780e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f144781f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            int a = i2 + C52418a.m58674a(5, this.f144782g);
            String str8 = this.f144783h;
            if (str8 != null) {
                a += C52418a.m58683j(6, str8);
            }
            return a + C52418a.m58678e(7, this.f144784i);
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
            C52001xp xpVar = objArr[1];
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
                        xpVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    xpVar.f144779d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xpVar.f144780e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    xpVar.f144781f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xpVar.f144782g = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    xpVar.f144783h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    xpVar.f144784i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
