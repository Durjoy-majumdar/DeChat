package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo */
public class ChatroomEnterInfo extends C47465a {
    public BackgroundInfo background_info;
    public String buttom_desc;
    public LinkedList<ContentBlock> content_list = new LinkedList<>();
    public String report_str;
    public String title;
    public UserEnterOption user_enter_option;

    public static final ChatroomEnterInfo create() {
        return new ChatroomEnterInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomEnterInfo)) {
            return false;
        }
        ChatroomEnterInfo chatroomEnterInfo = (ChatroomEnterInfo) aVar;
        return C46238a.m51546a(this.title, chatroomEnterInfo.title) && C46238a.m51546a(this.content_list, chatroomEnterInfo.content_list) && C46238a.m51546a(this.user_enter_option, chatroomEnterInfo.user_enter_option) && C46238a.m51546a(this.buttom_desc, chatroomEnterInfo.buttom_desc) && C46238a.m51546a(this.background_info, chatroomEnterInfo.background_info) && C46238a.m51546a(this.report_str, chatroomEnterInfo.report_str);
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
            aVar.mo74320g(2, 8, this.content_list);
            UserEnterOption userEnterOption = this.user_enter_option;
            if (userEnterOption != null) {
                aVar.mo74322i(3, userEnterOption.computeSize());
                this.user_enter_option.writeFields(aVar);
            }
            String str2 = this.buttom_desc;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            BackgroundInfo backgroundInfo = this.background_info;
            if (backgroundInfo != null) {
                aVar.mo74322i(5, backgroundInfo.computeSize());
                this.background_info.writeFields(aVar);
            }
            String str3 = this.report_str;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.title;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.content_list);
            UserEnterOption userEnterOption2 = this.user_enter_option;
            if (userEnterOption2 != null) {
                g += C52418a.m58682i(3, userEnterOption2.computeSize());
            }
            String str5 = this.buttom_desc;
            if (str5 != null) {
                g += C52418a.m58683j(4, str5);
            }
            BackgroundInfo backgroundInfo2 = this.background_info;
            if (backgroundInfo2 != null) {
                g += C52418a.m58682i(5, backgroundInfo2.computeSize());
            }
            String str6 = this.report_str;
            return str6 != null ? g + C52418a.m58683j(6, str6) : g;
        } else if (i == 2) {
            this.content_list.clear();
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
            ChatroomEnterInfo chatroomEnterInfo = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    chatroomEnterInfo.title = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        ContentBlock contentBlock = new ContentBlock();
                        if (bArr != null && bArr.length > 0) {
                            contentBlock.parseFrom(bArr);
                        }
                        chatroomEnterInfo.content_list.add(contentBlock);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        UserEnterOption userEnterOption3 = new UserEnterOption();
                        if (bArr2 != null && bArr2.length > 0) {
                            userEnterOption3.parseFrom(bArr2);
                        }
                        chatroomEnterInfo.user_enter_option = userEnterOption3;
                    }
                    return 0;
                case 4:
                    chatroomEnterInfo.buttom_desc = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        BackgroundInfo backgroundInfo3 = new BackgroundInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            backgroundInfo3.parseFrom(bArr3);
                        }
                        chatroomEnterInfo.background_info = backgroundInfo3;
                    }
                    return 0;
                case 6:
                    chatroomEnterInfo.report_str = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public ChatroomEnterInfo setBackground_info(BackgroundInfo backgroundInfo) {
        this.background_info = backgroundInfo;
        return this;
    }

    public ChatroomEnterInfo setButtom_desc(String str) {
        this.buttom_desc = str;
        return this;
    }

    public ChatroomEnterInfo setContent_list(LinkedList<ContentBlock> linkedList) {
        this.content_list = linkedList;
        return this;
    }

    public ChatroomEnterInfo setReport_str(String str) {
        this.report_str = str;
        return this;
    }

    public ChatroomEnterInfo setTitle(String str) {
        this.title = str;
        return this;
    }

    public ChatroomEnterInfo setUser_enter_option(UserEnterOption userEnterOption) {
        this.user_enter_option = userEnterOption;
        return this;
    }
}
