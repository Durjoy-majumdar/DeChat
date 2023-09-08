package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser */
public class OnlineUser extends C47465a {
    public LinkedList<ChatroomUserData> chat_user_data = new LinkedList<>();
    public Color icon_color;
    public String left_icon;
    public boolean need_fold;
    public long status;
    public String status_desc;
    public String status_icon;
    public TextInfo text_desc;

    public static final OnlineUser create() {
        return new OnlineUser();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof OnlineUser)) {
            return false;
        }
        OnlineUser onlineUser = (OnlineUser) aVar;
        return C46238a.m51546a(this.chat_user_data, onlineUser.chat_user_data) && C46238a.m51546a(Long.valueOf(this.status), Long.valueOf(onlineUser.status)) && C46238a.m51546a(this.status_icon, onlineUser.status_icon) && C46238a.m51546a(this.icon_color, onlineUser.icon_color) && C46238a.m51546a(this.status_desc, onlineUser.status_desc) && C46238a.m51546a(this.text_desc, onlineUser.text_desc) && C46238a.m51546a(Boolean.valueOf(this.need_fold), Boolean.valueOf(onlineUser.need_fold)) && C46238a.m51546a(this.left_icon, onlineUser.left_icon);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.chat_user_data);
            aVar.mo74321h(2, this.status);
            String str = this.status_icon;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            Color color = this.icon_color;
            if (color != null) {
                aVar.mo74322i(4, color.computeSize());
                this.icon_color.writeFields(aVar);
            }
            String str2 = this.status_desc;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            TextInfo textInfo = this.text_desc;
            if (textInfo != null) {
                aVar.mo74322i(6, textInfo.computeSize());
                this.text_desc.writeFields(aVar);
            }
            aVar.mo74314a(7, this.need_fold);
            String str3 = this.left_icon;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.chat_user_data) + 0 + C52418a.m58681h(2, this.status);
            String str4 = this.status_icon;
            if (str4 != null) {
                g += C52418a.m58683j(3, str4);
            }
            Color color2 = this.icon_color;
            if (color2 != null) {
                g += C52418a.m58682i(4, color2.computeSize());
            }
            String str5 = this.status_desc;
            if (str5 != null) {
                g += C52418a.m58683j(5, str5);
            }
            TextInfo textInfo2 = this.text_desc;
            if (textInfo2 != null) {
                g += C52418a.m58682i(6, textInfo2.computeSize());
            }
            int a = g + C52418a.m58674a(7, this.need_fold);
            String str6 = this.left_icon;
            return str6 != null ? a + C52418a.m58683j(8, str6) : a;
        } else if (i == 2) {
            this.chat_user_data.clear();
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
            OnlineUser onlineUser = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        ChatroomUserData chatroomUserData = new ChatroomUserData();
                        if (bArr != null && bArr.length > 0) {
                            chatroomUserData.parseFrom(bArr);
                        }
                        onlineUser.chat_user_data.add(chatroomUserData);
                    }
                    return 0;
                case 2:
                    onlineUser.status = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    onlineUser.status_icon = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        Color color3 = new Color();
                        if (bArr2 != null && bArr2.length > 0) {
                            color3.parseFrom(bArr2);
                        }
                        onlineUser.icon_color = color3;
                    }
                    return 0;
                case 5:
                    onlineUser.status_desc = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        TextInfo textInfo3 = new TextInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            textInfo3.parseFrom(bArr3);
                        }
                        onlineUser.text_desc = textInfo3;
                    }
                    return 0;
                case 7:
                    onlineUser.need_fold = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    onlineUser.left_icon = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public OnlineUser setChat_user_data(LinkedList<ChatroomUserData> linkedList) {
        this.chat_user_data = linkedList;
        return this;
    }

    public OnlineUser setIcon_color(Color color) {
        this.icon_color = color;
        return this;
    }

    public OnlineUser setLeft_icon(String str) {
        this.left_icon = str;
        return this;
    }

    public OnlineUser setNeed_fold(boolean z) {
        this.need_fold = z;
        return this;
    }

    public OnlineUser setStatus(long j) {
        this.status = j;
        return this;
    }

    public OnlineUser setStatus_desc(String str) {
        this.status_desc = str;
        return this;
    }

    public OnlineUser setStatus_icon(String str) {
        this.status_icon = str;
        return this;
    }

    public OnlineUser setText_desc(TextInfo textInfo) {
        this.text_desc = textInfo;
        return this;
    }
}
