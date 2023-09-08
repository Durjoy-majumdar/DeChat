package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard */
public class ChatroomMsgImgCard extends C47465a {
    public String desc;
    public JumpInfo img_jump_info;
    public String pic_url;
    public boolean show_video_play;

    public static final ChatroomMsgImgCard create() {
        return new ChatroomMsgImgCard();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomMsgImgCard)) {
            return false;
        }
        ChatroomMsgImgCard chatroomMsgImgCard = (ChatroomMsgImgCard) aVar;
        return C46238a.m51546a(this.pic_url, chatroomMsgImgCard.pic_url) && C46238a.m51546a(this.desc, chatroomMsgImgCard.desc) && C46238a.m51546a(this.img_jump_info, chatroomMsgImgCard.img_jump_info) && C46238a.m51546a(Boolean.valueOf(this.show_video_play), Boolean.valueOf(chatroomMsgImgCard.show_video_play));
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
            String str2 = this.desc;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            JumpInfo jumpInfo = this.img_jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(3, jumpInfo.computeSize());
                this.img_jump_info.writeFields(aVar);
            }
            aVar.mo74314a(4, this.show_video_play);
            return 0;
        } else if (i == 1) {
            String str3 = this.pic_url;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.desc;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            JumpInfo jumpInfo2 = this.img_jump_info;
            if (jumpInfo2 != null) {
                i2 += C52418a.m58682i(3, jumpInfo2.computeSize());
            }
            return i2 + C52418a.m58674a(4, this.show_video_play);
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
            ChatroomMsgImgCard chatroomMsgImgCard = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                chatroomMsgImgCard.pic_url = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                chatroomMsgImgCard.desc = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    JumpInfo jumpInfo3 = new JumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        jumpInfo3.parseFrom(bArr);
                    }
                    chatroomMsgImgCard.img_jump_info = jumpInfo3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                chatroomMsgImgCard.show_video_play = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }

    public ChatroomMsgImgCard setDesc(String str) {
        this.desc = str;
        return this;
    }

    public ChatroomMsgImgCard setImg_jump_info(JumpInfo jumpInfo) {
        this.img_jump_info = jumpInfo;
        return this;
    }

    public ChatroomMsgImgCard setPic_url(String str) {
        this.pic_url = str;
        return this;
    }

    public ChatroomMsgImgCard setShow_video_play(boolean z) {
        this.show_video_play = z;
        return this;
    }
}
