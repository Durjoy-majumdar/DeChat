package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo */
public class MyChatroomInfo extends C47465a {
    public AbstractInfo abstract_info;
    public AtInfo at_info;
    public ChatroomRecInfo chatroom_info;
    public String last_msg_desc;
    public long unread_msg_count;

    public static final MyChatroomInfo create() {
        return new MyChatroomInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof MyChatroomInfo)) {
            return false;
        }
        MyChatroomInfo myChatroomInfo = (MyChatroomInfo) aVar;
        return C46238a.m51546a(this.chatroom_info, myChatroomInfo.chatroom_info) && C46238a.m51546a(this.at_info, myChatroomInfo.at_info) && C46238a.m51546a(Long.valueOf(this.unread_msg_count), Long.valueOf(myChatroomInfo.unread_msg_count)) && C46238a.m51546a(this.abstract_info, myChatroomInfo.abstract_info) && C46238a.m51546a(this.last_msg_desc, myChatroomInfo.last_msg_desc);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            ChatroomRecInfo chatroomRecInfo = this.chatroom_info;
            if (chatroomRecInfo != null) {
                if (chatroomRecInfo != null) {
                    aVar.mo74322i(1, chatroomRecInfo.computeSize());
                    this.chatroom_info.writeFields(aVar);
                }
                AtInfo atInfo = this.at_info;
                if (atInfo != null) {
                    aVar.mo74322i(2, atInfo.computeSize());
                    this.at_info.writeFields(aVar);
                }
                aVar.mo74321h(3, this.unread_msg_count);
                AbstractInfo abstractInfo = this.abstract_info;
                if (abstractInfo != null) {
                    aVar.mo74322i(4, abstractInfo.computeSize());
                    this.abstract_info.writeFields(aVar);
                }
                String str = this.last_msg_desc;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: chatroom_info");
        } else if (i == 1) {
            ChatroomRecInfo chatroomRecInfo2 = this.chatroom_info;
            if (chatroomRecInfo2 != null) {
                i2 = 0 + C52418a.m58682i(1, chatroomRecInfo2.computeSize());
            }
            AtInfo atInfo2 = this.at_info;
            if (atInfo2 != null) {
                i2 += C52418a.m58682i(2, atInfo2.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.unread_msg_count);
            AbstractInfo abstractInfo2 = this.abstract_info;
            if (abstractInfo2 != null) {
                h += C52418a.m58682i(4, abstractInfo2.computeSize());
            }
            String str2 = this.last_msg_desc;
            return str2 != null ? h + C52418a.m58683j(5, str2) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.chatroom_info != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: chatroom_info");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            MyChatroomInfo myChatroomInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    ChatroomRecInfo chatroomRecInfo3 = new ChatroomRecInfo();
                    if (bArr != null && bArr.length > 0) {
                        chatroomRecInfo3.parseFrom(bArr);
                    }
                    myChatroomInfo.chatroom_info = chatroomRecInfo3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    AtInfo atInfo3 = new AtInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        atInfo3.parseFrom(bArr2);
                    }
                    myChatroomInfo.at_info = atInfo3;
                }
                return 0;
            } else if (intValue == 3) {
                myChatroomInfo.unread_msg_count = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    AbstractInfo abstractInfo3 = new AbstractInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        abstractInfo3.parseFrom(bArr3);
                    }
                    myChatroomInfo.abstract_info = abstractInfo3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                myChatroomInfo.last_msg_desc = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public MyChatroomInfo setAbstract_info(AbstractInfo abstractInfo) {
        this.abstract_info = abstractInfo;
        return this;
    }

    public MyChatroomInfo setAt_info(AtInfo atInfo) {
        this.at_info = atInfo;
        return this;
    }

    public MyChatroomInfo setChatroom_info(ChatroomRecInfo chatroomRecInfo) {
        this.chatroom_info = chatroomRecInfo;
        return this;
    }

    public MyChatroomInfo setLast_msg_desc(String str) {
        this.last_msg_desc = str;
        return this;
    }

    public MyChatroomInfo setUnread_msg_count(long j) {
        this.unread_msg_count = j;
        return this;
    }
}
