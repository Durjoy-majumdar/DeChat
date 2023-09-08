package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom */
public class LocalMyChatRoom extends C47465a {
    public LinkedList<MyChatroomInfo> my_chatroom_info_list = new LinkedList<>();
    public MyChatroomNotice my_chatroom_notice;

    public static final LocalMyChatRoom create() {
        return new LocalMyChatRoom();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof LocalMyChatRoom)) {
            return false;
        }
        LocalMyChatRoom localMyChatRoom = (LocalMyChatRoom) aVar;
        return C46238a.m51546a(this.my_chatroom_info_list, localMyChatRoom.my_chatroom_info_list) && C46238a.m51546a(this.my_chatroom_notice, localMyChatRoom.my_chatroom_notice);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.my_chatroom_info_list);
            MyChatroomNotice myChatroomNotice = this.my_chatroom_notice;
            if (myChatroomNotice != null) {
                aVar.mo74322i(2, myChatroomNotice.computeSize());
                this.my_chatroom_notice.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.my_chatroom_info_list) + 0;
            MyChatroomNotice myChatroomNotice2 = this.my_chatroom_notice;
            return myChatroomNotice2 != null ? g + C52418a.m58682i(2, myChatroomNotice2.computeSize()) : g;
        } else if (i == 2) {
            this.my_chatroom_info_list.clear();
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
            LocalMyChatRoom localMyChatRoom = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    MyChatroomInfo myChatroomInfo = new MyChatroomInfo();
                    if (bArr != null && bArr.length > 0) {
                        myChatroomInfo.parseFrom(bArr);
                    }
                    localMyChatRoom.my_chatroom_info_list.add(myChatroomInfo);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    MyChatroomNotice myChatroomNotice3 = new MyChatroomNotice();
                    if (bArr2 != null && bArr2.length > 0) {
                        myChatroomNotice3.parseFrom(bArr2);
                    }
                    localMyChatRoom.my_chatroom_notice = myChatroomNotice3;
                }
                return 0;
            }
        }
    }

    public LocalMyChatRoom setMy_chatroom_info_list(LinkedList<MyChatroomInfo> linkedList) {
        this.my_chatroom_info_list = linkedList;
        return this;
    }

    public LocalMyChatRoom setMy_chatroom_notice(MyChatroomNotice myChatroomNotice) {
        this.my_chatroom_notice = myChatroomNotice;
        return this;
    }
}
