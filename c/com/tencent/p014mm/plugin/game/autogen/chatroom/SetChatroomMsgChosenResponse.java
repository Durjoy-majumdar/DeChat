package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.SetChatroomMsgChosenResponse */
public class SetChatroomMsgChosenResponse extends C49335eu3 {
    public static final SetChatroomMsgChosenResponse create() {
        return new SetChatroomMsgChosenResponse();
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof SetChatroomMsgChosenResponse) && C46238a.m51546a(this.BaseResponse, ((SetChatroomMsgChosenResponse) aVar).BaseResponse);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                return 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return 0;
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
            SetChatroomMsgChosenResponse setChatroomMsgChosenResponse = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C49966ja jaVar3 = new C49966ja();
                if (bArr != null && bArr.length > 0) {
                    jaVar3.parseFrom(bArr);
                }
                setChatroomMsgChosenResponse.BaseResponse = jaVar3;
            }
            return 0;
        }
    }
}
