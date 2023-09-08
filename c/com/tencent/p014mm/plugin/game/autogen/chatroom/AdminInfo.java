package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo */
public class AdminInfo extends C47465a {
    public LinkedList<String> admin_username_list = new LinkedList<>();
    public String owner_username;

    public static final AdminInfo create() {
        return new AdminInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof AdminInfo)) {
            return false;
        }
        AdminInfo adminInfo = (AdminInfo) aVar;
        return C46238a.m51546a(this.owner_username, adminInfo.owner_username) && C46238a.m51546a(this.admin_username_list, adminInfo.admin_username_list);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.owner_username;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 1, this.admin_username_list);
            return 0;
        } else if (i == 1) {
            String str2 = this.owner_username;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 1, this.admin_username_list);
        } else if (i == 2) {
            this.admin_username_list.clear();
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
            AdminInfo adminInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                adminInfo.owner_username = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                adminInfo.admin_username_list.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }

    public AdminInfo setAdmin_username_list(LinkedList<String> linkedList) {
        this.admin_username_list = linkedList;
        return this;
    }

    public AdminInfo setOwner_username(String str) {
        this.owner_username = str;
        return this;
    }
}
