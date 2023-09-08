package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice */
public class ChatroomNotice extends C47465a {
    public String notice_text;
    public long update_time;
    public int updater_uin;

    public static final ChatroomNotice create() {
        return new ChatroomNotice();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomNotice)) {
            return false;
        }
        ChatroomNotice chatroomNotice = (ChatroomNotice) aVar;
        return C46238a.m51546a(this.notice_text, chatroomNotice.notice_text) && C46238a.m51546a(Long.valueOf(this.update_time), Long.valueOf(chatroomNotice.update_time)) && C46238a.m51546a(Integer.valueOf(this.updater_uin), Integer.valueOf(chatroomNotice.updater_uin));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.notice_text;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.update_time);
            aVar.mo74318e(3, this.updater_uin);
            return 0;
        } else if (i == 1) {
            String str2 = this.notice_text;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.update_time) + C52418a.m58678e(3, this.updater_uin);
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
            ChatroomNotice chatroomNotice = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                chatroomNotice.notice_text = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                chatroomNotice.update_time = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                chatroomNotice.updater_uin = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public ChatroomNotice setNotice_text(String str) {
        this.notice_text = str;
        return this;
    }

    public ChatroomNotice setUpdate_time(long j) {
        this.update_time = j;
        return this;
    }

    public ChatroomNotice setUpdater_uin(int i) {
        this.updater_uin = i;
        return this;
    }
}
