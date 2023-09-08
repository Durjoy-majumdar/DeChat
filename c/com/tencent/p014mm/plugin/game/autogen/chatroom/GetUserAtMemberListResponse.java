package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListResponse */
public class GetUserAtMemberListResponse extends C49335eu3 {
    public LinkedList<String> at_member_username_list = new LinkedList<>();

    public static final GetUserAtMemberListResponse create() {
        return new GetUserAtMemberListResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetUserAtMemberListResponse)) {
            return false;
        }
        GetUserAtMemberListResponse getUserAtMemberListResponse = (GetUserAtMemberListResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, getUserAtMemberListResponse.BaseResponse) && C46238a.m51546a(this.at_member_username_list, getUserAtMemberListResponse.at_member_username_list);
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
            aVar.mo74320g(2, 1, this.at_member_username_list);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 1, this.at_member_username_list);
        } else if (i == 2) {
            this.at_member_username_list.clear();
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
            GetUserAtMemberListResponse getUserAtMemberListResponse = objArr[1];
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
                    getUserAtMemberListResponse.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                getUserAtMemberListResponse.at_member_username_list.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }

    public GetUserAtMemberListResponse setAt_member_username_list(LinkedList<String> linkedList) {
        this.at_member_username_list = linkedList;
        return this;
    }
}
