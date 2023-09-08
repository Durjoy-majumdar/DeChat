package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack */
public class ChatroomMsgPack extends C47465a {
    public int channel_id;
    public String cli_msg_id;
    public String from_username;
    public MsgContent msg_content;
    public MsgOptions msg_options;
    public int msg_sub_type;
    public int msg_type;
    public long send_time;
    public long seq;

    public static final ChatroomMsgPack create() {
        return new ChatroomMsgPack();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomMsgPack)) {
            return false;
        }
        ChatroomMsgPack chatroomMsgPack = (ChatroomMsgPack) aVar;
        return C46238a.m51546a(Integer.valueOf(this.msg_type), Integer.valueOf(chatroomMsgPack.msg_type)) && C46238a.m51546a(this.from_username, chatroomMsgPack.from_username) && C46238a.m51546a(this.cli_msg_id, chatroomMsgPack.cli_msg_id) && C46238a.m51546a(Long.valueOf(this.seq), Long.valueOf(chatroomMsgPack.seq)) && C46238a.m51546a(Long.valueOf(this.send_time), Long.valueOf(chatroomMsgPack.send_time)) && C46238a.m51546a(this.msg_content, chatroomMsgPack.msg_content) && C46238a.m51546a(this.msg_options, chatroomMsgPack.msg_options) && C46238a.m51546a(Integer.valueOf(this.msg_sub_type), Integer.valueOf(chatroomMsgPack.msg_sub_type)) && C46238a.m51546a(Integer.valueOf(this.channel_id), Integer.valueOf(chatroomMsgPack.channel_id));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.msg_type);
            String str = this.from_username;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.cli_msg_id;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74321h(4, this.seq);
            aVar.mo74321h(5, this.send_time);
            MsgContent msgContent = this.msg_content;
            if (msgContent != null) {
                aVar.mo74322i(6, msgContent.computeSize());
                this.msg_content.writeFields(aVar);
            }
            MsgOptions msgOptions = this.msg_options;
            if (msgOptions != null) {
                aVar.mo74322i(7, msgOptions.computeSize());
                this.msg_options.writeFields(aVar);
            }
            aVar.mo74318e(8, this.msg_sub_type);
            aVar.mo74318e(9, this.channel_id);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.msg_type) + 0;
            String str3 = this.from_username;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.cli_msg_id;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            int h = e + C52418a.m58681h(4, this.seq) + C52418a.m58681h(5, this.send_time);
            MsgContent msgContent2 = this.msg_content;
            if (msgContent2 != null) {
                h += C52418a.m58682i(6, msgContent2.computeSize());
            }
            MsgOptions msgOptions2 = this.msg_options;
            if (msgOptions2 != null) {
                h += C52418a.m58682i(7, msgOptions2.computeSize());
            }
            return h + C52418a.m58678e(8, this.msg_sub_type) + C52418a.m58678e(9, this.channel_id);
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
            ChatroomMsgPack chatroomMsgPack = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    chatroomMsgPack.msg_type = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    chatroomMsgPack.from_username = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    chatroomMsgPack.cli_msg_id = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    chatroomMsgPack.seq = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    chatroomMsgPack.send_time = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        MsgContent msgContent3 = new MsgContent();
                        if (bArr != null && bArr.length > 0) {
                            msgContent3.parseFrom(bArr);
                        }
                        chatroomMsgPack.msg_content = msgContent3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        MsgOptions msgOptions3 = new MsgOptions();
                        if (bArr2 != null && bArr2.length > 0) {
                            msgOptions3.parseFrom(bArr2);
                        }
                        chatroomMsgPack.msg_options = msgOptions3;
                    }
                    return 0;
                case 8:
                    chatroomMsgPack.msg_sub_type = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    chatroomMsgPack.channel_id = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public ChatroomMsgPack setChannel_id(int i) {
        this.channel_id = i;
        return this;
    }

    public ChatroomMsgPack setCli_msg_id(String str) {
        this.cli_msg_id = str;
        return this;
    }

    public ChatroomMsgPack setFrom_username(String str) {
        this.from_username = str;
        return this;
    }

    public ChatroomMsgPack setMsg_content(MsgContent msgContent) {
        this.msg_content = msgContent;
        return this;
    }

    public ChatroomMsgPack setMsg_options(MsgOptions msgOptions) {
        this.msg_options = msgOptions;
        return this;
    }

    public ChatroomMsgPack setMsg_sub_type(int i) {
        this.msg_sub_type = i;
        return this;
    }

    public ChatroomMsgPack setMsg_type(int i) {
        this.msg_type = i;
        return this;
    }

    public ChatroomMsgPack setSend_time(long j) {
        this.send_time = j;
        return this;
    }

    public ChatroomMsgPack setSeq(long j) {
        this.seq = j;
        return this;
    }
}
