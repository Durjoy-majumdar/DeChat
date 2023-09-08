package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend */
public class ChatroomMsgPackExtend extends C47465a {
    public String brief_content;
    public ChatroomMsgPack msg_pack;
    public ChatroomUserData user_data;

    public static final ChatroomMsgPackExtend create() {
        return new ChatroomMsgPackExtend();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomMsgPackExtend)) {
            return false;
        }
        ChatroomMsgPackExtend chatroomMsgPackExtend = (ChatroomMsgPackExtend) aVar;
        return C46238a.m51546a(this.msg_pack, chatroomMsgPackExtend.msg_pack) && C46238a.m51546a(this.user_data, chatroomMsgPackExtend.user_data) && C46238a.m51546a(this.brief_content, chatroomMsgPackExtend.brief_content);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            ChatroomMsgPack chatroomMsgPack = this.msg_pack;
            if (chatroomMsgPack != null) {
                aVar.mo74322i(1, chatroomMsgPack.computeSize());
                this.msg_pack.writeFields(aVar);
            }
            ChatroomUserData chatroomUserData = this.user_data;
            if (chatroomUserData != null) {
                aVar.mo74322i(2, chatroomUserData.computeSize());
                this.user_data.writeFields(aVar);
            }
            String str = this.brief_content;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            ChatroomMsgPack chatroomMsgPack2 = this.msg_pack;
            if (chatroomMsgPack2 != null) {
                i2 = 0 + C52418a.m58682i(1, chatroomMsgPack2.computeSize());
            }
            ChatroomUserData chatroomUserData2 = this.user_data;
            if (chatroomUserData2 != null) {
                i2 += C52418a.m58682i(2, chatroomUserData2.computeSize());
            }
            String str2 = this.brief_content;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            ChatroomMsgPackExtend chatroomMsgPackExtend = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    ChatroomMsgPack chatroomMsgPack3 = new ChatroomMsgPack();
                    if (bArr != null && bArr.length > 0) {
                        chatroomMsgPack3.parseFrom(bArr);
                    }
                    chatroomMsgPackExtend.msg_pack = chatroomMsgPack3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    ChatroomUserData chatroomUserData3 = new ChatroomUserData();
                    if (bArr2 != null && bArr2.length > 0) {
                        chatroomUserData3.parseFrom(bArr2);
                    }
                    chatroomMsgPackExtend.user_data = chatroomUserData3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                chatroomMsgPackExtend.brief_content = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public ChatroomMsgPackExtend setBrief_content(String str) {
        this.brief_content = str;
        return this;
    }

    public ChatroomMsgPackExtend setMsg_pack(ChatroomMsgPack chatroomMsgPack) {
        this.msg_pack = chatroomMsgPack;
        return this;
    }

    public ChatroomMsgPackExtend setUser_data(ChatroomUserData chatroomUserData) {
        this.user_data = chatroomUserData;
        return this;
    }
}
