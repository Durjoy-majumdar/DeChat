package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo */
public class MsgBaseInfo extends C47465a {
    public long chatroom_first_seq;
    public EnterLeadSpeakInfo enter_lead_speak_info;

    public static final MsgBaseInfo create() {
        return new MsgBaseInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof MsgBaseInfo)) {
            return false;
        }
        MsgBaseInfo msgBaseInfo = (MsgBaseInfo) aVar;
        return C46238a.m51546a(Long.valueOf(this.chatroom_first_seq), Long.valueOf(msgBaseInfo.chatroom_first_seq)) && C46238a.m51546a(this.enter_lead_speak_info, msgBaseInfo.enter_lead_speak_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.chatroom_first_seq);
            EnterLeadSpeakInfo enterLeadSpeakInfo = this.enter_lead_speak_info;
            if (enterLeadSpeakInfo != null) {
                aVar.mo74322i(2, enterLeadSpeakInfo.computeSize());
                this.enter_lead_speak_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.chatroom_first_seq) + 0;
            EnterLeadSpeakInfo enterLeadSpeakInfo2 = this.enter_lead_speak_info;
            return enterLeadSpeakInfo2 != null ? h + C52418a.m58682i(2, enterLeadSpeakInfo2.computeSize()) : h;
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
            MsgBaseInfo msgBaseInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                msgBaseInfo.chatroom_first_seq = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    EnterLeadSpeakInfo enterLeadSpeakInfo3 = new EnterLeadSpeakInfo();
                    if (bArr != null && bArr.length > 0) {
                        enterLeadSpeakInfo3.parseFrom(bArr);
                    }
                    msgBaseInfo.enter_lead_speak_info = enterLeadSpeakInfo3;
                }
                return 0;
            }
        }
    }

    public MsgBaseInfo setChatroom_first_seq(long j) {
        this.chatroom_first_seq = j;
        return this;
    }

    public MsgBaseInfo setEnter_lead_speak_info(EnterLeadSpeakInfo enterLeadSpeakInfo) {
        this.enter_lead_speak_info = enterLeadSpeakInfo;
        return this;
    }
}
