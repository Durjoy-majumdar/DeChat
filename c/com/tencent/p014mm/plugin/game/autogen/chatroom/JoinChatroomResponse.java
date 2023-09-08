package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse */
public class JoinChatroomResponse extends C49335eu3 {
    public JumpInfo chatroom_full_jump_info;
    public JumpInfo create_account_jump_info;
    public String errmsg;
    public boolean need_jump_create_account;

    public static final JoinChatroomResponse create() {
        return new JoinChatroomResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof JoinChatroomResponse)) {
            return false;
        }
        JoinChatroomResponse joinChatroomResponse = (JoinChatroomResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, joinChatroomResponse.BaseResponse) && C46238a.m51546a(this.errmsg, joinChatroomResponse.errmsg) && C46238a.m51546a(Boolean.valueOf(this.need_jump_create_account), Boolean.valueOf(joinChatroomResponse.need_jump_create_account)) && C46238a.m51546a(this.create_account_jump_info, joinChatroomResponse.create_account_jump_info) && C46238a.m51546a(this.chatroom_full_jump_info, joinChatroomResponse.chatroom_full_jump_info);
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
            String str = this.errmsg;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.need_jump_create_account);
            JumpInfo jumpInfo = this.create_account_jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(4, jumpInfo.computeSize());
                this.create_account_jump_info.writeFields(aVar);
            }
            JumpInfo jumpInfo2 = this.chatroom_full_jump_info;
            if (jumpInfo2 != null) {
                aVar.mo74322i(5, jumpInfo2.computeSize());
                this.chatroom_full_jump_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.errmsg;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int a = i2 + C52418a.m58674a(3, this.need_jump_create_account);
            JumpInfo jumpInfo3 = this.create_account_jump_info;
            if (jumpInfo3 != null) {
                a += C52418a.m58682i(4, jumpInfo3.computeSize());
            }
            JumpInfo jumpInfo4 = this.chatroom_full_jump_info;
            return jumpInfo4 != null ? a + C52418a.m58682i(5, jumpInfo4.computeSize()) : a;
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
            JoinChatroomResponse joinChatroomResponse = objArr[1];
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
                    joinChatroomResponse.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                joinChatroomResponse.errmsg = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                joinChatroomResponse.need_jump_create_account = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    JumpInfo jumpInfo5 = new JumpInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        jumpInfo5.parseFrom(bArr2);
                    }
                    joinChatroomResponse.create_account_jump_info = jumpInfo5;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    JumpInfo jumpInfo6 = new JumpInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        jumpInfo6.parseFrom(bArr3);
                    }
                    joinChatroomResponse.chatroom_full_jump_info = jumpInfo6;
                }
                return 0;
            }
        }
    }

    public JoinChatroomResponse setChatroom_full_jump_info(JumpInfo jumpInfo) {
        this.chatroom_full_jump_info = jumpInfo;
        return this;
    }

    public JoinChatroomResponse setCreate_account_jump_info(JumpInfo jumpInfo) {
        this.create_account_jump_info = jumpInfo;
        return this;
    }

    public JoinChatroomResponse setErrmsg(String str) {
        this.errmsg = str;
        return this;
    }

    public JoinChatroomResponse setNeed_jump_create_account(boolean z) {
        this.need_jump_create_account = z;
        return this;
    }
}
