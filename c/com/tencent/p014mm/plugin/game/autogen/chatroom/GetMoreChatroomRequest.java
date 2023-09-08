package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomRequest */
public class GetMoreChatroomRequest extends C101820nt3 {
    public String chatroom_filter;
    public Lbs lbs_info;
    public int limit;

    public static final GetMoreChatroomRequest create() {
        return new GetMoreChatroomRequest();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetMoreChatroomRequest)) {
            return false;
        }
        GetMoreChatroomRequest getMoreChatroomRequest = (GetMoreChatroomRequest) aVar;
        return C46238a.m51546a(this.BaseRequest, getMoreChatroomRequest.BaseRequest) && C46238a.m51546a(this.chatroom_filter, getMoreChatroomRequest.chatroom_filter) && C46238a.m51546a(this.lbs_info, getMoreChatroomRequest.lbs_info) && C46238a.m51546a(Integer.valueOf(this.limit), Integer.valueOf(getMoreChatroomRequest.limit));
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
            String str = this.chatroom_filter;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            Lbs lbs = this.lbs_info;
            if (lbs != null) {
                aVar.mo74322i(3, lbs.computeSize());
                this.lbs_info.writeFields(aVar);
            }
            aVar.mo74318e(4, this.limit);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.chatroom_filter;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            Lbs lbs2 = this.lbs_info;
            if (lbs2 != null) {
                i2 += C52418a.m58682i(3, lbs2.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.limit);
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
            GetMoreChatroomRequest getMoreChatroomRequest = objArr[1];
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
                    getMoreChatroomRequest.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                getMoreChatroomRequest.chatroom_filter = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    Lbs lbs3 = new Lbs();
                    if (bArr2 != null && bArr2.length > 0) {
                        lbs3.parseFrom(bArr2);
                    }
                    getMoreChatroomRequest.lbs_info = lbs3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                getMoreChatroomRequest.limit = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public GetMoreChatroomRequest setChatroom_filter(String str) {
        this.chatroom_filter = str;
        return this;
    }

    public GetMoreChatroomRequest setLbs_info(Lbs lbs) {
        this.lbs_info = lbs;
        return this;
    }

    public GetMoreChatroomRequest setLimit(int i) {
        this.limit = i;
        return this;
    }
}
