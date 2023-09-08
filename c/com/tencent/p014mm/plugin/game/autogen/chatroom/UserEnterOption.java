package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption */
public class UserEnterOption extends C47465a {
    public String avatar;
    public String option_desc;

    public static final UserEnterOption create() {
        return new UserEnterOption();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof UserEnterOption)) {
            return false;
        }
        UserEnterOption userEnterOption = (UserEnterOption) aVar;
        return C46238a.m51546a(this.avatar, userEnterOption.avatar) && C46238a.m51546a(this.option_desc, userEnterOption.option_desc);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.avatar;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.option_desc;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.avatar;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.option_desc;
            return str4 != null ? i2 + C52418a.m58683j(2, str4) : i2;
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
            UserEnterOption userEnterOption = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                userEnterOption.avatar = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                userEnterOption.option_desc = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public UserEnterOption setAvatar(String str) {
        this.avatar = str;
        return this;
    }

    public UserEnterOption setOption_desc(String str) {
        this.option_desc = str;
        return this;
    }
}
