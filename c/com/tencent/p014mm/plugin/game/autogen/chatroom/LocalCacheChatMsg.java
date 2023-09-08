package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg */
public class LocalCacheChatMsg extends C47465a {
    public LinkedList<ChatroomMsgPack> chatroom_msg_list = new LinkedList<>();
    public String host_user_name;

    public static final LocalCacheChatMsg create() {
        return new LocalCacheChatMsg();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof LocalCacheChatMsg)) {
            return false;
        }
        LocalCacheChatMsg localCacheChatMsg = (LocalCacheChatMsg) aVar;
        return C46238a.m51546a(this.chatroom_msg_list, localCacheChatMsg.chatroom_msg_list) && C46238a.m51546a(this.host_user_name, localCacheChatMsg.host_user_name);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.chatroom_msg_list);
            String str = this.host_user_name;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.chatroom_msg_list) + 0;
            String str2 = this.host_user_name;
            return str2 != null ? g + C52418a.m58683j(2, str2) : g;
        } else if (i == 2) {
            this.chatroom_msg_list.clear();
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
            LocalCacheChatMsg localCacheChatMsg = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    ChatroomMsgPack chatroomMsgPack = new ChatroomMsgPack();
                    if (bArr != null && bArr.length > 0) {
                        chatroomMsgPack.parseFrom(bArr);
                    }
                    localCacheChatMsg.chatroom_msg_list.add(chatroomMsgPack);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                localCacheChatMsg.host_user_name = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public LocalCacheChatMsg setChatroom_msg_list(LinkedList<ChatroomMsgPack> linkedList) {
        this.chatroom_msg_list = linkedList;
        return this;
    }

    public LocalCacheChatMsg setHost_user_name(String str) {
        this.host_user_name = str;
        return this;
    }
}
