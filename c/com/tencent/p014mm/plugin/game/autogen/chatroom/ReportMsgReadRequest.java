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

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ReportMsgReadRequest */
public class ReportMsgReadRequest extends C101820nt3 {
    public String chatroom_name;
    public LinkedList<Long> read_seq_list = new LinkedList<>();

    public static final ReportMsgReadRequest create() {
        return new ReportMsgReadRequest();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ReportMsgReadRequest)) {
            return false;
        }
        ReportMsgReadRequest reportMsgReadRequest = (ReportMsgReadRequest) aVar;
        return C46238a.m51546a(this.BaseRequest, reportMsgReadRequest.BaseRequest) && C46238a.m51546a(this.chatroom_name, reportMsgReadRequest.chatroom_name) && C46238a.m51546a(this.read_seq_list, reportMsgReadRequest.read_seq_list);
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
                aVar.mo74320g(3, 3, this.read_seq_list);
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
            return i2 + C52418a.m58680g(3, 3, this.read_seq_list);
        } else if (i == 2) {
            this.read_seq_list.clear();
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
            ReportMsgReadRequest reportMsgReadRequest = objArr[1];
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
                    reportMsgReadRequest.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                reportMsgReadRequest.chatroom_name = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                reportMsgReadRequest.read_seq_list.add(Long.valueOf(aVar3.mo141631i(intValue)));
                return 0;
            }
        }
    }

    public ReportMsgReadRequest setChatroom_name(String str) {
        this.chatroom_name = str;
        return this;
    }

    public ReportMsgReadRequest setRead_seq_list(LinkedList<Long> linkedList) {
        this.read_seq_list = linkedList;
        return this;
    }
}
