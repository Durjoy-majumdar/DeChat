package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys */
public class ChatroomMsgSys extends C47465a {
    public ChatroomMsgTpl chatroom_msg_tpl;
    public String title;

    public static final ChatroomMsgSys create() {
        return new ChatroomMsgSys();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomMsgSys)) {
            return false;
        }
        ChatroomMsgSys chatroomMsgSys = (ChatroomMsgSys) aVar;
        return C46238a.m51546a(this.title, chatroomMsgSys.title) && C46238a.m51546a(this.chatroom_msg_tpl, chatroomMsgSys.chatroom_msg_tpl);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.title;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            ChatroomMsgTpl chatroomMsgTpl = this.chatroom_msg_tpl;
            if (chatroomMsgTpl != null) {
                aVar.mo74322i(2, chatroomMsgTpl.computeSize());
                this.chatroom_msg_tpl.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.title;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            ChatroomMsgTpl chatroomMsgTpl2 = this.chatroom_msg_tpl;
            return chatroomMsgTpl2 != null ? i2 + C52418a.m58682i(2, chatroomMsgTpl2.computeSize()) : i2;
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
            ChatroomMsgSys chatroomMsgSys = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                chatroomMsgSys.title = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    ChatroomMsgTpl chatroomMsgTpl3 = new ChatroomMsgTpl();
                    if (bArr != null && bArr.length > 0) {
                        chatroomMsgTpl3.parseFrom(bArr);
                    }
                    chatroomMsgSys.chatroom_msg_tpl = chatroomMsgTpl3;
                }
                return 0;
            }
        }
    }

    public ChatroomMsgSys setChatroom_msg_tpl(ChatroomMsgTpl chatroomMsgTpl) {
        this.chatroom_msg_tpl = chatroomMsgTpl;
        return this;
    }

    public ChatroomMsgSys setTitle(String str) {
        this.title = str;
        return this;
    }
}
