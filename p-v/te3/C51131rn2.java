package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rn2 */
public class C51131rn2 extends C101820nt3 {

    /* renamed from: d */
    public String f141047d;

    /* renamed from: e */
    public String f141048e;

    /* renamed from: f */
    public int f141049f;

    /* renamed from: g */
    public String f141050g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51131rn2)) {
            return false;
        }
        C51131rn2 rn22 = (C51131rn2) aVar;
        return C46238a.m51546a(this.BaseRequest, rn22.BaseRequest) && C46238a.m51546a(this.f141047d, rn22.f141047d) && C46238a.m51546a(this.f141048e, rn22.f141048e) && C46238a.m51546a(Integer.valueOf(this.f141049f), Integer.valueOf(rn22.f141049f)) && C46238a.m51546a(this.f141050g, rn22.f141050g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f141047d == null) {
                throw new C52419b("Not all required fields were included: username");
            } else if (this.f141048e == null) {
                throw new C52419b("Not all required fields were included: appusername");
            } else if (this.f141050g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f141047d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f141048e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f141049f);
                String str3 = this.f141050g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: rankid");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f141047d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f141048e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f141049f);
            String str6 = this.f141050g;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f141047d == null) {
                throw new C52419b("Not all required fields were included: username");
            } else if (this.f141048e == null) {
                throw new C52419b("Not all required fields were included: appusername");
            } else if (this.f141050g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: rankid");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51131rn2 rn22 = objArr[1];
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
                    rn22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                rn22.f141047d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                rn22.f141048e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                rn22.f141049f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                rn22.f141050g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
