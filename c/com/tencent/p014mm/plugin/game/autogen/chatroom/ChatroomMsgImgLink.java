package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink */
public class ChatroomMsgImgLink extends C47465a {
    public JumpInfo jump_info;
    public int pic_height;
    public String pic_url;
    public int pic_width;
    public int playtime;
    public int type;

    public static final ChatroomMsgImgLink create() {
        return new ChatroomMsgImgLink();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomMsgImgLink)) {
            return false;
        }
        ChatroomMsgImgLink chatroomMsgImgLink = (ChatroomMsgImgLink) aVar;
        return C46238a.m51546a(Integer.valueOf(this.type), Integer.valueOf(chatroomMsgImgLink.type)) && C46238a.m51546a(this.pic_url, chatroomMsgImgLink.pic_url) && C46238a.m51546a(Integer.valueOf(this.playtime), Integer.valueOf(chatroomMsgImgLink.playtime)) && C46238a.m51546a(this.jump_info, chatroomMsgImgLink.jump_info) && C46238a.m51546a(Integer.valueOf(this.pic_width), Integer.valueOf(chatroomMsgImgLink.pic_width)) && C46238a.m51546a(Integer.valueOf(this.pic_height), Integer.valueOf(chatroomMsgImgLink.pic_height));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.type);
            String str = this.pic_url;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.playtime);
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(4, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            aVar.mo74318e(5, this.pic_width);
            aVar.mo74318e(6, this.pic_height);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.type) + 0;
            String str2 = this.pic_url;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            int e2 = e + C52418a.m58678e(3, this.playtime);
            JumpInfo jumpInfo2 = this.jump_info;
            if (jumpInfo2 != null) {
                e2 += C52418a.m58682i(4, jumpInfo2.computeSize());
            }
            return e2 + C52418a.m58678e(5, this.pic_width) + C52418a.m58678e(6, this.pic_height);
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
            ChatroomMsgImgLink chatroomMsgImgLink = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    chatroomMsgImgLink.type = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    chatroomMsgImgLink.pic_url = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    chatroomMsgImgLink.playtime = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        JumpInfo jumpInfo3 = new JumpInfo();
                        if (bArr != null && bArr.length > 0) {
                            jumpInfo3.parseFrom(bArr);
                        }
                        chatroomMsgImgLink.jump_info = jumpInfo3;
                    }
                    return 0;
                case 5:
                    chatroomMsgImgLink.pic_width = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    chatroomMsgImgLink.pic_height = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public ChatroomMsgImgLink setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public ChatroomMsgImgLink setPic_height(int i) {
        this.pic_height = i;
        return this;
    }

    public ChatroomMsgImgLink setPic_url(String str) {
        this.pic_url = str;
        return this;
    }

    public ChatroomMsgImgLink setPic_width(int i) {
        this.pic_width = i;
        return this;
    }

    public ChatroomMsgImgLink setPlaytime(int i) {
        this.playtime = i;
        return this;
    }

    public ChatroomMsgImgLink setType(int i) {
        this.type = i;
        return this;
    }
}
