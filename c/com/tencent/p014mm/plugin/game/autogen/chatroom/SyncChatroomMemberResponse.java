package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse */
public class SyncChatroomMemberResponse extends C49335eu3 {
    public LinkedList<String> member_username_list = new LinkedList<>();
    public String next_version;

    public static final SyncChatroomMemberResponse create() {
        return new SyncChatroomMemberResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof SyncChatroomMemberResponse)) {
            return false;
        }
        SyncChatroomMemberResponse syncChatroomMemberResponse = (SyncChatroomMemberResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, syncChatroomMemberResponse.BaseResponse) && C46238a.m51546a(this.next_version, syncChatroomMemberResponse.next_version) && C46238a.m51546a(this.member_username_list, syncChatroomMemberResponse.member_username_list);
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
            String str = this.next_version;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.member_username_list);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.next_version;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58680g(3, 1, this.member_username_list);
        } else if (i == 2) {
            this.member_username_list.clear();
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
            SyncChatroomMemberResponse syncChatroomMemberResponse = objArr[1];
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
                    syncChatroomMemberResponse.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                syncChatroomMemberResponse.next_version = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                syncChatroomMemberResponse.member_username_list.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }

    public SyncChatroomMemberResponse setMember_username_list(LinkedList<String> linkedList) {
        this.member_username_list = linkedList;
        return this;
    }

    public SyncChatroomMemberResponse setNext_version(String str) {
        this.next_version = str;
        return this;
    }
}
