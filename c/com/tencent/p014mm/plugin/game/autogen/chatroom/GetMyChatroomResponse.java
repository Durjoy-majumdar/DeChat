package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse */
public class GetMyChatroomResponse extends C49335eu3 {
    public LinkedList<MyChatroomInfo> my_chatroom_info_list = new LinkedList<>();
    public MyChatroomNotice my_chatroom_notice;
    public String next_version;

    public static final GetMyChatroomResponse create() {
        return new GetMyChatroomResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetMyChatroomResponse)) {
            return false;
        }
        GetMyChatroomResponse getMyChatroomResponse = (GetMyChatroomResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, getMyChatroomResponse.BaseResponse) && C46238a.m51546a(this.next_version, getMyChatroomResponse.next_version) && C46238a.m51546a(this.my_chatroom_info_list, getMyChatroomResponse.my_chatroom_info_list) && C46238a.m51546a(this.my_chatroom_notice, getMyChatroomResponse.my_chatroom_notice);
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
            aVar.mo74320g(3, 8, this.my_chatroom_info_list);
            MyChatroomNotice myChatroomNotice = this.my_chatroom_notice;
            if (myChatroomNotice != null) {
                aVar.mo74322i(4, myChatroomNotice.computeSize());
                this.my_chatroom_notice.writeFields(aVar);
            }
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
            int g = i2 + C52418a.m58680g(3, 8, this.my_chatroom_info_list);
            MyChatroomNotice myChatroomNotice2 = this.my_chatroom_notice;
            return myChatroomNotice2 != null ? g + C52418a.m58682i(4, myChatroomNotice2.computeSize()) : g;
        } else if (i == 2) {
            this.my_chatroom_info_list.clear();
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
            GetMyChatroomResponse getMyChatroomResponse = objArr[1];
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
                    getMyChatroomResponse.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                getMyChatroomResponse.next_version = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    MyChatroomInfo myChatroomInfo = new MyChatroomInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        myChatroomInfo.parseFrom(bArr2);
                    }
                    getMyChatroomResponse.my_chatroom_info_list.add(myChatroomInfo);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    MyChatroomNotice myChatroomNotice3 = new MyChatroomNotice();
                    if (bArr3 != null && bArr3.length > 0) {
                        myChatroomNotice3.parseFrom(bArr3);
                    }
                    getMyChatroomResponse.my_chatroom_notice = myChatroomNotice3;
                }
                return 0;
            }
        }
    }

    public GetMyChatroomResponse setMy_chatroom_info_list(LinkedList<MyChatroomInfo> linkedList) {
        this.my_chatroom_info_list = linkedList;
        return this;
    }

    public GetMyChatroomResponse setMy_chatroom_notice(MyChatroomNotice myChatroomNotice) {
        this.my_chatroom_notice = myChatroomNotice;
        return this;
    }

    public GetMyChatroomResponse setNext_version(String str) {
        this.next_version = str;
        return this;
    }
}
