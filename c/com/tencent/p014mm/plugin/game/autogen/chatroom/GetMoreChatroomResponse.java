package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse */
public class GetMoreChatroomResponse extends C49335eu3 {
    public LinkedList<BanAction> ban_action_list = new LinkedList<>();
    public String chatroom_filter;
    public LinkedList<ChatroomRecInfo> chatroom_info_list = new LinkedList<>();
    public boolean has_next;

    public static final GetMoreChatroomResponse create() {
        return new GetMoreChatroomResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetMoreChatroomResponse)) {
            return false;
        }
        GetMoreChatroomResponse getMoreChatroomResponse = (GetMoreChatroomResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, getMoreChatroomResponse.BaseResponse) && C46238a.m51546a(this.chatroom_info_list, getMoreChatroomResponse.chatroom_info_list) && C46238a.m51546a(Boolean.valueOf(this.has_next), Boolean.valueOf(getMoreChatroomResponse.has_next)) && C46238a.m51546a(this.chatroom_filter, getMoreChatroomResponse.chatroom_filter) && C46238a.m51546a(this.ban_action_list, getMoreChatroomResponse.ban_action_list);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.chatroom_info_list);
            aVar.mo74314a(3, this.has_next);
            String str = this.chatroom_filter;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74320g(5, 8, this.ban_action_list);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.chatroom_info_list) + C52418a.m58674a(3, this.has_next);
            String str2 = this.chatroom_filter;
            if (str2 != null) {
                g += C52418a.m58683j(4, str2);
            }
            return g + C52418a.m58680g(5, 8, this.ban_action_list);
        } else if (i == 2) {
            this.chatroom_info_list.clear();
            this.ban_action_list.clear();
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
            GetMoreChatroomResponse getMoreChatroomResponse = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    getMoreChatroomResponse.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    ChatroomRecInfo chatroomRecInfo = new ChatroomRecInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        chatroomRecInfo.parseFrom(bArr2);
                    }
                    getMoreChatroomResponse.chatroom_info_list.add(chatroomRecInfo);
                }
                return 0;
            } else if (intValue == 3) {
                getMoreChatroomResponse.has_next = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 4) {
                getMoreChatroomResponse.chatroom_filter = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    BanAction banAction = new BanAction();
                    if (bArr3 != null && bArr3.length > 0) {
                        banAction.parseFrom(bArr3);
                    }
                    getMoreChatroomResponse.ban_action_list.add(banAction);
                }
                return 0;
            }
        }
    }

    public GetMoreChatroomResponse setBan_action_list(LinkedList<BanAction> linkedList) {
        this.ban_action_list = linkedList;
        return this;
    }

    public GetMoreChatroomResponse setChatroom_filter(String str) {
        this.chatroom_filter = str;
        return this;
    }

    public GetMoreChatroomResponse setChatroom_info_list(LinkedList<ChatroomRecInfo> linkedList) {
        this.chatroom_info_list = linkedList;
        return this;
    }

    public GetMoreChatroomResponse setHas_next(boolean z) {
        this.has_next = z;
        return this;
    }
}
