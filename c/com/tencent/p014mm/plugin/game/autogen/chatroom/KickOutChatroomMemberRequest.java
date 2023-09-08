package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.KickOutChatroomMemberRequest */
public class KickOutChatroomMemberRequest extends C101820nt3 {
    public String username;

    public static final KickOutChatroomMemberRequest create() {
        return new KickOutChatroomMemberRequest();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof KickOutChatroomMemberRequest)) {
            return false;
        }
        KickOutChatroomMemberRequest kickOutChatroomMemberRequest = (KickOutChatroomMemberRequest) aVar;
        return C46238a.m51546a(this.BaseRequest, kickOutChatroomMemberRequest.BaseRequest) && C46238a.m51546a(this.username, kickOutChatroomMemberRequest.username);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.username != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.username;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.username;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.username != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            KickOutChatroomMemberRequest kickOutChatroomMemberRequest = objArr[1];
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
                    kickOutChatroomMemberRequest.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                kickOutChatroomMemberRequest.username = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public KickOutChatroomMemberRequest setUsername(String str) {
        this.username = str;
        return this;
    }
}
