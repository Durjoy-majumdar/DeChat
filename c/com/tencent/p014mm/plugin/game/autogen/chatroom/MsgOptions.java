package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions */
public class MsgOptions extends C47465a {
    public LinkedList<String> at_list = new LinkedList<>();
    public int bg_type;
    public ChosenInfo chosen_info;
    public C89349b cli_local_data;
    public String complaint_url;
    public int msg_biz_type;
    public MsgChannelInfo msg_channel_info;
    public long reply_seq;
    public boolean self_msg;
    public TickleInfo tickle_info;
    public TopicInfo topic_info;
    public VoteInfo vote_info;

    public static final MsgOptions create() {
        return new MsgOptions();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof MsgOptions)) {
            return false;
        }
        MsgOptions msgOptions = (MsgOptions) aVar;
        return C46238a.m51546a(this.at_list, msgOptions.at_list) && C46238a.m51546a(this.complaint_url, msgOptions.complaint_url) && C46238a.m51546a(this.cli_local_data, msgOptions.cli_local_data) && C46238a.m51546a(Integer.valueOf(this.msg_biz_type), Integer.valueOf(msgOptions.msg_biz_type)) && C46238a.m51546a(Boolean.valueOf(this.self_msg), Boolean.valueOf(msgOptions.self_msg)) && C46238a.m51546a(Long.valueOf(this.reply_seq), Long.valueOf(msgOptions.reply_seq)) && C46238a.m51546a(this.vote_info, msgOptions.vote_info) && C46238a.m51546a(Integer.valueOf(this.bg_type), Integer.valueOf(msgOptions.bg_type)) && C46238a.m51546a(this.chosen_info, msgOptions.chosen_info) && C46238a.m51546a(this.msg_channel_info, msgOptions.msg_channel_info) && C46238a.m51546a(this.topic_info, msgOptions.topic_info) && C46238a.m51546a(this.tickle_info, msgOptions.tickle_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.at_list);
            String str = this.complaint_url;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.cli_local_data;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.msg_biz_type);
            aVar.mo74314a(5, this.self_msg);
            aVar.mo74321h(6, this.reply_seq);
            VoteInfo voteInfo = this.vote_info;
            if (voteInfo != null) {
                aVar.mo74322i(7, voteInfo.computeSize());
                this.vote_info.writeFields(aVar);
            }
            aVar.mo74318e(8, this.bg_type);
            ChosenInfo chosenInfo = this.chosen_info;
            if (chosenInfo != null) {
                aVar.mo74322i(9, chosenInfo.computeSize());
                this.chosen_info.writeFields(aVar);
            }
            MsgChannelInfo msgChannelInfo = this.msg_channel_info;
            if (msgChannelInfo != null) {
                aVar.mo74322i(10, msgChannelInfo.computeSize());
                this.msg_channel_info.writeFields(aVar);
            }
            TopicInfo topicInfo = this.topic_info;
            if (topicInfo != null) {
                aVar.mo74322i(11, topicInfo.computeSize());
                this.topic_info.writeFields(aVar);
            }
            TickleInfo tickleInfo = this.tickle_info;
            if (tickleInfo != null) {
                aVar.mo74322i(12, tickleInfo.computeSize());
                this.tickle_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 1, this.at_list) + 0;
            String str2 = this.complaint_url;
            if (str2 != null) {
                g += C52418a.m58683j(2, str2);
            }
            C89349b bVar2 = this.cli_local_data;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            int e = g + C52418a.m58678e(4, this.msg_biz_type) + C52418a.m58674a(5, this.self_msg) + C52418a.m58681h(6, this.reply_seq);
            VoteInfo voteInfo2 = this.vote_info;
            if (voteInfo2 != null) {
                e += C52418a.m58682i(7, voteInfo2.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.bg_type);
            ChosenInfo chosenInfo2 = this.chosen_info;
            if (chosenInfo2 != null) {
                e2 += C52418a.m58682i(9, chosenInfo2.computeSize());
            }
            MsgChannelInfo msgChannelInfo2 = this.msg_channel_info;
            if (msgChannelInfo2 != null) {
                e2 += C52418a.m58682i(10, msgChannelInfo2.computeSize());
            }
            TopicInfo topicInfo2 = this.topic_info;
            if (topicInfo2 != null) {
                e2 += C52418a.m58682i(11, topicInfo2.computeSize());
            }
            TickleInfo tickleInfo2 = this.tickle_info;
            return tickleInfo2 != null ? e2 + C52418a.m58682i(12, tickleInfo2.computeSize()) : e2;
        } else if (i == 2) {
            this.at_list.clear();
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
            MsgOptions msgOptions = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    msgOptions.at_list.add(aVar3.mo141633k(intValue));
                    return 0;
                case 2:
                    msgOptions.complaint_url = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    msgOptions.cli_local_data = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    msgOptions.msg_biz_type = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    msgOptions.self_msg = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    msgOptions.reply_seq = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        VoteInfo voteInfo3 = new VoteInfo();
                        if (bArr != null && bArr.length > 0) {
                            voteInfo3.parseFrom(bArr);
                        }
                        msgOptions.vote_info = voteInfo3;
                    }
                    return 0;
                case 8:
                    msgOptions.bg_type = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        ChosenInfo chosenInfo3 = new ChosenInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            chosenInfo3.parseFrom(bArr2);
                        }
                        msgOptions.chosen_info = chosenInfo3;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        MsgChannelInfo msgChannelInfo3 = new MsgChannelInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            msgChannelInfo3.parseFrom(bArr3);
                        }
                        msgOptions.msg_channel_info = msgChannelInfo3;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        TopicInfo topicInfo3 = new TopicInfo();
                        if (bArr4 != null && bArr4.length > 0) {
                            topicInfo3.parseFrom(bArr4);
                        }
                        msgOptions.topic_info = topicInfo3;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        TickleInfo tickleInfo3 = new TickleInfo();
                        if (bArr5 != null && bArr5.length > 0) {
                            tickleInfo3.parseFrom(bArr5);
                        }
                        msgOptions.tickle_info = tickleInfo3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public MsgOptions setAt_list(LinkedList<String> linkedList) {
        this.at_list = linkedList;
        return this;
    }

    public MsgOptions setBg_type(int i) {
        this.bg_type = i;
        return this;
    }

    public MsgOptions setChosen_info(ChosenInfo chosenInfo) {
        this.chosen_info = chosenInfo;
        return this;
    }

    public MsgOptions setCli_local_data(C89349b bVar) {
        this.cli_local_data = bVar;
        return this;
    }

    public MsgOptions setComplaint_url(String str) {
        this.complaint_url = str;
        return this;
    }

    public MsgOptions setMsg_biz_type(int i) {
        this.msg_biz_type = i;
        return this;
    }

    public MsgOptions setMsg_channel_info(MsgChannelInfo msgChannelInfo) {
        this.msg_channel_info = msgChannelInfo;
        return this;
    }

    public MsgOptions setReply_seq(long j) {
        this.reply_seq = j;
        return this;
    }

    public MsgOptions setSelf_msg(boolean z) {
        this.self_msg = z;
        return this;
    }

    public MsgOptions setTickle_info(TickleInfo tickleInfo) {
        this.tickle_info = tickleInfo;
        return this;
    }

    public MsgOptions setTopic_info(TopicInfo topicInfo) {
        this.topic_info = topicInfo;
        return this;
    }

    public MsgOptions setVote_info(VoteInfo voteInfo) {
        this.vote_info = voteInfo;
        return this;
    }
}
