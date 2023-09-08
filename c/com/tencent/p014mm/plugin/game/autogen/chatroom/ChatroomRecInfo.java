package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo */
public class ChatroomRecInfo extends C47465a {
    public long basic_update_time;
    public LinkedList<ChatroomMsgPackExtend> bullet_msg_list = new LinkedList<>();
    public ChattingInfo chating_des;
    public ChatroomData chatroom_data;
    public LinkedList<ChatroomMsgPackExtend> chosen_chatroom_msg = new LinkedList<>();
    public ChatroomMsgPack last_chatroom_msg;
    public int user_chatting_count;

    public static final ChatroomRecInfo create() {
        return new ChatroomRecInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomRecInfo)) {
            return false;
        }
        ChatroomRecInfo chatroomRecInfo = (ChatroomRecInfo) aVar;
        return C46238a.m51546a(this.chatroom_data, chatroomRecInfo.chatroom_data) && C46238a.m51546a(Long.valueOf(this.basic_update_time), Long.valueOf(chatroomRecInfo.basic_update_time)) && C46238a.m51546a(this.chating_des, chatroomRecInfo.chating_des) && C46238a.m51546a(Integer.valueOf(this.user_chatting_count), Integer.valueOf(chatroomRecInfo.user_chatting_count)) && C46238a.m51546a(this.last_chatroom_msg, chatroomRecInfo.last_chatroom_msg) && C46238a.m51546a(this.chosen_chatroom_msg, chatroomRecInfo.chosen_chatroom_msg) && C46238a.m51546a(this.bullet_msg_list, chatroomRecInfo.bullet_msg_list);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            ChatroomData chatroomData = this.chatroom_data;
            if (chatroomData != null) {
                aVar.mo74322i(1, chatroomData.computeSize());
                this.chatroom_data.writeFields(aVar);
            }
            aVar.mo74321h(2, this.basic_update_time);
            ChattingInfo chattingInfo = this.chating_des;
            if (chattingInfo != null) {
                aVar.mo74322i(3, chattingInfo.computeSize());
                this.chating_des.writeFields(aVar);
            }
            aVar.mo74318e(4, this.user_chatting_count);
            ChatroomMsgPack chatroomMsgPack = this.last_chatroom_msg;
            if (chatroomMsgPack != null) {
                aVar.mo74322i(5, chatroomMsgPack.computeSize());
                this.last_chatroom_msg.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.chosen_chatroom_msg);
            aVar.mo74320g(7, 8, this.bullet_msg_list);
            return 0;
        } else if (i == 1) {
            ChatroomData chatroomData2 = this.chatroom_data;
            if (chatroomData2 != null) {
                i2 = 0 + C52418a.m58682i(1, chatroomData2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.basic_update_time);
            ChattingInfo chattingInfo2 = this.chating_des;
            if (chattingInfo2 != null) {
                h += C52418a.m58682i(3, chattingInfo2.computeSize());
            }
            int e = h + C52418a.m58678e(4, this.user_chatting_count);
            ChatroomMsgPack chatroomMsgPack2 = this.last_chatroom_msg;
            if (chatroomMsgPack2 != null) {
                e += C52418a.m58682i(5, chatroomMsgPack2.computeSize());
            }
            return e + C52418a.m58680g(6, 8, this.chosen_chatroom_msg) + C52418a.m58680g(7, 8, this.bullet_msg_list);
        } else if (i == 2) {
            this.chosen_chatroom_msg.clear();
            this.bullet_msg_list.clear();
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
            ChatroomRecInfo chatroomRecInfo = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        ChatroomData chatroomData3 = new ChatroomData();
                        if (bArr != null && bArr.length > 0) {
                            chatroomData3.parseFrom(bArr);
                        }
                        chatroomRecInfo.chatroom_data = chatroomData3;
                    }
                    return 0;
                case 2:
                    chatroomRecInfo.basic_update_time = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        ChattingInfo chattingInfo3 = new ChattingInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            chattingInfo3.parseFrom(bArr2);
                        }
                        chatroomRecInfo.chating_des = chattingInfo3;
                    }
                    return 0;
                case 4:
                    chatroomRecInfo.user_chatting_count = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        ChatroomMsgPack chatroomMsgPack3 = new ChatroomMsgPack();
                        if (bArr3 != null && bArr3.length > 0) {
                            chatroomMsgPack3.parseFrom(bArr3);
                        }
                        chatroomRecInfo.last_chatroom_msg = chatroomMsgPack3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        ChatroomMsgPackExtend chatroomMsgPackExtend = new ChatroomMsgPackExtend();
                        if (bArr4 != null && bArr4.length > 0) {
                            chatroomMsgPackExtend.parseFrom(bArr4);
                        }
                        chatroomRecInfo.chosen_chatroom_msg.add(chatroomMsgPackExtend);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        ChatroomMsgPackExtend chatroomMsgPackExtend2 = new ChatroomMsgPackExtend();
                        if (bArr5 != null && bArr5.length > 0) {
                            chatroomMsgPackExtend2.parseFrom(bArr5);
                        }
                        chatroomRecInfo.bullet_msg_list.add(chatroomMsgPackExtend2);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public ChatroomRecInfo setBasic_update_time(long j) {
        this.basic_update_time = j;
        return this;
    }

    public ChatroomRecInfo setBullet_msg_list(LinkedList<ChatroomMsgPackExtend> linkedList) {
        this.bullet_msg_list = linkedList;
        return this;
    }

    public ChatroomRecInfo setChating_des(ChattingInfo chattingInfo) {
        this.chating_des = chattingInfo;
        return this;
    }

    public ChatroomRecInfo setChatroom_data(ChatroomData chatroomData) {
        this.chatroom_data = chatroomData;
        return this;
    }

    public ChatroomRecInfo setChosen_chatroom_msg(LinkedList<ChatroomMsgPackExtend> linkedList) {
        this.chosen_chatroom_msg = linkedList;
        return this;
    }

    public ChatroomRecInfo setLast_chatroom_msg(ChatroomMsgPack chatroomMsgPack) {
        this.last_chatroom_msg = chatroomMsgPack;
        return this;
    }

    public ChatroomRecInfo setUser_chatting_count(int i) {
        this.user_chatting_count = i;
        return this;
    }
}
