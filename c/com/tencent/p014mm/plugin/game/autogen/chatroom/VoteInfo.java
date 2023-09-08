package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo */
public class VoteInfo extends C47465a {
    public boolean can_vote;
    public String desc;
    public LinkedList<String> latest_voter_username_list = new LinkedList<>();
    public int show_type;
    public boolean voted_by_me;

    public static final VoteInfo create() {
        return new VoteInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof VoteInfo)) {
            return false;
        }
        VoteInfo voteInfo = (VoteInfo) aVar;
        return C46238a.m51546a(this.latest_voter_username_list, voteInfo.latest_voter_username_list) && C46238a.m51546a(this.desc, voteInfo.desc) && C46238a.m51546a(Integer.valueOf(this.show_type), Integer.valueOf(voteInfo.show_type)) && C46238a.m51546a(Boolean.valueOf(this.voted_by_me), Boolean.valueOf(voteInfo.voted_by_me)) && C46238a.m51546a(Boolean.valueOf(this.can_vote), Boolean.valueOf(voteInfo.can_vote));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.latest_voter_username_list);
            String str = this.desc;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.show_type);
            aVar.mo74314a(4, this.voted_by_me);
            aVar.mo74314a(5, this.can_vote);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 1, this.latest_voter_username_list) + 0;
            String str2 = this.desc;
            if (str2 != null) {
                g += C52418a.m58683j(2, str2);
            }
            return g + C52418a.m58678e(3, this.show_type) + C52418a.m58674a(4, this.voted_by_me) + C52418a.m58674a(5, this.can_vote);
        } else if (i == 2) {
            this.latest_voter_username_list.clear();
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
            VoteInfo voteInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                voteInfo.latest_voter_username_list.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 2) {
                voteInfo.desc = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                voteInfo.show_type = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                voteInfo.voted_by_me = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                voteInfo.can_vote = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }

    public VoteInfo setCan_vote(boolean z) {
        this.can_vote = z;
        return this;
    }

    public VoteInfo setDesc(String str) {
        this.desc = str;
        return this;
    }

    public VoteInfo setLatest_voter_username_list(LinkedList<String> linkedList) {
        this.latest_voter_username_list = linkedList;
        return this;
    }

    public VoteInfo setShow_type(int i) {
        this.show_type = i;
        return this;
    }

    public VoteInfo setVoted_by_me(boolean z) {
        this.voted_by_me = z;
        return this;
    }
}
