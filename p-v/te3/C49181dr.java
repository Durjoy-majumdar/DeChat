package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dr */
public class C49181dr extends C101820nt3 {

    /* renamed from: d */
    public String f132477d;

    /* renamed from: e */
    public String f132478e;

    /* renamed from: f */
    public String f132479f;

    /* renamed from: g */
    public String f132480g;

    /* renamed from: h */
    public long f132481h;

    /* renamed from: i */
    public String f132482i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49181dr)) {
            return false;
        }
        C49181dr drVar = (C49181dr) aVar;
        return C46238a.m51546a(this.BaseRequest, drVar.BaseRequest) && C46238a.m51546a(this.f132477d, drVar.f132477d) && C46238a.m51546a(this.f132478e, drVar.f132478e) && C46238a.m51546a(this.f132479f, drVar.f132479f) && C46238a.m51546a(this.f132480g, drVar.f132480g) && C46238a.m51546a(Long.valueOf(this.f132481h), Long.valueOf(drVar.f132481h)) && C46238a.m51546a(this.f132482i, drVar.f132482i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f132477d == null) {
                throw new C52419b("Not all required fields were included: req_key");
            } else if (this.f132478e == null) {
                throw new C52419b("Not all required fields were included: transfer_id");
            } else if (this.f132479f == null) {
                throw new C52419b("Not all required fields were included: transaction_id");
            } else if (this.f132480g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f132477d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f132478e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f132479f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f132480g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                aVar.mo74321h(6, this.f132481h);
                String str5 = this.f132482i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: receiver_openid");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str6 = this.f132477d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f132478e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f132479f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            String str9 = this.f132480g;
            if (str9 != null) {
                i2 += C52418a.m58683j(5, str9);
            }
            int h = i2 + C52418a.m58681h(6, this.f132481h);
            String str10 = this.f132482i;
            return str10 != null ? h + C52418a.m58683j(7, str10) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f132477d == null) {
                throw new C52419b("Not all required fields were included: req_key");
            } else if (this.f132478e == null) {
                throw new C52419b("Not all required fields were included: transfer_id");
            } else if (this.f132479f == null) {
                throw new C52419b("Not all required fields were included: transaction_id");
            } else if (this.f132480g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: receiver_openid");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49181dr drVar = objArr[1];
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
                        drVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    drVar.f132477d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    drVar.f132478e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    drVar.f132479f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    drVar.f132480g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    drVar.f132481h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    drVar.f132482i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
