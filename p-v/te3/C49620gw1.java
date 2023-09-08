package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gw1 */
public class C49620gw1 extends C101820nt3 {

    /* renamed from: d */
    public String f134319d;

    /* renamed from: e */
    public String f134320e;

    /* renamed from: f */
    public String f134321f;

    /* renamed from: g */
    public String f134322g;

    /* renamed from: h */
    public String f134323h;

    /* renamed from: i */
    public String f134324i;

    /* renamed from: j */
    public String f134325j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49620gw1)) {
            return false;
        }
        C49620gw1 gw12 = (C49620gw1) aVar;
        return C46238a.m51546a(this.BaseRequest, gw12.BaseRequest) && C46238a.m51546a(this.f134319d, gw12.f134319d) && C46238a.m51546a(this.f134320e, gw12.f134320e) && C46238a.m51546a(this.f134321f, gw12.f134321f) && C46238a.m51546a(this.f134322g, gw12.f134322g) && C46238a.m51546a(this.f134323h, gw12.f134323h) && C46238a.m51546a(this.f134324i, gw12.f134324i) && C46238a.m51546a(this.f134325j, gw12.f134325j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f134319d == null) {
                throw new C52419b("Not all required fields were included: corp_id");
            } else if (this.f134320e == null) {
                throw new C52419b("Not all required fields were included: group_id");
            } else if (this.f134321f == null) {
                throw new C52419b("Not all required fields were included: time_stamp");
            } else if (this.f134322g == null) {
                throw new C52419b("Not all required fields were included: nonce_str");
            } else if (this.f134323h == null) {
                throw new C52419b("Not all required fields were included: signature");
            } else if (this.f134324i != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f134319d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f134320e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f134321f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f134322g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                String str5 = this.f134323h;
                if (str5 != null) {
                    aVar.mo74323j(6, str5);
                }
                String str6 = this.f134324i;
                if (str6 != null) {
                    aVar.mo74323j(7, str6);
                }
                String str7 = this.f134325j;
                if (str7 != null) {
                    aVar.mo74323j(8, str7);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: from_url");
            }
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str8 = this.f134319d;
            if (str8 != null) {
                i3 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f134320e;
            if (str9 != null) {
                i3 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f134321f;
            if (str10 != null) {
                i3 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f134322g;
            if (str11 != null) {
                i3 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f134323h;
            if (str12 != null) {
                i3 += C52418a.m58683j(6, str12);
            }
            String str13 = this.f134324i;
            if (str13 != null) {
                i3 += C52418a.m58683j(7, str13);
            }
            String str14 = this.f134325j;
            return str14 != null ? i3 + C52418a.m58683j(8, str14) : i3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134319d == null) {
                throw new C52419b("Not all required fields were included: corp_id");
            } else if (this.f134320e == null) {
                throw new C52419b("Not all required fields were included: group_id");
            } else if (this.f134321f == null) {
                throw new C52419b("Not all required fields were included: time_stamp");
            } else if (this.f134322g == null) {
                throw new C52419b("Not all required fields were included: nonce_str");
            } else if (this.f134323h == null) {
                throw new C52419b("Not all required fields were included: signature");
            } else if (this.f134324i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: from_url");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49620gw1 gw12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        gw12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    gw12.f134319d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    gw12.f134320e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gw12.f134321f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gw12.f134322g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gw12.f134323h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    gw12.f134324i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    gw12.f134325j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
