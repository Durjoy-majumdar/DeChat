package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse */
public class GetFirstEnterInfoResponse extends C49335eu3 {
    public LinkedList<ContentBlock> content_list = new LinkedList<>();
    public JumpInfo enter_jump_info;

    public static final GetFirstEnterInfoResponse create() {
        return new GetFirstEnterInfoResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetFirstEnterInfoResponse)) {
            return false;
        }
        GetFirstEnterInfoResponse getFirstEnterInfoResponse = (GetFirstEnterInfoResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, getFirstEnterInfoResponse.BaseResponse) && C46238a.m51546a(this.content_list, getFirstEnterInfoResponse.content_list) && C46238a.m51546a(this.enter_jump_info, getFirstEnterInfoResponse.enter_jump_info);
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
            aVar.mo74320g(2, 8, this.content_list);
            JumpInfo jumpInfo = this.enter_jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(3, jumpInfo.computeSize());
                this.enter_jump_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.content_list);
            JumpInfo jumpInfo2 = this.enter_jump_info;
            return jumpInfo2 != null ? g + C52418a.m58682i(3, jumpInfo2.computeSize()) : g;
        } else if (i == 2) {
            this.content_list.clear();
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
            GetFirstEnterInfoResponse getFirstEnterInfoResponse = objArr[1];
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
                    getFirstEnterInfoResponse.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    ContentBlock contentBlock = new ContentBlock();
                    if (bArr2 != null && bArr2.length > 0) {
                        contentBlock.parseFrom(bArr2);
                    }
                    getFirstEnterInfoResponse.content_list.add(contentBlock);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    JumpInfo jumpInfo3 = new JumpInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        jumpInfo3.parseFrom(bArr3);
                    }
                    getFirstEnterInfoResponse.enter_jump_info = jumpInfo3;
                }
                return 0;
            }
        }
    }

    public GetFirstEnterInfoResponse setContent_list(LinkedList<ContentBlock> linkedList) {
        this.content_list = linkedList;
        return this;
    }

    public GetFirstEnterInfoResponse setEnter_jump_info(JumpInfo jumpInfo) {
        this.enter_jump_info = jumpInfo;
        return this;
    }
}
