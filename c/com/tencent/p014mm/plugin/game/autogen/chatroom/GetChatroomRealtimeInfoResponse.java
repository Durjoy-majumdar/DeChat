package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse */
public class GetChatroomRealtimeInfoResponse extends C49335eu3 {
    public AtInfo at_info;
    public Broadcast broadcast;
    public RealtimeControlInfo control_info;
    public ChatroomData current_chatroom_data;
    public String next_version;
    public NotificationBar notification_bar;
    public Popup popup;
    public SlotList slot_list;

    public static final GetChatroomRealtimeInfoResponse create() {
        return new GetChatroomRealtimeInfoResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetChatroomRealtimeInfoResponse)) {
            return false;
        }
        GetChatroomRealtimeInfoResponse getChatroomRealtimeInfoResponse = (GetChatroomRealtimeInfoResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, getChatroomRealtimeInfoResponse.BaseResponse) && C46238a.m51546a(this.notification_bar, getChatroomRealtimeInfoResponse.notification_bar) && C46238a.m51546a(this.slot_list, getChatroomRealtimeInfoResponse.slot_list) && C46238a.m51546a(this.broadcast, getChatroomRealtimeInfoResponse.broadcast) && C46238a.m51546a(this.next_version, getChatroomRealtimeInfoResponse.next_version) && C46238a.m51546a(this.at_info, getChatroomRealtimeInfoResponse.at_info) && C46238a.m51546a(this.current_chatroom_data, getChatroomRealtimeInfoResponse.current_chatroom_data) && C46238a.m51546a(this.control_info, getChatroomRealtimeInfoResponse.control_info) && C46238a.m51546a(this.popup, getChatroomRealtimeInfoResponse.popup);
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
            NotificationBar notificationBar = this.notification_bar;
            if (notificationBar != null) {
                aVar.mo74322i(2, notificationBar.computeSize());
                this.notification_bar.writeFields(aVar);
            }
            SlotList slotList = this.slot_list;
            if (slotList != null) {
                aVar.mo74322i(3, slotList.computeSize());
                this.slot_list.writeFields(aVar);
            }
            Broadcast broadcast2 = this.broadcast;
            if (broadcast2 != null) {
                aVar.mo74322i(4, broadcast2.computeSize());
                this.broadcast.writeFields(aVar);
            }
            String str = this.next_version;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            AtInfo atInfo = this.at_info;
            if (atInfo != null) {
                aVar.mo74322i(6, atInfo.computeSize());
                this.at_info.writeFields(aVar);
            }
            ChatroomData chatroomData = this.current_chatroom_data;
            if (chatroomData != null) {
                aVar.mo74322i(7, chatroomData.computeSize());
                this.current_chatroom_data.writeFields(aVar);
            }
            RealtimeControlInfo realtimeControlInfo = this.control_info;
            if (realtimeControlInfo != null) {
                aVar.mo74322i(8, realtimeControlInfo.computeSize());
                this.control_info.writeFields(aVar);
            }
            Popup popup2 = this.popup;
            if (popup2 != null) {
                aVar.mo74322i(9, popup2.computeSize());
                this.popup.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            NotificationBar notificationBar2 = this.notification_bar;
            if (notificationBar2 != null) {
                i2 += C52418a.m58682i(2, notificationBar2.computeSize());
            }
            SlotList slotList2 = this.slot_list;
            if (slotList2 != null) {
                i2 += C52418a.m58682i(3, slotList2.computeSize());
            }
            Broadcast broadcast3 = this.broadcast;
            if (broadcast3 != null) {
                i2 += C52418a.m58682i(4, broadcast3.computeSize());
            }
            String str2 = this.next_version;
            if (str2 != null) {
                i2 += C52418a.m58683j(5, str2);
            }
            AtInfo atInfo2 = this.at_info;
            if (atInfo2 != null) {
                i2 += C52418a.m58682i(6, atInfo2.computeSize());
            }
            ChatroomData chatroomData2 = this.current_chatroom_data;
            if (chatroomData2 != null) {
                i2 += C52418a.m58682i(7, chatroomData2.computeSize());
            }
            RealtimeControlInfo realtimeControlInfo2 = this.control_info;
            if (realtimeControlInfo2 != null) {
                i2 += C52418a.m58682i(8, realtimeControlInfo2.computeSize());
            }
            Popup popup3 = this.popup;
            return popup3 != null ? i2 + C52418a.m58682i(9, popup3.computeSize()) : i2;
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
            GetChatroomRealtimeInfoResponse getChatroomRealtimeInfoResponse = objArr[1];
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
                        getChatroomRealtimeInfoResponse.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        NotificationBar notificationBar3 = new NotificationBar();
                        if (bArr2 != null && bArr2.length > 0) {
                            notificationBar3.parseFrom(bArr2);
                        }
                        getChatroomRealtimeInfoResponse.notification_bar = notificationBar3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        SlotList slotList3 = new SlotList();
                        if (bArr3 != null && bArr3.length > 0) {
                            slotList3.parseFrom(bArr3);
                        }
                        getChatroomRealtimeInfoResponse.slot_list = slotList3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        Broadcast broadcast4 = new Broadcast();
                        if (bArr4 != null && bArr4.length > 0) {
                            broadcast4.parseFrom(bArr4);
                        }
                        getChatroomRealtimeInfoResponse.broadcast = broadcast4;
                    }
                    return 0;
                case 5:
                    getChatroomRealtimeInfoResponse.next_version = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        AtInfo atInfo3 = new AtInfo();
                        if (bArr5 != null && bArr5.length > 0) {
                            atInfo3.parseFrom(bArr5);
                        }
                        getChatroomRealtimeInfoResponse.at_info = atInfo3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        ChatroomData chatroomData3 = new ChatroomData();
                        if (bArr6 != null && bArr6.length > 0) {
                            chatroomData3.parseFrom(bArr6);
                        }
                        getChatroomRealtimeInfoResponse.current_chatroom_data = chatroomData3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        RealtimeControlInfo realtimeControlInfo3 = new RealtimeControlInfo();
                        if (bArr7 != null && bArr7.length > 0) {
                            realtimeControlInfo3.parseFrom(bArr7);
                        }
                        getChatroomRealtimeInfoResponse.control_info = realtimeControlInfo3;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        Popup popup4 = new Popup();
                        if (bArr8 != null && bArr8.length > 0) {
                            popup4.parseFrom(bArr8);
                        }
                        getChatroomRealtimeInfoResponse.popup = popup4;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public GetChatroomRealtimeInfoResponse setAt_info(AtInfo atInfo) {
        this.at_info = atInfo;
        return this;
    }

    public GetChatroomRealtimeInfoResponse setBroadcast(Broadcast broadcast2) {
        this.broadcast = broadcast2;
        return this;
    }

    public GetChatroomRealtimeInfoResponse setControl_info(RealtimeControlInfo realtimeControlInfo) {
        this.control_info = realtimeControlInfo;
        return this;
    }

    public GetChatroomRealtimeInfoResponse setCurrent_chatroom_data(ChatroomData chatroomData) {
        this.current_chatroom_data = chatroomData;
        return this;
    }

    public GetChatroomRealtimeInfoResponse setNext_version(String str) {
        this.next_version = str;
        return this;
    }

    public GetChatroomRealtimeInfoResponse setNotification_bar(NotificationBar notificationBar) {
        this.notification_bar = notificationBar;
        return this;
    }

    public GetChatroomRealtimeInfoResponse setPopup(Popup popup2) {
        this.popup = popup2;
        return this;
    }

    public GetChatroomRealtimeInfoResponse setSlot_list(SlotList slotList) {
        this.slot_list = slotList;
        return this;
    }
}
