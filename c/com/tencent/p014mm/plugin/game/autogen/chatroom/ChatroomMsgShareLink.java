package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink */
public class ChatroomMsgShareLink extends C47465a {
    public String desc;
    public JumpInfo jump_info;
    public String pic_url;
    public String title;

    public static final ChatroomMsgShareLink create() {
        return new ChatroomMsgShareLink();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomMsgShareLink)) {
            return false;
        }
        ChatroomMsgShareLink chatroomMsgShareLink = (ChatroomMsgShareLink) aVar;
        return C46238a.m51546a(this.pic_url, chatroomMsgShareLink.pic_url) && C46238a.m51546a(this.title, chatroomMsgShareLink.title) && C46238a.m51546a(this.desc, chatroomMsgShareLink.desc) && C46238a.m51546a(this.jump_info, chatroomMsgShareLink.jump_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.pic_url;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.title;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.desc;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(4, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.pic_url;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.title;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.desc;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            JumpInfo jumpInfo2 = this.jump_info;
            return jumpInfo2 != null ? i2 + C52418a.m58682i(4, jumpInfo2.computeSize()) : i2;
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
            ChatroomMsgShareLink chatroomMsgShareLink = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                chatroomMsgShareLink.pic_url = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                chatroomMsgShareLink.title = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                chatroomMsgShareLink.desc = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    JumpInfo jumpInfo3 = new JumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        jumpInfo3.parseFrom(bArr);
                    }
                    chatroomMsgShareLink.jump_info = jumpInfo3;
                }
                return 0;
            }
        }
    }

    public ChatroomMsgShareLink setDesc(String str) {
        this.desc = str;
        return this;
    }

    public ChatroomMsgShareLink setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public ChatroomMsgShareLink setPic_url(String str) {
        this.pic_url = str;
        return this;
    }

    public ChatroomMsgShareLink setTitle(String str) {
        this.title = str;
        return this;
    }
}
