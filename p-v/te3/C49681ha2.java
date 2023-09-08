package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ha2 */
public class C49681ha2 extends C101820nt3 {

    /* renamed from: d */
    public String f134528d;

    /* renamed from: e */
    public int f134529e;

    /* renamed from: f */
    public String f134530f;

    /* renamed from: g */
    public String f134531g;

    /* renamed from: h */
    public String f134532h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49681ha2)) {
            return false;
        }
        C49681ha2 ha22 = (C49681ha2) aVar;
        return C46238a.m51546a(this.BaseRequest, ha22.BaseRequest) && C46238a.m51546a(this.f134528d, ha22.f134528d) && C46238a.m51546a(Integer.valueOf(this.f134529e), Integer.valueOf(ha22.f134529e)) && C46238a.m51546a(this.f134530f, ha22.f134530f) && C46238a.m51546a(this.f134531g, ha22.f134531g) && C46238a.m51546a(this.f134532h, ha22.f134532h);
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
            String str = this.f134528d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f134529e);
            String str2 = this.f134530f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f134531g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f134532h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f134528d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f134529e);
            String str6 = this.f134530f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f134531g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f134532h;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
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
            C49681ha2 ha22 = objArr[1];
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
                        ha22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ha22.f134528d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ha22.f134529e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ha22.f134530f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ha22.f134531g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ha22.f134532h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
