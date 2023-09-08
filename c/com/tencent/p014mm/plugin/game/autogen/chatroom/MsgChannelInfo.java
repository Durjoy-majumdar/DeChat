package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.MsgChannelInfo */
public class MsgChannelInfo extends C47465a {
    public boolean show_channel_info;

    public static final MsgChannelInfo create() {
        return new MsgChannelInfo();
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof MsgChannelInfo) && C46238a.m51546a(Boolean.valueOf(this.show_channel_info), Boolean.valueOf(((MsgChannelInfo) aVar).show_channel_info));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74314a(1, this.show_channel_info);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.show_channel_info) + 0;
        } else {
            if (i == 2) {
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                MsgChannelInfo msgChannelInfo = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                msgChannelInfo.show_channel_info = aVar2.mo141625c(intValue);
                return 0;
            }
        }
    }

    public MsgChannelInfo setShow_channel_info(boolean z) {
        this.show_channel_info = z;
        return this;
    }
}
