package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ll4 extends C101820nt3 {

    /* renamed from: d */
    public String f137506d;

    /* renamed from: e */
    public String f137507e;

    /* renamed from: f */
    public String f137508f;

    /* renamed from: g */
    public int f137509g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ll4)) {
            return false;
        }
        ll4 ll4 = (ll4) aVar;
        return C46238a.m51546a(this.BaseRequest, ll4.BaseRequest) && C46238a.m51546a(this.f137506d, ll4.f137506d) && C46238a.m51546a(this.f137507e, ll4.f137507e) && C46238a.m51546a(this.f137508f, ll4.f137508f) && C46238a.m51546a(Integer.valueOf(this.f137509g), Integer.valueOf(ll4.f137509g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f137506d == null) {
                throw new C52419b("Not all required fields were included: devicetype");
            } else if (this.f137507e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f137506d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f137507e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f137508f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                aVar.mo74318e(5, this.f137509g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: deviceid");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f137506d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f137507e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f137508f;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            return i2 + C52418a.m58678e(5, this.f137509g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137506d == null) {
                throw new C52419b("Not all required fields were included: devicetype");
            } else if (this.f137507e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: deviceid");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ll4 ll4 = objArr[1];
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
                    ll4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ll4.f137506d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ll4.f137507e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                ll4.f137508f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ll4.f137509g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
