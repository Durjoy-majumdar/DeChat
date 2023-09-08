package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest */
public class GetMyChatroomRequest extends C101820nt3 {
    public LinkedList<String> chatroom_name_list = new LinkedList<>();
    public String first_chatroom_name;
    public int scene_type;
    public String version;

    public static final GetMyChatroomRequest create() {
        return new GetMyChatroomRequest();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetMyChatroomRequest)) {
            return false;
        }
        GetMyChatroomRequest getMyChatroomRequest = (GetMyChatroomRequest) aVar;
        return C46238a.m51546a(this.BaseRequest, getMyChatroomRequest.BaseRequest) && C46238a.m51546a(this.version, getMyChatroomRequest.version) && C46238a.m51546a(this.chatroom_name_list, getMyChatroomRequest.chatroom_name_list) && C46238a.m51546a(this.first_chatroom_name, getMyChatroomRequest.first_chatroom_name) && C46238a.m51546a(Integer.valueOf(this.scene_type), Integer.valueOf(getMyChatroomRequest.scene_type));
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
            String str = this.version;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.chatroom_name_list);
            String str2 = this.first_chatroom_name;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.scene_type);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.version;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.chatroom_name_list);
            String str4 = this.first_chatroom_name;
            if (str4 != null) {
                g += C52418a.m58683j(4, str4);
            }
            return g + C52418a.m58678e(5, this.scene_type);
        } else if (i == 2) {
            this.chatroom_name_list.clear();
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
            GetMyChatroomRequest getMyChatroomRequest = objArr[1];
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
                    getMyChatroomRequest.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                getMyChatroomRequest.version = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                getMyChatroomRequest.chatroom_name_list.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 4) {
                getMyChatroomRequest.first_chatroom_name = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                getMyChatroomRequest.scene_type = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public GetMyChatroomRequest setChatroom_name_list(LinkedList<String> linkedList) {
        this.chatroom_name_list = linkedList;
        return this;
    }

    public GetMyChatroomRequest setFirst_chatroom_name(String str) {
        this.first_chatroom_name = str;
        return this;
    }

    public GetMyChatroomRequest setScene_type(int i) {
        this.scene_type = i;
        return this;
    }

    public GetMyChatroomRequest setVersion(String str) {
        this.version = str;
        return this;
    }
}
