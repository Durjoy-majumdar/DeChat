package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest */
public class BatchGetSimpleChatroomMemberRequest extends C101820nt3 {
    public LinkedList<String> username_list = new LinkedList<>();

    public static final BatchGetSimpleChatroomMemberRequest create() {
        return new BatchGetSimpleChatroomMemberRequest();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof BatchGetSimpleChatroomMemberRequest)) {
            return false;
        }
        BatchGetSimpleChatroomMemberRequest batchGetSimpleChatroomMemberRequest = (BatchGetSimpleChatroomMemberRequest) aVar;
        return C46238a.m51546a(this.BaseRequest, batchGetSimpleChatroomMemberRequest.BaseRequest) && C46238a.m51546a(this.username_list, batchGetSimpleChatroomMemberRequest.username_list);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74320g(2, 1, this.username_list);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 1, this.username_list);
        } else if (i == 2) {
            this.username_list.clear();
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
            BatchGetSimpleChatroomMemberRequest batchGetSimpleChatroomMemberRequest = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    batchGetSimpleChatroomMemberRequest.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                batchGetSimpleChatroomMemberRequest.username_list.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }

    public BatchGetSimpleChatroomMemberRequest setUsername_list(LinkedList<String> linkedList) {
        this.username_list = linkedList;
        return this;
    }
}
