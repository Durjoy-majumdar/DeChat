package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse */
public class VoteMsgResponse extends C49335eu3 {
    public JumpInfo education_jump_info;
    public String report_ext_info;
    public VoteInfo vote_info;

    public static final VoteMsgResponse create() {
        return new VoteMsgResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof VoteMsgResponse)) {
            return false;
        }
        VoteMsgResponse voteMsgResponse = (VoteMsgResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, voteMsgResponse.BaseResponse) && C46238a.m51546a(this.vote_info, voteMsgResponse.vote_info) && C46238a.m51546a(this.education_jump_info, voteMsgResponse.education_jump_info) && C46238a.m51546a(this.report_ext_info, voteMsgResponse.report_ext_info);
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
            VoteInfo voteInfo = this.vote_info;
            if (voteInfo != null) {
                aVar.mo74322i(2, voteInfo.computeSize());
                this.vote_info.writeFields(aVar);
            }
            JumpInfo jumpInfo = this.education_jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(3, jumpInfo.computeSize());
                this.education_jump_info.writeFields(aVar);
            }
            String str = this.report_ext_info;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            VoteInfo voteInfo2 = this.vote_info;
            if (voteInfo2 != null) {
                i2 += C52418a.m58682i(2, voteInfo2.computeSize());
            }
            JumpInfo jumpInfo2 = this.education_jump_info;
            if (jumpInfo2 != null) {
                i2 += C52418a.m58682i(3, jumpInfo2.computeSize());
            }
            String str2 = this.report_ext_info;
            return str2 != null ? i2 + C52418a.m58683j(4, str2) : i2;
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
            VoteMsgResponse voteMsgResponse = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    voteMsgResponse.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    VoteInfo voteInfo3 = new VoteInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        voteInfo3.parseFrom(bArr2);
                    }
                    voteMsgResponse.vote_info = voteInfo3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    JumpInfo jumpInfo3 = new JumpInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        jumpInfo3.parseFrom(bArr3);
                    }
                    voteMsgResponse.education_jump_info = jumpInfo3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                voteMsgResponse.report_ext_info = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public VoteMsgResponse setEducation_jump_info(JumpInfo jumpInfo) {
        this.education_jump_info = jumpInfo;
        return this;
    }

    public VoteMsgResponse setReport_ext_info(String str) {
        this.report_ext_info = str;
        return this;
    }

    public VoteMsgResponse setVote_info(VoteInfo voteInfo) {
        this.vote_info = voteInfo;
        return this;
    }
}
