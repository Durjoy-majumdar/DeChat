package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse */
public class ReceiveChatroomMsgResponse extends C49335eu3 {
    public AtInfo at_info;
    public long last_received_seq;
    public LinkedList<ChatroomMsgPack> msg_pack_list = new LinkedList<>();
    public long next_seq;
    public String next_version;
    public LinkedList<NoticeMsg> notice_msg_list = new LinkedList<>();
    public LinkedList<ChatroomMsgPack> refresh_msg_pack_list = new LinkedList<>();

    public static final ReceiveChatroomMsgResponse create() {
        return new ReceiveChatroomMsgResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ReceiveChatroomMsgResponse)) {
            return false;
        }
        ReceiveChatroomMsgResponse receiveChatroomMsgResponse = (ReceiveChatroomMsgResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, receiveChatroomMsgResponse.BaseResponse) && C46238a.m51546a(this.msg_pack_list, receiveChatroomMsgResponse.msg_pack_list) && C46238a.m51546a(Long.valueOf(this.next_seq), Long.valueOf(receiveChatroomMsgResponse.next_seq)) && C46238a.m51546a(this.at_info, receiveChatroomMsgResponse.at_info) && C46238a.m51546a(this.notice_msg_list, receiveChatroomMsgResponse.notice_msg_list) && C46238a.m51546a(Long.valueOf(this.last_received_seq), Long.valueOf(receiveChatroomMsgResponse.last_received_seq)) && C46238a.m51546a(this.refresh_msg_pack_list, receiveChatroomMsgResponse.refresh_msg_pack_list) && C46238a.m51546a(this.next_version, receiveChatroomMsgResponse.next_version);
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
            aVar.mo74320g(2, 8, this.msg_pack_list);
            aVar.mo74321h(3, this.next_seq);
            AtInfo atInfo = this.at_info;
            if (atInfo != null) {
                aVar.mo74322i(4, atInfo.computeSize());
                this.at_info.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.notice_msg_list);
            aVar.mo74321h(6, this.last_received_seq);
            aVar.mo74320g(7, 8, this.refresh_msg_pack_list);
            String str = this.next_version;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.msg_pack_list) + C52418a.m58681h(3, this.next_seq);
            AtInfo atInfo2 = this.at_info;
            if (atInfo2 != null) {
                g += C52418a.m58682i(4, atInfo2.computeSize());
            }
            int g2 = g + C52418a.m58680g(5, 8, this.notice_msg_list) + C52418a.m58681h(6, this.last_received_seq) + C52418a.m58680g(7, 8, this.refresh_msg_pack_list);
            String str2 = this.next_version;
            return str2 != null ? g2 + C52418a.m58683j(8, str2) : g2;
        } else if (i == 2) {
            this.msg_pack_list.clear();
            this.notice_msg_list.clear();
            this.refresh_msg_pack_list.clear();
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
            ReceiveChatroomMsgResponse receiveChatroomMsgResponse = objArr[1];
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
                        receiveChatroomMsgResponse.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        ChatroomMsgPack chatroomMsgPack = new ChatroomMsgPack();
                        if (bArr2 != null && bArr2.length > 0) {
                            chatroomMsgPack.parseFrom(bArr2);
                        }
                        receiveChatroomMsgResponse.msg_pack_list.add(chatroomMsgPack);
                    }
                    return 0;
                case 3:
                    receiveChatroomMsgResponse.next_seq = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        AtInfo atInfo3 = new AtInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            atInfo3.parseFrom(bArr3);
                        }
                        receiveChatroomMsgResponse.at_info = atInfo3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        NoticeMsg noticeMsg = new NoticeMsg();
                        if (bArr4 != null && bArr4.length > 0) {
                            noticeMsg.parseFrom(bArr4);
                        }
                        receiveChatroomMsgResponse.notice_msg_list.add(noticeMsg);
                    }
                    return 0;
                case 6:
                    receiveChatroomMsgResponse.last_received_seq = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        ChatroomMsgPack chatroomMsgPack2 = new ChatroomMsgPack();
                        if (bArr5 != null && bArr5.length > 0) {
                            chatroomMsgPack2.parseFrom(bArr5);
                        }
                        receiveChatroomMsgResponse.refresh_msg_pack_list.add(chatroomMsgPack2);
                    }
                    return 0;
                case 8:
                    receiveChatroomMsgResponse.next_version = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public ReceiveChatroomMsgResponse setAt_info(AtInfo atInfo) {
        this.at_info = atInfo;
        return this;
    }

    public ReceiveChatroomMsgResponse setLast_received_seq(long j) {
        this.last_received_seq = j;
        return this;
    }

    public ReceiveChatroomMsgResponse setMsg_pack_list(LinkedList<ChatroomMsgPack> linkedList) {
        this.msg_pack_list = linkedList;
        return this;
    }

    public ReceiveChatroomMsgResponse setNext_seq(long j) {
        this.next_seq = j;
        return this;
    }

    public ReceiveChatroomMsgResponse setNext_version(String str) {
        this.next_version = str;
        return this;
    }

    public ReceiveChatroomMsgResponse setNotice_msg_list(LinkedList<NoticeMsg> linkedList) {
        this.notice_msg_list = linkedList;
        return this;
    }

    public ReceiveChatroomMsgResponse setRefresh_msg_pack_list(LinkedList<ChatroomMsgPack> linkedList) {
        this.refresh_msg_pack_list = linkedList;
        return this;
    }
}
