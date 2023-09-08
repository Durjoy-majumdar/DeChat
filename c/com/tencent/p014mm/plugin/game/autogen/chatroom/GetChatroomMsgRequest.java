package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest */
public class GetChatroomMsgRequest extends C101820nt3 {
    public int channel_id;
    public String chatroom_name;
    public long seq_gt;
    public long seq_lt;

    public static final GetChatroomMsgRequest create() {
        return new GetChatroomMsgRequest();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetChatroomMsgRequest)) {
            return false;
        }
        GetChatroomMsgRequest getChatroomMsgRequest = (GetChatroomMsgRequest) aVar;
        return C46238a.m51546a(this.BaseRequest, getChatroomMsgRequest.BaseRequest) && C46238a.m51546a(this.chatroom_name, getChatroomMsgRequest.chatroom_name) && C46238a.m51546a(Long.valueOf(this.seq_gt), Long.valueOf(getChatroomMsgRequest.seq_gt)) && C46238a.m51546a(Long.valueOf(this.seq_lt), Long.valueOf(getChatroomMsgRequest.seq_lt)) && C46238a.m51546a(Integer.valueOf(this.channel_id), Integer.valueOf(getChatroomMsgRequest.channel_id));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.chatroom_name != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.chatroom_name;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74321h(3, this.seq_gt);
                aVar.mo74321h(4, this.seq_lt);
                aVar.mo74318e(5, this.channel_id);
                return 0;
            }
            throw new C52419b("Not all required fields were included: chatroom_name");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.chatroom_name;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58681h(3, this.seq_gt) + C52418a.m58681h(4, this.seq_lt) + C52418a.m58678e(5, this.channel_id);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.chatroom_name != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: chatroom_name");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            GetChatroomMsgRequest getChatroomMsgRequest = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    getChatroomMsgRequest.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                getChatroomMsgRequest.chatroom_name = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                getChatroomMsgRequest.seq_gt = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                getChatroomMsgRequest.seq_lt = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                getChatroomMsgRequest.channel_id = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public GetChatroomMsgRequest setChannel_id(int i) {
        this.channel_id = i;
        return this;
    }

    public GetChatroomMsgRequest setChatroom_name(String str) {
        this.chatroom_name = str;
        return this;
    }

    public GetChatroomMsgRequest setSeq_gt(long j) {
        this.seq_gt = j;
        return this;
    }

    public GetChatroomMsgRequest setSeq_lt(long j) {
        this.seq_lt = j;
        return this;
    }
}
