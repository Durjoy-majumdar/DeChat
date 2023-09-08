package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse */
public class GetChatroomBaseInfoResponse extends C49335eu3 {
    public Background background;
    public ChannelInfo channel_info;
    public ChatroomButton chatroom_button;
    public ChatroomEnterInfo chatroom_enter_info;
    public RealtimeControlInfo control_info;
    public ChatroomData current_chatroom_data;
    public ChatroomUserData current_user_data;
    public ChatroomExternInfo extern_info;
    public FirstEnterNotify first_enter_notify;
    public ChatroomJumpInfo jump_info;
    public MsgBaseInfo msg_base_info;
    public ChatroomPreloadInfo preload_info;
    public LinkedList<RobotInfo> robot_info_list = new LinkedList<>();

    public static final GetChatroomBaseInfoResponse create() {
        return new GetChatroomBaseInfoResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetChatroomBaseInfoResponse)) {
            return false;
        }
        GetChatroomBaseInfoResponse getChatroomBaseInfoResponse = (GetChatroomBaseInfoResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, getChatroomBaseInfoResponse.BaseResponse) && C46238a.m51546a(this.current_user_data, getChatroomBaseInfoResponse.current_user_data) && C46238a.m51546a(this.current_chatroom_data, getChatroomBaseInfoResponse.current_chatroom_data) && C46238a.m51546a(this.chatroom_button, getChatroomBaseInfoResponse.chatroom_button) && C46238a.m51546a(this.control_info, getChatroomBaseInfoResponse.control_info) && C46238a.m51546a(this.preload_info, getChatroomBaseInfoResponse.preload_info) && C46238a.m51546a(this.robot_info_list, getChatroomBaseInfoResponse.robot_info_list) && C46238a.m51546a(this.jump_info, getChatroomBaseInfoResponse.jump_info) && C46238a.m51546a(this.extern_info, getChatroomBaseInfoResponse.extern_info) && C46238a.m51546a(this.channel_info, getChatroomBaseInfoResponse.channel_info) && C46238a.m51546a(this.msg_base_info, getChatroomBaseInfoResponse.msg_base_info) && C46238a.m51546a(this.first_enter_notify, getChatroomBaseInfoResponse.first_enter_notify) && C46238a.m51546a(this.chatroom_enter_info, getChatroomBaseInfoResponse.chatroom_enter_info) && C46238a.m51546a(this.background, getChatroomBaseInfoResponse.background);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            ChatroomUserData chatroomUserData = this.current_user_data;
            if (chatroomUserData != null) {
                aVar.mo74322i(2, chatroomUserData.computeSize());
                this.current_user_data.writeFields(aVar);
            }
            ChatroomData chatroomData = this.current_chatroom_data;
            if (chatroomData != null) {
                aVar.mo74322i(3, chatroomData.computeSize());
                this.current_chatroom_data.writeFields(aVar);
            }
            ChatroomButton chatroomButton = this.chatroom_button;
            if (chatroomButton != null) {
                aVar.mo74322i(4, chatroomButton.computeSize());
                this.chatroom_button.writeFields(aVar);
            }
            RealtimeControlInfo realtimeControlInfo = this.control_info;
            if (realtimeControlInfo != null) {
                aVar.mo74322i(5, realtimeControlInfo.computeSize());
                this.control_info.writeFields(aVar);
            }
            ChatroomPreloadInfo chatroomPreloadInfo = this.preload_info;
            if (chatroomPreloadInfo != null) {
                aVar.mo74322i(6, chatroomPreloadInfo.computeSize());
                this.preload_info.writeFields(aVar);
            }
            aVar.mo74320g(7, 8, this.robot_info_list);
            ChatroomJumpInfo chatroomJumpInfo = this.jump_info;
            if (chatroomJumpInfo != null) {
                aVar.mo74322i(8, chatroomJumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            ChatroomExternInfo chatroomExternInfo = this.extern_info;
            if (chatroomExternInfo != null) {
                aVar.mo74322i(9, chatroomExternInfo.computeSize());
                this.extern_info.writeFields(aVar);
            }
            ChannelInfo channelInfo = this.channel_info;
            if (channelInfo != null) {
                aVar.mo74322i(10, channelInfo.computeSize());
                this.channel_info.writeFields(aVar);
            }
            MsgBaseInfo msgBaseInfo = this.msg_base_info;
            if (msgBaseInfo != null) {
                aVar.mo74322i(11, msgBaseInfo.computeSize());
                this.msg_base_info.writeFields(aVar);
            }
            FirstEnterNotify firstEnterNotify = this.first_enter_notify;
            if (firstEnterNotify != null) {
                aVar.mo74322i(12, firstEnterNotify.computeSize());
                this.first_enter_notify.writeFields(aVar);
            }
            ChatroomEnterInfo chatroomEnterInfo = this.chatroom_enter_info;
            if (chatroomEnterInfo != null) {
                aVar.mo74322i(13, chatroomEnterInfo.computeSize());
                this.chatroom_enter_info.writeFields(aVar);
            }
            Background background2 = this.background;
            if (background2 != null) {
                aVar.mo74322i(14, background2.computeSize());
                this.background.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            ChatroomUserData chatroomUserData2 = this.current_user_data;
            if (chatroomUserData2 != null) {
                i3 += C52418a.m58682i(2, chatroomUserData2.computeSize());
            }
            ChatroomData chatroomData2 = this.current_chatroom_data;
            if (chatroomData2 != null) {
                i3 += C52418a.m58682i(3, chatroomData2.computeSize());
            }
            ChatroomButton chatroomButton2 = this.chatroom_button;
            if (chatroomButton2 != null) {
                i3 += C52418a.m58682i(4, chatroomButton2.computeSize());
            }
            RealtimeControlInfo realtimeControlInfo2 = this.control_info;
            if (realtimeControlInfo2 != null) {
                i3 += C52418a.m58682i(5, realtimeControlInfo2.computeSize());
            }
            ChatroomPreloadInfo chatroomPreloadInfo2 = this.preload_info;
            if (chatroomPreloadInfo2 != null) {
                i3 += C52418a.m58682i(6, chatroomPreloadInfo2.computeSize());
            }
            int g = i3 + C52418a.m58680g(7, 8, this.robot_info_list);
            ChatroomJumpInfo chatroomJumpInfo2 = this.jump_info;
            if (chatroomJumpInfo2 != null) {
                g += C52418a.m58682i(8, chatroomJumpInfo2.computeSize());
            }
            ChatroomExternInfo chatroomExternInfo2 = this.extern_info;
            if (chatroomExternInfo2 != null) {
                g += C52418a.m58682i(9, chatroomExternInfo2.computeSize());
            }
            ChannelInfo channelInfo2 = this.channel_info;
            if (channelInfo2 != null) {
                g += C52418a.m58682i(10, channelInfo2.computeSize());
            }
            MsgBaseInfo msgBaseInfo2 = this.msg_base_info;
            if (msgBaseInfo2 != null) {
                g += C52418a.m58682i(11, msgBaseInfo2.computeSize());
            }
            FirstEnterNotify firstEnterNotify2 = this.first_enter_notify;
            if (firstEnterNotify2 != null) {
                g += C52418a.m58682i(12, firstEnterNotify2.computeSize());
            }
            ChatroomEnterInfo chatroomEnterInfo2 = this.chatroom_enter_info;
            if (chatroomEnterInfo2 != null) {
                g += C52418a.m58682i(13, chatroomEnterInfo2.computeSize());
            }
            Background background3 = this.background;
            return background3 != null ? g + C52418a.m58682i(14, background3.computeSize()) : g;
        } else if (i2 == 2) {
            this.robot_info_list.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            GetChatroomBaseInfoResponse getChatroomBaseInfoResponse = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        getChatroomBaseInfoResponse.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        ChatroomUserData chatroomUserData3 = new ChatroomUserData();
                        if (bArr2 != null && bArr2.length > 0) {
                            chatroomUserData3.parseFrom(bArr2);
                        }
                        getChatroomBaseInfoResponse.current_user_data = chatroomUserData3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        ChatroomData chatroomData3 = new ChatroomData();
                        if (bArr3 != null && bArr3.length > 0) {
                            chatroomData3.parseFrom(bArr3);
                        }
                        getChatroomBaseInfoResponse.current_chatroom_data = chatroomData3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        ChatroomButton chatroomButton3 = new ChatroomButton();
                        if (bArr4 != null && bArr4.length > 0) {
                            chatroomButton3.parseFrom(bArr4);
                        }
                        getChatroomBaseInfoResponse.chatroom_button = chatroomButton3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        RealtimeControlInfo realtimeControlInfo3 = new RealtimeControlInfo();
                        if (bArr5 != null && bArr5.length > 0) {
                            realtimeControlInfo3.parseFrom(bArr5);
                        }
                        getChatroomBaseInfoResponse.control_info = realtimeControlInfo3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        ChatroomPreloadInfo chatroomPreloadInfo3 = new ChatroomPreloadInfo();
                        if (bArr6 != null && bArr6.length > 0) {
                            chatroomPreloadInfo3.parseFrom(bArr6);
                        }
                        getChatroomBaseInfoResponse.preload_info = chatroomPreloadInfo3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        RobotInfo robotInfo = new RobotInfo();
                        if (bArr7 != null && bArr7.length > 0) {
                            robotInfo.parseFrom(bArr7);
                        }
                        getChatroomBaseInfoResponse.robot_info_list.add(robotInfo);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        ChatroomJumpInfo chatroomJumpInfo3 = new ChatroomJumpInfo();
                        if (bArr8 != null && bArr8.length > 0) {
                            chatroomJumpInfo3.parseFrom(bArr8);
                        }
                        getChatroomBaseInfoResponse.jump_info = chatroomJumpInfo3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        ChatroomExternInfo chatroomExternInfo3 = new ChatroomExternInfo();
                        if (bArr9 != null && bArr9.length > 0) {
                            chatroomExternInfo3.parseFrom(bArr9);
                        }
                        getChatroomBaseInfoResponse.extern_info = chatroomExternInfo3;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        ChannelInfo channelInfo3 = new ChannelInfo();
                        if (bArr10 != null && bArr10.length > 0) {
                            channelInfo3.parseFrom(bArr10);
                        }
                        getChatroomBaseInfoResponse.channel_info = channelInfo3;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        MsgBaseInfo msgBaseInfo3 = new MsgBaseInfo();
                        if (bArr11 != null && bArr11.length > 0) {
                            msgBaseInfo3.parseFrom(bArr11);
                        }
                        getChatroomBaseInfoResponse.msg_base_info = msgBaseInfo3;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        FirstEnterNotify firstEnterNotify3 = new FirstEnterNotify();
                        if (bArr12 != null && bArr12.length > 0) {
                            firstEnterNotify3.parseFrom(bArr12);
                        }
                        getChatroomBaseInfoResponse.first_enter_notify = firstEnterNotify3;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        ChatroomEnterInfo chatroomEnterInfo3 = new ChatroomEnterInfo();
                        if (bArr13 != null && bArr13.length > 0) {
                            chatroomEnterInfo3.parseFrom(bArr13);
                        }
                        getChatroomBaseInfoResponse.chatroom_enter_info = chatroomEnterInfo3;
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i27 = 0; i27 < size14; i27++) {
                        byte[] bArr14 = j19.get(i27);
                        Background background4 = new Background();
                        if (bArr14 != null && bArr14.length > 0) {
                            background4.parseFrom(bArr14);
                        }
                        getChatroomBaseInfoResponse.background = background4;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public GetChatroomBaseInfoResponse setBackground(Background background2) {
        this.background = background2;
        return this;
    }

    public GetChatroomBaseInfoResponse setChannel_info(ChannelInfo channelInfo) {
        this.channel_info = channelInfo;
        return this;
    }

    public GetChatroomBaseInfoResponse setChatroom_button(ChatroomButton chatroomButton) {
        this.chatroom_button = chatroomButton;
        return this;
    }

    public GetChatroomBaseInfoResponse setChatroom_enter_info(ChatroomEnterInfo chatroomEnterInfo) {
        this.chatroom_enter_info = chatroomEnterInfo;
        return this;
    }

    public GetChatroomBaseInfoResponse setControl_info(RealtimeControlInfo realtimeControlInfo) {
        this.control_info = realtimeControlInfo;
        return this;
    }

    public GetChatroomBaseInfoResponse setCurrent_chatroom_data(ChatroomData chatroomData) {
        this.current_chatroom_data = chatroomData;
        return this;
    }

    public GetChatroomBaseInfoResponse setCurrent_user_data(ChatroomUserData chatroomUserData) {
        this.current_user_data = chatroomUserData;
        return this;
    }

    public GetChatroomBaseInfoResponse setExtern_info(ChatroomExternInfo chatroomExternInfo) {
        this.extern_info = chatroomExternInfo;
        return this;
    }

    public GetChatroomBaseInfoResponse setFirst_enter_notify(FirstEnterNotify firstEnterNotify) {
        this.first_enter_notify = firstEnterNotify;
        return this;
    }

    public GetChatroomBaseInfoResponse setJump_info(ChatroomJumpInfo chatroomJumpInfo) {
        this.jump_info = chatroomJumpInfo;
        return this;
    }

    public GetChatroomBaseInfoResponse setMsg_base_info(MsgBaseInfo msgBaseInfo) {
        this.msg_base_info = msgBaseInfo;
        return this;
    }

    public GetChatroomBaseInfoResponse setPreload_info(ChatroomPreloadInfo chatroomPreloadInfo) {
        this.preload_info = chatroomPreloadInfo;
        return this;
    }

    public GetChatroomBaseInfoResponse setRobot_info_list(LinkedList<RobotInfo> linkedList) {
        this.robot_info_list = linkedList;
        return this;
    }
}
