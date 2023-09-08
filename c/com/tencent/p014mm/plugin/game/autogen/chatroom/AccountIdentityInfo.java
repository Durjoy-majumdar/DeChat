package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo */
public class AccountIdentityInfo extends C47465a {
    public String auth_desc;
    public int auth_icon_type;
    public int auth_type;

    public static final AccountIdentityInfo create() {
        return new AccountIdentityInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof AccountIdentityInfo)) {
            return false;
        }
        AccountIdentityInfo accountIdentityInfo = (AccountIdentityInfo) aVar;
        return C46238a.m51546a(Integer.valueOf(this.auth_type), Integer.valueOf(accountIdentityInfo.auth_type)) && C46238a.m51546a(this.auth_desc, accountIdentityInfo.auth_desc) && C46238a.m51546a(Integer.valueOf(this.auth_icon_type), Integer.valueOf(accountIdentityInfo.auth_icon_type));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.auth_type);
            String str = this.auth_desc;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.auth_icon_type);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.auth_type) + 0;
            String str2 = this.auth_desc;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58678e(3, this.auth_icon_type);
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
            AccountIdentityInfo accountIdentityInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                accountIdentityInfo.auth_type = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                accountIdentityInfo.auth_desc = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                accountIdentityInfo.auth_icon_type = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public AccountIdentityInfo setAuth_desc(String str) {
        this.auth_desc = str;
        return this;
    }

    public AccountIdentityInfo setAuth_icon_type(int i) {
        this.auth_icon_type = i;
        return this;
    }

    public AccountIdentityInfo setAuth_type(int i) {
        this.auth_type = i;
        return this;
    }
}
