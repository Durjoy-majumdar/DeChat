package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Popup */
public class Popup extends C47465a {
    public JumpInfo jump_info;
    public String report_str;

    public static final Popup create() {
        return new Popup();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof Popup)) {
            return false;
        }
        Popup popup = (Popup) aVar;
        return C46238a.m51546a(this.jump_info, popup.jump_info) && C46238a.m51546a(this.report_str, popup.report_str);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(1, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            String str = this.report_str;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            JumpInfo jumpInfo2 = this.jump_info;
            if (jumpInfo2 != null) {
                i2 = 0 + C52418a.m58682i(1, jumpInfo2.computeSize());
            }
            String str2 = this.report_str;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            Popup popup = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    JumpInfo jumpInfo3 = new JumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        jumpInfo3.parseFrom(bArr);
                    }
                    popup.jump_info = jumpInfo3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                popup.report_str = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Popup setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public Popup setReport_str(String str) {
        this.report_str = str;
        return this;
    }
}
