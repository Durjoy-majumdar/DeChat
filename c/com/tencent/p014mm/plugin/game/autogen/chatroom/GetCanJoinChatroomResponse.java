package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse */
public class GetCanJoinChatroomResponse extends C49335eu3 {
    public LinkedList<BanAction> ban_action_list = new LinkedList<>();
    public LinkedList<ChatroomRecInfo> chatroom_info_list = new LinkedList<>();
    public ChatroomJumpDetail chatroom_rank_jump_info;
    public JumpInfo create_jump_info;
    public ChatroomJumpDetail find_more_chatroom_jump_info;
    public JumpInfo find_more_jump_info;
    public boolean show_entrance;

    public static final GetCanJoinChatroomResponse create() {
        return new GetCanJoinChatroomResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetCanJoinChatroomResponse)) {
            return false;
        }
        GetCanJoinChatroomResponse getCanJoinChatroomResponse = (GetCanJoinChatroomResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, getCanJoinChatroomResponse.BaseResponse) && C46238a.m51546a(this.chatroom_info_list, getCanJoinChatroomResponse.chatroom_info_list) && C46238a.m51546a(this.create_jump_info, getCanJoinChatroomResponse.create_jump_info) && C46238a.m51546a(this.ban_action_list, getCanJoinChatroomResponse.ban_action_list) && C46238a.m51546a(Boolean.valueOf(this.show_entrance), Boolean.valueOf(getCanJoinChatroomResponse.show_entrance)) && C46238a.m51546a(this.find_more_jump_info, getCanJoinChatroomResponse.find_more_jump_info) && C46238a.m51546a(this.find_more_chatroom_jump_info, getCanJoinChatroomResponse.find_more_chatroom_jump_info) && C46238a.m51546a(this.chatroom_rank_jump_info, getCanJoinChatroomResponse.chatroom_rank_jump_info);
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
            JumpInfo jumpInfo = this.create_jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(3, jumpInfo.computeSize());
                this.create_jump_info.writeFields(aVar);
            }
            aVar.mo74320g(4, 8, this.ban_action_list);
            aVar.mo74314a(5, this.show_entrance);
            JumpInfo jumpInfo2 = this.find_more_jump_info;
            if (jumpInfo2 != null) {
                aVar.mo74322i(6, jumpInfo2.computeSize());
                this.find_more_jump_info.writeFields(aVar);
            }
            ChatroomJumpDetail chatroomJumpDetail = this.find_more_chatroom_jump_info;
            if (chatroomJumpDetail != null) {
                aVar.mo74322i(7, chatroomJumpDetail.computeSize());
                this.find_more_chatroom_jump_info.writeFields(aVar);
            }
            ChatroomJumpDetail chatroomJumpDetail2 = this.chatroom_rank_jump_info;
            if (chatroomJumpDetail2 != null) {
                aVar.mo74322i(8, chatroomJumpDetail2.computeSize());
                this.chatroom_rank_jump_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.chatroom_info_list);
            JumpInfo jumpInfo3 = this.create_jump_info;
            if (jumpInfo3 != null) {
                g += C52418a.m58682i(3, jumpInfo3.computeSize());
            }
            int g2 = g + C52418a.m58680g(4, 8, this.ban_action_list) + C52418a.m58674a(5, this.show_entrance);
            JumpInfo jumpInfo4 = this.find_more_jump_info;
            if (jumpInfo4 != null) {
                g2 += C52418a.m58682i(6, jumpInfo4.computeSize());
            }
            ChatroomJumpDetail chatroomJumpDetail3 = this.find_more_chatroom_jump_info;
            if (chatroomJumpDetail3 != null) {
                g2 += C52418a.m58682i(7, chatroomJumpDetail3.computeSize());
            }
            ChatroomJumpDetail chatroomJumpDetail4 = this.chatroom_rank_jump_info;
            return chatroomJumpDetail4 != null ? g2 + C52418a.m58682i(8, chatroomJumpDetail4.computeSize()) : g2;
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
            GetCanJoinChatroomResponse getCanJoinChatroomResponse = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        getCanJoinChatroomResponse.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        ChatroomRecInfo chatroomRecInfo = new ChatroomRecInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            chatroomRecInfo.parseFrom(bArr2);
                        }
                        getCanJoinChatroomResponse.chatroom_info_list.add(chatroomRecInfo);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        JumpInfo jumpInfo5 = new JumpInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            jumpInfo5.parseFrom(bArr3);
                        }
                        getCanJoinChatroomResponse.create_jump_info = jumpInfo5;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        BanAction banAction = new BanAction();
                        if (bArr4 != null && bArr4.length > 0) {
                            banAction.parseFrom(bArr4);
                        }
                        getCanJoinChatroomResponse.ban_action_list.add(banAction);
                    }
                    return 0;
                case 5:
                    getCanJoinChatroomResponse.show_entrance = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        JumpInfo jumpInfo6 = new JumpInfo();
                        if (bArr5 != null && bArr5.length > 0) {
                            jumpInfo6.parseFrom(bArr5);
                        }
                        getCanJoinChatroomResponse.find_more_jump_info = jumpInfo6;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        ChatroomJumpDetail chatroomJumpDetail5 = new ChatroomJumpDetail();
                        if (bArr6 != null && bArr6.length > 0) {
                            chatroomJumpDetail5.parseFrom(bArr6);
                        }
                        getCanJoinChatroomResponse.find_more_chatroom_jump_info = chatroomJumpDetail5;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        ChatroomJumpDetail chatroomJumpDetail6 = new ChatroomJumpDetail();
                        if (bArr7 != null && bArr7.length > 0) {
                            chatroomJumpDetail6.parseFrom(bArr7);
                        }
                        getCanJoinChatroomResponse.chatroom_rank_jump_info = chatroomJumpDetail6;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public GetCanJoinChatroomResponse setBan_action_list(LinkedList<BanAction> linkedList) {
        this.ban_action_list = linkedList;
        return this;
    }

    public GetCanJoinChatroomResponse setChatroom_info_list(LinkedList<ChatroomRecInfo> linkedList) {
        this.chatroom_info_list = linkedList;
        return this;
    }

    public GetCanJoinChatroomResponse setChatroom_rank_jump_info(ChatroomJumpDetail chatroomJumpDetail) {
        this.chatroom_rank_jump_info = chatroomJumpDetail;
        return this;
    }

    public GetCanJoinChatroomResponse setCreate_jump_info(JumpInfo jumpInfo) {
        this.create_jump_info = jumpInfo;
        return this;
    }

    public GetCanJoinChatroomResponse setFind_more_chatroom_jump_info(ChatroomJumpDetail chatroomJumpDetail) {
        this.find_more_chatroom_jump_info = chatroomJumpDetail;
        return this;
    }

    public GetCanJoinChatroomResponse setFind_more_jump_info(JumpInfo jumpInfo) {
        this.find_more_jump_info = jumpInfo;
        return this;
    }

    public GetCanJoinChatroomResponse setShow_entrance(boolean z) {
        this.show_entrance = z;
        return this;
    }
}
