package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag */
public class ChatroomTag extends C47465a {
    public Color background_color;
    public boolean bold;
    public Color color;
    public String desc;
    public String icon;
    public long tag_id;
    public JumpInfo tag_jump_info;

    public static final ChatroomTag create() {
        return new ChatroomTag();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomTag)) {
            return false;
        }
        ChatroomTag chatroomTag = (ChatroomTag) aVar;
        return C46238a.m51546a(this.desc, chatroomTag.desc) && C46238a.m51546a(this.icon, chatroomTag.icon) && C46238a.m51546a(this.background_color, chatroomTag.background_color) && C46238a.m51546a(this.color, chatroomTag.color) && C46238a.m51546a(this.tag_jump_info, chatroomTag.tag_jump_info) && C46238a.m51546a(Long.valueOf(this.tag_id), Long.valueOf(chatroomTag.tag_id)) && C46238a.m51546a(Boolean.valueOf(this.bold), Boolean.valueOf(chatroomTag.bold));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.desc;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.icon;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            Color color2 = this.background_color;
            if (color2 != null) {
                aVar.mo74322i(3, color2.computeSize());
                this.background_color.writeFields(aVar);
            }
            Color color3 = this.color;
            if (color3 != null) {
                aVar.mo74322i(4, color3.computeSize());
                this.color.writeFields(aVar);
            }
            JumpInfo jumpInfo = this.tag_jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(5, jumpInfo.computeSize());
                this.tag_jump_info.writeFields(aVar);
            }
            aVar.mo74321h(6, this.tag_id);
            aVar.mo74314a(7, this.bold);
            return 0;
        } else if (i == 1) {
            String str3 = this.desc;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.icon;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            Color color4 = this.background_color;
            if (color4 != null) {
                i2 += C52418a.m58682i(3, color4.computeSize());
            }
            Color color5 = this.color;
            if (color5 != null) {
                i2 += C52418a.m58682i(4, color5.computeSize());
            }
            JumpInfo jumpInfo2 = this.tag_jump_info;
            if (jumpInfo2 != null) {
                i2 += C52418a.m58682i(5, jumpInfo2.computeSize());
            }
            return i2 + C52418a.m58681h(6, this.tag_id) + C52418a.m58674a(7, this.bold);
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
            ChatroomTag chatroomTag = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    chatroomTag.desc = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    chatroomTag.icon = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        Color color6 = new Color();
                        if (bArr != null && bArr.length > 0) {
                            color6.parseFrom(bArr);
                        }
                        chatroomTag.background_color = color6;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        Color color7 = new Color();
                        if (bArr2 != null && bArr2.length > 0) {
                            color7.parseFrom(bArr2);
                        }
                        chatroomTag.color = color7;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        JumpInfo jumpInfo3 = new JumpInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            jumpInfo3.parseFrom(bArr3);
                        }
                        chatroomTag.tag_jump_info = jumpInfo3;
                    }
                    return 0;
                case 6:
                    chatroomTag.tag_id = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    chatroomTag.bold = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public ChatroomTag setBackground_color(Color color2) {
        this.background_color = color2;
        return this;
    }

    public ChatroomTag setBold(boolean z) {
        this.bold = z;
        return this;
    }

    public ChatroomTag setColor(Color color2) {
        this.color = color2;
        return this;
    }

    public ChatroomTag setDesc(String str) {
        this.desc = str;
        return this;
    }

    public ChatroomTag setIcon(String str) {
        this.icon = str;
        return this;
    }

    public ChatroomTag setTag_id(long j) {
        this.tag_id = j;
        return this;
    }

    public ChatroomTag setTag_jump_info(JumpInfo jumpInfo) {
        this.tag_jump_info = jumpInfo;
        return this;
    }
}
