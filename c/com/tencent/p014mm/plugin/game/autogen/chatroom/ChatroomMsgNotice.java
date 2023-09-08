package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice */
public class ChatroomMsgNotice extends C47465a {
    public ChatroomMsgTpl chatroom_msg_tpl;

    public static final ChatroomMsgNotice create() {
        return new ChatroomMsgNotice();
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof ChatroomMsgNotice) && C46238a.m51546a(this.chatroom_msg_tpl, ((ChatroomMsgNotice) aVar).chatroom_msg_tpl);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            ChatroomMsgTpl chatroomMsgTpl = this.chatroom_msg_tpl;
            if (chatroomMsgTpl != null) {
                aVar.mo74322i(1, chatroomMsgTpl.computeSize());
                this.chatroom_msg_tpl.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            ChatroomMsgTpl chatroomMsgTpl2 = this.chatroom_msg_tpl;
            if (chatroomMsgTpl2 != null) {
                return 0 + C52418a.m58682i(1, chatroomMsgTpl2.computeSize());
            }
            return 0;
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
            ChatroomMsgNotice chatroomMsgNotice = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                ChatroomMsgTpl chatroomMsgTpl3 = new ChatroomMsgTpl();
                if (bArr != null && bArr.length > 0) {
                    chatroomMsgTpl3.parseFrom(bArr);
                }
                chatroomMsgNotice.chatroom_msg_tpl = chatroomMsgTpl3;
            }
            return 0;
        }
    }

    public ChatroomMsgNotice setChatroom_msg_tpl(ChatroomMsgTpl chatroomMsgTpl) {
        this.chatroom_msg_tpl = chatroomMsgTpl;
        return this;
    }
}
