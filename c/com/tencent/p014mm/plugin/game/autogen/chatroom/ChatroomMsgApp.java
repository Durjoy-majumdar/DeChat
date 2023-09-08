package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp */
public class ChatroomMsgApp extends C47465a {
    public String bg_pic_url;
    public Color button_bg_color;
    public String button_des;
    public String des;
    public JumpInfo jump_info;
    public String second_des;
    public String title;
    public int type;

    public static final ChatroomMsgApp create() {
        return new ChatroomMsgApp();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomMsgApp)) {
            return false;
        }
        ChatroomMsgApp chatroomMsgApp = (ChatroomMsgApp) aVar;
        return C46238a.m51546a(this.title, chatroomMsgApp.title) && C46238a.m51546a(this.des, chatroomMsgApp.des) && C46238a.m51546a(this.button_des, chatroomMsgApp.button_des) && C46238a.m51546a(this.bg_pic_url, chatroomMsgApp.bg_pic_url) && C46238a.m51546a(Integer.valueOf(this.type), Integer.valueOf(chatroomMsgApp.type)) && C46238a.m51546a(this.second_des, chatroomMsgApp.second_des) && C46238a.m51546a(this.button_bg_color, chatroomMsgApp.button_bg_color) && C46238a.m51546a(this.jump_info, chatroomMsgApp.jump_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.title;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.des;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.button_des;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.bg_pic_url;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.type);
            String str5 = this.second_des;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            Color color = this.button_bg_color;
            if (color != null) {
                aVar.mo74322i(8, color.computeSize());
                this.button_bg_color.writeFields(aVar);
            }
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(7, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.title;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.des;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.button_des;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.bg_pic_url;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            int e = i2 + C52418a.m58678e(5, this.type);
            String str10 = this.second_des;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            Color color2 = this.button_bg_color;
            if (color2 != null) {
                e += C52418a.m58682i(8, color2.computeSize());
            }
            JumpInfo jumpInfo2 = this.jump_info;
            return jumpInfo2 != null ? e + C52418a.m58682i(7, jumpInfo2.computeSize()) : e;
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
            ChatroomMsgApp chatroomMsgApp = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    chatroomMsgApp.title = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    chatroomMsgApp.des = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    chatroomMsgApp.button_des = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    chatroomMsgApp.bg_pic_url = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    chatroomMsgApp.type = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    chatroomMsgApp.second_des = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        JumpInfo jumpInfo3 = new JumpInfo();
                        if (bArr != null && bArr.length > 0) {
                            jumpInfo3.parseFrom(bArr);
                        }
                        chatroomMsgApp.jump_info = jumpInfo3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        Color color3 = new Color();
                        if (bArr2 != null && bArr2.length > 0) {
                            color3.parseFrom(bArr2);
                        }
                        chatroomMsgApp.button_bg_color = color3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public ChatroomMsgApp setBg_pic_url(String str) {
        this.bg_pic_url = str;
        return this;
    }

    public ChatroomMsgApp setButton_bg_color(Color color) {
        this.button_bg_color = color;
        return this;
    }

    public ChatroomMsgApp setButton_des(String str) {
        this.button_des = str;
        return this;
    }

    public ChatroomMsgApp setDes(String str) {
        this.des = str;
        return this;
    }

    public ChatroomMsgApp setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public ChatroomMsgApp setSecond_des(String str) {
        this.second_des = str;
        return this;
    }

    public ChatroomMsgApp setTitle(String str) {
        this.title = str;
        return this;
    }

    public ChatroomMsgApp setType(int i) {
        this.type = i;
        return this;
    }
}
