package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest */
public class SendChatroomMsgRequest extends C101820nt3 {
    public String chatroom_name;
    public ChatroomMsgPack msg_pack;

    public static final SendChatroomMsgRequest create() {
        return new SendChatroomMsgRequest();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof SendChatroomMsgRequest)) {
            return false;
        }
        SendChatroomMsgRequest sendChatroomMsgRequest = (SendChatroomMsgRequest) aVar;
        return C46238a.m51546a(this.BaseRequest, sendChatroomMsgRequest.BaseRequest) && C46238a.m51546a(this.msg_pack, sendChatroomMsgRequest.msg_pack) && C46238a.m51546a(this.chatroom_name, sendChatroomMsgRequest.chatroom_name);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.msg_pack == null) {
                throw new C52419b("Not all required fields were included: msg_pack");
            } else if (this.chatroom_name != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                ChatroomMsgPack chatroomMsgPack = this.msg_pack;
                if (chatroomMsgPack != null) {
                    aVar.mo74322i(2, chatroomMsgPack.computeSize());
                    this.msg_pack.writeFields(aVar);
                }
                String str = this.chatroom_name;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: chatroom_name");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            ChatroomMsgPack chatroomMsgPack2 = this.msg_pack;
            if (chatroomMsgPack2 != null) {
                i2 += C52418a.m58682i(2, chatroomMsgPack2.computeSize());
            }
            String str2 = this.chatroom_name;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.msg_pack == null) {
                throw new C52419b("Not all required fields were included: msg_pack");
            } else if (this.chatroom_name != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: chatroom_name");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            SendChatroomMsgRequest sendChatroomMsgRequest = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    sendChatroomMsgRequest.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    ChatroomMsgPack chatroomMsgPack3 = new ChatroomMsgPack();
                    if (bArr2 != null && bArr2.length > 0) {
                        chatroomMsgPack3.parseFrom(bArr2);
                    }
                    sendChatroomMsgRequest.msg_pack = chatroomMsgPack3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                sendChatroomMsgRequest.chatroom_name = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public SendChatroomMsgRequest setChatroom_name(String str) {
        this.chatroom_name = str;
        return this;
    }

    public SendChatroomMsgRequest setMsg_pack(ChatroomMsgPack chatroomMsgPack) {
        this.msg_pack = chatroomMsgPack;
        return this;
    }
}
