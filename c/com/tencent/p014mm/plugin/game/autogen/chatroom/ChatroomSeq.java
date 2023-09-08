package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq */
public class ChatroomSeq extends C47465a {
    public int channel_id;
    public String chatroom_name;
    public long seq;

    public static final ChatroomSeq create() {
        return new ChatroomSeq();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomSeq)) {
            return false;
        }
        ChatroomSeq chatroomSeq = (ChatroomSeq) aVar;
        return C46238a.m51546a(this.chatroom_name, chatroomSeq.chatroom_name) && C46238a.m51546a(Integer.valueOf(this.channel_id), Integer.valueOf(chatroomSeq.channel_id)) && C46238a.m51546a(Long.valueOf(this.seq), Long.valueOf(chatroomSeq.seq));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.chatroom_name;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.channel_id);
                aVar.mo74321h(3, this.seq);
                return 0;
            }
            throw new C52419b("Not all required fields were included: chatroom_name");
        } else if (i == 1) {
            String str2 = this.chatroom_name;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.channel_id) + C52418a.m58681h(3, this.seq);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.chatroom_name != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: chatroom_name");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ChatroomSeq chatroomSeq = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                chatroomSeq.chatroom_name = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                chatroomSeq.channel_id = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                chatroomSeq.seq = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }

    public ChatroomSeq setChannel_id(int i) {
        this.channel_id = i;
        return this;
    }

    public ChatroomSeq setChatroom_name(String str) {
        this.chatroom_name = str;
        return this;
    }

    public ChatroomSeq setSeq(long j) {
        this.seq = j;
        return this;
    }
}
