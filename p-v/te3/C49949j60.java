package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j60 */
public class C49949j60 extends C101820nt3 {

    /* renamed from: d */
    public int f135883d;

    /* renamed from: e */
    public String f135884e;

    /* renamed from: f */
    public int f135885f;

    /* renamed from: g */
    public String f135886g;

    /* renamed from: h */
    public boolean f135887h;

    /* renamed from: i */
    public String f135888i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49949j60)) {
            return false;
        }
        C49949j60 j602 = (C49949j60) aVar;
        return C46238a.m51546a(this.BaseRequest, j602.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f135883d), Integer.valueOf(j602.f135883d)) && C46238a.m51546a(this.f135884e, j602.f135884e) && C46238a.m51546a(Integer.valueOf(this.f135885f), Integer.valueOf(j602.f135885f)) && C46238a.m51546a(this.f135886g, j602.f135886g) && C46238a.m51546a(Boolean.valueOf(this.f135887h), Boolean.valueOf(j602.f135887h)) && C46238a.m51546a(this.f135888i, j602.f135888i);
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
            aVar.mo74318e(2, this.f135883d);
            String str = this.f135884e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f135885f);
            String str2 = this.f135886g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74314a(6, this.f135887h);
            String str3 = this.f135888i;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f135883d);
            String str4 = this.f135884e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            int e2 = e + C52418a.m58678e(4, this.f135885f);
            String str5 = this.f135886g;
            if (str5 != null) {
                e2 += C52418a.m58683j(5, str5);
            }
            int a = e2 + C52418a.m58674a(6, this.f135887h);
            String str6 = this.f135888i;
            return str6 != null ? a + C52418a.m58683j(8, str6) : a;
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
            C49949j60 j602 = objArr[1];
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
                        j602.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    j602.f135883d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    j602.f135884e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    j602.f135885f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    j602.f135886g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    j602.f135887h = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    j602.f135888i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
