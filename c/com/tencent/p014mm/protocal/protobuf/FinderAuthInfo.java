package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderAuthInfo */
public class FinderAuthInfo extends C47465a {
    public String appName;
    public FinderContact authGenerator;
    public int authIconType;
    public String authIconUrl;
    public String authProfession;
    public int auth_verify_identity;
    public int customer_type;
    public String detailLink;
    public String realName;
    public String unauth_profession;
    public int verify_status;

    public static final FinderAuthInfo create() {
        return new FinderAuthInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderAuthInfo)) {
            return false;
        }
        FinderAuthInfo finderAuthInfo = (FinderAuthInfo) aVar;
        return C46238a.m51546a(this.realName, finderAuthInfo.realName) && C46238a.m51546a(Integer.valueOf(this.authIconType), Integer.valueOf(finderAuthInfo.authIconType)) && C46238a.m51546a(this.authProfession, finderAuthInfo.authProfession) && C46238a.m51546a(this.authGenerator, finderAuthInfo.authGenerator) && C46238a.m51546a(this.detailLink, finderAuthInfo.detailLink) && C46238a.m51546a(this.appName, finderAuthInfo.appName) && C46238a.m51546a(this.authIconUrl, finderAuthInfo.authIconUrl) && C46238a.m51546a(Integer.valueOf(this.customer_type), Integer.valueOf(finderAuthInfo.customer_type)) && C46238a.m51546a(Integer.valueOf(this.auth_verify_identity), Integer.valueOf(finderAuthInfo.auth_verify_identity)) && C46238a.m51546a(Integer.valueOf(this.verify_status), Integer.valueOf(finderAuthInfo.verify_status)) && C46238a.m51546a(this.unauth_profession, finderAuthInfo.unauth_profession);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.realName;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.authIconType);
            String str2 = this.authProfession;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            FinderContact finderContact = this.authGenerator;
            if (finderContact != null) {
                aVar.mo74322i(4, finderContact.computeSize());
                this.authGenerator.writeFields(aVar);
            }
            String str3 = this.detailLink;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.appName;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.authIconUrl;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.customer_type);
            aVar.mo74318e(9, this.auth_verify_identity);
            aVar.mo74318e(10, this.verify_status);
            String str6 = this.unauth_profession;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.realName;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            int e = i2 + C52418a.m58678e(2, this.authIconType);
            String str8 = this.authProfession;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            FinderContact finderContact2 = this.authGenerator;
            if (finderContact2 != null) {
                e += C52418a.m58682i(4, finderContact2.computeSize());
            }
            String str9 = this.detailLink;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.appName;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            String str11 = this.authIconUrl;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            int e2 = e + C52418a.m58678e(8, this.customer_type) + C52418a.m58678e(9, this.auth_verify_identity) + C52418a.m58678e(10, this.verify_status);
            String str12 = this.unauth_profession;
            return str12 != null ? e2 + C52418a.m58683j(11, str12) : e2;
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
            FinderAuthInfo finderAuthInfo = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    finderAuthInfo.realName = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    finderAuthInfo.authIconType = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    finderAuthInfo.authProfession = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr != null && bArr.length > 0) {
                            finderContact3.parseFrom(bArr);
                        }
                        finderAuthInfo.authGenerator = finderContact3;
                    }
                    return 0;
                case 5:
                    finderAuthInfo.detailLink = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    finderAuthInfo.appName = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    finderAuthInfo.authIconUrl = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    finderAuthInfo.customer_type = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    finderAuthInfo.auth_verify_identity = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    finderAuthInfo.verify_status = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    finderAuthInfo.unauth_profession = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public FinderAuthInfo setAppName(String str) {
        this.appName = str;
        return this;
    }

    public FinderAuthInfo setAuthGenerator(FinderContact finderContact) {
        this.authGenerator = finderContact;
        return this;
    }

    public FinderAuthInfo setAuthIconType(int i) {
        this.authIconType = i;
        return this;
    }

    public FinderAuthInfo setAuthIconUrl(String str) {
        this.authIconUrl = str;
        return this;
    }

    public FinderAuthInfo setAuthProfession(String str) {
        this.authProfession = str;
        return this;
    }

    public FinderAuthInfo setAuth_verify_identity(int i) {
        this.auth_verify_identity = i;
        return this;
    }

    public FinderAuthInfo setCustomer_type(int i) {
        this.customer_type = i;
        return this;
    }

    public FinderAuthInfo setDetailLink(String str) {
        this.detailLink = str;
        return this;
    }

    public FinderAuthInfo setRealName(String str) {
        this.realName = str;
        return this;
    }

    public FinderAuthInfo setUnauth_profession(String str) {
        this.unauth_profession = str;
        return this;
    }

    public FinderAuthInfo setVerify_status(int i) {
        this.verify_status = i;
        return this;
    }
}
