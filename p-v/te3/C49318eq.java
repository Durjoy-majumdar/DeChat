package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eq */
public class C49318eq extends C101820nt3 {

    /* renamed from: d */
    public String f133069d;

    /* renamed from: e */
    public String f133070e;

    /* renamed from: f */
    public String f133071f;

    /* renamed from: g */
    public String f133072g;

    /* renamed from: h */
    public int f133073h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49318eq)) {
            return false;
        }
        C49318eq eqVar = (C49318eq) aVar;
        return C46238a.m51546a(this.BaseRequest, eqVar.BaseRequest) && C46238a.m51546a(this.f133069d, eqVar.f133069d) && C46238a.m51546a(this.f133070e, eqVar.f133070e) && C46238a.m51546a(this.f133071f, eqVar.f133071f) && C46238a.m51546a(this.f133072g, eqVar.f133072g) && C46238a.m51546a(Integer.valueOf(this.f133073h), Integer.valueOf(eqVar.f133073h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f133069d == null) {
                throw new C52419b("Not all required fields were included: f2f_id");
            } else if (this.f133070e == null) {
                throw new C52419b("Not all required fields were included: trans_id");
            } else if (this.f133072g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f133069d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f133070e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f133071f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f133072g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                aVar.mo74318e(6, this.f133073h);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: receiver_open_id");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f133069d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f133070e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f133071f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f133072g;
            if (str8 != null) {
                i2 += C52418a.m58683j(5, str8);
            }
            return i2 + C52418a.m58678e(6, this.f133073h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133069d == null) {
                throw new C52419b("Not all required fields were included: f2f_id");
            } else if (this.f133070e == null) {
                throw new C52419b("Not all required fields were included: trans_id");
            } else if (this.f133072g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: receiver_open_id");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49318eq eqVar = objArr[1];
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
                        eqVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    eqVar.f133069d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    eqVar.f133070e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    eqVar.f133071f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    eqVar.f133072g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    eqVar.f133073h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
