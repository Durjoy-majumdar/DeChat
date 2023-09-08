package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserSimpleData */
public class ChatroomUserSimpleData extends C47465a {
    public String avatar;
    public String nickname;
    public String username;

    public static final ChatroomUserSimpleData create() {
        return new ChatroomUserSimpleData();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomUserSimpleData)) {
            return false;
        }
        ChatroomUserSimpleData chatroomUserSimpleData = (ChatroomUserSimpleData) aVar;
        return C46238a.m51546a(this.username, chatroomUserSimpleData.username) && C46238a.m51546a(this.nickname, chatroomUserSimpleData.nickname) && C46238a.m51546a(this.avatar, chatroomUserSimpleData.avatar);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.username;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.nickname;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.avatar;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i == 1) {
            String str4 = this.username;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.nickname;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.avatar;
            return str6 != null ? i2 + C52418a.m58683j(3, str6) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.username != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ChatroomUserSimpleData chatroomUserSimpleData = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                chatroomUserSimpleData.username = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                chatroomUserSimpleData.nickname = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                chatroomUserSimpleData.avatar = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public ChatroomUserSimpleData setAvatar(String str) {
        this.avatar = str;
        return this;
    }

    public ChatroomUserSimpleData setNickname(String str) {
        this.nickname = str;
        return this;
    }

    public ChatroomUserSimpleData setUsername(String str) {
        this.username = str;
        return this;
    }
}
