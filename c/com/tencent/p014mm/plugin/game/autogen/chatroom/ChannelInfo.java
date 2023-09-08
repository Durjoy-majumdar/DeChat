package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo */
public class ChannelInfo extends C47465a {
    public LinkedList<Channel> channel_list = new LinkedList<>();
    public int default_channel_id;

    public static final ChannelInfo create() {
        return new ChannelInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChannelInfo)) {
            return false;
        }
        ChannelInfo channelInfo = (ChannelInfo) aVar;
        return C46238a.m51546a(this.channel_list, channelInfo.channel_list) && C46238a.m51546a(Integer.valueOf(this.default_channel_id), Integer.valueOf(channelInfo.default_channel_id));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.channel_list);
            aVar.mo74318e(2, this.default_channel_id);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.channel_list) + 0 + C52418a.m58678e(2, this.default_channel_id);
        } else {
            if (i == 2) {
                this.channel_list.clear();
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
                ChannelInfo channelInfo = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        Channel channel = new Channel();
                        if (bArr != null && bArr.length > 0) {
                            channel.parseFrom(bArr);
                        }
                        channelInfo.channel_list.add(channel);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    channelInfo.default_channel_id = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }

    public ChannelInfo setChannel_list(LinkedList<Channel> linkedList) {
        this.channel_list = linkedList;
        return this;
    }

    public ChannelInfo setDefault_channel_id(int i) {
        this.default_channel_id = i;
        return this;
    }
}
