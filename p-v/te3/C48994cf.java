package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cf */
public class C48994cf extends C101820nt3 {

    /* renamed from: d */
    public String f131685d;

    /* renamed from: e */
    public String f131686e;

    /* renamed from: f */
    public int f131687f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48994cf)) {
            return false;
        }
        C48994cf cfVar = (C48994cf) aVar;
        return C46238a.m51546a(this.BaseRequest, cfVar.BaseRequest) && C46238a.m51546a(this.f131685d, cfVar.f131685d) && C46238a.m51546a(this.f131686e, cfVar.f131686e) && C46238a.m51546a(Integer.valueOf(this.f131687f), Integer.valueOf(cfVar.f131687f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f131685d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f131685d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f131686e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f131687f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: brand_user_name");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f131685d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f131686e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58678e(4, this.f131687f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f131685d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: brand_user_name");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48994cf cfVar = objArr[1];
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
                    cfVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                cfVar.f131685d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                cfVar.f131686e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                cfVar.f131687f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
