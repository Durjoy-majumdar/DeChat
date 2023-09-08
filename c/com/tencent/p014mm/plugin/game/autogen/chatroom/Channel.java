package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Channel */
public class Channel extends C47465a {
    public String cant_send_reason;
    public int channel_id;
    public String desc;
    public String name;
    public boolean read_only;
    public long unread_msg_count;

    public static final Channel create() {
        return new Channel();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) aVar;
        return C46238a.m51546a(Integer.valueOf(this.channel_id), Integer.valueOf(channel.channel_id)) && C46238a.m51546a(this.name, channel.name) && C46238a.m51546a(Boolean.valueOf(this.read_only), Boolean.valueOf(channel.read_only)) && C46238a.m51546a(this.cant_send_reason, channel.cant_send_reason) && C46238a.m51546a(this.desc, channel.desc) && C46238a.m51546a(Long.valueOf(this.unread_msg_count), Long.valueOf(channel.unread_msg_count));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.channel_id);
            String str = this.name;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.read_only);
            String str2 = this.cant_send_reason;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.desc;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74321h(6, this.unread_msg_count);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.channel_id) + 0;
            String str4 = this.name;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            int a = e + C52418a.m58674a(3, this.read_only);
            String str5 = this.cant_send_reason;
            if (str5 != null) {
                a += C52418a.m58683j(4, str5);
            }
            String str6 = this.desc;
            if (str6 != null) {
                a += C52418a.m58683j(5, str6);
            }
            return a + C52418a.m58681h(6, this.unread_msg_count);
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
            Channel channel = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    channel.channel_id = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    channel.name = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    channel.read_only = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    channel.cant_send_reason = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    channel.desc = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    channel.unread_msg_count = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Channel setCant_send_reason(String str) {
        this.cant_send_reason = str;
        return this;
    }

    public Channel setChannel_id(int i) {
        this.channel_id = i;
        return this;
    }

    public Channel setDesc(String str) {
        this.desc = str;
        return this;
    }

    public Channel setName(String str) {
        this.name = str;
        return this;
    }

    public Channel setRead_only(boolean z) {
        this.read_only = z;
        return this;
    }

    public Channel setUnread_msg_count(long j) {
        this.unread_msg_count = j;
        return this;
    }
}
