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

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest */
public class GetChatroomBaseInfoRequest extends C101820nt3 {
    public String chatroom_name;
    public DebugOption debug_option;
    public ExportExternInfo export_extern_info;
    public Lbs lbs_info;

    public static final GetChatroomBaseInfoRequest create() {
        return new GetChatroomBaseInfoRequest();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetChatroomBaseInfoRequest)) {
            return false;
        }
        GetChatroomBaseInfoRequest getChatroomBaseInfoRequest = (GetChatroomBaseInfoRequest) aVar;
        return C46238a.m51546a(this.BaseRequest, getChatroomBaseInfoRequest.BaseRequest) && C46238a.m51546a(this.chatroom_name, getChatroomBaseInfoRequest.chatroom_name) && C46238a.m51546a(this.lbs_info, getChatroomBaseInfoRequest.lbs_info) && C46238a.m51546a(this.export_extern_info, getChatroomBaseInfoRequest.export_extern_info) && C46238a.m51546a(this.debug_option, getChatroomBaseInfoRequest.debug_option);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.chatroom_name != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.chatroom_name;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                Lbs lbs = this.lbs_info;
                if (lbs != null) {
                    aVar.mo74322i(3, lbs.computeSize());
                    this.lbs_info.writeFields(aVar);
                }
                ExportExternInfo exportExternInfo = this.export_extern_info;
                if (exportExternInfo != null) {
                    aVar.mo74322i(4, exportExternInfo.computeSize());
                    this.export_extern_info.writeFields(aVar);
                }
                DebugOption debugOption = this.debug_option;
                if (debugOption != null) {
                    aVar.mo74322i(5, debugOption.computeSize());
                    this.debug_option.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: chatroom_name");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.chatroom_name;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            Lbs lbs2 = this.lbs_info;
            if (lbs2 != null) {
                i2 += C52418a.m58682i(3, lbs2.computeSize());
            }
            ExportExternInfo exportExternInfo2 = this.export_extern_info;
            if (exportExternInfo2 != null) {
                i2 += C52418a.m58682i(4, exportExternInfo2.computeSize());
            }
            DebugOption debugOption2 = this.debug_option;
            return debugOption2 != null ? i2 + C52418a.m58682i(5, debugOption2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.chatroom_name != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: chatroom_name");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            GetChatroomBaseInfoRequest getChatroomBaseInfoRequest = objArr[1];
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
                    getChatroomBaseInfoRequest.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                getChatroomBaseInfoRequest.chatroom_name = aVar3.mo141633k(intValue);
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
                    getChatroomBaseInfoRequest.lbs_info = lbs3;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    ExportExternInfo exportExternInfo3 = new ExportExternInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        exportExternInfo3.parseFrom(bArr3);
                    }
                    getChatroomBaseInfoRequest.export_extern_info = exportExternInfo3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    DebugOption debugOption3 = new DebugOption();
                    if (bArr4 != null && bArr4.length > 0) {
                        debugOption3.parseFrom(bArr4);
                    }
                    getChatroomBaseInfoRequest.debug_option = debugOption3;
                }
                return 0;
            }
        }
    }

    public GetChatroomBaseInfoRequest setChatroom_name(String str) {
        this.chatroom_name = str;
        return this;
    }

    public GetChatroomBaseInfoRequest setDebug_option(DebugOption debugOption) {
        this.debug_option = debugOption;
        return this;
    }

    public GetChatroomBaseInfoRequest setExport_extern_info(ExportExternInfo exportExternInfo) {
        this.export_extern_info = exportExternInfo;
        return this;
    }

    public GetChatroomBaseInfoRequest setLbs_info(Lbs lbs) {
        this.lbs_info = lbs;
        return this;
    }
}
